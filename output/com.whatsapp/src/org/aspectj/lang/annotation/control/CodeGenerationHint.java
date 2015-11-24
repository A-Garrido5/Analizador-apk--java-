// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.annotation.control;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.METHOD })
public @interface CodeGenerationHint {
    String ifNameSuffix() default "";
}
