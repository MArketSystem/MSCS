package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GoodMapper;
import com.ruoyi.system.domain.Good;
import com.ruoyi.system.service.IGoodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Service
public class GoodServiceImpl implements IGoodService 
{
    @Autowired
    private GoodMapper goodMapper;

    /**
     * 查询商品管理
     * 
     * @param goodId 商品管理ID
     * @return 商品管理
     */
    @Override
    public Good selectGoodById(Long goodId)
    {
        return goodMapper.selectGoodById(goodId);
    }

    /**
     * 查询商品管理列表
     * 
     * @param good 商品管理
     * @return 商品管理
     */
    @Override
    public List<Good> selectGoodList(Good good)
    {
        return goodMapper.selectGoodList(good);
    }

    /**
     * 新增商品管理
     * 
     * @param good 商品管理
     * @return 结果
     */
    @Override
    public int insertGood(Good good) { return goodMapper.insertGood(good); }

    /**
     * 修改商品管理
     * 
     * @param good 商品管理
     * @return 结果
     */
    @Override
    public int updateGood(Good good)
    {
        return goodMapper.updateGood(good);
    }

    /**
     * 删除商品管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGoodByIds(String ids)
    {
        return goodMapper.deleteGoodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品管理信息
     * 
     * @param goodId 商品管理ID
     * @return 结果
     */
    @Override
    public int deleteGoodById(Long goodId)
    {
        return goodMapper.deleteGoodById(goodId);
    }
}
