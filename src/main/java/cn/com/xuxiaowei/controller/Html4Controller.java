package cn.com.xuxiaowei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HTML 4 页面
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Controller
public class Html4Controller {

    /**
     * HTML 4 页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @param page     HTML 4 页面名
     * @return 返回 HTML 4 页面的位置
     */
    @RequestMapping("/html4/{page}")
    public String html4(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("page") String page) {

        return "html4/" + page;
    }

    /**
     * HTML 4 window 相关页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @param page     HTML 4 window 相关页面
     * @return 返回 HTML 4 window 相关页面
     */
    @RequestMapping("/html4/window/{page}")
    public String html4Window(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("page") String page) {

        return "html4/window/" + page;
    }

}
