// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;

class CircleImageView extends ImageView
{
    private Animation$AnimationListener mListener;
    private int mShadowRadius;
    
    public CircleImageView(final Context context, final int color, final float n) {
        super(context);
        final float density = this.getContext().getResources().getDisplayMetrics().density;
        final int n2 = (int)(2.0f * (n * density));
        final int n3 = (int)(1.75f * density);
        final int n4 = (int)(0.0f * density);
        this.mShadowRadius = (int)(3.5f * density);
        ShapeDrawable backgroundDrawable = null;
        Label_0164: {
            if (this.elevationSupported()) {
                backgroundDrawable = new ShapeDrawable((Shape)new OvalShape());
                ViewCompat.setElevation((View)this, density * 4.0f);
                if (!SlidingPaneLayout.a) {
                    break Label_0164;
                }
            }
            backgroundDrawable = new ShapeDrawable((Shape)new CircleImageView$OvalShadow(this, this.mShadowRadius, n2));
            ViewCompat.setLayerType((View)this, 1, backgroundDrawable.getPaint());
            backgroundDrawable.getPaint().setShadowLayer((float)this.mShadowRadius, (float)n4, (float)n3, 503316480);
            final int mShadowRadius = this.mShadowRadius;
            this.setPadding(mShadowRadius, mShadowRadius, mShadowRadius, mShadowRadius);
        }
        backgroundDrawable.getPaint().setColor(color);
        this.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
    
    static int access$000(final CircleImageView circleImageView) {
        return circleImageView.mShadowRadius;
    }
    
    static int access$002(final CircleImageView circleImageView, final int mShadowRadius) {
        return circleImageView.mShadowRadius = mShadowRadius;
    }
    
    private boolean elevationSupported() {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.mListener != null) {
            this.mListener.onAnimationEnd(this.getAnimation());
        }
    }
    
    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.mListener != null) {
            this.mListener.onAnimationStart(this.getAnimation());
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (!this.elevationSupported()) {
            this.setMeasuredDimension(this.getMeasuredWidth() + 2 * this.mShadowRadius, this.getMeasuredHeight() + 2 * this.mShadowRadius);
        }
    }
    
    public void setAnimationListener(final Animation$AnimationListener mListener) {
        this.mListener = mListener;
    }
    
    public void setBackgroundColor(final int color) {
        if (this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(color);
        }
    }
}
