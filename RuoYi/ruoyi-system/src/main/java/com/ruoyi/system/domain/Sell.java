package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售管理对象 sell
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public class Sell extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long sellId;

    /** 销售商品编号 */
    @Excel(name = "销售商品编号")
    private String sellGoodno;

    /** 销售价格 */
    @Excel(name = "销售价格")
    private BigDecimal sellPrice;

    /** 销售数量 */
    @Excel(name = "销售数量")
    private Integer sellNum;

    /** 销售日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销售日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sellDate;

    public void setSellId(Long sellId) 
    {
        this.sellId = sellId;
    }

    public Long getSellId() 
    {
        return sellId;
    }
    public void setSellGoodno(String sellGoodno) 
    {
        this.sellGoodno = sellGoodno;
    }

    public String getSellGoodno() 
    {
        return sellGoodno;
    }
    public void setSellPrice(BigDecimal sellPrice) 
    {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getSellPrice() 
    {
        return sellPrice;
    }
    public void setSellNum(Integer sellNum) 
    {
        this.sellNum = sellNum;
    }

    public Integer getSellNum() 
    {
        return sellNum;
    }
    public void setSellDate(Date sellDate) 
    {
        this.sellDate = sellDate;
    }

    public Date getSellDate() 
    {
        return sellDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sellId", getSellId())
            .append("sellGoodno", getSellGoodno())
            .append("sellPrice", getSellPrice())
            .append("sellNum", getSellNum())
            .append("sellDate", getSellDate())
            .toString();
    }
}
