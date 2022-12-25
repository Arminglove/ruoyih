package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TUser;

/**
 * 用户信息表Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public interface TUserMapper 
{
    /**
     * 查询用户信息表
     * 
     * @param id 用户信息表主键
     * @return 用户信息表
     */
    public TUser selectTUserById(Long id);

    /**
     * 查询用户信息表列表
     * 
     * @param tUser 用户信息表
     * @return 用户信息表集合
     */
    public List<TUser> selectTUserList(TUser tUser);

    /**
     * 新增用户信息表
     * 
     * @param tUser 用户信息表
     * @return 结果
     */
    public int insertTUser(TUser tUser);

    /**
     * 修改用户信息表
     * 
     * @param tUser 用户信息表
     * @return 结果
     */
    public int updateTUser(TUser tUser);

    /**
     * 删除用户信息表
     * 
     * @param id 用户信息表主键
     * @return 结果
     */
    public int deleteTUserById(Long id);

    /**
     * 批量删除用户信息表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTUserByIds(String[] ids);
}
