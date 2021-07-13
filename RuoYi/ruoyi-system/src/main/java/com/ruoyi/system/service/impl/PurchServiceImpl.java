package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PurchMapper;
import com.ruoyi.system.domain.Purch;
import com.ruoyi.system.service.IPurchService;
import com.ruoyi.common.core.text.Convert;

/**
 * 进货管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Service
public class PurchServiceImpl implements IPurchService 
{
    @Autowired
    private PurchMapper purchMapper;

    /**
     * 查询进货管理
     * 
     * @param purchId 进货管理ID
     * @return 进货管理
     */
    @Override
    public Purch selectPurchById(Long purchId)
    {
        return purchMapper.selectPurchById(purchId);
    }

    /**
     * 查询进货管理列表
     * 
     * @param purch 进货管理
     * @return 进货管理
     */
    @Override
    public List<Purch> selectPurchList(Purch purch)
    {
        return purchMapper.selectPurchList(purch);
    }

    /**
     * 新增进货管理
     * 
     * @param purch 进货管理
     * @return 结果
     */
    @Override
    public int insertPurch(Purch purch)
    {
        return purchMapper.insertPurch(purch);
    }

    /**
     * 修改进货管理
     * 
     * @param purch 进货管理
     * @return 结果
     */
    @Override
    public int updatePurch(Purch purch)
    {
        return purchMapper.updatePurch(purch);
    }

    /**
     * 删除进货管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePurchByIds(String ids)
    {
        return purchMapper.deletePurchByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除进货管理信息
     * 
     * @param purchId 进货管理ID
     * @return 结果
     */
    @Override
    public int deletePurchById(Long purchId)
    {
        return purchMapper.deletePurchById(purchId);
    }
}
