package com.ut.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ut.condition.EnergyCarCondition;
import com.ut.condition.OilCarCondition;
import com.ut.entity.EnergyCar;
import com.ut.entity.OilCar;

@Configuration
//@Import(value = {OilCar.class,EnergyCar.class})
//@Import({MyImportBeanDefinitionRegistrar.class})
//@Import(MyImportSelector.class)
public class MyConfig {
//	@Bean
//	@Conditional(OilCarCondition.class)
//	public OilCar oilCar(){
//		return new OilCar();
//	}
	
//	@Bean
//	@Conditional(EnergyCarCondition.class)
//	public EnergyCar energyCar(){
//		return new EnergyCar();
//	}
	
	@Bean
	public FactoryBean<OilCar> myFactoryBean(){
		System.out.println("factoryBean-----");
		return new MyFactoryBean();
		
	}
}
