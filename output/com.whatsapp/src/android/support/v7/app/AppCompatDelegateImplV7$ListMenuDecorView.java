// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.internal.widget.TintManager;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.content.Context;
import android.widget.FrameLayout;

class AppCompatDelegateImplV7$ListMenuDecorView extends FrameLayout
{
    final AppCompatDelegateImplV7 this$0;
    
    public AppCompatDelegateImplV7$ListMenuDecorView(final AppCompatDelegateImplV7 this$0, final Context context) {
        this.this$0 = this$0;
        super(context);
    }
    
    private boolean isOutOfBounds(final int n, final int n2) {
        return n < -5 || n2 < -5 || n > 5 + this.getWidth() || n2 > 5 + this.getHeight();
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.this$0.dispatchKeyEvent(keyEvent);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.isOutOfBounds((int)motionEvent.getX(), (int)motionEvent.getY())) {
            AppCompatDelegateImplV7.access$1200(this.this$0, 0);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public void setBackgroundResource(final int n) {
        this.setBackgroundDrawable(TintManager.getDrawable(this.getContext(), n));
    }
}
