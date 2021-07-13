package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SellMapper;
import com.ruoyi.system.domain.Sell;
import com.ruoyi.system.service.ISellService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Service
public class SellServiceImpl implements ISellService 
{
    @Autowired
    private SellMapper sellMapper;

    /**
     * 查询销售管理
     * 
     * @param sellId 销售管理ID
     * @return 销售管理
     */
    @Override
    public Sell selectSellById(Long sellId)
    {
        return sellMapper.selectSellById(sellId);
    }

    /**
     * 查询销售管理列表
     * 
     * @param sell 销售管理
     * @return 销售管理
     */
    @Override
    public List<Sell> selectSellList(Sell sell)
    {
        return sellMapper.selectSellList(sell);
    }

    /**
     * 新增销售管理
     * 
     * @param sell 销售管理
     * @return 结果
     */
    @Override
    public int insertSell(Sell sell)
    {
        return sellMapper.insertSell(sell);
    }

    /**
     * 修改销售管理
     * 
     * @param sell 销售管理
     * @return 结果
     */
    @Override
    public int updateSell(Sell sell)
    {
        return sellMapper.updateSell(sell);
    }

    /**
     * 删除销售管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSellByIds(String ids)
    {
        return sellMapper.deleteSellByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售管理信息
     * 
     * @param sellId 销售管理ID
     * @return 结果
     */
    @Override
    public int deleteSellById(Long sellId)
    {
        return sellMapper.deleteSellById(sellId);
    }
}
