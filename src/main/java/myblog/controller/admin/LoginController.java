package myblog.controller.admin;

import myblog.pojo.po.User;
import myblog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 孙柳烨
 * @date 2020/12/11
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Resource
    UserService userService;

    /**
     * 跳转登录页面
     * @return 登录页面
     */
    @GetMapping()
    public String loginPage(){
        return "admin/login";
    }

    /**
     * 登录校验
     * @param username 用户名
     * @param password 密码
     * @param session session域
     * @param attributes 返回页面消息
     * @return 登录成功跳转登录成功页面，登录失败重定向返回登录页面
     */
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes) {
        User user = userService.checkUser(username, password);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user",user);
            return "admin/index";
        } else {
            attributes.addFlashAttribute("message", "用户名和密码错误");
            return "redirect:/admin";
        }
    }

    /**
     * @param session:session域
     * @return 重定向返回登录页面
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}
