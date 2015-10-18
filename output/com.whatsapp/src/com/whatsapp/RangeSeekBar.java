// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.graphics.Paint$Style;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.widget.ImageView;

public class RangeSeekBar extends ImageView
{
    private static final String[] C;
    public static final int r;
    public static final int s;
    private final double A;
    private final Number B;
    private final Paint a;
    private double b;
    private int c;
    private double d;
    private float e;
    private Bitmap f;
    private boolean g;
    private float h;
    private hw i;
    private Bitmap j;
    private float k;
    private Number l;
    private float m;
    private final ao4 n;
    private float o;
    private final Number p;
    private Bitmap q;
    private z4 t;
    private Bitmap u;
    private int v;
    private boolean w;
    private final double x;
    private int y;
    private RectF z;
    
    static {
        final String[] c = new String[6];
        String s2 = "Lx\u001d";
        int n = -1;
        String[] array = c;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s2.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u001c';
                        break;
                    }
                    case 0: {
                        c3 = '\u0001';
                        break;
                    }
                    case 1: {
                        c3 = '9';
                        break;
                    }
                    case 2: {
                        c3 = 'E';
                        break;
                    }
                    case 3: {
                        c3 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s2 = "Rl\u0015dN";
                    n2 = 1;
                    array = c;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s2 = "Lp\u000b";
                    n2 = 2;
                    array = c;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s2 = "Lx\u001d";
                    n2 = 3;
                    array = c;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s2 = "Rl\u0015dN";
                    n2 = 4;
                    array = c;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = c;
                    s2 = "Lp\u000b";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        C = c;
        s = App.aq.getResources().getColor(2131623942);
        r = Color.argb(102, 0, 0, 0);
    }
    
    public RangeSeekBar(final Number p4, final Number b, final Number l, final Context context) {
        super(context);
        this.a = new Paint(1);
        this.d = 0.0;
        this.b = 1.0;
        this.i = null;
        this.g = false;
        this.v = 255;
        this.z = new RectF();
        this.p = p4;
        this.B = b;
        this.l = l;
        this.A = p4.doubleValue();
        this.x = b.doubleValue();
        this.n = ao4.fromNumber(p4);
        this.setThumbResources(2130839058, 2130839058, 2130839055, 2130839055);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.a();
    }
    
    private double a(final float n) {
        final int width = this.getWidth();
        if (width <= 2.0f * this.m) {
            return 0.0;
        }
        return Math.min(1.0, Math.max(0.0, (n - this.m) / (width - 2.0f * this.m)));
    }
    
    private double a(final Number n) {
        if (0.0 == this.x - this.A) {
            return 0.0;
        }
        return (n.doubleValue() - this.A) / (this.x - this.A);
    }
    
    private float a(final double n) {
        return (float)(this.m + n * (this.getWidth() - 2.0f * this.m));
    }
    
    private final void a() {
        this.y = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
    }
    
    private void a(final float n, final boolean b, final Canvas canvas) {
        if (this.c > 0) {
            this.a.setColor(RangeSeekBar.s);
            this.a.setStrokeWidth(this.e / 2.0f);
            canvas.drawLine(n, 0.0f, n, this.c + 0.5f * (this.getHeight() - this.c - this.e), this.a);
        }
        Bitmap bitmap;
        if (b) {
            bitmap = this.j;
        }
        else {
            bitmap = this.f;
        }
        canvas.drawBitmap(bitmap, n - this.f.getWidth() / 2, (float)this.c, this.a);
    }
    
    private final void a(final MotionEvent motionEvent) {
        final int n = (0xFF00 & motionEvent.getAction()) >> 8;
        if (motionEvent.getPointerId(n) == this.v) {
            int n2;
            if (n == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            this.k = motionEvent.getX(n2);
            this.v = motionEvent.getPointerId(n2);
        }
    }
    
    private boolean a(final float n, final double n2) {
        return Math.abs(n - this.a(n2)) <= this.f.getWidth() / 2;
    }
    
    private hw b(final float n) {
        final boolean a = this.a(n, this.d);
        final boolean b = this.b(n, this.b);
        hw min;
        if (a && b) {
            if (n / this.getWidth() <= 0.5f) {
                return hw.MAX;
            }
            min = hw.MIN;
        }
        else {
            if (a) {
                return hw.MIN;
            }
            if (b) {
                return hw.MAX;
            }
            final float n2 = fcmpl(n, this.a(this.d));
            min = null;
            if (n2 > 0) {
                final float n3 = fcmpg(n, this.a(this.b));
                min = null;
                if (n3 < 0) {
                    return hw.MID;
                }
            }
        }
        return min;
    }
    
    private void b() {
        if (this.getParent() != null) {
            this.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }
    
    private void b(final float n, final boolean b, final Canvas canvas) {
        if (this.c > 0) {
            this.a.setColor(RangeSeekBar.s);
            this.a.setStrokeWidth(this.e / 2.0f);
            canvas.drawLine(n, 0.0f, n, this.c + 0.5f * (this.getHeight() - this.c - this.e), this.a);
        }
        Bitmap bitmap;
        if (b) {
            bitmap = this.u;
        }
        else {
            bitmap = this.q;
        }
        canvas.drawBitmap(bitmap, n - this.q.getWidth() / 2, (float)this.c, this.a);
    }
    
    private final void b(final MotionEvent motionEvent) {
        int n = 4;
        final boolean i = App.I;
        final int pointerIndex = motionEvent.findPointerIndex(this.v);
        final float x = motionEvent.getX(pointerIndex);
        final float y = motionEvent.getY(pointerIndex);
        Label_0408: {
            if (hw.MIN.equals(this.i)) {
                Label_0120: {
                    if (y > this.h) {
                        final double n2 = this.a(this.o) - this.a(x);
                        int n3;
                        if (y > 2.0f * this.h) {
                            n3 = n;
                        }
                        else {
                            n3 = 2;
                        }
                        this.setNormalizedMinValue(this.d - n2 / n3);
                        if (!i) {
                            break Label_0120;
                        }
                    }
                    this.setNormalizedMinValue(this.a(x));
                }
                if (this.a(this.l) <= 0.0 || this.b - this.d <= this.a(this.l)) {
                    break Label_0408;
                }
                this.setNormalizedMaxValue(this.d + this.a(this.l));
                if (!i) {
                    break Label_0408;
                }
            }
            if (hw.MAX.equals(this.i)) {
                Label_0259: {
                    if (y > this.h) {
                        final double n4 = this.a(this.o) - this.a(x);
                        if (y <= 2.0f * this.h) {
                            n = 2;
                        }
                        this.setNormalizedMaxValue(this.b - n4 / n);
                        if (!i) {
                            break Label_0259;
                        }
                    }
                    this.setNormalizedMaxValue(this.a(x));
                }
                if (this.a(this.l) <= 0.0 || this.b - this.d <= this.a(this.l)) {
                    break Label_0408;
                }
                this.setNormalizedMinValue(this.b - this.a(this.l));
                if (!i) {
                    break Label_0408;
                }
            }
            if (hw.MID.equals(this.i)) {
                final float a = this.a(this.d);
                final float a2 = this.a(this.b);
                final float n5 = this.o - x;
                final double a3 = this.a(a - n5);
                final double a4 = this.a(a2 - n5);
                if (this.c(a3) && this.b(a4)) {
                    this.setNormalizedMinValue(a3);
                    this.setNormalizedMaxValue(a4);
                }
            }
        }
        this.o = x;
    }
    
    private boolean b(final float n, final double n2) {
        return Math.abs(n - this.a(n2)) <= this.q.getWidth() / 2;
    }
    
    private Number d(final double n) {
        return this.n.toNumber(this.A + n * (this.x - this.A));
    }
    
    public boolean b(final double n) {
        return this.b != Math.max(0.0, Math.min(1.0, Math.max(n, this.d)));
    }
    
    void c() {
        this.w = false;
    }
    
    public boolean c(final double n) {
        return this.d != Math.max(0.0, Math.min(1.0, Math.min(n, this.b)));
    }
    
    public Number d() {
        return this.d(this.b);
    }
    
    void e() {
        this.w = true;
    }
    
    public Number f() {
        return this.d(this.d);
    }
    
    protected void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.a.setStyle(Paint$Style.FILL);
            this.a.setColor(RangeSeekBar.r);
            this.z.set(this.m, 0.0f, this.a(this.d), (float)this.getHeight());
            canvas.drawRect(this.z, this.a);
            this.z.set(this.a(this.b), 0.0f, this.getWidth() - this.m, this.c + 0.5f * (this.getHeight() - this.c + this.e));
            canvas.drawRect(this.z, this.a);
            this.z.set(this.m, this.c + 0.5f * (this.getHeight() - this.c - this.e), this.getWidth() - this.m, this.c + 0.5f * (this.getHeight() - this.c + this.e));
            this.a.setColor(-7829368);
            this.a.setAntiAlias(true);
            canvas.drawRect(this.z, this.a);
            this.z.left = this.a(this.d);
            this.z.right = this.a(this.b);
            this.a.setColor(RangeSeekBar.s);
            canvas.drawRect(this.z, this.a);
            this.a(this.a(this.d), hw.MIN.equals(this.i), canvas);
            this.b(this.a(this.b), hw.MAX.equals(this.i), canvas);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        while (true) {
            while (true) {
                synchronized (this) {
                    if (View$MeasureSpec.getMode(n) != 0) {
                        final int size = View$MeasureSpec.getSize(n);
                        int min = Math.max(this.f.getHeight(), this.q.getHeight()) + this.c;
                        if (View$MeasureSpec.getMode(n2) != 0) {
                            min = Math.min(min, View$MeasureSpec.getSize(n2));
                        }
                        this.setMeasuredDimension(size, min);
                        return;
                    }
                }
                final int size = 200;
                continue;
            }
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(RangeSeekBar.C[1]));
        this.d = bundle.getDouble(RangeSeekBar.C[2]);
        this.b = bundle.getDouble(RangeSeekBar.C[0]);
    }
    
    protected Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable(RangeSeekBar.C[4], super.onSaveInstanceState());
        bundle.putDouble(RangeSeekBar.C[5], this.d);
        bundle.putDouble(RangeSeekBar.C[3], this.b);
        return (Parcelable)bundle;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        if (!this.isEnabled()) {
            return false;
        }
        Label_0389: {
            switch (0xFF & motionEvent.getAction()) {
                case 0: {
                    this.v = motionEvent.getPointerId(-1 + motionEvent.getPointerCount());
                    this.k = motionEvent.getX(motionEvent.findPointerIndex(this.v));
                    this.o = this.k;
                    this.i = this.b(this.k);
                    if (this.i == null) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.setPressed(true);
                    this.invalidate();
                    this.e();
                    this.b(motionEvent);
                    this.b();
                    if (i) {
                        break Label_0389;
                    }
                    break;
                }
                case 2: {
                    if (this.i == null) {
                        break;
                    }
                    Label_0229: {
                        if (this.w) {
                            this.b(motionEvent);
                            if (!i) {
                                break Label_0229;
                            }
                        }
                        if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.v)) - this.k) > this.y) {
                            this.setPressed(true);
                            this.invalidate();
                            this.e();
                            this.b(motionEvent);
                            this.b();
                        }
                    }
                    if (!this.g || this.t == null) {
                        break;
                    }
                    this.t.a(this, this.f(), this.d(), true);
                    if (i) {
                        break Label_0389;
                    }
                    break;
                }
                case 1: {
                    Label_0304: {
                        if (this.w) {
                            this.b(motionEvent);
                            this.c();
                            this.setPressed(false);
                            if (!i) {
                                break Label_0304;
                            }
                        }
                        this.e();
                        this.b(motionEvent);
                        this.c();
                    }
                    this.i = null;
                    this.invalidate();
                    if (this.t == null) {
                        break;
                    }
                    this.t.a(this, this.f(), this.d(), false);
                    if (i) {
                        break Label_0389;
                    }
                    break;
                }
                case 5: {
                    final int n = -1 + motionEvent.getPointerCount();
                    this.k = motionEvent.getX(n);
                    this.v = motionEvent.getPointerId(n);
                    this.invalidate();
                    if (i) {
                        break Label_0389;
                    }
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    this.invalidate();
                    if (i) {
                        break Label_0389;
                    }
                    break;
                }
                case 3: {
                    if (this.w) {
                        this.c();
                        this.setPressed(false);
                    }
                    this.invalidate();
                    break;
                }
            }
        }
        return true;
    }
    
    public void setNormalizedMaxValue(final double n) {
        this.b = Math.max(0.0, Math.min(1.0, Math.max(n, this.d)));
        this.invalidate();
    }
    
    public void setNormalizedMinValue(final double n) {
        this.d = Math.max(0.0, Math.min(1.0, Math.min(n, this.b)));
        this.invalidate();
    }
    
    public void setNotifyWhileDragging(final boolean g) {
        this.g = g;
    }
    
    public void setOnRangeSeekBarChangeListener(final z4 t) {
        this.t = t;
    }
    
    public void setSelectedMaxValue(final Number n) {
        if (0.0 == this.x - this.A) {
            this.setNormalizedMaxValue(1.0);
            if (!App.I) {
                return;
            }
        }
        this.setNormalizedMaxValue(this.a(n));
    }
    
    public void setSlowScrubStep(final float h) {
        this.h = h;
    }
    
    public void setThumbResources(final int n, final int n2, final int n3, final int n4) {
        this.f = BitmapFactory.decodeResource(this.getResources(), n);
        this.j = BitmapFactory.decodeResource(this.getResources(), n2);
        this.q = BitmapFactory.decodeResource(this.getResources(), n3);
        this.u = BitmapFactory.decodeResource(this.getResources(), n4);
        this.e = 0.15f * this.f.getHeight();
        this.m = 0.5f * this.f.getWidth();
    }
    
    public void setTopExtension(final int c) {
        this.c = c;
    }
}
