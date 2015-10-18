// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks;

public class zzi$zzf implements GoogleApiClient$ConnectionProgressReportCallbacks
{
    final zzi zzaax;
    
    public zzi$zzf(final zzi zzaax) {
        this.zzaax = zzaax;
    }
    
    @Override
    public void onReportAccountValidation(final ConnectionResult connectionResult) {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
    
    @Override
    public void onReportServiceBinding(final ConnectionResult p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   com/google/android/gms/common/ConnectionResult.isSuccess:()Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifeq            36
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/common/internal/zzi$zzf.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    15: aconst_null    
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/common/internal/zzi$zzf.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    20: invokestatic    com/google/android/gms/common/internal/zzi.zzd:(Lcom/google/android/gms/common/internal/zzi;)Ljava/util/Set;
        //    23: invokevirtual   com/google/android/gms/common/internal/zzi.getRemoteService:(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V
        //    26: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //    29: istore          6
        //    31: iload           6
        //    33: ifeq            59
        //    36: aload_0        
        //    37: getfield        com/google/android/gms/common/internal/zzi$zzf.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    40: invokestatic    com/google/android/gms/common/internal/zzi.zze:(Lcom/google/android/gms/common/internal/zzi;)Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
        //    43: ifnull          59
        //    46: aload_0        
        //    47: getfield        com/google/android/gms/common/internal/zzi$zzf.zzaax:Lcom/google/android/gms/common/internal/zzi;
        //    50: invokestatic    com/google/android/gms/common/internal/zzi.zze:(Lcom/google/android/gms/common/internal/zzi;)Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
        //    53: aload_1        
        //    54: invokeinterface com/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener.onConnectionFailed:(Lcom/google/android/gms/common/ConnectionResult;)V
        //    59: return         
        //    60: astore_2       
        //    61: aload_2        
        //    62: athrow         
        //    63: astore_3       
        //    64: aload_3        
        //    65: athrow         
        //    66: astore          4
        //    68: aload           4
        //    70: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      60     63     Ljava/lang/IllegalStateException;
        //  11     31     63     66     Ljava/lang/IllegalStateException;
        //  36     59     66     71     Ljava/lang/IllegalStateException;
        //  61     63     63     66     Ljava/lang/IllegalStateException;
        //  64     66     66     71     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
