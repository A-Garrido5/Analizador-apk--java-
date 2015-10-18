// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;
import android.os.IBinder;

public final class zzi$zzg extends zzi$zza
{
    public final IBinder zzaaB;
    final zzi zzaax;
    
    public zzi$zzg(final zzi zzaax, final int n, final IBinder zzaaB, final Bundle bundle) {
        super(this.zzaax = zzaax, n, bundle);
        this.zzaaB = zzaaB;
    }
    
    @Override
    protected void zzg(final ConnectionResult connectionResult) {
        if (zzi.zze(this.zzaax) != null) {
            zzi.zze(this.zzaax).onConnectionFailed(connectionResult);
        }
        this.zzaax.onConnectionFailed(connectionResult);
    }
    
    @Override
    protected boolean zznO() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaaB:Landroid/os/IBinder;
        //     4: invokeinterface android/os/IBinder.getInterfaceDescriptor:()Ljava/lang/String;
        //     9: astore_3       
        //    10: aload_0        
        //    11: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    14: invokevirtual   com/google/android/gms/common/internal/zzi.getServiceDescriptor:()Ljava/lang/String;
        //    17: aload_3        
        //    18: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    21: ifne            82
        //    24: ldc             "GmsClient"
        //    26: new             Ljava/lang/StringBuilder;
        //    29: dup            
        //    30: invokespecial   java/lang/StringBuilder.<init>:()V
        //    33: ldc             "service descriptor mismatch: "
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: aload_0        
        //    39: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    42: invokevirtual   com/google/android/gms/common/internal/zzi.getServiceDescriptor:()Ljava/lang/String;
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: ldc             " vs. "
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: aload_3        
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    60: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    63: pop            
        //    64: iconst_0       
        //    65: ireturn        
        //    66: astore_1       
        //    67: ldc             "GmsClient"
        //    69: ldc             "service probably died"
        //    71: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    74: pop            
        //    75: iconst_0       
        //    76: ireturn        
        //    77: astore          4
        //    79: aload           4
        //    81: athrow         
        //    82: aload_0        
        //    83: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    86: aload_0        
        //    87: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaaB:Landroid/os/IBinder;
        //    90: invokevirtual   com/google/android/gms/common/internal/zzi.zzT:(Landroid/os/IBinder;)Landroid/os/IInterface;
        //    93: astore          5
        //    95: aload           5
        //    97: ifnull          64
        //   100: aload_0        
        //   101: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   104: iconst_2       
        //   105: iconst_3       
        //   106: aload           5
        //   108: invokestatic    com/google/android/gms/common/internal/zzi.zza:(Lcom/google/android/gms/common/internal/zzi;IILandroid/os/IInterface;)Z
        //   111: istore          7
        //   113: iload           7
        //   115: ifeq            64
        //   118: aload_0        
        //   119: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   122: invokevirtual   com/google/android/gms/common/internal/zzi.zzlM:()Landroid/os/Bundle;
        //   125: astore          8
        //   127: aload_0        
        //   128: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   131: invokestatic    com/google/android/gms/common/internal/zzi.zzb:(Lcom/google/android/gms/common/internal/zzi;)Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
        //   134: ifnull          151
        //   137: aload_0        
        //   138: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   141: invokestatic    com/google/android/gms/common/internal/zzi.zzb:(Lcom/google/android/gms/common/internal/zzi;)Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
        //   144: aload           8
        //   146: invokeinterface com/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks.onConnected:(Landroid/os/Bundle;)V
        //   151: aload_0        
        //   152: getfield        com/google/android/gms/common/internal/zzi$zzg.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //   155: invokestatic    com/google/android/gms/common/internal/zzi.zzf:(Lcom/google/android/gms/common/internal/zzi;)Landroid/content/Context;
        //   158: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zzac:(Landroid/content/Context;)V
        //   161: iconst_1       
        //   162: ireturn        
        //   163: astore          6
        //   165: aload           6
        //   167: athrow         
        //   168: astore          9
        //   170: aload           9
        //   172: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      10     66     77     Landroid/os/RemoteException;
        //  10     64     77     82     Landroid/os/RemoteException;
        //  100    113    163    168    Landroid/os/RemoteException;
        //  127    151    168    173    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
