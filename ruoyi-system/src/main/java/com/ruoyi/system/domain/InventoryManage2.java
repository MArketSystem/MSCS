package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存管理对象 inventory_manage2
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public class InventoryManage2 extends BaseEntity
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

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierId;

    /** 商品库存量 */
    @Excel(name = "商品库存量")
    private Long goodsInventory;

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
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setGoodsInventory(Long goodsInventory) 
    {
        this.goodsInventory = goodsInventory;
    }

    public Long getGoodsInventory() 
    {
        return goodsInventory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("supplierId", getSupplierId())
            .append("goodsInventory", getGoodsInventory())
            .toString();
    }
}
