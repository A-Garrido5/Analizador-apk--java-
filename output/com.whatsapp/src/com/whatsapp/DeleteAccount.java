// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Intent;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.bl;
import android.os.Handler;
import android.text.TextWatcher;
import android.widget.EditText;

public class DeleteAccount extends DialogToastActivity
{
    private static String l;
    private static String m;
    private static final String[] z;
    private int k;
    EditText n;
    private TextWatcher o;
    boolean p;
    private int q;
    private Handler r;
    private TextWatcher s;
    EditText t;
    EditText u;
    private bl v;
    private String w;
    private c2 x;
    
    static {
        final String[] z2 = new String[18];
        String s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#<\u0015\u0006y2*Z";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0482:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\") \u000fGn/7\u0005Hk!:\f\ri`'\u000fHj%'@\u000bb$6@\u000e\u007f/>@+b5=\u0014\u001at\u0010;\u000f\u0006h\t=\u0006\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`/@";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#!\u0005\ty%";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#<\u0015\u0006y2*Z";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "`5\u0001\u0001a%7@+b5=\u0014\u001at\u0010;\u000f\u0006h\t=\u0006\u0007#,<\u000f\u0003x0\u0010\u000f\u001dc4!\u0019)o\"!\"\u0011C!>\u0005@$";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "#0";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "#<\u0015\u0006y2*?\u0006l-6";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "`/@";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#<\u0015\u0006y2*Z";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "`0\u0001\u001d~%7@\tc`\u001a/-u#6\u0010\u001cd/=";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"&<\u0012\u0005l4'\u0005\u001a %+\u0003\r}4:\u000f\u0006";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "&2\t\u0004h$s\u0014\u0007-,<\u000f\u0003x0\u0010\u000f\u001dc4!\u0019)o\"!\"\u0011C!>\u0005Hk2<\rHN/&\u000e\u001c\u007f9\u0003\b\u0007c%\u001a\u000e\u000eb`";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#<\u0015\u0006y2*ZH";
                    n = 12;
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    array = z2;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"#<\u0015\u0006y2*Z";
                    n = 13;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"0;\u000f\u0006ho!\u0005\u001bx-6";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"$6\u0013\u001c\u007f/*";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "$6\f\ry%~\u0001\u000bn/&\u000e\u001c\"02\u0015\u001bh`";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    break Label_0482;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        DeleteAccount.m = null;
        DeleteAccount.l = null;
    }
    
    public DeleteAccount() {
        this.p = false;
        this.r = new rd(this);
        this.v = new rj(this);
        this.x = new ahx(this);
    }
    
    static Handler a(final DeleteAccount deleteAccount) {
        return deleteAccount.r;
    }
    
    static String a() {
        return DeleteAccount.l;
    }
    
    static String a(final String m) {
        return DeleteAccount.m = m;
    }
    
    static void a(final DeleteAccount deleteAccount, final String s) {
        deleteAccount.b(s);
    }
    
    static String b() {
        return DeleteAccount.m;
    }
    
    static String b(final DeleteAccount deleteAccount) {
        return deleteAccount.w;
    }
    
    private void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //    10: bipush          14
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //    23: bipush          8
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_1        
        //    30: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/DeleteAccount.o:Landroid/text/TextWatcher;
        //    46: ifnull          60
        //    49: aload_0        
        //    50: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/DeleteAccount.o:Landroid/text/TextWatcher;
        //    57: invokevirtual   android/widget/EditText.removeTextChangedListener:(Landroid/text/TextWatcher;)V
        //    60: aload_0        
        //    61: new             Lcom/whatsapp/ahr;
        //    64: dup            
        //    65: aload_1        
        //    66: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    69: invokespecial   com/whatsapp/ahr.<init>:(Ljava/lang/String;)V
        //    72: putfield        com/whatsapp/DeleteAccount.o:Landroid/text/TextWatcher;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //    79: aload_0        
        //    80: getfield        com/whatsapp/DeleteAccount.o:Landroid/text/TextWatcher;
        //    83: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //    86: return         
        //    87: astore_2       
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //    98: bipush          13
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: aload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   111: bipush          12
        //   113: aaload         
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload_2        
        //   118: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   130: goto            42
        //   133: astore          4
        //   135: aload           4
        //   137: athrow         
        //   138: astore_3       
        //   139: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   142: bipush          11
        //   144: aaload         
        //   145: aload_3        
        //   146: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   149: return         
        //   150: astore          5
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   162: bipush          9
        //   164: aaload         
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: aload_1        
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   175: bipush          10
        //   177: aaload         
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   184: aload           5
        //   186: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   189: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      42     87     133    Ljava/io/IOException;
        //  42     60     133    138    Ljava/io/IOException;
        //  42     60     138    150    Ljava/lang/NullPointerException;
        //  60     86     138    150    Ljava/lang/NullPointerException;
        //  60     86     150    190    Ljava/io/IOException;
        //  135    138    138    150    Ljava/lang/NullPointerException;
        //  135    138    150    190    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    static TextWatcher c(final DeleteAccount deleteAccount) {
        return deleteAccount.s;
    }
    
    static String c(final String l) {
        return DeleteAccount.l = l;
    }
    
    static c2 d(final DeleteAccount deleteAccount) {
        return deleteAccount.x;
    }
    
    static bl e(final DeleteAccount deleteAccount) {
        return deleteAccount.v;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        Label_0084: {
            if (n != 0 || n2 != -1) {
                break Label_0084;
            }
            try {
                DeleteAccount.m = intent.getStringExtra(DeleteAccount.z[6]);
                this.w = intent.getStringExtra(DeleteAccount.z[7]);
                this.t.setText((CharSequence)DeleteAccount.m);
                this.u.setText((CharSequence)this.w);
                this.b(this.w);
                if (this.q == -1) {
                    this.q = Integer.MAX_VALUE;
                }
                this.k = -1;
                this.t.addTextChangedListener(this.s);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //     3: iconst_3       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    13: getstatic       com/whatsapp/fieldstats/aq.DELETE_ACCOUNT:Lcom/whatsapp/fieldstats/aq;
        //    16: invokestatic    com/whatsapp/aam.a:(Lcom/whatsapp/fieldstats/aq;)V
        //    19: aload_0        
        //    20: invokevirtual   com/whatsapp/DeleteAccount.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    23: iconst_1       
        //    24: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    27: aload_0        
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/DeleteAccount.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    32: ldc             2130903145
        //    34: aconst_null    
        //    35: iconst_0       
        //    36: iconst_1       
        //    37: newarray        I
        //    39: dup            
        //    40: iconst_0       
        //    41: ldc             2131755346
        //    43: iastore        
        //    44: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z[I)Landroid/view/View;
        //    47: invokevirtual   com/whatsapp/DeleteAccount.setContentView:(Landroid/view/View;)V
        //    50: aload_0        
        //    51: aload_0        
        //    52: ldc             2131755347
        //    54: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //    57: checkcast       Landroid/widget/EditText;
        //    60: putfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //    63: aload_0        
        //    64: aload_0        
        //    65: ldc             2131755533
        //    67: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //    70: checkcast       Landroid/widget/EditText;
        //    73: putfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //    76: aload_0        
        //    77: aload_0        
        //    78: ldc             2131755348
        //    80: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //    83: checkcast       Landroid/widget/EditText;
        //    86: putfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //    89: aload_0        
        //    90: ldc             2131755532
        //    92: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //    95: checkcast       Landroid/widget/TextView;
        //    98: aload_0        
        //    99: ldc             2131231547
        //   101: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //   104: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   107: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   110: aload_0        
        //   111: ldc             2131755534
        //   113: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   116: checkcast       Landroid/widget/TextView;
        //   119: aload_0        
        //   120: ldc             2131231548
        //   122: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //   125: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   128: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   131: aload_0        
        //   132: ldc             2131755531
        //   134: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   137: checkcast       Landroid/widget/TextView;
        //   140: astore_2       
        //   141: iconst_1       
        //   142: anewarray       Ljava/lang/Object;
        //   145: astore_3       
        //   146: aload_3        
        //   147: iconst_0       
        //   148: aload_0        
        //   149: ldc             2131231688
        //   151: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //   154: aastore        
        //   155: aload_2        
        //   156: aload_0        
        //   157: ldc             2131230997
        //   159: aload_3        
        //   160: invokevirtual   com/whatsapp/DeleteAccount.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   163: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   166: iconst_1       
        //   167: anewarray       Landroid/text/InputFilter;
        //   170: astore          4
        //   172: aload           4
        //   174: iconst_0       
        //   175: new             Landroid/text/InputFilter$LengthFilter;
        //   178: dup            
        //   179: iconst_3       
        //   180: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   183: aastore        
        //   184: aload_0        
        //   185: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   188: aload           4
        //   190: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   193: iconst_1       
        //   194: anewarray       Landroid/text/InputFilter;
        //   197: astore          5
        //   199: aload           5
        //   201: iconst_0       
        //   202: new             Landroid/text/InputFilter$LengthFilter;
        //   205: dup            
        //   206: bipush          17
        //   208: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   211: aastore        
        //   212: aload_0        
        //   213: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   216: aload           5
        //   218: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   221: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   224: invokevirtual   android/telephony/TelephonyManager.getNetworkCountryIso:()Ljava/lang/String;
        //   227: astore          6
        //   229: aload           6
        //   231: ifnull          242
        //   234: aload           6
        //   236: invokestatic    com/whatsapp/vi.c:(Ljava/lang/String;)Ljava/lang/String;
        //   239: putstatic       com/whatsapp/DeleteAccount.m:Ljava/lang/String;
        //   242: aload_0        
        //   243: new             Lcom/whatsapp/fe;
        //   246: dup            
        //   247: aload_0        
        //   248: invokespecial   com/whatsapp/fe.<init>:(Lcom/whatsapp/DeleteAccount;)V
        //   251: putfield        com/whatsapp/DeleteAccount.s:Landroid/text/TextWatcher;
        //   254: aload_0        
        //   255: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   258: aload_0        
        //   259: getfield        com/whatsapp/DeleteAccount.s:Landroid/text/TextWatcher;
        //   262: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   265: new             Lcom/whatsapp/a0y;
        //   268: dup            
        //   269: aload_0        
        //   270: invokespecial   com/whatsapp/a0y.<init>:(Lcom/whatsapp/DeleteAccount;)V
        //   273: astore          7
        //   275: aload_0        
        //   276: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   279: aload           7
        //   281: invokevirtual   android/widget/EditText.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   284: aload_0        
        //   285: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   288: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   291: pop            
        //   292: aload_0        
        //   293: aload_0        
        //   294: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   297: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   300: putfield        com/whatsapp/DeleteAccount.q:I
        //   303: aload_0        
        //   304: aload_0        
        //   305: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   308: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;)I
        //   311: putfield        com/whatsapp/DeleteAccount.k:I
        //   314: aload_0        
        //   315: ldc_w           2131755530
        //   318: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   321: new             Lcom/whatsapp/ss;
        //   324: dup            
        //   325: aload_0        
        //   326: invokespecial   com/whatsapp/ss.<init>:(Lcom/whatsapp/DeleteAccount;)V
        //   329: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   332: aload_0        
        //   333: ldc_w           2131755535
        //   336: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   339: checkcast       Landroid/widget/Button;
        //   342: astore          9
        //   344: aload           9
        //   346: new             Lcom/whatsapp/a6d;
        //   349: dup            
        //   350: aload_0        
        //   351: invokespecial   com/whatsapp/a6d.<init>:(Lcom/whatsapp/DeleteAccount;)V
        //   354: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   357: getstatic       com/whatsapp/DeleteAccount.m:Ljava/lang/String;
        //   360: ifnull          373
        //   363: aload_0        
        //   364: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   367: getstatic       com/whatsapp/DeleteAccount.m:Ljava/lang/String;
        //   370: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   373: aload_0        
        //   374: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   377: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   380: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   383: astore          11
        //   385: aload           11
        //   387: ifnull          450
        //   390: aload           11
        //   392: invokevirtual   java/lang/String.length:()I
        //   395: istore          17
        //   397: iload           17
        //   399: ifle            450
        //   402: new             Ljava/lang/StringBuilder;
        //   405: dup            
        //   406: invokespecial   java/lang/StringBuilder.<init>:()V
        //   409: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   412: iconst_4       
        //   413: aaload         
        //   414: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   417: aload           11
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   425: iconst_2       
        //   426: aaload         
        //   427: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   430: aload           11
        //   432: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //   435: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   438: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   441: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   444: aload_0        
        //   445: aload           11
        //   447: invokespecial   com/whatsapp/DeleteAccount.b:(Ljava/lang/String;)V
        //   450: getstatic       com/whatsapp/ade.a:I
        //   453: istore          12
        //   455: iload           12
        //   457: iconst_m1      
        //   458: if_icmpne       466
        //   461: invokestatic    com/whatsapp/ade.c:()I
        //   464: istore          12
        //   466: iload           12
        //   468: ifeq            482
        //   471: aload_0        
        //   472: ldc_w           2131755529
        //   475: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   478: iconst_0       
        //   479: invokevirtual   android/view/View.setVisibility:(I)V
        //   482: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //   485: ifne            500
        //   488: aload_0        
        //   489: ldc_w           2131755528
        //   492: invokevirtual   com/whatsapp/DeleteAccount.findViewById:(I)Landroid/view/View;
        //   495: bipush          8
        //   497: invokevirtual   android/view/View.setVisibility:(I)V
        //   500: return         
        //   501: astore          20
        //   503: aload           20
        //   505: athrow         
        //   506: astore          19
        //   508: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   511: iconst_1       
        //   512: aaload         
        //   513: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   516: goto            242
        //   519: astore          10
        //   521: aload           10
        //   523: athrow         
        //   524: astore          16
        //   526: aload           16
        //   528: athrow         
        //   529: astore          15
        //   531: aload           15
        //   533: athrow         
        //   534: astore          18
        //   536: new             Ljava/lang/StringBuilder;
        //   539: dup            
        //   540: invokespecial   java/lang/StringBuilder.<init>:()V
        //   543: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   546: iconst_0       
        //   547: aaload         
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: aload           11
        //   553: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   556: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //   559: iconst_5       
        //   560: aaload         
        //   561: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   564: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   567: aload           18
        //   569: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   572: goto            444
        //   575: astore          14
        //   577: aload           14
        //   579: athrow         
        //   580: astore          13
        //   582: aload           13
        //   584: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  234    242    506    519    Ljava/io/IOException;
        //  234    242    501    506    Ljava/lang/NullPointerException;
        //  344    373    519    524    Ljava/io/IOException;
        //  390    397    524    529    Ljava/io/IOException;
        //  390    397    529    534    Ljava/lang/NullPointerException;
        //  402    444    534    575    Ljava/io/IOException;
        //  402    444    529    534    Ljava/lang/NullPointerException;
        //  471    482    575    580    Ljava/io/IOException;
        //  482    500    580    585    Ljava/io/IOException;
        //  526    529    529    534    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 275, Size: 275
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
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231535));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 109: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231569).setPositiveButton(2131230894, (DialogInterface$OnClickListener)new zi(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new i7(this)).create();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        Log.i(DeleteAccount.z[16]);
        this.r.removeMessages(4);
        super.onDestroy();
    }
    
    public void onPause() {
        super.onPause();
        this.q = RegisterPhone.a(this.n);
        this.k = RegisterPhone.a(this.t);
        Log.i(DeleteAccount.z[17]);
    }
    
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/DialogToastActivity.onResume:()V
        //     4: getstatic       com/whatsapp/DeleteAccount.m:Ljava/lang/String;
        //     7: ifnull          20
        //    10: aload_0        
        //    11: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //    14: getstatic       com/whatsapp/DeleteAccount.m:Ljava/lang/String;
        //    17: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    20: aload_0        
        //    21: getfield        com/whatsapp/DeleteAccount.w:Ljava/lang/String;
        //    24: ifnull          38
        //    27: aload_0        
        //    28: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //    31: aload_0        
        //    32: getfield        com/whatsapp/DeleteAccount.w:Ljava/lang/String;
        //    35: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    38: aload_0        
        //    39: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //    42: aload_0        
        //    43: getfield        com/whatsapp/DeleteAccount.k:I
        //    46: invokestatic    com/whatsapp/RegisterPhone.b:(Landroid/widget/EditText;I)V
        //    49: aload_0        
        //    50: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/DeleteAccount.q:I
        //    57: invokestatic    com/whatsapp/RegisterPhone.b:(Landroid/widget/EditText;I)V
        //    60: getstatic       com/whatsapp/DeleteAccount.z:[Ljava/lang/String;
        //    63: bipush          15
        //    65: aaload         
        //    66: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    69: return         
        //    70: astore_1       
        //    71: aload_1        
        //    72: athrow         
        //    73: astore_2       
        //    74: aload_2        
        //    75: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      20     70     73     Ljava/lang/NullPointerException;
        //  20     38     73     76     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
}
