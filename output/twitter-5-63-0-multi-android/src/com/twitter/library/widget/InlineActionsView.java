// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.view.TweetActionType;
import android.graphics.Canvas;
import com.twitter.library.client.az;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import com.twitter.library.util.aj;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View;
import java.util.Collections;
import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.provider.Tweet;
import java.util.List;
import android.graphics.Paint;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public class InlineActionsView extends ViewGroup implements View$OnClickListener
{
    private static final boolean a;
    private static final Paint b;
    private final boolean c;
    private final int d;
    private final float e;
    private final int f;
    private final float g;
    private final int h;
    private final boolean i;
    private final List j;
    private Tweet k;
    private FriendshipCache l;
    private boolean m;
    private aa n;
    
    static {
        a = yw.a();
        b = new Paint(1);
    }
    
    public InlineActionsView(final Context context) {
        this(context, null);
    }
    
    public InlineActionsView(final Context context, final AttributeSet set) {
        this(context, set, kv.inlineActionsViewStyle);
    }
    
    public InlineActionsView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.j = new ArrayList();
        final Resources resources = this.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.InlineActionsView, n, 0);
        this.c = obtainStyledAttributes.getBoolean(li.InlineActionsView_displayBorder, false);
        this.d = resources.getColor(kx.light_gray);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.InlineActionsView_inlineActionBorderWidth, 1);
        this.f = obtainStyledAttributes.getDimensionPixelSize(li.InlineActionsView_iconPadding, 0);
        this.g = bo.a(bo.a);
        this.h = obtainStyledAttributes.getColor(li.InlineActionsView_labelColor, 0);
        this.j.add(new ab(this, obtainStyledAttributes, null));
        this.j.add(new ac(this, obtainStyledAttributes, null));
        this.j.add(new x(this, obtainStyledAttributes, null));
        this.j.add(new y(this, obtainStyledAttributes, null));
        this.i = bj.e;
        if (this.i) {
            Collections.reverse(this.j);
        }
        for (final z z : this.j) {
            this.addView((View)z.c);
            if (z.c() != null) {
                this.addView((View)z.c());
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private String a(final int n) {
        if (n > 0) {
            return aj.b(this.getResources(), n);
        }
        return "";
    }
    
    private void a(final z z, final boolean b) {
        if (InlineActionsView.a) {
            if (b) {
                this.n.a(z.b);
            }
            return;
        }
        final Animation b2 = b();
        b2.setAnimationListener((Animation$AnimationListener)new v(this, z));
        z.c.clearAnimation();
        z.c.startAnimation(b2);
    }
    
    private boolean a(final Tweet tweet) {
        return this.l != null && tweet != null && this.l.k(tweet.C);
    }
    
    private boolean a(final Tweet tweet, final long n) {
        if (this.l != null && tweet.C != n) {
            final Integer j = this.l.j(tweet.C);
            int intValue;
            if (j == null) {
                intValue = 0;
            }
            else {
                intValue = j;
            }
            boolean b;
            if ((intValue & 0x1) != 0x0) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if ((intValue & 0x40) != 0x0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (tweet.C() || ((tweet.t() || !tweet.r()) && (!b || b2 || tweet.ad()))) {
                return true;
            }
        }
        return false;
    }
    
    public static Animation b() {
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.4f, 1.0f, 1.4f, 1, 0.5f, 1, 0.5f);
        ((Animation)scaleAnimation).setDuration(85L);
        ((Animation)scaleAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.4f, 1.0f, 1.4f, 1.0f, 1, 0.5f, 1, 0.5f);
        ((Animation)scaleAnimation2).setDuration(165L);
        final AnimationSet set = new AnimationSet(true);
        set.addAnimation((Animation)scaleAnimation);
        set.addAnimation((Animation)scaleAnimation2);
        return (Animation)set;
    }
    
    private long getOwnerId() {
        return az.a(this.getContext()).b().g();
    }
    
    public void a() {
        final Tweet k = this.k;
        if (k != null) {
            final Iterator<z> iterator = (Iterator<z>)this.j.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                int n2;
                if (iterator.next().a(k) || n != 0) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                n = n2;
            }
            if (n != 0) {
                this.requestLayout();
                this.invalidate();
            }
        }
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            final Paint b = InlineActionsView.b;
            b.setColor(this.d);
            b.setStrokeWidth(this.e);
            canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), this.e, b);
        }
    }
    
    public void onClick(final View view) {
        if (this.n != null) {
            final z z = (z)view.getTag();
            final TweetActionType b = z.b;
            switch (w.a[b.ordinal()]) {
                default: {}
                case 1:
                case 2: {
                    this.n.a(b);
                }
                case 3: {
                    this.a(z, true);
                }
                case 4: {
                    if (this.k == null) {
                        break;
                    }
                    if (this.k.e) {
                        this.n.a(b);
                        return;
                    }
                    this.a(z, true);
                }
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final List j = this.j;
        if (!j.isEmpty()) {
            final int size = j.size();
            final int n5 = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
            final int n6 = 2 * this.f;
            int n7 = 0;
            for (int i = 0; i < size; ++i) {
                n7 += j.get(i).c.getMeasuredWidth();
            }
            int n8;
            if (size > 1) {
                n8 = (n6 + (n5 - n7)) / (size - 1);
            }
            else {
                n8 = 0;
            }
            final int n9 = this.getMeasuredHeight() / 2;
            final int n10 = n + this.getPaddingLeft() - this.f;
            final Iterator<z> iterator = j.iterator();
            int n11 = n10;
            while (iterator.hasNext()) {
                final z z = iterator.next();
                final int n12 = n9 - z.c.getMeasuredHeight() / 2;
                final int measuredWidth = z.c.getMeasuredWidth();
                z.c.layout(n11, n12, n11 + measuredWidth, z.c.getMeasuredHeight() + n12);
                final TypefacesTextView c = z.c();
                if (c != null) {
                    final int measuredWidth2 = ((View)c).getMeasuredWidth();
                    if (!this.m && measuredWidth2 < n8) {
                        final int n13 = ((View)c).getMeasuredHeight() / 2;
                        if (this.i) {
                            ((View)c).layout(n11 - ((View)c).getMeasuredWidth(), n9 - n13, n11, n13 + n9);
                        }
                        else {
                            ((View)c).layout(n11 + z.c.getMeasuredWidth(), n9 - n13, n8 + (n11 + measuredWidth), n13 + n9);
                        }
                        ((View)c).setVisibility(0);
                    }
                    else {
                        ((View)c).setVisibility(8);
                    }
                }
                n11 += measuredWidth + n8;
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.measureChildren(n, n2);
        this.setMeasuredDimension(n, n2);
    }
    
    public void setFriendshipCache(final FriendshipCache l) {
        this.l = l;
    }
    
    public void setOnInlineActionClickListener(final aa n) {
        this.n = n;
    }
    
    public void setTweet(final Tweet k) {
        if (k == null) {
            return;
        }
        this.k = k;
        this.a();
    }
}
