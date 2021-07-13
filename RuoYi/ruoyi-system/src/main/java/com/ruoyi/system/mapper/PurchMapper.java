package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Purch;

/**
 * 进货管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface PurchMapper 
{
    /**
     * 查询进货管理
     * 
     * @param purchId 进货管理ID
     * @return 进货管理
     */
    public Purch selectPurchById(Long purchId);

    /**
     * 查询进货管理列表
     * 
     * @param purch 进货管理
     * @return 进货管理集合
     */
    public List<Purch> selectPurchList(Purch purch);

    /**
     * 新增进货管理
     * 
     * @param purch 进货管理
     * @return 结果
     */
    public int insertPurch(Purch purch);

    /**
     * 修改进货管理
     * 
     * @param purch 进货管理
     * @return 结果
     */
    public int updatePurch(Purch purch);

    /**
     * 删除进货管理
     * 
     * @param purchId 进货管理ID
     * @return 结果
     */
    public int deletePurchById(Long purchId);

    /**
     * 批量删除进货管理
     * 
     * @param purchIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePurchByIds(String[] purchIds);
}