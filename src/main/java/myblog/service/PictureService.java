package myblog.service;

import myblog.pojo.po.Picture;

import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
public interface PictureService {
    /**
     * 查询照片
     * @return Picture持久对象列表
     */
    List<Picture> getAllPicture();

    /**
     * 添加图片
     * @param picture Picture持久对象
     * @return 操作代码 (0成功,1失败)
     */
    int savePicture(Picture picture);

    /**
     * 根据id查询照片
     * @param id 照片id
     * @return Picture持久对象
     */
    Picture getPicture(Long id);

    /**
     * 修改照片
     * @param picture Picture持久对象
     * @return 操作代码 (0成功,1失败)
     */
    int updatePicture(Picture picture);

    /**
     * 删除照片
     * @param id 照片id
     * @return 操作代码 (0成功,1失败)
     */
    int deletePicture(Long id);
}
