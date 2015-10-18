// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.view.MotionEvent;
import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.youtube.player.internal.ba;
import com.google.android.youtube.player.internal.az;
import com.google.android.youtube.player.internal.w$a;
import com.google.android.youtube.player.internal.b;
import android.app.Activity;
import java.util.HashSet;
import com.google.android.youtube.player.internal.c;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Bundle;
import com.google.android.youtube.player.internal.n;
import android.view.View;
import com.google.android.youtube.player.internal.ax;
import java.util.Set;
import android.view.ViewGroup;

public final class YouTubePlayerView extends ViewGroup implements e
{
    private final i a;
    private final Set b;
    private final j c;
    private com.google.android.youtube.player.internal.e d;
    private ax e;
    private View f;
    private n g;
    private e h;
    private Bundle i;
    private d j;
    private boolean k;
    
    public YouTubePlayerView(final Context context) {
        this(context, null);
    }
    
    public YouTubePlayerView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public YouTubePlayerView(final Context context, final AttributeSet set, final int n) {
        if (!(context instanceof YouTubeBaseActivity)) {
            throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
        }
        this(context, set, n, ((YouTubeBaseActivity)context).a());
    }
    
    YouTubePlayerView(final Context context, final AttributeSet set, final int n, final j j) {
        super((Context)com.google.android.youtube.player.internal.c.a(context, "context cannot be null"), set, n);
        this.c = (j)com.google.android.youtube.player.internal.c.a(j, "listener cannot be null");
        if (this.getBackground() == null) {
            this.setBackgroundColor(-16777216);
        }
        this.setClipToPadding(false);
        this.requestTransparentRegion((View)(this.g = new n(context)));
        this.addView((View)this.g);
        this.b = new HashSet();
        this.a = new i(this, (byte)0);
    }
    
    private void a(final View view) {
        int n;
        if (view == this.g || (this.e != null && view == this.f)) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }
    
    private void a(final YouTubeInitializationResult youTubeInitializationResult) {
        this.e = null;
        this.g.c();
        if (this.j != null) {
            this.j.a(this.h, youTubeInitializationResult);
            this.j = null;
        }
    }
    
    final void a() {
        if (this.e != null) {
            this.e.b();
        }
    }
    
    final void a(final Activity activity, final e e, final String s, final d d, final Bundle i) {
        if (this.e != null || this.j != null) {
            return;
        }
        com.google.android.youtube.player.internal.c.a(activity, "activity cannot be null");
        this.h = (e)com.google.android.youtube.player.internal.c.a(e, "provider cannot be null");
        this.j = (d)com.google.android.youtube.player.internal.c.a(d, "listener cannot be null");
        this.i = i;
        this.g.b();
        (this.d = com.google.android.youtube.player.internal.b.a().a(this.getContext(), s, new g(this, activity), new h(this))).e();
    }
    
    final void a(final boolean b) {
        if (this.e != null) {
            this.e.b(b);
            this.b(b);
        }
    }
    
    public final void addFocusables(final ArrayList list, final int n) {
        final ArrayList list2 = new ArrayList();
        super.addFocusables(list2, n);
        list.addAll(list2);
        this.b.clear();
        this.b.addAll(list2);
    }
    
    public final void addFocusables(final ArrayList list, final int n, final int n2) {
        final ArrayList list2 = new ArrayList();
        super.addFocusables(list2, n, n2);
        list.addAll(list2);
        this.b.clear();
        this.b.addAll(list2);
    }
    
    public final void addView(final View view) {
        this.a(view);
        super.addView(view);
    }
    
    public final void addView(final View view, final int n) {
        this.a(view);
        super.addView(view, n);
    }
    
    public final void addView(final View view, final int n, final int n2) {
        this.a(view);
        super.addView(view, n, n2);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a(view);
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a(view);
        super.addView(view, viewGroup$LayoutParams);
    }
    
    final void b() {
        if (this.e != null) {
            this.e.c();
        }
    }
    
    final void b(final boolean b) {
        this.k = true;
        if (this.e != null) {
            this.e.a(b);
        }
    }
    
    final void c() {
        if (this.e != null) {
            this.e.d();
        }
    }
    
    public final void clearChildFocus(final View view) {
        if (this.hasFocusable()) {
            this.requestFocus();
            return;
        }
        super.clearChildFocus(view);
    }
    
    final void d() {
        if (this.e != null) {
            this.e.e();
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (this.e != null) {
            boolean b;
            if (keyEvent.getAction() == 0) {
                if (!this.e.a(keyEvent.getKeyCode(), keyEvent)) {
                    final boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
                    b = false;
                    if (!dispatchKeyEvent) {
                        return b;
                    }
                }
                b = true;
            }
            else {
                if (keyEvent.getAction() == 1) {
                    if (!this.e.b(keyEvent.getKeyCode(), keyEvent)) {
                        final boolean dispatchKeyEvent2 = super.dispatchKeyEvent(keyEvent);
                        b = false;
                        if (!dispatchKeyEvent2) {
                            return b;
                        }
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }
            return b;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    final Bundle e() {
        if (this.e == null) {
            return this.i;
        }
        return this.e.h();
    }
    
    public final void focusableViewAvailable(final View view) {
        super.focusableViewAvailable(view);
        this.b.add(view);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)this.a);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.e != null) {
            this.e.a(configuration);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)this.a);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.getChildCount() > 0) {
            this.getChildAt(0).layout(0, 0, n3 - n, n4 - n2);
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            child.measure(n, n2);
            this.setMeasuredDimension(child.getMeasuredWidth(), child.getMeasuredHeight());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public final void requestChildFocus(final View view, final View view2) {
        super.requestChildFocus(view, view2);
        this.b.add(view2);
    }
    
    public final void setClipToPadding(final boolean b) {
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
}
