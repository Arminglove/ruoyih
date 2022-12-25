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
import com.ruoyi.system.domain.TPermission;
import com.ruoyi.system.service.ITPermissionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 权限表Controller
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Controller
@RequestMapping("/system/permission")
public class TPermissionController extends BaseController
{
    private String prefix = "system/permission";

    @Autowired
    private ITPermissionService tPermissionService;

    @RequiresPermissions("system:permission:view")
    @GetMapping()
    public String permission()
    {
        return prefix + "/permission";
    }

    /**
     * 查询权限表列表
     */
    @RequiresPermissions("system:permission:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TPermission tPermission)
    {
        startPage();
        List<TPermission> list = tPermissionService.selectTPermissionList(tPermission);
        return getDataTable(list);
    }

    /**
     * 导出权限表列表
     */
    @RequiresPermissions("system:permission:export")
    @Log(title = "权限表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TPermission tPermission)
    {
        List<TPermission> list = tPermissionService.selectTPermissionList(tPermission);
        ExcelUtil<TPermission> util = new ExcelUtil<TPermission>(TPermission.class);
        return util.exportExcel(list, "权限表数据");
    }

    /**
     * 新增权限表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存权限表
     */
    @RequiresPermissions("system:permission:add")
    @Log(title = "权限表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TPermission tPermission)
    {
        return toAjax(tPermissionService.insertTPermission(tPermission));
    }

    /**
     * 修改权限表
     */
    @RequiresPermissions("system:permission:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TPermission tPermission = tPermissionService.selectTPermissionById(id);
        mmap.put("tPermission", tPermission);
        return prefix + "/edit";
    }

    /**
     * 修改保存权限表
     */
    @RequiresPermissions("system:permission:edit")
    @Log(title = "权限表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TPermission tPermission)
    {
        return toAjax(tPermissionService.updateTPermission(tPermission));
    }

    /**
     * 删除权限表
     */
    @RequiresPermissions("system:permission:remove")
    @Log(title = "权限表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tPermissionService.deleteTPermissionByIds(ids));
    }
}
