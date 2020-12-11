package myblog.pojo.mapper.custom;

import myblog.pojo.po.Picture;
import myblog.pojo.po.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/11
 */
@Repository
@Mapper
public interface PictureCustomMapper {
    /**
     * 获取全部图片列表
     * @return 图片列表
     */
    @Select("select id, picturename, picturetime, pictureaddress, picturedescription from t_picture")
    @Results({
            @Result(column = "id", property = "id", id = true)
    })
    List<Picture> selectAllPicture();
}
