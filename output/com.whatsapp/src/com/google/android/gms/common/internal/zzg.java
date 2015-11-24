// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

public class zzg implements DialogInterface$OnClickListener
{
    private final Activity mActivity;
    private final Intent mIntent;
    private final Fragment zzZX;
    private final int zzZY;
    
    public zzg(final Activity mActivity, final Intent mIntent, final int zzZY) {
        this.mActivity = mActivity;
        this.zzZX = null;
        this.mIntent = mIntent;
        this.zzZY = zzZY;
    }
    
    public zzg(final Fragment zzZX, final Intent mIntent, final int zzZY) {
        this.mActivity = null;
        this.zzZX = zzZX;
        this.mIntent = mIntent;
        this.zzZY = zzZY;
    }
    
    public void onClick(final DialogInterface p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/internal/zzg.mIntent:Landroid/content/Intent;
        //     4: ifnull          43
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/internal/zzg.zzZX:Landroid/support/v4/app/Fragment;
        //    11: astore          10
        //    13: aload           10
        //    15: ifnull          43
        //    18: aload_0        
        //    19: getfield        com/google/android/gms/common/internal/zzg.zzZX:Landroid/support/v4/app/Fragment;
        //    22: aload_0        
        //    23: getfield        com/google/android/gms/common/internal/zzg.mIntent:Landroid/content/Intent;
        //    26: aload_0        
        //    27: getfield        com/google/android/gms/common/internal/zzg.zzZY:I
        //    30: invokevirtual   android/support/v4/app/Fragment.startActivityForResult:(Landroid/content/Intent;I)V
        //    33: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //    36: istore          11
        //    38: iload           11
        //    40: ifeq            69
        //    43: aload_0        
        //    44: getfield        com/google/android/gms/common/internal/zzg.mIntent:Landroid/content/Intent;
        //    47: astore          9
        //    49: aload           9
        //    51: ifnull          69
        //    54: aload_0        
        //    55: getfield        com/google/android/gms/common/internal/zzg.mActivity:Landroid/app/Activity;
        //    58: aload_0        
        //    59: getfield        com/google/android/gms/common/internal/zzg.mIntent:Landroid/content/Intent;
        //    62: aload_0        
        //    63: getfield        com/google/android/gms/common/internal/zzg.zzZY:I
        //    66: invokevirtual   android/app/Activity.startActivityForResult:(Landroid/content/Intent;I)V
        //    69: aload_1        
        //    70: invokeinterface android/content/DialogInterface.dismiss:()V
        //    75: return         
        //    76: astore_3       
        //    77: aload_3        
        //    78: athrow         
        //    79: astore          4
        //    81: aload           4
        //    83: athrow         
        //    84: astore          5
        //    86: aload           5
        //    88: athrow         
        //    89: astore          6
        //    91: aload           6
        //    93: athrow         
        //    94: astore          7
        //    96: ldc             "SettingsRedirect"
        //    98: ldc             "Can't redirect to app settings for Google Play services"
        //   100: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   103: pop            
        //   104: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      13     76     79     Landroid/content/ActivityNotFoundException;
        //  18     38     79     84     Landroid/content/ActivityNotFoundException;
        //  43     49     84     89     Landroid/content/ActivityNotFoundException;
        //  54     69     89     94     Landroid/content/ActivityNotFoundException;
        //  69     75     94     105    Landroid/content/ActivityNotFoundException;
        //  77     79     79     84     Landroid/content/ActivityNotFoundException;
        //  81     84     84     89     Landroid/content/ActivityNotFoundException;
        //  86     89     89     94     Landroid/content/ActivityNotFoundException;
        //  91     94     94     105    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 52, Size: 52
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
