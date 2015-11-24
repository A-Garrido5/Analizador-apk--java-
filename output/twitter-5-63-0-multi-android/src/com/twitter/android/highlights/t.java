// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.animation.AccelerateInterpolator;
import android.animation.AnimatorSet$Builder;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import com.twitter.android.widget.highlights.StoriesViewPager;
import java.util.ArrayList;
import android.content.res.Resources;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import java.lang.ref.WeakReference;

public class t
{
    private static final boolean b;
    public int a;
    private final WeakReference c;
    private final List d;
    private final List e;
    private final long f;
    private final long g;
    private final long h;
    private final int i;
    private int j;
    
    static {
        b = (App.l() && Log.isLoggable("StoriesAnimations", 3));
    }
    
    public t(final Resources resources, final w w) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = resources.getInteger(2131623962);
        this.g = resources.getInteger(2131623961);
        this.h = resources.getInteger(2131623960);
        this.i = resources.getDisplayMetrics().widthPixels;
        this.j = -1;
        WeakReference c;
        if (w != null) {
            c = new WeakReference((T)w);
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    u a(final StoriesViewPager storiesViewPager, final int n) {
        final int childCount = storiesViewPager.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("prepareAnimatedViews MUST be called with a non-empty ViewPager");
        }
        final ArrayList<View> list = new ArrayList<View>(1);
        final ArrayList<View> list2 = new ArrayList<View>(1);
        final int currentItem = storiesViewPager.getCurrentItem();
        int i = 0;
        View view = null;
    Label_0101_Outer:
        while (i < childCount) {
            final View child = storiesViewPager.getChildAt(i);
            final ag ag = (ag)child.getTag();
            while (true) {
                Label_0219: {
                    if (ag == null) {
                        break Label_0219;
                    }
                    View view2;
                    if (ag.E == currentItem) {
                        child.setLayerType(n, (Paint)null);
                        view2 = child;
                    }
                    else if (ag.E == Integer.MIN_VALUE) {
                        view2 = view;
                    }
                    else if (ag.E < currentItem && Math.abs(ag.E - currentItem) <= 1) {
                        child.setLayerType(n, (Paint)null);
                        list.add(child);
                        view2 = view;
                    }
                    else {
                        if (ag.E > currentItem && Math.abs(ag.E - currentItem) <= 1) {
                            child.setLayerType(n, (Paint)null);
                            list2.add(child);
                        }
                        break Label_0219;
                    }
                    ++i;
                    view = view2;
                    continue Label_0101_Outer;
                }
                View view2 = view;
                continue;
            }
        }
        if (view == null) {
            throw new IllegalStateException("No focused child in ViewPager!");
        }
        return new u(storiesViewPager, view, list, list2);
    }
    
    List a(final u u, final int n) {
        for (int max = Math.max(u.c.size() + u.d.size(), this.d.size()), i = 0; i < max; ++i) {
            if (i >= this.d.size()) {
                this.d.add(ObjectAnimator.ofFloat((Object)null, "alpha", new float[] { 0.0f, 0.0f }));
            }
            else {
                ((ObjectAnimator)this.d.get(i)).cancel();
            }
            if (i >= this.e.size()) {
                this.e.add(ObjectAnimator.ofFloat((Object)null, "translationX", new float[] { 0.0f, 0.0f }));
            }
            else {
                ((ObjectAnimator)this.e.get(i)).cancel();
            }
        }
        final HashMap<List, Integer> hashMap = new HashMap<List, Integer>();
        int n2;
        if (n == 0 || n == 2) {
            n2 = 0;
        }
        else {
            n2 = -this.a;
        }
        int n3;
        if (n == 0 || n == 2) {
            n3 = 0;
        }
        else {
            n3 = -(this.i - this.a + u.b.getWidth());
        }
        hashMap.put(u.c, n2);
        hashMap.put(u.d, n3);
        final ArrayList<ObjectAnimator> list = new ArrayList<ObjectAnimator>();
        final Iterator<Map.Entry<Object, Object>> iterator = hashMap.entrySet().iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, Object> entry = iterator.next();
            final List<View> list2 = entry.getKey();
            final int intValue = entry.getValue();
            for (final View view : list2) {
                if (view != null) {
                    final float alpha = view.getAlpha();
                    final ObjectAnimator objectAnimator = this.d.get(n4);
                    objectAnimator.setTarget((Object)view);
                    objectAnimator.setFloatValues(new float[] { alpha, 1.0f });
                    list.add(objectAnimator);
                    final float translationX = view.getTranslationX();
                    final ObjectAnimator objectAnimator2 = this.e.get(n4);
                    objectAnimator2.setTarget((Object)view);
                    objectAnimator2.setFloatValues(new float[] { translationX, intValue });
                    list.add(objectAnimator2);
                    ++n4;
                }
            }
        }
        return list;
    }
    
    public void a() {
        this.j = -1;
    }
    
    public void a(final StoriesViewPager storiesViewPager) {
        if (this.j != -1) {
            if (t.b) {
                Log.w("StoriesAnimations", "Invalid state to enter 'STATE_ENTERING' state: " + this.j);
            }
        }
        else if (storiesViewPager.getChildCount() != 0) {
            this.j = 0;
            final DecelerateInterpolator interpolator = new DecelerateInterpolator(3.0f);
            final OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
            final u a = this.a(storiesViewPager, 0);
            a.b.setAlpha(0.0f);
            storiesViewPager.setEnabled(false);
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)a.b, "alpha", new float[] { 0.0f, 1.0f });
            ofFloat.setDuration(this.g);
            ofFloat.setInterpolator((TimeInterpolator)interpolator);
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)a.b, "scaleX", new float[] { 0.7f, 1.0f });
            ofFloat2.setDuration(this.g);
            ofFloat2.setInterpolator((TimeInterpolator)overshootInterpolator);
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)a.b, "scaleY", new float[] { 0.7f, 1.0f });
            ofFloat3.setDuration(this.g);
            ofFloat3.setInterpolator((TimeInterpolator)overshootInterpolator);
            for (final View view : a.c) {
                view.setAlpha(0.0f);
                view.setTranslationX((float)(-this.a));
            }
            for (final View view2 : a.d) {
                view2.setAlpha(0.0f);
                view2.setTranslationX((float)this.a);
            }
            final List a2 = this.a(a, this.j);
            final AnimatorSet set = new AnimatorSet();
            final AnimatorSet$Builder with = set.play((Animator)ofFloat).with((Animator)ofFloat2).with((Animator)ofFloat3);
            for (final ObjectAnimator objectAnimator : a2) {
                objectAnimator.setStartDelay(this.g);
                objectAnimator.setDuration(this.g);
                with.with((Animator)objectAnimator);
            }
            set.addListener((Animator$AnimatorListener)new v(this, a, this.c));
            set.setStartDelay(this.f);
            set.start();
        }
    }
    
    public void a(final StoriesViewPager storiesViewPager, final View view, final boolean b) {
        if (this.j != 2) {
            if (t.b) {
                Log.w("StoriesAnimations", "Invalid state to enter 'STATE_EXITING' state: " + this.j);
            }
            return;
        }
        this.j = 3;
        final u a = this.a(storiesViewPager, 2);
        final AnimatorSet set = new AnimatorSet();
        Object interpolator;
        if (b) {
            interpolator = new DecelerateInterpolator();
        }
        else {
            interpolator = new AccelerateInterpolator(2.0f);
        }
        storiesViewPager.setEnabled(false);
        a.b.bringToFront();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)a.b, "translationX", new float[] { a.b.getTranslationX(), -(a.b.getWidth() + this.a) });
        ofFloat.setDuration(this.h);
        ofFloat.setInterpolator((TimeInterpolator)interpolator);
        set.addListener((Animator$AnimatorListener)new v(this, a, this.c));
        final AnimatorSet$Builder play = set.play((Animator)ofFloat);
        for (final ObjectAnimator objectAnimator : this.a(a, this.j)) {
            objectAnimator.setDuration(this.h);
            objectAnimator.setInterpolator((TimeInterpolator)interpolator);
            objectAnimator.setStartDelay(0L);
            play.with((Animator)objectAnimator);
        }
        if (view != null) {
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { view.getAlpha(), 0.0f });
            ofFloat2.setDuration(this.h);
            ofFloat2.setInterpolator((TimeInterpolator)interpolator);
            play.with((Animator)ofFloat2);
        }
        set.start();
    }
}
