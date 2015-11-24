import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import java.lang.ref.WeakReference;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.5.30
// 

class xu implements Animator$AnimatorListener, ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ xr a;
    
    private xu(final xr a) {
        this.a = a;
    }
    
    public void onAnimationCancel(final Animator animator) {
    }
    
    public void onAnimationEnd(final Animator animator) {
        final xt g = this.a.g();
        if (g != null) {
            g.a(this.a, this.a.h);
        }
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.b((float)valueAnimator.getAnimatedValue());
        this.a.invalidateSelf();
    }
}
