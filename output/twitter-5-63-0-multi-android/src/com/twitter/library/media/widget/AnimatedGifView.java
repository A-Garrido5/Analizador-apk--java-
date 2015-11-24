// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.model.AnimatedGifFile;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Movie;
import com.twitter.library.media.model.EditableAnimatedGif;
import android.widget.ImageView;

public class AnimatedGifView extends ImageView
{
    private b a;
    private EditableAnimatedGif b;
    private Movie c;
    private int d;
    private boolean e;
    private boolean f;
    private long g;
    private int h;
    private int i;
    private int j;
    private Bitmap k;
    private Canvas l;
    private c m;
    
    public AnimatedGifView(final Context context) {
        this(context, null, 0);
    }
    
    public AnimatedGifView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AnimatedGifView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.AnimatedGifView, n, 0);
        try {
            this.i = obtainStyledAttributes.getInt(li.AnimatedGifView_MinimumDurationMs, 0);
            this.j = obtainStyledAttributes.getInt(li.AnimatedGifView_MinimumRepeatCount, 0);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public void a() {
        if (this.j > 0 || this.i > 0) {
            if (!this.f) {
                this.f = true;
                this.e = true;
                this.invalidate();
            }
            return;
        }
        this.c();
    }
    
    void a(final Movie c, final Bitmap bitmap) {
        this.m = null;
        this.setImageBitmap(bitmap);
        this.c = c;
        this.k = bitmap;
        this.l = new Canvas(bitmap);
        this.d = c.duration();
        if (this.a != null) {
            this.a.a();
        }
    }
    
    public void b() {
        this.f = false;
        this.l.drawColor(-1);
        this.c.draw(this.l, 0.0f, 0.0f);
        this.invalidate();
    }
    
    public void c() {
        this.c.setTime(0);
        this.h = 0;
        this.b();
        if (this.a != null) {
            this.a.c();
        }
    }
    
    public boolean d() {
        return this.f;
    }
    
    void e() {
        this.m = null;
        if (this.a != null) {
            this.a.b();
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = null;
        this.a = null;
        if (this.k != null) {
            this.k.recycle();
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        if (!this.f || this.c == null) {
            super.onDraw(canvas);
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e) {
            this.g = elapsedRealtime - this.h;
            this.e = false;
        }
        this.h = (int)(elapsedRealtime - this.g);
        if (this.h / this.d >= this.j && this.h >= this.i) {
            this.c();
            super.onDraw(canvas);
            return;
        }
        this.l.drawColor(-1);
        this.c.setTime(this.h % this.d);
        this.c.draw(this.l, 0.0f, 0.0f);
        super.onDraw(canvas);
        this.invalidate();
    }
    
    public void setEditableAnimatedGif(final EditableAnimatedGif b) {
        if (this.b != b) {
            if (this.m != null) {
                this.m.cancel(false);
                this.m = null;
            }
            this.l = null;
            this.setImageDrawable((Drawable)null);
            if (this.k != null) {
                this.k.recycle();
                this.k = null;
            }
            this.c = null;
            this.b = b;
            this.f = false;
            this.e = false;
            this.g = 0L;
            this.h = 0;
            if (b != null) {
                (this.m = new c(this, (AnimatedGifFile)b.mediaFile)).execute((Object[])new Void[0]);
            }
        }
    }
    
    public void setListener(final b a) {
        this.a = a;
    }
    
    public void setMinPlayDuration(final int i) {
        this.i = i;
    }
    
    public void setMinRepeatCount(final int j) {
        this.j = j;
    }
}
