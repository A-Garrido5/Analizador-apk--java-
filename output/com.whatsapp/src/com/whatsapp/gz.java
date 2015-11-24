// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class gz implements TextWatcher
{
    private static final String[] z;
    private tw a;
    final ChangeNumber b;
    
    static {
        final String[] z2 = new String[2];
        String s = "}l";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'N';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = ')';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "B@VG)DFBD,DZ\u0018^/UK_L<\u000eIQ]+S\\RQ:B@VG)DL\u0017O/HDRMnMGXB;QkX\\ UZNj!EM\u0017O<NE\u0017j!TFC[7q@XG+hFQF";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public gz(final ChangeNumber b, final tw a) {
        this.b = b;
        this.a = a;
    }
    
    public void afterTextChanged(final Editable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          170
        //     4: aload_1        
        //     5: invokeinterface android/text/Editable.length:()I
        //    10: istore          12
        //    12: iload           12
        //    14: ifle            170
        //    17: aload_1        
        //    18: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/vi.g:(Ljava/lang/String;)Ljava/lang/String;
        //    24: astore          13
        //    26: aload           13
        //    28: astore_2       
        //    29: aload_0        
        //    30: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //    33: aload_2        
        //    34: putfield        com/whatsapp/tw.b:Ljava/lang/String;
        //    37: aload_0        
        //    38: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //    41: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    44: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    47: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    50: ldc             ""
        //    52: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    55: istore          4
        //    57: iload           4
        //    59: ifne            139
        //    62: aload_2        
        //    63: ifnull          139
        //    66: aload_0        
        //    67: getfield        com/whatsapp/gz.b:Lcom/whatsapp/ChangeNumber;
        //    70: aload_2        
        //    71: aload_0        
        //    72: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //    75: invokestatic    com/whatsapp/ChangeNumber.a:(Lcom/whatsapp/ChangeNumber;Ljava/lang/String;Lcom/whatsapp/tw;)V
        //    78: aload_0        
        //    79: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //    82: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    85: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    88: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    91: getstatic       com/whatsapp/gz.z:[Ljava/lang/String;
        //    94: iconst_0       
        //    95: aaload         
        //    96: ldc             ""
        //    98: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   101: astore          5
        //   103: aload_0        
        //   104: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //   107: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   110: aload           5
        //   112: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   115: aload_0        
        //   116: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //   119: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   122: invokevirtual   android/widget/EditText.hasFocus:()Z
        //   125: ifeq            139
        //   128: aload_0        
        //   129: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //   132: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   135: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   138: pop            
        //   139: return         
        //   140: astore          11
        //   142: aload           11
        //   144: athrow         
        //   145: astore          8
        //   147: aconst_null    
        //   148: astore          9
        //   150: aload           8
        //   152: astore          10
        //   154: getstatic       com/whatsapp/gz.z:[Ljava/lang/String;
        //   157: iconst_1       
        //   158: aaload         
        //   159: aload           10
        //   161: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   164: aload           9
        //   166: astore_2       
        //   167: goto            37
        //   170: aload_0        
        //   171: getfield        com/whatsapp/gz.a:Lcom/whatsapp/tw;
        //   174: aconst_null    
        //   175: putfield        com/whatsapp/tw.b:Ljava/lang/String;
        //   178: aconst_null    
        //   179: astore_2       
        //   180: goto            37
        //   183: astore_3       
        //   184: aload_3        
        //   185: athrow         
        //   186: astore          6
        //   188: aload           6
        //   190: athrow         
        //   191: astore          14
        //   193: aload_2        
        //   194: astore          9
        //   196: aload           14
        //   198: astore          10
        //   200: goto            154
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      12     140    145    Ljava/io/IOException;
        //  17     26     145    154    Ljava/io/IOException;
        //  29     37     191    203    Ljava/io/IOException;
        //  37     57     183    186    Ljava/io/IOException;
        //  103    139    186    191    Ljava/io/IOException;
        //  142    145    145    154    Ljava/io/IOException;
        //  170    178    145    154    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
