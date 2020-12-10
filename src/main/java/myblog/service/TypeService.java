package myblog.service;

import myblog.pojo.po.Type;
import myblog.pojo.po.custom.TypeCustom;

import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
public interface TypeService {
    /**
     * 保存类型
     * @param type Type实体类
     * @return 操作代码 (0成功,1失败)
     */
    int setType(Type type);

    /**
     * 通过类型id获取类型
     * @param id 类型id
     * @return Type实体类
     */
    Type getType(Long id);

    /**
     * 获取所有类型
     * @return Type实体类列表
     */
    List<TypeCustom> getAllType();

    /**
     * 获取所有类型相关的博客
     * @return Type实体类列表
     */
    List<TypeCustom>getAllTypeAndBlog();

    /**
     * 通过类型名称获取类型
     * @param name 类型名称
     * @return Type实体类
     */
    Type getTypeByName(String name);

    /**
     * 修改类型
     * @param type Type实体类
     * @return 操作代码 (0成功,1失败)
     */
    int updateType(Type type);

    /**
     * 删除类型
     * @param id 类型id
     * @return 操作代码 (0成功,1失败)
     */
    int deleteType(Long id);
}
