package myblog.service.impl;

import myblog.pojo.mapper.PictureMapper;
import myblog.pojo.mapper.custom.PictureCustomMapper;
import myblog.pojo.po.Picture;
import myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/11
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Resource
    PictureMapper pictureMapper;

    @Resource
    PictureCustomMapper pictureCustomMapper;

    @Override
    public List<Picture> getAllPicture() {
        return  pictureCustomMapper.selectAllPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        try {
            pictureMapper.insertSelective(picture);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }

    @Override
    public Picture getPicture(Long id) {
            return pictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        try {
            pictureMapper.updateByPrimaryKey(picture);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }

    @Override
    public int deletePicture(Long id) {
        try {
            pictureMapper.deleteByPrimaryKey(id);
            // 此处成功
            return 0;
        }catch (Exception e){
            // 此处失败
            return 1;
        }
    }
}
