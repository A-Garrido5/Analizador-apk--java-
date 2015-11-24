// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class fe implements TextWatcher
{
    private static final String[] z;
    final DeleteAccount a;
    
    static {
        final String[] z2 = new String[2];
        String s = "x\u0005";
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
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = '}';
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
                    s = "@$u\u0018\nAlx\u001e\u001dK4w\tQS m\u001e\u0016A36\u001c\u0018P$k\t\u001b\\5z\u0015\u001fJ&|\u0019^B p\u0011\u001b@au\u0012\u0011O4i>\u0011Q/m\u000f\u0007g.}\u0018^B3v\u0010^g.l\u0013\nV8I\u0015\u0011J$P\u0013\u0018K";
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
    
    fe(final DeleteAccount a) {
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
        //     5: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //     8: invokestatic    com/whatsapp/DeleteAccount.b:(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
        //    11: ifnull          231
        //    14: aload_0        
        //    15: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //    18: invokestatic    com/whatsapp/DeleteAccount.b:(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
        //    21: invokestatic    com/whatsapp/vi.h:(Ljava/lang/String;)Ljava/lang/String;
        //    24: aload_1        
        //    25: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    28: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    31: istore          19
        //    33: iload           19
        //    35: ifeq            231
        //    38: aload_0        
        //    39: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //    42: invokestatic    com/whatsapp/DeleteAccount.b:(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
        //    45: astore          20
        //    47: aload           20
        //    49: astore          5
        //    51: aload_0        
        //    52: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //    55: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //    58: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    61: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    64: ldc             ""
        //    66: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    69: istore          9
        //    71: iload           9
        //    73: ifeq            99
        //    76: aload_0        
        //    77: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //    80: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //    87: ldc             2131231533
        //    89: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //    92: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    95: iload_2        
        //    96: ifeq            209
        //    99: aload           5
        //   101: ifnonnull       127
        //   104: aload_0        
        //   105: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   108: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   111: aload_0        
        //   112: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   115: ldc             2131231541
        //   117: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //   120: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   123: iload_2        
        //   124: ifeq            209
        //   127: aload_0        
        //   128: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   131: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   134: aload           5
        //   136: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   139: aload_0        
        //   140: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   143: aload           5
        //   145: invokestatic    com/whatsapp/DeleteAccount.a:(Lcom/whatsapp/DeleteAccount;Ljava/lang/String;)V
        //   148: aload_0        
        //   149: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   152: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   155: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   158: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   161: getstatic       com/whatsapp/fe.z:[Ljava/lang/String;
        //   164: iconst_0       
        //   165: aaload         
        //   166: ldc             ""
        //   168: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   171: astore          10
        //   173: aload_0        
        //   174: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   177: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   180: aload           10
        //   182: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   185: aload_0        
        //   186: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   189: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   192: invokevirtual   android/widget/EditText.hasFocus:()Z
        //   195: ifeq            209
        //   198: aload_0        
        //   199: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   202: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   205: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   208: pop            
        //   209: return         
        //   210: astore_3       
        //   211: aload_3        
        //   212: athrow         
        //   213: astore          4
        //   215: getstatic       com/whatsapp/fe.z:[Ljava/lang/String;
        //   218: iconst_1       
        //   219: aaload         
        //   220: aload           4
        //   222: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   225: aconst_null    
        //   226: astore          5
        //   228: goto            51
        //   231: aload_0        
        //   232: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   235: invokestatic    com/whatsapp/DeleteAccount.b:(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
        //   238: astore          15
        //   240: aload           15
        //   242: ifnull          262
        //   245: aload_1        
        //   246: ifnull          288
        //   249: aload_1        
        //   250: invokeinterface android/text/Editable.length:()I
        //   255: istore          18
        //   257: iload           18
        //   259: ifle            288
        //   262: aload_1        
        //   263: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   266: invokestatic    com/whatsapp/vi.g:(Ljava/lang/String;)Ljava/lang/String;
        //   269: astore          16
        //   271: aload           16
        //   273: astore          5
        //   275: goto            51
        //   278: astore          13
        //   280: aload           13
        //   282: athrow         
        //   283: astore          14
        //   285: aload           14
        //   287: athrow         
        //   288: aload_0        
        //   289: getfield        com/whatsapp/fe.a:Lcom/whatsapp/DeleteAccount;
        //   292: invokestatic    com/whatsapp/DeleteAccount.b:(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
        //   295: astore          17
        //   297: aload           17
        //   299: astore          5
        //   301: goto            51
        //   304: astore          6
        //   306: aload           6
        //   308: athrow         
        //   309: astore          7
        //   311: aload           7
        //   313: athrow         
        //   314: astore          8
        //   316: aload           8
        //   318: athrow         
        //   319: astore          11
        //   321: aload           11
        //   323: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      33     210    213    Ljava/io/IOException;
        //  38     47     213    231    Ljava/io/IOException;
        //  51     71     304    309    Ljava/io/IOException;
        //  76     95     309    314    Ljava/io/IOException;
        //  104    123    314    319    Ljava/io/IOException;
        //  173    209    319    324    Ljava/io/IOException;
        //  211    213    213    231    Ljava/io/IOException;
        //  231    240    278    283    Ljava/io/IOException;
        //  249    257    283    288    Ljava/io/IOException;
        //  262    271    213    231    Ljava/io/IOException;
        //  280    283    283    288    Ljava/io/IOException;
        //  285    288    213    231    Ljava/io/IOException;
        //  288    297    213    231    Ljava/io/IOException;
        //  306    309    309    314    Ljava/io/IOException;
        //  311    314    314    319    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 147, Size: 147
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
