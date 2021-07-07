package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PurchaseManagement4Mapper;
import com.ruoyi.system.domain.PurchaseManagement4;
import com.ruoyi.system.service.IPurchaseManagement4Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 进货管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class PurchaseManagement4ServiceImpl implements IPurchaseManagement4Service 
{
    @Autowired
    private PurchaseManagement4Mapper purchaseManagement4Mapper;

    /**
     * 查询进货管理
     * 
     * @param id 进货管理ID
     * @return 进货管理
     */
    @Override
    public PurchaseManagement4 selectPurchaseManagement4ById(Long id)
    {
        return purchaseManagement4Mapper.selectPurchaseManagement4ById(id);
    }

    /**
     * 查询进货管理列表
     * 
     * @param purchaseManagement4 进货管理
     * @return 进货管理
     */
    @Override
    public List<PurchaseManagement4> selectPurchaseManagement4List(PurchaseManagement4 purchaseManagement4)
    {
        return purchaseManagement4Mapper.selectPurchaseManagement4List(purchaseManagement4);
    }

    /**
     * 新增进货管理
     * 
     * @param purchaseManagement4 进货管理
     * @return 结果
     */
    @Override
    public int insertPurchaseManagement4(PurchaseManagement4 purchaseManagement4)
    {
        return purchaseManagement4Mapper.insertPurchaseManagement4(purchaseManagement4);
    }

    /**
     * 修改进货管理
     * 
     * @param purchaseManagement4 进货管理
     * @return 结果
     */
    @Override
    public int updatePurchaseManagement4(PurchaseManagement4 purchaseManagement4)
    {
        return purchaseManagement4Mapper.updatePurchaseManagement4(purchaseManagement4);
    }

    /**
     * 删除进货管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePurchaseManagement4ByIds(String ids)
    {
        return purchaseManagement4Mapper.deletePurchaseManagement4ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除进货管理信息
     * 
     * @param id 进货管理ID
     * @return 结果
     */
    @Override
    public int deletePurchaseManagement4ById(Long id)
    {
        return purchaseManagement4Mapper.deletePurchaseManagement4ById(id);
    }
}
