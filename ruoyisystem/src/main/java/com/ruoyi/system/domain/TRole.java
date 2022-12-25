package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 角色表对象 t_role
 * 
 * @author ruoyi
 * @date 2022-12-25
 */
public class TRole extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色id */
    private Long id;

    /**  */
    @Excel(name = "")
    private String rname;

    /**  */
    @Excel(name = "")
    private String description;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRname(String rname) 
    {
        this.rname = rname;
    }

    public String getRname() 
    {
        return rname;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rname", getRname())
            .append("description", getDescription())
            .toString();
    }
}
