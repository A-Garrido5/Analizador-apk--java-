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

class y extends z
{
    final /* synthetic */ InlineActionsView a;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private long k;
    
    private y(final InlineActionsView a, final TypedArray typedArray) {
        this.a = a;
        super(a, TweetActionType.e, null);
        this.k = -1L;
        this.g = typedArray.getResourceId(li.InlineActionsView_followOnDrawable, 0);
        this.h = typedArray.getResourceId(li.InlineActionsView_followOffDrawable, 0);
        this.j = typedArray.getResourceId(li.InlineActionsView_PAcFollowOffDrawable, 0);
        this.i = typedArray.getResourceId(li.InlineActionsView_PAcFollowOnDrawable, 0);
        this.c.setImageResource(this.h);
    }
    
    private void a(final int n) {
        if (n == 1) {
            this.c.setImageResource(this.g);
            return;
        }
        this.c.setImageResource(this.h);
    }
    
    private int b(final Tweet tweet) {
        if (this.a.a(tweet)) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public final boolean a(final Tweet tweet) {
        int n;
        if (this.k != tweet.Q) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.k = tweet.Q;
            if (!this.a.a(tweet, this.a.getOwnerId())) {
                this.e = 3;
                this.c.setVisibility(4);
                return true;
            }
            this.c.setVisibility(0);
            this.a(this.b(tweet));
            return true;
        }
        else {
            final int b = this.b(tweet);
            if (this.e != b) {
                this.a(this.e = b);
                return true;
            }
            return false;
        }
    }
}
