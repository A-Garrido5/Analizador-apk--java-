// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.TypePattern;
import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.SignaturePattern;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareAnnotation;

public class DeclareAnnotationImpl implements DeclareAnnotation
{
    private String annText;
    private AjType<?> declaringType;
    private Kind kind;
    private SignaturePattern signaturePattern;
    private Annotation theAnnotation;
    private TypePattern typePattern;
    
    public DeclareAnnotationImpl(final AjType<?> declaringType, final String s, final String s2, final Annotation theAnnotation, final String annText) {
        this.declaringType = declaringType;
        if (s.equals("at_type")) {
            this.kind = Kind.Type;
        }
        else if (s.equals("at_field")) {
            this.kind = Kind.Field;
        }
        else if (s.equals("at_method")) {
            this.kind = Kind.Method;
        }
        else {
            if (!s.equals("at_constructor")) {
                throw new IllegalStateException("Unknown declare annotation kind: " + s);
            }
            this.kind = Kind.Constructor;
        }
        if (this.kind == Kind.Type) {
            this.typePattern = new TypePatternImpl(s2);
        }
        else {
            this.signaturePattern = new SignaturePatternImpl(s2);
        }
        this.theAnnotation = theAnnotation;
        this.annText = annText;
    }
    
    @Override
    public Annotation getAnnotation() {
        return this.theAnnotation;
    }
    
    @Override
    public String getAnnotationAsText() {
        return this.annText;
    }
    
    @Override
    public AjType<?> getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public Kind getKind() {
        return this.kind;
    }
    
    @Override
    public SignaturePattern getSignaturePattern() {
        return this.signaturePattern;
    }
    
    @Override
    public TypePattern getTypePattern() {
        return this.typePattern;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("declare @");
        switch (this.getKind()) {
            case Type: {
                sb.append("type : ");
                sb.append(this.getTypePattern().asString());
                break;
            }
            case Method: {
                sb.append("method : ");
                sb.append(this.getSignaturePattern().asString());
                break;
            }
            case Field: {
                sb.append("field : ");
                sb.append(this.getSignaturePattern().asString());
                break;
            }
            case Constructor: {
                sb.append("constructor : ");
                sb.append(this.getSignaturePattern().asString());
                break;
            }
        }
        sb.append(" : ");
        sb.append(this.getAnnotationAsText());
        return sb.toString();
    }
}
