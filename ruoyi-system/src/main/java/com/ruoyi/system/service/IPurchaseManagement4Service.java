package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PurchaseManagement4;

/**
 * 进货管理Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IPurchaseManagement4Service 
{
    /**
     * 查询进货管理
     * 
     * @param id 进货管理ID
     * @return 进货管理
     */
    public PurchaseManagement4 selectPurchaseManagement4ById(Long id);

    /**
     * 查询进货管理列表
     * 
     * @param purchaseManagement4 进货管理
     * @return 进货管理集合
     */
    public List<PurchaseManagement4> selectPurchaseManagement4List(PurchaseManagement4 purchaseManagement4);

    /**
     * 新增进货管理
     * 
     * @param purchaseManagement4 进货管理
     * @return 结果
     */
    public int insertPurchaseManagement4(PurchaseManagement4 purchaseManagement4);

    /**
     * 修改进货管理
     * 
     * @param purchaseManagement4 进货管理
     * @return 结果
     */
    public int updatePurchaseManagement4(PurchaseManagement4 purchaseManagement4);

    /**
     * 批量删除进货管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePurchaseManagement4ByIds(String ids);

    /**
     * 删除进货管理信息
     * 
     * @param id 进货管理ID
     * @return 结果
     */
    public int deletePurchaseManagement4ById(Long id);
}
