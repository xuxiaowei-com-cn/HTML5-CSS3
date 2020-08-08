package cn.com.xuxiaowei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HTML 5 页面
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Controller
public class Html5Controller {

    /**
     * HTML 5 页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @param page     HTML 5 页面名
     * @return 返回 HTML 5 页面的位置
     */
    @RequestMapping("/html5/{page}")
    public String html5(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("page") String page) {

        return "html5/" + page;
    }

    /**
     * HTML 5 window 相关页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面中的值
     * @param page     HTML 5 window 相关页面
     * @return 返回 HTML 5 window 相关页面
     */
    @RequestMapping("/html5/window/{page}")
    public String html5Window(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("page") String page) {

        return "html5/window/" + page;
    }

}
