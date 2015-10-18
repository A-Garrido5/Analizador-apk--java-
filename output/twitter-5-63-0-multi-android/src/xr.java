import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.5.30
// 

public class xr extends Drawable implements Animatable
{
    private xv a;
    private boolean b;
    private final Paint c;
    private ValueAnimator d;
    private WeakReference e;
    private int f;
    private float g;
    private boolean h;
    
    public xr(final int n) {
        this(new xv());
        this.a(n);
    }
    
    xr(final xv a) {
        this.c = new Paint();
        this.d = new ValueAnimator();
        this.a = a;
        this.d.setDuration(150L);
        final xu xu = new xu(this, null);
        this.d.addListener((Animator$AnimatorListener)xu);
        this.d.addUpdateListener((ValueAnimator$AnimatorUpdateListener)xu);
        this.a(1.0f);
        this.b(1.0f);
    }
    
    private void a(final boolean h) {
        if (this.d.isRunning() && this.h == h) {
            return;
        }
        this.d.cancel();
        final ValueAnimator d = this.d;
        final float[] floatValues = { this.d(), 0.0f };
        float n;
        if (h) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        floatValues[1] = n;
        d.setFloatValues(floatValues);
        this.d.start();
        this.h = h;
    }
    
    public xr a() {
        if (!this.b && super.mutate() == this) {
            this.a = new xv(this.a);
            this.b = true;
        }
        return this;
    }
    
    public void a(final float b) {
        if (this.a.b != b) {
            this.a.b = b;
            this.invalidateSelf();
        }
    }
    
    public void a(final int a) {
        if (this.a.a != a) {
            this.a.a = a;
            this.invalidateSelf();
        }
    }
    
    public void a(final xt xt) {
        if (xt == null) {
            this.e = null;
            return;
        }
        this.e = new WeakReference((T)xt);
    }
    
    public void b() {
        this.a(false);
    }
    
    public void b(final float g) {
        this.g = g;
        this.invalidateSelf();
    }
    
    public void b(final int f) {
        this.f = f;
    }
    
    public int c() {
        return this.a.a;
    }
    
    public float d() {
        return this.g;
    }
    
    public void draw(final Canvas canvas) {
        this.c.setColor(this.a.a);
        this.c.setStrokeWidth(this.a.b);
        final int left = this.getBounds().left;
        final int right = this.getBounds().right;
        canvas.drawLine((float)Math.max(this.f - (int)(this.g * (this.f - left)), left), (float)this.getBounds().centerY(), (float)Math.min(this.f + (int)(this.g * (right - this.f)), right), (float)this.getBounds().centerY(), this.c);
    }
    
    public int e() {
        return this.f;
    }
    
    public void f() {
        this.f = this.getBounds().centerX();
    }
    
    public xt g() {
        if (this.e == null) {
            return null;
        }
        return (xt)this.e.get();
    }
    
    public int getAlpha() {
        return this.c.getAlpha();
    }
    
    public Drawable$ConstantState getConstantState() {
        return this.a;
    }
    
    public int getIntrinsicHeight() {
        return (int)this.a.b;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean isRunning() {
        return this.d.isRunning();
    }
    
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.f();
    }
    
    public void setAlpha(final int alpha) {
        this.c.setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public void start() {
        this.a(true);
    }
    
    public void stop() {
        if (this.d.isStarted()) {
            this.d.end();
        }
    }
}
