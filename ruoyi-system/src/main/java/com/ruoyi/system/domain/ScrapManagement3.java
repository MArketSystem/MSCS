package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报废管理对象 scrap_management3
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class ScrapManagement3 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 成本 */
    @Excel(name = "成本")
    private BigDecimal goodsCost;

    /** 数量 */
    @Excel(name = "数量")
    private Long goodsNum;

    /** 原因 */
    @Excel(name = "原因")
    private String goodsReason;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGoodsId(String goodsId) 
    {
        this.goodsId = goodsId;
    }

    public String getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setGoodsCost(BigDecimal goodsCost) 
    {
        this.goodsCost = goodsCost;
    }

    public BigDecimal getGoodsCost() 
    {
        return goodsCost;
    }
    public void setGoodsNum(Long goodsNum) 
    {
        this.goodsNum = goodsNum;
    }

    public Long getGoodsNum() 
    {
        return goodsNum;
    }
    public void setGoodsReason(String goodsReason) 
    {
        this.goodsReason = goodsReason;
    }

    public String getGoodsReason() 
    {
        return goodsReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("goodsCost", getGoodsCost())
            .append("goodsNum", getGoodsNum())
            .append("goodsReason", getGoodsReason())
            .toString();
    }
}
