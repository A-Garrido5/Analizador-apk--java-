// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzy;
import android.widget.Button;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class SignInButton extends FrameLayout implements View$OnClickListener
{
    private int mColor;
    private int mSize;
    private View zzVZ;
    private View$OnClickListener zzWa;
    
    public SignInButton(final Context context) {
        this(context, null);
    }
    
    public SignInButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SignInButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.zzWa = null;
        this.setStyle(0, 0);
    }
    
    private static Button zza(final Context context, final int n, final int n2) {
        final zzy zzy = new zzy(context);
        zzy.zza(context.getResources(), n, n2);
        return zzy;
    }
    
    private void zzaf(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //     4: ifnull          15
        //     7: aload_0        
        //     8: aload_0        
        //     9: getfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    12: invokevirtual   com/google/android/gms/common/SignInButton.removeView:(Landroid/view/View;)V
        //    15: aload_0        
        //    16: aload_1        
        //    17: aload_0        
        //    18: getfield        com/google/android/gms/common/SignInButton.mSize:I
        //    21: aload_0        
        //    22: getfield        com/google/android/gms/common/SignInButton.mColor:I
        //    25: invokestatic    com/google/android/gms/common/internal/zzx.zzb:(Landroid/content/Context;II)Landroid/view/View;
        //    28: putfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    31: aload_0        
        //    32: aload_0        
        //    33: getfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    36: invokevirtual   com/google/android/gms/common/SignInButton.addView:(Landroid/view/View;)V
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    43: aload_0        
        //    44: invokevirtual   com/google/android/gms/common/SignInButton.isEnabled:()Z
        //    47: invokevirtual   android/view/View.setEnabled:(Z)V
        //    50: aload_0        
        //    51: getfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    54: aload_0        
        //    55: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    58: return         
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore_3       
        //    63: ldc             "SignInButton"
        //    65: ldc             "Sign in button not found, using placeholder instead"
        //    67: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    70: pop            
        //    71: aload_0        
        //    72: aload_1        
        //    73: aload_0        
        //    74: getfield        com/google/android/gms/common/SignInButton.mSize:I
        //    77: aload_0        
        //    78: getfield        com/google/android/gms/common/SignInButton.mColor:I
        //    81: invokestatic    com/google/android/gms/common/SignInButton.zza:(Landroid/content/Context;II)Landroid/widget/Button;
        //    84: putfield        com/google/android/gms/common/SignInButton.zzVZ:Landroid/view/View;
        //    87: goto            31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  0      15     59     62     Lcom/google/android/gms/dynamic/zzg$zza;
        //  15     31     62     90     Lcom/google/android/gms/dynamic/zzg$zza;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0015:
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
    
    public void onClick(final View view) {
        if (this.zzWa != null && view == this.zzVZ) {
            this.zzWa.onClick((View)this);
        }
    }
    
    public void setEnabled(final boolean b) {
        super.setEnabled(b);
        this.zzVZ.setEnabled(b);
    }
    
    public void setOnClickListener(final View$OnClickListener zzWa) {
        this.zzWa = zzWa;
        if (this.zzVZ != null) {
            this.zzVZ.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public void setStyle(final int mSize, final int mColor) {
        final boolean a = GooglePlayServicesUtil.a;
        zzu.zza(mSize >= 0 && mSize < 3, "Unknown button size %d", new Object[] { mSize });
        zzu.zza(mColor >= 0 && mColor < 2, "Unknown color scheme %s", new Object[] { mColor });
        this.mSize = mSize;
        this.mColor = mColor;
        this.zzaf(this.getContext());
        if (zzu.a != 0) {
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            GooglePlayServicesUtil.a = a2;
        }
    }
}
