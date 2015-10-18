// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.support.annotation.NonNull;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.os.SystemClock;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar
{
    private static final String z;
    private int a;
    private boolean b;
    private float c;
    private Paint d;
    private int e;
    private String f;
    private RectF g;
    private float h;
    private float i;
    private float j;
    private long k;
    private float l;
    private float m;
    
    static {
        final char[] charArray = "yd<\u000e'y` \u0014l'i;\u001ab~".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\n';
                    break;
                }
                case 0: {
                    c2 = '\n';
                    break;
                }
                case 1: {
                    c2 = '\u0005';
                    break;
                }
                case 2: {
                    c2 = 'R';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public CircularProgressBar(final Context context) {
        super(context);
        this.g = new RectF();
        this.d = new Paint();
        this.a = -13388315;
        this.e = -1711276033;
        this.f = null;
        this.l = 5.0f;
        this.b = false;
        this.a(context, null);
    }
    
    public CircularProgressBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new RectF();
        this.d = new Paint();
        this.a = -13388315;
        this.e = -1711276033;
        this.f = null;
        this.l = 5.0f;
        this.b = false;
        this.a(context, set);
    }
    
    public CircularProgressBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g = new RectF();
        this.d = new Paint();
        this.a = -13388315;
        this.e = -1711276033;
        this.f = null;
        this.l = 5.0f;
        this.b = false;
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aqy.CircularProgressBar);
            this.a = obtainStyledAttributes.getInteger(0, this.a);
            this.e = obtainStyledAttributes.getInteger(1, this.e);
            this.l = obtainStyledAttributes.getFloat(2, this.l);
            obtainStyledAttributes.recycle();
        }
    }
    
    private void a(final Canvas canvas) {
        final boolean i = App.I;
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.k == 0L) {
            this.k = uptimeMillis;
        }
        float n = 1.0f * ((uptimeMillis - this.k) % 1333L) / 1333.0f;
        Label_0114: {
            if (n < 0.5f) {
                final float n2 = (float)Math.sin(3.141592653589793 * n);
                n = n2 * (n2 * (n2 * n2)) / 2.0f;
                if (!i) {
                    break Label_0114;
                }
            }
            final float n3 = (float)Math.sin(3.141592653589793 * (n - 0.5f));
            n = 0.5f + n3 * (n3 * (n3 * n3)) / 2.0f;
        }
        Label_0192: {
            if (n < 0.5f) {
                this.j = 280.0f * (n * 2.0f);
                this.m = -1.0f;
                if (!i) {
                    break Label_0192;
                }
            }
            if (this.m < 0.0f) {
                this.m = this.c;
            }
            this.j = 280.0f * (2.0f * (1.0f - n));
            this.c = this.m + 280.0f * (2.0f * (n - 0.5f));
        }
        canvas.rotate(360.0f * (1.0f * ((uptimeMillis - this.k) % 2200L) / 2200.0f), (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.d.setAntiAlias(true);
        if (this.e != 0) {
            this.d.setColor(this.e);
            this.d.setStyle(Paint$Style.STROKE);
            canvas.drawArc(this.g, 0.0f, 360.0f, false, this.d);
        }
        this.d.setColor(this.a);
        this.d.setStyle(Paint$Style.STROKE);
        this.d.setStrokeWidth(this.i / this.l);
        this.d.setStrokeCap(Paint$Cap.ROUND);
        canvas.drawArc(this.g, this.c, this.j, false, this.d);
    }
    
    protected void onDraw(@NonNull final Canvas canvas) {
        if (this.isIndeterminate()) {
            this.a(canvas);
            this.invalidate();
            if (!App.I) {
                return;
            }
        }
        this.d.setAntiAlias(true);
        this.d.setStyle(Paint$Style.STROKE);
        this.d.setStrokeWidth(this.i / this.l);
        this.d.setColor(this.e);
        canvas.drawArc(this.g, 270.0f + 360.0f * this.getProgress() / this.getMax(), 360.0f - 360.0f * this.getProgress() / this.getMax(), false, this.d);
        this.d.setColor(this.a);
        canvas.drawArc(this.g, -90.0f, 360.0f * this.getProgress() / this.getMax(), false, this.d);
        if (this.b) {
            this.d.setColor(this.e);
            this.d.setStyle(Paint$Style.FILL);
            final float n = this.getProgress() * (float)(6.283185307179586 / this.getMax());
            canvas.drawCircle((float)(this.g.centerX() + this.i * Math.sin(n)), (float)(this.g.centerY() - this.i * Math.cos(n)), 10.0f, this.d);
        }
        if (this.f != null) {
            this.d.setColor(-9408400);
            this.d.setTextSize(this.h);
            this.d.setTextAlign(Paint$Align.CENTER);
            this.d.setTypeface(Typeface.create(CircularProgressBar.z, 0));
            final Rect rect = new Rect();
            this.d.getTextBounds(this.f, 0, this.f.length(), rect);
            this.d.setStyle(Paint$Style.FILL);
            canvas.drawText(this.f, 0, this.f.length(), this.g.centerX(), this.g.centerY() + 0.5f * rect.height(), this.d);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.i = Math.min(n - this.getPaddingLeft() - this.getPaddingRight(), n2 - this.getPaddingTop() - this.getPaddingBottom()) / 2.0f;
        this.i -= 0.3f * this.i;
        this.g.set(n / 2 - this.i, n2 / 2 - this.i, n / 2 + this.i, n2 / 2 + this.i);
    }
    
    public void setCenterText(final String f) {
        this.f = f;
        this.h = 30.0f * vc.b().b;
    }
    
    public void setKnobEnabled(final boolean b) {
        this.b = b;
    }
    
    public void setPaintStrokeFactor(final float l) {
        this.l = l;
    }
    
    public void setProgressBarBackgroundColor(final int e) {
        this.e = e;
    }
    
    public void setProgressBarColor(final int a) {
        this.a = a;
    }
}
