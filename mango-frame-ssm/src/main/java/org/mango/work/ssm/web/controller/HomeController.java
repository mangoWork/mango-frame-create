package org.mango.work.ssm.web.controller;

import org.mango.work.ssm.web.utils.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 戴礼明 on 2017/6/4.
 * 主页设置
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/")
	public void home(HttpServletRequest request, HttpServletResponse response){
		try {
			request.getRequestDispatcher(Constant.INDEX_PATH).forward(request,response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
