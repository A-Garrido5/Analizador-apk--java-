// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater$Factory;

final class bo implements LayoutInflater$Factory
{
    private static final String[] z;
    final Activity a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0006G9\u001e#;G6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'u';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1M,D\u0014<F3\u0005\u001c6\f(\u0004\u00017P/\u000b\u0019|U(\u000e\u00127Vo.\u001c3N.\r!;V-\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "&P4\u0004\u00163V(\u0005\u001b\u0007V(\u0006\u0006rD(\u0004\u0011\u001fG/\u001f! W/\t\u0014&K.\u0004\u0006rK/\f\u00193V$J\u0010*A$\u001a\u0001;M/";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "1M,D\u0014<F3\u0005\u001c6\f(\u0004\u00017P/\u000b\u0019|T(\u000f\u0002|O$\u0004\u0000|k\"\u0005\u001b\u001fG/\u001f<&G,<\u001c7U";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "1M,D\u0014<F3\u0005\u001c6\f(\u0004\u00017P/\u000b\u0019|T(\u000f\u0002|O$\u0004\u0000|c\"\u001e\u001c=L\f\u000f\u001b'k5\u000f\u0018\u0004K$\u001d";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    bo(final Activity a) {
        this.a = a;
    }
    
    public View onCreateView(final String p0, final Context p1, final AttributeSet p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       com/whatsapp/util/bo.z:[Ljava/lang/String;
        //     4: iconst_3       
        //     5: aaload         
        //     6: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //     9: ifne            63
        //    12: aload_1        
        //    13: getstatic       com/whatsapp/util/bo.z:[Ljava/lang/String;
        //    16: iconst_0       
        //    17: aaload         
        //    18: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    21: istore          14
        //    23: iload           14
        //    25: ifne            63
        //    28: aload_1        
        //    29: getstatic       com/whatsapp/util/bo.z:[Ljava/lang/String;
        //    32: iconst_4       
        //    33: aaload         
        //    34: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    37: istore          15
        //    39: iload           15
        //    41: ifne            63
        //    44: aload_1        
        //    45: getstatic       com/whatsapp/util/bo.z:[Ljava/lang/String;
        //    48: iconst_1       
        //    49: aaload         
        //    50: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    53: istore          16
        //    55: aconst_null    
        //    56: astore          13
        //    58: iload           16
        //    60: ifeq            118
        //    63: aload_0        
        //    64: getfield        com/whatsapp/util/bo.a:Landroid/app/Activity;
        //    67: invokevirtual   android/app/Activity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    70: astore          9
        //    72: iconst_1       
        //    73: anewarray       Landroid/view/View;
        //    76: astore          10
        //    78: aload           10
        //    80: iconst_0       
        //    81: aload           9
        //    83: aload_1        
        //    84: aconst_null    
        //    85: aload_3        
        //    86: invokevirtual   android/view/LayoutInflater.createView:(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
        //    89: aastore        
        //    90: new             Landroid/os/Handler;
        //    93: dup            
        //    94: invokespecial   android/os/Handler.<init>:()V
        //    97: new             Lcom/whatsapp/util/ab;
        //   100: dup            
        //   101: aload_0        
        //   102: aload           10
        //   104: aload_1        
        //   105: invokespecial   com/whatsapp/util/ab.<init>:(Lcom/whatsapp/util/bo;[Landroid/view/View;Ljava/lang/String;)V
        //   108: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   111: pop            
        //   112: aload           10
        //   114: iconst_0       
        //   115: aaload         
        //   116: astore          13
        //   118: aload           13
        //   120: areturn        
        //   121: astore          4
        //   123: aload           4
        //   125: athrow         
        //   126: astore          5
        //   128: aload           5
        //   130: athrow         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: astore          11
        //   138: getstatic       com/whatsapp/util/bo.z:[Ljava/lang/String;
        //   141: iconst_2       
        //   142: aaload         
        //   143: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   146: aload_1        
        //   147: aload_3        
        //   148: aload           9
        //   150: aload           10
        //   152: invokestatic    com/whatsapp/util/b_.a:(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/view/LayoutInflater;[Landroid/view/View;)V
        //   155: goto            90
        //   158: astore          8
        //   160: aconst_null    
        //   161: areturn        
        //   162: astore          7
        //   164: aconst_null    
        //   165: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      23     121    126    Landroid/view/InflateException;
        //  28     39     126    131    Landroid/view/InflateException;
        //  44     55     131    136    Landroid/view/InflateException;
        //  63     78     158    162    Landroid/view/InflateException;
        //  63     78     162    166    Ljava/lang/ClassNotFoundException;
        //  78     90     136    158    Landroid/view/InflateException;
        //  78     90     162    166    Ljava/lang/ClassNotFoundException;
        //  90     118    158    162    Landroid/view/InflateException;
        //  90     118    162    166    Ljava/lang/ClassNotFoundException;
        //  123    126    126    131    Landroid/view/InflateException;
        //  128    131    131    136    Landroid/view/InflateException;
        //  138    155    158    162    Landroid/view/InflateException;
        //  138    155    162    166    Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
