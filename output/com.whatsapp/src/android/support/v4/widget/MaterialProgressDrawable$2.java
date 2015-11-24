// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class MaterialProgressDrawable$2 implements Animation$AnimationListener
{
    final MaterialProgressDrawable this$0;
    final MaterialProgressDrawable$Ring val$ring;
    
    MaterialProgressDrawable$2(final MaterialProgressDrawable this$0, final MaterialProgressDrawable$Ring val$ring) {
        this.this$0 = this$0;
        this.val$ring = val$ring;
    }
    
    public void onAnimationEnd(final Animation animation) {
    }
    
    public void onAnimationRepeat(final Animation animation) {
        this.val$ring.storeOriginals();
        this.val$ring.goToNextColor();
        this.val$ring.setStartTrim(this.val$ring.getEndTrim());
        if (this.this$0.mFinishing) {
            this.this$0.mFinishing = false;
            animation.setDuration(1333L);
            this.val$ring.setShowArrow(false);
            if (!SlidingPaneLayout.a) {
                return;
            }
        }
        MaterialProgressDrawable.access$502(this.this$0, (1.0f + MaterialProgressDrawable.access$500(this.this$0)) % 5.0f);
    }
    
    public void onAnimationStart(final Animation animation) {
        MaterialProgressDrawable.access$502(this.this$0, 0.0f);
    }
}
