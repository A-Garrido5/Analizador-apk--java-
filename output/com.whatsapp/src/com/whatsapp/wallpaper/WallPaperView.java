// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.util.Log;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;

public class WallPaperView extends ImageView
{
    private static final String[] z;
    private Rect a;
    private boolean b;
    private a c;
    private Bitmap d;
    
    static {
        final String[] z2 = new String[4];
        String s = ";Ur\u00022>\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "iL6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "iL6";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = ";Ur\u00022>\u0010u\u00182'Ws\u0014i";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public WallPaperView(final Context context, final AttributeSet set) {
        super(context, set);
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    public void a() {
        this.b = false;
        this.setImageDrawable((Drawable)null);
        this.d = null;
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        int n = 1;
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        Label_0156: {
            int n2;
            if (this.a == null) {
                Log.i(WallPaperView.z[0] + measuredWidth + WallPaperView.z[2] + measuredHeight);
                this.a = new Rect(0, 0, measuredWidth, measuredHeight);
                if (!ImageViewTouchBase.h) {
                    break Label_0156;
                }
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (this.a.width() != measuredWidth || this.a.height() != measuredHeight) {
                this.a.set(0, 0, measuredWidth, measuredHeight);
                Log.i(WallPaperView.z[3] + measuredWidth + WallPaperView.z[n] + measuredHeight);
            }
            else {
                n = n2;
            }
        }
        super.onDraw(canvas);
        if ((n != 0 || this.b) && measuredHeight > 0 && measuredWidth > 0) {
            if (this.c != null) {
                this.c.a(measuredWidth, measuredHeight);
            }
            if (this.d != null) {
                this.b = false;
            }
        }
    }
    
    public void setDrawable(final Drawable drawable) {
        this.b = true;
        this.setImageBitmap(this.d = ((BitmapDrawable)drawable).getBitmap());
        this.invalidate();
    }
    
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final Drawable drawable = this.getDrawable();
        if (drawable != null) {
            final Matrix imageMatrix = this.getImageMatrix();
            final float max = Math.max((n3 - n) / drawable.getIntrinsicWidth(), (n4 - n2) / drawable.getIntrinsicHeight());
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            this.setImageMatrix(imageMatrix);
        }
        return super.setFrame(n, n2, n3, n4);
    }
    
    public void setOnSizeChangedListener(final a c) {
        this.c = c;
    }
}
