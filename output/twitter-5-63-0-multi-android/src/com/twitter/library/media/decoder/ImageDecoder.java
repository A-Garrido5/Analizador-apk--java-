// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import com.twitter.library.media.util.m;
import android.graphics.RectF;
import com.twitter.library.util.af;
import android.graphics.Bitmap;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.bq;
import com.twitter.internal.android.util.Size;
import java.io.FileInputStream;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.library.media.util.ImageOrientation;
import java.io.File;
import java.io.InputStream;
import android.content.Context;
import android.net.Uri;
import android.graphics.Bitmap$Config;

public abstract class ImageDecoder
{
    protected static final boolean a;
    private static e n;
    protected f b;
    protected Bitmap$Config c;
    protected int d;
    protected boolean e;
    protected Uri f;
    protected Context g;
    protected InputStream h;
    protected File i;
    protected boolean j;
    protected String k;
    protected int l;
    protected ImageOrientation m;
    
    static {
        a = (App.l() && Log.isLoggable("ImageDecoder", 3));
        ImageDecoder.n = new d();
    }
    
    protected ImageDecoder() {
        this.b = new f();
        this.c = Bitmap$Config.ARGB_8888;
        this.m = ImageOrientation.a;
    }
    
    private ImageDecoder a(final Context g) {
        this.g = g;
        return this;
    }
    
    public static ImageDecoder a(final Context context, final Uri uri) {
        return ImageDecoder.n.a(MediaType.b).a(context).a(uri);
    }
    
    public static ImageDecoder a(final Context context, final InputStream inputStream) {
        return ImageDecoder.n.a(MediaType.b).a(context).a(inputStream);
    }
    
    private ImageDecoder a(final Uri f) {
        this.f = f;
        return this;
    }
    
    public static ImageDecoder a(final MediaFile mediaFile) {
        return ImageDecoder.n.a(mediaFile.type).b(mediaFile.file);
    }
    
    private ImageDecoder a(final ImageOrientation imageOrientation) {
        this.b.a(imageOrientation);
        return this;
    }
    
    public static ImageDecoder a(final File file) {
        return ImageDecoder.n.a(MediaType.b).b(file);
    }
    
    private ImageDecoder a(final InputStream h) {
        this.h = h;
        return this;
    }
    
    private b a(final Uri p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: aload_0        
        //     3: getfield        com/twitter/library/media/decoder/ImageDecoder.m:Lcom/twitter/library/media/util/ImageOrientation;
        //     6: astore          4
        //     8: aload           4
        //    10: getstatic       com/twitter/library/media/util/ImageOrientation.a:Lcom/twitter/library/media/util/ImageOrientation;
        //    13: if_acmpne       36
        //    16: aload_0        
        //    17: getfield        com/twitter/library/media/decoder/ImageDecoder.e:Z
        //    20: ifne            36
        //    23: aload_0        
        //    24: getfield        com/twitter/library/media/decoder/ImageDecoder.g:Landroid/content/Context;
        //    27: aload_1        
        //    28: invokestatic    com/twitter/library/util/af.b:(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/File;
        //    31: invokestatic    com/twitter/library/media/util/h.a:(Ljava/io/File;)Lcom/twitter/library/media/util/ImageOrientation;
        //    34: astore          4
        //    36: aload_0        
        //    37: aload           4
        //    39: aload_0        
        //    40: getfield        com/twitter/library/media/decoder/ImageDecoder.l:I
        //    43: invokevirtual   com/twitter/library/media/util/ImageOrientation.c:(I)Lcom/twitter/library/media/util/ImageOrientation;
        //    46: invokespecial   com/twitter/library/media/decoder/ImageDecoder.a:(Lcom/twitter/library/media/util/ImageOrientation;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    49: pop            
        //    50: aload_0        
        //    51: getfield        com/twitter/library/media/decoder/ImageDecoder.g:Landroid/content/Context;
        //    54: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    57: aload_1        
        //    58: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    61: astore          9
        //    63: aload           9
        //    65: astore          8
        //    67: aload_0        
        //    68: aload           8
        //    70: iload_2        
        //    71: invokespecial   com/twitter/library/media/decoder/ImageDecoder.a:(Ljava/io/InputStream;Z)Lcom/twitter/library/media/decoder/b;
        //    74: astore          10
        //    76: aload           8
        //    78: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    81: aload           10
        //    83: areturn        
        //    84: astore          7
        //    86: aconst_null    
        //    87: astore          8
        //    89: aload           7
        //    91: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    94: aload           8
        //    96: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    99: aconst_null    
        //   100: areturn        
        //   101: astore          6
        //   103: aload_3        
        //   104: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   107: aload           6
        //   109: athrow         
        //   110: astore          6
        //   112: aload           8
        //   114: astore_3       
        //   115: goto            103
        //   118: astore          7
        //   120: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  50     63     84     89     Ljava/lang/Exception;
        //  50     63     101    103    Any
        //  67     76     118    123    Ljava/lang/Exception;
        //  67     76     110    118    Any
        //  89     94     110    118    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    private b a(final File p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/library/media/decoder/ImageDecoder.m:Lcom/twitter/library/media/util/ImageOrientation;
        //     4: astore_3       
        //     5: aload_3        
        //     6: getstatic       com/twitter/library/media/util/ImageOrientation.a:Lcom/twitter/library/media/util/ImageOrientation;
        //     9: if_acmpne       24
        //    12: aload_0        
        //    13: getfield        com/twitter/library/media/decoder/ImageDecoder.e:Z
        //    16: ifne            24
        //    19: aload_1        
        //    20: invokestatic    com/twitter/library/media/util/h.a:(Ljava/io/File;)Lcom/twitter/library/media/util/ImageOrientation;
        //    23: astore_3       
        //    24: aload_0        
        //    25: aload_3        
        //    26: aload_0        
        //    27: getfield        com/twitter/library/media/decoder/ImageDecoder.l:I
        //    30: invokevirtual   com/twitter/library/media/util/ImageOrientation.c:(I)Lcom/twitter/library/media/util/ImageOrientation;
        //    33: invokespecial   com/twitter/library/media/decoder/ImageDecoder.a:(Lcom/twitter/library/media/util/ImageOrientation;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //    36: pop            
        //    37: new             Ljava/io/FileInputStream;
        //    40: dup            
        //    41: aload_1        
        //    42: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    45: astore          5
        //    47: aload_0        
        //    48: aload           5
        //    50: iload_2        
        //    51: invokespecial   com/twitter/library/media/decoder/ImageDecoder.a:(Ljava/io/FileInputStream;Z)Lcom/twitter/library/media/decoder/b;
        //    54: astore          8
        //    56: aload           5
        //    58: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    61: aload           8
        //    63: areturn        
        //    64: astore          6
        //    66: aconst_null    
        //    67: astore          5
        //    69: aload           6
        //    71: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    74: aload           5
        //    76: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    79: aconst_null    
        //    80: areturn        
        //    81: astore          7
        //    83: aconst_null    
        //    84: astore          5
        //    86: aload           5
        //    88: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    91: aload           7
        //    93: athrow         
        //    94: astore          7
        //    96: goto            86
        //    99: astore          6
        //   101: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     47     64     69     Ljava/lang/Exception;
        //  37     47     81     86     Any
        //  47     56     99     104    Ljava/lang/Exception;
        //  47     56     94     99     Any
        //  69     74     94     99     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    private b a(final FileInputStream fileInputStream, final boolean b) {
        Label_0048: {
            if (!b) {
                break Label_0048;
            }
            try {
                final Size a = this.a(fileInputStream);
                Size size;
                if (!a.c()) {
                    size = this.b.h(a);
                }
                else {
                    size = Size.a;
                }
                return new b(size);
                final Bitmap b2 = this.b(fileInputStream);
                // iftrue(Label_0083:, b2 == null)
                return new b(b2);
            }
            catch (OutOfMemoryError outOfMemoryError) {
                bq.a(outOfMemoryError);
            }
            catch (IOException ex) {
                ErrorReporter.a(ex);
                goto Label_0081;
            }
        }
    }
    
    private b a(final InputStream inputStream, final boolean b) {
        if (inputStream instanceof FileInputStream) {
            return this.a((FileInputStream)inputStream, b);
        }
        final File a = af.a(this.g, inputStream, MediaType.b.extension);
        if (a != null) {
            try {
                return this.a(a, b);
            }
            finally {
                a.delete();
            }
        }
        return new b((Bitmap)null);
    }
    
    private ImageDecoder b(final File i) {
        this.i = i;
        return this;
    }
    
    protected abstract Size a(final FileInputStream p0);
    
    public ImageDecoder a() {
        this.e = true;
        return this;
    }
    
    public ImageDecoder a(final int n) {
        return this.a(Size.a(n));
    }
    
    public ImageDecoder a(final Bitmap$Config c) {
        if (this.c != c) {
            this.c = c;
            if (this.d != 0) {
                this.d(this.d);
            }
        }
        return this;
    }
    
    public ImageDecoder a(final RectF rectF) {
        this.b.a(rectF);
        return this;
    }
    
    public ImageDecoder a(final Size size) {
        this.b.a(size).d(true).c(false);
        return this;
    }
    
    public ImageDecoder a(final ImageDecoder$ScaleType imageDecoder$ScaleType) {
        boolean b = true;
        this.b.a((imageDecoder$ScaleType == ImageDecoder$ScaleType.b || imageDecoder$ScaleType == ImageDecoder$ScaleType.c) && b);
        final f b2 = this.b;
        if (imageDecoder$ScaleType != ImageDecoder$ScaleType.c) {
            b = false;
        }
        b2.b(b);
        return this;
    }
    
    public ImageDecoder a(final String k) {
        this.k = k;
        return this;
    }
    
    public ImageDecoder a(final boolean b) {
        this.b.e(b);
        return this;
    }
    
    public Bitmap b() {
        final b c = this.c(false);
        if (c != null) {
            return c.a;
        }
        return null;
    }
    
    protected abstract Bitmap b(final FileInputStream p0);
    
    public ImageDecoder b(final int n) {
        return this.b(Size.a(n));
    }
    
    public ImageDecoder b(final Size size) {
        this.b.a(size).d(false).c(true);
        return this;
    }
    
    public ImageDecoder b(final boolean j) {
        this.j = j;
        return this;
    }
    
    public Size c() {
        final b c = this.c(true);
        if (c != null) {
            return c.b;
        }
        return Size.a;
    }
    
    public ImageDecoder c(final int n) {
        return this.c(Size.a(n));
    }
    
    public ImageDecoder c(final Size size) {
        this.b.a(size).d(false).c(false);
        return this;
    }
    
    b c(final boolean b) {
        if (this.f != null) {
            return this.a(this.f, b);
        }
        if (this.h != null) {
            return this.a(this.h, b);
        }
        if (this.i != null) {
            return this.a(this.i, b);
        }
        throw new RuntimeException("No bitmap source specified.");
    }
    
    public ImageDecoder d(final int d) {
        this.b.a(d / com.twitter.library.media.util.m.a(this.c));
        this.d = d;
        return this;
    }
    
    public ImageDecoder d(final Size size) {
        this.b.b(size);
        return this;
    }
    
    public ImageDecoder e(final int l) {
        this.l = l;
        return this;
    }
}
