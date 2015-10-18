// 
// Decompiled by Procyon v0.5.30
// 

package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Target({ ElementType.FIELD })
public @interface RequiresPermission$Write {
    RequiresPermission value();
}
