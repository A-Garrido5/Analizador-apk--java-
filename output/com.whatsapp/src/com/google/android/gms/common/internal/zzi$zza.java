// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;

abstract class zzi$zza extends zzi$zzc
{
    public final int statusCode;
    public final Bundle zzaaw;
    final zzi zzaax;
    
    protected zzi$zza(final zzi zzaax, final int statusCode, final Bundle zzaaw) {
        super(this.zzaax = zzaax, true);
        this.statusCode = statusCode;
        this.zzaaw = zzaaw;
    }
    
    protected void zzc(final Boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       19
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/internal/zzi$zza.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //     8: iconst_1       
        //     9: aconst_null    
        //    10: invokestatic    com/google/android/gms/common/internal/zzi.zza:(Lcom/google/android/gms/common/internal/zzi;ILandroid/os/IInterface;)V
        //    13: return         
        //    14: astore          9
        //    16: aload           9
        //    18: athrow         
        //    19: aload_0        
        //    20: getfield        com/google/android/gms/common/internal/zzi$zza.statusCode:I
        //    23: istore          5
        //    25: iload           5
        //    27: lookupswitch {
        //                0: 107
        //               10: 147
        //          default: 52
        //        }
        //    52: aload_0        
        //    53: getfield        com/google/android/gms/common/internal/zzi$zza.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    56: iconst_1       
        //    57: aconst_null    
        //    58: invokestatic    com/google/android/gms/common/internal/zzi.zza:(Lcom/google/android/gms/common/internal/zzi;ILandroid/os/IInterface;)V
        //    61: aload_0        
        //    62: getfield        com/google/android/gms/common/internal/zzi$zza.zzaaw:Landroid/os/Bundle;
        //    65: astore          7
        //    67: aconst_null    
        //    68: astore          8
        //    70: aload           7
        //    72: ifnull          89
        //    75: aload_0        
        //    76: getfield        com/google/android/gms/common/internal/zzi$zza.zzaaw:Landroid/os/Bundle;
        //    79: ldc             "pendingIntent"
        //    81: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //    84: checkcast       Landroid/app/PendingIntent;
        //    87: astore          8
        //    89: aload_0        
        //    90: new             Lcom/google/android/gms/common/ConnectionResult;
        //    93: dup            
        //    94: aload_0        
        //    95: getfield        com/google/android/gms/common/internal/zzi$zza.statusCode:I
        //    98: aload           8
        //   100: invokespecial   com/google/android/gms/common/ConnectionResult.<init>:(ILandroid/app/PendingIntent;)V
        //   103: invokevirtual   com/google/android/gms/common/internal/zzi$zza.zzg:(Lcom/google/android/gms/common/ConnectionResult;)V
        //   106: return         
        //   107: aload_0        
        //   108: invokevirtual   com/google/android/gms/common/internal/zzi$zza.zznO:()Z
        //   111: istore          6
        //   113: iload           6
        //   115: ifne            13
        //   118: aload_0        
        //   119: getfield        com/google/android/gms/common/internal/zzi$zza.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   122: iconst_1       
        //   123: aconst_null    
        //   124: invokestatic    com/google/android/gms/common/internal/zzi.zza:(Lcom/google/android/gms/common/internal/zzi;ILandroid/os/IInterface;)V
        //   127: aload_0        
        //   128: new             Lcom/google/android/gms/common/ConnectionResult;
        //   131: dup            
        //   132: bipush          8
        //   134: aconst_null    
        //   135: invokespecial   com/google/android/gms/common/ConnectionResult.<init>:(ILandroid/app/PendingIntent;)V
        //   138: invokevirtual   com/google/android/gms/common/internal/zzi$zza.zzg:(Lcom/google/android/gms/common/ConnectionResult;)V
        //   141: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //   144: ifeq            13
        //   147: aload_0        
        //   148: getfield        com/google/android/gms/common/internal/zzi$zza.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   151: iconst_1       
        //   152: aconst_null    
        //   153: invokestatic    com/google/android/gms/common/internal/zzi.zza:(Lcom/google/android/gms/common/internal/zzi;ILandroid/os/IInterface;)V
        //   156: new             Ljava/lang/IllegalStateException;
        //   159: dup            
        //   160: ldc             "A fatal developer error has occurred. Check the logs for further information."
        //   162: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   165: athrow         
        //   166: astore          4
        //   168: aload           4
        //   170: athrow         
        //   171: astore_2       
        //   172: aload_2        
        //   173: athrow         
        //   174: astore_3       
        //   175: aload_3        
        //   176: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      13     14     19     Ljava/lang/IllegalStateException;
        //  19     25     171    174    Ljava/lang/IllegalStateException;
        //  107    113    174    177    Ljava/lang/IllegalStateException;
        //  118    147    166    171    Ljava/lang/IllegalStateException;
        //  147    166    166    171    Ljava/lang/IllegalStateException;
        //  172    174    174    177    Ljava/lang/IllegalStateException;
        //  175    177    166    171    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0107:
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
    
    protected abstract void zzg(final ConnectionResult p0);
    
    protected abstract boolean zznO();
    
    @Override
    protected void zznP() {
    }
    
    @Override
    protected void zzr(final Object o) {
        this.zzc((Boolean)o);
    }
}
