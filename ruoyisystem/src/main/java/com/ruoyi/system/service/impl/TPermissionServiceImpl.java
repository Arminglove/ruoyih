package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TPermissionMapper;
import com.ruoyi.system.domain.TPermission;
import com.ruoyi.system.service.ITPermissionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 权限表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Service
public class TPermissionServiceImpl implements ITPermissionService 
{
    @Autowired
    private TPermissionMapper tPermissionMapper;

    /**
     * 查询权限表
     * 
     * @param id 权限表主键
     * @return 权限表
     */
    @Override
    public TPermission selectTPermissionById(Long id)
    {
        return tPermissionMapper.selectTPermissionById(id);
    }

    /**
     * 查询权限表列表
     * 
     * @param tPermission 权限表
     * @return 权限表
     */
    @Override
    public List<TPermission> selectTPermissionList(TPermission tPermission)
    {
        return tPermissionMapper.selectTPermissionList(tPermission);
    }

    /**
     * 新增权限表
     * 
     * @param tPermission 权限表
     * @return 结果
     */
    @Override
    public int insertTPermission(TPermission tPermission)
    {
        return tPermissionMapper.insertTPermission(tPermission);
    }

    /**
     * 修改权限表
     * 
     * @param tPermission 权限表
     * @return 结果
     */
    @Override
    public int updateTPermission(TPermission tPermission)
    {
        return tPermissionMapper.updateTPermission(tPermission);
    }

    /**
     * 批量删除权限表
     * 
     * @param ids 需要删除的权限表主键
     * @return 结果
     */
    @Override
    public int deleteTPermissionByIds(String ids)
    {
        return tPermissionMapper.deleteTPermissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除权限表信息
     * 
     * @param id 权限表主键
     * @return 结果
     */
    @Override
    public int deleteTPermissionById(Long id)
    {
        return tPermissionMapper.deleteTPermissionById(id);
    }
}
