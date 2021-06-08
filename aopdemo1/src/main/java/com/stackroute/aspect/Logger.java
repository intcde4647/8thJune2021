package com.stackroute.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component 
public class Logger {

	
	@Pointcut(value="execution(* com.stackroute.model.Student.get*(..))") 
	public void a(){}
	 
	 @Before("a()")
	public void beforeAdvice(JoinPoint jointPoint)
	{
		
		System.out.println("Before called  "+jointPoint.getSignature());
	}
	/* @After("a()")
	public void afterAdvice(JoinPoint jointPoint)
	{
		System.out.println("After");
	} */
	 
	  @AfterReturning(pointcut = "a()", returning = "retVal") public void
	  doAfterReturnningTask(Object retVal) { System.out.println(retVal);
	  
	  }
	 
	
/* @Around("a()")
	public void doAroundTask(ProceedingJoinPoint jointPoint) {
		{
			System.out.println("Before the method got called Called");
		   System.out.println("The object which got targeted  "+jointPoint.getTarget());
			System.out.println("The method which was being adviced "+jointPoint.getSignature().getName());
			
				Object obj=null;
				try {
					obj = jointPoint.proceed();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				System.out.println("After the get method is called"+obj);
			
		} 
	   
		
	} */
	   
	
/*	@AfterThrowing(pointcut = "a()", throwing = "ex")
	   public void AfterThrowingAdvice(ArithmeticException ex){
	      System.out.println("There has been an exception: " + ex.toString());   
	   } */ 

}
