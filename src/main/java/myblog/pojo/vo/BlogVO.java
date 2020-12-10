package myblog.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Data
public class BlogVO {
    private Long id;
    private String title;
    private String firstPicture;
    private String flag;
    private String content;

    private Boolean appreciation;
    private Boolean commentable;
    private Boolean shareStatement;

    private String nickname;
    private String avatar;

    private Date updateTime;

    private Integer viewsCount;
    private Integer commentCount;

    private String typeName;
}
