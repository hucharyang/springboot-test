package net.wanho.mapper;



import net.wanho.po.Student;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Model record);

    int insertSelective(Model record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}