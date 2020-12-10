package myblog.service.impl;

import myblog.pojo.mapper.TypeMapper;
import myblog.pojo.mapper.custom.TypeCustomMapper;
import myblog.pojo.po.Type;
import myblog.pojo.po.TypeExample;
import myblog.pojo.po.custom.TypeCustom;
import myblog.service.TypeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Resource
    private TypeCustomMapper typeCustomMapper;

    @Override
    public int setType(Type type) {
        try {
            typeMapper.insertSelective(type);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }

    @Override
    public Type getType(Long id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Type> getAllType() {
        return typeCustomMapper.selectAllType();
    }

    @Override
    public List<TypeCustom> getAllTypeAndBlog() {
        return typeCustomMapper.selectAllTypeAndBlog();
    }

    @Override
    public Type getTypeByName(String name) {
        TypeExample typeExample = new TypeExample();
        typeExample.createCriteria().andNameEqualTo(name);
        return typeMapper.selectByExample(typeExample).get(0);
    }

    @Override
    public int updateType(Type type) {
        try {
            typeMapper.updateByPrimaryKey(type);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }

    @Override
    public int deleteType(Long id) {
        try {
            typeMapper.deleteByPrimaryKey(id);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }
}
