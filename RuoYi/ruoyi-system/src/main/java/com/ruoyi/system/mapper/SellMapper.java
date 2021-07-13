package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Sell;

/**
 * 销售管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface SellMapper 
{
    /**
     * 查询销售管理
     * 
     * @param sellId 销售管理ID
     * @return 销售管理
     */
    public Sell selectSellById(Long sellId);

    /**
     * 查询销售管理列表
     * 
     * @param sell 销售管理
     * @return 销售管理集合
     */
    public List<Sell> selectSellList(Sell sell);

    /**
     * 新增销售管理
     * 
     * @param sell 销售管理
     * @return 结果
     */
    public int insertSell(Sell sell);

    /**
     * 修改销售管理
     * 
     * @param sell 销售管理
     * @return 结果
     */
    public int updateSell(Sell sell);

    /**
     * 删除销售管理
     * 
     * @param sellId 销售管理ID
     * @return 结果
     */
    public int deleteSellById(Long sellId);

    /**
     * 批量删除销售管理
     * 
     * @param sellIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSellByIds(String[] sellIds);
}
