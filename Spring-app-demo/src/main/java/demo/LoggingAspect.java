package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeloggers(JoinPoint jp)
    {
        //System.out.println(jp.getSignature());
        String arg=jp.getArgs()[0].toString();
        System.out.println("before loggers with argument" +" "+ arg);
    }

    @After("execution(* *.*.checkout(..))")
    public void afterloggers()
    {

        System.out.println("after loggers");
    }

    @Pointcut("within(* demo.ShoppingCart.quantity(..))")
    public void afterreturningpointcut()
    {

    }

    @AfterReturning(pointcut="afterreturningpointcut()",returning = "retval")
    public void afterreturning(String retval)
    {
        System.out.println("After Returning"+ retval);
    }

}
