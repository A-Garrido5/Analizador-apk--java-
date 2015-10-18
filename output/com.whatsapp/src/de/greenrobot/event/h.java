// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

final class h
{
    private static final String[] z;
    private d a;
    private d b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001bBK`\u0005#UOw@=S\u0006$G&S\njJsSKmI";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '%';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "=RFh\u00050FDjJ'\u0007Ha\u00056I[q@&BN";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    d a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        de/greenrobot/event/h.a:Lde/greenrobot/event/d;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        de/greenrobot/event/h.a:Lde/greenrobot/event/d;
        //    11: astore          5
        //    13: aload           5
        //    15: ifnull          41
        //    18: aload_0        
        //    19: aload_0        
        //    20: getfield        de/greenrobot/event/h.a:Lde/greenrobot/event/d;
        //    23: getfield        de/greenrobot/event/d.b:Lde/greenrobot/event/d;
        //    26: putfield        de/greenrobot/event/h.a:Lde/greenrobot/event/d;
        //    29: aload_0        
        //    30: getfield        de/greenrobot/event/h.a:Lde/greenrobot/event/d;
        //    33: ifnonnull       41
        //    36: aload_0        
        //    37: aconst_null    
        //    38: putfield        de/greenrobot/event/h.b:Lde/greenrobot/event/d;
        //    41: aload_0        
        //    42: monitorexit    
        //    43: aload_2        
        //    44: areturn        
        //    45: astore_3       
        //    46: aload_3        
        //    47: athrow         
        //    48: astore          4
        //    50: aload           4
        //    52: athrow         
        //    53: astore_1       
        //    54: aload_0        
        //    55: monitorexit    
        //    56: aload_1        
        //    57: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      7      53     58     Any
        //  7      13     45     48     Ljava/lang/NullPointerException;
        //  7      13     53     58     Any
        //  18     41     48     53     Ljava/lang/NullPointerException;
        //  18     41     53     58     Any
        //  46     48     48     53     Ljava/lang/NullPointerException;
        //  46     48     53     58     Any
        //  50     53     53     58     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    d a(final int n) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.wait(n);
                }
                return this.a();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    void a(final d d) {
        // monitorenter(this)
        if (d == null) {
            try {
                throw new NullPointerException(h.z[1]);
            }
            catch (NullPointerException ex) {
                try {
                    throw ex;
                }
                finally {
                }
                // monitorexit(this)
            }
        }
        while (true) {
            while (true) {
                try {
                    if (this.b != null) {
                        this.b.b = d;
                        this.b = d;
                        this.notifyAll();
                        // monitorexit(this)
                        return;
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
                try {
                    if (this.a == null) {
                        this.b = d;
                        this.a = d;
                        continue;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
                break;
            }
            break;
        }
        throw new IllegalStateException(h.z[0]);
    }
}
