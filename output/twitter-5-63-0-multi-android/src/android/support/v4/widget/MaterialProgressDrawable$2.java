// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.content.res.Resources;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class MaterialProgressDrawable$2 implements Animation$AnimationListener
{
    final /* synthetic */ MaterialProgressDrawable this$0;
    final /* synthetic */ MaterialProgressDrawable$Ring val$ring;
    
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
            return;
        }
        this.this$0.mRotationCount = (1.0f + this.this$0.mRotationCount) % 5.0f;
    }
    
    public void onAnimationStart(final Animation animation) {
        this.this$0.mRotationCount = 0.0f;
    }
}
