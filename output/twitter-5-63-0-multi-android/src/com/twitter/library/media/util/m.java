// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.concurrent.i;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.view.View;
import com.twitter.library.media.decoder.ImageDecoder;
import java.util.Iterator;
import android.view.Window;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import java.util.List;
import android.app.Activity;
import android.graphics.Bitmap$CompressFormat;
import java.io.File;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.model.MediaFile;
import android.net.Uri;
import com.twitter.library.media.service.tasks.CropTask;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import com.twitter.util.d;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;
import android.content.Context;
import android.graphics.Xfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.twitter.internal.android.util.Size;
import com.twitter.util.g;
import android.graphics.Rect;
import com.twitter.library.util.bq;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import com.twitter.library.util.ab;

public class m
{
    public static final ab a;
    public static final PorterDuffXfermode b;
    
    static {
        a = new o(null);
        b = new PorterDuffXfermode(PorterDuff$Mode.SRC_IN);
    }
    
    public static int a(final Bitmap$Config bitmap$Config) {
        int n = 2;
        switch (com.twitter.library.media.util.n.a[bitmap$Config.ordinal()]) {
            default: {
                n = 1;
                return n;
            }
            case 2:
            case 3: {
                return n;
            }
            case 1: {
                return 4;
            }
        }
    }
    
    public static Bitmap a(final Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix)null, false);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
            return null;
        }
    }
    
    public static Bitmap a(Bitmap bitmap, final Rect rect, final Matrix matrix, final boolean b) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        if ((matrix != null && !matrix.isIdentity()) || (rect != null && (rect.width() != width || rect.height() != height))) {
            Label_0106: {
                if (rect == null) {
                    break Label_0106;
                }
                try {
                    final int top = rect.top;
                    final int left = rect.left;
                    return Bitmap.createBitmap(bitmap, left, top, g.a(rect.width(), 0, width - left), g.a(rect.height(), 0, height - top), matrix, b);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, b);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    bq.a(outOfMemoryError);
                    bitmap = null;
                }
            }
        }
        return bitmap;
    }
    
    public static Bitmap a(final Bitmap bitmap, final Size size, final float n) {
        final Bitmap a = a(size, Bitmap$Config.ARGB_8888);
        if (a == null) {
            return null;
        }
        final Canvas canvas = new Canvas(a);
        final Paint paint = new Paint(3);
        final RoundRectShape roundRectShape = new RoundRectShape(new float[] { n, n, n, n, n, n, n, n }, (RectF)null, (float[])null);
        roundRectShape.resize((float)size.a(), (float)size.b());
        roundRectShape.draw(canvas, paint);
        paint.setXfermode((Xfermode)m.b);
        final Size a2 = Size.a(bitmap);
        if (!a2.d(size)) {
            canvas.drawBitmap(bitmap, a2.f(), size.f(), paint);
        }
        else {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        return a;
    }
    
    public static Bitmap a(final Bitmap bitmap, final Size size, final boolean b) {
        try {
            return Bitmap.createScaledBitmap(bitmap, size.a(), size.b(), b);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
            return null;
        }
    }
    
    public static Bitmap a(final Size size, final Bitmap$Config bitmap$Config) {
        try {
            return Bitmap.createBitmap(size.a(), size.b(), bitmap$Config);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
            return null;
        }
    }
    
    public static ImageFile a(final Context context, final EditableImage editableImage) {
        d.c();
        final x x = new x(editableImage);
        final w a = w.a(context);
        final File a2 = a.a(x);
        if (a2 == null) {
            final File g = x.g;
            final RectF cropRect = editableImage.cropRect;
            Label_0318: {
                if (cropRect == null) {
                    break Label_0318;
                }
                RectF a3 = ImageOrientation.a(editableImage.rotation).b().a(cropRect, 0.5f, 0.5f);
                File a4;
                CropTask cropTask;
                File file = null;
                boolean a5;
                int n;
                boolean a6;
                File a7;
                int n2;
                ImageOrientation imageOrientation;
                File a8;
                Label_0140_Outer:Label_0239_Outer:
                while (true) {
                Label_0239:
                    while (true) {
                        Label_0178: {
                        Block_9:
                            while (true) {
                                Label_0366: {
                                    if (a3 == null || a3.isEmpty()) {
                                        break Label_0366;
                                    }
                                    a4 = af.a(context, MediaType.b.extension);
                                    if (a4 == null) {
                                        break Label_0366;
                                    }
                                    cropTask = new CropTask(x.e.b(), a4, a3, editableImage.rotation);
                                    cropTask.d(context);
                                    if (!cropTask.b()) {
                                        break Label_0366;
                                    }
                                    file = a4;
                                    a5 = com.twitter.media.filters.g.a(context);
                                    n = 0;
                                    if (!a5) {
                                        break Label_0239;
                                    }
                                    if (editableImage.enhanced) {
                                        break Label_0178;
                                    }
                                    a6 = com.twitter.media.filters.g.a(editableImage.filterId);
                                    n = 0;
                                    if (!a6) {
                                        break Block_9;
                                    }
                                    break Label_0239;
                                }
                                file = g;
                                continue Label_0239_Outer;
                            }
                            try {
                                a7 = af.a(context, MediaType.b.extension);
                                while (true) {
                                    Label_0330: {
                                        if (a7 == null) {
                                            break Label_0330;
                                        }
                                        if (!com.twitter.media.filters.g.a(context, Uri.fromFile(file), a7, 0, 0, editableImage.filterId, editableImage.enhanced, 1.0f, editableImage.intensity)) {
                                            af.b(a7);
                                            break Label_0330;
                                        }
                                        n2 = 1;
                                        file = a7;
                                        n = n2;
                                        if (!file.equals(g)) {
                                            imageOrientation = h.a(file);
                                            if (n != 0) {
                                                imageOrientation = ImageOrientation.b;
                                            }
                                            h.a(g, file, imageOrientation);
                                            a8 = a.a(x, file);
                                            if (a8 != null) {
                                                af.b(file);
                                                file = a8;
                                            }
                                            af.b(g);
                                            return (ImageFile)MediaFile.a(file, MediaType.b);
                                        }
                                        return x.e;
                                    }
                                    n2 = 0;
                                    continue;
                                }
                                a3 = null;
                                continue Label_0140_Outer;
                            }
                            catch (Throwable t) {
                                ErrorReporter.a(t);
                                n = 0;
                                continue Label_0239;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            return x.e;
        }
        return (ImageFile)MediaFile.a(a2, MediaType.b);
    }
    
    public static File a(final Context context, final long n) {
        final File b = b(context, n);
        if (b != null && b.exists()) {
            return b;
        }
        return null;
    }
    
    public static File a(final Context context, final Bitmap bitmap, final Bitmap$CompressFormat bitmap$CompressFormat, final int n) {
        String s;
        if (bitmap$CompressFormat == Bitmap$CompressFormat.PNG) {
            s = "png";
        }
        else {
            s = "jpg";
        }
        final File a = af.a(context, s);
        if (a != null && a(bitmap, a, bitmap$CompressFormat, n)) {
            return a;
        }
        af.b(a);
        return null;
    }
    
    public static String a(final String s, final float n) {
        if (s == null) {
            return null;
        }
        if (n > 1.0f) {
            return s + "/mobile_retina";
        }
        return s + "/mobile";
    }
    
    public static void a(final Activity activity, final List list) {
        if (activity != null) {
            final Window window = activity.getWindow();
            if (window != null) {
                a(window.getDecorView(), list);
            }
            if (activity instanceof FragmentActivity) {
                final List fragments = ((FragmentActivity)activity).getSupportFragmentManager().getFragments();
                if (fragments != null) {
                    final Iterator<Fragment> iterator = fragments.iterator();
                    while (iterator.hasNext()) {
                        a(iterator.next().getView(), list);
                    }
                }
            }
        }
    }
    
    public static void a(final Context context, final Bitmap bitmap, final Uri uri) {
        final Bitmap b = ImageDecoder.a(context, uri).a(Size.a(bitmap)).b();
        if (b != null) {
            a(bitmap, b);
        }
    }
    
    public static void a(final Bitmap bitmap, final Bitmap bitmap2) {
        final Canvas canvas = new Canvas(bitmap);
        final Bitmap a = a(bitmap2, Size.a(bitmap), true);
        if (a != null) {
            canvas.drawBitmap(a, new Matrix(), (Paint)null);
            a.recycle();
        }
    }
    
    public static void a(final View view, final List list) {
        if (view != null) {
            if (view instanceof ImageView) {
                final Drawable drawable = ((ImageView)view).getDrawable();
                if (drawable != null && drawable instanceof BitmapDrawable) {
                    final Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
                    if (bitmap != null) {
                        list.add(bitmap);
                    }
                }
            }
            else if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    a(viewGroup.getChildAt(i), list);
                }
            }
        }
    }
    
    public static boolean a(final Bitmap p0, final File p1, final Bitmap$CompressFormat p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileOutputStream;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //     8: astore          4
        //    10: aload_0        
        //    11: aload_2        
        //    12: iload_3        
        //    13: iconst_0       
        //    14: bipush          100
        //    16: invokestatic    com/twitter/util/j.a:(III)I
        //    19: aload           4
        //    21: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //    24: istore          8
        //    26: aload           4
        //    28: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    31: iload           8
        //    33: ireturn        
        //    34: astore          5
        //    36: aconst_null    
        //    37: astore          4
        //    39: aload           5
        //    41: invokestatic    com/twitter/library/util/bq.a:(Ljava/lang/OutOfMemoryError;)V
        //    44: aload           4
        //    46: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    49: iconst_0       
        //    50: ireturn        
        //    51: astore          7
        //    53: aconst_null    
        //    54: astore          4
        //    56: aload           7
        //    58: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    61: aload           4
        //    63: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    66: iconst_0       
        //    67: ireturn        
        //    68: astore          6
        //    70: aconst_null    
        //    71: astore          4
        //    73: aload           4
        //    75: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    78: aload           6
        //    80: athrow         
        //    81: astore          6
        //    83: goto            73
        //    86: astore          7
        //    88: goto            56
        //    91: astore          5
        //    93: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      10     34     39     Ljava/lang/OutOfMemoryError;
        //  0      10     51     56     Ljava/io/IOException;
        //  0      10     68     73     Any
        //  10     26     91     96     Ljava/lang/OutOfMemoryError;
        //  10     26     86     91     Ljava/io/IOException;
        //  10     26     81     86     Any
        //  39     44     81     86     Any
        //  56     61     81     86     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public static boolean a(final RectF rectF) {
        return rectF == null || rectF.isEmpty();
    }
    
    @TargetApi(19)
    public static int b(final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
    
    public static File b(final Context context, final long n) {
        final File b = af.b(context);
        if (b != null) {
            return new File(b, n + "_header.jpg");
        }
        return null;
    }
    
    public static boolean c(final Context context, final long n) {
        final File b = b(context, n);
        return b != null && b.exists() && b.delete();
    }
    
    public static i d(final Context context, final long n) {
        return af.c(b(context, n));
    }
}
