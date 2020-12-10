package myblog.pojo.po.custom;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Data
public class BlogCustom {

    private Long id;
    private String title;
    private String firstPicture;
    private String flag;
    private String description;
    private String content;

    private Boolean appreciation;
    private Boolean shareStatement;
    private Boolean published;
    private Boolean commentable;
    private Boolean recommend;

    private Date createTime;
    private Date updateTime;

    private Long typeId;
    private Long userId;

    private Integer viewsCount;
    private Integer commentCount;

    private List<CommentCustom> comments = new ArrayList<>();
}
