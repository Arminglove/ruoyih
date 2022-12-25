package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.RolePermission;

/**
 * 角色权限中间表Service接口
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public interface IRolePermissionService 
{
    /**
     * 查询角色权限中间表
     * 
     * @param id 角色权限中间表主键
     * @return 角色权限中间表
     */
    public RolePermission selectRolePermissionById(Long id);

    /**
     * 查询角色权限中间表列表
     * 
     * @param rolePermission 角色权限中间表
     * @return 角色权限中间表集合
     */
    public List<RolePermission> selectRolePermissionList(RolePermission rolePermission);

    /**
     * 新增角色权限中间表
     * 
     * @param rolePermission 角色权限中间表
     * @return 结果
     */
    public int insertRolePermission(RolePermission rolePermission);

    /**
     * 修改角色权限中间表
     * 
     * @param rolePermission 角色权限中间表
     * @return 结果
     */
    public int updateRolePermission(RolePermission rolePermission);

    /**
     * 批量删除角色权限中间表
     * 
     * @param ids 需要删除的角色权限中间表主键集合
     * @return 结果
     */
    public int deleteRolePermissionByIds(String ids);

    /**
     * 删除角色权限中间表信息
     * 
     * @param id 角色权限中间表主键
     * @return 结果
     */
    public int deleteRolePermissionById(Long id);
}
