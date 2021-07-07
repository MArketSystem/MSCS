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
import com.ruoyi.system.domain.GoodsManage1;
import com.ruoyi.system.service.IGoodsManage1Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-07
 */
@Controller
@RequestMapping("/system/manage1")
public class GoodsManage1Controller extends BaseController
{
    private String prefix = "system/manage1";

    @Autowired
    private IGoodsManage1Service goodsManage1Service;

    @RequiresPermissions("system:manage1:view")
    @GetMapping()
    public String manage1()
    {
        return prefix + "/manage1";
    }

    /**
     * 查询商品管理列表
     */
    @RequiresPermissions("system:manage1:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GoodsManage1 goodsManage1)
    {
        startPage();
        List<GoodsManage1> list = goodsManage1Service.selectGoodsManage1List(goodsManage1);
        return getDataTable(list);
    }

    /**
     * 导出商品管理列表
     */
    @RequiresPermissions("system:manage1:export")
    @Log(title = "商品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GoodsManage1 goodsManage1)
    {
        List<GoodsManage1> list = goodsManage1Service.selectGoodsManage1List(goodsManage1);
        ExcelUtil<GoodsManage1> util = new ExcelUtil<GoodsManage1>(GoodsManage1.class);
        return util.exportExcel(list, "商品管理数据");
    }

    /**
     * 新增商品管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品管理
     */
    @RequiresPermissions("system:manage1:add")
    @Log(title = "商品管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GoodsManage1 goodsManage1)
    {
        return toAjax(goodsManage1Service.insertGoodsManage1(goodsManage1));
    }

    /**
     * 修改商品管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GoodsManage1 goodsManage1 = goodsManage1Service.selectGoodsManage1ById(id);
        mmap.put("goodsManage1", goodsManage1);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品管理
     */
    @RequiresPermissions("system:manage1:edit")
    @Log(title = "商品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GoodsManage1 goodsManage1)
    {
        return toAjax(goodsManage1Service.updateGoodsManage1(goodsManage1));
    }

    /**
     * 删除商品管理
     */
    @RequiresPermissions("system:manage1:remove")
    @Log(title = "商品管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(goodsManage1Service.deleteGoodsManage1ByIds(ids));
    }
}
