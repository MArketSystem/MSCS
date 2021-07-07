package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GoodsManage1Mapper;
import com.ruoyi.system.domain.GoodsManage1;
import com.ruoyi.system.service.IGoodsManage1Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class GoodsManage1ServiceImpl implements IGoodsManage1Service 
{
    @Autowired
    private GoodsManage1Mapper goodsManage1Mapper;

    /**
     * 查询商品管理
     * 
     * @param id 商品管理ID
     * @return 商品管理
     */
    @Override
    public GoodsManage1 selectGoodsManage1ById(Long id)
    {
        return goodsManage1Mapper.selectGoodsManage1ById(id);
    }

    /**
     * 查询商品管理列表
     * 
     * @param goodsManage1 商品管理
     * @return 商品管理
     */
    @Override
    public List<GoodsManage1> selectGoodsManage1List(GoodsManage1 goodsManage1)
    {
        return goodsManage1Mapper.selectGoodsManage1List(goodsManage1);
    }

    /**
     * 新增商品管理
     * 
     * @param goodsManage1 商品管理
     * @return 结果
     */
    @Override
    public int insertGoodsManage1(GoodsManage1 goodsManage1)
    {
        return goodsManage1Mapper.insertGoodsManage1(goodsManage1);
    }

    /**
     * 修改商品管理
     * 
     * @param goodsManage1 商品管理
     * @return 结果
     */
    @Override
    public int updateGoodsManage1(GoodsManage1 goodsManage1)
    {
        return goodsManage1Mapper.updateGoodsManage1(goodsManage1);
    }

    /**
     * 删除商品管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGoodsManage1ByIds(String ids)
    {
        return goodsManage1Mapper.deleteGoodsManage1ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品管理信息
     * 
     * @param id 商品管理ID
     * @return 结果
     */
    @Override
    public int deleteGoodsManage1ById(Long id)
    {
        return goodsManage1Mapper.deleteGoodsManage1ById(id);
    }
}
