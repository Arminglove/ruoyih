package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户信息表对象 t_user
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public class TUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String username;

    /** 图片上传 */
    @Excel(name = "图片上传")
    private String avatar;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 角色id */
    @Excel(name = "角色id")
    private Long rid;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creattime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setRid(Long rid) 
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setCreattime(Date creattime) 
    {
        this.creattime = creattime;
    }

    public Date getCreattime() 
    {
        return creattime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("avatar", getAvatar())
            .append("password", getPassword())
            .append("gender", getGender())
            .append("rid", getRid())
            .append("birthday", getBirthday())
            .append("creattime", getCreattime())
            .toString();
    }
}
