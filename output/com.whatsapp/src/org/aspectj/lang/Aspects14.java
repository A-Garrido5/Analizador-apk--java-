// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Aspects14
{
    private static final String ASPECTOF = "aspectOf";
    private static final Class[] EMPTY_CLASS_ARRAY;
    private static final Object[] EMPTY_OBJECT_ARRAY;
    private static final String HASASPECT = "hasAspect";
    private static final Class[] PEROBJECT_CLASS_ARRAY;
    private static final Class[] PERTYPEWITHIN_CLASS_ARRAY;
    static Class class$java$lang$Class;
    static Class class$java$lang$Object;
    
    static {
        EMPTY_CLASS_ARRAY = new Class[0];
        final Class[] perobject_CLASS_ARRAY = { null };
        Class class$java$lang$Object;
        if (Aspects14.class$java$lang$Object == null) {
            class$java$lang$Object = (Aspects14.class$java$lang$Object = class$("java.lang.Object"));
        }
        else {
            class$java$lang$Object = Aspects14.class$java$lang$Object;
        }
        perobject_CLASS_ARRAY[0] = class$java$lang$Object;
        PEROBJECT_CLASS_ARRAY = perobject_CLASS_ARRAY;
        final Class[] pertypewithin_CLASS_ARRAY = { null };
        Class class$java$lang$Class;
        if (Aspects14.class$java$lang$Class == null) {
            class$java$lang$Class = (Aspects14.class$java$lang$Class = class$("java.lang.Class"));
        }
        else {
            class$java$lang$Class = Aspects14.class$java$lang$Class;
        }
        pertypewithin_CLASS_ARRAY[0] = class$java$lang$Class;
        PERTYPEWITHIN_CLASS_ARRAY = pertypewithin_CLASS_ARRAY;
        EMPTY_OBJECT_ARRAY = new Object[0];
    }
    
    public static Object aspectOf(final Class clazz) throws NoAspectBoundException {
        try {
            return getSingletonOrThreadAspectOf(clazz).invoke(null, Aspects14.EMPTY_OBJECT_ARRAY);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    public static Object aspectOf(final Class clazz, final Class clazz2) throws NoAspectBoundException {
        try {
            return getPerTypeWithinAspectOf(clazz).invoke(null, clazz2);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    public static Object aspectOf(final Class clazz, final Object o) throws NoAspectBoundException {
        try {
            return getPerObjectAspectOf(clazz).invoke(null, o);
        }
        catch (InvocationTargetException ex) {
            throw new NoAspectBoundException(clazz.getName(), ex);
        }
        catch (Exception ex2) {
            throw new NoAspectBoundException(clazz.getName(), ex2);
        }
    }
    
    private static Method checkAspectOf(final Method method, final Class clazz) throws NoSuchMethodException {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers())) {
            throw new NoSuchMethodException(new StringBuffer().append(clazz.getName()).append(".aspectOf(..) is not accessible public static").toString());
        }
        return method;
    }
    
    private static Method checkHasAspect(final Method method, final Class clazz) throws NoSuchMethodException {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers())) {
            throw new NoSuchMethodException(new StringBuffer().append(clazz.getName()).append(".hasAspect(..) is not accessible public static").toString());
        }
        return method;
    }
    
    static Class class$(final String s) {
        try {
            return Class.forName(s);
        }
        catch (ClassNotFoundException ex) {
            throw new NoClassDefFoundError(ex.getMessage());
        }
    }
    
    private static Method getPerObjectAspectOf(final Class clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class[])Aspects14.PEROBJECT_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerObjectHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects14.PEROBJECT_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerTypeWithinAspectOf(final Class clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class[])Aspects14.PERTYPEWITHIN_CLASS_ARRAY), clazz);
    }
    
    private static Method getPerTypeWithinHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects14.PERTYPEWITHIN_CLASS_ARRAY), clazz);
    }
    
    private static Method getSingletonOrThreadAspectOf(final Class clazz) throws NoSuchMethodException {
        return checkAspectOf(clazz.getDeclaredMethod("aspectOf", (Class[])Aspects14.EMPTY_CLASS_ARRAY), clazz);
    }
    
    private static Method getSingletonOrThreadHasAspect(final Class clazz) throws NoSuchMethodException {
        return checkHasAspect(clazz.getDeclaredMethod("hasAspect", (Class[])Aspects14.EMPTY_CLASS_ARRAY), clazz);
    }
    
    public static boolean hasAspect(final Class clazz) throws NoAspectBoundException {
        try {
            return (boolean)getSingletonOrThreadHasAspect(clazz).invoke(null, Aspects14.EMPTY_OBJECT_ARRAY);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static boolean hasAspect(final Class clazz, final Class clazz2) throws NoAspectBoundException {
        try {
            return (boolean)getPerTypeWithinHasAspect(clazz).invoke(null, clazz2);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static boolean hasAspect(final Class clazz, final Object o) throws NoAspectBoundException {
        try {
            return (boolean)getPerObjectHasAspect(clazz).invoke(null, o);
        }
        catch (Exception ex) {
            return false;
        }
    }
}
