// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.UnlockSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.LockSignature;
import org.aspectj.lang.reflect.InitializerSignature;
import org.aspectj.lang.reflect.FieldSignature;
import org.aspectj.lang.reflect.ConstructorSignature;
import org.aspectj.lang.reflect.CatchClauseSignature;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AdviceSignature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.lang.Signature;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import java.lang.reflect.Member;
import java.util.Hashtable;

public final class Factory
{
    private static Object[] NO_ARGS;
    static Class class$java$lang$ClassNotFoundException;
    static Hashtable prims;
    int count;
    String filename;
    Class lexicalClass;
    ClassLoader lookupClassLoader;
    
    static {
        (Factory.prims = new Hashtable()).put("void", Void.TYPE);
        Factory.prims.put("boolean", Boolean.TYPE);
        Factory.prims.put("byte", Byte.TYPE);
        Factory.prims.put("char", Character.TYPE);
        Factory.prims.put("short", Short.TYPE);
        Factory.prims.put("int", Integer.TYPE);
        Factory.prims.put("long", Long.TYPE);
        Factory.prims.put("float", Float.TYPE);
        Factory.prims.put("double", Double.TYPE);
        Factory.NO_ARGS = new Object[0];
    }
    
    public Factory(final String filename, final Class lexicalClass) {
        this.filename = filename;
        this.lexicalClass = lexicalClass;
        this.count = 0;
        this.lookupClassLoader = lexicalClass.getClassLoader();
    }
    
    static Class class$(final String s) {
        try {
            return Class.forName(s);
        }
        catch (ClassNotFoundException ex) {
            throw new NoClassDefFoundError(ex.getMessage());
        }
    }
    
    static Class makeClass(final String s, final ClassLoader classLoader) {
        Class clazz;
        if (s.equals("*")) {
            clazz = null;
        }
        else {
            clazz = Factory.prims.get(s);
            if (clazz == null) {
                Label_0037: {
                    if (classLoader != null) {
                        break Label_0037;
                    }
                    try {
                        return Class.forName(s);
                        return Class.forName(s, false, classLoader);
                    }
                    catch (ClassNotFoundException ex) {
                        Class class$java$lang$ClassNotFoundException;
                        if (Factory.class$java$lang$ClassNotFoundException == null) {
                            class$java$lang$ClassNotFoundException = (Factory.class$java$lang$ClassNotFoundException = class$("java.lang.ClassNotFoundException"));
                        }
                        else {
                            class$java$lang$ClassNotFoundException = Factory.class$java$lang$ClassNotFoundException;
                        }
                        return class$java$lang$ClassNotFoundException;
                    }
                }
            }
        }
        return clazz;
    }
    
    public static JoinPoint.StaticPart makeEncSJP(final Member member) {
        CodeSignatureImpl codeSignatureImpl;
        String s;
        if (member instanceof Method) {
            final Method method = (Method)member;
            codeSignatureImpl = new MethodSignatureImpl(method.getModifiers(), method.getName(), method.getDeclaringClass(), method.getParameterTypes(), new String[method.getParameterTypes().length], method.getExceptionTypes(), method.getReturnType());
            s = "method-execution";
        }
        else {
            if (!(member instanceof Constructor)) {
                throw new IllegalArgumentException("member must be either a method or constructor");
            }
            final Constructor constructor = (Constructor)member;
            codeSignatureImpl = new ConstructorSignatureImpl(constructor.getModifiers(), constructor.getDeclaringClass(), constructor.getParameterTypes(), new String[constructor.getParameterTypes().length], constructor.getExceptionTypes());
            s = "constructor-execution";
        }
        return new JoinPointImpl.EnclosingStaticPartImpl(-1, s, codeSignatureImpl, null);
    }
    
    public static JoinPoint makeJP(final JoinPoint.StaticPart staticPart, final Object o, final Object o2) {
        return new JoinPointImpl(staticPart, o, o2, Factory.NO_ARGS);
    }
    
    public static JoinPoint makeJP(final JoinPoint.StaticPart staticPart, final Object o, final Object o2, final Object o3) {
        return new JoinPointImpl(staticPart, o, o2, new Object[] { o3 });
    }
    
    public static JoinPoint makeJP(final JoinPoint.StaticPart staticPart, final Object o, final Object o2, final Object o3, final Object o4) {
        return new JoinPointImpl(staticPart, o, o2, new Object[] { o3, o4 });
    }
    
    public static JoinPoint makeJP(final JoinPoint.StaticPart staticPart, final Object o, final Object o2, final Object[] array) {
        return new JoinPointImpl(staticPart, o, o2, array);
    }
    
    public AdviceSignature makeAdviceSig(final int n, final String s, final Class clazz, final Class[] array, final String[] array2, final Class[] array3, final Class clazz2) {
        final AdviceSignatureImpl adviceSignatureImpl = new AdviceSignatureImpl(n, s, clazz, array, array2, array3, clazz2);
        adviceSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return adviceSignatureImpl;
    }
    
    public AdviceSignature makeAdviceSig(final String s) {
        final AdviceSignatureImpl adviceSignatureImpl = new AdviceSignatureImpl(s);
        adviceSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return adviceSignatureImpl;
    }
    
    public AdviceSignature makeAdviceSig(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        final int int1 = Integer.parseInt(s, 16);
        final Class class1 = makeClass(s3, this.lookupClassLoader);
        final StringTokenizer stringTokenizer = new StringTokenizer(s4, ":");
        final int countTokens = stringTokenizer.countTokens();
        final Class[] array = new Class[countTokens];
        for (int i = 0; i < countTokens; ++i) {
            array[i] = makeClass(stringTokenizer.nextToken(), this.lookupClassLoader);
        }
        final StringTokenizer stringTokenizer2 = new StringTokenizer(s5, ":");
        final int countTokens2 = stringTokenizer2.countTokens();
        final String[] array2 = new String[countTokens2];
        for (int j = 0; j < countTokens2; ++j) {
            array2[j] = stringTokenizer2.nextToken();
        }
        final StringTokenizer stringTokenizer3 = new StringTokenizer(s6, ":");
        final int countTokens3 = stringTokenizer3.countTokens();
        final Class[] array3 = new Class[countTokens3];
        for (int k = 0; k < countTokens3; ++k) {
            array3[k] = makeClass(stringTokenizer3.nextToken(), this.lookupClassLoader);
        }
        final AdviceSignatureImpl adviceSignatureImpl = new AdviceSignatureImpl(int1, s2, class1, array, array2, array3, makeClass(s7, this.lookupClassLoader));
        adviceSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return adviceSignatureImpl;
    }
    
    public CatchClauseSignature makeCatchClauseSig(final Class clazz, final Class clazz2, final String s) {
        final CatchClauseSignatureImpl catchClauseSignatureImpl = new CatchClauseSignatureImpl(clazz, clazz2, s);
        catchClauseSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignatureImpl;
    }
    
    public CatchClauseSignature makeCatchClauseSig(final String s) {
        final CatchClauseSignatureImpl catchClauseSignatureImpl = new CatchClauseSignatureImpl(s);
        catchClauseSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignatureImpl;
    }
    
    public CatchClauseSignature makeCatchClauseSig(final String s, final String s2, final String s3) {
        final CatchClauseSignatureImpl catchClauseSignatureImpl = new CatchClauseSignatureImpl(makeClass(s, this.lookupClassLoader), makeClass(new StringTokenizer(s2, ":").nextToken(), this.lookupClassLoader), new StringTokenizer(s3, ":").nextToken());
        catchClauseSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignatureImpl;
    }
    
    public ConstructorSignature makeConstructorSig(final int n, final Class clazz, final Class[] array, final String[] array2, final Class[] array3) {
        final ConstructorSignatureImpl constructorSignatureImpl = new ConstructorSignatureImpl(n, clazz, array, array2, array3);
        constructorSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return constructorSignatureImpl;
    }
    
    public ConstructorSignature makeConstructorSig(final String s) {
        final ConstructorSignatureImpl constructorSignatureImpl = new ConstructorSignatureImpl(s);
        constructorSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return constructorSignatureImpl;
    }
    
    public ConstructorSignature makeConstructorSig(final String s, final String s2, final String s3, final String s4, final String s5) {
        final int int1 = Integer.parseInt(s, 16);
        final Class class1 = makeClass(s2, this.lookupClassLoader);
        final StringTokenizer stringTokenizer = new StringTokenizer(s3, ":");
        final int countTokens = stringTokenizer.countTokens();
        final Class[] array = new Class[countTokens];
        for (int i = 0; i < countTokens; ++i) {
            array[i] = makeClass(stringTokenizer.nextToken(), this.lookupClassLoader);
        }
        final StringTokenizer stringTokenizer2 = new StringTokenizer(s4, ":");
        final int countTokens2 = stringTokenizer2.countTokens();
        final String[] array2 = new String[countTokens2];
        for (int j = 0; j < countTokens2; ++j) {
            array2[j] = stringTokenizer2.nextToken();
        }
        final StringTokenizer stringTokenizer3 = new StringTokenizer(s5, ":");
        final int countTokens3 = stringTokenizer3.countTokens();
        final Class[] array3 = new Class[countTokens3];
        for (int k = 0; k < countTokens3; ++k) {
            array3[k] = makeClass(stringTokenizer3.nextToken(), this.lookupClassLoader);
        }
        final ConstructorSignatureImpl constructorSignatureImpl = new ConstructorSignatureImpl(int1, class1, array, array2, array3);
        constructorSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return constructorSignatureImpl;
    }
    
    public JoinPoint.EnclosingStaticPart makeESJP(final String s, final Signature signature, final int n) {
        return new JoinPointImpl.EnclosingStaticPartImpl(this.count++, s, signature, this.makeSourceLoc(n, -1));
    }
    
    public JoinPoint.EnclosingStaticPart makeESJP(final String s, final Signature signature, final int n, final int n2) {
        return new JoinPointImpl.EnclosingStaticPartImpl(this.count++, s, signature, this.makeSourceLoc(n, n2));
    }
    
    public JoinPoint.EnclosingStaticPart makeESJP(final String s, final Signature signature, final SourceLocation sourceLocation) {
        return new JoinPointImpl.EnclosingStaticPartImpl(this.count++, s, signature, sourceLocation);
    }
    
    public FieldSignature makeFieldSig(final int n, final String s, final Class clazz, final Class clazz2) {
        final FieldSignatureImpl fieldSignatureImpl = new FieldSignatureImpl(n, s, clazz, clazz2);
        fieldSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return fieldSignatureImpl;
    }
    
    public FieldSignature makeFieldSig(final String s) {
        final FieldSignatureImpl fieldSignatureImpl = new FieldSignatureImpl(s);
        fieldSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return fieldSignatureImpl;
    }
    
    public FieldSignature makeFieldSig(final String s, final String s2, final String s3, final String s4) {
        final FieldSignatureImpl fieldSignatureImpl = new FieldSignatureImpl(Integer.parseInt(s, 16), s2, makeClass(s3, this.lookupClassLoader), makeClass(s4, this.lookupClassLoader));
        fieldSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return fieldSignatureImpl;
    }
    
    public InitializerSignature makeInitializerSig(final int n, final Class clazz) {
        final InitializerSignatureImpl initializerSignatureImpl = new InitializerSignatureImpl(n, clazz);
        initializerSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return initializerSignatureImpl;
    }
    
    public InitializerSignature makeInitializerSig(final String s) {
        final InitializerSignatureImpl initializerSignatureImpl = new InitializerSignatureImpl(s);
        initializerSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return initializerSignatureImpl;
    }
    
    public InitializerSignature makeInitializerSig(final String s, final String s2) {
        final InitializerSignatureImpl initializerSignatureImpl = new InitializerSignatureImpl(Integer.parseInt(s, 16), makeClass(s2, this.lookupClassLoader));
        initializerSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return initializerSignatureImpl;
    }
    
    public LockSignature makeLockSig() {
        final LockSignatureImpl lockSignatureImpl = new LockSignatureImpl(makeClass("Ljava/lang/Object;", this.lookupClassLoader));
        lockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return lockSignatureImpl;
    }
    
    public LockSignature makeLockSig(final Class clazz) {
        final LockSignatureImpl lockSignatureImpl = new LockSignatureImpl(clazz);
        lockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return lockSignatureImpl;
    }
    
    public LockSignature makeLockSig(final String s) {
        final LockSignatureImpl lockSignatureImpl = new LockSignatureImpl(s);
        lockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return lockSignatureImpl;
    }
    
    public MethodSignature makeMethodSig(final int n, final String s, final Class clazz, final Class[] array, final String[] array2, final Class[] array3, final Class clazz2) {
        final MethodSignatureImpl methodSignatureImpl = new MethodSignatureImpl(n, s, clazz, array, array2, array3, clazz2);
        methodSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return methodSignatureImpl;
    }
    
    public MethodSignature makeMethodSig(final String s) {
        final MethodSignatureImpl methodSignatureImpl = new MethodSignatureImpl(s);
        methodSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return methodSignatureImpl;
    }
    
    public MethodSignature makeMethodSig(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        final int int1 = Integer.parseInt(s, 16);
        final Class class1 = makeClass(s3, this.lookupClassLoader);
        final StringTokenizer stringTokenizer = new StringTokenizer(s4, ":");
        final int countTokens = stringTokenizer.countTokens();
        final Class[] array = new Class[countTokens];
        for (int i = 0; i < countTokens; ++i) {
            array[i] = makeClass(stringTokenizer.nextToken(), this.lookupClassLoader);
        }
        final StringTokenizer stringTokenizer2 = new StringTokenizer(s5, ":");
        final int countTokens2 = stringTokenizer2.countTokens();
        final String[] array2 = new String[countTokens2];
        for (int j = 0; j < countTokens2; ++j) {
            array2[j] = stringTokenizer2.nextToken();
        }
        final StringTokenizer stringTokenizer3 = new StringTokenizer(s6, ":");
        final int countTokens3 = stringTokenizer3.countTokens();
        final Class[] array3 = new Class[countTokens3];
        for (int k = 0; k < countTokens3; ++k) {
            array3[k] = makeClass(stringTokenizer3.nextToken(), this.lookupClassLoader);
        }
        return new MethodSignatureImpl(int1, s2, class1, array, array2, array3, makeClass(s7, this.lookupClassLoader));
    }
    
    public JoinPoint.StaticPart makeSJP(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final int n) {
        return new JoinPointImpl.StaticPartImpl(this.count++, s, this.makeMethodSig(s2, s3, s4, s5, s6, "", s7), this.makeSourceLoc(n, -1));
    }
    
    public JoinPoint.StaticPart makeSJP(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final int n) {
        return new JoinPointImpl.StaticPartImpl(this.count++, s, this.makeMethodSig(s2, s3, s4, s5, s6, s7, s8), this.makeSourceLoc(n, -1));
    }
    
    public JoinPoint.StaticPart makeSJP(final String s, final Signature signature, final int n) {
        return new JoinPointImpl.StaticPartImpl(this.count++, s, signature, this.makeSourceLoc(n, -1));
    }
    
    public JoinPoint.StaticPart makeSJP(final String s, final Signature signature, final int n, final int n2) {
        return new JoinPointImpl.StaticPartImpl(this.count++, s, signature, this.makeSourceLoc(n, n2));
    }
    
    public JoinPoint.StaticPart makeSJP(final String s, final Signature signature, final SourceLocation sourceLocation) {
        return new JoinPointImpl.StaticPartImpl(this.count++, s, signature, sourceLocation);
    }
    
    public SourceLocation makeSourceLoc(final int n, final int n2) {
        return new SourceLocationImpl(this.lexicalClass, this.filename, n);
    }
    
    public UnlockSignature makeUnlockSig() {
        final UnlockSignatureImpl unlockSignatureImpl = new UnlockSignatureImpl(makeClass("Ljava/lang/Object;", this.lookupClassLoader));
        unlockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return unlockSignatureImpl;
    }
    
    public UnlockSignature makeUnlockSig(final Class clazz) {
        final UnlockSignatureImpl unlockSignatureImpl = new UnlockSignatureImpl(clazz);
        unlockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return unlockSignatureImpl;
    }
    
    public UnlockSignature makeUnlockSig(final String s) {
        final UnlockSignatureImpl unlockSignatureImpl = new UnlockSignatureImpl(s);
        unlockSignatureImpl.setLookupClassLoader(this.lookupClassLoader);
        return unlockSignatureImpl;
    }
}
