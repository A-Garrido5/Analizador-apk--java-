// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class ld implements TextWatcher
{
    private static final String[] z;
    final RegisterPhone a;
    
    static {
        final String[] z2 = new String[2];
        String s = "UC`yFSCu?EOIiu\u001aDIr~AU_pqADNbb\u001aF@suGSC\u007fdVOGiwPC\u0006k\u007fZLSwSZRHsbLdIcu\u0015ATh}\u0015dIr~AU_WxZICN~SH\u0006aq\\KCc";
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
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '\'';
                        break;
                    }
                    case 1: {
                        c2 = '&';
                        break;
                    }
                    case 2: {
                        c2 = '\u0007';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
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
                    s = "{b";
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
    
    ld(final RegisterPhone a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //     8: invokestatic    com/whatsapp/RegisterPhone.c:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //    11: ifnull          255
        //    14: aload_0        
        //    15: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //    18: invokestatic    com/whatsapp/RegisterPhone.c:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/vi.h:(Ljava/lang/String;)Ljava/lang/String;
        //    24: aload_1        
        //    25: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    28: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    31: istore          19
        //    33: iload           19
        //    35: ifeq            255
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //    42: invokestatic    com/whatsapp/RegisterPhone.c:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //    45: astore          20
        //    47: aload           20
        //    49: astore          5
        //    51: aload_0        
        //    52: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //    55: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    58: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    61: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    64: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    67: ldc             ""
        //    69: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    72: istore          9
        //    74: iload           9
        //    76: ifeq            105
        //    79: aload_0        
        //    80: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //    83: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    86: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //    89: aload_0        
        //    90: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //    93: ldc             2131231533
        //    95: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //    98: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   101: iload_2        
        //   102: ifeq            233
        //   105: aload           5
        //   107: ifnonnull       136
        //   110: aload_0        
        //   111: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   114: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   117: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   120: aload_0        
        //   121: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   124: ldc             2131231541
        //   126: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //   129: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   132: iload_2        
        //   133: ifeq            233
        //   136: aload_0        
        //   137: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   140: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   143: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   146: aload           5
        //   148: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   151: aload_0        
        //   152: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   155: aload           5
        //   157: invokestatic    com/whatsapp/RegisterPhone.a:(Lcom/whatsapp/RegisterPhone;Ljava/lang/String;)V
        //   160: aload_0        
        //   161: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   164: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   167: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   170: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   173: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   176: getstatic       com/whatsapp/ld.z:[Ljava/lang/String;
        //   179: iconst_1       
        //   180: aaload         
        //   181: ldc             ""
        //   183: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   186: astore          10
        //   188: aload_0        
        //   189: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   192: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   195: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   198: aload           10
        //   200: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   203: aload_0        
        //   204: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   207: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   210: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   213: invokevirtual   android/widget/EditText.hasFocus:()Z
        //   216: ifeq            233
        //   219: aload_0        
        //   220: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   223: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   226: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   229: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   232: pop            
        //   233: return         
        //   234: astore_3       
        //   235: aload_3        
        //   236: athrow         
        //   237: astore          4
        //   239: getstatic       com/whatsapp/ld.z:[Ljava/lang/String;
        //   242: iconst_0       
        //   243: aaload         
        //   244: aload           4
        //   246: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   249: aconst_null    
        //   250: astore          5
        //   252: goto            51
        //   255: aload_0        
        //   256: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   259: invokestatic    com/whatsapp/RegisterPhone.c:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //   262: astore          15
        //   264: aload           15
        //   266: ifnull          286
        //   269: aload_1        
        //   270: ifnull          312
        //   273: aload_1        
        //   274: invokeinterface android/text/Editable.length:()I
        //   279: istore          18
        //   281: iload           18
        //   283: ifle            312
        //   286: aload_1        
        //   287: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   290: invokestatic    com/whatsapp/vi.g:(Ljava/lang/String;)Ljava/lang/String;
        //   293: astore          16
        //   295: aload           16
        //   297: astore          5
        //   299: goto            51
        //   302: astore          13
        //   304: aload           13
        //   306: athrow         
        //   307: astore          14
        //   309: aload           14
        //   311: athrow         
        //   312: aload_0        
        //   313: getfield        com/whatsapp/ld.a:Lcom/whatsapp/RegisterPhone;
        //   316: invokestatic    com/whatsapp/RegisterPhone.c:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //   319: astore          17
        //   321: aload           17
        //   323: astore          5
        //   325: goto            51
        //   328: astore          6
        //   330: aload           6
        //   332: athrow         
        //   333: astore          7
        //   335: aload           7
        //   337: athrow         
        //   338: astore          8
        //   340: aload           8
        //   342: athrow         
        //   343: astore          11
        //   345: aload           11
        //   347: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      33     234    237    Ljava/io/IOException;
        //  38     47     237    255    Ljava/io/IOException;
        //  51     74     328    333    Ljava/io/IOException;
        //  79     101    333    338    Ljava/io/IOException;
        //  110    132    338    343    Ljava/io/IOException;
        //  188    233    343    348    Ljava/io/IOException;
        //  235    237    237    255    Ljava/io/IOException;
        //  255    264    302    307    Ljava/io/IOException;
        //  273    281    307    312    Ljava/io/IOException;
        //  286    295    237    255    Ljava/io/IOException;
        //  304    307    307    312    Ljava/io/IOException;
        //  309    312    237    255    Ljava/io/IOException;
        //  312    321    237    255    Ljava/io/IOException;
        //  330    333    333    338    Ljava/io/IOException;
        //  335    338    338    343    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
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
