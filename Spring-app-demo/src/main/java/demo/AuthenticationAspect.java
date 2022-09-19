package demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect
{
    @Pointcut("within(demo..*)")
    public void authenticatingpointcut()
    {

    }
    @Pointcut("within(demo..*)")
    public void authorizationpointcut()
    {

    }

    @Before(" authenticatingpointcut() && authorizationpointcut()")
    public void authenticate()
    {
        System.out.println("Authenticating the request");
    }



}

