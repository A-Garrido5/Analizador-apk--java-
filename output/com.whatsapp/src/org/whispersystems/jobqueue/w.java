// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

class w implements Runnable
{
    private static final String z;
    final v a;
    final a b;
    
    static {
        final char[] charArray = "1Xw\rX\u0015Vr%K".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = '7';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    w(final v a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //     4: invokevirtual   org/whispersystems/jobqueue/a.h:()Z
        //     7: ifeq            24
        //    10: aload_0        
        //    11: getfield        org/whispersystems/jobqueue/w.a:Lorg/whispersystems/jobqueue/v;
        //    14: invokestatic    org/whispersystems/jobqueue/v.b:(Lorg/whispersystems/jobqueue/v;)Lorg/whispersystems/jobqueue/n;
        //    17: aload_0        
        //    18: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //    21: invokevirtual   org/whispersystems/jobqueue/n.a:(Lorg/whispersystems/jobqueue/a;)V
        //    24: aload_0        
        //    25: getfield        org/whispersystems/jobqueue/w.a:Lorg/whispersystems/jobqueue/v;
        //    28: invokestatic    org/whispersystems/jobqueue/v.d:(Lorg/whispersystems/jobqueue/v;)Lorg/whispersystems/jobqueue/c;
        //    31: aload_0        
        //    32: getfield        org/whispersystems/jobqueue/w.a:Lorg/whispersystems/jobqueue/v;
        //    35: invokestatic    org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/v;)Landroid/content/Context;
        //    38: aload_0        
        //    39: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //    42: invokevirtual   org/whispersystems/jobqueue/c.a:(Landroid/content/Context;Lorg/whispersystems/jobqueue/a;)V
        //    45: aload_0        
        //    46: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //    49: invokevirtual   org/whispersystems/jobqueue/a.f:()V
        //    52: aload_0        
        //    53: getfield        org/whispersystems/jobqueue/w.a:Lorg/whispersystems/jobqueue/v;
        //    56: invokestatic    org/whispersystems/jobqueue/v.c:(Lorg/whispersystems/jobqueue/v;)Lorg/whispersystems/jobqueue/t;
        //    59: aload_0        
        //    60: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //    63: invokevirtual   org/whispersystems/jobqueue/t.a:(Lorg/whispersystems/jobqueue/a;)V
        //    66: return         
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: getstatic       org/whispersystems/jobqueue/w.z:Ljava/lang/String;
        //    74: aload_2        
        //    75: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/Throwable;)I
        //    78: pop            
        //    79: aload_0        
        //    80: getfield        org/whispersystems/jobqueue/w.b:Lorg/whispersystems/jobqueue/a;
        //    83: invokevirtual   org/whispersystems/jobqueue/a.a:()V
        //    86: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      24     67     70     Ljava/io/IOException;
        //  24     66     70     87     Ljava/io/IOException;
        //  68     70     70     87     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
