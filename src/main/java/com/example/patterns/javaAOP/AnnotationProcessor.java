package com.example.patterns.javaAOP;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void runAnnotatedMethods(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecution.class)) {
                long start = System.currentTimeMillis();

                System.out.println("🚀 Starting: " + method.getName());
                method.invoke(obj); // Execute the annotated method
                long end = System.currentTimeMillis();

                System.out.println("✅ Finished: " + method.getName() +
                        " | Execution time: " + (end - start) + " ms");
            }
        }
    }
}
