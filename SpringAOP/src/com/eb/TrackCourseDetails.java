package com.eb;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCourseDetails {
	
	@Pointcut("execution(* Course.getName(..))")
	
	public void selectGetName() {};
	
	@Before("selectGetName()")
	
	public void breakm() {
		System.out.println("break time");
	}
	
}
