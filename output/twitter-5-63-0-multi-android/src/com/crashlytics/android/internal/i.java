// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

final class i implements t
{
    private final ScheduledExecutorService a;
    private final j b;
    private final bu c;
    private ScheduledFuture d;
    private int e;
    private m f;
    
    public i(final ScheduledExecutorService a, final j b, final bu c) {
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void a(final int n, final int n2) {
        try {
            final x x = new x(this.b, this);
            bd.c("Scheduling time based file roll over every " + n2 + " seconds");
            this.d = this.a.scheduleAtFixedRate(x, n, n2, TimeUnit.SECONDS);
        }
        catch (RejectedExecutionException ex) {
            bd.d("Crashlytics failed to schedule time based analytics file roll over");
        }
    }
    
    @Override
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/crashlytics/android/internal/i.f:Lcom/crashlytics/android/internal/m;
        //     4: ifnonnull       13
        //     7: ldc             "skipping analytics files send because we don't yet know the target endpoint"
        //     9: invokestatic    com/crashlytics/android/internal/bd.c:(Ljava/lang/String;)V
        //    12: return         
        //    13: ldc             "Sending all analytics files"
        //    15: invokestatic    com/crashlytics/android/internal/bd.c:(Ljava/lang/String;)V
        //    18: aload_0        
        //    19: getfield        com/crashlytics/android/internal/i.b:Lcom/crashlytics/android/internal/j;
        //    22: invokevirtual   com/crashlytics/android/internal/j.b:()Ljava/util/List;
        //    25: astore_1       
        //    26: iconst_0       
        //    27: istore_2       
        //    28: aload_1        
        //    29: invokeinterface java/util/List.size:()I
        //    34: ifle            196
        //    37: aload_0        
        //    38: getfield        com/crashlytics/android/internal/i.f:Lcom/crashlytics/android/internal/m;
        //    41: invokestatic    com/crashlytics/android/internal/c.a:()Lcom/crashlytics/android/internal/c;
        //    44: invokevirtual   com/crashlytics/android/internal/c.w:()Landroid/content/Context;
        //    47: iconst_0       
        //    48: invokestatic    com/crashlytics/android/internal/cj.a:(Landroid/content/Context;Z)Ljava/lang/String;
        //    51: aload_1        
        //    52: invokeinterface com/crashlytics/android/internal/m.a:(Ljava/lang/String;Ljava/util/List;)Z
        //    57: istore          6
        //    59: iload           6
        //    61: ifeq            89
        //    64: aload_1        
        //    65: invokeinterface java/util/List.size:()I
        //    70: istore          7
        //    72: iload           7
        //    74: iload_2        
        //    75: iadd           
        //    76: istore          4
        //    78: aload_0        
        //    79: getfield        com/crashlytics/android/internal/i.b:Lcom/crashlytics/android/internal/j;
        //    82: aload_1        
        //    83: invokevirtual   com/crashlytics/android/internal/j.a:(Ljava/util/List;)V
        //    86: iload           4
        //    88: istore_2       
        //    89: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    92: astore          8
        //    94: iconst_2       
        //    95: anewarray       Ljava/lang/Object;
        //    98: astore          9
        //   100: aload           9
        //   102: iconst_0       
        //   103: aload_1        
        //   104: invokeinterface java/util/List.size:()I
        //   109: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   112: aastore        
        //   113: iload           6
        //   115: ifeq            156
        //   118: ldc             "succeeded"
        //   120: astore          10
        //   122: aload           9
        //   124: iconst_1       
        //   125: aload           10
        //   127: aastore        
        //   128: aload           8
        //   130: ldc             "attempt to send batch of %d analytics files %s"
        //   132: aload           9
        //   134: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   137: invokestatic    com/crashlytics/android/internal/bd.c:(Ljava/lang/String;)V
        //   140: iload           6
        //   142: ifeq            196
        //   145: aload_0        
        //   146: getfield        com/crashlytics/android/internal/i.b:Lcom/crashlytics/android/internal/j;
        //   149: invokevirtual   com/crashlytics/android/internal/j.b:()Ljava/util/List;
        //   152: astore_1       
        //   153: goto            28
        //   156: ldc             "did not succeed"
        //   158: astore          10
        //   160: goto            122
        //   163: astore_3       
        //   164: iload_2        
        //   165: istore          4
        //   167: aload_3        
        //   168: astore          5
        //   170: new             Ljava/lang/StringBuilder;
        //   173: dup            
        //   174: ldc             "Crashlytics failed to send batch of analytics files to server: "
        //   176: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   179: aload           5
        //   181: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    com/crashlytics/android/internal/bd.d:(Ljava/lang/String;)V
        //   193: iload           4
        //   195: istore_2       
        //   196: iload_2        
        //   197: ifne            12
        //   200: aload_0        
        //   201: getfield        com/crashlytics/android/internal/i.b:Lcom/crashlytics/android/internal/j;
        //   204: invokevirtual   com/crashlytics/android/internal/j.d:()V
        //   207: return         
        //   208: astore          5
        //   210: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  28     59     163    170    Ljava/lang/Exception;
        //  64     72     163    170    Ljava/lang/Exception;
        //  78     86     208    213    Ljava/lang/Exception;
        //  89     113    163    170    Ljava/lang/Exception;
        //  122    140    163    170    Ljava/lang/Exception;
        //  145    153    163    170    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    public final void a(final ak ak, final String s) {
        this.f = new g(s, ak.a, this.c);
        this.b.a(ak);
        this.a(0, this.e = ak.b);
    }
    
    @Override
    public final void a(final u u) {
        int n;
        int n2;
        Label_0028_Outer:Label_0035_Outer:
        while (true) {
            n = 1;
            bd.c(u.toString());
            while (true) {
            Label_0072:
                while (true) {
                    while (true) {
                        try {
                            this.b.a(u);
                            if (this.e != -1) {
                                n2 = n;
                                if (this.d == null) {
                                    if (n2 != 0 && n != 0) {
                                        this.a(this.e, this.e);
                                    }
                                    return;
                                }
                                break Label_0072;
                            }
                        }
                        catch (IOException ex) {
                            bd.d("Crashlytics failed to write session event.");
                            continue Label_0028_Outer;
                        }
                        break;
                    }
                    n2 = 0;
                    continue Label_0035_Outer;
                }
                n = 0;
                continue;
            }
        }
    }
    
    @Override
    public final void b() {
        this.b.c();
    }
    
    @Override
    public final void c() {
        if (this.d != null) {
            bd.c("Cancelling time-based rollover because no events are currently being generated.");
            this.d.cancel(false);
            this.d = null;
        }
    }
    
    @Override
    public final void d() {
        try {
            this.b.a();
        }
        catch (IOException ex) {
            bd.d("Crashlytics failed to roll analytics file over.");
        }
    }
}
