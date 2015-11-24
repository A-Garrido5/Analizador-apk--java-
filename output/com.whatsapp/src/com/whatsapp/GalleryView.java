// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnLongClickListener;
import android.view.View$MeasureSpec;
import com.whatsapp.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Paint$Style;
import android.view.ViewConfiguration;
import android.graphics.Bitmap$Config;
import android.view.GestureDetector$OnGestureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Paint;
import android.widget.Scroller;
import android.view.animation.Interpolator;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.ViewGroup;

public class GalleryView extends ViewGroup implements GestureDetector$OnDoubleTapListener
{
    private static final String[] G;
    private static Interpolator z;
    public Scroller A;
    private int B;
    private boolean C;
    private int D;
    private int E;
    private float F;
    private float a;
    private int b;
    private Paint c;
    private RectF d;
    private boolean e;
    private RectF f;
    private int g;
    private awc h;
    private Bitmap i;
    private Paint j;
    private GestureDetector k;
    Bitmap l;
    private int m;
    private int n;
    private aoy o;
    boolean p;
    private int q;
    private float r;
    private Canvas s;
    private int t;
    private VelocityTracker u;
    private boolean v;
    private int w;
    private Paint x;
    private int y;
    
    static {
        final String[] g = new String[9];
        String s = "\u00026cay\u0017.\"{u\u0000  bs\bm";
        int n = -1;
        String[] array = g;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00044{ds\u000b\b\u007fbu\u000b#j\u007fC\u00018xc";
                    n2 = 1;
                    array = g;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ",9{hn\u00062\u007fyy\u0001wn-h\n\"le<\u0000!jchEz/XL";
                    n2 = 2;
                    array = g;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00044fys\u000bw\u007fbn\f9{hnE3`zr";
                    n2 = 3;
                    array = g;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u00066zjt\u0011wn-\u007f\u00049lhpE#`x\u007f\rwj{y\u000b#";
                    n2 = 4;
                    array = g;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = g;
                    s = "#\u0011>4-\\f6";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u00026cay\u0017.ydy\u0012x`cq\u00006|xn\u0000x/zu\u0001#g@y\u0004$z\u007fy6'jn&";
                    n = 5;
                    array = g;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u00026cay\u0017.ydy\u0012x`cq\u00006|xn\u0000x/ey\f0gyQ\u00006|xn\u0000\u0004\u007fh\u007f_";
                    n = 6;
                    array = g;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u00026cay\u0017.P{u\u0000  cs:4z\u007fn\u00009{Rj\f2x\"";
                    n = 7;
                    array = g;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        G = g;
        GalleryView.z = (Interpolator)new _i();
    }
    
    public GalleryView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public GalleryView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.m = -1;
        this.n = -1;
        this.B = 0;
        this.t = 0;
        this.a();
        (this.k = new GestureDetector((GestureDetector$OnGestureListener)new m9(this))).setOnDoubleTapListener((GestureDetector$OnDoubleTapListener)this);
    }
    
    static int a(final GalleryView galleryView) {
        return galleryView.q;
    }
    
    static Bitmap a(Bitmap bitmap, final int n, final int n2, final Context context) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        if (width < n || height < n2) {
            final int intValue = Integer.valueOf(GalleryView.G[5], 16);
            int n3;
            if (width < n) {
                n3 = n;
            }
            else {
                n3 = width;
            }
            int n4;
            if (height < n2) {
                n4 = n2;
            }
            else {
                n4 = height;
            }
            final Bitmap bitmap2 = Bitmap.createBitmap(n3, n4, Bitmap$Config.RGB_565);
            final Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(intValue);
            canvas.drawBitmap(bitmap, (n - width) / 2.0f, (n2 - height) / 2.0f, (Paint)null);
            bitmap = bitmap2;
        }
        return bitmap;
    }
    
    private void a() {
        this.A = new Scroller(this.getContext(), GalleryView.z);
        this.q = this.t;
        (this.j = new Paint()).setDither(false);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.g = value.getScaledTouchSlop();
        this.w = value.getScaledMaximumFlingVelocity();
        (this.x = new Paint()).setColor(-65536);
        this.x.setStyle(Paint$Style.FILL_AND_STROKE);
        (this.c = new Paint()).setColor(-7829368);
        this.c.setStyle(Paint$Style.FILL);
    }
    
    private void a(final int n, final boolean b) {
        boolean b2;
        if (n != this.q) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.n = n;
        final View focusedChild = this.getFocusedChild();
        if (focusedChild != null && b2 && focusedChild == this.getChildAt(this.q)) {
            focusedChild.clearFocus();
        }
        final int n2 = n * this.getWidth() - this.getScrollX();
        final Scroller a = this.A;
        final int scrollX = this.getScrollX();
        int n3;
        if (b) {
            n3 = 0;
        }
        else {
            n3 = 2 * Math.abs(n2);
        }
        a.startScroll(scrollX, 0, n2, 0, n3);
        if (this.h != null) {
            this.h.a(n);
        }
        this.invalidate();
    }
    
    private void a(final MotionEvent motionEvent) {
        final boolean i = App.I;
        final int pointerIndex = motionEvent.findPointerIndex(this.m);
        if (pointerIndex != -1) {
            final float x = motionEvent.getX(pointerIndex);
            final int n = (int)(this.r - x);
            this.r = x;
            if (this.h != null) {
                this.h.a();
            }
            if (n >= 0) {
                if (n > 0) {
                    final int n2 = this.getChildAt(-1 + this.getChildCount()).getRight() - this.getScrollX() - this.getWidth();
                    Label_0155: {
                        if (n2 > 0) {
                            this.scrollBy(Math.min(n2, n), 0);
                            if (!i) {
                                break Label_0155;
                            }
                        }
                        if (this.h != null) {}
                    }
                    if (!i) {
                        return;
                    }
                }
                this.awakenScrollBars();
                return;
            }
            if (this.getScrollX() > 0) {
                this.scrollBy(Math.max(-this.getScrollX(), n), 0);
                if (!i) {
                    return;
                }
            }
            if (this.h != null) {
                return;
            }
        }
    }
    
    static int b(final GalleryView galleryView) {
        return galleryView.B;
    }
    
    private void b() {
        if (!this.C) {
            return;
        }
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        this.f = new RectF(0.0f, 0.0f, (float)measuredWidth, (float)(measuredHeight * 2 / 100));
        final int n = this.getScrollX() / this.getChildCount();
        this.d = new RectF((float)n, 0.0f, (float)(n + measuredWidth / this.getChildCount()), (float)(measuredHeight * 2 / 100));
        final int n2 = measuredHeight * 2;
        try {
            this.l = Bitmap.createBitmap(measuredWidth, n2 / 100, Bitmap$Config.ARGB_8888);
            (this.s = new Canvas(this.l)).drawRoundRect(this.f, 0.0f, 0.0f, this.c);
            this.s.drawRoundRect(this.d, 5.0f, 5.0f, this.x);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Log.e(GalleryView.G[0] + outOfMemoryError);
        }
    }
    
    private void b(final MotionEvent motionEvent) {
        final int n = (0xFF00 & motionEvent.getAction()) >> 8;
        if (motionEvent.getPointerId(n) == this.m) {
            int n2;
            if (n == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            this.r = motionEvent.getX(n2);
            this.a = motionEvent.getY(n2);
            this.m = motionEvent.getPointerId(n2);
            if (this.u != null) {
                this.u.clear();
            }
        }
    }
    
    private void c(final MotionEvent motionEvent) {
        final int pointerIndex = motionEvent.findPointerIndex(this.m);
        if (pointerIndex != -1) {
            final float x = motionEvent.getX(pointerIndex);
            final float y = motionEvent.getY(pointerIndex);
            final int n = (int)Math.abs(x - this.r);
            final int n2 = (int)Math.abs(y - this.a);
            boolean b;
            if (n > this.g) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if (n2 > this.g) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b || b2) {
                if (b && !b2) {
                    this.B = 1;
                    this.r = x;
                }
                if (this.e) {
                    this.e = false;
                    final View child = this.getChildAt(this.q);
                    if (child != null) {
                        child.cancelLongPress();
                    }
                }
            }
        }
    }
    
    private void d() {
        final int width = this.getWidth();
        this.a((this.getScrollX() + width / 2) / width);
    }
    
    public void a(final int n) {
        this.a(n, false);
    }
    
    public int c() {
        return this.q;
    }
    
    public void computeScroll() {
        if (this.A.computeScrollOffset()) {
            this.scrollTo(this.A.getCurrX(), this.A.getCurrY());
            this.postInvalidate();
            if (!App.I) {
                return;
            }
        }
        if (this.n != -1) {
            this.q = Math.max(0, Math.min(this.n, -1 + this.getChildCount()));
            this.n = -1;
        }
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        final boolean i = App.I;
        if (this.i != null) {
            float n = this.getScrollX() * this.F;
            if (n + this.D < this.getRight() - this.getLeft()) {
                n = this.getRight() - this.getLeft() - this.D;
            }
            canvas.drawBitmap(this.i, n, (float)((this.getBottom() - this.getTop() - this.E) / 2), this.j);
        }
        int n2;
        if (this.B != 1 && this.n == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Label_0308: {
            if (n2 != 0) {
                final View child = this.getChildAt(this.q);
                Label_0191: {
                    if (child != null) {
                        this.drawChild(canvas, child, this.getDrawingTime());
                        if (!i) {
                            break Label_0191;
                        }
                    }
                    Log.e(GalleryView.G[8] + this.q);
                    if (this.h != null) {
                        this.h.b();
                    }
                }
                if (!i) {
                    break Label_0308;
                }
            }
            final long drawingTime = this.getDrawingTime();
            if (this.n >= 0 && this.n < this.getChildCount() && Math.abs(this.q - this.n) == 1) {
                this.drawChild(canvas, this.getChildAt(this.q), drawingTime);
                this.drawChild(canvas, this.getChildAt(this.n), drawingTime);
                if (!i) {
                    break Label_0308;
                }
            }
            final int childCount = this.getChildCount();
            int j = 0;
            while (j < childCount) {
                this.drawChild(canvas, this.getChildAt(j), drawingTime);
                ++j;
                if (i) {
                    break;
                }
            }
        }
        if (this.C) {
            this.b();
            canvas.drawBitmap(this.l, (float)this.getScrollX(), (float)(98 * this.getMeasuredHeight() / 100), this.j);
        }
    }
    
    public boolean dispatchUnhandledMove(final View view, final int n) {
        if (n == 17) {
            if (this.c() > 0) {
                this.a(-1 + this.c());
                return true;
            }
        }
        else if (n == 66 && this.c() < -1 + this.getChildCount()) {
            this.a(1 + this.c());
            return true;
        }
        return super.dispatchUnhandledMove(view, n);
    }
    
    public boolean onDoubleTap(final MotionEvent motionEvent) {
        if (this.h != null) {
            this.h.c();
        }
        return false;
    }
    
    public boolean onDoubleTapEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        if (!this.p) {
            final int action = motionEvent.getAction();
            if (action != 2 || this.B == 0) {
                if (this.u == null) {
                    this.u = VelocityTracker.obtain();
                }
                this.u.addMovement(motionEvent);
                if (this.getChildAt(this.q) instanceof TouchImageView && motionEvent.getPointerCount() > 1 && !((TouchImageView)this.getChildAt(this.q)).s && !((TouchImageView)this.getChildAt(this.q)).A) {
                    ((TouchImageView)this.getChildAt(this.q)).B = true;
                    TouchImageView.v = 1;
                    this.p = true;
                }
                Label_0338: {
                    switch (action) {
                        case 2: {
                            if (TouchImageView.v == 1) {
                                if (this.h == null) {
                                    break;
                                }
                                this.h.a(motionEvent);
                                if (!i) {
                                    break;
                                }
                            }
                            this.c(motionEvent);
                            if (i) {
                                break Label_0338;
                            }
                            break;
                        }
                        case 0: {
                            final float x = motionEvent.getX();
                            final float y = motionEvent.getY();
                            this.r = x;
                            this.a = y;
                            this.e = true;
                            this.m = motionEvent.getPointerId(0);
                            int b;
                            if (this.A.isFinished()) {
                                b = 0;
                            }
                            else {
                                b = 1;
                            }
                            this.B = b;
                            if (i) {
                                break Label_0338;
                            }
                            break;
                        }
                        case 1:
                        case 3: {
                            Log.w(GalleryView.G[2]);
                            this.m = -1;
                            this.e = false;
                            if (this.u != null) {
                                this.u.recycle();
                                this.u = null;
                            }
                            this.B = 0;
                            if (i) {
                                break Label_0338;
                            }
                            break;
                        }
                        case 6: {
                            this.b(motionEvent);
                            if (i) {
                                break Label_0338;
                            }
                            break;
                        }
                        case 5: {
                            Log.e(GalleryView.G[1]);
                            break;
                        }
                    }
                }
                if (this.B == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean i = App.I;
        final int childCount = this.getChildCount();
        int j = 0;
        int n5 = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final int measuredWidth = child.getMeasuredWidth();
                child.layout(n5, 0, n5 + measuredWidth, child.getMeasuredHeight());
                n5 += measuredWidth;
            }
            ++j;
            if (i) {
                break;
            }
        }
        if (this.o != null) {
            this.o.a();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final boolean i = App.I;
        super.onMeasure(n, n2);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        if (View$MeasureSpec.getMode(n) != 1073741824 && n != 0) {
            Log.e(GalleryView.G[6] + n);
        }
        final int mode = View$MeasureSpec.getMode(n2);
        if (mode != 1073741824 && n2 != 0) {
            Log.e(GalleryView.G[7] + n2);
        }
        final int childCount = this.getChildCount();
        int n4;
        for (int j = 0; j < childCount; j = n4) {
            int n3;
            if (this.C) {
                n3 = 98;
            }
            else {
                n3 = 100;
            }
            this.getChildAt(j).measure(n, View$MeasureSpec.makeMeasureSpec(n3 * size2 / 100, mode));
            n4 = j + 1;
            if (i) {
                break;
            }
        }
        if (this.v) {
            this.v = false;
            this.i = a(this.i, size, size2, this.getContext());
            this.D = this.i.getWidth();
            this.E = this.i.getHeight();
        }
        float f;
        if (this.D > size) {
            f = (childCount * size - this.D) / ((childCount - 1) * size);
        }
        else {
            f = 1.0f;
        }
        this.F = f;
        if (this.b != size) {
            this.b = size;
            this.scrollTo(size * this.q, 0);
            this.setScreenWidth(size);
        }
        this.b();
        this.invalidate();
    }
    
    public boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        if (this.h != null) {
            this.h.b(0);
        }
        return false;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        this.k.onTouchEvent(motionEvent);
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        final int action = motionEvent.getAction();
        final float x = motionEvent.getX();
        Label_0440: {
            switch (action) {
                case 0: {
                    if (this.p) {
                        if (this.h != null) {
                            this.h.a(motionEvent);
                            return true;
                        }
                        break;
                    }
                    else {
                        if (this.B == 0) {
                            break;
                        }
                        if (!this.A.isFinished()) {
                            this.A.abortAnimation();
                        }
                        this.r = x;
                        this.m = motionEvent.getPointerId(0);
                        if (i) {
                            break Label_0440;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.p) {
                        if (this.h != null) {
                            this.h.a(motionEvent);
                            return true;
                        }
                        break;
                    }
                    else {
                        if (this.B == 1) {
                            this.a(motionEvent);
                            if (!i) {
                                break;
                            }
                        }
                        if (!this.onInterceptTouchEvent(motionEvent) || this.B != 1) {
                            break;
                        }
                        this.a(motionEvent);
                        if (i) {
                            break Label_0440;
                        }
                        break;
                    }
                    break;
                }
                case 1: {
                    System.currentTimeMillis();
                    if (this.h != null) {}
                    final VelocityTracker u = this.u;
                    u.computeCurrentVelocity(1000, (float)this.w);
                    final int n = (int)u.getXVelocity();
                    if (this.B == 1 && !this.p) {
                        Label_0352: {
                            if (n > 250 && this.q > 0) {
                                this.a(-1 + this.q);
                                if (!i) {
                                    break Label_0352;
                                }
                            }
                            if (n < -250 && this.q < -1 + this.getChildCount()) {
                                this.a(1 + this.q);
                                if (!i) {
                                    break Label_0352;
                                }
                            }
                            this.d();
                        }
                        if (this.u != null) {
                            this.u.recycle();
                            this.u = null;
                        }
                    }
                    this.B = 0;
                    this.m = -1;
                    if (i) {
                        break Label_0440;
                    }
                    break;
                }
                case 3: {
                    if (this.p) {
                        break;
                    }
                    Log.w(GalleryView.G[4]);
                    this.B = 0;
                    this.m = -1;
                    if (i) {
                        break Label_0440;
                    }
                    break;
                }
                case 6: {
                    if (this.p) {
                        break;
                    }
                    TouchImageView.v = 2;
                    TouchImageView.o = -1.0f;
                    this.b(motionEvent);
                    if (i) {
                        break Label_0440;
                    }
                    break;
                }
                case 5: {
                    Log.e(GalleryView.G[3]);
                    return true;
                }
            }
        }
        return true;
    }
    
    public void setCurrentScreen(final int n) {
        this.setCurrentScreen(n, this.y);
    }
    
    public void setCurrentScreen(final int n, final int screenWidth) {
        this.setScreenWidth(screenWidth);
        if (!this.A.isFinished()) {
            this.A.abortAnimation();
        }
        this.q = Math.max(0, Math.min(n, this.getChildCount()));
        this.scrollTo(screenWidth * this.q, 0);
        if (this.h != null) {
            this.h.a(n);
        }
        this.invalidate();
    }
    
    public void setEventCallback(final awc h) {
        this.h = h;
    }
    
    public void setOnLongClickListener(final View$OnLongClickListener onLongClickListener) {
        final boolean i = App.I;
        final int childCount = this.getChildCount();
        int j = 0;
        while (j < childCount) {
            this.getChildAt(j).setOnLongClickListener(onLongClickListener);
            ++j;
            if (i) {
                break;
            }
        }
    }
    
    public void setScreenWidth(int width) {
        if (width == 0) {
            width = this.getWidth();
        }
        this.y = width;
    }
}
