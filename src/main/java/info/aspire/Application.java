package info.aspire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

/**
 * springboot的启动类
 * @author yeyanrong
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//含广告
		//SpringApplication.run(Application.class, args);
		
		//无广告
		/** 创建SpringApplication应用对象 */
		/*SpringApplication springApplication = new SpringApplication(Application.class);
		*//** 设置横幅模式(设置关闭) *//*
		springApplication.setBannerMode(Banner.Mode.OFF);
		*//** 运行 *//*
		springApplication.run(args);*/
		
		StopWatch watch = new StopWatch();//将运行时间属性设置为零,然后开始测量运行时间。 
		watch.start();

		SpringApplication.run(Application.class, args);
	}
}
