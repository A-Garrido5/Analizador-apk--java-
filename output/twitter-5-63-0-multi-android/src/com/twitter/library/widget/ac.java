// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.internal.android.widget.TypefacesTextView;
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
import android.content.res.Resources;
import android.view.View;
import java.util.Collections;
import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.util.FriendshipCache;
import java.util.List;
import android.graphics.Paint;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.TweetActionType;
import android.content.res.TypedArray;

class ac extends z
{
    final /* synthetic */ InlineActionsView a;
    private int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    
    private ac(final InlineActionsView a, final TypedArray typedArray) {
        this.a = a;
        super(a, TweetActionType.c, null);
        this.g = 0;
        this.d = this.b();
        this.h = typedArray.getResourceId(li.InlineActionsView_retweetOnDrawable, 0);
        this.i = typedArray.getResourceId(li.InlineActionsView_retweetOffDrawable, 0);
        this.j = typedArray.getResourceId(li.InlineActionsView_retweetDisabledDrawable, 0);
        this.l = a.h;
        this.k = a.getResources().getColor(kx.medium_green);
        this.c.setImageResource(this.i);
    }
    
    private int b(final Tweet tweet) {
        int n = 1;
        int n2;
        if (tweet.P || tweet.C == this.a.getOwnerId()) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            n = 2;
        }
        else if (!tweet.h) {
            return 0;
        }
        return n;
    }
    
    @Override
    public final boolean a(final Tweet tweet) {
        final int b = this.b(tweet);
        boolean b2;
        if (b != this.e) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (b2) {
            switch (this.e = b) {
                default: {
                    this.c.setImageResource(this.i);
                    this.c().setTextColor(this.l);
                    this.c().setVisibility(0);
                    break;
                }
                case 1: {
                    this.c.setImageResource(this.h);
                    this.c().setTextColor(this.k);
                    this.c().setVisibility(0);
                    break;
                }
                case 2: {
                    this.c.setImageResource(this.j);
                    this.c().setVisibility(8);
                    break;
                }
            }
        }
        boolean b3;
        if (tweet.p != this.g) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (b != 2 && b3) {
            this.g = tweet.p;
            this.c().setText((CharSequence)this.a.a(this.g));
        }
        if (!b2) {
            final boolean b4 = false;
            if (!b3) {
                return b4;
            }
        }
        return true;
    }
}
