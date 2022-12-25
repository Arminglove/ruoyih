package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TRole;

/**
 * 角色表Service接口
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public interface ITRoleService 
{
    /**
     * 查询角色表
     * 
     * @param id 角色表主键
     * @return 角色表
     */
    public TRole selectTRoleById(Long id);

    /**
     * 查询角色表列表
     * 
     * @param tRole 角色表
     * @return 角色表集合
     */
    public List<TRole> selectTRoleList(TRole tRole);

    /**
     * 新增角色表
     * 
     * @param tRole 角色表
     * @return 结果
     */
    public int insertTRole(TRole tRole);

    /**
     * 修改角色表
     * 
     * @param tRole 角色表
     * @return 结果
     */
    public int updateTRole(TRole tRole);

    /**
     * 批量删除角色表
     * 
     * @param ids 需要删除的角色表主键集合
     * @return 结果
     */
    public int deleteTRoleByIds(String ids);

    /**
     * 删除角色表信息
     * 
     * @param id 角色表主键
     * @return 结果
     */
    public int deleteTRoleById(Long id);
}
