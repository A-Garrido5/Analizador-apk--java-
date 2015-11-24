// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import android.app.Dialog;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.util.Log;

public class EULA extends UserFeedbackActivity
{
    private static final String[] z;
    private gd k;
    
    static {
        final String[] z2 = new String[12];
        String s = "\u001eA\u000e\u0012e\u000fP\u0002\u00195\fQ\u0004\u001bp[N\f\u001ea\u0012W\nWz\u0015\u0019\u0019\u0016f\u0010\u0019\u0006\u001ey\u0017\\\u001f\u00045\u000fQ\u001f\u0012t\u001f\u0019\u0019\u00185\u001dP\u0003\u001ef\u0013\u0019\t\u0002g\u0012W\nWz\u0015z\u001f\u0012t\u000f\\M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001eL\u0001\u0016";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t\\\n\u001ef\u000f\\\u001fXp\u000eU\fXt\u0018Z\b\u0007a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0018V\u0000Yb\u0013X\u0019\u0004t\u000bIC%p\u001cP\u001e\u0003p\ti\u0005\u0018{\u001e\u0017\u001f\u0012f\u001eM\u001e\u0003t\u000f\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ")\\\u001e\u0012a[k\b\u0014z\r\\\u001f\u000e";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ")\\\u001e\u0012a[i\f\u0004f\fV\u001f\u0013";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\bQ\u0002\u0000J\t\\\n\u001ef\u000fK\f\u0003|\u0014W2\u0011|\tJ\u0019(q\u0017^";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001eL\u0001\u0016:\u0018U\u0002\u0014~VN\u001f\u0018{\u001c";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001eL\u0001\u0016:\u0018K\b\u0016a\u001e\u0016\u001a\u0005z\u0015^@\u0004a\u001aM\bWw\u0014L\u0003\u0014p[M\u0002Wx\u001aP\u0003";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001eL\u0001\u0016:\u0018K\b\u0016a\u001e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\bI\f\u0014p5\\\b\u0013p\u001fp\u00035l\u000f\\\u001e";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u001eA\u000e\u0012e\u000fP\u0002\u00195\fQ\u0004\u001bp[N\f\u001ea\u0012W\nWz\u0015\u0019\u0019\u0016f\u0010\u0019\u0006\u001ey\u0017\\\u001f\u00045\u000fQ\u001f\u0012t\u001f\u0019\u0019\u00185\u001dP\u0003\u001ef\u0013\u0019\t\u0002g\u0012W\nWz\u0015z\u001f\u0012t\u000f\\M";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public EULA() {
        this.k = gd.AGREE_NONE;
    }
    
    static gd a(final EULA eula, final gd k) {
        return eula.k = k;
    }
    
    private void a() {
        if (this.getResources().getConfiguration().orientation == 1) {
            this.findViewById(2131755125).setVisibility(0);
            if (!App.I) {
                return;
            }
        }
        this.findViewById(2131755125).setVisibility(8);
    }
    
    static void a(final EULA eula) {
        eula.e();
    }
    
    private void b() {
        this.a();
        this.findViewById(2131755569).setBackgroundResource(0);
        this.findViewById(2131755569).setBackgroundResource(2130837606);
    }
    
    private void e() {
        Log.i(EULA.z[2]);
        App.b((Context)this, 1);
        final Intent intent = new Intent((Context)this, (Class)RegisterPhone.class);
        intent.putExtra(EULA.z[3], true);
        this.startActivity(intent);
        this.finish();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b();
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //     3: bipush          9
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   com/whatsapp/UserFeedbackActivity.onCreate:(Landroid/os/Bundle;)V
        //    14: aload_0        
        //    15: ldc             2130903154
        //    17: invokevirtual   com/whatsapp/EULA.setContentView:(I)V
        //    20: invokestatic    com/whatsapp/App.u:()J
        //    23: ldc2_w          1048576
        //    26: lcmp           
        //    27: ifge            61
        //    30: aload_0        
        //    31: new             Landroid/content/Intent;
        //    34: dup            
        //    35: aload_0        
        //    36: ldc             Lcom/whatsapp/InsufficientStorageSpaceActivity;.class
        //    38: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    41: ldc             268435456
        //    43: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //    46: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //    49: bipush          10
        //    51: aaload         
        //    52: ldc2_w          1048576
        //    55: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //    58: invokevirtual   com/whatsapp/EULA.startActivity:(Landroid/content/Intent;)V
        //    61: aload_0        
        //    62: invokespecial   com/whatsapp/EULA.b:()V
        //    65: aload_0        
        //    66: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    69: ifeq            103
        //    72: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //    75: bipush          8
        //    77: aaload         
        //    78: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    81: aload_0        
        //    82: new             Landroid/content/Intent;
        //    85: dup            
        //    86: aload_0        
        //    87: ldc             Lcom/whatsapp/Main;.class
        //    89: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    92: invokevirtual   com/whatsapp/EULA.startActivity:(Landroid/content/Intent;)V
        //    95: aload_0        
        //    96: invokevirtual   com/whatsapp/EULA.finish:()V
        //    99: return         
        //   100: astore_2       
        //   101: aload_2        
        //   102: athrow         
        //   103: aload_0        
        //   104: invokespecial   com/whatsapp/EULA.a:()V
        //   107: getstatic       com/whatsapp/App.aT:Lcom/whatsapp/util/a4;
        //   110: ldc2_w          10
        //   113: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   116: invokevirtual   com/whatsapp/util/a4.a:(JLjava/util/concurrent/TimeUnit;)Lcom/whatsapp/util/bs;
        //   119: astore          16
        //   121: aload           16
        //   123: astore          4
        //   125: aload           4
        //   127: ifnull          158
        //   130: aload           4
        //   132: getfield        com/whatsapp/util/bs.b:Ljava/util/Set;
        //   135: astore          14
        //   137: aload           14
        //   139: ifnull          158
        //   142: aload_0        
        //   143: bipush          6
        //   145: invokevirtual   com/whatsapp/EULA.showDialog:(I)V
        //   148: getstatic       com/whatsapp/App.I:Z
        //   151: istore          15
        //   153: iload           15
        //   155: ifeq            170
        //   158: invokestatic    com/whatsapp/al5.N:()Ljava/lang/String;
        //   161: ifnull          170
        //   164: aload_0        
        //   165: bipush          8
        //   167: invokevirtual   com/whatsapp/EULA.showDialog:(I)V
        //   170: aload_0        
        //   171: ldc             2131755571
        //   173: invokevirtual   com/whatsapp/EULA.findViewById:(I)Landroid/view/View;
        //   176: checkcast       Landroid/widget/Button;
        //   179: astore          6
        //   181: new             Landroid/text/SpannableString;
        //   184: dup            
        //   185: aload_0        
        //   186: ldc             2131231099
        //   188: invokevirtual   com/whatsapp/EULA.getText:(I)Ljava/lang/CharSequence;
        //   191: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   194: astore          7
        //   196: aload           7
        //   198: new             Landroid/text/style/UnderlineSpan;
        //   201: dup            
        //   202: invokespecial   android/text/style/UnderlineSpan.<init>:()V
        //   205: iconst_0       
        //   206: aload           7
        //   208: invokevirtual   android/text/SpannableString.length:()I
        //   211: iconst_0       
        //   212: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   215: aload           6
        //   217: aload           7
        //   219: invokevirtual   android/widget/Button.setText:(Ljava/lang/CharSequence;)V
        //   222: aload_0        
        //   223: ldc             2131755572
        //   225: invokevirtual   com/whatsapp/EULA.findViewById:(I)Landroid/view/View;
        //   228: checkcast       Landroid/widget/Button;
        //   231: astore          8
        //   233: aload           6
        //   235: new             Lcom/whatsapp/lk;
        //   238: dup            
        //   239: aload_0        
        //   240: invokespecial   com/whatsapp/lk.<init>:(Lcom/whatsapp/EULA;)V
        //   243: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   246: aload           8
        //   248: new             Lcom/whatsapp/aq9;
        //   251: dup            
        //   252: aload_0        
        //   253: invokespecial   com/whatsapp/aq9.<init>:(Lcom/whatsapp/EULA;)V
        //   256: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   259: aload_0        
        //   260: invokevirtual   com/whatsapp/EULA.getIntent:()Landroid/content/Intent;
        //   263: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //   266: bipush          6
        //   268: aaload         
        //   269: iconst_0       
        //   270: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   273: ifeq            281
        //   276: aload_0        
        //   277: iconst_1       
        //   278: invokevirtual   com/whatsapp/EULA.showDialog:(I)V
        //   281: aload_0        
        //   282: iconst_0       
        //   283: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   286: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   289: invokevirtual   com/whatsapp/App.D:()Z
        //   292: ifeq            99
        //   295: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //   298: bipush          7
        //   300: aaload         
        //   301: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   304: aload_0        
        //   305: invokevirtual   com/whatsapp/EULA.a:()Z
        //   308: pop            
        //   309: return         
        //   310: astore          10
        //   312: aload           10
        //   314: athrow         
        //   315: astore_3       
        //   316: new             Ljava/lang/StringBuilder;
        //   319: dup            
        //   320: invokespecial   java/lang/StringBuilder.<init>:()V
        //   323: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //   326: bipush          11
        //   328: aaload         
        //   329: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   332: aload_3        
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   336: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   339: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   342: aconst_null    
        //   343: astore          4
        //   345: goto            125
        //   348: astore          12
        //   350: aload           12
        //   352: athrow         
        //   353: astore          13
        //   355: aload           13
        //   357: athrow         
        //   358: astore          5
        //   360: aload           5
        //   362: athrow         
        //   363: astore          9
        //   365: aload           9
        //   367: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  20     61     100    103    Ljava/lang/Exception;
        //  107    121    315    348    Ljava/lang/Exception;
        //  130    137    348    353    Ljava/lang/Exception;
        //  142    153    353    358    Ljava/lang/Exception;
        //  158    170    358    363    Ljava/lang/Exception;
        //  233    281    363    368    Ljava/lang/Exception;
        //  281    309    310    315    Ljava/lang/Exception;
        //  350    353    353    358    Ljava/lang/Exception;
        //  355    358    358    363    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 174, Size: 174
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
    
    public Dialog onCreateDialog(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: iload_1        
        //     5: tableswitch {
        //                2: 109
        //                3: 141
        //                4: 179
        //                5: 56
        //                6: 221
        //                7: 466
        //                8: 529
        //                9: 558
        //               10: 62
        //          default: 56
        //        }
        //    56: aload_0        
        //    57: iload_1        
        //    58: invokespecial   com/whatsapp/UserFeedbackActivity.onCreateDialog:(I)Landroid/app/Dialog;
        //    61: areturn        
        //    62: new             Landroid/support/v7/app/AlertDialog$Builder;
        //    65: dup            
        //    66: aload_0        
        //    67: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //    70: ldc_w           2131230802
        //    73: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    76: ldc_w           2131230901
        //    79: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //    82: ldc_w           2131231435
        //    85: new             Lcom/whatsapp/ts;
        //    88: dup            
        //    89: aload_0        
        //    90: invokespecial   com/whatsapp/ts.<init>:(Lcom/whatsapp/EULA;)V
        //    93: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //    96: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //    99: astore          18
        //   101: aload           18
        //   103: areturn        
        //   104: astore          17
        //   106: aload           17
        //   108: athrow         
        //   109: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   112: dup            
        //   113: aload_0        
        //   114: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   117: ldc_w           2131231540
        //   120: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   123: ldc_w           2131231435
        //   126: new             Lcom/whatsapp/a_c;
        //   129: dup            
        //   130: aload_0        
        //   131: invokespecial   com/whatsapp/a_c.<init>:(Lcom/whatsapp/EULA;)V
        //   134: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   137: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   140: areturn        
        //   141: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   144: dup            
        //   145: aload_0        
        //   146: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   149: ldc_w           2131230802
        //   152: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   155: ldc_w           2131231593
        //   158: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   161: ldc_w           2131231435
        //   164: new             Lcom/whatsapp/h_;
        //   167: dup            
        //   168: aload_0        
        //   169: invokespecial   com/whatsapp/h_.<init>:(Lcom/whatsapp/EULA;)V
        //   172: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   175: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   178: areturn        
        //   179: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   187: ldc_w           2131230802
        //   190: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   193: aload_0        
        //   194: ldc_w           2131231098
        //   197: invokevirtual   com/whatsapp/EULA.getString:(I)Ljava/lang/String;
        //   200: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   203: ldc_w           2131231435
        //   206: new             Lcom/whatsapp/aae;
        //   209: dup            
        //   210: aload_0        
        //   211: invokespecial   com/whatsapp/aae.<init>:(Lcom/whatsapp/EULA;)V
        //   214: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   217: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   220: areturn        
        //   221: getstatic       com/whatsapp/App.aT:Lcom/whatsapp/util/a4;
        //   224: invokevirtual   com/whatsapp/util/a4.a:()Lcom/whatsapp/util/bs;
        //   227: astore          16
        //   229: aload           16
        //   231: astore          4
        //   233: aload           4
        //   235: ifnull          263
        //   238: aload           4
        //   240: getfield        com/whatsapp/util/bs.b:Ljava/util/Set;
        //   243: ifnull          263
        //   246: aload           4
        //   248: getfield        com/whatsapp/util/bs.b:Ljava/util/Set;
        //   251: invokeinterface java/util/Set.isEmpty:()Z
        //   256: istore          15
        //   258: iload           15
        //   260: ifeq            267
        //   263: iload_2        
        //   264: ifeq            621
        //   267: new             Ljava/lang/StringBuilder;
        //   270: dup            
        //   271: invokespecial   java/lang/StringBuilder.<init>:()V
        //   274: astore          10
        //   276: aload           4
        //   278: getfield        com/whatsapp/util/bs.b:Ljava/util/Set;
        //   281: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   286: astore          11
        //   288: aload           11
        //   290: invokeinterface java/util/Iterator.hasNext:()Z
        //   295: ifeq            335
        //   298: aload           11
        //   300: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   305: checkcast       Lcom/whatsapp/util/bp;
        //   308: astore          12
        //   310: aload           10
        //   312: bipush          9
        //   314: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   317: aload           12
        //   319: getfield        com/whatsapp/util/bp.a:Ljava/lang/CharSequence;
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   325: bipush          10
        //   327: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   330: pop            
        //   331: iload_2        
        //   332: ifeq            288
        //   335: aload           10
        //   337: iconst_m1      
        //   338: aload           10
        //   340: invokevirtual   java/lang/StringBuilder.length:()I
        //   343: iadd           
        //   344: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //   347: aload           10
        //   349: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   352: astore          5
        //   354: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   357: dup            
        //   358: aload_0        
        //   359: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   362: astore          6
        //   364: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   367: istore          8
        //   369: iload           8
        //   371: bipush          7
        //   373: if_icmpgt       458
        //   376: ldc_w           2131231845
        //   379: istore          9
        //   381: aload           6
        //   383: aload_0        
        //   384: iload           9
        //   386: iconst_1       
        //   387: anewarray       Ljava/lang/Object;
        //   390: dup            
        //   391: iconst_0       
        //   392: aload           5
        //   394: aastore        
        //   395: invokevirtual   com/whatsapp/EULA.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   398: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   401: new             Lcom/whatsapp/fb;
        //   404: dup            
        //   405: aload_0        
        //   406: invokespecial   com/whatsapp/fb.<init>:(Lcom/whatsapp/EULA;)V
        //   409: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   412: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   415: areturn        
        //   416: astore_3       
        //   417: new             Ljava/lang/StringBuilder;
        //   420: dup            
        //   421: invokespecial   java/lang/StringBuilder.<init>:()V
        //   424: getstatic       com/whatsapp/EULA.z:[Ljava/lang/String;
        //   427: iconst_0       
        //   428: aaload         
        //   429: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   432: aload_3        
        //   433: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   436: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   439: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   442: aconst_null    
        //   443: astore          4
        //   445: goto            233
        //   448: astore          14
        //   450: aload           14
        //   452: athrow         
        //   453: astore          7
        //   455: aload           7
        //   457: athrow         
        //   458: ldc_w           2131231844
        //   461: istore          9
        //   463: goto            381
        //   466: aload_0        
        //   467: getstatic       com/whatsapp/gd.AGREE_1:Lcom/whatsapp/gd;
        //   470: putfield        com/whatsapp/EULA.k:Lcom/whatsapp/gd;
        //   473: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   476: dup            
        //   477: aload_0        
        //   478: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   481: ldc_w           2131230802
        //   484: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   487: ldc_w           2131231843
        //   490: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   493: iconst_0       
        //   494: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   497: ldc_w           2131231033
        //   500: new             Lcom/whatsapp/aqo;
        //   503: dup            
        //   504: aload_0        
        //   505: invokespecial   com/whatsapp/aqo.<init>:(Lcom/whatsapp/EULA;)V
        //   508: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   511: ldc_w           2131231435
        //   514: new             Lcom/whatsapp/cz;
        //   517: dup            
        //   518: aload_0        
        //   519: invokespecial   com/whatsapp/cz.<init>:(Lcom/whatsapp/EULA;)V
        //   522: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   525: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   528: areturn        
        //   529: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   532: dup            
        //   533: aload_0        
        //   534: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   537: ldc_w           2131230990
        //   540: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   543: new             Lcom/whatsapp/a7;
        //   546: dup            
        //   547: aload_0        
        //   548: invokespecial   com/whatsapp/a7.<init>:(Lcom/whatsapp/EULA;)V
        //   551: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   554: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   557: areturn        
        //   558: aload_0        
        //   559: getstatic       com/whatsapp/gd.AGREE_2:Lcom/whatsapp/gd;
        //   562: putfield        com/whatsapp/EULA.k:Lcom/whatsapp/gd;
        //   565: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   568: dup            
        //   569: aload_0        
        //   570: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   573: ldc_w           2131230802
        //   576: invokevirtual   android/support/v7/app/AlertDialog$Builder.setTitle:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   579: ldc_w           2131230989
        //   582: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(I)Landroid/support/v7/app/AlertDialog$Builder;
        //   585: iconst_0       
        //   586: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   589: ldc_w           2131231033
        //   592: new             Lcom/whatsapp/aa5;
        //   595: dup            
        //   596: aload_0        
        //   597: invokespecial   com/whatsapp/aa5.<init>:(Lcom/whatsapp/EULA;)V
        //   600: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   603: ldc_w           2131231435
        //   606: new             Lcom/whatsapp/atb;
        //   609: dup            
        //   610: aload_0        
        //   611: invokespecial   com/whatsapp/atb.<init>:(Lcom/whatsapp/EULA;)V
        //   614: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   617: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   620: areturn        
        //   621: ldc_w           ""
        //   624: astore          5
        //   626: goto            354
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  62     101    104    109    Ljava/lang/Exception;
        //  221    229    416    448    Ljava/lang/Exception;
        //  238    258    448    453    Ljava/lang/Exception;
        //  354    369    453    458    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 254, Size: 254
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
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(0, 0, 0, 2131231536).setIcon(2130838789);
        if (App.aV == 3) {
            menu.add(0, 1, 0, (CharSequence)EULA.z[5]);
            menu.add(0, 2, 0, (CharSequence)EULA.z[4]);
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 0: {
                this.e(EULA.z[1]);
                return true;
            }
            case 1: {
                al5.h();
                return true;
            }
            case 2: {
                al5.a();
                return true;
            }
        }
    }
    
    public void onResume() {
        super.onResume();
        Label_0049: {
            switch (uv.a[this.k.ordinal()]) {
                case 1: {
                    this.showDialog(6);
                    if (App.I) {
                        break Label_0049;
                    }
                    break;
                }
                case 2: {
                    this.showDialog(8);
                }
            }
        }
    }
}
