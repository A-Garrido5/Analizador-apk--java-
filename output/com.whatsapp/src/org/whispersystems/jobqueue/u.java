// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import android.util.Log;

class u extends Thread
{
    private static final String c;
    private final t a;
    private final n b;
    
    static {
        c = u.class.getSimpleName();
    }
    
    public u(final String s, final t a, final n b) {
        super(s);
        this.a = a;
        this.b = b;
    }
    
    private h a(final a a) {
        int n;
        for (int e = a.e(), i = a.j(); i < e; i = n) {
            try {
                a.l();
                return h.SUCCESS;
            }
            catch (Exception ex) {
                try {
                    Log.w(u.c, (Throwable)ex);
                    if (ex instanceof RuntimeException) {
                        throw (RuntimeException)ex;
                    }
                }
                catch (Exception ex2) {
                    throw ex2;
                }
                try {
                    if (!a.a(ex)) {
                        return h.FAILURE;
                    }
                }
                catch (Exception ex3) {
                    throw ex3;
                }
                try {
                    if (!a.b()) {
                        a.a(i + 1);
                        return h.DEFERRED;
                    }
                }
                catch (Exception ex4) {
                    throw ex4;
                }
                n = i + 1;
                if (!v.h) {
                    continue;
                }
            }
            break;
        }
        return h.FAILURE;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/jobqueue/v.h:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/jobqueue/u.a:Lorg/whispersystems/jobqueue/t;
        //     8: invokevirtual   org/whispersystems/jobqueue/t.c:()Lorg/whispersystems/jobqueue/a;
        //    11: astore_2       
        //    12: aload_0        
        //    13: aload_2        
        //    14: invokespecial   org/whispersystems/jobqueue/u.a:(Lorg/whispersystems/jobqueue/a;)Lorg/whispersystems/jobqueue/h;
        //    17: astore_3       
        //    18: getstatic       org/whispersystems/jobqueue/h.DEFERRED:Lorg/whispersystems/jobqueue/h;
        //    21: astore          7
        //    23: aload_3        
        //    24: aload           7
        //    26: if_acmpne       41
        //    29: aload_0        
        //    30: getfield        org/whispersystems/jobqueue/u.a:Lorg/whispersystems/jobqueue/t;
        //    33: aload_2        
        //    34: invokevirtual   org/whispersystems/jobqueue/t.b:(Lorg/whispersystems/jobqueue/a;)V
        //    37: iload_1        
        //    38: ifeq            97
        //    41: aload_3        
        //    42: getstatic       org/whispersystems/jobqueue/h.FAILURE:Lorg/whispersystems/jobqueue/h;
        //    45: if_acmpne       52
        //    48: aload_2        
        //    49: invokevirtual   org/whispersystems/jobqueue/a.a:()V
        //    52: aload_2        
        //    53: invokevirtual   org/whispersystems/jobqueue/a.h:()Z
        //    56: ifeq            70
        //    59: aload_0        
        //    60: getfield        org/whispersystems/jobqueue/u.b:Lorg/whispersystems/jobqueue/n;
        //    63: aload_2        
        //    64: invokevirtual   org/whispersystems/jobqueue/a.g:()J
        //    67: invokevirtual   org/whispersystems/jobqueue/n.a:(J)V
        //    70: aload_2        
        //    71: invokevirtual   org/whispersystems/jobqueue/a.m:()Landroid/os/PowerManager$WakeLock;
        //    74: astore          11
        //    76: aload           11
        //    78: ifnull          97
        //    81: aload_2        
        //    82: invokevirtual   org/whispersystems/jobqueue/a.n:()J
        //    85: lconst_0       
        //    86: lcmp           
        //    87: ifne            97
        //    90: aload_2        
        //    91: invokevirtual   org/whispersystems/jobqueue/a.m:()Landroid/os/PowerManager$WakeLock;
        //    94: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    97: aload_2        
        //    98: invokevirtual   org/whispersystems/jobqueue/a.d:()Ljava/lang/String;
        //   101: ifnull          4
        //   104: aload_0        
        //   105: getfield        org/whispersystems/jobqueue/u.a:Lorg/whispersystems/jobqueue/t;
        //   108: aload_2        
        //   109: invokevirtual   org/whispersystems/jobqueue/a.d:()Ljava/lang/String;
        //   112: invokevirtual   org/whispersystems/jobqueue/t.a:(Ljava/lang/String;)V
        //   115: goto            4
        //   118: astore          12
        //   120: aload           12
        //   122: athrow         
        //   123: astore          4
        //   125: aload           4
        //   127: athrow         
        //   128: astore          5
        //   130: aload           5
        //   132: athrow         
        //   133: astore          6
        //   135: aload           6
        //   137: athrow         
        //   138: astore          8
        //   140: aload           8
        //   142: athrow         
        //   143: astore          9
        //   145: aload           9
        //   147: athrow         
        //   148: astore          10
        //   150: aload           10
        //   152: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  18     23     123    128    Ljava/lang/RuntimeException;
        //  29     37     128    133    Ljava/lang/RuntimeException;
        //  41     52     133    138    Ljava/lang/RuntimeException;
        //  52     70     138    143    Ljava/lang/RuntimeException;
        //  70     76     143    148    Ljava/lang/RuntimeException;
        //  81     97     148    153    Ljava/lang/RuntimeException;
        //  97     115    118    123    Ljava/lang/RuntimeException;
        //  125    128    128    133    Ljava/lang/RuntimeException;
        //  130    133    133    138    Ljava/lang/RuntimeException;
        //  145    148    148    153    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 77, Size: 77
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
