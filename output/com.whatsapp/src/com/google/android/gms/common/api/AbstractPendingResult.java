// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import android.util.Log;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import com.google.android.gms.common.internal.ICancelToken;
import java.util.ArrayList;

public abstract class AbstractPendingResult implements PendingResult
{
    protected final AbstractPendingResult$CallbackHandler mHandler;
    private boolean zzL;
    private final Object zzWb;
    private final ArrayList zzWc;
    private ResultCallback zzWd;
    private volatile Result zzWe;
    private volatile boolean zzWf;
    private boolean zzWg;
    private ICancelToken zzWh;
    private final CountDownLatch zzoD;
    
    protected AbstractPendingResult(final Looper looper) {
        this.zzWb = new Object();
        this.zzoD = new CountDownLatch(1);
        this.zzWc = new ArrayList();
        this.mHandler = new AbstractPendingResult$CallbackHandler(looper);
    }
    
    private void zza(final Result p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        com/google/android/gms/common/api/AbstractPendingResult.zzWe:Lcom/google/android/gms/common/api/Result;
        //     9: aload_0        
        //    10: aconst_null    
        //    11: putfield        com/google/android/gms/common/api/AbstractPendingResult.zzWh:Lcom/google/android/gms/common/internal/ICancelToken;
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzoD:Ljava/util/concurrent/CountDownLatch;
        //    18: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    21: aload_0        
        //    22: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWe:Lcom/google/android/gms/common/api/Result;
        //    25: invokeinterface com/google/android/gms/common/api/Result.getStatus:()Lcom/google/android/gms/common/api/Status;
        //    30: astore_3       
        //    31: aload_0        
        //    32: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWd:Lcom/google/android/gms/common/api/ResultCallback;
        //    35: astore          6
        //    37: aload           6
        //    39: ifnull          71
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/common/api/AbstractPendingResult.mHandler:Lcom/google/android/gms/common/api/AbstractPendingResult$CallbackHandler;
        //    46: invokevirtual   com/google/android/gms/common/api/AbstractPendingResult$CallbackHandler.removeTimeoutMessages:()V
        //    49: aload_0        
        //    50: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzL:Z
        //    53: ifne            71
        //    56: aload_0        
        //    57: getfield        com/google/android/gms/common/api/AbstractPendingResult.mHandler:Lcom/google/android/gms/common/api/AbstractPendingResult$CallbackHandler;
        //    60: aload_0        
        //    61: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWd:Lcom/google/android/gms/common/api/ResultCallback;
        //    64: aload_0        
        //    65: invokespecial   com/google/android/gms/common/api/AbstractPendingResult.zzmo:()Lcom/google/android/gms/common/api/Result;
        //    68: invokevirtual   com/google/android/gms/common/api/AbstractPendingResult$CallbackHandler.sendResultCallback:(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V
        //    71: aload_0        
        //    72: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWc:Ljava/util/ArrayList;
        //    75: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    78: astore          7
        //    80: aload           7
        //    82: invokeinterface java/util/Iterator.hasNext:()Z
        //    87: ifeq            110
        //    90: aload           7
        //    92: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    97: checkcast       Lcom/google/android/gms/common/api/PendingResult$BatchCallback;
        //   100: aload_3        
        //   101: invokeinterface com/google/android/gms/common/api/PendingResult$BatchCallback.zzs:(Lcom/google/android/gms/common/api/Status;)V
        //   106: iload_2        
        //   107: ifeq            80
        //   110: aload_0        
        //   111: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWc:Ljava/util/ArrayList;
        //   114: invokevirtual   java/util/ArrayList.clear:()V
        //   117: return         
        //   118: astore          4
        //   120: aload           4
        //   122: athrow         
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  31     37     118    123    Ljava/lang/RuntimeException;
        //  42     71     123    128    Ljava/lang/RuntimeException;
        //  120    123    123    128    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    static void zzb(final Result result) {
        if (!(result instanceof Releasable)) {
            return;
        }
        try {
            ((Releasable)result).release();
        }
        catch (RuntimeException ex) {
            Log.w("AbstractPendingResult", "Unable to release " + result, (Throwable)ex);
        }
    }
    
    private Result zzmo() {
        boolean b = true;
        synchronized (this.zzWb) {
            if (this.zzWf) {
                b = false;
            }
            zzu.zza(b, "Result has already been consumed.");
            zzu.zza(this.isReady(), "Result is not ready.");
            final Result zzWe = this.zzWe;
            this.zzWe = null;
            this.zzWd = null;
            this.zzWf = true;
            // monitorexit(this.zzWb)
            this.onResultConsumed();
            return zzWe;
        }
    }
    
    public void cancel() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWb:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzL:Z
        //    11: ifne            21
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWf:Z
        //    18: ifeq            24
        //    21: aload_1        
        //    22: monitorexit    
        //    23: return         
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWh:Lcom/google/android/gms/common/internal/ICancelToken;
        //    28: astore          4
        //    30: aload           4
        //    32: ifnull          44
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWh:Lcom/google/android/gms/common/internal/ICancelToken;
        //    39: invokeinterface com/google/android/gms/common/internal/ICancelToken.cancel:()V
        //    44: aload_0        
        //    45: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWe:Lcom/google/android/gms/common/api/Result;
        //    48: invokestatic    com/google/android/gms/common/api/AbstractPendingResult.zzb:(Lcom/google/android/gms/common/api/Result;)V
        //    51: aload_0        
        //    52: aconst_null    
        //    53: putfield        com/google/android/gms/common/api/AbstractPendingResult.zzWd:Lcom/google/android/gms/common/api/ResultCallback;
        //    56: aload_0        
        //    57: iconst_1       
        //    58: putfield        com/google/android/gms/common/api/AbstractPendingResult.zzL:Z
        //    61: aload_0        
        //    62: aload_0        
        //    63: getstatic       com/google/android/gms/common/api/Status.zzXT:Lcom/google/android/gms/common/api/Status;
        //    66: invokevirtual   com/google/android/gms/common/api/AbstractPendingResult.createFailedResult:(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
        //    69: invokespecial   com/google/android/gms/common/api/AbstractPendingResult.zza:(Lcom/google/android/gms/common/api/Result;)V
        //    72: aload_1        
        //    73: monitorexit    
        //    74: return         
        //    75: astore_2       
        //    76: aload_1        
        //    77: monitorexit    
        //    78: aload_2        
        //    79: athrow         
        //    80: astore_3       
        //    81: aload_3        
        //    82: athrow         
        //    83: astore          5
        //    85: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      21     75     80     Any
        //  21     23     75     80     Any
        //  24     30     80     83     Ljava/lang/RuntimeException;
        //  24     30     75     80     Any
        //  35     44     83     88     Landroid/os/RemoteException;
        //  35     44     80     83     Ljava/lang/RuntimeException;
        //  35     44     75     80     Any
        //  44     74     75     80     Any
        //  76     78     75     80     Any
        //  81     83     75     80     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 49, Size: 49
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
    
    protected abstract Result createFailedResult(final Status p0);
    
    public final void forceFailureUnlessReady(final Status status) {
        synchronized (this.zzWb) {
            if (!this.isReady()) {
                this.setResult(this.createFailedResult(status));
                this.zzWg = true;
            }
        }
    }
    
    public final boolean isReady() {
        try {
            if (this.zzoD.getCount() == 0L) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    protected void onResultConsumed() {
    }
    
    public final void setResult(final Result p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWb:Ljava/lang/Object;
        //     6: astore_3       
        //     7: aload_3        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWg:Z
        //    13: ifne            23
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzL:Z
        //    20: ifeq            30
        //    23: aload_1        
        //    24: invokestatic    com/google/android/gms/common/api/AbstractPendingResult.zzb:(Lcom/google/android/gms/common/api/Result;)V
        //    27: aload_3        
        //    28: monitorexit    
        //    29: return         
        //    30: aload_0        
        //    31: invokevirtual   com/google/android/gms/common/api/AbstractPendingResult.isReady:()Z
        //    34: istore          6
        //    36: iload           6
        //    38: ifne            98
        //    41: iload_2        
        //    42: istore          7
        //    44: iload           7
        //    46: ldc             "Results have already been set"
        //    48: invokestatic    com/google/android/gms/common/internal/zzu.zza:(ZLjava/lang/Object;)V
        //    51: aload_0        
        //    52: getfield        com/google/android/gms/common/api/AbstractPendingResult.zzWf:Z
        //    55: istore          9
        //    57: iload           9
        //    59: ifne            93
        //    62: iload_2        
        //    63: ldc             "Result has already been consumed"
        //    65: invokestatic    com/google/android/gms/common/internal/zzu.zza:(ZLjava/lang/Object;)V
        //    68: aload_0        
        //    69: aload_1        
        //    70: invokespecial   com/google/android/gms/common/api/AbstractPendingResult.zza:(Lcom/google/android/gms/common/api/Result;)V
        //    73: aload_3        
        //    74: monitorexit    
        //    75: return         
        //    76: astore          4
        //    78: aload_3        
        //    79: monitorexit    
        //    80: aload           4
        //    82: athrow         
        //    83: astore          5
        //    85: aload           5
        //    87: athrow         
        //    88: astore          8
        //    90: aload           8
        //    92: athrow         
        //    93: iconst_0       
        //    94: istore_2       
        //    95: goto            62
        //    98: iconst_0       
        //    99: istore          7
        //   101: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  9      23     76     83     Any
        //  23     29     76     83     Any
        //  30     36     83     88     Ljava/lang/RuntimeException;
        //  30     36     76     83     Any
        //  44     57     88     93     Ljava/lang/RuntimeException;
        //  44     57     76     83     Any
        //  62     75     76     83     Any
        //  78     80     76     83     Any
        //  85     88     76     83     Any
        //  90     93     76     83     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
