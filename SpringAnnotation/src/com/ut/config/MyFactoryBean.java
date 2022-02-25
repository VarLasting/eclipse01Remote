package com.ut.config;

import org.springframework.beans.factory.FactoryBean;

import com.ut.entity.OilCar;

public class MyFactoryBean implements FactoryBean<OilCar>{

	
	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return OilCar.class;
	}

	@Override
	public boolean isSingleton() {
		// true µ¥Àý  false  Ô­ÐÍ
		return true;
	}

	@Override
	public OilCar getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Oil----");
		return new OilCar();
	}

}
