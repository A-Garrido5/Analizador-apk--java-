// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PointcutExpression;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;

public class DeclareErrorOrWarningImpl implements DeclareErrorOrWarning
{
    private AjType declaringType;
    private boolean isError;
    private String msg;
    private PointcutExpression pc;
    
    public DeclareErrorOrWarningImpl(final String s, final String msg, final boolean isError, final AjType declaringType) {
        this.pc = new PointcutExpressionImpl(s);
        this.msg = msg;
        this.isError = isError;
        this.declaringType = declaringType;
    }
    
    @Override
    public AjType getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public String getMessage() {
        return this.msg;
    }
    
    @Override
    public PointcutExpression getPointcutExpression() {
        return this.pc;
    }
    
    @Override
    public boolean isError() {
        return this.isError;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("declare ");
        String s;
        if (this.isError()) {
            s = "error : ";
        }
        else {
            s = "warning : ";
        }
        sb.append(s);
        sb.append(this.getPointcutExpression().asString());
        sb.append(" : ");
        sb.append("\"");
        sb.append(this.getMessage());
        sb.append("\"");
        return sb.toString();
    }
}
