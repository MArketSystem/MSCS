package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品管理对象 good
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public class Good extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long goodId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String goodNo;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodName;

    /** 商品库存 */
    @Excel(name = "商品库存")
    private Integer goodNum;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal goodPrice;

    /** 商品销售量 */
    @Excel(name = "商品销售量")
    private Integer goodSell;

    /** 商品总报废量 */
    @Excel(name = "商品总报废量")
    private Integer goodScrap;

    /** 商品信息 */
    @Excel(name = "商品信息")
    private String goodInfo;

    public void setGoodId(Long goodId) 
    {
        this.goodId = goodId;
    }

    public Long getGoodId() 
    {
        return goodId;
    }
    public void setGoodNo(String goodNo) 
    {
        this.goodNo = goodNo;
    }

    public String getGoodNo() 
    {
        return goodNo;
    }
    public void setGoodName(String goodName) 
    {
        this.goodName = goodName;
    }

    public String getGoodName() 
    {
        return goodName;
    }
    public void setGoodNum(Integer goodNum) 
    {
        this.goodNum = goodNum;
    }

    public Integer getGoodNum() 
    {
        return goodNum;
    }
    public void setGoodPrice(BigDecimal goodPrice) 
    {
        this.goodPrice = goodPrice;
    }

    public BigDecimal getGoodPrice() 
    {
        return goodPrice;
    }
    public void setGoodSell(Integer goodSell) 
    {
        this.goodSell = goodSell;
    }

    public Integer getGoodSell() 
    {
        return goodSell;
    }
    public void setGoodScrap(Integer goodScrap) 
    {
        this.goodScrap = goodScrap;
    }

    public Integer getGoodScrap() 
    {
        return goodScrap;
    }
    public void setGoodInfo(String goodInfo) 
    {
        this.goodInfo = goodInfo;
    }

    public String getGoodInfo() 
    {
        return goodInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodId", getGoodId())
            .append("goodNo", getGoodNo())
            .append("goodName", getGoodName())
            .append("goodNum", getGoodNum())
            .append("goodPrice", getGoodPrice())
            .append("goodSell", getGoodSell())
            .append("goodScrap", getGoodScrap())
            .append("goodInfo", getGoodInfo())
            .toString();
    }
}
