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
import com.ruoyi.system.domain.Scrap;
import com.ruoyi.system.service.IScrapService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报损管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Controller
@RequestMapping("/system/scrap")
public class ScrapController extends BaseController
{
    private String prefix = "system/scrap";

    @Autowired
    private IScrapService scrapService;

    @RequiresPermissions("system:scrap:view")
    @GetMapping()
    public String scrap()
    {
        return prefix + "/scrap";
    }

    /**
     * 查询报损管理列表
     */
    @RequiresPermissions("system:scrap:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Scrap scrap)
    {
        startPage();
        List<Scrap> list = scrapService.selectScrapList(scrap);
        return getDataTable(list);
    }

    /**
     * 导出报损管理列表
     */
    @RequiresPermissions("system:scrap:export")
    @Log(title = "报损管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Scrap scrap)
    {
        List<Scrap> list = scrapService.selectScrapList(scrap);
        ExcelUtil<Scrap> util = new ExcelUtil<Scrap>(Scrap.class);
        return util.exportExcel(list, "报损管理数据");
    }

    /**
     * 新增报损管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报损管理
     */
    @RequiresPermissions("system:scrap:add")
    @Log(title = "报损管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Scrap scrap)
    {
        return toAjax(scrapService.insertScrap(scrap));
    }

    /**
     * 修改报损管理
     */
    @GetMapping("/edit/{scrapId}")
    public String edit(@PathVariable("scrapId") Long scrapId, ModelMap mmap)
    {
        Scrap scrap = scrapService.selectScrapById(scrapId);
        mmap.put("scrap", scrap);
        return prefix + "/edit";
    }

    /**
     * 修改保存报损管理
     */
    @RequiresPermissions("system:scrap:edit")
    @Log(title = "报损管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Scrap scrap)
    {
        return toAjax(scrapService.updateScrap(scrap));
    }

    /**
     * 删除报损管理
     */
    @RequiresPermissions("system:scrap:remove")
    @Log(title = "报损管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(scrapService.deleteScrapByIds(ids));
    }
}
