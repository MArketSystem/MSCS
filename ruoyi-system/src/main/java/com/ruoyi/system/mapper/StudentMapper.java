package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * 学生表Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-02
 */
public interface StudentMapper 
{
    /**
     * 查询学生表
     * 
     * @param id 学生表ID
     * @return 学生表
     */
    public Student selectStudentById(String id);

    /**
     * 查询学生表列表
     * 
     * @param student 学生表
     * @return 学生表集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生表
     * 
     * @param id 学生表ID
     * @return 结果
     */
    public int deleteStudentById(String id);

    /**
     * 批量删除学生表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(String[] ids);
}
