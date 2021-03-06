package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		/*I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("----- Primary Injection");
		MyController myController = (MyController) ctx.getBean("myController"); // Never explicitly created this object via new MyController();, due to IoC Spring is handling the construction of this object
		System.out.println(myController.sayHello());

		System.out.println("----- Property Injection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter Injection");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor Injection");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());*/

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println("fakeDataSource - username = " + fakeDataSource.getUser());
		System.out.println("fakeDataSource - passwprd = " + fakeDataSource.getPassword());
		System.out.println("fakeDataSource - dburl = " + fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println("fakeJmsBroker - username = " + fakeJmsBroker.getUser());
		System.out.println("fakeJmsBroker - passwprd = " + fakeJmsBroker.getPassword());
		System.out.println("fakeJmsBroker - dburl = " + fakeJmsBroker.getUrl());
	}

}
