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
import com.ruoyi.system.domain.Purch;
import com.ruoyi.system.service.IPurchService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 进货管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Controller
@RequestMapping("/system/purch")
public class PurchController extends BaseController
{
    private String prefix = "system/purch";

    @Autowired
    private IPurchService purchService;

    @RequiresPermissions("system:purch:view")
    @GetMapping()
    public String purch()
    {
        return prefix + "/purch";
    }

    /**
     * 查询进货管理列表
     */
    @RequiresPermissions("system:purch:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Purch purch)
    {
        startPage();
        List<Purch> list = purchService.selectPurchList(purch);
        return getDataTable(list);
    }

    /**
     * 导出进货管理列表
     */
    @RequiresPermissions("system:purch:export")
    @Log(title = "进货管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Purch purch)
    {
        List<Purch> list = purchService.selectPurchList(purch);
        ExcelUtil<Purch> util = new ExcelUtil<Purch>(Purch.class);
        return util.exportExcel(list, "进货管理数据");
    }

    /**
     * 新增进货管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存进货管理
     */
    @RequiresPermissions("system:purch:add")
    @Log(title = "进货管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Purch purch)
    {
        return toAjax(purchService.insertPurch(purch));
    }

    /**
     * 修改进货管理
     */
    @GetMapping("/edit/{purchId}")
    public String edit(@PathVariable("purchId") Long purchId, ModelMap mmap)
    {
        Purch purch = purchService.selectPurchById(purchId);
        mmap.put("purch", purch);
        return prefix + "/edit";
    }

    /**
     * 修改保存进货管理
     */
    @RequiresPermissions("system:purch:edit")
    @Log(title = "进货管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Purch purch)
    {
        return toAjax(purchService.updatePurch(purch));
    }

    /**
     * 删除进货管理
     */
    @RequiresPermissions("system:purch:remove")
    @Log(title = "进货管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purchService.deletePurchByIds(ids));
    }
}
