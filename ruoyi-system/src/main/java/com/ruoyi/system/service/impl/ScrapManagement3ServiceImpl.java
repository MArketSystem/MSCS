package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScrapManagement3Mapper;
import com.ruoyi.system.domain.ScrapManagement3;
import com.ruoyi.system.service.IScrapManagement3Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 报废管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Service
public class ScrapManagement3ServiceImpl implements IScrapManagement3Service 
{
    @Autowired
    private ScrapManagement3Mapper scrapManagement3Mapper;

    /**
     * 查询报废管理
     * 
     * @param id 报废管理ID
     * @return 报废管理
     */
    @Override
    public ScrapManagement3 selectScrapManagement3ById(Long id)
    {
        return scrapManagement3Mapper.selectScrapManagement3ById(id);
    }

    /**
     * 查询报废管理列表
     * 
     * @param scrapManagement3 报废管理
     * @return 报废管理
     */
    @Override
    public List<ScrapManagement3> selectScrapManagement3List(ScrapManagement3 scrapManagement3)
    {
        return scrapManagement3Mapper.selectScrapManagement3List(scrapManagement3);
    }

    /**
     * 新增报废管理
     * 
     * @param scrapManagement3 报废管理
     * @return 结果
     */
    @Override
    public int insertScrapManagement3(ScrapManagement3 scrapManagement3)
    {
        return scrapManagement3Mapper.insertScrapManagement3(scrapManagement3);
    }

    /**
     * 修改报废管理
     * 
     * @param scrapManagement3 报废管理
     * @return 结果
     */
    @Override
    public int updateScrapManagement3(ScrapManagement3 scrapManagement3)
    {
        return scrapManagement3Mapper.updateScrapManagement3(scrapManagement3);
    }

    /**
     * 删除报废管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteScrapManagement3ByIds(String ids)
    {
        return scrapManagement3Mapper.deleteScrapManagement3ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报废管理信息
     * 
     * @param id 报废管理ID
     * @return 结果
     */
    @Override
    public int deleteScrapManagement3ById(Long id)
    {
        return scrapManagement3Mapper.deleteScrapManagement3ById(id);
    }
}
