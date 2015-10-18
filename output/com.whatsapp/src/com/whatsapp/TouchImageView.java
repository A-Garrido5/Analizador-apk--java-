// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.whatsapp.wallpaper.j;
import android.content.Context;
import android.os.Handler;
import android.graphics.Paint;
import com.whatsapp.wallpaper.ImageViewTouchBase;

public class TouchImageView extends ImageViewTouchBase
{
    private static float n;
    public static float o;
    public static Paint p;
    public static int v;
    boolean A;
    boolean B;
    boolean q;
    int r;
    boolean s;
    boolean t;
    vc u;
    private Handler w;
    private long x;
    protected boolean y;
    public float z;
    
    static {
        TouchImageView.n = 3.0f;
        TouchImageView.v = 0;
        TouchImageView.o = -1.0f;
        (TouchImageView.p = new Paint()).setColor(-16777216);
    }
    
    public TouchImageView(final Context context) {
        super(context);
        this.B = false;
        this.r = 0;
        this.q = true;
        this.A = false;
        this.s = false;
        this.t = true;
        this.w = new zs(this);
        this.z = 1.0f;
        this.u = vc.b();
        this.setRecycler(new _x(this));
    }
    
    public TouchImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.B = false;
        this.r = 0;
        this.q = true;
        this.A = false;
        this.s = false;
        this.t = true;
        this.w = new zs(this);
        this.z = 1.0f;
        this.u = vc.b();
        this.setRecycler(new ass(this));
    }
    
    static long a(final TouchImageView touchImageView) {
        return touchImageView.x;
    }
    
    public void a(final float n, final float n2, final float n3) {
        super.a(n, n2, n3);
    }
    
    public void b(final float n, final float n2) {
        super.b(n, n2);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.A) {
            final Paint paint = new Paint();
            paint.setDither(true);
            final Bitmap bitmap = ((BitmapDrawable)this.getResources().getDrawable(2130838956)).getBitmap();
            final Matrix matrix = new Matrix(this.getImageMatrix());
            if (this.k.f() != null) {
                final float[] array = { this.k.e() / 2, this.k.b() / 2 };
                matrix.mapPoints(array);
                canvas.drawBitmap(bitmap, this.getPaddingLeft() + array[0] - bitmap.getWidth() / 2, (float)(this.getHeight() / 2 - bitmap.getHeight() / 2), paint);
            }
        }
        if (this.y && !this.B) {
            final Rect rect = new Rect(this.getWidth() - this.u.g, 0, this.getWidth(), this.getHeight());
            final Rect rect2 = new Rect(this.getWidth() - this.u.g, 0, this.getWidth(), this.getHeight());
            canvas.drawRect(rect, TouchImageView.p);
            canvas.drawRect(rect2, TouchImageView.p);
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.k.f() != null) {}
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    public void setImageBitmap(final Bitmap imageBitmap) {
        this.B = false;
        super.setImageBitmap(imageBitmap);
    }
}
