// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.reflect.Field;

public interface FieldSignature extends MemberSignature
{
    Field getField();
    
    Class getFieldType();
}
