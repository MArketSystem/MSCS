package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.InventoryManage2Mapper;
import com.ruoyi.system.domain.InventoryManage2;
import com.ruoyi.system.service.IInventoryManage2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class InventoryManage2ServiceImpl implements IInventoryManage2Service 
{
    @Autowired
    private InventoryManage2Mapper inventoryManage2Mapper;

    /**
     * 查询库存管理
     * 
     * @param id 库存管理ID
     * @return 库存管理
     */
    @Override
    public InventoryManage2 selectInventoryManage2ById(Long id)
    {
        return inventoryManage2Mapper.selectInventoryManage2ById(id);
    }

    /**
     * 查询库存管理列表
     * 
     * @param inventoryManage2 库存管理
     * @return 库存管理
     */
    @Override
    public List<InventoryManage2> selectInventoryManage2List(InventoryManage2 inventoryManage2)
    {
        return inventoryManage2Mapper.selectInventoryManage2List(inventoryManage2);
    }

    /**
     * 新增库存管理
     * 
     * @param inventoryManage2 库存管理
     * @return 结果
     */
    @Override
    public int insertInventoryManage2(InventoryManage2 inventoryManage2)
    {
        return inventoryManage2Mapper.insertInventoryManage2(inventoryManage2);
    }

    /**
     * 修改库存管理
     * 
     * @param inventoryManage2 库存管理
     * @return 结果
     */
    @Override
    public int updateInventoryManage2(InventoryManage2 inventoryManage2)
    {
        return inventoryManage2Mapper.updateInventoryManage2(inventoryManage2);
    }

    /**
     * 删除库存管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteInventoryManage2ByIds(String ids)
    {
        return inventoryManage2Mapper.deleteInventoryManage2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存管理信息
     * 
     * @param id 库存管理ID
     * @return 结果
     */
    @Override
    public int deleteInventoryManage2ById(Long id)
    {
        return inventoryManage2Mapper.deleteInventoryManage2ById(id);
    }
}
