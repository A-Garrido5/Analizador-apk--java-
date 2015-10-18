// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.lang.reflect.Method;
import java.io.Serializable;

public abstract class dS extends dt implements Serializable
{
    protected static boolean d = false;
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        final char[] charArray = "a6\u0019GiG'\u0012F;K6\u0004QzA6WAwG \u0004\u00029".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = '&';
                    break;
                }
                case 1: {
                    c2 = 'S';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = '\"';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0004s\u001aKhU:\u0019E;K6\u0003JtBsU".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u001b';
                    break;
                }
                case 0: {
                    c4 = '&';
                    break;
                }
                case 1: {
                    c4 = 'S';
                    break;
                }
                case 2: {
                    c4 = 'w';
                    break;
                }
                case 3: {
                    c4 = '\"';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0004}".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u001b';
                    break;
                }
                case 0: {
                    c6 = '&';
                    break;
                }
                case 1: {
                    c6 = 'S';
                    break;
                }
                case 2: {
                    c6 = 'w';
                    break;
                }
                case 3: {
                    c6 = '\"';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "r;\u001eQ;O WQnV#\u0018Q~Bs\u0003M;D6WMmC!\u0005K\u007fB6\u0019\u0002y_s\u0004WyE?\u0016QhC Y".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u001b';
                    break;
                }
                case 0: {
                    c8 = '&';
                    break;
                }
                case 1: {
                    c8 = 'S';
                    break;
                }
                case 2: {
                    c8 = 'w';
                    break;
                }
                case 3: {
                    c8 = '\"';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "r;\u001eQ;O WQnV#\u0018Q~Bs\u0003M;D6WMmC!\u0005K\u007fB6\u0019\u0002y_s\u0004WyE?\u0016QhC Y".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u001b';
                    break;
                }
                case 0: {
                    c10 = '&';
                    break;
                }
                case 1: {
                    c10 = 'S';
                    break;
                }
                case 2: {
                    c10 = 'w';
                    break;
                }
                case 3: {
                    c10 = '\"';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "e<\u0002N\u007fHt\u0003\u0002nU6WhzP2WP~@?\u0012AoO<\u0019\u0002oIs\u001eOkJ6\u001aGuRs\u0007PtR<\u0014Mw\u0006>\u0012QhG4\u0012\u0002iC5\u001bGxR:\u0018L5".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u001b';
                    break;
                }
                case 0: {
                    c12 = '&';
                    break;
                }
                case 1: {
                    c12 = 'S';
                    break;
                }
                case 2: {
                    c12 = 'w';
                    break;
                }
                case 3: {
                    c12 = '\"';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "s=\u0012ZkC0\u0003G\u007f\u00066\u000fA~V'\u001eMu\u0006'\u001fPtQ=W@b\u00064\u0012L~T2\u0003G\u007f\u00062\u0014A~U \u0018P;K6\u0003JtB}".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u001b';
                    break;
                }
                case 0: {
                    c14 = '&';
                    break;
                }
                case 1: {
                    c14 = 'S';
                    break;
                }
                case 2: {
                    c14 = 'w';
                    break;
                }
                case 3: {
                    c14 = '\"';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        z = z2;
        dS.d = false;
    }
    
    protected dS() {
    }
    
    protected dS(final fp fp) {
    }
    
    public static o a(final fm fm, final int n, final Class clazz, final fm fm2) {
        return new o(new d6(fm, n), clazz, fm2, null);
    }
    
    public static o a(final Class clazz, final fm fm) {
        return new o(null, clazz, fm, null);
    }
    
    static Object a(final Method method, final Object o, final Object[] array) {
        return b(method, o, array);
    }
    
    private static Method a(final Class clazz, final String s, final Class[] array) {
        try {
            return clazz.getMethod(s, (Class[])array);
        }
        catch (NoSuchMethodException ex) {
            throw new RuntimeException(dS.z[0] + clazz.getName() + dS.z[1] + s + dS.z[2], ex);
        }
    }
    
    static Map a(final dS ds) {
        return ds.b();
    }
    
    static void a() {
        dS.d = true;
    }
    
    private static Object b(final Method method, final Object o, final Object[] array) {
        try {
            return method.invoke(o, array);
        }
        catch (IllegalAccessException ex) {
            throw new RuntimeException(dS.z[5], ex);
        }
        catch (InvocationTargetException ex2) {
            final Throwable cause = ex2.getCause();
            try {
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
            }
            catch (IllegalAccessException ex3) {
                throw ex3;
            }
            try {
                if (cause instanceof Error) {
                    throw (Error)cause;
                }
            }
            catch (IllegalAccessException ex4) {
                throw ex4;
            }
            throw new RuntimeException(dS.z[6], cause);
        }
    }
    
    static Method b(final Class clazz, final String s, final Class[] array) {
        return a(clazz, s, array);
    }
    
    private Map b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_1       
        //     4: new             Ljava/util/TreeMap;
        //     7: dup            
        //     8: invokespecial   java/util/TreeMap.<init>:()V
        //    11: astore_2       
        //    12: aload_0        
        //    13: invokevirtual   com/google/dS.internalGetFieldAccessorTable:()Lcom/google/ch;
        //    16: invokestatic    com/google/ch.a:(Lcom/google/ch;)Lcom/google/bl;
        //    19: invokevirtual   com/google/bl.f:()Ljava/util/List;
        //    22: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    27: astore_3       
        //    28: aload_3        
        //    29: invokeinterface java/util/Iterator.hasNext:()Z
        //    34: ifeq            116
        //    37: aload_3        
        //    38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    43: checkcast       Lcom/google/hg;
        //    46: astore          4
        //    48: aload           4
        //    50: invokevirtual   com/google/hg.b:()Z
        //    53: ifeq            90
        //    56: aload_0        
        //    57: aload           4
        //    59: invokevirtual   com/google/dS.a:(Lcom/google/hg;)Ljava/lang/Object;
        //    62: checkcast       Ljava/util/List;
        //    65: astore          7
        //    67: aload           7
        //    69: invokeinterface java/util/List.isEmpty:()Z
        //    74: ifne            86
        //    77: aload_2        
        //    78: aload           4
        //    80: aload           7
        //    82: invokevirtual   java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    85: pop            
        //    86: iload_1        
        //    87: ifeq            112
        //    90: aload_0        
        //    91: aload           4
        //    93: invokevirtual   com/google/dS.b:(Lcom/google/hg;)Z
        //    96: ifeq            112
        //    99: aload_2        
        //   100: aload           4
        //   102: aload_0        
        //   103: aload           4
        //   105: invokevirtual   com/google/dS.a:(Lcom/google/hg;)Ljava/lang/Object;
        //   108: invokevirtual   java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   111: pop            
        //   112: iload_1        
        //   113: ifeq            28
        //   116: aload_2        
        //   117: areturn        
        //   118: astore          8
        //   120: aload           8
        //   122: athrow         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  67     86     118    123    Ljava/lang/UnsupportedOperationException;
        //  90     112    123    128    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public int a(final hg hg) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).c(this);
    }
    
    @Override
    public Object a(final hg hg) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).b(this);
    }
    
    public Object a(final hg hg, final int n) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).a(this, n);
    }
    
    @Override
    public Map a() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b());
    }
    
    protected boolean a(final cL cl, final aY ay, final fu fu, final int n) {
        return ay.a(n, cl);
    }
    
    @Override
    public boolean b(final hg hg) {
        return ch.a(this.internalGetFieldAccessorTable(), hg).a(this);
    }
    
    protected void c() {
    }
    
    @Override
    public bl getDescriptorForType() {
        return ch.a(this.internalGetFieldAccessorTable());
    }
    
    @Override
    public du getParserForType() {
        throw new UnsupportedOperationException(dS.z[4]);
    }
    
    @Override
    public ce getUnknownFields() {
        throw new UnsupportedOperationException(dS.z[3]);
    }
    
    protected abstract ch internalGetFieldAccessorTable();
    
    @Override
    public boolean isInitialized() {
        final boolean b = dt.b;
        for (final hg hg : this.getDescriptorForType().f()) {
            Label_0199: {
                Label_0159: {
                    Label_0067: {
                        try {
                            if (!hg.o()) {
                                break Label_0067;
                            }
                            final dS ds = this;
                            final hg hg2 = hg;
                            final boolean b2 = ds.b(hg2);
                            if (!b2) {
                                return false;
                            }
                            break Label_0067;
                        }
                        catch (UnsupportedOperationException ex) {
                            throw ex;
                        }
                        try {
                            final dS ds = this;
                            final hg hg2 = hg;
                            final boolean b2 = ds.b(hg2);
                            if (!b2) {
                                return false;
                            }
                        }
                        catch (UnsupportedOperationException ex2) {
                            throw ex2;
                        }
                        while (true) {
                            while (true) {
                                Label_0151: {
                                    fm fm;
                                    try {
                                        if (hg.n() != hD.MESSAGE) {
                                            break Label_0199;
                                        }
                                        if (!hg.b()) {
                                            break Label_0159;
                                        }
                                        final Iterator iterator2 = ((List)this.a(hg)).iterator();
                                        if (!iterator2.hasNext()) {
                                            break;
                                        }
                                        final fm fm2;
                                        fm = (fm2 = iterator2.next());
                                        final boolean initialized = fm2.isInitialized();
                                        final boolean initialized2 = initialized;
                                        if (!initialized2) {
                                            return false;
                                        }
                                        break Label_0151;
                                    }
                                    catch (UnsupportedOperationException ex3) {
                                        throw ex3;
                                    }
                                    try {
                                        final fm fm2 = fm;
                                        final boolean initialized2;
                                        final boolean initialized = initialized2 = fm2.isInitialized();
                                        if (!initialized2) {
                                            return false;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex4) {
                                        throw ex4;
                                    }
                                }
                                if (b) {
                                    break;
                                }
                                continue;
                            }
                        }
                    }
                    if (!b) {
                        break Label_0199;
                    }
                    try {
                        if (!this.b(hg)) {
                            break Label_0199;
                        }
                        final dS ds2 = this;
                        final hg hg3 = hg;
                        final Object o = ds2.a(hg3);
                        final fm fm3 = (fm)o;
                        final boolean b5 = fm3.isInitialized();
                        if (!b5) {
                            return false;
                        }
                        break Label_0199;
                    }
                    catch (UnsupportedOperationException ex5) {
                        throw ex5;
                    }
                }
                try {
                    final dS ds2 = this;
                    final hg hg3 = hg;
                    final Object o = ds2.a(hg3);
                    final fm fm3 = (fm)o;
                    final boolean b5 = fm3.isInitialized();
                    if (!b5) {
                        return false;
                    }
                }
                catch (UnsupportedOperationException ex6) {
                    throw ex6;
                }
            }
            if (b) {
                break;
            }
        }
        return true;
    }
    
    protected abstract a8 newBuilderForType(final dg p0);
    
    protected Object writeReplace() {
        return new dp(this);
    }
}
