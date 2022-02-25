package com.ut.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[]{"com.ut.entity.OilCar","com.ut.entity.EnergyCar"};
	}

}
