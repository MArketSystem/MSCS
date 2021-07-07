package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ScrapManagement3;

/**
 * 报废管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
public interface ScrapManagement3Mapper 
{
    /**
     * 查询报废管理
     * 
     * @param id 报废管理ID
     * @return 报废管理
     */
    public ScrapManagement3 selectScrapManagement3ById(Long id);

    /**
     * 查询报废管理列表
     * 
     * @param scrapManagement3 报废管理
     * @return 报废管理集合
     */
    public List<ScrapManagement3> selectScrapManagement3List(ScrapManagement3 scrapManagement3);

    /**
     * 新增报废管理
     * 
     * @param scrapManagement3 报废管理
     * @return 结果
     */
    public int insertScrapManagement3(ScrapManagement3 scrapManagement3);

    /**
     * 修改报废管理
     * 
     * @param scrapManagement3 报废管理
     * @return 结果
     */
    public int updateScrapManagement3(ScrapManagement3 scrapManagement3);

    /**
     * 删除报废管理
     * 
     * @param id 报废管理ID
     * @return 结果
     */
    public int deleteScrapManagement3ById(Long id);

    /**
     * 批量删除报废管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteScrapManagement3ByIds(String[] ids);
}
