package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScrapMapper;
import com.ruoyi.system.domain.Scrap;
import com.ruoyi.system.service.IScrapService;
import com.ruoyi.common.core.text.Convert;

/**
 * 报损管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Service
public class ScrapServiceImpl implements IScrapService 
{
    @Autowired
    private ScrapMapper scrapMapper;

    /**
     * 查询报损管理
     * 
     * @param scrapId 报损管理ID
     * @return 报损管理
     */
    @Override
    public Scrap selectScrapById(Long scrapId)
    {
        return scrapMapper.selectScrapById(scrapId);
    }

    /**
     * 查询报损管理列表
     * 
     * @param scrap 报损管理
     * @return 报损管理
     */
    @Override
    public List<Scrap> selectScrapList(Scrap scrap)
    {
        return scrapMapper.selectScrapList(scrap);
    }

    /**
     * 新增报损管理
     * 
     * @param scrap 报损管理
     * @return 结果
     */
    @Override
    public int insertScrap(Scrap scrap)
    {
        return scrapMapper.insertScrap(scrap);
    }

    /**
     * 修改报损管理
     * 
     * @param scrap 报损管理
     * @return 结果
     */
    @Override
    public int updateScrap(Scrap scrap)
    {
        return scrapMapper.updateScrap(scrap);
    }

    /**
     * 删除报损管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteScrapByIds(String ids)
    {
        return scrapMapper.deleteScrapByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报损管理信息
     * 
     * @param scrapId 报损管理ID
     * @return 结果
     */
    @Override
    public int deleteScrapById(Long scrapId)
    {
        return scrapMapper.deleteScrapById(scrapId);
    }
}
