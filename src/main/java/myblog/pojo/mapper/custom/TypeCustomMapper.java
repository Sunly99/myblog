package myblog.pojo.mapper.custom;

import myblog.pojo.po.Type;
import myblog.pojo.po.custom.TypeCustom;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Repository
public interface TypeCustomMapper {

    /**
     * 获取全部类型列表
     * @return 类型列表
     */
    @Select("select id, name from t_type")
    @Results({
            @Result(column = "id", property = "id", id = true)
    })
    List<Type> selectAllType();

    /**
     * 获取全部类型列表和博客
     * @return 类型列表
     */
    @Select("select t.id, t.name, b.id, b.title, b.type_id from t_type t,t_blog b where t.id = b.type_id")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "type_id", property = "typeId"),
    })
    List<TypeCustom> selectAllTypeAndBlog();

}
