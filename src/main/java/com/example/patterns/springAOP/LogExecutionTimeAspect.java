package com.example.patterns.springAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionTimeAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogExecutionTimeAspect.class);

    @Around("@annotation(com.example.patterns.springAOP.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().toShortString();

        logger.info("🚀 Starting execution of method: {}", methodName);

        Object result = joinPoint.proceed(); // Execute the actual method

        long end = System.currentTimeMillis();
        logger.info("✅ Finished execution of method: {} | Time taken: {} ms", methodName, (end - start));

        return result;
    }
}
