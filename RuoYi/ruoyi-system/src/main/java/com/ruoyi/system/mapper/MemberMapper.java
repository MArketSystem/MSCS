package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Member;

/**
 * 会员管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface MemberMapper 
{
    /**
     * 查询会员管理
     * 
     * @param memberId 会员管理ID
     * @return 会员管理
     */
    public Member selectMemberById(Long memberId);

    /**
     * 查询会员管理列表
     * 
     * @param member 会员管理
     * @return 会员管理集合
     */
    public List<Member> selectMemberList(Member member);

    /**
     * 新增会员管理
     * 
     * @param member 会员管理
     * @return 结果
     */
    public int insertMember(Member member);

    /**
     * 修改会员管理
     * 
     * @param member 会员管理
     * @return 结果
     */
    public int updateMember(Member member);

    /**
     * 删除会员管理
     * 
     * @param memberId 会员管理ID
     * @return 结果
     */
    public int deleteMemberById(Long memberId);

    /**
     * 批量删除会员管理
     * 
     * @param memberIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMemberByIds(String[] memberIds);
}
