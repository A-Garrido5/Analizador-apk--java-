// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface AfterReturning {
    String argNames() default "";
    
    String pointcut() default "";
    
    String returning() default "";
    
    String value() default "";
}
