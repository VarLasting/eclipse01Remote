package com.ut.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.ut.entity.EnergyCar;
import com.ut.entity.OilCar;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
//		BeanDefinition beanDefinition = new RootBeanDefinition(OilCar.class);
		BeanDefinition beanDefinition1 = new RootBeanDefinition("com.ut.entity.OilCar");
		RootBeanDefinition beanDefinition2 = new RootBeanDefinition(EnergyCar.class);
		registry.registerBeanDefinition("oilCar", beanDefinition1);
		registry.registerBeanDefinition("energyCar", beanDefinition2);
	}

}
