package myblog.service.impl;

import myblog.pojo.mapper.UserMapper;
import myblog.pojo.po.User;
import myblog.pojo.po.UserExample;
import myblog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        User user = userMapper.selectByExample(userExample).get(0);
        if (password.equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
