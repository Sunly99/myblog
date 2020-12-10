package myblog.pojo.po;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_message
 */
public class Message {
    /**
     * Database Column Remarks:
     *   留言id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   头像
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.avatar
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     * Database Column Remarks:
     *   留言内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   父留言id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.parent_message_id
     *
     * @mbg.generated
     */
    private Long parentMessageId;

    /**
     * Database Column Remarks:
     *   管理员id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.admin_id
     *
     * @mbg.generated
     */
    private Boolean adminId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.id
     *
     * @return the value of t_message.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.id
     *
     * @param id the value for t_message.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.nickname
     *
     * @return the value of t_message.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.nickname
     *
     * @param nickname the value for t_message.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.email
     *
     * @return the value of t_message.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.email
     *
     * @param email the value for t_message.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.avatar
     *
     * @return the value of t_message.avatar
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.avatar
     *
     * @param avatar the value for t_message.avatar
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.content
     *
     * @return the value of t_message.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.content
     *
     * @param content the value for t_message.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.create_time
     *
     * @return the value of t_message.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.create_time
     *
     * @param createTime the value for t_message.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.parent_message_id
     *
     * @return the value of t_message.parent_message_id
     *
     * @mbg.generated
     */
    public Long getParentMessageId() {
        return parentMessageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.parent_message_id
     *
     * @param parentMessageId the value for t_message.parent_message_id
     *
     * @mbg.generated
     */
    public void setParentMessageId(Long parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.admin_id
     *
     * @return the value of t_message.admin_id
     *
     * @mbg.generated
     */
    public Boolean getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.admin_id
     *
     * @param adminId the value for t_message.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Boolean adminId) {
        this.adminId = adminId;
    }
}