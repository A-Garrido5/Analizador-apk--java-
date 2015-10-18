// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public abstract class fE implements aJ
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "d+\u0015^%X)T\\>Y#T[lT7\u0000_lW<\u0006[5\u0016:\u001cH)An\u0015Tl\u007f\u00011B/S>\u0000S#Xn\\I$Y;\u0018^lX+\u0002_>\u0016&\u0015J<S ]\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'L';
                    break;
                }
                case 0: {
                    c2 = '6';
                    break;
                }
                case 1: {
                    c2 = 'N';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = ':';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "d+\u0015^%X)T\\>Y#T[lt7\u0000_\u001fB<\u001dT+\u0016:\u001cH)An\u0015Tl\u007f\u00011B/S>\u0000S#Xn\\I$Y;\u0018^lX+\u0002_>\u0016&\u0015J<S ]\u0014".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'L';
                    break;
                }
                case 0: {
                    c4 = '6';
                    break;
                }
                case 1: {
                    c4 = 'N';
                    break;
                }
                case 2: {
                    c4 = 't';
                    break;
                }
                case 3: {
                    c4 = ':';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    private static void a(final Iterable iterable) {
        final boolean b = dt.b;
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == null) {
                try {
                    throw new NullPointerException();
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            if (b) {
                break;
            }
        }
    }
    
    protected static void a(final Iterable p0, final Collection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: instanceof      Lcom/google/eQ;
        //     8: istore          5
        //    10: iload           5
        //    12: ifeq            31
        //    15: aload_0        
        //    16: checkcast       Lcom/google/eQ;
        //    19: invokeinterface com/google/eQ.a:()Ljava/util/List;
        //    24: invokestatic    com/google/fE.a:(Ljava/lang/Iterable;)V
        //    27: iload_2        
        //    28: ifeq            35
        //    31: aload_0        
        //    32: invokestatic    com/google/fE.a:(Ljava/lang/Iterable;)V
        //    35: aload_0        
        //    36: instanceof      Ljava/util/Collection;
        //    39: ifeq            57
        //    42: aload_1        
        //    43: aload_0        
        //    44: checkcast       Ljava/util/Collection;
        //    47: invokeinterface java/util/Collection.addAll:(Ljava/util/Collection;)Z
        //    52: pop            
        //    53: iload_2        
        //    54: ifeq            93
        //    57: aload_0        
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          6
        //    65: aload           6
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            93
        //    75: aload_1        
        //    76: aload           6
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    88: pop            
        //    89: iload_2        
        //    90: ifeq            65
        //    93: return         
        //    94: astore_3       
        //    95: aload_3        
        //    96: athrow         
        //    97: astore          4
        //    99: aload           4
        //   101: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      10     94     97     Ljava/lang/RuntimeException;
        //  15     27     97     102    Ljava/lang/RuntimeException;
        //  31     35     97     102    Ljava/lang/RuntimeException;
        //  95     97     97     102    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    public aJ a(final byte[] array) {
        return this.a(array);
    }
    
    public fE a(final cL cl) {
        return this.mergeFrom(cl, fu.b());
    }
    
    public fE a(final hv hv, final fu fu) {
        try {
            final cL g = hv.g();
            this.mergeFrom(g, fu);
            g.g(0);
            return this;
        }
        catch (bg bg) {
            throw bg;
        }
        catch (IOException ex) {
            throw new RuntimeException(fE.z[1], ex);
        }
    }
    
    @Override
    public fE a(final byte[] array) {
        return this.a(array, 0, array.length);
    }
    
    public fE a(final byte[] array, final int n, final int n2) {
        try {
            final cL a = cL.a(array, n, n2);
            this.a(a);
            a.g(0);
            return this;
        }
        catch (bg bg) {
            throw bg;
        }
        catch (IOException ex) {
            throw new RuntimeException(fE.z[0], ex);
        }
    }
    
    public abstract fE clone();
    
    public Object clone() {
        return this.clone();
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public abstract fE mergeFrom(final cL p0, final fu p1);
}
