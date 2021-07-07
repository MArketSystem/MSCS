package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 进货管理对象 purchase_management4
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class PurchaseManagement4 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String purchaseId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierId;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date purchaseTime;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal goodsPrice;

    /** 数量 */
    @Excel(name = "数量")
    private Long goodsNum;

    /** 经手人 */
    @Excel(name = "经手人")
    private String purchasePoeple;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPurchaseId(String purchaseId) 
    {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseId() 
    {
        return purchaseId;
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
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setPurchaseTime(Date purchaseTime) 
    {
        this.purchaseTime = purchaseTime;
    }

    public Date getPurchaseTime() 
    {
        return purchaseTime;
    }
    public void setGoodsPrice(BigDecimal goodsPrice) 
    {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsPrice() 
    {
        return goodsPrice;
    }
    public void setGoodsNum(Long goodsNum) 
    {
        this.goodsNum = goodsNum;
    }

    public Long getGoodsNum() 
    {
        return goodsNum;
    }
    public void setPurchasePoeple(String purchasePoeple) 
    {
        this.purchasePoeple = purchasePoeple;
    }

    public String getPurchasePoeple() 
    {
        return purchasePoeple;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("purchaseId", getPurchaseId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("supplierId", getSupplierId())
            .append("purchaseTime", getPurchaseTime())
            .append("goodsPrice", getGoodsPrice())
            .append("goodsNum", getGoodsNum())
            .append("purchasePoeple", getPurchasePoeple())
            .toString();
    }
}
