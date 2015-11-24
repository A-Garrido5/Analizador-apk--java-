// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import java.lang.reflect.TypeVariable;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

public interface AjType<T> extends Type, AnnotatedElement
{
    Advice getAdvice(final String p0) throws NoSuchAdviceException;
    
    Advice[] getAdvice(final AdviceKind... p0);
    
    AjType<?>[] getAjTypes();
    
    Constructor getConstructor(final AjType<?>... p0) throws NoSuchMethodException;
    
    Constructor[] getConstructors();
    
    DeclareAnnotation[] getDeclareAnnotations();
    
    DeclareErrorOrWarning[] getDeclareErrorOrWarnings();
    
    DeclareParents[] getDeclareParents();
    
    DeclarePrecedence[] getDeclarePrecedence();
    
    DeclareSoft[] getDeclareSofts();
    
    Advice getDeclaredAdvice(final String p0) throws NoSuchAdviceException;
    
    Advice[] getDeclaredAdvice(final AdviceKind... p0);
    
    AjType<?>[] getDeclaredAjTypes();
    
    Constructor getDeclaredConstructor(final AjType<?>... p0) throws NoSuchMethodException;
    
    Constructor[] getDeclaredConstructors();
    
    Field getDeclaredField(final String p0) throws NoSuchFieldException;
    
    Field[] getDeclaredFields();
    
    InterTypeConstructorDeclaration getDeclaredITDConstructor(final AjType<?> p0, final AjType<?>... p1) throws NoSuchMethodException;
    
    InterTypeConstructorDeclaration[] getDeclaredITDConstructors();
    
    InterTypeFieldDeclaration getDeclaredITDField(final String p0, final AjType<?> p1) throws NoSuchFieldException;
    
    InterTypeFieldDeclaration[] getDeclaredITDFields();
    
    InterTypeMethodDeclaration getDeclaredITDMethod(final String p0, final AjType<?> p1, final AjType<?>... p2) throws NoSuchMethodException;
    
    InterTypeMethodDeclaration[] getDeclaredITDMethods();
    
    Method getDeclaredMethod(final String p0, final AjType<?>... p1) throws NoSuchMethodException;
    
    Method[] getDeclaredMethods();
    
    Pointcut getDeclaredPointcut(final String p0) throws NoSuchPointcutException;
    
    Pointcut[] getDeclaredPointcuts();
    
    AjType<?> getDeclaringType();
    
    Constructor getEnclosingConstructor();
    
    Method getEnclosingMethod();
    
    AjType<?> getEnclosingType();
    
    T[] getEnumConstants();
    
    Field getField(final String p0) throws NoSuchFieldException;
    
    Field[] getFields();
    
    Type getGenericSupertype();
    
    InterTypeConstructorDeclaration getITDConstructor(final AjType<?> p0, final AjType<?>... p1) throws NoSuchMethodException;
    
    InterTypeConstructorDeclaration[] getITDConstructors();
    
    InterTypeFieldDeclaration getITDField(final String p0, final AjType<?> p1) throws NoSuchFieldException;
    
    InterTypeFieldDeclaration[] getITDFields();
    
    InterTypeMethodDeclaration getITDMethod(final String p0, final AjType<?> p1, final AjType<?>... p2) throws NoSuchMethodException;
    
    InterTypeMethodDeclaration[] getITDMethods();
    
    AjType<?>[] getInterfaces();
    
    Class<T> getJavaClass();
    
    Method getMethod(final String p0, final AjType<?>... p1) throws NoSuchMethodException;
    
    Method[] getMethods();
    
    int getModifiers();
    
    String getName();
    
    Package getPackage();
    
    PerClause getPerClause();
    
    Pointcut getPointcut(final String p0) throws NoSuchPointcutException;
    
    Pointcut[] getPointcuts();
    
    AjType<?> getSupertype();
    
    TypeVariable<Class<T>>[] getTypeParameters();
    
    boolean isArray();
    
    boolean isAspect();
    
    boolean isEnum();
    
    boolean isInstance(final Object p0);
    
    boolean isInterface();
    
    boolean isLocalClass();
    
    boolean isMemberAspect();
    
    boolean isMemberClass();
    
    boolean isPrimitive();
    
    boolean isPrivileged();
}
