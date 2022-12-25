package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TRoleMapper;
import com.ruoyi.system.domain.TRole;
import com.ruoyi.system.service.ITRoleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Service
public class TRoleServiceImpl implements ITRoleService 
{
    @Autowired
    private TRoleMapper tRoleMapper;

    /**
     * 查询角色表
     * 
     * @param id 角色表主键
     * @return 角色表
     */
    @Override
    public TRole selectTRoleById(Long id)
    {
        return tRoleMapper.selectTRoleById(id);
    }

    /**
     * 查询角色表列表
     * 
     * @param tRole 角色表
     * @return 角色表
     */
    @Override
    public List<TRole> selectTRoleList(TRole tRole)
    {
        return tRoleMapper.selectTRoleList(tRole);
    }

    /**
     * 新增角色表
     * 
     * @param tRole 角色表
     * @return 结果
     */
    @Override
    public int insertTRole(TRole tRole)
    {
        return tRoleMapper.insertTRole(tRole);
    }

    /**
     * 修改角色表
     * 
     * @param tRole 角色表
     * @return 结果
     */
    @Override
    public int updateTRole(TRole tRole)
    {
        return tRoleMapper.updateTRole(tRole);
    }

    /**
     * 批量删除角色表
     * 
     * @param ids 需要删除的角色表主键
     * @return 结果
     */
    @Override
    public int deleteTRoleByIds(String ids)
    {
        return tRoleMapper.deleteTRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色表信息
     * 
     * @param id 角色表主键
     * @return 结果
     */
    @Override
    public int deleteTRoleById(Long id)
    {
        return tRoleMapper.deleteTRoleById(id);
    }
}
