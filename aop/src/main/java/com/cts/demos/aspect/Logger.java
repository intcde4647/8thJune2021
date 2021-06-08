package com.cts.demos.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	// PointCut
	// PointCuts are mapped with an empty 
//	method which is having return type as void
  @Pointcut(value="execution  (* com.cts.demos.model.Student.get*(..))")	
	public void match() {}
	
  
  
  // Before Advice 
     @Before("match()")
    public void beforeAdvice(JoinPoint joinPoint)
    {
         System.out.println("I am called before the get methods are called");  
         System.out.println("The target object is "+joinPoint.getTarget());
    }
    
    /* @After("match()")
    public void afterAdvice(JoinPoint joinPoint)
    {
         System.out.println("I am called after the get methods are called");  	
    } */
  
  /* @AfterReturning(pointcut="match()", returning="retval")
   public void afterReturning(Object retval)
   {
	   System.out.println("The value returned after the method call"+retval);
   }*/
  
 /* @Around("match()")
  public void doAround(ProceedingJoinPoint joinPoint)
  {
	  System.out.println("Before the method is called!!!!!");
	  System.out.println("The object which is target"+joinPoint.getTarget());
	  try {
		String val=(String)joinPoint.proceed();
		System.out.println(val);
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	  System.out.println("after the method is called!!!!!");  
  
  }*/
  
    
}
