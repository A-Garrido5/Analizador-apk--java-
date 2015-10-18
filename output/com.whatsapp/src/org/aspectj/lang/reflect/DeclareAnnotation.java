// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.annotation.Annotation;

public interface DeclareAnnotation
{
    Annotation getAnnotation();
    
    String getAnnotationAsText();
    
    AjType<?> getDeclaringType();
    
    Kind getKind();
    
    SignaturePattern getSignaturePattern();
    
    TypePattern getTypePattern();
    
    public enum Kind
    {
        Constructor, 
        Field, 
        Method, 
        Type;
    }
}
