// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.widget.LinearLayout;
import android.app.Activity;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.os.AsyncTask$Status;
import android.widget.EditText;
import com.whatsapp.fieldstats.b8;
import android.net.Uri;

public class DescribeProblemActivity extends DialogToastActivity
{
    private static final String[] z;
    private Uri[] k;
    private b8 l;
    private p4 m;
    private String n;
    private String o;
    private EditText p;
    private aj q;
    
    static {
        final String[] z2 = new String[15];
        String s = "\u0002{MmQ\u0014q\\!R\u0005l[kO\u0015vQz\u000e\bq\u0013gO\u0016kJ#R\u0012l[oLF";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0002{MmQ\u0014q\\!R\u0005l[kO\u0015vQz\u000e\bq\u0013gO\u0016kJ#R\u0012l[oLF";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0002{MmQ\u0014q\\!R\u0005l[kO\u0015vQz\u000e\bqJ#@\b3Wc@\u0001{\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0002{MmQ\u0014q\\!R\u0005l[kO\u0015vQz\u000e\bq\u0013gO\u0016kJ#R\u0012l[oLF";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0002{MmQ\u0014q\\!R\u0005l[kO\u0015vQz\u000eF";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0002{MmQ\u0014q\\!Q\u0007kMk";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000fma|D\u0015{J";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0002{MmQ\u0014q\\!S\u0003mKcD";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0002{MmQ\u0014q\\bD\u000b1]|D\u0007j[";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0005qS V\u000e\u007fJ}@\u0016n\u0010JD\u0015}LgC\u0003NLaC\n{SOB\u0012wHgU\u001f0MkS\u0010{L}U\u0007jK}";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0015}LkD\bmVaU\u0015";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0005qS V\u000e\u007fJ}@\u0016n\u0010JD\u0015}LgC\u0003NLaC\n{SOB\u0012wHgU\u001f0X|N\u000b";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0005qS V\u000e\u007fJ}@\u0016n\u0010JD\u0015}LgC\u0003NLaC\n{SOB\u0012wHgU\u001f0JwQ\u0003";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0015}LkD\bmVaU\u0015";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0002{MmQ\u0014q\\!E\u0003mJ|N\u001f";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public DescribeProblemActivity() {
        this.k = new Uri[3];
    }
    
    static aj a(final DescribeProblemActivity describeProblemActivity, final aj q) {
        return describeProblemActivity.q = q;
    }
    
    private p4 a() {
        if (this.m != null && this.m.getStatus() == AsyncTask$Status.RUNNING) {
            this.m.cancel(false);
        }
        return this.m = new p4(this);
    }
    
    static p4 a(final DescribeProblemActivity describeProblemActivity, final p4 m) {
        return describeProblemActivity.m = m;
    }
    
    static String a(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.n;
    }
    
    private void a(final int p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/DescribeProblemActivity.k:[Landroid/net/Uri;
        //     8: iload_1        
        //     9: aload_2        
        //    10: aastore        
        //    11: aload_0        
        //    12: ldc             2131755543
        //    14: invokevirtual   com/whatsapp/DescribeProblemActivity.findViewById:(I)Landroid/view/View;
        //    17: checkcast       Landroid/widget/LinearLayout;
        //    20: iload_1        
        //    21: invokevirtual   android/widget/LinearLayout.getChildAt:(I)Landroid/view/View;
        //    24: checkcast       Landroid/widget/ImageView;
        //    27: checkcast       Landroid/widget/ImageView;
        //    30: astore          4
        //    32: aload_2        
        //    33: ifnull          376
        //    36: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    39: aload_2        
        //    40: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    43: astore          7
        //    45: aload           7
        //    47: ifnull          341
        //    50: new             Landroid/graphics/BitmapFactory$Options;
        //    53: dup            
        //    54: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    57: astore          8
        //    59: aload           8
        //    61: iconst_1       
        //    62: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    65: aload           7
        //    67: aconst_null    
        //    68: aload           8
        //    70: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    73: pop            
        //    74: aload           7
        //    76: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //    79: aload           8
        //    81: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    84: ifle            306
        //    87: aload           8
        //    89: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    92: istore          13
        //    94: iload           13
        //    96: ifle            306
        //    99: aload           8
        //   101: iconst_0       
        //   102: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   105: aload           8
        //   107: iconst_1       
        //   108: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   111: aload_0        
        //   112: invokevirtual   com/whatsapp/DescribeProblemActivity.getWindowManager:()Landroid/view/WindowManager;
        //   115: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   120: invokevirtual   android/view/Display.getWidth:()I
        //   123: iconst_3       
        //   124: idiv           
        //   125: istore          14
        //   127: iload           14
        //   129: aload           8
        //   131: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   134: if_icmpge       159
        //   137: iload           14
        //   139: iconst_2       
        //   140: imul           
        //   141: istore          14
        //   143: aload           8
        //   145: iconst_2       
        //   146: aload           8
        //   148: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   151: imul           
        //   152: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   155: iload_3        
        //   156: ifeq            127
        //   159: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   162: aload_2        
        //   163: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   166: astore          15
        //   168: aload           15
        //   170: ifnull          271
        //   173: aload           8
        //   175: iconst_1       
        //   176: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   179: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   182: istore          19
        //   184: iload           19
        //   186: bipush          10
        //   188: if_icmplt       197
        //   191: aload           8
        //   193: iconst_1       
        //   194: putfield        android/graphics/BitmapFactory$Options.inPreferQualityOverSpeed:Z
        //   197: aload           15
        //   199: aconst_null    
        //   200: aload           8
        //   202: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   205: astore          20
        //   207: aload           20
        //   209: ifnull          231
        //   212: aload           4
        //   214: getstatic       android/widget/ImageView$ScaleType.CENTER_CROP:Landroid/widget/ImageView$ScaleType;
        //   217: invokevirtual   android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   220: aload           4
        //   222: aload           20
        //   224: invokevirtual   android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   227: iload_3        
        //   228: ifeq            262
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: getstatic       com/whatsapp/DescribeProblemActivity.z:[Ljava/lang/String;
        //   241: iconst_1       
        //   242: aaload         
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: aload_2        
        //   247: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   250: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   253: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   256: aload_0        
        //   257: ldc             2131231072
        //   259: invokevirtual   com/whatsapp/DescribeProblemActivity.a:(I)V
        //   262: aload           15
        //   264: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   267: iload_3        
        //   268: ifeq            302
        //   271: new             Ljava/lang/StringBuilder;
        //   274: dup            
        //   275: invokespecial   java/lang/StringBuilder.<init>:()V
        //   278: getstatic       com/whatsapp/DescribeProblemActivity.z:[Ljava/lang/String;
        //   281: iconst_3       
        //   282: aaload         
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: aload_2        
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   290: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   293: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   296: aload_0        
        //   297: ldc             2131231072
        //   299: invokevirtual   com/whatsapp/DescribeProblemActivity.a:(I)V
        //   302: iload_3        
        //   303: ifeq            337
        //   306: new             Ljava/lang/StringBuilder;
        //   309: dup            
        //   310: invokespecial   java/lang/StringBuilder.<init>:()V
        //   313: getstatic       com/whatsapp/DescribeProblemActivity.z:[Ljava/lang/String;
        //   316: iconst_2       
        //   317: aaload         
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: aload_2        
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   325: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   328: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   331: aload_0        
        //   332: ldc             2131231071
        //   334: invokevirtual   com/whatsapp/DescribeProblemActivity.a:(I)V
        //   337: iload_3        
        //   338: ifeq            372
        //   341: new             Ljava/lang/StringBuilder;
        //   344: dup            
        //   345: invokespecial   java/lang/StringBuilder.<init>:()V
        //   348: getstatic       com/whatsapp/DescribeProblemActivity.z:[Ljava/lang/String;
        //   351: iconst_0       
        //   352: aaload         
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: aload_2        
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   360: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   363: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   366: aload_0        
        //   367: ldc             2131231072
        //   369: invokevirtual   com/whatsapp/DescribeProblemActivity.a:(I)V
        //   372: iload_3        
        //   373: ifeq            391
        //   376: aload           4
        //   378: getstatic       android/widget/ImageView$ScaleType.CENTER:Landroid/widget/ImageView$ScaleType;
        //   381: invokevirtual   android/widget/ImageView.setScaleType:(Landroid/widget/ImageView$ScaleType;)V
        //   384: aload           4
        //   386: ldc             2130838734
        //   388: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   391: return         
        //   392: astore          9
        //   394: aload           9
        //   396: athrow         
        //   397: astore          6
        //   399: new             Ljava/lang/StringBuilder;
        //   402: dup            
        //   403: invokespecial   java/lang/StringBuilder.<init>:()V
        //   406: getstatic       com/whatsapp/DescribeProblemActivity.z:[Ljava/lang/String;
        //   409: iconst_4       
        //   410: aaload         
        //   411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: aload_2        
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   418: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   421: aload           6
        //   423: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   426: aload_0        
        //   427: ldc             2131231072
        //   429: invokevirtual   com/whatsapp/DescribeProblemActivity.a:(I)V
        //   432: goto            372
        //   435: astore          17
        //   437: aload           17
        //   439: athrow         
        //   440: astore          18
        //   442: aload           18
        //   444: athrow         
        //   445: astore          22
        //   447: aload           22
        //   449: athrow         
        //   450: astore          21
        //   452: aload           21
        //   454: athrow         
        //   455: astore          16
        //   457: aload           16
        //   459: athrow         
        //   460: astore          11
        //   462: aload           11
        //   464: athrow         
        //   465: astore          12
        //   467: aload           12
        //   469: athrow         
        //   470: astore          5
        //   472: aload           5
        //   474: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     45     397    435    Ljava/io/IOException;
        //  50     59     397    435    Ljava/io/IOException;
        //  59     94     392    397    Ljava/io/IOException;
        //  99     127    397    435    Ljava/io/IOException;
        //  127    137    397    435    Ljava/io/IOException;
        //  143    155    397    435    Ljava/io/IOException;
        //  159    168    397    435    Ljava/io/IOException;
        //  173    184    435    440    Ljava/io/IOException;
        //  191    197    440    445    Ljava/io/IOException;
        //  197    207    397    435    Ljava/io/IOException;
        //  212    227    445    450    Ljava/io/IOException;
        //  231    262    450    455    Ljava/io/IOException;
        //  262    267    455    460    Ljava/io/IOException;
        //  271    302    455    460    Ljava/io/IOException;
        //  306    337    460    465    Ljava/io/IOException;
        //  341    372    465    470    Ljava/io/IOException;
        //  376    391    470    475    Ljava/io/IOException;
        //  394    397    397    435    Ljava/io/IOException;
        //  437    440    440    445    Ljava/io/IOException;
        //  442    445    397    435    Ljava/io/IOException;
        //  447    450    450    455    Ljava/io/IOException;
        //  452    455    397    435    Ljava/io/IOException;
        //  457    460    397    435    Ljava/io/IOException;
        //  462    465    397    435    Ljava/io/IOException;
        //  467    470    397    435    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 224, Size: 224
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
    
    static EditText b(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.p;
    }
    
    private aj b() {
        if (this.q != null && this.q.getStatus() == AsyncTask$Status.RUNNING) {
            this.q.cancel(false);
        }
        return this.q = new aj(this);
    }
    
    static Uri[] c(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.k;
    }
    
    static String d(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.o;
    }
    
    static aj e(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.b();
    }
    
    static b8 f(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.l;
    }
    
    static p4 g(final DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.a();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        if (n2 == -1 && n >= 1 && n < 4) {
            if (intent.getBooleanExtra(DescribeProblemActivity.z[6], false)) {
                this.a(n - 1, (Uri)null);
                if (!i) {
                    return;
                }
            }
            if (intent.getData() != null) {
                this.a(n - 1, intent.getData());
                if (!i) {
                    return;
                }
            }
            this.a(2131231072);
        }
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(DescribeProblemActivity.z[8]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903148);
        alm.a((TextView)(this.p = (EditText)this.findViewById(2131755540)));
        this.findViewById(2131755541).setOnClickListener((View$OnClickListener)new xp(this));
        final Intent intent = this.getIntent();
        this.n = intent.getStringExtra(DescribeProblemActivity.z[11]);
        this.o = intent.getStringExtra(DescribeProblemActivity.z[9]);
        Label_0152: {
            if (intent.getIntExtra(DescribeProblemActivity.z[12], 0) == 1) {
                this.getSupportActionBar().setTitle(2131231027);
                if (!i) {
                    break Label_0152;
                }
            }
            this.getSupportActionBar().setTitle(2131231026);
        }
        a81.a(this, this.getSupportActionBar(), this.getString(2131231410), (View$OnClickListener)new atc(this));
        final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131755543);
        linearLayout.removeAllViews();
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361935);
        int n = dimensionPixelSize / 4;
        if (n == 0) {
            n = 1;
        }
        int j = 0;
        while (j < 3) {
            final DescribeProblemActivity$3 describeProblemActivity$3 = new DescribeProblemActivity$3(this, (Context)this);
            describeProblemActivity$3.i = true;
            describeProblemActivity$3.setBorderSize(n);
            describeProblemActivity$3.setBorderColor(this.getResources().getColor(2131624006));
            describeProblemActivity$3.setScaleType(ImageView$ScaleType.CENTER);
            describeProblemActivity$3.setImageResource(2130838734);
            describeProblemActivity$3.setOnClickListener((View$OnClickListener)new cs(this, j));
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(0, -2, 1.0f);
            linearLayout$LayoutParams.bottomMargin = dimensionPixelSize;
            linearLayout$LayoutParams.rightMargin = dimensionPixelSize;
            linearLayout$LayoutParams.topMargin = dimensionPixelSize;
            linearLayout$LayoutParams.leftMargin = dimensionPixelSize;
            linearLayout.addView((View)describeProblemActivity$3, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            ++j;
            if (i) {
                break;
            }
        }
        if (bundle != null) {
            final Parcelable[] parcelableArray = bundle.getParcelableArray(DescribeProblemActivity.z[10]);
            int n2;
            for (int k = 0; k < parcelableArray.length; k = n2) {
                if (parcelableArray[k] != null) {
                    this.a(k, (Uri)parcelableArray[k]);
                }
                n2 = k + 1;
                if (i) {
                    break;
                }
            }
        }
        this.l = new b8();
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231553));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 2: {
                final ProgressDialog progressDialog2 = new ProgressDialog((Context)this);
                progressDialog2.setMessage((CharSequence)this.getString(2131231626));
                progressDialog2.setIndeterminate(true);
                progressDialog2.setCancelable(false);
                return (Dialog)progressDialog2;
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.m != null) {
            this.m.cancel(false);
        }
        if (this.q != null) {
            this.q.cancel(false);
        }
        Log.i(DescribeProblemActivity.z[14]);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    public void onPause() {
        super.onPause();
        Log.i(DescribeProblemActivity.z[5]);
    }
    
    public void onResume() {
        super.onResume();
        Log.i(DescribeProblemActivity.z[7]);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray(DescribeProblemActivity.z[13], (Parcelable[])this.k);
    }
}
