// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjTypeSystem;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.PointcutExpression;
import org.aspectj.lang.reflect.AjType;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.Pointcut;

public class PointcutImpl implements Pointcut
{
    private final Method baseMethod;
    private final AjType declaringType;
    private final String name;
    private String[] parameterNames;
    private final PointcutExpression pc;
    
    protected PointcutImpl(final String name, final String s, final Method baseMethod, final AjType declaringType, final String s2) {
        this.parameterNames = new String[0];
        this.name = name;
        this.pc = new PointcutExpressionImpl(s);
        this.baseMethod = baseMethod;
        this.declaringType = declaringType;
        this.parameterNames = this.splitOnComma(s2);
    }
    
    private String[] splitOnComma(final String s) {
        final StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        final String[] array = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = stringTokenizer.nextToken().trim();
        }
        return array;
    }
    
    @Override
    public AjType getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public int getModifiers() {
        return this.baseMethod.getModifiers();
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String[] getParameterNames() {
        return this.parameterNames;
    }
    
    @Override
    public AjType<?>[] getParameterTypes() {
        final Class<?>[] parameterTypes = this.baseMethod.getParameterTypes();
        final AjType[] array = new AjType[parameterTypes.length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = AjTypeSystem.getAjType(parameterTypes[i]);
        }
        return (AjType<?>[])array;
    }
    
    @Override
    public PointcutExpression getPointcutExpression() {
        return this.pc;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(this.getName());
        sb.append("(");
        final AjType<?>[] parameterTypes = this.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; ++i) {
            sb.append(parameterTypes[i].getName());
            if (this.parameterNames != null && this.parameterNames[i] != null) {
                sb.append(" ");
                sb.append(this.parameterNames[i]);
            }
            if (i + 1 < parameterTypes.length) {
                sb.append(",");
            }
        }
        sb.append(") : ");
        sb.append(this.getPointcutExpression().asString());
        return sb.toString();
    }
}
