package spring2.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectA {

    Logger logger = Logger.getLogger(AspectA.class);

    @Before("execution(* getBook*(..))")
    public void BeforeGettingBook(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }
}
