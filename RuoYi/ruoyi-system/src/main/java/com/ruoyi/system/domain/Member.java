package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员管理对象 member
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public class Member extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long memberId;

    /** 会员编号 */
    @Excel(name = "会员编号")
    private String memberNo;

    /** 会员姓名 */
    @Excel(name = "会员姓名")
    private String memberName;

    /** 会员联系方式 */
    @Excel(name = "会员联系方式")
    private String memberNum;

    /** 会员积分 */
    @Excel(name = "会员积分")
    private Long memberScore;

    /** 会员其他信息 */
    @Excel(name = "会员其他信息")
    private String memberInfo;

    public void setMemberId(Long memberId) 
    {
        this.memberId = memberId;
    }

    public Long getMemberId() 
    {
        return memberId;
    }
    public void setMemberNo(String memberNo) 
    {
        this.memberNo = memberNo;
    }

    public String getMemberNo() 
    {
        return memberNo;
    }
    public void setMemberName(String memberName) 
    {
        this.memberName = memberName;
    }

    public String getMemberName() 
    {
        return memberName;
    }
    public void setMemberNum(String memberNum) 
    {
        this.memberNum = memberNum;
    }

    public String getMemberNum() 
    {
        return memberNum;
    }
    public void setMemberScore(Long memberScore) 
    {
        this.memberScore = memberScore;
    }

    public Long getMemberScore() 
    {
        return memberScore;
    }
    public void setMemberInfo(String memberInfo) 
    {
        this.memberInfo = memberInfo;
    }

    public String getMemberInfo() 
    {
        return memberInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("memberId", getMemberId())
            .append("memberNo", getMemberNo())
            .append("memberName", getMemberName())
            .append("memberNum", getMemberNum())
            .append("memberScore", getMemberScore())
            .append("memberInfo", getMemberInfo())
            .toString();
    }
}
