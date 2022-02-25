package com.ut.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OilCarCondition implements Condition{

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata arg1) {
		// TODO Auto-generated method stub
		Environment environment = conditionContext.getEnvironment();
		String property = environment.getProperty("car.type");
		if(property.contains("oil")){
			return true;
		}
		return false;
	}

}
