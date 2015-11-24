// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.graphics.Bitmap$Config;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Paint;
import com.twitter.internal.android.widget.TypefacesTextView;

public class KnockoutTextView extends TypefacesTextView
{
    private Paint a;
    private Bitmap b;
    private Canvas c;
    private Drawable d;
    private Bitmap e;
    private Canvas f;
    private Size g;
    
    public KnockoutTextView(final Context context) {
        super(context);
        this.a();
    }
    
    public KnockoutTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public KnockoutTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    private void a() {
        (this.a = new Paint()).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        super.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }
    
    private void a(final int n, final int n2) {
        this.d.setBounds(0, 0, n, n2);
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        this.d.draw(this.f);
        this.c.drawColor(-16777216, PorterDuff$Mode.CLEAR);
        super.onDraw(this.c);
        this.f.drawBitmap(this.b, 0.0f, 0.0f, this.a);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, (Paint)null);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.e = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        this.f = new Canvas(this.e);
        this.b = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        this.c = new Canvas(this.b);
        this.g = Size.a(n, n2);
        if (n != n3 || n2 != n4) {
            this.a(n, n2);
        }
    }
    
    public void setBackgroundColor(final int n) {
        this.setBackgroundDrawable((Drawable)new ColorDrawable(n));
    }
    
    @Deprecated
    public void setBackgroundDrawable(final Drawable d) {
        this.d = d;
        int n = d.getIntrinsicWidth();
        int n2 = d.getIntrinsicHeight();
        if (n == -1 || n2 == -1) {
            n = this.getWidth();
            n2 = this.getHeight();
        }
        if (this.g != null) {
            n = this.g.a();
            n2 = this.g.b();
        }
        if (n != 0 && n2 != 0) {
            this.a(n, n2);
        }
    }
}
