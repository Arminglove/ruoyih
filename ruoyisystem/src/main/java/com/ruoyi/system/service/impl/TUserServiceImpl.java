package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TUserMapper;
import com.ruoyi.system.domain.TUser;
import com.ruoyi.system.service.ITUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 用户信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
@Service
public class TUserServiceImpl implements ITUserService 
{
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 查询用户信息表
     * 
     * @param id 用户信息表主键
     * @return 用户信息表
     */
    @Override
    public TUser selectTUserById(Long id)
    {
        return tUserMapper.selectTUserById(id);
    }

    /**
     * 查询用户信息表列表
     * 
     * @param tUser 用户信息表
     * @return 用户信息表
     */
    @Override
    public List<TUser> selectTUserList(TUser tUser)
    {
        return tUserMapper.selectTUserList(tUser);
    }

    /**
     * 新增用户信息表
     * 
     * @param tUser 用户信息表
     * @return 结果
     */
    @Override
    public int insertTUser(TUser tUser)
    {
        return tUserMapper.insertTUser(tUser);
    }

    /**
     * 修改用户信息表
     * 
     * @param tUser 用户信息表
     * @return 结果
     */
    @Override
    public int updateTUser(TUser tUser)
    {
        return tUserMapper.updateTUser(tUser);
    }

    /**
     * 批量删除用户信息表
     * 
     * @param ids 需要删除的用户信息表主键
     * @return 结果
     */
    @Override
    public int deleteTUserByIds(String ids)
    {
        return tUserMapper.deleteTUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户信息表信息
     * 
     * @param id 用户信息表主键
     * @return 结果
     */
    @Override
    public int deleteTUserById(Long id)
    {
        return tUserMapper.deleteTUserById(id);
    }
}
