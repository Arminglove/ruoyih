package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TPermission;

/**
 * 权限表Service接口
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public interface ITPermissionService 
{
    /**
     * 查询权限表
     * 
     * @param id 权限表主键
     * @return 权限表
     */
    public TPermission selectTPermissionById(Long id);

    /**
     * 查询权限表列表
     * 
     * @param tPermission 权限表
     * @return 权限表集合
     */
    public List<TPermission> selectTPermissionList(TPermission tPermission);

    /**
     * 新增权限表
     * 
     * @param tPermission 权限表
     * @return 结果
     */
    public int insertTPermission(TPermission tPermission);

    /**
     * 修改权限表
     * 
     * @param tPermission 权限表
     * @return 结果
     */
    public int updateTPermission(TPermission tPermission);

    /**
     * 批量删除权限表
     * 
     * @param ids 需要删除的权限表主键集合
     * @return 结果
     */
    public int deleteTPermissionByIds(String ids);

    /**
     * 删除权限表信息
     * 
     * @param id 权限表主键
     * @return 结果
     */
    public int deleteTPermissionById(Long id);
}
