// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public class p
{
    private static final String[] z;
    private final CopyOnWriteArraySet a;
    private final Map b;
    private final e c;
    private final Set d;
    private boolean e;
    
    static {
        final String[] z2 = new String[5];
        String s = "Z8pg+Z2pvx\b9yg*\u001f2|gx\u001b|mg?\u0013/kg*\u001f8?q(\b5qe";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t,mk6\u001d\u0015{\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t,mk6\u001d\u0010pm(\u001f.?k+Z.zs-\u0013.zf";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\t,mk6\u001d|vqx\b9nw1\b9{";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\t,mk6\u001d|vqx\u001b0mg9\u001e%?p=\u001d5lv=\b9{";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public p(final e c) {
        final int i = m.i;
        this.b = new HashMap();
        this.d = new CopyOnWriteArraySet();
        this.a = new CopyOnWriteArraySet();
        this.e = true;
        if (c == null) {
            throw new IllegalArgumentException(p.z[2]);
        }
        try {
            (this.c = c).a(this);
            if (com.facebook.rebound.e.a) {
                m.i = i + 1;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public m a() {
        final m m = new m(this);
        this.a(m);
        return m;
    }
    
    void a(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/facebook/rebound/p.d:Ljava/util/Set;
        //     8: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    13: astore          4
        //    15: aload           4
        //    17: invokeinterface java/util/Iterator.hasNext:()Z
        //    22: ifeq            96
        //    25: aload           4
        //    27: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    32: checkcast       Lcom/facebook/rebound/m;
        //    35: astore          5
        //    37: aload           5
        //    39: invokevirtual   com/facebook/rebound/m.d:()Z
        //    42: istore          8
        //    44: iload           8
        //    46: ifeq            67
        //    49: dload_1        
        //    50: ldc2_w          1000.0
        //    53: ddiv           
        //    54: dstore          10
        //    56: aload           5
        //    58: dload           10
        //    60: invokevirtual   com/facebook/rebound/m.e:(D)V
        //    63: iload_3        
        //    64: ifeq            92
        //    67: aload_0        
        //    68: getfield        com/facebook/rebound/p.d:Ljava/util/Set;
        //    71: aload           5
        //    73: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //    78: pop            
        //    79: goto            92
        //    82: astore          6
        //    84: aload           6
        //    86: athrow         
        //    87: astore          7
        //    89: aload           7
        //    91: athrow         
        //    92: iload_3        
        //    93: ifeq            15
        //    96: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  37     44     82     87     Ljava/lang/IllegalArgumentException;
        //  56     63     87     92     Ljava/lang/IllegalArgumentException;
        //  67     79     87     92     Ljava/lang/IllegalArgumentException;
        //  84     87     87     92     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
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
    
    void a(final m m) {
        if (m == null) {
            try {
                throw new IllegalArgumentException(p.z[3]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (this.b.containsKey(m.a())) {
                throw new IllegalArgumentException(p.z[4]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        this.b.put(m.a(), m);
    }
    
    void a(final String s) {
        final m m = this.b.get(s);
        if (m == null) {
            try {
                throw new IllegalArgumentException(p.z[1] + s + p.z[0]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            this.d.add(m);
            if (this.b()) {
                this.e = false;
                this.c.a();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public void b(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/facebook/rebound/m.i:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/facebook/rebound/p.a:Ljava/util/concurrent/CopyOnWriteArraySet;
        //     8: invokevirtual   java/util/concurrent/CopyOnWriteArraySet.iterator:()Ljava/util/Iterator;
        //    11: astore          4
        //    13: aload           4
        //    15: invokeinterface java/util/Iterator.hasNext:()Z
        //    20: ifeq            43
        //    23: aload           4
        //    25: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    30: checkcast       Lcom/facebook/rebound/n;
        //    33: aload_0        
        //    34: invokeinterface com/facebook/rebound/n.b:(Lcom/facebook/rebound/p;)V
        //    39: iload_3        
        //    40: ifeq            13
        //    43: aload_0        
        //    44: dload_1        
        //    45: invokevirtual   com/facebook/rebound/p.a:(D)V
        //    48: aload_0        
        //    49: getfield        com/facebook/rebound/p.d:Ljava/util/Set;
        //    52: invokeinterface java/util/Set.isEmpty:()Z
        //    57: ifeq            65
        //    60: aload_0        
        //    61: iconst_1       
        //    62: putfield        com/facebook/rebound/p.e:Z
        //    65: aload_0        
        //    66: getfield        com/facebook/rebound/p.a:Ljava/util/concurrent/CopyOnWriteArraySet;
        //    69: invokevirtual   java/util/concurrent/CopyOnWriteArraySet.iterator:()Ljava/util/Iterator;
        //    72: astore          6
        //    74: aload           6
        //    76: invokeinterface java/util/Iterator.hasNext:()Z
        //    81: ifeq            104
        //    84: aload           6
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: checkcast       Lcom/facebook/rebound/n;
        //    94: aload_0        
        //    95: invokeinterface com/facebook/rebound/n.a:(Lcom/facebook/rebound/p;)V
        //   100: iload_3        
        //   101: ifeq            74
        //   104: aload_0        
        //   105: getfield        com/facebook/rebound/p.e:Z
        //   108: ifeq            118
        //   111: aload_0        
        //   112: getfield        com/facebook/rebound/p.c:Lcom/facebook/rebound/e;
        //   115: invokevirtual   com/facebook/rebound/e.b:()V
        //   118: return         
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //   124: astore          7
        //   126: aload           7
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  43     65     119    124    Ljava/lang/IllegalArgumentException;
        //  104    118    124    129    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    public boolean b() {
        return this.e;
    }
}
