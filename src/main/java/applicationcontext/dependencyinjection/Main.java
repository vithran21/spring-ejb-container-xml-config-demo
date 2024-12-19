package applicationcontext.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("EjbXmlBeanConfiguration.xml");
		System.out.println(con.getBean(Jspiders.class));
	}

}
