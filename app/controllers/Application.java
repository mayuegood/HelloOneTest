package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	// action方法，此方法响应请求，并返回请求页面
	public static void sayhello() {
		String message = "Hello World!";
		// 设置属性
		renderArgs.put("message", message);
		// 返回页面
		render("/Application/index.html");
	}

	public static void Userone() {
		User user = new User();
		// 返回页面
		render();
	}
}