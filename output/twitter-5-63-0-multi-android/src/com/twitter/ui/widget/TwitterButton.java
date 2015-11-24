// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.widget.TextView$BufferType;
import android.view.MotionEvent;
import android.view.View;
import android.annotation.TargetApi;
import android.view.View$MeasureSpec;
import android.graphics.Paint$Align;
import android.graphics.Canvas;
import com.twitter.util.b;
import android.graphics.Matrix;
import android.content.res.Resources$NotFoundException;
import android.graphics.BitmapFactory;
import android.graphics.Paint$Style;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import java.util.Arrays;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View$OnTouchListener;
import android.widget.Button;

public class TwitterButton extends Button implements View$OnTouchListener
{
    private static final SparseIntArray a;
    private static final int[] b;
    private float A;
    private float B;
    private final Rect C;
    private int D;
    private Bitmap E;
    private String F;
    private int G;
    private int H;
    private Paint I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private float Q;
    private float R;
    private int S;
    private final Rect c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private RectF s;
    private Paint t;
    private int u;
    private int v;
    private TextPaint w;
    private Rect x;
    private boolean y;
    private int z;
    
    static {
        a = new SparseIntArray();
        b = new int[] { 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 42, 44, 48, 52, 56, 60, 64, 68, 72, 80, 84, 90, 96, 102, 112, 120, 128, 136 };
    }
    
    public TwitterButton(final Context context) {
        this(context, null);
    }
    
    public TwitterButton(final Context context, final AttributeSet set) {
        this(context, set, jk.buttonStyle);
    }
    
    public TwitterButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new Rect();
        this.e = true;
        this.q = false;
        this.r = false;
        this.s = new RectF();
        this.t = new Paint(1);
        this.w = new TextPaint(129);
        this.x = new Rect();
        this.C = new Rect();
        this.I = new Paint(1);
        this.J = 0;
        this.K = 0;
        this.N = false;
        this.a(context, set, n, 0);
    }
    
    public TwitterButton(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n);
        this.c = new Rect();
        this.e = true;
        this.q = false;
        this.r = false;
        this.s = new RectF();
        this.t = new Paint(1);
        this.w = new TextPaint(129);
        this.x = new Rect();
        this.C = new Rect();
        this.I = new Paint(1);
        this.J = 0;
        this.K = 0;
        this.N = false;
        this.a(context, set, n, n2);
    }
    
    private static int a(final int n) {
        final int length = TwitterButton.b.length;
        if (n < TwitterButton.b[0] || n > TwitterButton.b[length - 1]) {
            return 0;
        }
        int binarySearch = Arrays.binarySearch(TwitterButton.b, n);
        if (binarySearch < 0) {
            binarySearch = -1 + ~binarySearch;
        }
        return TwitterButton.b[binarySearch];
    }
    
    private int a(final int n, final double n2) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[2] *= (float)(1.0 + n2);
        return Color.HSVToColor(array);
    }
    
    private Paint a(final Paint paint, final int n) {
        paint.setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_IN));
        return paint;
    }
    
    private void a(final Context context, final AttributeSet set, final int n, final int n2) {
        final float density = this.getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, jt.TwitterButton, n, n2);
        this.f = obtainStyledAttributes.getColor(jt.TwitterButton_fillColor, 0);
        this.g = obtainStyledAttributes.getColor(jt.TwitterButton_fillPressedColor, this.b(this.f));
        this.h = obtainStyledAttributes.getColor(jt.TwitterButton_strokeColor, 0);
        this.i = obtainStyledAttributes.getColor(jt.TwitterButton_strokePressedColor, this.h);
        this.k = obtainStyledAttributes.getDimensionPixelSize(jt.TwitterButton_cornerRadius, 0);
        this.t.setStrokeWidth(density);
        this.p = obtainStyledAttributes.getBoolean(jt.TwitterButton_bounded, !this.a());
        if (this.p) {
            this.t.setColor(this.h);
        }
        else {
            this.t.setColor(this.f);
        }
        this.o = this.getResources().getDisplayMetrics().density;
        this.n *= (int)density;
        this.u = obtainStyledAttributes.getColor(jt.TwitterButton_labelColor, 0);
        this.v = obtainStyledAttributes.getColor(jt.TwitterButton_labelPressedColor, this.u);
        this.z = obtainStyledAttributes.getDimensionPixelSize(jt.TwitterButton_labelMargin, 0);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getContext());
        int int1;
        if (!this.isInEditMode()) {
            int1 = Integer.parseInt(defaultSharedPreferences.getString("font_size", "16"));
        }
        else {
            int1 = 16;
        }
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, new int[] { 16842901, 16843093 }, n, n2);
        final int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
        obtainStyledAttributes2.recycle();
        this.w.setTextSize((float)dimensionPixelSize);
        this.w.setColor(this.u);
        if (!this.isInEditMode()) {
            this.w.setTypeface(ag.a(context).c);
        }
        else {
            this.w.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        final float n3 = density * (int1 - 16);
        this.w.setTextSize(n3 + dimensionPixelSize);
        this.m += (int)n3;
        this.D = obtainStyledAttributes.getDimensionPixelSize(jt.TwitterButton_iconAndLabelMargin, 0);
        this.M = obtainStyledAttributes.getBoolean(jt.TwitterButton_iconCanBeFlipped, true);
        this.G = obtainStyledAttributes.getColor(jt.TwitterButton_iconColor, 0);
        this.H = obtainStyledAttributes.getColor(jt.TwitterButton_iconPressedColor, this.G);
        this.S = obtainStyledAttributes.getDimensionPixelSize(jt.TwitterButton_iconMargin, 0);
        this.setIconLayout(obtainStyledAttributes.getInt(jt.TwitterButton_iconLayout, 0));
        this.F = obtainStyledAttributes.getString(jt.TwitterButton_nodpiBaseIconName);
        this.O = (this.F != null);
        if (this.O) {
            final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(jt.TwitterButton_iconSize, 0);
            this.E = this.c(dimensionPixelSize2);
            this.O = (this.E != null);
            if (this.O && int1 != 16) {
                this.L = (int)(4.0 * Math.ceil((int1 - 16) / 2));
                this.E = this.c(dimensionPixelSize2);
                this.O = (this.E != null);
            }
            if (this.O) {
                this.J = this.E.getWidth();
                this.K = this.E.getHeight();
            }
        }
        this.setOnTouchListener((View$OnTouchListener)this);
        this.r = true;
        if (!this.isEnabled()) {
            this.setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }
    
    private boolean a() {
        return this.f != -1 && this.f != 0;
    }
    
    private int b(final int n) {
        if (Color.alpha(n) < 255) {
            return Color.argb(77 + Color.alpha(n), Color.red(n), Color.green(n), Color.blue(n));
        }
        this.a(n, -0.3);
        return n;
    }
    
    private void b() {
        if (this.q) {
            this.j = this.i;
            this.t.setColor(this.g);
            this.w.setColor(this.v);
            this.a(this.I, this.H);
        }
        else {
            this.j = this.h;
            this.t.setColor(this.f);
            this.w.setColor(this.u);
            this.a(this.I, this.G);
        }
        this.t.setStyle(Paint$Style.FILL);
    }
    
    private Bitmap c(final int n) {
        if (this.F != null) {
            final int n2 = n + this.L;
            int n3 = TwitterButton.a.get(n2);
            if (n3 == 0) {
                n3 = a(n2);
                if (n3 == 0) {
                    return null;
                }
                TwitterButton.a.put(n2, n3);
            }
            final int identifier = this.getResources().getIdentifier(this.F + "_" + n3 + "h", "drawable", this.getContext().getPackageName());
            Bitmap decodeResource;
            if (identifier == 0) {
                decodeResource = null;
            }
            else {
                try {
                    decodeResource = BitmapFactory.decodeResource(this.getResources(), identifier);
                }
                catch (Resources$NotFoundException ex) {
                    return null;
                }
            }
            return decodeResource;
        }
        return null;
    }
    
    private void c() {
        if (!this.M || this.E == null) {
            return;
        }
        final Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        final Bitmap e = this.E;
        this.E = Bitmap.createBitmap(e, 0, 0, e.getWidth(), e.getHeight(), matrix, false);
        final boolean n = this.N;
        boolean n2 = false;
        if (!n) {
            n2 = true;
        }
        this.N = n2;
    }
    
    private void setIconLayout(final int n) {
        boolean b = true;
        switch (n) {
            default: {
                if (com.twitter.util.b.a(this.getContext())) {
                    b = false;
                }
                this.P = b;
            }
            case 2: {
                this.P = b;
            }
            case 3: {
                this.P = false;
            }
            case 1: {
                this.P = com.twitter.util.b.a(this.getContext());
            }
        }
    }
    
    public void draw(final Canvas canvas) {
        final int k = this.k;
        this.b();
        if (this.a() || this.p) {
            canvas.drawRoundRect(this.s, (float)k, (float)k, this.t);
            if (this.p) {
                this.t.setColor(this.j);
                this.t.setStyle(Paint$Style.STROKE);
                canvas.drawRoundRect(this.s, (float)k, (float)k, this.t);
            }
        }
        if (this.O) {
            canvas.drawBitmap(this.E, this.Q, this.R, this.I);
        }
        if (this.y) {
            canvas.drawText(this.getText().toString(), this.A, this.B, (Paint)this.w);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int l = this.l;
        final int m = this.m;
        final boolean p5 = this.P;
        if (this.p && !this.q) {
            this.s.inset(this.o / 2.0f, this.o / 2.0f);
        }
        if (!this.y && this.O) {
            this.Q = (l - this.E.getWidth()) / 2.0f;
        }
        else if (p5) {
            this.Q = this.S;
            if (this.N) {
                this.c();
            }
        }
        else {
            this.Q = l - this.S - this.J;
            if (!this.N) {
                this.c();
            }
        }
        if (this.O) {
            if (p5) {
                this.w.setTextAlign(Paint$Align.LEFT);
                this.A = this.S + this.J + this.D - this.x.left;
            }
            else {
                this.w.setTextAlign(Paint$Align.RIGHT);
                this.A = l - this.S - this.J - this.D;
            }
        }
        else {
            this.A = l / 2.0f - this.x.left + (this.w.measureText(this.getText().toString()) - this.x.width()) / 2.0f;
        }
        this.w.getTextBounds("X", 0, 1, this.C);
        this.B = m / 2.0f + this.C.height() / 2;
        this.R = m / 2.0f - (this.K + this.L) / 2.0f;
        if (!this.e && this.O && this.y) {
            final int n5 = (l - this.d) / 2;
            this.A += n5;
            this.Q += n5;
        }
    }
    
    @TargetApi(16)
    protected void onMeasure(final int n, final int n2) {
        final String string = this.getText().toString();
        final int m = this.m;
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        this.y = (string != null && string.length() > 0);
        this.w.getTextBounds(string, 0, string.length(), this.x);
        final int width = this.x.width();
        int d;
        if (this.y && this.O) {
            d = width + (this.S + this.J + this.D) + this.z;
        }
        else if (this.y) {
            this.w.setTextAlign(Paint$Align.CENTER);
            d = width + this.z + this.z;
        }
        else if (this.O) {
            d = this.S + this.J + this.S;
        }
        else {
            d = 0;
        }
        this.d = d;
        int min;
        if (mode == 1073741824) {
            this.e = false;
            min = size;
        }
        else if (mode == Integer.MIN_VALUE) {
            min = Math.min(d, size);
        }
        else {
            min = d;
        }
        int min2;
        if (mode2 == 1073741824) {
            min2 = size2;
        }
        else if (mode2 == Integer.MIN_VALUE) {
            min2 = Math.min(m, size2);
        }
        else {
            min2 = m;
        }
        this.s.set(0.0f, 0.0f, (float)min, (float)min2);
        this.setMeasuredDimension(min, min2);
        this.l = min;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        boolean b = true;
        switch (motionEvent.getActionMasked()) {
            case 0: {
                this.q = b;
                this.invalidate();
                break;
            }
            case 1:
            case 3: {
                this.q = false;
                this.invalidate();
                break;
            }
            case 2: {
                view.getHitRect(this.c);
                if (((this.c.contains(view.getLeft() + (int)motionEvent.getX(), view.getTop() + (int)motionEvent.getY()) || !b) && b) ^ this.q) {
                    if (this.q) {
                        b = false;
                    }
                    this.q = b;
                    this.invalidate();
                    break;
                }
                break;
            }
        }
        this.b();
        return false;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (this.r) {
            float alpha;
            if (enabled) {
                alpha = 1.0f;
            }
            else {
                alpha = 0.6f;
            }
            this.setAlpha(alpha);
            this.invalidate();
        }
    }
    
    public void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        super.setText(charSequence, textView$BufferType);
        this.requestLayout();
        this.invalidate();
    }
}
