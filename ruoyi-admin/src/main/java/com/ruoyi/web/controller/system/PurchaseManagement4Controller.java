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
import com.ruoyi.system.domain.PurchaseManagement4;
import com.ruoyi.system.service.IPurchaseManagement4Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 进货管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/management4")
public class PurchaseManagement4Controller extends BaseController
{
    private String prefix = "system/management4";

    @Autowired
    private IPurchaseManagement4Service purchaseManagement4Service;

    @RequiresPermissions("system:management4:view")
    @GetMapping()
    public String management4()
    {
        return prefix + "/management4";
    }

    /**
     * 查询进货管理列表
     */
    @RequiresPermissions("system:management4:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PurchaseManagement4 purchaseManagement4)
    {
        startPage();
        List<PurchaseManagement4> list = purchaseManagement4Service.selectPurchaseManagement4List(purchaseManagement4);
        return getDataTable(list);
    }

    /**
     * 导出进货管理列表
     */
    @RequiresPermissions("system:management4:export")
    @Log(title = "进货管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurchaseManagement4 purchaseManagement4)
    {
        List<PurchaseManagement4> list = purchaseManagement4Service.selectPurchaseManagement4List(purchaseManagement4);
        ExcelUtil<PurchaseManagement4> util = new ExcelUtil<PurchaseManagement4>(PurchaseManagement4.class);
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
    @RequiresPermissions("system:management4:add")
    @Log(title = "进货管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PurchaseManagement4 purchaseManagement4)
    {
        return toAjax(purchaseManagement4Service.insertPurchaseManagement4(purchaseManagement4));
    }

    /**
     * 修改进货管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PurchaseManagement4 purchaseManagement4 = purchaseManagement4Service.selectPurchaseManagement4ById(id);
        mmap.put("purchaseManagement4", purchaseManagement4);
        return prefix + "/edit";
    }

    /**
     * 修改保存进货管理
     */
    @RequiresPermissions("system:management4:edit")
    @Log(title = "进货管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PurchaseManagement4 purchaseManagement4)
    {
        return toAjax(purchaseManagement4Service.updatePurchaseManagement4(purchaseManagement4));
    }

    /**
     * 删除进货管理
     */
    @RequiresPermissions("system:management4:remove")
    @Log(title = "进货管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purchaseManagement4Service.deletePurchaseManagement4ByIds(ids));
    }
}
