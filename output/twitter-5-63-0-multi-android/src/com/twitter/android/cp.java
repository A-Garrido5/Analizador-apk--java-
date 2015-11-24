// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import android.graphics.RectF;
import com.twitter.library.media.service.tasks.CropTask;
import com.twitter.util.d;
import com.twitter.library.media.service.core.MediaServiceTask;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;
import com.twitter.library.media.service.core.k;
import android.support.v4.app.Fragment;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class cp extends AsyncTask
{
    private final WeakReference a;
    private final Context b;
    private final int c;
    private final boolean d;
    private final boolean e;
    
    cp(final CropManager cropManager, final Context b, final int c, final boolean d, final boolean e) {
        this.a = new WeakReference((T)cropManager);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    protected Bitmap a(final Uri... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aconst_null    
        //     3: astore_3       
        //     4: aload_0        
        //     5: getfield        com/twitter/android/cp.b:Landroid/content/Context;
        //     8: astore          4
        //    10: aload_0        
        //    11: invokevirtual   com/twitter/android/cp.isCancelled:()Z
        //    14: ifeq            19
        //    17: aconst_null    
        //    18: areturn        
        //    19: aload_1        
        //    20: iconst_0       
        //    21: aaload         
        //    22: astore          12
        //    24: aload_1        
        //    25: iconst_1       
        //    26: aaload         
        //    27: astore          13
        //    29: aload           4
        //    31: aload           12
        //    33: invokestatic    com/twitter/library/media/decoder/ImageDecoder.a:(Landroid/content/Context;Landroid/net/Uri;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    36: aload           4
        //    38: invokestatic    com/twitter/util/t.a:(Landroid/content/Context;)Lcom/twitter/internal/android/util/Size;
        //    41: invokevirtual   com/twitter/library/media/decoder/ImageDecoder.a:(Lcom/twitter/internal/android/util/Size;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    44: astore          14
        //    46: aload           13
        //    48: ifnull          91
        //    51: aload           14
        //    53: iload_2        
        //    54: invokevirtual   com/twitter/library/media/decoder/ImageDecoder.b:(Z)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    57: invokevirtual   com/twitter/library/media/decoder/ImageDecoder.b:()Landroid/graphics/Bitmap;
        //    60: astore          15
        //    62: aload_0        
        //    63: invokevirtual   com/twitter/android/cp.isCancelled:()Z
        //    66: istore          16
        //    68: iload           16
        //    70: ifeq            96
        //    73: iconst_0       
        //    74: ifeq            81
        //    77: aconst_null    
        //    78: invokevirtual   com/twitter/media/filters/Filters.b:()V
        //    81: iconst_0       
        //    82: ifeq            17
        //    85: aconst_null    
        //    86: invokestatic    yp.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    89: aconst_null    
        //    90: areturn        
        //    91: iconst_0       
        //    92: istore_2       
        //    93: goto            51
        //    96: aload_0        
        //    97: getfield        com/twitter/android/cp.c:I
        //   100: ifne            150
        //   103: aload_0        
        //   104: getfield        com/twitter/android/cp.d:Z
        //   107: ifne            150
        //   110: aload           13
        //   112: ifnull          404
        //   115: aload_0        
        //   116: getfield        com/twitter/android/cp.b:Landroid/content/Context;
        //   119: aload           15
        //   121: aload           13
        //   123: invokestatic    com/twitter/library/media/util/m.a:(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)V
        //   126: aconst_null    
        //   127: astore          20
        //   129: aload           20
        //   131: ifnull          139
        //   134: aload           20
        //   136: invokevirtual   com/twitter/media/filters/Filters.b:()V
        //   139: aload_3        
        //   140: ifnull          147
        //   143: aload_3        
        //   144: invokestatic    yp.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   147: aload           15
        //   149: areturn        
        //   150: new             Lcom/twitter/media/filters/Filters;
        //   153: dup            
        //   154: invokespecial   com/twitter/media/filters/Filters.<init>:()V
        //   157: astore          6
        //   159: aload           4
        //   161: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   164: ldc             2131230723
        //   166: invokevirtual   android/content/res/Resources.openRawResourceFd:(I)Landroid/content/res/AssetFileDescriptor;
        //   169: astore          18
        //   171: aload           18
        //   173: astore          8
        //   175: aload           6
        //   177: aload           4
        //   179: aload           8
        //   181: aload_0        
        //   182: getfield        com/twitter/android/cp.e:Z
        //   185: invokevirtual   com/twitter/media/filters/Filters.a:(Landroid/content/Context;Landroid/content/res/AssetFileDescriptor;Z)Z
        //   188: ifeq            265
        //   191: aload_0        
        //   192: invokevirtual   com/twitter/android/cp.isCancelled:()Z
        //   195: ifne            265
        //   198: aload           6
        //   200: aload           12
        //   202: aload           15
        //   204: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   207: aload           15
        //   209: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   212: aload_0        
        //   213: getfield        com/twitter/android/cp.d:Z
        //   216: invokevirtual   com/twitter/media/filters/Filters.a:(Landroid/net/Uri;IIZ)I
        //   219: istore          21
        //   221: iload           21
        //   223: ifle            265
        //   226: aload_0        
        //   227: invokevirtual   com/twitter/android/cp.isCancelled:()Z
        //   230: ifne            265
        //   233: aload           6
        //   235: aload_0        
        //   236: getfield        com/twitter/android/cp.c:I
        //   239: iload           21
        //   241: aload           15
        //   243: invokevirtual   com/twitter/media/filters/Filters.a:(IILandroid/graphics/Bitmap;)Z
        //   246: ifeq            265
        //   249: aload           13
        //   251: ifnull          265
        //   254: aload_0        
        //   255: getfield        com/twitter/android/cp.b:Landroid/content/Context;
        //   258: aload           15
        //   260: aload           13
        //   262: invokestatic    com/twitter/library/media/util/m.a:(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)V
        //   265: aload           8
        //   267: astore_3       
        //   268: aload           6
        //   270: astore          20
        //   272: goto            129
        //   275: astore          9
        //   277: aconst_null    
        //   278: astore          10
        //   280: aconst_null    
        //   281: astore          11
        //   283: aload           9
        //   285: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //   288: aload           11
        //   290: ifnull          298
        //   293: aload           11
        //   295: invokevirtual   com/twitter/media/filters/Filters.b:()V
        //   298: aload           10
        //   300: ifnull          17
        //   303: aload           10
        //   305: invokestatic    yp.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   308: aconst_null    
        //   309: areturn        
        //   310: astore          5
        //   312: aconst_null    
        //   313: astore          6
        //   315: aload           5
        //   317: astore          7
        //   319: aconst_null    
        //   320: astore          8
        //   322: aload           6
        //   324: ifnull          332
        //   327: aload           6
        //   329: invokevirtual   com/twitter/media/filters/Filters.b:()V
        //   332: aload           8
        //   334: ifnull          342
        //   337: aload           8
        //   339: invokestatic    yp.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   342: aload           7
        //   344: athrow         
        //   345: astore          17
        //   347: aload           17
        //   349: astore          7
        //   351: aconst_null    
        //   352: astore          8
        //   354: goto            322
        //   357: astore          7
        //   359: goto            322
        //   362: astore          7
        //   364: aload           10
        //   366: astore          8
        //   368: aload           11
        //   370: astore          6
        //   372: goto            322
        //   375: astore          9
        //   377: aload           6
        //   379: astore          11
        //   381: aconst_null    
        //   382: astore          10
        //   384: goto            283
        //   387: astore          19
        //   389: aload           6
        //   391: astore          11
        //   393: aload           8
        //   395: astore          10
        //   397: aload           19
        //   399: astore          9
        //   401: goto            283
        //   404: aconst_null    
        //   405: astore_3       
        //   406: aconst_null    
        //   407: astore          20
        //   409: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  19     46     275    283    Ljava/lang/Throwable;
        //  19     46     310    322    Any
        //  51     68     275    283    Ljava/lang/Throwable;
        //  51     68     310    322    Any
        //  96     110    275    283    Ljava/lang/Throwable;
        //  96     110    310    322    Any
        //  115    126    275    283    Ljava/lang/Throwable;
        //  115    126    310    322    Any
        //  150    159    275    283    Ljava/lang/Throwable;
        //  150    159    310    322    Any
        //  159    171    375    387    Ljava/lang/Throwable;
        //  159    171    345    357    Any
        //  175    221    387    404    Ljava/lang/Throwable;
        //  175    221    357    362    Any
        //  226    249    387    404    Ljava/lang/Throwable;
        //  226    249    357    362    Any
        //  254    265    387    404    Ljava/lang/Throwable;
        //  254    265    357    362    Any
        //  283    288    362    375    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 199, Size: 199
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
    
    protected void a(final Bitmap bitmap) {
        final CropManager cropManager = (CropManager)this.a.get();
        if (cropManager != null) {
            cropManager.a(bitmap);
        }
    }
    
    protected void b(final Bitmap bitmap) {
        final CropManager cropManager = (CropManager)this.a.get();
        if (cropManager != null) {
            cropManager.a(bitmap);
        }
    }
}
