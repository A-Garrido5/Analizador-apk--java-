// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import java.util.Iterator;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public class ViewPropertyAnimatorCompatSet
{
    private final ArrayList mAnimators;
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private ViewPropertyAnimatorListener mListener;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener;
    
    public ViewPropertyAnimatorCompatSet() {
        this.mDuration = -1L;
        this.mProxyListener = new ViewPropertyAnimatorCompatSet$1(this);
        this.mAnimators = new ArrayList();
    }
    
    static ViewPropertyAnimatorListener access$000(final ViewPropertyAnimatorCompatSet set) {
        return set.mListener;
    }
    
    static void access$100(final ViewPropertyAnimatorCompatSet set) {
        set.onAnimationsEnded();
    }
    
    static ArrayList access$200(final ViewPropertyAnimatorCompatSet set) {
        return set.mAnimators;
    }
    
    private void onAnimationsEnded() {
        this.mIsStarted = false;
    }
    
    public void cancel() {
        final int a = WindowCallbackWrapper.a;
        if (!this.mIsStarted) {
            return;
        }
        final Iterator<ViewPropertyAnimatorCompat> iterator = (Iterator<ViewPropertyAnimatorCompat>)this.mAnimators.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
            if (a != 0) {
                break;
            }
        }
        this.mIsStarted = false;
    }
    
    public ViewPropertyAnimatorCompatSet play(final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.mIsStarted) {
            this.mAnimators.add(viewPropertyAnimatorCompat);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet setDuration(final long mDuration) {
        if (!this.mIsStarted) {
            this.mDuration = mDuration;
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet setInterpolator(final Interpolator mInterpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = mInterpolator;
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet setListener(final ViewPropertyAnimatorListener mListener) {
        if (!this.mIsStarted) {
            this.mListener = mListener;
        }
        return this;
    }
    
    public void start() {
        final int a = WindowCallbackWrapper.a;
        if (this.mIsStarted) {
            return;
        }
        for (final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.mAnimators) {
            if (this.mDuration >= 0L) {
                viewPropertyAnimatorCompat.setDuration(this.mDuration);
            }
            if (this.mInterpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(this.mInterpolator);
            }
            if (this.mListener != null) {
                viewPropertyAnimatorCompat.setListener(this.mProxyListener);
            }
            viewPropertyAnimatorCompat.start();
            if (a != 0) {
                break;
            }
        }
        this.mIsStarted = true;
    }
}
