package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); // Never explicitly created this object via new MyController();, due to IoC Spring is handling the construction of this object

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
