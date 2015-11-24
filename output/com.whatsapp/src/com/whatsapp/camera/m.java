// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import java.io.IOException;
import com.whatsapp.util.av;
import android.content.Context;
import com.whatsapp.util.br;
import android.net.Uri;
import android.os.AsyncTask;

class m extends AsyncTask
{
    private static final String z;
    final Uri a;
    final a6 b;
    
    static {
        final char[] charArray = "s\u000f\u0015P\u001dq\u000f\u001bA\u0006f\u0007\fL@u\u001c\nZ\u001d*N".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = 'n';
                    break;
                }
                case 2: {
                    c2 = 'x';
                    break;
                }
                case 3: {
                    c2 = '5';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    m(final a6 b, final Uri a) {
        this.b = b;
        this.a = a;
    }
    
    protected Throwable a(final Void[] array) {
        try {
            br.a((Context)this.b.b, CameraActivity.x(this.b.b).u, this.a);
            return null;
        }
        catch (av av) {}
        catch (OutOfMemoryError t) {
            goto Label_0030;
        }
        catch (IOException t) {
            goto Label_0030;
        }
        catch (SecurityException t) {
            goto Label_0030;
        }
    }
    
    protected void a(final Throwable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //     8: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //    11: ldc             2131755343
        //    13: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //    16: bipush          8
        //    18: invokevirtual   android/view/View.setVisibility:(I)V
        //    21: aload_1        
        //    22: instanceof      Ljava/io/FileNotFoundException;
        //    25: istore          12
        //    27: iload           12
        //    29: ifeq            49
        //    32: aload_0        
        //    33: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //    36: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //    39: ldc             2131230866
        //    41: iconst_1       
        //    42: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    45: iload_2        
        //    46: ifeq            153
        //    49: aload_1        
        //    50: instanceof      Ljava/lang/OutOfMemoryError;
        //    53: istore          13
        //    55: iload           13
        //    57: ifeq            77
        //    60: aload_0        
        //    61: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //    64: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //    67: ldc             2131230866
        //    69: iconst_1       
        //    70: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    73: iload_2        
        //    74: ifeq            153
        //    77: aload_1        
        //    78: instanceof      Ljava/io/IOException;
        //    81: istore          14
        //    83: iload           14
        //    85: ifeq            105
        //    88: aload_0        
        //    89: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //    92: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //    95: ldc             2131230866
        //    97: iconst_1       
        //    98: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   101: iload_2        
        //   102: ifeq            153
        //   105: aload_1        
        //   106: instanceof      Lcom/whatsapp/util/av;
        //   109: istore          15
        //   111: iload           15
        //   113: ifeq            133
        //   116: aload_0        
        //   117: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //   120: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //   123: ldc             2131230866
        //   125: iconst_1       
        //   126: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   129: iload_2        
        //   130: ifeq            153
        //   133: aload_1        
        //   134: instanceof      Ljava/lang/SecurityException;
        //   137: ifeq            153
        //   140: aload_0        
        //   141: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //   144: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //   147: ldc             2131231412
        //   149: iconst_0       
        //   150: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   153: aload_0        
        //   154: getfield        com/whatsapp/camera/m.b:Lcom/whatsapp/camera/a6;
        //   157: getfield        com/whatsapp/camera/a6.b:Lcom/whatsapp/camera/CameraActivity;
        //   160: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   163: return         
        //   164: astore_3       
        //   165: aload_3        
        //   166: athrow         
        //   167: astore          4
        //   169: aload           4
        //   171: athrow         
        //   172: astore          5
        //   174: aload           5
        //   176: athrow         
        //   177: astore          6
        //   179: aload           6
        //   181: athrow         
        //   182: astore          7
        //   184: aload           7
        //   186: athrow         
        //   187: astore          8
        //   189: aload           8
        //   191: athrow         
        //   192: astore          9
        //   194: aload           9
        //   196: athrow         
        //   197: astore          10
        //   199: aload           10
        //   201: athrow         
        //   202: astore          11
        //   204: aload           11
        //   206: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      27     164    167    Ljava/lang/SecurityException;
        //  32     45     167    172    Ljava/lang/SecurityException;
        //  49     55     172    177    Ljava/lang/SecurityException;
        //  60     73     177    182    Ljava/lang/SecurityException;
        //  77     83     182    187    Ljava/lang/SecurityException;
        //  88     101    187    192    Ljava/lang/SecurityException;
        //  105    111    192    197    Ljava/lang/SecurityException;
        //  116    129    197    202    Ljava/lang/SecurityException;
        //  133    153    202    207    Ljava/lang/SecurityException;
        //  165    167    167    172    Ljava/lang/SecurityException;
        //  169    172    172    177    Ljava/lang/SecurityException;
        //  174    177    177    182    Ljava/lang/SecurityException;
        //  179    182    182    187    Ljava/lang/SecurityException;
        //  184    187    187    192    Ljava/lang/SecurityException;
        //  189    192    192    197    Ljava/lang/SecurityException;
        //  194    197    197    202    Ljava/lang/SecurityException;
        //  199    202    202    207    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Throwable)o);
    }
}
