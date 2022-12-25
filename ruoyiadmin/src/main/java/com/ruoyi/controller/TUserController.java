package com.ruoyi.controller;


import com.ruoyi.system.domain.TUser;
import com.ruoyi.system.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户信息表Controller
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Controller
@RequestMapping("/system/user")
public class TUserController
{
    private String prefix = "system/user";

    @Autowired
    private ITUserService tUserService;

//    @RequiresPermissions("system:user:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/user";
    }

    /**
     * 查询用户信息表列表
     */
//    @RequiresPermissions("system:user:list")s34TP[]#
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TUser tUser)
    {
        startPage();
        List<TUser> list = tUserService.selectTUserList(tUser);
        return getDataTable(list);
    }

    /**
     * 导出用户信息表列表
     */
//    @RequiresPermissions("system:user:export")
    @Log(title = "用户信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TUser tUser)
    {
        List<TUser> list = tUserService.selectTUserList(tUser);
        ExcelUtil<TUser> util = new ExcelUtil<TUser>(TUser.class);
        return util.exportExcel(list, "用户信息表数据");
    }

    /**
     * 新增用户信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户信息表
     */
//    @RequiresPermissions("system:user:add")
//    @Log(title = "用户信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TUser tUser)
    {
        return toAjax(tUserService.insertTUser(tUser));
    }

    /**
     * 修改用户信息表
     */
//    @RequiresPermissions("system:user:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TUser tUser = tUserService.selectTUserById(id);
        mmap.put("tUser", tUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户信息表
     */
//    @RequiresPermissions("system:user:edit")
//    @Log(title = "用户信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TUser tUser)
    {
        return toAjax(tUserService.updateTUser(tUser));
    }

    /**
     * 删除用户信息表
     */
//    @RequiresPermissions("system:user:remove")
//    @Log(title = "用户信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tUserService.deleteTUserByIds(ids));
    }
}
