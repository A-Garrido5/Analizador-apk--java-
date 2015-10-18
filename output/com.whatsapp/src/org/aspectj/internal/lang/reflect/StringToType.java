// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.TypeVariable;
import org.aspectj.lang.reflect.AjTypeSystem;
import java.lang.reflect.ParameterizedType;
import java.util.StringTokenizer;
import java.lang.reflect.Type;

public class StringToType
{
    public static Type[] commaSeparatedListToTypeArray(final String s, final Class clazz) throws ClassNotFoundException {
        final StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        final Type[] array = new Type[stringTokenizer.countTokens()];
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            final String trim = stringTokenizer.nextToken().trim();
            final int n2 = n + 1;
            array[n] = stringToType(trim, clazz);
            n = n2;
        }
        return array;
    }
    
    private static Type makeParameterizedType(final String s, final Class clazz) throws ClassNotFoundException {
        final int index = s.indexOf(60);
        return new ParameterizedType() {
            final /* synthetic */ Class val$baseClass = Class.forName(s.substring(0, index), false, clazz.getClassLoader());
            final /* synthetic */ Type[] val$typeParams = commaSeparatedListToTypeArray(s.substring(index + 1, s.lastIndexOf(62)), clazz);
            
            @Override
            public Type[] getActualTypeArguments() {
                return this.val$typeParams;
            }
            
            @Override
            public Type getOwnerType() {
                return this.val$baseClass.getEnclosingClass();
            }
            
            @Override
            public Type getRawType() {
                return this.val$baseClass;
            }
        };
    }
    
    public static Type stringToType(final String s, final Class clazz) throws ClassNotFoundException {
        try {
            if (s.indexOf("<") == -1) {
                return AjTypeSystem.getAjType(Class.forName(s, false, clazz.getClassLoader()));
            }
            return makeParameterizedType(s, clazz);
        }
        catch (ClassNotFoundException ex) {
            final TypeVariable[] typeParameters = clazz.getTypeParameters();
            for (int i = 0; i < typeParameters.length; ++i) {
                if (typeParameters[i].getName().equals(s)) {
                    return typeParameters[i];
                }
            }
            throw new ClassNotFoundException(s);
        }
    }
}
