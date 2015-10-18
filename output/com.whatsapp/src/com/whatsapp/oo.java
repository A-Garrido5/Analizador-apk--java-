// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorPauseListener;
import java.util.Iterator;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

public class oo extends Animator implements Animator$AnimatorListener
{
    private Animator a;
    private ArrayList b;
    
    public oo(final Animator a) {
        (this.a = a).addListener((Animator$AnimatorListener)this);
    }
    
    public oo a() {
        final int c = o_.c;
        final oo oo = (oo)super.clone();
        if (this.b != null) {
            final ArrayList b = this.b;
            oo.b = new ArrayList();
            final Iterator<Animator$AnimatorListener> iterator = (Iterator<Animator$AnimatorListener>)b.iterator();
            while (iterator.hasNext()) {
                oo.b.add(iterator.next());
                if (c != 0) {
                    break;
                }
            }
        }
        return oo;
    }
    
    public void addListener(final Animator$AnimatorListener animator$AnimatorListener) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(animator$AnimatorListener);
    }
    
    public void addPauseListener(final Animator$AnimatorPauseListener animator$AnimatorPauseListener) {
    }
    
    public void cancel() {
        this.a.cancel();
    }
    
    public Animator clone() {
        return this.a();
    }
    
    public Object clone() {
        return this.a();
    }
    
    public void end() {
        this.a.end();
    }
    
    public long getDuration() {
        return this.a.getDuration();
    }
    
    public TimeInterpolator getInterpolator() {
        return this.a.getInterpolator();
    }
    
    public ArrayList getListeners() {
        return this.b;
    }
    
    public long getStartDelay() {
        return this.a.getStartDelay();
    }
    
    public boolean isPaused() {
        return this.a.isPaused();
    }
    
    public boolean isRunning() {
        return this.a.isRunning();
    }
    
    public boolean isStarted() {
        return this.a.isStarted();
    }
    
    public void onAnimationCancel(final Animator animator) {
        final int c = o_.c;
        final Iterator iterator = ((ArrayList)this.b.clone()).iterator();
        while (iterator.hasNext()) {
            iterator.next().onAnimationCancel((Animator)this);
            if (c != 0) {
                break;
            }
        }
    }
    
    public void onAnimationEnd(final Animator animator) {
        final int c = o_.c;
        final Iterator iterator = ((ArrayList)this.b.clone()).iterator();
        while (iterator.hasNext()) {
            iterator.next().onAnimationEnd((Animator)this);
            if (c != 0) {
                break;
            }
        }
    }
    
    public void onAnimationRepeat(final Animator animator) {
        final int c = o_.c;
        final Iterator iterator = ((ArrayList)this.b.clone()).iterator();
        while (iterator.hasNext()) {
            iterator.next().onAnimationRepeat((Animator)this);
            if (c != 0) {
                break;
            }
        }
    }
    
    public void onAnimationStart(final Animator animator) {
        final int c = o_.c;
        final Iterator iterator = ((ArrayList)this.b.clone()).iterator();
        while (iterator.hasNext()) {
            iterator.next().onAnimationStart((Animator)this);
            if (c != 0) {
                break;
            }
        }
        if (DialogToastActivity.h) {
            o_.c = c + 1;
        }
    }
    
    public void pause() {
    }
    
    public void removeAllListeners() {
        if (this.b != null) {
            this.b.clear();
            this.b = null;
        }
    }
    
    public void removeListener(final Animator$AnimatorListener animator$AnimatorListener) {
        if (this.b != null) {
            this.b.remove(animator$AnimatorListener);
            if (this.b.isEmpty()) {
                this.b = null;
            }
        }
    }
    
    public void removePauseListener(final Animator$AnimatorPauseListener animator$AnimatorPauseListener) {
    }
    
    public void resume() {
    }
    
    public Animator setDuration(final long duration) {
        this.a.setDuration(duration);
        return this;
    }
    
    public void setInterpolator(final TimeInterpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }
    
    public void setStartDelay(final long startDelay) {
        this.a.setStartDelay(startDelay);
    }
    
    public void setTarget(final Object target) {
        this.a.setTarget(target);
    }
    
    public void setupEndValues() {
        this.a.setupEndValues();
    }
    
    public void setupStartValues() {
        this.a.setupStartValues();
    }
    
    public void start() {
        this.a.start();
    }
}
