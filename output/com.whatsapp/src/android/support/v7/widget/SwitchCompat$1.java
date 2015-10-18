// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class SwitchCompat$1 extends Animation
{
    final SwitchCompat this$0;
    final float val$diff;
    final float val$startPosition;
    
    SwitchCompat$1(final SwitchCompat this$0, final float val$startPosition, final float val$diff) {
        this.this$0 = this$0;
        this.val$startPosition = val$startPosition;
        this.val$diff = val$diff;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        SwitchCompat.access$000(this.this$0, this.val$startPosition + n * this.val$diff);
    }
}
