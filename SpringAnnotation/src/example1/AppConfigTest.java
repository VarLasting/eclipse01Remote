package example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {
	 public static void main(String[] arg) {
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//	        ctx.register(AppConfig.class);
//	        ctx.refresh();

	        Entitlement ent0 = (Entitlement)ctx.getBean("example1.Entitlement");
	        System.out.println(ent0);
	        
	        Entitlement ent = (Entitlement)ctx.getBean("entitlement3");
	        System.out.println(ent.getName());
	        System.out.println(ent.getTime());

//	        Entitlement ent2 = (Entitlement)ctx.getBean("entitlement2");
//	        System.out.println(ent2.getName());
//	        System.out.println(ent2.getTime());

	        ctx.close();
	    }

}
