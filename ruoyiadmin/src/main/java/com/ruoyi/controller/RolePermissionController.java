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
import com.ruoyi.system.domain.RolePermission;
import com.ruoyi.system.service.IRolePermissionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 角色权限中间表Controller
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Controller
@RequestMapping("/system/permission")
public class RolePermissionController extends BaseController
{
    private String prefix = "system/permission";

    @Autowired
    private IRolePermissionService rolePermissionService;

    @RequiresPermissions("system:permission:view")
    @GetMapping()
    public String permission()
    {
        return prefix + "/permission";
    }

    /**
     * 查询角色权限中间表列表
     */
    @RequiresPermissions("system:permission:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RolePermission rolePermission)
    {
        startPage();
        List<RolePermission> list = rolePermissionService.selectRolePermissionList(rolePermission);
        return getDataTable(list);
    }

    /**
     * 导出角色权限中间表列表
     */
    @RequiresPermissions("system:permission:export")
    @Log(title = "角色权限中间表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RolePermission rolePermission)
    {
        List<RolePermission> list = rolePermissionService.selectRolePermissionList(rolePermission);
        ExcelUtil<RolePermission> util = new ExcelUtil<RolePermission>(RolePermission.class);
        return util.exportExcel(list, "角色权限中间表数据");
    }

    /**
     * 新增角色权限中间表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存角色权限中间表
     */
    @RequiresPermissions("system:permission:add")
    @Log(title = "角色权限中间表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RolePermission rolePermission)
    {
        return toAjax(rolePermissionService.insertRolePermission(rolePermission));
    }

    /**
     * 修改角色权限中间表
     */
    @RequiresPermissions("system:permission:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RolePermission rolePermission = rolePermissionService.selectRolePermissionById(id);
        mmap.put("rolePermission", rolePermission);
        return prefix + "/edit";
    }

    /**
     * 修改保存角色权限中间表
     */
    @RequiresPermissions("system:permission:edit")
    @Log(title = "角色权限中间表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RolePermission rolePermission)
    {
        return toAjax(rolePermissionService.updateRolePermission(rolePermission));
    }

    /**
     * 删除角色权限中间表
     */
    @RequiresPermissions("system:permission:remove")
    @Log(title = "角色权限中间表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rolePermissionService.deleteRolePermissionByIds(ids));
    }
}
