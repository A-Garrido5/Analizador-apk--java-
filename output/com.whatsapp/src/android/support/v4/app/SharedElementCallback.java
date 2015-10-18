// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.Map;
import java.util.List;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Parcelable;
import android.graphics.RectF;
import android.view.View;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;

public abstract class SharedElementCallback
{
    private static int MAX_IMAGE_SIZE;
    private static final String[] z;
    private Matrix mTempMatrix;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e?X\u0003\u0003:\u001bT\u0016\u00166.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = 'd';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e4\\\u0016\t>&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e?X\u0003\u0003:\u0005V\u0003\b:\u0002L\u0012\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e4\\\u0016\t>&";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e?X\u0003\u0003:\u0005V\u0003\b:\u0002L\u0012\u0001";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0011\f>$P\u0006!33X\u0007\n+lF\f\u0005/%]\r\u0010e?X\u0003\u0003:\u001bT\u0016\u00166.";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SharedElementCallback.MAX_IMAGE_SIZE = 1048576;
    }
    
    private static Bitmap createDrawableBitmap(final Drawable drawable) {
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        final float min = Math.min(1.0f, SharedElementCallback.MAX_IMAGE_SIZE / (intrinsicWidth * intrinsicHeight));
        if (drawable instanceof BitmapDrawable && min == 1.0f) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        final int n = (int)(min * intrinsicWidth);
        final int n2 = (int)(min * intrinsicHeight);
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final Rect bounds = drawable.getBounds();
        final int left = bounds.left;
        final int top = bounds.top;
        final int right = bounds.right;
        final int bottom = bounds.bottom;
        drawable.setBounds(0, 0, n, n2);
        drawable.draw(canvas);
        drawable.setBounds(left, top, right, bottom);
        return bitmap;
    }
    
    public Parcelable onCaptureSharedElementSnapshot(final View view, final Matrix matrix, final RectF rectF) {
        Label_0138: {
            if (!(view instanceof ImageView)) {
                break Label_0138;
            }
            final ImageView imageView = (ImageView)view;
            final Drawable drawable = imageView.getDrawable();
            final Drawable background = imageView.getBackground();
            if (drawable == null || background != null) {
                break Label_0138;
            }
            final Bitmap drawableBitmap = createDrawableBitmap(drawable);
            if (drawableBitmap == null) {
                break Label_0138;
            }
            final Bundle bundle = new Bundle();
            bundle.putParcelable(SharedElementCallback.z[3], (Parcelable)drawableBitmap);
            bundle.putString(SharedElementCallback.z[4], imageView.getScaleType().toString());
            if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                final Matrix imageMatrix = imageView.getImageMatrix();
                final float[] array = new float[9];
                imageMatrix.getValues(array);
                bundle.putFloatArray(SharedElementCallback.z[5], array);
            }
            final Object o = bundle;
            return (Parcelable)o;
        }
        final int round = Math.round(rectF.width());
        final int round2 = Math.round(rectF.height());
        Object o = null;
        if (round <= 0) {
            return (Parcelable)o;
        }
        o = null;
        if (round2 > 0) {
            final float min = Math.min(1.0f, SharedElementCallback.MAX_IMAGE_SIZE / (round * round2));
            final int n = (int)(min * round);
            final int n2 = (int)(min * round2);
            if (this.mTempMatrix == null) {
                this.mTempMatrix = new Matrix();
            }
            this.mTempMatrix.set(matrix);
            this.mTempMatrix.postTranslate(-rectF.left, -rectF.top);
            this.mTempMatrix.postScale(min, min);
            final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmap);
            canvas.concat(this.mTempMatrix);
            view.draw(canvas);
            return (Parcelable)bitmap;
        }
        return (Parcelable)o;
    }
    
    public View onCreateSnapshotView(final Context context, final Parcelable parcelable) {
        ImageView imageView2;
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            final Bitmap imageBitmap = (Bitmap)bundle.getParcelable(SharedElementCallback.z[1]);
            if (imageBitmap == null) {
                return null;
            }
            final ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(imageBitmap);
            imageView.setScaleType(ImageView$ScaleType.valueOf(bundle.getString(SharedElementCallback.z[2])));
            if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                final float[] floatArray = bundle.getFloatArray(SharedElementCallback.z[0]);
                final Matrix imageMatrix = new Matrix();
                imageMatrix.setValues(floatArray);
                imageView.setImageMatrix(imageMatrix);
            }
            imageView2 = imageView;
        }
        else if (parcelable instanceof Bitmap) {
            final Bitmap imageBitmap2 = (Bitmap)parcelable;
            imageView2 = new ImageView(context);
            imageView2.setImageBitmap(imageBitmap2);
        }
        else {
            imageView2 = null;
        }
        return (View)imageView2;
    }
    
    public void onMapSharedElements(final List list, final Map map) {
    }
    
    public void onRejectSharedElements(final List list) {
    }
    
    public void onSharedElementEnd(final List list, final List list2, final List list3) {
    }
    
    public void onSharedElementStart(final List list, final List list2, final List list3) {
    }
}
