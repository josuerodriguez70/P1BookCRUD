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

    @Before("execution(* postBook*(..))")
    public void BeforePostingBook(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }

    @Before("execution(* postAuthor*(..))")
    public void BeforePostingAuthor(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }

    @Before("execution(* getAuthor*(..))")
    public void BeforeGettingAuthor(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }

    @Before("execution(* updatePrice*(..))")
    public void BeforeUpdatePrice(JoinPoint joinPoint) {logger.info(joinPoint.getSignature());}

    @Before("execution(* deleteBook*(..))")
    public void BeforeDeleteBook(JoinPoint joinPoint) {logger.info(joinPoint.getSignature());}

    @Before("execution(* deleteAuthor*(..))")
    public void BeforeDeleteAuthor(JoinPoint joinPoint) {logger.info(joinPoint.getSignature());}
}
