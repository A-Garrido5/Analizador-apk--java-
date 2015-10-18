// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

class zzm$zzb implements Runnable
{
    final zzm zzYd;
    private final int zzYe;
    private final ConnectionResult zzYf;
    
    public zzm$zzb(final zzm zzYd, final int zzYe, final ConnectionResult zzYf) {
        this.zzYd = zzYd;
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
        //     5: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //     8: invokestatic    com/google/android/gms/common/api/zzm.zza:(Lcom/google/android/gms/common/api/zzm;)Z
        //    11: ifeq            28
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    18: invokestatic    com/google/android/gms/common/api/zzm.zzb:(Lcom/google/android/gms/common/api/zzm;)Z
        //    21: istore          4
        //    23: iload           4
        //    25: ifeq            35
        //    28: return         
        //    29: astore_2       
        //    30: aload_2        
        //    31: athrow         
        //    32: astore_3       
        //    33: aload_3        
        //    34: athrow         
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    39: iconst_1       
        //    40: invokestatic    com/google/android/gms/common/api/zzm.zza:(Lcom/google/android/gms/common/api/zzm;Z)Z
        //    43: pop            
        //    44: aload_0        
        //    45: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/common/api/zzm$zzb.zzYe:I
        //    52: invokestatic    com/google/android/gms/common/api/zzm.zza:(Lcom/google/android/gms/common/api/zzm;I)I
        //    55: pop            
        //    56: aload_0        
        //    57: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    60: aload_0        
        //    61: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //    64: invokestatic    com/google/android/gms/common/api/zzm.zza:(Lcom/google/android/gms/common/api/zzm;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/ConnectionResult;
        //    67: pop            
        //    68: aload_0        
        //    69: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //    72: invokevirtual   com/google/android/gms/common/ConnectionResult.hasResolution:()Z
        //    75: ifeq            139
        //    78: iconst_1       
        //    79: iconst_1       
        //    80: aload_0        
        //    81: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    84: invokevirtual   com/google/android/gms/common/api/zzm.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    87: invokevirtual   android/support/v4/app/FragmentActivity.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //    90: invokevirtual   android/support/v4/app/FragmentManager.getFragments:()Ljava/util/List;
        //    93: aload_0        
        //    94: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //    97: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //   102: iadd           
        //   103: bipush          16
        //   105: ishl           
        //   106: iadd           
        //   107: istore          14
        //   109: aload_0        
        //   110: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //   113: aload_0        
        //   114: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   117: invokevirtual   com/google/android/gms/common/api/zzm.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   120: iload           14
        //   122: invokevirtual   com/google/android/gms/common/ConnectionResult.startResolutionForResult:(Landroid/app/Activity;I)V
        //   125: return         
        //   126: astore          12
        //   128: aload_0        
        //   129: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   132: invokestatic    com/google/android/gms/common/api/zzm.zzc:(Lcom/google/android/gms/common/api/zzm;)V
        //   135: iload_1        
        //   136: ifeq            28
        //   139: aload_0        
        //   140: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //   143: invokevirtual   com/google/android/gms/common/ConnectionResult.getErrorCode:()I
        //   146: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.isUserRecoverableError:(I)Z
        //   149: istore          10
        //   151: iload           10
        //   153: ifeq            187
        //   156: aload_0        
        //   157: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //   160: invokevirtual   com/google/android/gms/common/ConnectionResult.getErrorCode:()I
        //   163: aload_0        
        //   164: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   167: invokevirtual   com/google/android/gms/common/api/zzm.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   170: aload_0        
        //   171: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   174: iconst_2       
        //   175: aload_0        
        //   176: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   179: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.showErrorDialogFragment:(ILandroid/app/Activity;Landroid/support/v4/app/Fragment;ILandroid/content/DialogInterface$OnCancelListener;)Z
        //   182: pop            
        //   183: iload_1        
        //   184: ifeq            28
        //   187: aload_0        
        //   188: getfield        com/google/android/gms/common/api/zzm$zzb.zzYd:Lcom/google/android/gms/common/api/zzm;
        //   191: aload_0        
        //   192: getfield        com/google/android/gms/common/api/zzm$zzb.zzYe:I
        //   195: aload_0        
        //   196: getfield        com/google/android/gms/common/api/zzm$zzb.zzYf:Lcom/google/android/gms/common/ConnectionResult;
        //   199: invokestatic    com/google/android/gms/common/api/zzm.zza:(Lcom/google/android/gms/common/api/zzm;ILcom/google/android/gms/common/ConnectionResult;)V
        //   202: return         
        //   203: astore          9
        //   205: aload           9
        //   207: athrow         
        //   208: astore          13
        //   210: aload           13
        //   212: athrow         
        //   213: astore          8
        //   215: aload           8
        //   217: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  4      23     29     35     Landroid/content/IntentSender$SendIntentException;
        //  30     32     32     35     Landroid/content/IntentSender$SendIntentException;
        //  78     125    126    213    Landroid/content/IntentSender$SendIntentException;
        //  128    135    208    213    Landroid/content/IntentSender$SendIntentException;
        //  139    151    213    218    Landroid/content/IntentSender$SendIntentException;
        //  156    183    203    208    Landroid/content/IntentSender$SendIntentException;
        //  187    202    203    208    Landroid/content/IntentSender$SendIntentException;
        //  210    213    213    218    Landroid/content/IntentSender$SendIntentException;
        //  215    218    203    208    Landroid/content/IntentSender$SendIntentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
