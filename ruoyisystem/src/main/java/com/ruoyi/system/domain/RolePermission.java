package com.ruoyi.system.domain;


/**
 * 角色权限中间表对象 role_permission
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public class RolePermission extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色权限中间表 */
    private Long id;

    /** 角色id */
    @Excel(name = "角色id")
    private Long roleId;

    /** 权限id */
    @Excel(name = "权限id")
    private Long permissionId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }
    public void setPermissionId(Long permissionId) 
    {
        this.permissionId = permissionId;
    }

    public Long getPermissionId() 
    {
        return permissionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roleId", getRoleId())
            .append("permissionId", getPermissionId())
            .toString();
    }
}
