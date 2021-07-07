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
import com.ruoyi.system.domain.ScrapManagement3;
import com.ruoyi.system.service.IScrapManagement3Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报废管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/management3")
public class ScrapManagement3Controller extends BaseController
{
    private String prefix = "system/management3";

    @Autowired
    private IScrapManagement3Service scrapManagement3Service;

    @RequiresPermissions("system:management3:view")
    @GetMapping()
    public String management3()
    {
        return prefix + "/management3";
    }

    /**
     * 查询报废管理列表
     */
    @RequiresPermissions("system:management3:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ScrapManagement3 scrapManagement3)
    {
        startPage();
        List<ScrapManagement3> list = scrapManagement3Service.selectScrapManagement3List(scrapManagement3);
        return getDataTable(list);
    }

    /**
     * 导出报废管理列表
     */
    @RequiresPermissions("system:management3:export")
    @Log(title = "报废管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ScrapManagement3 scrapManagement3)
    {
        List<ScrapManagement3> list = scrapManagement3Service.selectScrapManagement3List(scrapManagement3);
        ExcelUtil<ScrapManagement3> util = new ExcelUtil<ScrapManagement3>(ScrapManagement3.class);
        return util.exportExcel(list, "报废管理数据");
    }

    /**
     * 新增报废管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报废管理
     */
    @RequiresPermissions("system:management3:add")
    @Log(title = "报废管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ScrapManagement3 scrapManagement3)
    {
        return toAjax(scrapManagement3Service.insertScrapManagement3(scrapManagement3));
    }

    /**
     * 修改报废管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ScrapManagement3 scrapManagement3 = scrapManagement3Service.selectScrapManagement3ById(id);
        mmap.put("scrapManagement3", scrapManagement3);
        return prefix + "/edit";
    }

    /**
     * 修改保存报废管理
     */
    @RequiresPermissions("system:management3:edit")
    @Log(title = "报废管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ScrapManagement3 scrapManagement3)
    {
        return toAjax(scrapManagement3Service.updateScrapManagement3(scrapManagement3));
    }

    /**
     * 删除报废管理
     */
    @RequiresPermissions("system:management3:remove")
    @Log(title = "报废管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(scrapManagement3Service.deleteScrapManagement3ByIds(ids));
    }
}
