// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.PointcutExpression;
import org.aspectj.lang.reflect.AdviceKind;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.Advice;

public class AdviceImpl implements Advice
{
    private static final String AJC_INTERNAL = "org.aspectj.runtime.internal";
    private final Method adviceMethod;
    private AjType[] exceptionTypes;
    private Type[] genericParameterTypes;
    private boolean hasExtraParam;
    private final AdviceKind kind;
    private AjType[] parameterTypes;
    private PointcutExpression pointcutExpression;
    
    protected AdviceImpl(final Method adviceMethod, final String s, final AdviceKind kind) {
        this.hasExtraParam = false;
        this.kind = kind;
        this.adviceMethod = adviceMethod;
        this.pointcutExpression = new PointcutExpressionImpl(s);
    }
    
    protected AdviceImpl(final Method method, final String s, final AdviceKind adviceKind, final String s2) {
        this(method, s, adviceKind);
        this.hasExtraParam = true;
    }
    
    @Override
    public AjType getDeclaringType() {
        return AjTypeSystem.getAjType(this.adviceMethod.getDeclaringClass());
    }
    
    @Override
    public AjType<?>[] getExceptionTypes() {
        if (this.exceptionTypes == null) {
            final Class<?>[] exceptionTypes = this.adviceMethod.getExceptionTypes();
            this.exceptionTypes = new AjType[exceptionTypes.length];
            for (int i = 0; i < exceptionTypes.length; ++i) {
                this.exceptionTypes[i] = AjTypeSystem.getAjType(exceptionTypes[i]);
            }
        }
        return (AjType<?>[])this.exceptionTypes;
    }
    
    @Override
    public Type[] getGenericParameterTypes() {
        if (this.genericParameterTypes == null) {
            final Type[] genericParameterTypes = this.adviceMethod.getGenericParameterTypes();
            int n = 0;
            for (final Type type : genericParameterTypes) {
                if (type instanceof Class && ((Class)type).getPackage().getName().equals("org.aspectj.runtime.internal")) {
                    ++n;
                }
            }
            this.genericParameterTypes = new Type[genericParameterTypes.length - n];
            for (int j = 0; j < this.genericParameterTypes.length; ++j) {
                if (genericParameterTypes[j] instanceof Class) {
                    this.genericParameterTypes[j] = AjTypeSystem.getAjType((Class<Object>)genericParameterTypes[j]);
                }
                else {
                    this.genericParameterTypes[j] = genericParameterTypes[j];
                }
            }
        }
        return this.genericParameterTypes;
    }
    
    @Override
    public AdviceKind getKind() {
        return this.kind;
    }
    
    @Override
    public String getName() {
        String s = this.adviceMethod.getName();
        if (s.startsWith("ajc$")) {
            s = "";
            final AdviceName adviceName = this.adviceMethod.getAnnotation(AdviceName.class);
            if (adviceName != null) {
                s = adviceName.value();
            }
        }
        return s;
    }
    
    @Override
    public AjType<?>[] getParameterTypes() {
        if (this.parameterTypes == null) {
            final Class<?>[] parameterTypes = this.adviceMethod.getParameterTypes();
            int n = 0;
            for (int length = parameterTypes.length, i = 0; i < length; ++i) {
                if (parameterTypes[i].getPackage().getName().equals("org.aspectj.runtime.internal")) {
                    ++n;
                }
            }
            this.parameterTypes = new AjType[parameterTypes.length - n];
            for (int j = 0; j < this.parameterTypes.length; ++j) {
                this.parameterTypes[j] = AjTypeSystem.getAjType(parameterTypes[j]);
            }
        }
        return (AjType<?>[])this.parameterTypes;
    }
    
    @Override
    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        if (this.getName().length() > 0) {
            sb.append("@AdviceName(\"");
            sb.append(this.getName());
            sb.append("\") ");
        }
        if (this.getKind() == AdviceKind.AROUND) {
            sb.append(this.adviceMethod.getGenericReturnType().toString());
            sb.append(" ");
        }
        switch (this.getKind()) {
            case AFTER: {
                sb.append("after(");
                break;
            }
            case AFTER_RETURNING: {
                sb.append("after(");
                break;
            }
            case AFTER_THROWING: {
                sb.append("after(");
                break;
            }
            case AROUND: {
                sb.append("around(");
                break;
            }
            case BEFORE: {
                sb.append("before(");
                break;
            }
        }
        final AjType<?>[] parameterTypes = this.getParameterTypes();
        int length = parameterTypes.length;
        if (this.hasExtraParam) {
            --length;
        }
        for (int i = 0; i < length; ++i) {
            sb.append(parameterTypes[i].getName());
            if (i + 1 < length) {
                sb.append(",");
            }
        }
        sb.append(") ");
        switch (this.getKind()) {
            case AFTER_RETURNING: {
                sb.append("returning");
                if (this.hasExtraParam) {
                    sb.append("(");
                    sb.append(parameterTypes[length - 1].getName());
                    sb.append(") ");
                }
            }
            case AFTER_THROWING: {
                sb.append("throwing");
                if (this.hasExtraParam) {
                    sb.append("(");
                    sb.append(parameterTypes[length - 1].getName());
                    sb.append(") ");
                    break;
                }
                break;
            }
        }
        final AjType<?>[] exceptionTypes = this.getExceptionTypes();
        if (exceptionTypes.length > 0) {
            sb.append("throws ");
            for (int j = 0; j < exceptionTypes.length; ++j) {
                sb.append(exceptionTypes[j].getName());
                if (j + 1 < exceptionTypes.length) {
                    sb.append(",");
                }
            }
            sb.append(" ");
        }
        sb.append(": ");
        sb.append(this.getPointcutExpression().asString());
        return sb.toString();
    }
}
