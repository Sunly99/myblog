package myblog.pojo.po.custom;

import lombok.Data;
import myblog.pojo.vo.BlogVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Data
public class CommentCustom {
    private Long id;
    private String nickname;
    private String email;
    private String avatar;
    private String content;

    private Date createTime;

    private Long blogId;
    private Long parentCommentId;
    private String parentNickname;

    private List<CommentCustom> replyComments = new ArrayList<>();

    private CommentCustom parentComment;
    private Boolean adminId;

    private BlogVO blog;
}
