import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.util.StateSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.5.30
// 

public class xw extends Drawable implements Drawable$Callback, xt
{
    public static final int[] a;
    private final ColorStateList b;
    private final float c;
    private final float d;
    private final int e;
    private final int f;
    private xr g;
    private xr h;
    private int i;
    
    static {
        a = new int[] { 16842910, 16842908 };
    }
    
    public xw(final Context context, final ColorStateList b) {
        this.b = b;
        this.g = new xr(0);
        this.h = new xr(0);
        this.g.setCallback((Drawable$Callback)this);
        this.h.setCallback((Drawable$Callback)this);
        this.h.a(this);
        final Resources resources = context.getResources();
        this.c = resources.getDimension(jm.twitter_edit_text_stroke_width_normal);
        this.d = resources.getDimension(jm.twitter_edit_text_stroke_width_focused);
        this.e = this.b.getDefaultColor();
        this.f = this.b.getColorForState(StateSet.WILD_CARD, 0);
        this.g.a(this.e);
        this.g.a(this.c);
        this.g.a(this.c);
    }
    
    private boolean a(final int[] array) {
        float n;
        if (StateSet.stateSetMatches(xw.a, array)) {
            n = this.d;
        }
        else {
            n = this.c;
        }
        this.g.a(n);
        this.h.a(n);
        final int colorForState = this.b.getColorForState(array, 0);
        final int c = this.h.c();
        final int c2 = this.g.c();
        final boolean running = this.h.isRunning();
        if ((colorForState == c2 && !running) || (running && colorForState == c)) {
            return false;
        }
        final int i = this.i;
        this.h.stop();
        this.h.b(i);
        if (this.d(colorForState)) {
            this.b(colorForState);
        }
        else {
            this.c(colorForState);
        }
        return true;
    }
    
    private void b(final int n) {
        final int c = this.g.c();
        this.g.a(n);
        if (!this.d(c)) {
            this.h.a(c);
            this.h.b(1.0f);
            this.h.b();
        }
    }
    
    private void c(final int n) {
        this.h.a(n);
        this.h.b(0.0f);
        this.h.start();
    }
    
    private boolean d(final int n) {
        return n == this.e || n == this.f;
    }
    
    public void a(final int i) {
        this.i = i;
    }
    
    public void a(final xr xr, final boolean b) {
        if (b) {
            this.g.a(this.h.c());
        }
        this.h.f();
        this.i = this.h.e();
    }
    
    public void draw(final Canvas canvas) {
        this.g.draw(canvas);
        if (this.h.isRunning()) {
            this.h.draw(canvas);
        }
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public boolean isStateful() {
        return true;
    }
    
    protected void onBoundsChange(final Rect rect) {
        this.g.setBounds(rect);
        this.h.setBounds(rect);
    }
    
    protected boolean onStateChange(final int[] array) {
        return this.a(array);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
}
