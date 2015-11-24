// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class MaterialProgressDrawable$1 extends Animation
{
    final MaterialProgressDrawable this$0;
    final MaterialProgressDrawable$Ring val$ring;
    
    MaterialProgressDrawable$1(final MaterialProgressDrawable this$0, final MaterialProgressDrawable$Ring val$ring) {
        this.this$0 = this$0;
        this.val$ring = val$ring;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        if (this.this$0.mFinishing) {
            MaterialProgressDrawable.access$200(this.this$0, n, this.val$ring);
            if (!SlidingPaneLayout.a) {
                return;
            }
        }
        final float n2 = (float)Math.toRadians(this.val$ring.getStrokeWidth() / (6.283185307179586 * this.val$ring.getCenterRadius()));
        final float startingEndTrim = this.val$ring.getStartingEndTrim();
        final float startingStartTrim = this.val$ring.getStartingStartTrim();
        final float startingRotation = this.val$ring.getStartingRotation();
        this.val$ring.setEndTrim(startingEndTrim + (0.8f - n2) * MaterialProgressDrawable.access$300().getInterpolation(n));
        this.val$ring.setStartTrim(startingStartTrim + 0.8f * MaterialProgressDrawable.access$400().getInterpolation(n));
        this.val$ring.setRotation(startingRotation + 0.25f * n);
        this.this$0.setRotation(144.0f * n + 720.0f * (MaterialProgressDrawable.access$500(this.this$0) / 5.0f));
    }
}
