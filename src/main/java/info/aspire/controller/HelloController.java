package info.aspire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * 
 * @author yeyanrong
 *
 */
@RestController
public class HelloController {

	//方法一：读取核心配置文件内容
/*	@Autowired
	private Environment environment;

	@GetMapping("/hello")
	public String hello() {
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));

		return "Hello world";
	}*/

	//方法二：只需要是一个@value注解即可获取核心配置文件内容
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;

	@GetMapping("/hello")
	public String hello() {
		System.out.println(name);
		System.out.println(url);
		return "Hello world02";
	}
}
