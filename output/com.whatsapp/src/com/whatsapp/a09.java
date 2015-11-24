// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.co;

class a09 extends co
{
    private static final String[] z;
    final ChangeNumber b;
    
    static {
        final String[] z2 = new String[9];
        String s = "R\nO\n,T\f[\t)T\u0010\u0001\u0014#^\fKD-P\u000bB\u0001/\u0011\u0016\\\r&}\u0007O\u0000\"_\u0005t\u00019^BH\u0016$\\Bm\u000b>_\u0016\\\u001d\u001bY\r@\u0001\u0002_\u0004A";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'K';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = 'd';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "R\nO\n,T\f[\t)T\u0010\u0001\u0017>S\u000fG\u0010dR\u0001\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";h";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0011\bG\u0000v";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "m&";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "R\nO\n,T\f[\t)T\u0010\u0001\u0014#^\fKK(R_";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001e\f[\t)T\u0010\u0013";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "R\nO\n,T\f[\t)T\u0010\u0001\u0017>S\u000fG\u0010d_\r\u0003\u0007$_\fK\u0007?X\u0014G\u00102";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0011\u0012FY";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a09(final ChangeNumber b) {
        this.b = b;
    }
    
    @Override
    public void a(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //     4: invokestatic    com/whatsapp/ChangeNumber.e:(Lcom/whatsapp/ChangeNumber;)Lcom/whatsapp/tw;
        //     7: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    10: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    13: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    16: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    19: astore_2       
        //    20: aload_0        
        //    21: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //    24: invokestatic    com/whatsapp/ChangeNumber.e:(Lcom/whatsapp/ChangeNumber;)Lcom/whatsapp/tw;
        //    27: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    30: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    33: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    36: astore_3       
        //    37: aload_0        
        //    38: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //    41: aload_2        
        //    42: aload_3        
        //    43: aload_0        
        //    44: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //    47: invokestatic    com/whatsapp/ChangeNumber.e:(Lcom/whatsapp/ChangeNumber;)Lcom/whatsapp/tw;
        //    50: invokestatic    com/whatsapp/ChangeNumber.a:(Lcom/whatsapp/ChangeNumber;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/tw;)Z
        //    53: istore          5
        //    55: iload           5
        //    57: ifne            66
        //    60: return         
        //    61: astore          4
        //    63: aload           4
        //    65: athrow         
        //    66: aload_0        
        //    67: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //    70: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    73: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    76: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    79: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    85: astore          6
        //    87: aload_0        
        //    88: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //    91: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //    94: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    97: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   100: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   103: astore          7
        //   105: aload_0        
        //   106: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   109: aload           6
        //   111: aload           7
        //   113: aload_0        
        //   114: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   117: getfield        com/whatsapp/ChangeNumber.y:Lcom/whatsapp/tw;
        //   120: invokestatic    com/whatsapp/ChangeNumber.a:(Lcom/whatsapp/ChangeNumber;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/tw;)Z
        //   123: istore          9
        //   125: iload           9
        //   127: ifeq            60
        //   130: aload_2        
        //   131: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   134: istore          10
        //   136: aload_3        
        //   137: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   140: iconst_4       
        //   141: aaload         
        //   142: ldc             ""
        //   144: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   147: astore          11
        //   149: iload           10
        //   151: aload           11
        //   153: invokestatic    com/whatsapp/vi.a:(ILjava/lang/String;)Ljava/lang/String;
        //   156: astore          25
        //   158: aload           25
        //   160: astore          11
        //   162: new             Ljava/lang/StringBuilder;
        //   165: dup            
        //   166: invokespecial   java/lang/StringBuilder.<init>:()V
        //   169: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   172: iconst_5       
        //   173: aaload         
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: aload_2        
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   184: bipush          6
        //   186: aaload         
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: aload           11
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   198: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   201: aload_2        
        //   202: invokestatic    com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)Ljava/lang/String;
        //   205: pop            
        //   206: aload           11
        //   208: invokestatic    com/whatsapp/ChangeNumber.d:(Ljava/lang/String;)Ljava/lang/String;
        //   211: pop            
        //   212: new             Ljava/lang/StringBuilder;
        //   215: dup            
        //   216: invokespecial   java/lang/StringBuilder.<init>:()V
        //   219: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   222: iconst_1       
        //   223: aaload         
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: invokestatic    com/whatsapp/ChangeNumber.b:()Ljava/lang/String;
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   236: bipush          8
        //   238: aaload         
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: invokestatic    com/whatsapp/ChangeNumber.d:()Ljava/lang/String;
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   251: iconst_3       
        //   252: aaload         
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   259: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   268: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   271: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   274: ldc             Lcom/whatsapp/fr;.class
        //   276: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //   279: checkcast       Lcom/whatsapp/fr;
        //   282: astore          15
        //   284: aload           15
        //   286: invokevirtual   com/whatsapp/fr.a:()Z
        //   289: istore          19
        //   291: iload           19
        //   293: ifne            381
        //   296: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   299: bipush          7
        //   301: aaload         
        //   302: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   305: aload_0        
        //   306: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   309: new             Ljava/lang/StringBuilder;
        //   312: dup            
        //   313: invokespecial   java/lang/StringBuilder.<init>:()V
        //   316: aload_0        
        //   317: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   320: ldc             2131230881
        //   322: invokevirtual   com/whatsapp/ChangeNumber.getString:(I)Ljava/lang/String;
        //   325: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   328: ldc             " "
        //   330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   333: aload_0        
        //   334: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   337: ldc             2131230920
        //   339: invokevirtual   com/whatsapp/ChangeNumber.getString:(I)Ljava/lang/String;
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   348: iconst_2       
        //   349: aaload         
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   353: aload_0        
        //   354: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   357: ldc             2131230921
        //   359: invokevirtual   com/whatsapp/ChangeNumber.getString:(I)Ljava/lang/String;
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokevirtual   com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)V
        //   371: getstatic       com/whatsapp/App.I:Z
        //   374: istore          24
        //   376: iload           24
        //   378: ifeq            60
        //   381: aload_0        
        //   382: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   385: iconst_1       
        //   386: invokevirtual   com/whatsapp/ChangeNumber.showDialog:(I)V
        //   389: aload_0        
        //   390: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   393: invokestatic    com/whatsapp/ChangeNumber.a:(Lcom/whatsapp/ChangeNumber;)Landroid/os/Handler;
        //   396: iconst_4       
        //   397: ldc2_w          30000
        //   400: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   403: pop            
        //   404: invokestatic    com/whatsapp/ChangeNumber.b:()Ljava/lang/String;
        //   407: invokestatic    com/whatsapp/ChangeNumber.d:()Ljava/lang/String;
        //   410: aload_0        
        //   411: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   414: invokestatic    com/whatsapp/ChangeNumber.c:(Lcom/whatsapp/ChangeNumber;)Lcom/whatsapp/protocol/bl;
        //   417: aload_0        
        //   418: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   421: invokestatic    com/whatsapp/ChangeNumber.d:(Lcom/whatsapp/ChangeNumber;)Lcom/whatsapp/protocol/c2;
        //   424: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/protocol/bl;Lcom/whatsapp/protocol/c2;)Z
        //   427: ifne            60
        //   430: aload_0        
        //   431: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   434: invokestatic    com/whatsapp/ChangeNumber.a:(Lcom/whatsapp/ChangeNumber;)Landroid/os/Handler;
        //   437: iconst_4       
        //   438: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   441: aload_0        
        //   442: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   445: iconst_1       
        //   446: invokevirtual   com/whatsapp/ChangeNumber.removeDialog:(I)V
        //   449: aload_0        
        //   450: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   453: astore          21
        //   455: aload_0        
        //   456: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   459: astore          22
        //   461: iconst_1       
        //   462: anewarray       Ljava/lang/Object;
        //   465: astore          23
        //   467: aload           23
        //   469: iconst_0       
        //   470: aload_0        
        //   471: getfield        com/whatsapp/a09.b:Lcom/whatsapp/ChangeNumber;
        //   474: ldc             2131230921
        //   476: invokevirtual   com/whatsapp/ChangeNumber.getString:(I)Ljava/lang/String;
        //   479: aastore        
        //   480: aload           21
        //   482: aload           22
        //   484: ldc             2131231532
        //   486: aload           23
        //   488: invokevirtual   com/whatsapp/ChangeNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   491: invokevirtual   com/whatsapp/ChangeNumber.f:(Ljava/lang/String;)V
        //   494: return         
        //   495: astore          18
        //   497: aload           18
        //   499: athrow         
        //   500: astore          8
        //   502: aload           8
        //   504: athrow         
        //   505: astore          12
        //   507: getstatic       com/whatsapp/a09.z:[Ljava/lang/String;
        //   510: iconst_0       
        //   511: aaload         
        //   512: aload           12
        //   514: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   517: goto            162
        //   520: astore          16
        //   522: aload           16
        //   524: athrow         
        //   525: astore          17
        //   527: aload           17
        //   529: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     55     61     66     Ljava/io/IOException;
        //  105    125    500    505    Ljava/io/IOException;
        //  149    158    505    520    Ljava/io/IOException;
        //  284    291    520    525    Ljava/io/IOException;
        //  296    376    525    530    Ljava/io/IOException;
        //  381    494    495    500    Ljava/io/IOException;
        //  522    525    525    530    Ljava/io/IOException;
        //  527    530    495    500    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 237, Size: 237
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
