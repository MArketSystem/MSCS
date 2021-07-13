package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Scrap;

/**
 * 报损管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface ScrapMapper 
{
    /**
     * 查询报损管理
     * 
     * @param scrapId 报损管理ID
     * @return 报损管理
     */
    public Scrap selectScrapById(Long scrapId);

    /**
     * 查询报损管理列表
     * 
     * @param scrap 报损管理
     * @return 报损管理集合
     */
    public List<Scrap> selectScrapList(Scrap scrap);

    /**
     * 新增报损管理
     * 
     * @param scrap 报损管理
     * @return 结果
     */
    public int insertScrap(Scrap scrap);

    /**
     * 修改报损管理
     * 
     * @param scrap 报损管理
     * @return 结果
     */
    public int updateScrap(Scrap scrap);

    /**
     * 删除报损管理
     * 
     * @param scrapId 报损管理ID
     * @return 结果
     */
    public int deleteScrapById(Long scrapId);

    /**
     * 批量删除报损管理
     * 
     * @param scrapIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteScrapByIds(String[] scrapIds);
}
