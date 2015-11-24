// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import java.lang.reflect.TypeVariable;
import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.PerClause;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.aspectj.internal.lang.annotation.ajcITD;
import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.aspectj.lang.reflect.DeclareSoft;
import org.aspectj.internal.lang.annotation.ajcDeclarePrecedence;
import org.aspectj.lang.reflect.DeclarePrecedence;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.DeclareWarning;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.lang.reflect.DeclareAnnotation;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Arrays;
import java.util.EnumSet;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import java.util.ArrayList;
import java.util.Set;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.annotation.Before;
import java.lang.reflect.Method;
import org.aspectj.lang.reflect.AjTypeSystem;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.DeclareParents;
import java.util.List;
import org.aspectj.lang.reflect.Pointcut;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;
import org.aspectj.lang.reflect.InterTypeFieldDeclaration;
import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AjType;

public class AjTypeImpl<T> implements AjType<T>
{
    private static final String ajcMagic = "ajc$";
    private Advice[] advice;
    private Class<T> clazz;
    private Advice[] declaredAdvice;
    private InterTypeConstructorDeclaration[] declaredITDCons;
    private InterTypeFieldDeclaration[] declaredITDFields;
    private InterTypeMethodDeclaration[] declaredITDMethods;
    private Pointcut[] declaredPointcuts;
    private InterTypeConstructorDeclaration[] itdCons;
    private InterTypeFieldDeclaration[] itdFields;
    private InterTypeMethodDeclaration[] itdMethods;
    private Pointcut[] pointcuts;
    
    public AjTypeImpl(final Class<T> clazz) {
        this.declaredPointcuts = null;
        this.pointcuts = null;
        this.declaredAdvice = null;
        this.advice = null;
        this.declaredITDMethods = null;
        this.itdMethods = null;
        this.declaredITDFields = null;
        this.itdFields = null;
        this.itdCons = null;
        this.declaredITDCons = null;
        this.clazz = clazz;
    }
    
    private void addAnnotationStyleDeclareParents(final List<DeclareParents> list) {
        for (final Field field : this.clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(org.aspectj.lang.annotation.DeclareParents.class) && field.getType().isInterface()) {
                list.add(new DeclareParentsImpl(field.getAnnotation(org.aspectj.lang.annotation.DeclareParents.class).value(), field.getType().getName(), false, this));
            }
        }
    }
    
    private void addAnnotationStyleITDFields(final List<InterTypeFieldDeclaration> list, final boolean b) {
    }
    
    private void addAnnotationStyleITDMethods(final List<InterTypeMethodDeclaration> list, final boolean b) {
        if (this.isAspect()) {
            for (final Field field : this.clazz.getDeclaredFields()) {
                if (field.getType().isInterface() && field.isAnnotationPresent(org.aspectj.lang.annotation.DeclareParents.class) && field.getAnnotation(org.aspectj.lang.annotation.DeclareParents.class).defaultImpl() != org.aspectj.lang.annotation.DeclareParents.class) {
                    for (final Method method : field.getType().getDeclaredMethods()) {
                        if (Modifier.isPublic(method.getModifiers()) || !b) {
                            list.add(new InterTypeMethodDeclarationImpl(this, AjTypeSystem.getAjType(field.getType()), method, 1));
                        }
                    }
                }
            }
        }
    }
    
    private Advice asAdvice(final Method method) {
        if (method.getAnnotations().length != 0) {
            final Before before = method.getAnnotation(Before.class);
            if (before != null) {
                return new AdviceImpl(method, before.value(), AdviceKind.BEFORE);
            }
            final After after = method.getAnnotation(After.class);
            if (after != null) {
                return new AdviceImpl(method, after.value(), AdviceKind.AFTER);
            }
            final AfterReturning afterReturning = method.getAnnotation(AfterReturning.class);
            if (afterReturning != null) {
                String s = afterReturning.pointcut();
                if (s.equals("")) {
                    s = afterReturning.value();
                }
                return new AdviceImpl(method, s, AdviceKind.AFTER_RETURNING, afterReturning.returning());
            }
            final AfterThrowing afterThrowing = method.getAnnotation(AfterThrowing.class);
            if (afterThrowing != null) {
                String s2 = afterThrowing.pointcut();
                if (s2 == null) {
                    s2 = afterThrowing.value();
                }
                return new AdviceImpl(method, s2, AdviceKind.AFTER_THROWING, afterThrowing.throwing());
            }
            final Around around = method.getAnnotation(Around.class);
            if (around != null) {
                return new AdviceImpl(method, around.value(), AdviceKind.AROUND);
            }
        }
        return null;
    }
    
    private Pointcut asPointcut(final Method method) {
        final org.aspectj.lang.annotation.Pointcut pointcut = method.getAnnotation(org.aspectj.lang.annotation.Pointcut.class);
        if (pointcut != null) {
            String s = method.getName();
            if (s.startsWith("ajc$")) {
                s = s.substring(2 + s.indexOf("$$"), s.length());
                final int index = s.indexOf("$");
                if (index != -1) {
                    s = s.substring(0, index);
                }
            }
            return new PointcutImpl(s, pointcut.value(), method, AjTypeSystem.getAjType(method.getDeclaringClass()), pointcut.argNames());
        }
        return null;
    }
    
    private Advice[] getAdvice(final Set set) {
        if (this.advice == null) {
            this.initAdvice();
        }
        final ArrayList<Advice> list = new ArrayList<Advice>();
        for (final Advice advice2 : this.advice) {
            if (set.contains(advice2.getKind())) {
                list.add(advice2);
            }
        }
        final Advice[] array = new Advice[list.size()];
        list.toArray(array);
        return array;
    }
    
    private Advice[] getDeclaredAdvice(final Set set) {
        if (this.declaredAdvice == null) {
            this.initDeclaredAdvice();
        }
        final ArrayList<Advice> list = new ArrayList<Advice>();
        for (final Advice advice : this.declaredAdvice) {
            if (set.contains(advice.getKind())) {
                list.add(advice);
            }
        }
        final Advice[] array = new Advice[list.size()];
        list.toArray(array);
        return array;
    }
    
    private void initAdvice() {
        final Method[] methods = this.clazz.getMethods();
        final ArrayList<Advice> list = new ArrayList<Advice>();
        for (int length = methods.length, i = 0; i < length; ++i) {
            final Advice advice = this.asAdvice(methods[i]);
            if (advice != null) {
                list.add(advice);
            }
        }
        list.toArray(this.advice = new Advice[list.size()]);
    }
    
    private void initDeclaredAdvice() {
        final Method[] declaredMethods = this.clazz.getDeclaredMethods();
        final ArrayList<Advice> list = new ArrayList<Advice>();
        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
            final Advice advice = this.asAdvice(declaredMethods[i]);
            if (advice != null) {
                list.add(advice);
            }
        }
        list.toArray(this.declaredAdvice = new Advice[list.size()]);
    }
    
    private boolean isReallyAMethod(final Method method) {
        if (!method.getName().startsWith("ajc$")) {
            if (method.getAnnotations().length == 0) {
                return true;
            }
            if (!method.isAnnotationPresent(org.aspectj.lang.annotation.Pointcut.class) && !method.isAnnotationPresent(Before.class) && !method.isAnnotationPresent(After.class) && !method.isAnnotationPresent(AfterReturning.class) && !method.isAnnotationPresent(AfterThrowing.class) && !method.isAnnotationPresent(Around.class)) {
                return true;
            }
        }
        return false;
    }
    
    private AjType<?>[] toAjTypeArray(final Class<?>[] array) {
        final AjType[] array2 = new AjType[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = AjTypeSystem.getAjType(array[i]);
        }
        return (AjType<?>[])array2;
    }
    
    private Class<?>[] toClassArray(final AjType<?>[] array) {
        final Class[] array2 = new Class[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = array[i].getJavaClass();
        }
        return (Class<?>[])array2;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof AjTypeImpl && ((AjTypeImpl)o).clazz.equals(this.clazz);
    }
    
    @Override
    public Advice getAdvice(final String s) throws NoSuchAdviceException {
        if (s.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.advice == null) {
            this.initAdvice();
        }
        for (final Advice advice2 : this.advice) {
            if (advice2.getName().equals(s)) {
                return advice2;
            }
        }
        throw new NoSuchAdviceException(s);
    }
    
    @Override
    public Advice[] getAdvice(final AdviceKind... array) {
        EnumSet<AdviceKind> set;
        if (array.length == 0) {
            set = EnumSet.allOf(AdviceKind.class);
        }
        else {
            set = EnumSet.noneOf(AdviceKind.class);
            set.addAll((Collection<?>)Arrays.asList(array));
        }
        return this.getAdvice(set);
    }
    
    @Override
    public AjType<?>[] getAjTypes() {
        return this.toAjTypeArray(this.clazz.getClasses());
    }
    
    @Override
    public <A extends Annotation> A getAnnotation(final Class<A> clazz) {
        return this.clazz.getAnnotation(clazz);
    }
    
    @Override
    public Annotation[] getAnnotations() {
        return this.clazz.getAnnotations();
    }
    
    @Override
    public Constructor getConstructor(final AjType<?>... array) throws NoSuchMethodException {
        return this.clazz.getConstructor(this.toClassArray(array));
    }
    
    @Override
    public Constructor[] getConstructors() {
        return this.clazz.getConstructors();
    }
    
    @Override
    public DeclareAnnotation[] getDeclareAnnotations() {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareAnnotation.class)) {
                final ajcDeclareAnnotation ajcDeclareAnnotation = method.getAnnotation(ajcDeclareAnnotation.class);
                final Annotation[] annotations = method.getAnnotations();
                final int length2 = annotations.length;
                int n = 0;
                Annotation annotation;
                while (true) {
                    annotation = null;
                    if (n >= length2) {
                        break;
                    }
                    final Annotation annotation2 = annotations[n];
                    if (annotation2.annotationType() != ajcDeclareAnnotation.class) {
                        annotation = annotation2;
                        break;
                    }
                    ++n;
                }
                list.add(new DeclareAnnotationImpl(this, ajcDeclareAnnotation.kind(), ajcDeclareAnnotation.pattern(), annotation, ajcDeclareAnnotation.annotation()));
            }
        }
        if (this.getSupertype().isAspect()) {
            list.addAll(Arrays.asList(this.getSupertype().getDeclareAnnotations()));
        }
        final DeclareAnnotation[] array = new DeclareAnnotation[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public DeclareErrorOrWarning[] getDeclareErrorOrWarnings() {
        final ArrayList<DeclareErrorOrWarningImpl> list = new ArrayList<DeclareErrorOrWarningImpl>();
        for (final Field field : this.clazz.getDeclaredFields()) {
            try {
                if (field.isAnnotationPresent(DeclareWarning.class)) {
                    final DeclareWarning declareWarning = field.getAnnotation(DeclareWarning.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        list.add(new DeclareErrorOrWarningImpl(declareWarning.value(), (String)field.get(null), false, this));
                    }
                }
                else if (field.isAnnotationPresent(DeclareError.class)) {
                    final DeclareError declareError = field.getAnnotation(DeclareError.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        list.add(new DeclareErrorOrWarningImpl(declareError.value(), (String)field.get(null), true, this));
                    }
                }
            }
            catch (IllegalArgumentException ex) {}
            catch (IllegalAccessException ex2) {}
        }
        goto Label_0209;
    }
    
    @Override
    public DeclareParents[] getDeclareParents() {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareParents.class)) {
                final ajcDeclareParents ajcDeclareParents = method.getAnnotation(ajcDeclareParents.class);
                list.add(new DeclareParentsImpl(ajcDeclareParents.targetTypePattern(), ajcDeclareParents.parentTypes(), ajcDeclareParents.isExtends(), this));
            }
        }
        this.addAnnotationStyleDeclareParents((List<DeclareParents>)list);
        if (this.getSupertype().isAspect()) {
            list.addAll(Arrays.asList(this.getSupertype().getDeclareParents()));
        }
        final DeclareParents[] array = new DeclareParents[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public DeclarePrecedence[] getDeclarePrecedence() {
        final ArrayList<DeclarePrecedenceImpl> list = new ArrayList<DeclarePrecedenceImpl>();
        if (this.clazz.isAnnotationPresent(org.aspectj.lang.annotation.DeclarePrecedence.class)) {
            list.add(new DeclarePrecedenceImpl(this.clazz.getAnnotation(org.aspectj.lang.annotation.DeclarePrecedence.class).value(), this));
        }
        for (final Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclarePrecedence.class)) {
                list.add(new DeclarePrecedenceImpl(method.getAnnotation(ajcDeclarePrecedence.class).value(), this));
            }
        }
        if (this.getSupertype().isAspect()) {
            list.addAll((Collection<?>)Arrays.asList(this.getSupertype().getDeclarePrecedence()));
        }
        final DeclarePrecedence[] array = new DeclarePrecedence[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public DeclareSoft[] getDeclareSofts() {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareSoft.class)) {
                final ajcDeclareSoft ajcDeclareSoft = method.getAnnotation(ajcDeclareSoft.class);
                list.add(new DeclareSoftImpl(this, ajcDeclareSoft.pointcut(), ajcDeclareSoft.exceptionType()));
            }
        }
        if (this.getSupertype().isAspect()) {
            list.addAll(Arrays.asList(this.getSupertype().getDeclareSofts()));
        }
        final DeclareSoft[] array = new DeclareSoft[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public Advice getDeclaredAdvice(final String s) throws NoSuchAdviceException {
        if (s.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.declaredAdvice == null) {
            this.initDeclaredAdvice();
        }
        for (final Advice advice : this.declaredAdvice) {
            if (advice.getName().equals(s)) {
                return advice;
            }
        }
        throw new NoSuchAdviceException(s);
    }
    
    @Override
    public Advice[] getDeclaredAdvice(final AdviceKind... array) {
        EnumSet<AdviceKind> set;
        if (array.length == 0) {
            set = EnumSet.allOf(AdviceKind.class);
        }
        else {
            set = EnumSet.noneOf(AdviceKind.class);
            set.addAll((Collection<?>)Arrays.asList(array));
        }
        return this.getDeclaredAdvice(set);
    }
    
    @Override
    public AjType<?>[] getDeclaredAjTypes() {
        return this.toAjTypeArray(this.clazz.getDeclaredClasses());
    }
    
    @Override
    public Annotation[] getDeclaredAnnotations() {
        return this.clazz.getDeclaredAnnotations();
    }
    
    @Override
    public Constructor getDeclaredConstructor(final AjType<?>... array) throws NoSuchMethodException {
        return this.clazz.getDeclaredConstructor(this.toClassArray(array));
    }
    
    @Override
    public Constructor[] getDeclaredConstructors() {
        return this.clazz.getDeclaredConstructors();
    }
    
    @Override
    public Field getDeclaredField(final String s) throws NoSuchFieldException {
        final Field declaredField = this.clazz.getDeclaredField(s);
        if (declaredField.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(s);
        }
        return declaredField;
    }
    
    @Override
    public Field[] getDeclaredFields() {
        final Field[] declaredFields = this.clazz.getDeclaredFields();
        final ArrayList<Field> list = new ArrayList<Field>();
        for (final Field field : declaredFields) {
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                list.add(field);
            }
        }
        final Field[] array = new Field[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public InterTypeConstructorDeclaration getDeclaredITDConstructor(final AjType<?> ajType, final AjType<?>... array) throws NoSuchMethodException {
        final InterTypeConstructorDeclaration[] declaredITDConstructors = this.getDeclaredITDConstructors();
        final int length = declaredITDConstructors.length;
        int n = 0;
    Label_0086_Outer:
        while (true) {
            Label_0098: {
                if (n >= length) {
                    break Label_0098;
                }
                final InterTypeConstructorDeclaration interTypeConstructorDeclaration = declaredITDConstructors[n];
            Label_0086:
                while (true) {
                    try {
                        if (interTypeConstructorDeclaration.getTargetType().equals(ajType)) {
                            final AjType<?>[] parameterTypes = interTypeConstructorDeclaration.getParameterTypes();
                            if (parameterTypes.length == array.length) {
                                for (int i = 0; i < parameterTypes.length; ++i) {
                                    if (!parameterTypes[i].equals(array[i])) {
                                        break Label_0086;
                                    }
                                }
                                return interTypeConstructorDeclaration;
                            }
                        }
                        ++n;
                        continue Label_0086_Outer;
                        throw new NoSuchMethodException();
                    }
                    catch (ClassNotFoundException ex) {
                        continue Label_0086;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public InterTypeConstructorDeclaration[] getDeclaredITDConstructors() {
        if (this.declaredITDCons == null) {
            final ArrayList<InterTypeConstructorDeclarationImpl> list = new ArrayList<InterTypeConstructorDeclarationImpl>();
            for (final Method method : this.clazz.getDeclaredMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                    list.add(new InterTypeConstructorDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), method));
                }
            }
            list.toArray(this.declaredITDCons = new InterTypeConstructorDeclaration[list.size()]);
        }
        return this.declaredITDCons;
    }
    
    @Override
    public InterTypeFieldDeclaration getDeclaredITDField(final String s, final AjType<?> ajType) throws NoSuchFieldException {
        for (final InterTypeFieldDeclaration interTypeFieldDeclaration : this.getDeclaredITDFields()) {
            if (interTypeFieldDeclaration.getName().equals(s)) {
                try {
                    if (interTypeFieldDeclaration.getTargetType().equals(ajType)) {
                        return interTypeFieldDeclaration;
                    }
                }
                catch (ClassNotFoundException ex) {}
            }
        }
        throw new NoSuchFieldException(s);
    }
    
    @Override
    public InterTypeFieldDeclaration[] getDeclaredITDFields() {
        final ArrayList<InterTypeFieldDeclaration> list = (ArrayList<InterTypeFieldDeclaration>)new ArrayList<InterTypeFieldDeclarationImpl>();
        if (this.declaredITDFields == null) {
            for (final Method method : this.clazz.getDeclaredMethods()) {
                Label_0066: {
                    if (method.isAnnotationPresent(ajcITD.class) && method.getName().contains("ajc$interFieldInit")) {
                        final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                        final String replace = method.getName().replace("FieldInit", "FieldGetDispatch");
                        try {
                            final Method declaredMethod = this.clazz.getDeclaredMethod(replace, method.getParameterTypes());
                            list.add(new InterTypeFieldDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), ajcITD.name(), AjTypeSystem.getAjType(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                            break Label_0066;
                        }
                        catch (NoSuchMethodException ex) {
                            throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                        }
                        break;
                    }
                }
            }
            this.addAnnotationStyleITDFields(list, false);
            list.toArray(this.declaredITDFields = new InterTypeFieldDeclaration[list.size()]);
        }
        return this.declaredITDFields;
    }
    
    @Override
    public InterTypeMethodDeclaration getDeclaredITDMethod(final String s, final AjType<?> ajType, final AjType<?>... array) throws NoSuchMethodException {
        final InterTypeMethodDeclaration[] declaredITDMethods = this.getDeclaredITDMethods();
        final int length = declaredITDMethods.length;
        int n = 0;
        while (true) {
            Label_0112: {
                if (n >= length) {
                    break Label_0112;
                }
                final InterTypeMethodDeclaration interTypeMethodDeclaration = declaredITDMethods[n];
                try {
                    if (!interTypeMethodDeclaration.getName().equals(s)) {
                        break Label_0112;
                    }
                    if (!interTypeMethodDeclaration.getTargetType().equals(ajType)) {
                        break Label_0112;
                    }
                    final AjType<?>[] parameterTypes = interTypeMethodDeclaration.getParameterTypes();
                    if (parameterTypes.length == array.length) {
                        for (int i = 0; i < parameterTypes.length; ++i) {
                            if (!parameterTypes[i].equals(array[i])) {
                                break Label_0112;
                            }
                        }
                        return interTypeMethodDeclaration;
                    }
                    break Label_0112;
                    throw new NoSuchMethodException(s);
                }
                catch (ClassNotFoundException ex) {}
            }
            ++n;
        }
    }
    
    @Override
    public InterTypeMethodDeclaration[] getDeclaredITDMethods() {
        if (this.declaredITDMethods == null) {
            final ArrayList<InterTypeMethodDeclaration> list = (ArrayList<InterTypeMethodDeclaration>)new ArrayList<InterTypeMethodDeclarationImpl>();
            for (final Method method : this.clazz.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(ajcITD.class)) {
                    final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                    list.add(new InterTypeMethodDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), ajcITD.name(), method));
                }
            }
            this.addAnnotationStyleITDMethods(list, false);
            list.toArray(this.declaredITDMethods = new InterTypeMethodDeclaration[list.size()]);
        }
        return this.declaredITDMethods;
    }
    
    @Override
    public Method getDeclaredMethod(final String s, final AjType<?>... array) throws NoSuchMethodException {
        final Method declaredMethod = this.clazz.getDeclaredMethod(s, this.toClassArray(array));
        if (!this.isReallyAMethod(declaredMethod)) {
            throw new NoSuchMethodException(s);
        }
        return declaredMethod;
    }
    
    @Override
    public Method[] getDeclaredMethods() {
        final Method[] declaredMethods = this.clazz.getDeclaredMethods();
        final ArrayList<Method> list = new ArrayList<Method>();
        for (final Method method : declaredMethods) {
            if (this.isReallyAMethod(method)) {
                list.add(method);
            }
        }
        final Method[] array = new Method[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public Pointcut getDeclaredPointcut(final String s) throws NoSuchPointcutException {
        for (final Pointcut pointcut : this.getDeclaredPointcuts()) {
            if (pointcut.getName().equals(s)) {
                return pointcut;
            }
        }
        throw new NoSuchPointcutException(s);
    }
    
    @Override
    public Pointcut[] getDeclaredPointcuts() {
        if (this.declaredPointcuts != null) {
            return this.declaredPointcuts;
        }
        final ArrayList<Pointcut> list = new ArrayList<Pointcut>();
        final Method[] declaredMethods = this.clazz.getDeclaredMethods();
        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
            final Pointcut pointcut = this.asPointcut(declaredMethods[i]);
            if (pointcut != null) {
                list.add(pointcut);
            }
        }
        final Pointcut[] declaredPointcuts = new Pointcut[list.size()];
        list.toArray(declaredPointcuts);
        return this.declaredPointcuts = declaredPointcuts;
    }
    
    @Override
    public AjType<?> getDeclaringType() {
        final Class<?> declaringClass = this.clazz.getDeclaringClass();
        if (declaringClass != null) {
            return new AjTypeImpl<Object>((Class<Object>)declaringClass);
        }
        return null;
    }
    
    @Override
    public Constructor getEnclosingConstructor() {
        return this.clazz.getEnclosingConstructor();
    }
    
    @Override
    public Method getEnclosingMethod() {
        return this.clazz.getEnclosingMethod();
    }
    
    @Override
    public AjType<?> getEnclosingType() {
        final Class<?> enclosingClass = this.clazz.getEnclosingClass();
        if (enclosingClass != null) {
            return new AjTypeImpl<Object>((Class<Object>)enclosingClass);
        }
        return null;
    }
    
    @Override
    public T[] getEnumConstants() {
        return this.clazz.getEnumConstants();
    }
    
    @Override
    public Field getField(final String s) throws NoSuchFieldException {
        final Field field = this.clazz.getField(s);
        if (field.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(s);
        }
        return field;
    }
    
    @Override
    public Field[] getFields() {
        final Field[] fields = this.clazz.getFields();
        final ArrayList<Field> list = new ArrayList<Field>();
        for (final Field field : fields) {
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                list.add(field);
            }
        }
        final Field[] array = new Field[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public Type getGenericSupertype() {
        return this.clazz.getGenericSuperclass();
    }
    
    @Override
    public InterTypeConstructorDeclaration getITDConstructor(final AjType<?> ajType, final AjType<?>... array) throws NoSuchMethodException {
        final InterTypeConstructorDeclaration[] itdConstructors = this.getITDConstructors();
        final int length = itdConstructors.length;
        int n = 0;
    Label_0086_Outer:
        while (true) {
            Label_0098: {
                if (n >= length) {
                    break Label_0098;
                }
                final InterTypeConstructorDeclaration interTypeConstructorDeclaration = itdConstructors[n];
            Label_0086:
                while (true) {
                    try {
                        if (interTypeConstructorDeclaration.getTargetType().equals(ajType)) {
                            final AjType<?>[] parameterTypes = interTypeConstructorDeclaration.getParameterTypes();
                            if (parameterTypes.length == array.length) {
                                for (int i = 0; i < parameterTypes.length; ++i) {
                                    if (!parameterTypes[i].equals(array[i])) {
                                        break Label_0086;
                                    }
                                }
                                return interTypeConstructorDeclaration;
                            }
                        }
                        ++n;
                        continue Label_0086_Outer;
                        throw new NoSuchMethodException();
                    }
                    catch (ClassNotFoundException ex) {
                        continue Label_0086;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public InterTypeConstructorDeclaration[] getITDConstructors() {
        if (this.itdCons == null) {
            final ArrayList<InterTypeConstructorDeclarationImpl> list = new ArrayList<InterTypeConstructorDeclarationImpl>();
            for (final Method method : this.clazz.getMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcITD.modifiers())) {
                        list.add(new InterTypeConstructorDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), method));
                    }
                }
            }
            list.toArray(this.itdCons = new InterTypeConstructorDeclaration[list.size()]);
        }
        return this.itdCons;
    }
    
    @Override
    public InterTypeFieldDeclaration getITDField(final String s, final AjType<?> ajType) throws NoSuchFieldException {
        for (final InterTypeFieldDeclaration interTypeFieldDeclaration : this.getITDFields()) {
            if (interTypeFieldDeclaration.getName().equals(s)) {
                try {
                    if (interTypeFieldDeclaration.getTargetType().equals(ajType)) {
                        return interTypeFieldDeclaration;
                    }
                }
                catch (ClassNotFoundException ex) {}
            }
        }
        throw new NoSuchFieldException(s);
    }
    
    @Override
    public InterTypeFieldDeclaration[] getITDFields() {
        final ArrayList<InterTypeFieldDeclaration> list = (ArrayList<InterTypeFieldDeclaration>)new ArrayList<InterTypeFieldDeclarationImpl>();
        if (this.itdFields == null) {
            for (final Method method : this.clazz.getMethods()) {
                Label_0079: {
                    if (method.isAnnotationPresent(ajcITD.class)) {
                        final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                        if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(ajcITD.modifiers())) {
                            final String replace = method.getName().replace("FieldInit", "FieldGetDispatch");
                            try {
                                final Method declaredMethod = method.getDeclaringClass().getDeclaredMethod(replace, method.getParameterTypes());
                                list.add(new InterTypeFieldDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), ajcITD.name(), AjTypeSystem.getAjType(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                                break Label_0079;
                            }
                            catch (NoSuchMethodException ex) {
                                throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                            }
                            break;
                        }
                    }
                }
            }
            this.addAnnotationStyleITDFields(list, true);
            list.toArray(this.itdFields = new InterTypeFieldDeclaration[list.size()]);
        }
        return this.itdFields;
    }
    
    @Override
    public InterTypeMethodDeclaration getITDMethod(final String s, final AjType<?> ajType, final AjType<?>... array) throws NoSuchMethodException {
        final InterTypeMethodDeclaration[] itdMethods = this.getITDMethods();
        final int length = itdMethods.length;
        int n = 0;
        while (true) {
            Label_0112: {
                if (n >= length) {
                    break Label_0112;
                }
                final InterTypeMethodDeclaration interTypeMethodDeclaration = itdMethods[n];
                try {
                    if (!interTypeMethodDeclaration.getName().equals(s)) {
                        break Label_0112;
                    }
                    if (!interTypeMethodDeclaration.getTargetType().equals(ajType)) {
                        break Label_0112;
                    }
                    final AjType<?>[] parameterTypes = interTypeMethodDeclaration.getParameterTypes();
                    if (parameterTypes.length == array.length) {
                        for (int i = 0; i < parameterTypes.length; ++i) {
                            if (!parameterTypes[i].equals(array[i])) {
                                break Label_0112;
                            }
                        }
                        return interTypeMethodDeclaration;
                    }
                    break Label_0112;
                    throw new NoSuchMethodException(s);
                }
                catch (ClassNotFoundException ex) {}
            }
            ++n;
        }
    }
    
    @Override
    public InterTypeMethodDeclaration[] getITDMethods() {
        if (this.itdMethods == null) {
            final ArrayList<InterTypeMethodDeclaration> list = (ArrayList<InterTypeMethodDeclaration>)new ArrayList<InterTypeMethodDeclarationImpl>();
            for (final Method method : this.clazz.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(ajcITD.class)) {
                    final ajcITD ajcITD = method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcITD.modifiers())) {
                        list.add(new InterTypeMethodDeclarationImpl(this, ajcITD.targetType(), ajcITD.modifiers(), ajcITD.name(), method));
                    }
                }
            }
            this.addAnnotationStyleITDMethods(list, true);
            list.toArray(this.itdMethods = new InterTypeMethodDeclaration[list.size()]);
        }
        return this.itdMethods;
    }
    
    @Override
    public AjType<?>[] getInterfaces() {
        return this.toAjTypeArray(this.clazz.getInterfaces());
    }
    
    @Override
    public Class<T> getJavaClass() {
        return this.clazz;
    }
    
    @Override
    public Method getMethod(final String s, final AjType<?>... array) throws NoSuchMethodException {
        final Method method = this.clazz.getMethod(s, this.toClassArray(array));
        if (!this.isReallyAMethod(method)) {
            throw new NoSuchMethodException(s);
        }
        return method;
    }
    
    @Override
    public Method[] getMethods() {
        final Method[] methods = this.clazz.getMethods();
        final ArrayList<Method> list = new ArrayList<Method>();
        for (final Method method : methods) {
            if (this.isReallyAMethod(method)) {
                list.add(method);
            }
        }
        final Method[] array = new Method[list.size()];
        list.toArray(array);
        return array;
    }
    
    @Override
    public int getModifiers() {
        return this.clazz.getModifiers();
    }
    
    @Override
    public String getName() {
        return this.clazz.getName();
    }
    
    @Override
    public Package getPackage() {
        return this.clazz.getPackage();
    }
    
    @Override
    public PerClause getPerClause() {
        if (!this.isAspect()) {
            return null;
        }
        final String value = this.clazz.getAnnotation(Aspect.class).value();
        if (value.equals("")) {
            if (this.getSupertype().isAspect()) {
                return this.getSupertype().getPerClause();
            }
            return new PerClauseImpl(PerClauseKind.SINGLETON);
        }
        else {
            if (value.startsWith("perthis(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTHIS, value.substring("perthis(".length(), -1 + value.length()));
            }
            if (value.startsWith("pertarget(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTARGET, value.substring("pertarget(".length(), -1 + value.length()));
            }
            if (value.startsWith("percflow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOW, value.substring("percflow(".length(), -1 + value.length()));
            }
            if (value.startsWith("percflowbelow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOWBELOW, value.substring("percflowbelow(".length(), -1 + value.length()));
            }
            if (value.startsWith("pertypewithin")) {
                return new TypePatternBasedPerClauseImpl(PerClauseKind.PERTYPEWITHIN, value.substring("pertypewithin(".length(), -1 + value.length()));
            }
            throw new IllegalStateException("Per-clause not recognized: " + value);
        }
    }
    
    @Override
    public Pointcut getPointcut(final String s) throws NoSuchPointcutException {
        for (final Pointcut pointcut : this.getPointcuts()) {
            if (pointcut.getName().equals(s)) {
                return pointcut;
            }
        }
        throw new NoSuchPointcutException(s);
    }
    
    @Override
    public Pointcut[] getPointcuts() {
        if (this.pointcuts != null) {
            return this.pointcuts;
        }
        final ArrayList<Pointcut> list = new ArrayList<Pointcut>();
        final Method[] methods = this.clazz.getMethods();
        for (int length = methods.length, i = 0; i < length; ++i) {
            final Pointcut pointcut = this.asPointcut(methods[i]);
            if (pointcut != null) {
                list.add(pointcut);
            }
        }
        final Pointcut[] pointcuts = new Pointcut[list.size()];
        list.toArray(pointcuts);
        return this.pointcuts = pointcuts;
    }
    
    @Override
    public AjType<? super T> getSupertype() {
        final Class<? super T> superclass = this.clazz.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return new AjTypeImpl<Object>((Class<Object>)superclass);
    }
    
    @Override
    public TypeVariable<Class<T>>[] getTypeParameters() {
        return this.clazz.getTypeParameters();
    }
    
    @Override
    public int hashCode() {
        return this.clazz.hashCode();
    }
    
    @Override
    public boolean isAnnotationPresent(final Class<? extends Annotation> clazz) {
        return this.clazz.isAnnotationPresent(clazz);
    }
    
    @Override
    public boolean isArray() {
        return this.clazz.isArray();
    }
    
    @Override
    public boolean isAspect() {
        return this.clazz.getAnnotation(Aspect.class) != null;
    }
    
    @Override
    public boolean isEnum() {
        return this.clazz.isEnum();
    }
    
    @Override
    public boolean isInstance(final Object o) {
        return this.clazz.isInstance(o);
    }
    
    @Override
    public boolean isInterface() {
        return this.clazz.isInterface();
    }
    
    @Override
    public boolean isLocalClass() {
        return this.clazz.isLocalClass() && !this.isAspect();
    }
    
    @Override
    public boolean isMemberAspect() {
        return this.clazz.isMemberClass() && this.isAspect();
    }
    
    @Override
    public boolean isMemberClass() {
        return this.clazz.isMemberClass() && !this.isAspect();
    }
    
    @Override
    public boolean isPrimitive() {
        return this.clazz.isPrimitive();
    }
    
    @Override
    public boolean isPrivileged() {
        return this.isAspect() && this.clazz.isAnnotationPresent(ajcPrivileged.class);
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
