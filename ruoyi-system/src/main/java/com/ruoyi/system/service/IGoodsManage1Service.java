package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GoodsManage1;

/**
 * 商品管理Service接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface IGoodsManage1Service 
{
    /**
     * 查询商品管理
     * 
     * @param id 商品管理ID
     * @return 商品管理
     */
    public GoodsManage1 selectGoodsManage1ById(Long id);

    /**
     * 查询商品管理列表
     * 
     * @param goodsManage1 商品管理
     * @return 商品管理集合
     */
    public List<GoodsManage1> selectGoodsManage1List(GoodsManage1 goodsManage1);

    /**
     * 新增商品管理
     * 
     * @param goodsManage1 商品管理
     * @return 结果
     */
    public int insertGoodsManage1(GoodsManage1 goodsManage1);

    /**
     * 修改商品管理
     * 
     * @param goodsManage1 商品管理
     * @return 结果
     */
    public int updateGoodsManage1(GoodsManage1 goodsManage1);

    /**
     * 批量删除商品管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGoodsManage1ByIds(String ids);

    /**
     * 删除商品管理信息
     * 
     * @param id 商品管理ID
     * @return 结果
     */
    public int deleteGoodsManage1ById(Long id);
}
