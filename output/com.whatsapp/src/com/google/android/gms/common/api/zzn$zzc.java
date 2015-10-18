// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

class zzn$zzc implements Runnable
{
    private final int zzYe;
    private final ConnectionResult zzYf;
    final zzn zzYi;
    
    public zzn$zzc(final zzn zzYi, final int zzYe, final ConnectionResult zzYf) {
        this.zzYi = zzYi;
        this.zzYe = zzYe;
        this.zzYf = zzYf;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zzn$zzc.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //     8: invokevirtual   com/google/android/gms/common/ConnectionResult.hasResolution:()Z
        //    11: ifeq            75
        //    14: iconst_1       
        //    15: iconst_1       
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //    20: invokevirtual   com/google/android/gms/common/api/zzn.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    23: invokevirtual   android/support/v4/app/FragmentActivity.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //    26: invokevirtual   android/support/v4/app/FragmentManager.getFragments:()Ljava/util/List;
        //    29: aload_0        
        //    30: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //    33: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    38: iadd           
        //    39: bipush          16
        //    41: ishl           
        //    42: iadd           
        //    43: istore          8
        //    45: aload_0        
        //    46: getfield        com/google/android/gms/common/api/zzn$zzc.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //    49: aload_0        
        //    50: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //    53: invokevirtual   com/google/android/gms/common/api/zzn.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    56: iload           8
        //    58: invokevirtual   com/google/android/gms/common/ConnectionResult.startResolutionForResult:(Landroid/app/Activity;I)V
        //    61: return         
        //    62: astore          6
        //    64: aload_0        
        //    65: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //    68: invokestatic    com/google/android/gms/common/api/zzn.zza:(Lcom/google/android/gms/common/api/zzn;)V
        //    71: iload_1        
        //    72: ifeq            61
        //    75: aload_0        
        //    76: getfield        com/google/android/gms/common/api/zzn$zzc.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //    79: invokevirtual   com/google/android/gms/common/ConnectionResult.getErrorCode:()I
        //    82: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.isUserRecoverableError:(I)Z
        //    85: istore          4
        //    87: iload           4
        //    89: ifeq            123
        //    92: aload_0        
        //    93: getfield        com/google/android/gms/common/api/zzn$zzc.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //    96: invokevirtual   com/google/android/gms/common/ConnectionResult.getErrorCode:()I
        //    99: aload_0        
        //   100: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //   103: invokevirtual   com/google/android/gms/common/api/zzn.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   106: aload_0        
        //   107: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //   110: iconst_2       
        //   111: aload_0        
        //   112: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //   115: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.showErrorDialogFragment:(ILandroid/app/Activity;Landroid/support/v4/app/Fragment;ILandroid/content/DialogInterface$OnCancelListener;)Z
        //   118: pop            
        //   119: iload_1        
        //   120: ifeq            61
        //   123: aload_0        
        //   124: getfield        com/google/android/gms/common/api/zzn$zzc.zzYi:Lcom/google/android/gms/common/api/zzn;
        //   127: aload_0        
        //   128: getfield        com/google/android/gms/common/api/zzn$zzc.zzYe:I
        //   131: aload_0        
        //   132: getfield        com/google/android/gms/common/api/zzn$zzc.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //   135: invokestatic    com/google/android/gms/common/api/zzn.zza:(Lcom/google/android/gms/common/api/zzn;ILcom/google/android/gms/common/ConnectionResult;)V
        //   138: return         
        //   139: astore_3       
        //   140: aload_3        
        //   141: athrow         
        //   142: astore          7
        //   144: aload           7
        //   146: athrow         
        //   147: astore_2       
        //   148: aload_2        
        //   149: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  14     61     62     147    Landroid/content/IntentSender$SendIntentException;
        //  64     71     142    147    Landroid/content/IntentSender$SendIntentException;
        //  75     87     147    150    Landroid/content/IntentSender$SendIntentException;
        //  92     119    139    142    Landroid/content/IntentSender$SendIntentException;
        //  123    138    139    142    Landroid/content/IntentSender$SendIntentException;
        //  144    147    147    150    Landroid/content/IntentSender$SendIntentException;
        //  148    150    139    142    Landroid/content/IntentSender$SendIntentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
