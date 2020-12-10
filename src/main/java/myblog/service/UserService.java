package myblog.service;

import myblog.pojo.po.User;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
public interface UserService {
    /**
     * 核对用户名密码
     * @param username 用户名
     * @param password 密码
     * @return User持久对象
     */
    User checkUser(String username, String password);
}
