// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PointcutExpression;

public class PointcutExpressionImpl implements PointcutExpression
{
    private String expression;
    
    public PointcutExpressionImpl(final String expression) {
        this.expression = expression;
    }
    
    @Override
    public String asString() {
        return this.expression;
    }
    
    @Override
    public String toString() {
        return this.asString();
    }
}
