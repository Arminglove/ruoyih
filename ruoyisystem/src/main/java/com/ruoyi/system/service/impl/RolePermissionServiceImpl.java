package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RolePermissionMapper;
import com.ruoyi.system.domain.RolePermission;
import com.ruoyi.system.service.IRolePermissionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色权限中间表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Service
public class RolePermissionServiceImpl implements IRolePermissionService 
{
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    /**
     * 查询角色权限中间表
     * 
     * @param id 角色权限中间表主键
     * @return 角色权限中间表
     */
    @Override
    public RolePermission selectRolePermissionById(Long id)
    {
        return rolePermissionMapper.selectRolePermissionById(id);
    }

    /**
     * 查询角色权限中间表列表
     * 
     * @param rolePermission 角色权限中间表
     * @return 角色权限中间表
     */
    @Override
    public List<RolePermission> selectRolePermissionList(RolePermission rolePermission)
    {
        return rolePermissionMapper.selectRolePermissionList(rolePermission);
    }

    /**
     * 新增角色权限中间表
     * 
     * @param rolePermission 角色权限中间表
     * @return 结果
     */
    @Override
    public int insertRolePermission(RolePermission rolePermission)
    {
        return rolePermissionMapper.insertRolePermission(rolePermission);
    }

    /**
     * 修改角色权限中间表
     * 
     * @param rolePermission 角色权限中间表
     * @return 结果
     */
    @Override
    public int updateRolePermission(RolePermission rolePermission)
    {
        return rolePermissionMapper.updateRolePermission(rolePermission);
    }

    /**
     * 批量删除角色权限中间表
     * 
     * @param ids 需要删除的角色权限中间表主键
     * @return 结果
     */
    @Override
    public int deleteRolePermissionByIds(String ids)
    {
        return rolePermissionMapper.deleteRolePermissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色权限中间表信息
     * 
     * @param id 角色权限中间表主键
     * @return 结果
     */
    @Override
    public int deleteRolePermissionById(Long id)
    {
        return rolePermissionMapper.deleteRolePermissionById(id);
    }
}
