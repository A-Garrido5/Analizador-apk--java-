// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.PointcutExpression;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareSoft;

public class DeclareSoftImpl implements DeclareSoft
{
    private AjType<?> declaringType;
    private AjType<?> exceptionType;
    private String missingTypeName;
    private PointcutExpression pointcut;
    
    public DeclareSoftImpl(final AjType<?> declaringType, final String s, final String missingTypeName) {
        this.declaringType = declaringType;
        this.pointcut = new PointcutExpressionImpl(s);
        try {
            this.exceptionType = AjTypeSystem.getAjType(Class.forName(missingTypeName, false, declaringType.getJavaClass().getClassLoader()));
        }
        catch (ClassNotFoundException ex) {
            this.missingTypeName = missingTypeName;
        }
    }
    
    @Override
    public AjType getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public PointcutExpression getPointcutExpression() {
        return this.pointcut;
    }
    
    @Override
    public AjType getSoftenedExceptionType() throws ClassNotFoundException {
        if (this.missingTypeName != null) {
            throw new ClassNotFoundException(this.missingTypeName);
        }
        return this.exceptionType;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("declare soft : ");
        if (this.missingTypeName != null) {
            sb.append(this.exceptionType.getName());
        }
        else {
            sb.append(this.missingTypeName);
        }
        sb.append(" : ");
        sb.append(this.getPointcutExpression().asString());
        return sb.toString();
    }
}
