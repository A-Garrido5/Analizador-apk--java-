// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

final class i implements Runnable
{
    private static final String[] z;
    private final m a;
    private volatile boolean b;
    private final h c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u007f\u0002,\u001fR6\u001b9\t\u0000-\u0000=\u001c\u0006:\u0011";
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
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = 'u';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
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
                    s = "\u001a\u0003(\u0002\u0006";
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
    
    i(final m a) {
        this.a = a;
        this.c = new h();
    }
    
    public void a(final c c, final Object o) {
        final d a = d.a(c, o);
        synchronized (this) {
            this.c.a(a);
            if (!this.b) {
                this.b = true;
                this.a.a().execute(this);
            }
        }
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        de/greenrobot/event/i.c:Lde/greenrobot/event/h;
        //     4: sipush          1000
        //     7: invokevirtual   de/greenrobot/event/h.a:(I)Lde/greenrobot/event/d;
        //    10: astore          4
        //    12: aload           4
        //    14: ifnonnull       48
        //    17: aload_0        
        //    18: monitorenter   
        //    19: aload_0        
        //    20: getfield        de/greenrobot/event/i.c:Lde/greenrobot/event/h;
        //    23: invokevirtual   de/greenrobot/event/h.a:()Lde/greenrobot/event/d;
        //    26: astore          4
        //    28: aload           4
        //    30: ifnonnull       46
        //    33: aload_0        
        //    34: iconst_0       
        //    35: putfield        de/greenrobot/event/i.b:Z
        //    38: aload_0        
        //    39: monitorexit    
        //    40: aload_0        
        //    41: iconst_0       
        //    42: putfield        de/greenrobot/event/i.b:Z
        //    45: return         
        //    46: aload_0        
        //    47: monitorexit    
        //    48: aload_0        
        //    49: getfield        de/greenrobot/event/i.a:Lde/greenrobot/event/m;
        //    52: aload           4
        //    54: invokevirtual   de/greenrobot/event/m.a:(Lde/greenrobot/event/d;)V
        //    57: goto            0
        //    60: astore_2       
        //    61: getstatic       de/greenrobot/event/i.z:[Ljava/lang/String;
        //    64: iconst_1       
        //    65: aaload         
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: invokespecial   java/lang/StringBuilder.<init>:()V
        //    73: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    76: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: getstatic       de/greenrobot/event/i.z:[Ljava/lang/String;
        //    85: iconst_0       
        //    86: aaload         
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: aload_2        
        //    94: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    97: pop            
        //    98: aload_0        
        //    99: iconst_0       
        //   100: putfield        de/greenrobot/event/i.b:Z
        //   103: return         
        //   104: astore          5
        //   106: aload_0        
        //   107: monitorexit    
        //   108: aload           5
        //   110: athrow         
        //   111: astore_1       
        //   112: aload_0        
        //   113: iconst_0       
        //   114: putfield        de/greenrobot/event/i.b:Z
        //   117: aload_1        
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      12     60     104    Ljava/lang/InterruptedException;
        //  0      12     111    119    Any
        //  17     19     60     104    Ljava/lang/InterruptedException;
        //  17     19     111    119    Any
        //  19     28     104    111    Any
        //  33     40     104    111    Any
        //  46     48     104    111    Any
        //  48     57     60     104    Ljava/lang/InterruptedException;
        //  48     57     111    119    Any
        //  61     98     111    119    Any
        //  106    108    104    111    Any
        //  108    111    60     104    Ljava/lang/InterruptedException;
        //  108    111    111    119    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
