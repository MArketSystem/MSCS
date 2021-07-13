package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Scrap;

/**
 * 报损管理Service接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface IScrapService 
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
     * 批量删除报损管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteScrapByIds(String ids);

    /**
     * 删除报损管理信息
     * 
     * @param scrapId 报损管理ID
     * @return 结果
     */
    public int deleteScrapById(Long scrapId);
}
