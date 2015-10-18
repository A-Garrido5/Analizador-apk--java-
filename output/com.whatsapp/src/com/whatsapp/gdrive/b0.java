// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import com.whatsapp.util.by;
import com.whatsapp.util.Log;
import android.view.View$OnClickListener;
import android.support.annotation.Nullable;

class b0 implements cs
{
    private static final String[] z;
    private int a;
    final SettingsGoogleDrive b;
    private int c;
    private long d;
    private int e;
    @o
    private int f;
    private long g;
    
    static {
        final String[] z2 = new String[28];
        String s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`Q$^\u001f(EjX\b.@7OA8O(D\u0019#U O";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '+';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=S [A>U$Y\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjF\u001f*R1D\u001e(\f!D\u001b#M*J\b`D7Y\u0003?\u000e0E\t5Q H\u0018(EhX\u0018,U ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=S*L\u001e(R6\u000b\u0005#B*Y\u001e(B1\u000b\u0005#W*H\r9H*EVm";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`Q$^\u001f(EjG\u0003:\f'J\u00189D7R";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A.@+H\t!M O";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=@0X\t)\u000e)D\u001b`C$_\u0018(S<";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjF\u001f*R1D\u001e(\f!D\u001b#M*J\b`Q7D\u000b?D6XC8O S\u001c(B1N\b`R1J\u0018(";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjF\u001f*R1D\u001e(\f!D\u001b#M*J\b`Q7D\u000b?D6XC)N2E\u0000\"@!N\bw\u0001";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000b\u0018\"U$GVm";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjF\u001f*R1D\u001e(\f!D\u001b#M*J\b`R1J\u001e9\u000e0E\t5Q H\u0018(EhX\u0018,U ";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0004\u001f(UhF\t>R$L\tbR-D\u001b`H+O\t9D7F\u0005#@1N";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "F\t>R$L\tmR-D\u0019!EeI\tmO0G\u0000mV-N\u0002mC0_\u0018\"OeC\r>\u00011DL/DeO\u0005>Q)J\u0015(Ek";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A(O!\u000b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`Q$^\u001f(EjE\u0003`V,M\u0005";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=@0X\t)\u000e+DA:H#B";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=S*L\u001e(R6\u000b";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=@0X\t)\u000e+DA)@1JA.N+E\t.U,D\u0002";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=@0X\t)\u000e6O\u000f,S!\u0006\u0019#L*^\u00029D!";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=S*L\u001e(R6\u000b";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`Q$^\u001f(EjE\u0003`E$_\r`B*E\u0002(B1B\u0003#";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A=@0X\t)\u000e6O\u000f,S!\u0006\u0001$R6B\u0002*";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjI\r.J0[A>U$Y\u0018";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`Q$^\u001f(EjX\b.@7OA H6X\u0005#F";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(Sj[\u0003>UhI\r.J0[A>B7^\u000e`R1J\u001e9";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjF\u001f*R1D\u001e(\f!D\u001b#M*J\b`D+OC8O S\u001c(B1N\b`R1J\u0018(";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`D+OL";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "X\t9U,E\u000b>\f\"O\u001e$W \u0006\u0003/R Y\u001a(SjY\t>U*Y\t`R1J\u001e9";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    b0(final SettingsGoogleDrive b) {
        this.b = b;
        this.d = -1L;
        this.g = -1L;
    }
    
    private void a(@o final int p0, @Nullable final String p1, @Nullable final View$OnClickListener p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore          5
        //     5: iload_1        
        //     6: tableswitch {
        //                4: 37
        //                5: 74
        //                6: 141
        //                7: 198
        //          default: 36
        //        }
        //    36: return         
        //    37: aload_0        
        //    38: getfield        com/whatsapp/gdrive/b0.f:I
        //    41: istore          15
        //    43: iload           15
        //    45: iconst_2       
        //    46: if_icmpeq       36
        //    49: aload_0        
        //    50: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    53: new             Lcom/whatsapp/gdrive/cr;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   com/whatsapp/gdrive/cr.<init>:(Lcom/whatsapp/gdrive/b0;)V
        //    61: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //    64: aload_0        
        //    65: iconst_2       
        //    66: putfield        com/whatsapp/gdrive/b0.f:I
        //    69: iload           5
        //    71: ifeq            36
        //    74: aload_0        
        //    75: getfield        com/whatsapp/gdrive/b0.f:I
        //    78: iconst_3       
        //    79: if_icmpeq       103
        //    82: aload_0        
        //    83: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    86: new             Lcom/whatsapp/gdrive/r;
        //    89: dup            
        //    90: aload_0        
        //    91: aload_3        
        //    92: invokespecial   com/whatsapp/gdrive/r.<init>:(Lcom/whatsapp/gdrive/b0;Landroid/view/View$OnClickListener;)V
        //    95: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //    98: aload_0        
        //    99: iconst_3       
        //   100: putfield        com/whatsapp/gdrive/b0.f:I
        //   103: aload_2        
        //   104: ifnull          36
        //   107: new             Ljava/lang/IllegalArgumentException;
        //   110: dup            
        //   111: getstatic       com/whatsapp/gdrive/b0.z:[Ljava/lang/String;
        //   114: bipush          12
        //   116: aaload         
        //   117: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   120: athrow         
        //   121: astore          12
        //   123: aload           12
        //   125: athrow         
        //   126: astore          13
        //   128: aload           13
        //   130: athrow         
        //   131: astore          14
        //   133: aload           14
        //   135: athrow         
        //   136: astore          11
        //   138: aload           11
        //   140: athrow         
        //   141: aload_2        
        //   142: invokestatic    com/whatsapp/aol.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   145: pop            
        //   146: aload_0        
        //   147: getfield        com/whatsapp/gdrive/b0.f:I
        //   150: iconst_4       
        //   151: if_icmpeq       175
        //   154: aload_0        
        //   155: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   158: new             Lcom/whatsapp/gdrive/ax;
        //   161: dup            
        //   162: aload_0        
        //   163: aload_3        
        //   164: invokespecial   com/whatsapp/gdrive/ax.<init>:(Lcom/whatsapp/gdrive/b0;Landroid/view/View$OnClickListener;)V
        //   167: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   170: aload_0        
        //   171: iconst_4       
        //   172: putfield        com/whatsapp/gdrive/b0.f:I
        //   175: aload_0        
        //   176: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   179: new             Lcom/whatsapp/gdrive/u;
        //   182: dup            
        //   183: aload_0        
        //   184: iload           4
        //   186: aload_2        
        //   187: invokespecial   com/whatsapp/gdrive/u.<init>:(Lcom/whatsapp/gdrive/b0;ILjava/lang/String;)V
        //   190: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   193: iload           5
        //   195: ifeq            36
        //   198: aload_2        
        //   199: invokestatic    com/whatsapp/aol.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   202: pop            
        //   203: aload_0        
        //   204: getfield        com/whatsapp/gdrive/b0.f:I
        //   207: iconst_5       
        //   208: if_icmpeq       241
        //   211: getstatic       com/whatsapp/gdrive/b0.z:[Ljava/lang/String;
        //   214: bipush          11
        //   216: aaload         
        //   217: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   220: aload_0        
        //   221: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   224: new             Lcom/whatsapp/gdrive/bu;
        //   227: dup            
        //   228: aload_0        
        //   229: aload_3        
        //   230: invokespecial   com/whatsapp/gdrive/bu.<init>:(Lcom/whatsapp/gdrive/b0;Landroid/view/View$OnClickListener;)V
        //   233: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   236: aload_0        
        //   237: iconst_5       
        //   238: putfield        com/whatsapp/gdrive/b0.f:I
        //   241: aload_0        
        //   242: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   245: new             Lcom/whatsapp/gdrive/az;
        //   248: dup            
        //   249: aload_0        
        //   250: aload_2        
        //   251: invokespecial   com/whatsapp/gdrive/az.<init>:(Lcom/whatsapp/gdrive/b0;Ljava/lang/String;)V
        //   254: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   257: return         
        //   258: astore          8
        //   260: aload           8
        //   262: athrow         
        //   263: astore          10
        //   265: aload           10
        //   267: athrow         
        //   268: astore          6
        //   270: aload           6
        //   272: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  37     43     126    131    Ljava/lang/IllegalArgumentException;
        //  49     69     131    136    Ljava/lang/IllegalArgumentException;
        //  74     103    136    141    Ljava/lang/IllegalArgumentException;
        //  107    121    121    126    Ljava/lang/IllegalArgumentException;
        //  128    131    131    136    Ljava/lang/IllegalArgumentException;
        //  133    136    136    141    Ljava/lang/IllegalArgumentException;
        //  141    175    258    263    Ljava/lang/IllegalArgumentException;
        //  175    193    263    268    Ljava/lang/IllegalArgumentException;
        //  198    241    268    273    Ljava/lang/IllegalArgumentException;
        //  265    268    268    273    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 128, Size: 128
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
    
    @Override
    public void a() {
        Log.i(b0.z[22]);
        this.d = -1L;
    }
    
    @Override
    public void a(@ct final int n) {
        Log.e(b0.z[2]);
    }
    
    @Override
    public void a(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[6]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232120), SettingsGoogleDrive.s(this.b), n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void a(final long g, final long n, final long n2) {
        final int f = GoogleDriveService.F;
        Label_0082: {
            if (g == 0L) {
                final String s = this.b.getString(2131232145);
                if (f == 0) {
                    break Label_0082;
                }
            }
            if (g < 1024L) {
                final String s = this.b.getString(2131231388, new Object[] { g });
                if (f == 0) {
                    break Label_0082;
                }
            }
            final String s = by.a((Context)this.b, g);
            try {
                if (!by.a((Context)this.b, g).equals(by.a((Context)this.b, this.g))) {
                    this.g = g;
                    this.a(4, this.b.getString(2131232137, new Object[] { s, by.a((Context)this.b, n2), 100L * g / n2 }), null, (int)(100L * g / n2));
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public void a(final boolean b, final long n, final long n2) {
        Log.i(b0.z[26] + b);
        this.a(3, null, SettingsGoogleDrive.k(this.b), -1);
        this.c = 0;
    }
    
    @Override
    public void b() {
        Log.i(b0.z[27]);
        this.a(5, this.b.getString(2131232134), null, -1);
    }
    
    @Override
    public void b(@ct final int n) {
        Label_0014: {
            if (n == 10) {
                break Label_0014;
            }
            try {
                this.a(2, null, null, -1);
                this.b.runOnUiThread((Runnable)new a5(this, n));
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void b(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lload_3        
        //     1: lconst_0       
        //     2: lcmp           
        //     3: ifle            80
        //     6: ldc2_w          100
        //     9: lload_1        
        //    10: lmul           
        //    11: lload_3        
        //    12: ldiv           
        //    13: l2i            
        //    14: istore          6
        //    16: iload           6
        //    18: aload_0        
        //    19: getfield        com/whatsapp/gdrive/b0.c:I
        //    22: isub           
        //    23: ifle            74
        //    26: aload_0        
        //    27: iload           6
        //    29: putfield        com/whatsapp/gdrive/b0.c:I
        //    32: aload_0        
        //    33: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    36: astore          8
        //    38: iconst_1       
        //    39: anewarray       Ljava/lang/Object;
        //    42: astore          9
        //    44: aload           9
        //    46: iconst_0       
        //    47: aload_0        
        //    48: getfield        com/whatsapp/gdrive/b0.c:I
        //    51: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    54: aastore        
        //    55: aload_0        
        //    56: iconst_5       
        //    57: aload           8
        //    59: ldc             2131232135
        //    61: aload           9
        //    63: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    66: aconst_null    
        //    67: aload_0        
        //    68: getfield        com/whatsapp/gdrive/b0.c:I
        //    71: invokespecial   com/whatsapp/gdrive/b0.a:(ILjava/lang/String;Landroid/view/View$OnClickListener;I)V
        //    74: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //    77: ifeq            118
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: getstatic       com/whatsapp/gdrive/b0.z:[Ljava/lang/String;
        //    90: bipush          16
        //    92: aaload         
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: lload_1        
        //    97: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   100: ldc             "/"
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: lload_3        
        //   106: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   115: invokestatic    java/lang/Thread.dumpStack:()V
        //   118: return         
        //   119: astore          7
        //   121: aload           7
        //   123: athrow         
        //   124: astore          5
        //   126: aload           5
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  16     74     119    124    Ljava/lang/IllegalArgumentException;
        //  74     80     124    129    Ljava/lang/IllegalArgumentException;
        //  80     118    124    129    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    @Override
    public void b(final boolean b) {
        Log.e(b0.z[25]);
    }
    
    @Override
    public void c() {
        Log.e(b0.z[10]);
    }
    
    @Override
    public void c(@ct final int n) {
        this.b.runOnUiThread((Runnable)new a8(this, n));
    }
    
    @Override
    public void c(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[17]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232126), SettingsGoogleDrive.s(this.b), n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void c(final boolean b) {
        Log.i(b0.z[13] + b);
        this.e = 0;
        this.a(3, null, SettingsGoogleDrive.k(this.b), -1);
    }
    
    @Override
    public void d() {
        Log.i(b0.z[5]);
        this.e = 0;
        this.a(3, null, SettingsGoogleDrive.k(this.b), -1);
    }
    
    @Override
    public void d(final int a) {
        try {
            if (a - this.a >= 1) {
                this.a = a;
                this.a(5, this.b.getString(2131232101, new Object[] { a }), SettingsGoogleDrive.s(this.b), -1);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[20]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232132), null, n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void e() {
        Log.i(b0.z[1]);
        this.a(5, this.b.getString(2131232122), SettingsGoogleDrive.s(this.b), -1);
    }
    
    @Override
    public void e(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[14]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232136), null, n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void f() {
        Log.i(b0.z[24]);
        this.a(5, this.b.getString(2131232100), SettingsGoogleDrive.s(this.b), -1);
        this.a = 0;
    }
    
    @Override
    public void f(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[21]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232006), SettingsGoogleDrive.s(this.b), n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void g(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[15]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232121), SettingsGoogleDrive.s(this.b), n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void h(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lload_3        
        //     1: lconst_0       
        //     2: lcmp           
        //     3: ifle            90
        //     6: ldc2_w          100
        //     9: lload_1        
        //    10: lmul           
        //    11: lload_3        
        //    12: ldiv           
        //    13: l2i            
        //    14: istore          6
        //    16: iload           6
        //    18: aload_0        
        //    19: getfield        com/whatsapp/gdrive/b0.e:I
        //    22: isub           
        //    23: ifle            84
        //    26: invokestatic    com/whatsapp/aol.b:()V
        //    29: aload_0        
        //    30: iload           6
        //    32: putfield        com/whatsapp/gdrive/b0.e:I
        //    35: aload_0        
        //    36: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    39: astore          8
        //    41: iconst_1       
        //    42: anewarray       Ljava/lang/Object;
        //    45: astore          9
        //    47: aload           9
        //    49: iconst_0       
        //    50: aload_0        
        //    51: getfield        com/whatsapp/gdrive/b0.e:I
        //    54: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    57: aastore        
        //    58: aload_0        
        //    59: iconst_5       
        //    60: aload           8
        //    62: ldc_w           2131232123
        //    65: aload           9
        //    67: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    70: aload_0        
        //    71: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    74: invokestatic    com/whatsapp/gdrive/SettingsGoogleDrive.s:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)Landroid/view/View$OnClickListener;
        //    77: aload_0        
        //    78: getfield        com/whatsapp/gdrive/b0.e:I
        //    81: invokespecial   com/whatsapp/gdrive/b0.a:(ILjava/lang/String;Landroid/view/View$OnClickListener;I)V
        //    84: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //    87: ifeq            128
        //    90: new             Ljava/lang/StringBuilder;
        //    93: dup            
        //    94: invokespecial   java/lang/StringBuilder.<init>:()V
        //    97: getstatic       com/whatsapp/gdrive/b0.z:[Ljava/lang/String;
        //   100: bipush          19
        //   102: aaload         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: lload_1        
        //   107: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   110: ldc             "/"
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: lload_3        
        //   116: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   125: invokestatic    java/lang/Thread.dumpStack:()V
        //   128: return         
        //   129: astore          7
        //   131: aload           7
        //   133: athrow         
        //   134: astore          5
        //   136: aload           5
        //   138: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  16     84     129    134    Ljava/lang/IllegalArgumentException;
        //  84     90     134    139    Ljava/lang/IllegalArgumentException;
        //  90     128    134    139    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0084:
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
    
    @Override
    public void i(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[18]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232008), SettingsGoogleDrive.s(this.b), n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void j(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lload_3        
        //     1: lconst_0       
        //     2: lcmp           
        //     3: ifgt            50
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: getstatic       com/whatsapp/gdrive/b0.z:[Ljava/lang/String;
        //    16: iconst_3       
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: lload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    25: ldc             "/"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: lload_3        
        //    31: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    40: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //    43: istore          10
        //    45: iload           10
        //    47: ifeq            187
        //    50: aload_0        
        //    51: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    54: lload_1        
        //    55: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //    58: astore          5
        //    60: ldc2_w          100
        //    63: aload_0        
        //    64: getfield        com/whatsapp/gdrive/b0.d:J
        //    67: lmul           
        //    68: lload_3        
        //    69: ldiv           
        //    70: l2i            
        //    71: ldc2_w          100
        //    74: lload_1        
        //    75: lmul           
        //    76: lload_3        
        //    77: ldiv           
        //    78: l2i            
        //    79: if_icmpne       107
        //    82: aload_0        
        //    83: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    86: lload_1        
        //    87: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/gdrive/b0.d:J
        //    98: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   101: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   104: ifne            187
        //   107: aload_0        
        //   108: lload_1        
        //   109: putfield        com/whatsapp/gdrive/b0.d:J
        //   112: aload_0        
        //   113: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   116: astore          7
        //   118: iconst_3       
        //   119: anewarray       Ljava/lang/Object;
        //   122: astore          8
        //   124: aload           8
        //   126: iconst_0       
        //   127: aload           5
        //   129: aastore        
        //   130: aload           8
        //   132: iconst_1       
        //   133: aload_0        
        //   134: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   137: lload_3        
        //   138: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   141: aastore        
        //   142: aload           8
        //   144: iconst_2       
        //   145: ldc2_w          100
        //   148: lload_1        
        //   149: lmul           
        //   150: lload_3        
        //   151: ldiv           
        //   152: l2i            
        //   153: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   156: aastore        
        //   157: aload_0        
        //   158: iconst_4       
        //   159: aload           7
        //   161: ldc_w           2131232124
        //   164: aload           8
        //   166: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   169: aload_0        
        //   170: getfield        com/whatsapp/gdrive/b0.b:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   173: invokestatic    com/whatsapp/gdrive/SettingsGoogleDrive.s:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;)Landroid/view/View$OnClickListener;
        //   176: lload_1        
        //   177: ldc2_w          100
        //   180: lmul           
        //   181: lload_3        
        //   182: ldiv           
        //   183: l2i            
        //   184: invokespecial   com/whatsapp/gdrive/b0.a:(ILjava/lang/String;Landroid/view/View$OnClickListener;I)V
        //   187: return         
        //   188: astore          9
        //   190: aload           9
        //   192: athrow         
        //   193: astore          6
        //   195: aload           6
        //   197: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      45     188    193    Ljava/lang/IllegalArgumentException;
        //  82     107    193    198    Ljava/lang/IllegalArgumentException;
        //  107    187    193    198    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0107:
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
    
    @Override
    public void k(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[4]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232133), null, n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void l(final long n, final long n2) {
        Log.e(b0.z[7]);
        Log.i(b0.z[8] + n + b0.z[9] + n2);
    }
    
    @Override
    public void m(final long n, final long n2) {
        while (true) {
            while (true) {
                try {
                    Log.i(b0.z[0]);
                    if (n2 > 0L) {
                        final int n3 = (int)(100L * n / n2);
                        this.a(4, this.b.getString(2131232070), null, n3);
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n3 = -1;
                continue;
            }
        }
    }
    
    @Override
    public void n(final long n, final long n2) {
        Log.i(b0.z[23]);
        this.a(4, this.b.getString(2131232068), null, (int)(100L * n / n2));
    }
}
