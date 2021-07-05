package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentMapper;
import com.ruoyi.system.domain.Student;
import com.ruoyi.system.service.IStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生表Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-02
 */
@Service
public class StudentServiceImpl implements IStudentService 
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生表
     * 
     * @param id 学生表ID
     * @return 学生表
     */
    @Override
    public Student selectStudentById(String id)
    {
        return studentMapper.selectStudentById(id);
    }

    /**
     * 查询学生表列表
     * 
     * @param student 学生表
     * @return 学生表
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改学生表
     * 
     * @param student 学生表
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        return studentMapper.updateStudent(student);
    }

    /**
     * 删除学生表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudentByIds(String ids)
    {
        return studentMapper.deleteStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生表信息
     * 
     * @param id 学生表ID
     * @return 结果
     */
    @Override
    public int deleteStudentById(String id)
    {
        return studentMapper.deleteStudentById(id);
    }
}
