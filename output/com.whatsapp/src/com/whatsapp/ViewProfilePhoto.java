// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import android.support.v4.app.ActivityCompat;
import android.os.Parcelable;
import android.net.Uri;
import com.whatsapp.util.br;
import java.io.IOException;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.support.v7.app.ActionBar;
import android.widget.ImageView;
import android.support.v4.app.SharedElementCallback;
import android.transition.TransitionInflater;
import android.transition.Fade;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.Collection;
import com.whatsapp.util.cq;
import android.content.Context;
import android.transition.TransitionSet;
import android.transition.Transition;
import android.view.View;
import android.os.Handler;

public class ViewProfilePhoto extends DialogToastActivity implements aws
{
    private static final String[] z;
    private a_9 k;
    private Handler l;
    private boolean m;
    
    static {
        final String[] z2 = new String[24];
        String s = "\u000eu\u001bS\u0012\u0006~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0632:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'f';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0015s\u000bJ\u0016\u0011u\bT\n\u0006j\u0006R\u0012\f5\u0001S\u0016\u0011u\bT\n\u0006j\u0006R\u0012\fy\u0006\\\b\u0004\u007f\n\u001d\u0016\u000bu\u001aR9\u0005o\u0002Q9\n~T";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000eu\u001bS\u0012\u0006~1O\t";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0000s\u001c^\u0013\u000f{\u001cb\u0012\u0011{\u0000N\u000f\u0017s\u0001S";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Cj\u0006R\u0012\fE\bH\n\u000fE\u0007Y\\";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0015s\u000bJ\u0016\u0011u\bT\n\u0006j\u0006R\u0012\f5\rO\u0003\u0002n\u000b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0015s\u000bJ\u0016\u0011u\bT\n\u0006j\u0006R\u0012\f5\rO\u0003\u0002n\u000b\u001d";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0015s\u000bJ\u0016\u0011u\bT\n\u0006j\u0006R\u0012\f5\rO\u0003\u0002n\u000b\u0012\b\f7\u0003X";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0000u\u0000K\u0003\u0011i\u000fI\u000f\ft\u001d\u001d\u0004\fo\u0000^\u0003Cn\u0001\u001d\u000b\u0002s\u0000";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000eu\u001bS\u0012\u0006~";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0000s\u001c^\u0013\u000f{\u001cb\u0012\u0011{\u0000N\u000f\u0017s\u0001S";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000eu\u001bS\u0012\u0006~1O\t";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\ts\n";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0000s\u001c^\u0013\u000f{\u001cb\u0012\u0011{\u0000N\u000f\u0017s\u0001S";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0000u\u0003\u0013\u0011\u000b{\u001aN\u0007\u0013j@T\b\u0017\u007f\u0000IH\u0002y\u001aT\t\r4=|0&E>u)7U";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u000e\u007f@W\u0016\u0004";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0002t\nO\t\n~@T\b\u0017\u007f\u0000IH\u0006b\u001aO\u0007MS t2*[\"b/-N+s20";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0002t\nO\t\n~@T\b\u0017\u007f\u0000IH\u0002y\u001aT\t\r4=x('";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\nw\u000fZ\u0003L0";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0002t\nO\t\n~@T\b\u0017\u007f\u0000IH\u0006b\u001aO\u0007MI:o#\"W";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0002t\nO\t\n~@T\b\u0017\u007f\u0000IH\u0006b\u001aO\u0007MI:o#\"W";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\r{\u0003X";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0015s\u000bJ\u0016\u0011u\bT\n\u0006j\u0006R\u0012\f5\nX\u0015\u0017h\u0001D";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\ni1O\u0003\u0010\u007f\u001a";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    break Label_0632;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ViewProfilePhoto() {
        this.m = true;
        this.l = new arx(this);
    }
    
    private Transition a(final View view) {
        final TransitionSet set = new TransitionSet();
        final o_ o_ = new o_(view);
        ((Transition)o_).addTarget(this.findViewById(2131755367));
        set.addTransition((Transition)o_);
        return (Transition)set;
    }
    
    static Transition a(final ViewProfilePhoto viewProfilePhoto, final View view) {
        return viewProfilePhoto.a(view);
    }
    
    static a_9 a(final ViewProfilePhoto viewProfilePhoto) {
        return viewProfilePhoto.k;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: ldc             2131755163
        //     7: invokevirtual   com/whatsapp/ViewProfilePhoto.findViewById:(I)Landroid/view/View;
        //    10: astore_2       
        //    11: aload_0        
        //    12: ldc             2131755367
        //    14: invokevirtual   com/whatsapp/ViewProfilePhoto.findViewById:(I)Landroid/view/View;
        //    17: checkcast       Landroid/widget/ImageView;
        //    20: astore_3       
        //    21: aload_0        
        //    22: ldc             2131755538
        //    24: invokevirtual   com/whatsapp/ViewProfilePhoto.findViewById:(I)Landroid/view/View;
        //    27: checkcast       Landroid/widget/TextView;
        //    30: astore          4
        //    32: aload_0        
        //    33: ldc             2131755800
        //    35: invokevirtual   com/whatsapp/ViewProfilePhoto.findViewById:(I)Landroid/view/View;
        //    38: checkcast       Landroid/widget/ImageView;
        //    41: astore          5
        //    43: aload_0        
        //    44: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //    47: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    50: invokestatic    com/whatsapp/_r.a:(Ljava/lang/String;)Z
        //    53: ifeq            85
        //    56: aload_2        
        //    57: iconst_0       
        //    58: invokevirtual   android/view/View.setVisibility:(I)V
        //    61: aload_3        
        //    62: bipush          8
        //    64: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    67: aload           4
        //    69: bipush          8
        //    71: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    74: aload           5
        //    76: bipush          8
        //    78: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    81: iload_1        
        //    82: ifeq            304
        //    85: aload_0        
        //    86: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //    89: iconst_1       
        //    90: invokevirtual   com/whatsapp/a_9.a:(Z)Ljava/io/InputStream;
        //    93: astore          7
        //    95: aload_0        
        //    96: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //    99: getfield        com/whatsapp/a_9.v:I
        //   102: istore          17
        //   104: iload           17
        //   106: iconst_m1      
        //   107: if_icmpne       169
        //   110: aload           7
        //   112: ifnonnull       169
        //   115: aload_3        
        //   116: bipush          8
        //   118: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   121: aload_2        
        //   122: bipush          8
        //   124: invokevirtual   android/view/View.setVisibility:(I)V
        //   127: aload           4
        //   129: iconst_0       
        //   130: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //   137: invokevirtual   com/whatsapp/a_9.m:()Z
        //   140: istore          23
        //   142: iload           23
        //   144: ifeq            158
        //   147: aload           4
        //   149: ldc             2131231417
        //   151: invokevirtual   android/widget/TextView.setText:(I)V
        //   154: iload_1        
        //   155: ifeq            294
        //   158: aload           4
        //   160: ldc             2131231424
        //   162: invokevirtual   android/widget/TextView.setText:(I)V
        //   165: iload_1        
        //   166: ifeq            294
        //   169: aload_3        
        //   170: iconst_0       
        //   171: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   174: aload           4
        //   176: bipush          8
        //   178: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   181: aload_0        
        //   182: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //   185: getfield        com/whatsapp/a_9.v:I
        //   188: istore          18
        //   190: iload           18
        //   192: ifne            204
        //   195: aload_2        
        //   196: iconst_0       
        //   197: invokevirtual   android/view/View.setVisibility:(I)V
        //   200: iload_1        
        //   201: ifeq            210
        //   204: aload_2        
        //   205: bipush          8
        //   207: invokevirtual   android/view/View.setVisibility:(I)V
        //   210: aload           7
        //   212: aconst_null    
        //   213: new             Landroid/graphics/BitmapFactory$Options;
        //   216: dup            
        //   217: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   220: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   223: astore          19
        //   225: aload_3        
        //   226: aload           19
        //   228: invokevirtual   android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   231: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   234: bipush          21
        //   236: if_icmplt       294
        //   239: aload_0        
        //   240: invokevirtual   com/whatsapp/ViewProfilePhoto.getIntent:()Landroid/content/Intent;
        //   243: getstatic       com/whatsapp/ViewProfilePhoto.z:[Ljava/lang/String;
        //   246: bipush          13
        //   248: aaload         
        //   249: iconst_0       
        //   250: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   253: istore          22
        //   255: iload           22
        //   257: ifeq            294
        //   260: aload           5
        //   262: aload_0        
        //   263: getfield        com/whatsapp/ViewProfilePhoto.k:Lcom/whatsapp/a_9;
        //   266: aload           19
        //   268: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   271: aload           19
        //   273: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   276: invokestatic    java/lang/Math.min:(II)I
        //   279: ldc             -1.0
        //   281: iconst_0       
        //   282: invokevirtual   com/whatsapp/a_9.a:(IFZ)Landroid/graphics/Bitmap;
        //   285: invokevirtual   android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   288: aload           5
        //   290: iconst_0       
        //   291: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   294: aload           7
        //   296: ifnull          304
        //   299: aload           7
        //   301: invokevirtual   java/io/InputStream.close:()V
        //   304: return         
        //   305: astore          6
        //   307: aload           6
        //   309: athrow         
        //   310: astore          10
        //   312: aload           10
        //   314: athrow         
        //   315: astore          11
        //   317: aload           11
        //   319: athrow         
        //   320: astore          12
        //   322: aload           12
        //   324: athrow         
        //   325: astore          13
        //   327: aload           13
        //   329: athrow         
        //   330: astore          14
        //   332: aload           14
        //   334: athrow         
        //   335: astore          15
        //   337: aload           15
        //   339: athrow         
        //   340: astore          16
        //   342: aload           16
        //   344: athrow         
        //   345: astore          8
        //   347: aload           7
        //   349: ifnull          357
        //   352: aload           7
        //   354: invokevirtual   java/io/InputStream.close:()V
        //   357: aload           8
        //   359: athrow         
        //   360: astore          20
        //   362: aload           20
        //   364: athrow         
        //   365: astore          21
        //   367: return         
        //   368: astore          9
        //   370: goto            357
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  43     81     305    310    Ljava/io/IOException;
        //  95     104    310    315    Ljava/io/IOException;
        //  95     104    345    360    Any
        //  115    142    315    320    Ljava/io/IOException;
        //  115    142    345    360    Any
        //  147    154    320    325    Ljava/io/IOException;
        //  147    154    345    360    Any
        //  158    165    325    330    Ljava/io/IOException;
        //  158    165    345    360    Any
        //  169    190    330    335    Ljava/io/IOException;
        //  169    190    345    360    Any
        //  195    200    335    340    Ljava/io/IOException;
        //  195    200    345    360    Any
        //  204    210    340    345    Ljava/io/IOException;
        //  204    210    345    360    Any
        //  210    225    345    360    Any
        //  225    255    360    365    Ljava/io/IOException;
        //  225    255    345    360    Any
        //  260    294    345    360    Any
        //  299    304    365    368    Ljava/io/IOException;
        //  312    315    315    320    Ljava/io/IOException;
        //  312    315    345    360    Any
        //  317    320    320    325    Ljava/io/IOException;
        //  317    320    345    360    Any
        //  322    325    325    330    Ljava/io/IOException;
        //  322    325    345    360    Any
        //  327    330    330    335    Ljava/io/IOException;
        //  327    330    345    360    Any
        //  332    335    335    340    Ljava/io/IOException;
        //  332    335    345    360    Any
        //  337    340    340    345    Ljava/io/IOException;
        //  337    340    345    360    Any
        //  342    345    345    360    Any
        //  352    357    368    373    Ljava/io/IOException;
        //  362    365    345    360    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 180, Size: 180
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static boolean b(final ViewProfilePhoto viewProfilePhoto) {
        return viewProfilePhoto.m;
    }
    
    @Override
    public void a() {
        this.k = App.S.e(this.k.u);
        if (this.k.m()) {
            this.getSupportActionBar().setTitle(2131231224);
            if (!App.I) {
                return;
            }
        }
        this.getSupportActionBar().setTitle(cq.c(this.k.a((Context)this), (Context)this));
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        this.k = App.S.e(this.k.u);
        if (s.equals(this.k.u)) {
            Log.i(ViewProfilePhoto.z[1] + this.k.v);
            final String externalStorageState = Environment.getExternalStorageState();
            boolean b;
            if (externalStorageState.equals(ViewProfilePhoto.z[0]) && !externalStorageState.equals(ViewProfilePhoto.z[2])) {
                b = true;
            }
            else {
                b = false;
            }
            this.l.removeMessages(0);
            if (b && this.k.v == 0) {
                App.a(this.k.u, this.k.v, 1);
                this.l.sendEmptyMessageDelayed(0, 32000L);
            }
            this.b();
            this.invalidateOptionsMenu();
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
    
    public void finishAfterTransition() {
        this.m = false;
        super.finishAfterTransition();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Label_0086: {
            switch (n) {
                case 12: {
                    if (n2 != -1) {
                        break;
                    }
                    if (intent != null && intent.getBooleanExtra(ViewProfilePhoto.z[23], false)) {
                        qp.b(this.k, this);
                        this.finish();
                        if (!i) {
                            break;
                        }
                    }
                    qp.a(intent, this.k, this, 13, this);
                    if (i) {
                        break Label_0086;
                    }
                    break;
                }
                case 13: {
                    qp.b().delete();
                    if (n2 == -1) {
                        if (!qp.a(this.k, this)) {
                            break;
                        }
                        this.b();
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 == 0 && intent != null) {
                        qp.a(intent, this);
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        this.getWindow().requestFeature(12);
        this.getWindow().requestFeature(13);
        if (Build$VERSION.SDK_INT >= 21) {
            final Fade fade = new Fade();
            ((Transition)fade).excludeTarget(16908335, true);
            ((Transition)fade).excludeTarget(16908336, true);
            this.getWindow().setExitTransition((Transition)fade);
            this.getWindow().setEnterTransition((Transition)fade);
            if (this.getIntent().getBooleanExtra(ViewProfilePhoto.z[3], false)) {
                this.getWindow().setSharedElementEnterTransition(TransitionInflater.from((Context)this).inflateTransition(17760257));
                this.getWindow().setSharedElementReturnTransition(TransitionInflater.from((Context)this).inflateTransition(17760257));
                this.setEnterSharedElementCallback(new as4(this));
            }
        }
        super.onCreate(bundle);
        Log.i(ViewProfilePhoto.z[5]);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903231);
        final String stringExtra = this.getIntent().getStringExtra(ViewProfilePhoto.z[12]);
        this.k = App.S.e(stringExtra);
        Log.i(ViewProfilePhoto.z[6] + stringExtra + ViewProfilePhoto.z[4] + this.k.v);
        App.b((aws)this);
        final a_d e = App.S.e();
        if (e == null) {
            Log.i(ViewProfilePhoto.z[7]);
            App.F(ViewProfilePhoto.z[8]);
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
            return;
        }
        final ActionBar supportActionBar = this.getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        Label_0371: {
            if (this.k.m()) {
                supportActionBar.setTitle(2131231224);
                if (!i) {
                    break Label_0371;
                }
            }
            if (stringExtra.equals(e.u)) {
                supportActionBar.setTitle(2131231498);
                if (!i) {
                    break Label_0371;
                }
            }
            supportActionBar.setTitle(cq.c(this.k.a((Context)this), (Context)this));
        }
        Label_0561: {
            if (stringExtra.equals(e.u)) {
                if (this.k.v <= 0 || this.k.b().exists()) {
                    break Label_0561;
                }
                this.k.v = 0;
                App.a(this.k.u, this.k.v, 1);
                this.l.sendEmptyMessageDelayed(0, 32000L);
                if (!i) {
                    break Label_0561;
                }
            }
            final String externalStorageState = Environment.getExternalStorageState();
            int n;
            if (externalStorageState.equals(ViewProfilePhoto.z[9]) && !externalStorageState.equals(ViewProfilePhoto.z[11])) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                if (this.k.v > 0 && !this.k.b().exists()) {
                    this.k.v = 0;
                }
                App.a(this.k.u, this.k.v, 1);
                if (this.k.v == 0) {
                    this.l.sendEmptyMessageDelayed(0, 32000L);
                }
            }
        }
        Label_0673: {
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.getIntent().getBooleanExtra(ViewProfilePhoto.z[10], false)) {
                    final ImageView imageView = (ImageView)this.findViewById(2131755800);
                    imageView.setTransitionName(this.getString(2131232142));
                    imageView.setImageBitmap(this.k.a(App.aq.getResources().getDimensionPixelSize(2131361952), (float)App.aq.getResources().getDimensionPixelSize(2131361814), true));
                    imageView.setVisibility(4);
                    if (!i) {
                        break Label_0673;
                    }
                }
                this.findViewById(2131755367).setTransitionName(this.getString(2131232142));
            }
        }
        this.b();
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (this.k.m() || this.k.equals(App.S.e())) {
            MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231043).setIcon(2130838719), 2);
        }
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131231732).setIcon(2130838733), 2);
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(ViewProfilePhoto.z[22]);
        this.l.removeMessages(0);
        App.a((aws)this);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        Label_0265: {
            try {
                switch (menuItem.getItemId()) {
                    default: {
                        return super.onOptionsItemSelected(menuItem);
                    }
                    case 0: {
                        qp.a(this.k, this, 12);
                        return true;
                    }
                    case 1: {
                        break;
                    }
                    case 16908332: {
                        break Label_0265;
                    }
                }
            }
            catch (IOException ex) {
                throw ex;
            }
            final Intent intent = new Intent(ViewProfilePhoto.z[17]);
            intent.setType(ViewProfilePhoto.z[18]);
            while (true) {
                Label_0253: {
                    if (!this.k.equals(App.S.e())) {
                        break Label_0253;
                    }
                    final File file = App.D(ViewProfilePhoto.z[15]);
                    try {
                        br.a(this.k.b(), file);
                        intent.putExtra(ViewProfilePhoto.z[19], (Parcelable)Uri.fromFile(file));
                        final Intent chooser = Intent.createChooser(intent, (CharSequence)null);
                        final Intent intent2 = new Intent(ViewProfilePhoto.z[14], (Uri)null);
                        intent2.putExtra(ViewProfilePhoto.z[20], (Parcelable)Uri.fromFile(file));
                        intent2.putExtra(ViewProfilePhoto.z[21], this.k.a((Context)this));
                        chooser.putExtra(ViewProfilePhoto.z[16], (Parcelable[])new Intent[] { intent2 });
                        this.startActivity(chooser);
                        return true;
                    }
                    catch (IOException ex2) {
                        App.a(this.getApplicationContext(), 2131231465, 1);
                        return true;
                    }
                }
                final File file = this.k.b();
                continue;
            }
        }
        ActivityCompat.finishAfterTransition(this);
        return true;
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (menu.size() == 0) {
            return false;
        }
        menu.findItem(1).setVisible(this.k.b().exists());
        return super.onPrepareOptionsMenu(menu);
    }
}
