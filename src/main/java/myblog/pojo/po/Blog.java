package myblog.pojo.po;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_blog
 */
public class Blog {
    /**
     * Database Column Remarks:
     *   博客id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   首图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.first_picture
     *
     * @mbg.generated
     */
    private String firstPicture;

    /**
     * Database Column Remarks:
     *   标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.flag
     *
     * @mbg.generated
     */
    private String flag;

    /**
     * Database Column Remarks:
     *   浏览次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.views_count
     *
     * @mbg.generated
     */
    private Integer viewsCount;

    /**
     * Database Column Remarks:
     *   赞赏开启
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.appreciation
     *
     * @mbg.generated
     */
    private Boolean appreciation;

    /**
     * Database Column Remarks:
     *   版权开启
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.share_statement
     *
     * @mbg.generated
     */
    private Boolean shareStatement;

    /**
     * Database Column Remarks:
     *   是否发布
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.published
     *
     * @mbg.generated
     */
    private Boolean published;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   评论开启
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.commentabled
     *
     * @mbg.generated
     */
    private Boolean commentabled;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   是否推荐
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.recommend
     *
     * @mbg.generated
     */
    private Boolean recommend;

    /**
     * Database Column Remarks:
     *   分类id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.type_id
     *
     * @mbg.generated
     */
    private Long typeId;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   评论数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.comment_count
     *
     * @mbg.generated
     */
    private Integer commentCount;

    /**
     * Database Column Remarks:
     *   内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blog.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.id
     *
     * @return the value of t_blog.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.id
     *
     * @param id the value for t_blog.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.title
     *
     * @return the value of t_blog.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.title
     *
     * @param title the value for t_blog.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.first_picture
     *
     * @return the value of t_blog.first_picture
     *
     * @mbg.generated
     */
    public String getFirstPicture() {
        return firstPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.first_picture
     *
     * @param firstPicture the value for t_blog.first_picture
     *
     * @mbg.generated
     */
    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.flag
     *
     * @return the value of t_blog.flag
     *
     * @mbg.generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.flag
     *
     * @param flag the value for t_blog.flag
     *
     * @mbg.generated
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.views_count
     *
     * @return the value of t_blog.views_count
     *
     * @mbg.generated
     */
    public Integer getViewsCount() {
        return viewsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.views_count
     *
     * @param viewsCount the value for t_blog.views_count
     *
     * @mbg.generated
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.appreciation
     *
     * @return the value of t_blog.appreciation
     *
     * @mbg.generated
     */
    public Boolean getAppreciation() {
        return appreciation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.appreciation
     *
     * @param appreciation the value for t_blog.appreciation
     *
     * @mbg.generated
     */
    public void setAppreciation(Boolean appreciation) {
        this.appreciation = appreciation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.share_statement
     *
     * @return the value of t_blog.share_statement
     *
     * @mbg.generated
     */
    public Boolean getShareStatement() {
        return shareStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.share_statement
     *
     * @param shareStatement the value for t_blog.share_statement
     *
     * @mbg.generated
     */
    public void setShareStatement(Boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.published
     *
     * @return the value of t_blog.published
     *
     * @mbg.generated
     */
    public Boolean getPublished() {
        return published;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.published
     *
     * @param published the value for t_blog.published
     *
     * @mbg.generated
     */
    public void setPublished(Boolean published) {
        this.published = published;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.create_time
     *
     * @return the value of t_blog.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.create_time
     *
     * @param createTime the value for t_blog.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.update_time
     *
     * @return the value of t_blog.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.update_time
     *
     * @param updateTime the value for t_blog.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.commentabled
     *
     * @return the value of t_blog.commentabled
     *
     * @mbg.generated
     */
    public Boolean getCommentabled() {
        return commentabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.commentabled
     *
     * @param commentabled the value for t_blog.commentabled
     *
     * @mbg.generated
     */
    public void setCommentabled(Boolean commentabled) {
        this.commentabled = commentabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.description
     *
     * @return the value of t_blog.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.description
     *
     * @param description the value for t_blog.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.recommend
     *
     * @return the value of t_blog.recommend
     *
     * @mbg.generated
     */
    public Boolean getRecommend() {
        return recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.recommend
     *
     * @param recommend the value for t_blog.recommend
     *
     * @mbg.generated
     */
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.type_id
     *
     * @return the value of t_blog.type_id
     *
     * @mbg.generated
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.type_id
     *
     * @param typeId the value for t_blog.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.user_id
     *
     * @return the value of t_blog.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.user_id
     *
     * @param userId the value for t_blog.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.comment_count
     *
     * @return the value of t_blog.comment_count
     *
     * @mbg.generated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.comment_count
     *
     * @param commentCount the value for t_blog.comment_count
     *
     * @mbg.generated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.content
     *
     * @return the value of t_blog.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.content
     *
     * @param content the value for t_blog.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }
}