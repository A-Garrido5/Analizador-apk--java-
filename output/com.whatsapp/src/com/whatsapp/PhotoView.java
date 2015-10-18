// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.os.Build$VERSION;
import android.os.Handler;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Rect;
import android.view.View$OnClickListener;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;

public class PhotoView extends View implements GestureDetector$OnGestureListener, GestureDetector$OnDoubleTapListener, ScaleGestureDetector$OnScaleGestureListener
{
    private static Paint P;
    public static Bitmap g;
    private static int l;
    private static Paint m;
    private static boolean s;
    private int A;
    private RectF B;
    private la C;
    private int D;
    private boolean E;
    private boolean F;
    private float G;
    private boolean H;
    private int I;
    private Matrix J;
    private View$OnClickListener K;
    private boolean L;
    private int M;
    private boolean N;
    private h5 O;
    private Matrix Q;
    private Rect a;
    private asq b;
    private boolean c;
    private BitmapDrawable d;
    private aad e;
    private float f;
    private GestureDetectorCompat h;
    private float i;
    private float j;
    private Matrix k;
    private ScaleGestureDetector n;
    private boolean o;
    private RectF p;
    private float[] q;
    private float r;
    private boolean t;
    private RectF u;
    private int v;
    private zr w;
    private float x;
    private boolean y;
    private float z;
    
    public PhotoView(final Context context) {
        super(context);
        this.Q = new Matrix();
        this.J = new Matrix();
        this.v = -1;
        this.a = new Rect();
        this.H = true;
        this.w = zr.FIT_CENTER;
        this.p = new RectF();
        this.B = new RectF();
        this.u = new RectF();
        this.q = new float[9];
        this.h();
    }
    
    public PhotoView(final Context context, final AttributeSet set) {
        super(context, set);
        this.Q = new Matrix();
        this.J = new Matrix();
        this.v = -1;
        this.a = new Rect();
        this.H = true;
        this.w = zr.FIT_CENTER;
        this.p = new RectF();
        this.B = new RectF();
        this.u = new RectF();
        this.q = new float[9];
        this.h();
    }
    
    public PhotoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.Q = new Matrix();
        this.J = new Matrix();
        this.v = -1;
        this.a = new Rect();
        this.H = true;
        this.w = zr.FIT_CENTER;
        this.p = new RectF();
        this.B = new RectF();
        this.u = new RectF();
        this.q = new float[9];
        this.h();
    }
    
    static float a(final PhotoView photoView) {
        return photoView.r;
    }
    
    static float a(final PhotoView photoView, final float r) {
        return photoView.r = r;
    }
    
    private void a(final float n, final float n2, final float n3, final boolean b) {
        final float min = Math.min(Math.max(n, this.i), this.f);
        final float n4 = min / this.c();
        this.Q.postRotate(-this.r, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.Q.postScale(n4, n4, n2, n3);
        this.j = min;
        this.Q.postRotate(this.r, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.b(b);
        this.invalidate();
    }
    
    static void a(final PhotoView photoView, final float n, final float n2, final float n3, final boolean b) {
        photoView.a(n, n2, n3, b);
    }
    
    static void a(final PhotoView photoView, final boolean b) {
        photoView.b(b);
    }
    
    static boolean a(final PhotoView photoView, final float n, final float n2) {
        return photoView.c(n, n2);
    }
    
    static void b(final PhotoView photoView, final boolean b) {
        photoView.c(b);
    }
    
    private void b(final boolean b) {
        final boolean i = App.I;
        this.u.set(this.p);
        this.Q.mapRect(this.u);
        float n;
        if (this.N) {
            n = this.a.left;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (this.N) {
            n2 = this.a.right;
        }
        else {
            n2 = this.getWidth();
        }
        final float left = this.u.left;
        final float right = this.u.right;
        float n4 = 0.0f;
        Label_0156: {
            if (right - left < n2 - n) {
                final float n3 = n + (n2 - n - (right + left)) / 2.0f;
                if (!i) {
                    n4 = n3;
                    break Label_0156;
                }
            }
            if (left > n) {
                n4 = n - left;
                if (!i) {
                    break Label_0156;
                }
            }
            if (right < n2) {
                n4 = n2 - right;
                if (!i) {
                    break Label_0156;
                }
            }
            n4 = 0.0f;
        }
        float n5;
        if (this.N) {
            n5 = this.a.top;
        }
        else {
            n5 = 0.0f;
        }
        float n6;
        if (this.N) {
            n6 = this.a.bottom;
        }
        else {
            n6 = this.getHeight();
        }
        final float top = this.u.top;
        final float bottom = this.u.bottom;
        float n8 = 0.0f;
        Label_0292: {
            if (bottom - top < n6 - n5) {
                final float n7 = n5 + (n6 - n5 - (bottom + top)) / 2.0f;
                if (!i) {
                    n8 = n7;
                    break Label_0292;
                }
            }
            float n9 = 0.0f;
            Label_0383: {
                if (top > n5) {
                    n9 = n5 - top;
                    if (!i) {
                        break Label_0383;
                    }
                }
                final float n10 = fcmpg(bottom, n6);
                n8 = 0.0f;
                if (n10 >= 0) {
                    break Label_0292;
                }
                n9 = n6 - bottom;
                n8 = 0.0f;
                if (i) {
                    break Label_0292;
                }
            }
            n8 = n9;
        }
        if ((Math.abs(n4) > 20.0f || Math.abs(n8) > 20.0f) && !b) {
            this.b.a(n4, n8);
            if (!i) {
                return;
            }
        }
        this.Q.postTranslate(n4, n8);
        this.invalidate();
    }
    
    private void c(final boolean b) {
        if (this.d != null && this.c) {
            int intrinsicWidth = this.d.getIntrinsicWidth();
            int intrinsicHeight = this.d.getIntrinsicHeight();
            this.d.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (Math.abs(this.r % 180.0f) != 90.0f) {
                final int n = intrinsicHeight;
                intrinsicHeight = intrinsicWidth;
                intrinsicWidth = n;
            }
            final int width = this.getWidth();
            final int height = this.getHeight();
            boolean b2;
            if ((intrinsicHeight < 0 || width == intrinsicHeight) && (intrinsicWidth < 0 || height == intrinsicWidth)) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b || (this.i == 0.0f && this.d != null && this.c)) {
                this.d();
            }
            if (b2 || this.Q.isIdentity()) {
                this.k = null;
                if (!App.I) {
                    return;
                }
            }
            this.k = this.Q;
        }
    }
    
    private boolean c(final float n, final float n2) {
        final boolean i = App.I;
        this.u.set(this.p);
        this.Q.mapRect(this.u);
        float n3;
        if (this.N) {
            n3 = this.a.left;
        }
        else {
            n3 = 0.0f;
        }
        float n4;
        if (this.N) {
            n4 = this.a.right;
        }
        else {
            n4 = this.getWidth();
        }
        final float left = this.u.left;
        final float right = this.u.right;
        while (true) {
            float max = 0.0f;
            Label_0395: {
                if (this.N) {
                    max = Math.max(n3 - this.u.right, Math.min(n4 - this.u.left, n));
                    if (!i) {
                        break Label_0395;
                    }
                }
                if (right - left < n4 - n3) {
                    max = n3 + (n4 - n3 - (right + left)) / 2.0f;
                    if (!i) {
                        break Label_0395;
                    }
                }
                final float max2 = Math.max(n4 - right, Math.min(n3 - left, n));
                final boolean n5 = this.N;
                float n6 = 0.0f;
                if (n5) {
                    n6 = this.a.top;
                }
                float n7;
                if (this.N) {
                    n7 = this.a.bottom;
                }
                else {
                    n7 = this.getHeight();
                }
                final float top = this.u.top;
                final float bottom = this.u.bottom;
                while (true) {
                    float max3 = 0.0f;
                    Label_0388: {
                        if (this.N) {
                            max3 = Math.max(n6 - this.u.bottom, Math.min(n7 - this.u.top, n2));
                            if (!i) {
                                break Label_0388;
                            }
                        }
                        if (bottom - top < n7 - n6) {
                            max3 = n6 + (n7 - n6 - (bottom + top)) / 2.0f;
                            if (!i) {
                                break Label_0388;
                            }
                        }
                        final float max4 = Math.max(n7 - bottom, Math.min(n6 - top, n2));
                        this.Q.postTranslate(max2, max4);
                        this.invalidate();
                        return max2 == n && max4 == n2;
                    }
                    final float max4 = max3;
                    continue;
                }
            }
            final float max2 = max;
            continue;
        }
    }
    
    private void d() {
        final boolean i = App.I;
        final int intrinsicWidth = this.d.getIntrinsicWidth();
        final int intrinsicHeight = this.d.getIntrinsicHeight();
        int a;
        if (this.N) {
            a = PhotoView.l;
        }
        else {
            a = this.getWidth();
        }
        int n;
        if (this.N) {
            n = PhotoView.l;
        }
        else {
            n = this.getHeight();
        }
        boolean b;
        if ((intrinsicWidth < 0 || a == intrinsicWidth) && (intrinsicHeight < 0 || n == intrinsicHeight)) {
            b = true;
        }
        else {
            b = false;
        }
        this.z = 0.0f;
        this.Q.reset();
        Label_0582: {
            if (b && !this.N) {
                this.i = 1.0f;
                this.j = 1.0f;
                if (!i) {
                    break Label_0582;
                }
            }
            this.p.set(0.0f, 0.0f, (float)intrinsicWidth, (float)intrinsicHeight);
            Label_0155: {
                if (this.N) {
                    this.B.set(this.a);
                    if (!i) {
                        break Label_0155;
                    }
                }
                this.B.set(0.0f, 0.0f, (float)a, (float)n);
            }
            this.Q.setTranslate((float)(a / 2 - intrinsicWidth / 2), (float)(n / 2 - intrinsicHeight / 2));
            int d;
            if (this.D != 0) {
                d = this.D;
            }
            else {
                d = n;
            }
            float j;
            if (Math.abs(this.r % 180.0f) == 90.0f) {
                j = Math.min(a / intrinsicHeight, d / intrinsicWidth);
            }
            else {
                j = Math.min(a / intrinsicWidth, d / intrinsicHeight);
            }
            this.i = j;
            this.i = Math.min(this.i, 3.0f);
            float n2 = 0.0f;
            Label_0375: {
                if (this.w == zr.CENTER_CROP) {
                    if (Math.abs(this.r % 180.0f) == 90.0f) {
                        n2 = Math.max(a / intrinsicHeight, d / intrinsicWidth);
                    }
                    else {
                        n2 = Math.max(a / intrinsicWidth, d / intrinsicHeight);
                    }
                    if (!i) {
                        break Label_0375;
                    }
                }
                if (this.w == zr.FIT_WIDTH) {
                    if (Math.abs(this.r % 180.0f) == 90.0f) {
                        n2 = a / intrinsicHeight;
                    }
                    else {
                        n2 = a / intrinsicWidth;
                    }
                    if (!i) {
                        break Label_0375;
                    }
                }
                if (this.w == zr.FIT_HEIGHT) {
                    if (Math.abs(this.r % 180.0f) == 90.0f) {
                        n2 = d / intrinsicWidth;
                    }
                    else {
                        n2 = d / intrinsicHeight;
                    }
                    if (!i) {
                        break Label_0375;
                    }
                }
                n2 = this.i;
            }
            Label_0497: {
                if (Math.abs(this.r % 180.0f) == 90.0f) {
                    final float n3 = a / intrinsicHeight;
                    final float n4 = d / intrinsicWidth;
                    if (Math.abs(n3 / n4 - 1.0f) < this.x) {
                        this.z = Math.max(n3, n4);
                        n2 = this.z;
                    }
                    if (!i) {
                        break Label_0497;
                    }
                }
                final float n5 = a / intrinsicWidth;
                final float n6 = d / intrinsicHeight;
                if (Math.abs(n5 / n6 - 1.0f) < this.x) {
                    this.z = Math.max(n5, n6);
                    n2 = this.z;
                }
            }
            if (this.j == 0.0f) {
                this.j = Math.min(n2, 3.0f);
            }
            Label_0532: {
                if (!this.F || !this.t) {
                    if (this.t) {
                        if (this.A == a) {
                            break Label_0532;
                        }
                        this.j = Math.min(n2, 3.0f);
                        if (!i) {
                            break Label_0532;
                        }
                    }
                    if (this.F) {
                        if (this.I == d) {
                            break Label_0532;
                        }
                        this.j = Math.min(n2, 3.0f);
                        if (!i) {
                            break Label_0532;
                        }
                    }
                    this.j = Math.min(n2, 3.0f);
                }
            }
            this.A = a;
            this.I = d;
            this.z = Math.min(this.z, 3.0f);
            this.Q.preScale(this.j, this.j, (float)(intrinsicWidth / 2), (float)(intrinsicHeight / 2));
        }
        this.f = Math.max(8.0f * this.i, 8.0f);
        this.Q.postRotate(this.r, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.G = this.j;
        this.J.set(this.Q);
    }
    
    private void h() {
        final Context context = this.getContext();
        if (!PhotoView.s) {
            PhotoView.s = true;
            (PhotoView.P = new Paint()).setAntiAlias(true);
            PhotoView.P.setStyle(Paint$Style.FILL);
            (PhotoView.m = new Paint()).setAntiAlias(true);
            PhotoView.m.setStyle(Paint$Style.STROKE);
        }
        this.h = new GestureDetectorCompat(context, (GestureDetector$OnGestureListener)this, null);
        this.n = new ScaleGestureDetector(context, (ScaleGestureDetector$OnScaleGestureListener)this);
        if (Build$VERSION.SDK_INT >= 19) {
            this.n.setQuickScaleEnabled(false);
        }
        this.e = new aad(this);
        this.O = new h5(this);
        this.b = new asq(this);
        this.C = new la(this);
    }
    
    protected float a() {
        return this.i;
    }
    
    public void a(final float n, final boolean b) {
        if (b) {
            this.C.a(n);
            if (!App.I) {
                return;
            }
        }
        this.r += n;
        this.Q.postRotate(n, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.invalidate();
    }
    
    public void a(final Bitmap bitmap) {
        boolean b;
        if (this.d != null) {
            if (bitmap == this.d.getBitmap()) {
                return;
            }
            b = (bitmap != null && (this.d.getIntrinsicWidth() != bitmap.getWidth() || this.d.getIntrinsicHeight() != bitmap.getHeight()));
            this.i = 0.0f;
            this.d = null;
        }
        else {
            b = false;
        }
        if (this.d == null && bitmap != null) {
            this.d = new BitmapDrawable(this.getResources(), bitmap);
        }
        if (b) {
            this.A = 0;
            this.I = 0;
        }
        this.c(b);
        this.invalidate();
    }
    
    public void a(final boolean e) {
        if (!(this.E = e)) {
            this.b();
        }
    }
    
    public boolean a(final float n, final float n2) {
        boolean b = true;
        if (!this.E) {
            b = false;
        }
        else if (!h5.a(this.O)) {
            if (this.z == 0.0f) {
                if (this.c() == this.i) {
                    return false;
                }
            }
            else if (this.c() <= this.z) {
                return false;
            }
        }
        return b;
    }
    
    public void b() {
        this.Q.set(this.J);
        this.j = this.G;
        this.invalidate();
    }
    
    public boolean b(final float n, final float n2) {
        boolean b = true;
        if (!this.E) {
            b = false;
        }
        else if (!h5.a(this.O)) {
            if (this.z == 0.0f) {
                if (this.c() == this.i) {
                    return false;
                }
            }
            else if (this.c() <= this.z) {
                return false;
            }
        }
        return b;
    }
    
    protected float c() {
        return this.j;
    }
    
    public void e() {
        this.a(-90.0f, true);
    }
    
    public void f() {
        this.a(90.0f, true);
    }
    
    public void g() {
        this.h = null;
        this.n = null;
        this.d = null;
        if (this.e != null) {
            this.e.a();
        }
        this.e = null;
        if (this.O != null) {
            this.O.a();
        }
        this.O = null;
        if (this.b != null) {
            this.b.a();
        }
        this.b = null;
        if (this.C != null) {
            this.C.a();
        }
        this.C = null;
        this.setOnClickListener(null);
        this.K = null;
    }
    
    public boolean onDoubleTap(final MotionEvent motionEvent) {
        if (this.H && this.E) {
            Label_0120: {
                if (!this.L) {
                    final float c = this.c();
                    float i;
                    if (c == this.i) {
                        i = 2.5f;
                    }
                    else {
                        i = this.i;
                    }
                    final float min = Math.min(this.f, Math.max(this.i, i));
                    if (min == this.i) {
                        this.e.a(c, min, this.getWidth() / 2, this.getHeight() / 2);
                        if (!App.I) {
                            break Label_0120;
                        }
                    }
                    this.e.a(c, min, motionEvent.getX(), motionEvent.getY());
                }
            }
            this.L = false;
        }
        return true;
    }
    
    public boolean onDoubleTapEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        if (this.E) {
            this.O.a();
            this.b.a();
        }
        return true;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.d != null) {
            final int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.k != null) {
                canvas.concat(this.k);
            }
            this.d.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.y) {
                final Bitmap g = PhotoView.g;
                canvas.drawBitmap(g, (float)((this.getWidth() - g.getWidth()) / 2), (float)((this.getHeight() - g.getHeight()) / 2), (Paint)null);
            }
            this.u.set(this.d.getBounds());
            if (Math.abs(this.r % 180.0f) == 90.0f) {
                final float right = this.u.right;
                this.u.right = this.u.bottom;
                this.u.bottom = right;
            }
            if (this.k != null) {
                this.k.mapRect(this.u);
            }
            if (this.N) {
                final int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), PhotoView.P);
                canvas.save();
                canvas.clipRect(this.a);
                if (this.k != null) {
                    canvas.concat(this.k);
                }
                this.d.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.a, PhotoView.m);
            }
        }
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (this.E) {
            this.O.a(n, n2);
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.c = true;
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (this.N) {
            this.M = Math.min(PhotoView.l, Math.min(width, height));
            final int n5 = (width - this.M) / 2;
            final int n6 = (height - this.M) / 2;
            this.a.set(n5, n6, n5 + this.M, n6 + this.M);
        }
        this.c(b);
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.v != -1) {
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(this.v, Integer.MIN_VALUE));
            this.setMeasuredDimension(this.getMeasuredWidth(), this.v);
            if (!App.I) {
                return;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        if (this.E) {
            this.o = false;
            this.a(this.c() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), false);
        }
        return true;
    }
    
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        if (this.E) {
            this.e.a();
            this.o = true;
        }
        return true;
    }
    
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        if (this.E && this.o) {
            this.L = true;
            this.b();
        }
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (this.E) {
            this.c(-n, -n2);
        }
        return true;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    public boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        if (this.K != null && !this.o) {
            this.K.onClick((View)this);
        }
        this.o = false;
        return true;
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.n != null && this.h != null) {
            this.n.onTouchEvent(motionEvent);
            this.h.onTouchEvent(motionEvent);
            switch (motionEvent.getAction()) {
                default: {
                    return true;
                }
                case 1:
                case 3: {
                    if (!h5.a(this.O)) {
                        this.b(false);
                        return true;
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    public void setHeightForInitialScaleCalculation(final int d) {
        this.D = d;
    }
    
    public void setInitialFitTolerance(final float x) {
        this.x = x;
    }
    
    public void setIsVideo(final boolean y) {
        this.y = y;
    }
    
    public void setOnClickListener(final View$OnClickListener k) {
        this.K = k;
    }
    
    public void setRotation(final float n, final boolean b) {
        this.r = 0.0f;
        this.a(n, b);
    }
}
