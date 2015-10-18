// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Aspects
{
    private static final String ASPECTOF = "aspectOf";
    private static final Class[] EMPTY_CLASS_ARRAY;
    private static final Object[] EMPTY_OBJECT_ARRAY;
    private static final String HASASPECT = "hasAspect";
    private static final Class[] PEROBJECT_CLASS_ARRAY;
    private static final Class[] PERTYPEWITHIN_CLASS_ARRAY;
    
    static {
        EMPTY_CLASS_ARRAY = new Class[0];
        PEROBJECT_CLASS_ARRAY = new Class[] { Object.class };
        PERTYPEWITHIN_CLASS_ARRAY = new Class[] { Class.class };
        EMPTY_OBJECT_ARRAY = new Object[0];
    }
    
    public static <T> T aspectOf(final Class<T> clazz) throws NoAspectBoundException {
        try {
            return (T)getSingletonOrThreadAspectOf(clazz).invoke(null, Aspects.EMPTY_OBJECT_ARRAY);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    public static <T> T aspectOf(final Class<T> clazz, final Class<?> clazz2) throws NoAspectBoundException {
        try {
            return (T)getPerTypeWithinAspectOf(clazz).invoke(null, clazz2);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    public static <T> T aspectOf(final Class<T> clazz, final Object o) throws NoAspectBoundException {
        try {
            return (T)getPerObjectAspectOf(clazz).invoke(null, o);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    private static Method checkAspectOf(final Method method, final Class<?> clazz) throws NoSuchMethodException {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers())) {
            throw new NoSuchMethodException(clazz.getName() + ".aspectOf(..) is not accessible public static");
        }
        return method;
    }
    
    private static Method checkHasAspect(final Method method, final Class clazz) throws NoSuchMethodException {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers())) {
            throw new NoSuchMethodException(clazz.getName() + ".hasAspect(..) is not accessible public static");
        }
        return method;
    }
    
    private static Method getPerObjectAspectOf(final Class<?> clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class<?>[])Aspects.PEROBJECT_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerObjectHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects.PEROBJECT_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerTypeWithinAspectOf(final Class<?> clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class<?>[])Aspects.PERTYPEWITHIN_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerTypeWithinHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects.PERTYPEWITHIN_CLASS_ARRAY), clazz);
    }
    
    private static Method getSingletonOrThreadAspectOf(final Class<?> clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class<?>[])Aspects.EMPTY_CLASS_ARRAY), clazz);
    }
    
    private static Method getSingletonOrThreadHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects.EMPTY_CLASS_ARRAY), clazz);
    }
    
    public static boolean hasAspect(final Class<?> clazz) throws NoAspectBoundException {
        try {
            return (boolean)getSingletonOrThreadHasAspect(clazz).invoke(null, Aspects.EMPTY_OBJECT_ARRAY);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static boolean hasAspect(final Class<?> clazz, final Class<?> clazz2) throws NoAspectBoundException {
        try {
            return (boolean)getPerTypeWithinHasAspect(clazz).invoke(null, clazz2);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static boolean hasAspect(final Class<?> clazz, final Object o) throws NoAspectBoundException {
        try {
            return (boolean)getPerObjectHasAspect(clazz).invoke(null, o);
        }
        catch (Exception ex) {
            return false;
        }
    }
}
