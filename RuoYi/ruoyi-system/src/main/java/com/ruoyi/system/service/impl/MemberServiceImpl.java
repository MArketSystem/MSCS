package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MemberMapper;
import com.ruoyi.system.domain.Member;
import com.ruoyi.system.service.IMemberService;
import com.ruoyi.common.core.text.Convert;

/**
 * 会员管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
@Service
public class MemberServiceImpl implements IMemberService 
{
    @Autowired
    private MemberMapper memberMapper;

    /**
     * 查询会员管理
     * 
     * @param memberId 会员管理ID
     * @return 会员管理
     */
    @Override
    public Member selectMemberById(Long memberId)
    {
        return memberMapper.selectMemberById(memberId);
    }

    /**
     * 查询会员管理列表
     * 
     * @param member 会员管理
     * @return 会员管理
     */
    @Override
    public List<Member> selectMemberList(Member member)
    {
        return memberMapper.selectMemberList(member);
    }

    /**
     * 新增会员管理
     * 
     * @param member 会员管理
     * @return 结果
     */
    @Override
    public int insertMember(Member member)
    {
        return memberMapper.insertMember(member);
    }

    /**
     * 修改会员管理
     * 
     * @param member 会员管理
     * @return 结果
     */
    @Override
    public int updateMember(Member member)
    {
        return memberMapper.updateMember(member);
    }

    /**
     * 删除会员管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMemberByIds(String ids)
    {
        return memberMapper.deleteMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员管理信息
     * 
     * @param memberId 会员管理ID
     * @return 结果
     */
    @Override
    public int deleteMemberById(Long memberId)
    {
        return memberMapper.deleteMemberById(memberId);
    }
}
