package com.ruoyi.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TRole;
import com.ruoyi.system.service.ITRoleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 角色表Controller
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Controller
@RequestMapping("/system/role")
public class TRoleController extends BaseController
{
    private String prefix = "system/role";

    @Autowired
    private ITRoleService tRoleService;

    @RequiresPermissions("system:role:view")
    @GetMapping()
    public String role()
    {
        return prefix + "/role";
    }

    /**
     * 查询角色表列表
     */
    @RequiresPermissions("system:role:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TRole tRole)
    {
        startPage();
        List<TRole> list = tRoleService.selectTRoleList(tRole);
        return getDataTable(list);
    }

    /**
     * 导出角色表列表
     */
    @RequiresPermissions("system:role:export")
    @Log(title = "角色表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TRole tRole)
    {
        List<TRole> list = tRoleService.selectTRoleList(tRole);
        ExcelUtil<TRole> util = new ExcelUtil<TRole>(TRole.class);
        return util.exportExcel(list, "角色表数据");
    }

    /**
     * 新增角色表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存角色表
     */
    @RequiresPermissions("system:role:add")
    @Log(title = "角色表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TRole tRole)
    {
        return toAjax(tRoleService.insertTRole(tRole));
    }

    /**
     * 修改角色表
     */
    @RequiresPermissions("system:role:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TRole tRole = tRoleService.selectTRoleById(id);
        mmap.put("tRole", tRole);
        return prefix + "/edit";
    }

    /**
     * 修改保存角色表
     */
    @RequiresPermissions("system:role:edit")
    @Log(title = "角色表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TRole tRole)
    {
        return toAjax(tRoleService.updateTRole(tRole));
    }

    /**
     * 删除角色表
     */
    @RequiresPermissions("system:role:remove")
    @Log(title = "角色表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tRoleService.deleteTRoleByIds(ids));
    }
}
