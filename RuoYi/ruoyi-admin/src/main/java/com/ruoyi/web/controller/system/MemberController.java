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
import com.ruoyi.system.domain.Member;
import com.ruoyi.system.service.IMemberService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Controller
@RequestMapping("/system/member")
public class MemberController extends BaseController
{
    private String prefix = "system/member";

    @Autowired
    private IMemberService memberService;

    @RequiresPermissions("system:member:view")
    @GetMapping()
    public String member()
    {
        return prefix + "/member";
    }

    /**
     * 查询会员管理列表
     */
    @RequiresPermissions("system:member:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Member member)
    {
        startPage();
        List<Member> list = memberService.selectMemberList(member);
        return getDataTable(list);
    }

    /**
     * 导出会员管理列表
     */
    @RequiresPermissions("system:member:export")
    @Log(title = "会员管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Member member)
    {
        List<Member> list = memberService.selectMemberList(member);
        ExcelUtil<Member> util = new ExcelUtil<Member>(Member.class);
        return util.exportExcel(list, "会员管理数据");
    }

    /**
     * 新增会员管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会员管理
     */
    @RequiresPermissions("system:member:add")
    @Log(title = "会员管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Member member)
    {
        return toAjax(memberService.insertMember(member));
    }

    /**
     * 修改会员管理
     */
    @GetMapping("/edit/{memberId}")
    public String edit(@PathVariable("memberId") Long memberId, ModelMap mmap)
    {
        Member member = memberService.selectMemberById(memberId);
        mmap.put("member", member);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员管理
     */
    @RequiresPermissions("system:member:edit")
    @Log(title = "会员管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Member member)
    {
        return toAjax(memberService.updateMember(member));
    }

    /**
     * 删除会员管理
     */
    @RequiresPermissions("system:member:remove")
    @Log(title = "会员管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(memberService.deleteMemberByIds(ids));
    }
}
