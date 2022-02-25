package example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Entitlement.class})
public class AppConfig {
//	@Bean(name="entitlement")
	@Bean
    public Entitlement entitlement3() {
        Entitlement ent= new Entitlement();
        ent.setName("Entitlement");
        ent.setTime(1);
        return ent;
    }

    //@Bean(name="entitlement2")
    public Entitlement entitlement2() {
        Entitlement ent= new Entitlement();
        ent.setName("Entitlement2");
        ent.setTime(2);
        return ent;
    }

}
