package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报损管理对象 scrap
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public class Scrap extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long scrapId;

    /** 报损商品编号 */
    @Excel(name = "报损商品编号")
    private String scrapGoodno;

    /** 报损数量 */
    @Excel(name = "报损数量")
    private Integer scrapNum;

    /** 报损日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报损日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scrapDate;

    /** 报损原因 */
    @Excel(name = "报损原因")
    private String scrapReason;

    public void setScrapId(Long scrapId) 
    {
        this.scrapId = scrapId;
    }

    public Long getScrapId() 
    {
        return scrapId;
    }
    public void setScrapGoodno(String scrapGoodno) 
    {
        this.scrapGoodno = scrapGoodno;
    }

    public String getScrapGoodno() 
    {
        return scrapGoodno;
    }
    public void setScrapNum(Integer scrapNum) 
    {
        this.scrapNum = scrapNum;
    }

    public Integer getScrapNum() 
    {
        return scrapNum;
    }
    public void setScrapDate(Date scrapDate) 
    {
        this.scrapDate = scrapDate;
    }

    public Date getScrapDate() 
    {
        return scrapDate;
    }
    public void setScrapReason(String scrapReason) 
    {
        this.scrapReason = scrapReason;
    }

    public String getScrapReason() 
    {
        return scrapReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("scrapId", getScrapId())
            .append("scrapGoodno", getScrapGoodno())
            .append("scrapNum", getScrapNum())
            .append("scrapDate", getScrapDate())
            .append("scrapReason", getScrapReason())
            .toString();
    }
}
