// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.a;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public final class zzy extends Button
{
    public zzy(final Context context) {
        this(context, null);
    }
    
    public zzy(final Context context, final AttributeSet set) {
        super(context, set, 16842824);
    }
    
    private void zza(final Resources resources) {
        this.setTypeface(Typeface.DEFAULT_BOLD);
        this.setTextSize(14.0f);
        final float density = resources.getDisplayMetrics().density;
        this.setMinHeight((int)(0.5f + density * 48.0f));
        this.setMinWidth((int)(0.5f + density * 48.0f));
    }
    
    private int zzb(final int n, int n2, final int n3) {
        switch (n) {
            default: {
                throw new IllegalStateException("Unknown color scheme: " + n);
            }
            case 1: {
                n2 = n3;
            }
            case 0: {
                return n2;
            }
        }
    }
    
    private void zzb(final Resources resources, final int n, final int n2) {
        final boolean a = zzi.a;
        int n3 = 0;
    Label_0100:
        while (true) {
            Label_0082: {
                switch (n) {
                    case 0:
                    case 1: {
                        n3 = this.zzb(n2, com.google.android.gms.a.common_signin_btn_text_dark, com.google.android.gms.a.common_signin_btn_text_light);
                        if (a) {
                            break Label_0082;
                        }
                        break Label_0100;
                    }
                    case 2: {
                        n3 = this.zzb(n2, com.google.android.gms.a.common_signin_btn_icon_dark, com.google.android.gms.a.common_signin_btn_icon_light);
                        if (!a) {
                            break Label_0100;
                        }
                        break;
                    }
                }
            }
            try {
                throw new IllegalStateException("Unknown button size: " + n);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            continue;
        }
        if (n3 == -1) {
            try {
                throw new IllegalStateException("Could not find background resource!");
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        this.setBackgroundDrawable(resources.getDrawable(n3));
    }
    
    private void zzc(final Resources p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: iload_3        
        //     7: getstatic       com/google/android/gms/b.common_signin_btn_text_dark:I
        //    10: getstatic       com/google/android/gms/b.common_signin_btn_text_light:I
        //    13: invokespecial   com/google/android/gms/common/internal/zzy.zzb:(III)I
        //    16: istore          5
        //    18: aload_0        
        //    19: aload_1        
        //    20: iload           5
        //    22: invokevirtual   android/content/res/Resources.getColorStateList:(I)Landroid/content/res/ColorStateList;
        //    25: invokevirtual   com/google/android/gms/common/internal/zzy.setTextColor:(Landroid/content/res/ColorStateList;)V
        //    28: iload_2        
        //    29: tableswitch {
        //                0: 88
        //                1: 104
        //                2: 120
        //          default: 56
        //        }
        //    56: new             Ljava/lang/IllegalStateException;
        //    59: dup            
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: ldc             "Unknown button size: "
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: iload_2        
        //    73: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    82: athrow         
        //    83: astore          9
        //    85: aload           9
        //    87: athrow         
        //    88: aload_0        
        //    89: aload_1        
        //    90: getstatic       com/google/android/gms/e.common_signin_button_text:I
        //    93: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    96: invokevirtual   com/google/android/gms/common/internal/zzy.setText:(Ljava/lang/CharSequence;)V
        //    99: iload           4
        //   101: ifeq            130
        //   104: aload_0        
        //   105: aload_1        
        //   106: getstatic       com/google/android/gms/e.common_signin_button_text_long:I
        //   109: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   112: invokevirtual   com/google/android/gms/common/internal/zzy.setText:(Ljava/lang/CharSequence;)V
        //   115: iload           4
        //   117: ifeq            130
        //   120: aload_0        
        //   121: aconst_null    
        //   122: invokevirtual   com/google/android/gms/common/internal/zzy.setText:(Ljava/lang/CharSequence;)V
        //   125: iload           4
        //   127: ifne            56
        //   130: return         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: astore          7
        //   138: aload           7
        //   140: athrow         
        //   141: astore          8
        //   143: aload           8
        //   145: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     28     131    136    Ljava/lang/IllegalStateException;
        //  56     83     83     88     Ljava/lang/IllegalStateException;
        //  88     99     136    141    Ljava/lang/IllegalStateException;
        //  104    115    141    146    Ljava/lang/IllegalStateException;
        //  120    125    83     88     Ljava/lang/IllegalStateException;
        //  133    136    136    141    Ljava/lang/IllegalStateException;
        //  138    141    141    146    Ljava/lang/IllegalStateException;
        //  143    146    83     88     Ljava/lang/IllegalStateException;
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
    
    public void zza(final Resources resources, final int n, final int n2) {
        Label_0090: {
            if (n < 0 || n >= 3) {
                break Label_0090;
            }
            boolean b = true;
        Label_0047_Outer:
            while (true) {
                while (true) {
                    Label_0106: {
                        try {
                            zzu.zza(b, "Unknown button size %d", new Object[] { n });
                            if (n2 >= 0 && n2 < 2) {
                                final boolean b2 = true;
                                zzu.zza(b2, "Unknown color scheme %s", new Object[] { n2 });
                                this.zza(resources);
                                this.zzb(resources, n, n2);
                                this.zzc(resources, n, n2);
                                return;
                            }
                            break Label_0106;
                            b = false;
                            continue Label_0047_Outer;
                        }
                        catch (IllegalStateException ex) {
                            try {
                                throw ex;
                            }
                            catch (IllegalStateException ex2) {
                                throw ex2;
                            }
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
    }
}
