package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Member;

/**
 * 会员管理Service接口
 * 
 * @author ruoyi
 * @date 2021-07-13
 */
public interface IMemberService 
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
     * 批量删除会员管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMemberByIds(String ids);

    /**
     * 删除会员管理信息
     * 
     * @param memberId 会员管理ID
     * @return 结果
     */
    public int deleteMemberById(Long memberId);
}
