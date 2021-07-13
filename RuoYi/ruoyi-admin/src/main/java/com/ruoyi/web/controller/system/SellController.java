package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Sell;
import com.ruoyi.system.service.ISellService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Controller
@RequestMapping("/system/sell")
public class SellController extends BaseController
{
    private String prefix = "system/sell";

    @Autowired
    private ISellService sellService;

    @RequiresPermissions("system:sell:view")
    @GetMapping()
    public String sell()
    {
        return prefix + "/sell";
    }

    /**
     * 查询销售管理列表
     */
    @RequiresPermissions("system:sell:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Sell sell)
    {
        startPage();
        List<Sell> list = sellService.selectSellList(sell);
        return getDataTable(list);
    }

    /**
     * 导出销售管理列表
     */
    @RequiresPermissions("system:sell:export")
    @Log(title = "销售管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Sell sell)
    {
        List<Sell> list = sellService.selectSellList(sell);
        ExcelUtil<Sell> util = new ExcelUtil<Sell>(Sell.class);
        return util.exportExcel(list, "销售管理数据");
    }

    /**
     * 新增销售管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售管理
     */
    @RequiresPermissions("system:sell:add")
    @Log(title = "销售管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Sell sell)
    {
        return toAjax(sellService.insertSell(sell));
    }

    /**
     * 修改销售管理
     */
    @GetMapping("/edit/{sellId}")
    public String edit(@PathVariable("sellId") Long sellId, ModelMap mmap)
    {
        Sell sell = sellService.selectSellById(sellId);
        mmap.put("sell", sell);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售管理
     */
    @RequiresPermissions("system:sell:edit")
    @Log(title = "销售管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Sell sell)
    {
        return toAjax(sellService.updateSell(sell));
    }

    /**
     * 删除销售管理
     */
    @RequiresPermissions("system:sell:remove")
    @Log(title = "销售管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sellService.deleteSellByIds(ids));
    }
}
