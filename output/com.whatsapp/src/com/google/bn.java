// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;

class bn implements Iterator
{
    private static final String z;
    private boolean a;
    final gh b;
    private Iterator c;
    private int d;
    
    static {
        final char[] charArray = "VTFp_A\u0019\u0002?^EB\u000b|HH]N{\tFTMp[A\u0011EzQP\u0019\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '1';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private bn(final gh b) {
        this.b = b;
        this.d = -1;
    }
    
    bn(final gh gh, final gD gd) {
        this(gh);
    }
    
    private Iterator a() {
        try {
            if (this.c == null) {
                this.c = gh.b(this.b).entrySet().iterator();
            }
            return this.c;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public Map.Entry b() {
        try {
            this.a = true;
            final int d = 1 + this.d;
            this.d = d;
            if (d < gh.a(this.b).size()) {
                return (Map.Entry)gh.a(this.b).get(this.d);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return (Map.Entry)this.a().next();
    }
    
    @Override
    public boolean hasNext() {
        try {
            if (1 + this.d < gh.a(this.b).size()) {
                return true;
            }
            final bn bn = this;
            final Iterator iterator = bn.a();
            final boolean b = iterator.hasNext();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final bn bn = this;
            final Iterator iterator = bn.a();
            final boolean b = iterator.hasNext();
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    @Override
    public Object next() {
        return this.b();
    }
    
    @Override
    public void remove() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/bn.a:Z
        //     4: ifne            21
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: getstatic       com/google/bn.z:Ljava/lang/String;
        //    14: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    17: athrow         
        //    18: astore_1       
        //    19: aload_1        
        //    20: athrow         
        //    21: aload_0        
        //    22: iconst_0       
        //    23: putfield        com/google/bn.a:Z
        //    26: aload_0        
        //    27: getfield        com/google/bn.b:Lcom/google/gh;
        //    30: invokestatic    com/google/gh.c:(Lcom/google/gh;)V
        //    33: aload_0        
        //    34: getfield        com/google/bn.d:I
        //    37: istore          4
        //    39: aload_0        
        //    40: getfield        com/google/bn.b:Lcom/google/gh;
        //    43: invokestatic    com/google/gh.a:(Lcom/google/gh;)Ljava/util/List;
        //    46: invokeinterface java/util/List.size:()I
        //    51: istore          5
        //    53: iload           4
        //    55: iload           5
        //    57: if_icmpge       94
        //    60: aload_0        
        //    61: getfield        com/google/bn.b:Lcom/google/gh;
        //    64: astore          6
        //    66: aload_0        
        //    67: getfield        com/google/bn.d:I
        //    70: istore          7
        //    72: aload_0        
        //    73: iload           7
        //    75: iconst_1       
        //    76: isub           
        //    77: putfield        com/google/bn.d:I
        //    80: aload           6
        //    82: iload           7
        //    84: invokestatic    com/google/gh.a:(Lcom/google/gh;I)Ljava/lang/Object;
        //    87: pop            
        //    88: getstatic       com/google/dt.b:Z
        //    91: ifeq            110
        //    94: aload_0        
        //    95: invokespecial   com/google/bn.a:()Ljava/util/Iterator;
        //    98: invokeinterface java/util/Iterator.remove:()V
        //   103: return         
        //   104: astore_2       
        //   105: aload_2        
        //   106: athrow         
        //   107: astore_3       
        //   108: aload_3        
        //   109: athrow         
        //   110: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      18     18     21     Ljava/lang/IllegalStateException;
        //  21     53     104    107    Ljava/lang/IllegalStateException;
        //  60     94     107    110    Ljava/lang/IllegalStateException;
        //  94     103    107    110    Ljava/lang/IllegalStateException;
        //  105    107    107    110    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
}
