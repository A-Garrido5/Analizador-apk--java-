// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.io.Serializable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class aI
{
    static final Type[] a;
    
    static {
        a = new Type[0];
    }
    
    static int a(final Object o) {
        return b(o);
    }
    
    public static Type a(final Type type) {
        if (type instanceof Class) {
            final Class clazz = (Class)type;
            Serializable s;
            if (clazz.isArray()) {
                s = new bx(a(clazz.getComponentType()));
            }
            else {
                s = clazz;
            }
            return (bx)s;
        }
        if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            return new hP(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new bx(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            final WildcardType wildcardType = (WildcardType)type;
            return new dI(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }
    
    static boolean a(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static boolean a(final Type type, final Type type2) {
        boolean b = true;
        boolean b2;
        if (type == type2) {
            b2 = b;
        }
        else {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                final boolean b3 = type2 instanceof ParameterizedType;
                b2 = false;
                if (b3) {
                    final ParameterizedType parameterizedType = (ParameterizedType)type;
                    final ParameterizedType parameterizedType2 = (ParameterizedType)type2;
                    if (!a(parameterizedType.getOwnerType(), (Object)parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                        b = false;
                    }
                    return b;
                }
            }
            else if (type instanceof GenericArrayType) {
                final boolean b4 = type2 instanceof GenericArrayType;
                b2 = false;
                if (b4) {
                    return a(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)type2).getGenericComponentType());
                }
            }
            else if (type instanceof WildcardType) {
                final boolean b5 = type2 instanceof WildcardType;
                b2 = false;
                if (b5) {
                    final WildcardType wildcardType = (WildcardType)type;
                    final WildcardType wildcardType2 = (WildcardType)type2;
                    if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                        b = false;
                    }
                    return b;
                }
            }
            else {
                final boolean b6 = type instanceof TypeVariable;
                b2 = false;
                if (b6) {
                    final boolean b7 = type2 instanceof TypeVariable;
                    b2 = false;
                    if (b7) {
                        final TypeVariable typeVariable = (TypeVariable)type;
                        final TypeVariable typeVariable2 = (TypeVariable)type2;
                        if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                            b = false;
                        }
                        return b;
                    }
                }
            }
        }
        return b2;
    }
    
    private static int b(final Object o) {
        if (o != null) {
            return o.hashCode();
        }
        return 0;
    }
    
    public static String b(final Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }
    
    private static void c(final Type type) {
        J.a(!(type instanceof Class) || !((Class)type).isPrimitive());
    }
    
    static void d(final Type type) {
        c(type);
    }
}
