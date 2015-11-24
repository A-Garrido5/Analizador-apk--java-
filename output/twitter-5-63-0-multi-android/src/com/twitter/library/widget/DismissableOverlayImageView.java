// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.twitter.internal.android.widget.RichImageView;

public class DismissableOverlayImageView extends RichImageView
{
    private Drawable a;
    private boolean b;
    private q c;
    private boolean d;
    
    public DismissableOverlayImageView(final Context context) {
        super(context);
        this.a(context, null);
    }
    
    public DismissableOverlayImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set);
    }
    
    public DismissableOverlayImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        if (set == null) {
            return;
        }
        this.setIsFixedSize(false);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.DismissableOverlayImageView);
        final Drawable drawable = obtainStyledAttributes.getDrawable(li.DismissableOverlayImageView_dismissOverlayDrawable);
        if (drawable != null) {
            this.setDismissOverlayDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }
    
    private void setDismissDrawableBounds(final Drawable drawable) {
        if (this.d && drawable != null) {
            final int measuredWidth = this.getMeasuredWidth();
            drawable.setBounds(Math.max(0, measuredWidth - drawable.getIntrinsicWidth()), 0, measuredWidth, Math.min(drawable.getIntrinsicHeight(), this.getMeasuredHeight()));
            this.invalidate();
        }
    }
    
    @Override
    public void invalidateDrawable(final Drawable drawable) {
        if (drawable == this.a) {
            this.invalidate();
            return;
        }
        super.invalidateDrawable(drawable);
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Drawable a = this.a;
        if (a != null) {
            a.draw(canvas);
        }
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.setDismissDrawableBounds(this.a);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final int n = (int)motionEvent.getY();
        final int n2 = (int)motionEvent.getX();
        final Rect bounds = this.a.getBounds();
        final boolean contains = new Rect(-50 + bounds.left, -50 + bounds.top, 50 + bounds.right, 50 + bounds.bottom).contains(n2, n);
        switch (action) {
            case 0: {
                if (contains) {
                    this.a.setState(new int[] { 16842919 });
                    this.b = true;
                    break;
                }
                break;
            }
            case 1: {
                if (contains && this.b && this.c != null) {
                    this.c.a();
                }
                this.b = false;
                this.a.setState(new int[0]);
                break;
            }
            case 3: {
                this.b = false;
                this.a.setState(new int[0]);
                break;
            }
            case 2: {
                if (contains) {
                    this.a.setState(new int[] { 16842919 });
                    this.b = true;
                    break;
                }
                this.a.setState(new int[0]);
                break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setDismissOverlayDrawable(final Drawable a) {
        final Drawable a2 = this.a;
        if (a2 != a) {
            if (a2 != null) {
                this.unscheduleDrawable(a2);
            }
            this.a = a;
            this.requestLayout();
        }
    }
    
    @Override
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final boolean setFrame = super.setFrame(n, n2, n3, n4);
        this.d = true;
        this.setDismissDrawableBounds(this.a);
        return setFrame;
    }
    
    public void setOnDismissListener(final q c) {
        this.c = c;
    }
}
