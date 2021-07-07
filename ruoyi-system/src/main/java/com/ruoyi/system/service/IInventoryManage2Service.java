package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.InventoryManage2;

/**
 * 库存管理Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IInventoryManage2Service 
{
    /**
     * 查询库存管理
     * 
     * @param id 库存管理ID
     * @return 库存管理
     */
    public InventoryManage2 selectInventoryManage2ById(Long id);

    /**
     * 查询库存管理列表
     * 
     * @param inventoryManage2 库存管理
     * @return 库存管理集合
     */
    public List<InventoryManage2> selectInventoryManage2List(InventoryManage2 inventoryManage2);

    /**
     * 新增库存管理
     * 
     * @param inventoryManage2 库存管理
     * @return 结果
     */
    public int insertInventoryManage2(InventoryManage2 inventoryManage2);

    /**
     * 修改库存管理
     * 
     * @param inventoryManage2 库存管理
     * @return 结果
     */
    public int updateInventoryManage2(InventoryManage2 inventoryManage2);

    /**
     * 批量删除库存管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInventoryManage2ByIds(String ids);

    /**
     * 删除库存管理信息
     * 
     * @param id 库存管理ID
     * @return 结果
     */
    public int deleteInventoryManage2ById(Long id);
}
