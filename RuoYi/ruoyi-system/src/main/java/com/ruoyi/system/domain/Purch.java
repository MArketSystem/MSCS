package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 进货管理对象 purch
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public class Purch extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long purchId;

    /** 进货商品编号 */
    @Excel(name = "进货商品编号")
    private String purchGoodno;

    /** 进货单价 */
    @Excel(name = "进货单价")
    private BigDecimal purchCost;

    /** 进货数量 */
    @Excel(name = "进货数量")
    private Integer purchNum;

    /** 进货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "进货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date purchDate;

    public void setPurchId(Long purchId) 
    {
        this.purchId = purchId;
    }

    public Long getPurchId() 
    {
        return purchId;
    }
    public void setPurchGoodno(String purchGoodno) 
    {
        this.purchGoodno = purchGoodno;
    }

    public String getPurchGoodno() 
    {
        return purchGoodno;
    }
    public void setPurchCost(BigDecimal purchCost) 
    {
        this.purchCost = purchCost;
    }

    public BigDecimal getPurchCost() 
    {
        return purchCost;
    }
    public void setPurchNum(Integer purchNum) 
    {
        this.purchNum = purchNum;
    }

    public Integer getPurchNum() 
    {
        return purchNum;
    }
    public void setPurchDate(Date purchDate) 
    {
        this.purchDate = purchDate;
    }

    public Date getPurchDate() 
    {
        return purchDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("purchId", getPurchId())
            .append("purchGoodno", getPurchGoodno())
            .append("purchCost", getPurchCost())
            .append("purchNum", getPurchNum())
            .append("purchDate", getPurchDate())
            .toString();
    }
}
