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
import com.ruoyi.system.domain.InventoryManage2;
import com.ruoyi.system.service.IInventoryManage2Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/manage2")
public class InventoryManage2Controller extends BaseController
{
    private String prefix = "system/manage2";

    @Autowired
    private IInventoryManage2Service inventoryManage2Service;

    @RequiresPermissions("system:manage2:view")
    @GetMapping()
    public String manage2()
    {
        return prefix + "/manage2";
    }

    /**
     * 查询库存管理列表
     */
    @RequiresPermissions("system:manage2:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InventoryManage2 inventoryManage2)
    {
        startPage();
        List<InventoryManage2> list = inventoryManage2Service.selectInventoryManage2List(inventoryManage2);
        return getDataTable(list);
    }

    /**
     * 导出库存管理列表
     */
    @RequiresPermissions("system:manage2:export")
    @Log(title = "库存管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InventoryManage2 inventoryManage2)
    {
        List<InventoryManage2> list = inventoryManage2Service.selectInventoryManage2List(inventoryManage2);
        ExcelUtil<InventoryManage2> util = new ExcelUtil<InventoryManage2>(InventoryManage2.class);
        return util.exportExcel(list, "库存管理数据");
    }

    /**
     * 新增库存管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存管理
     */
    @RequiresPermissions("system:manage2:add")
    @Log(title = "库存管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InventoryManage2 inventoryManage2)
    {
        return toAjax(inventoryManage2Service.insertInventoryManage2(inventoryManage2));
    }

    /**
     * 修改库存管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InventoryManage2 inventoryManage2 = inventoryManage2Service.selectInventoryManage2ById(id);
        mmap.put("inventoryManage2", inventoryManage2);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存管理
     */
    @RequiresPermissions("system:manage2:edit")
    @Log(title = "库存管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InventoryManage2 inventoryManage2)
    {
        return toAjax(inventoryManage2Service.updateInventoryManage2(inventoryManage2));
    }

    /**
     * 删除库存管理
     */
    @RequiresPermissions("system:manage2:remove")
    @Log(title = "库存管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(inventoryManage2Service.deleteInventoryManage2ByIds(ids));
    }
}
