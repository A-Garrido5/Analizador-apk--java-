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

class x extends z
{
    final /* synthetic */ InlineActionsView a;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private int k;
    
    private x(final InlineActionsView a, final TypedArray typedArray) {
        this.a = a;
        super(a, TweetActionType.b, null);
        this.d = this.b();
        this.h = typedArray.getResourceId(li.InlineActionsView_favoriteOffDrawable, 0);
        this.g = typedArray.getResourceId(li.InlineActionsView_favoriteOnDrawable, 0);
        this.c.setImageResource(this.h);
        this.i = a.getResources().getColor(kx.deep_yellow);
        this.j = a.h;
    }
    
    private int b(final Tweet tweet) {
        if (tweet.e) {
            return 1;
        }
        return 0;
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
            if ((this.e = b) == 1) {
                this.c.setImageResource(this.g);
                this.c().setTextColor(this.i);
            }
            else {
                this.c.setImageResource(this.h);
                this.c().setTextColor(this.j);
            }
        }
        boolean b3;
        if (this.k != tweet.t) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (b3) {
            this.k = tweet.t;
            this.c().setText((CharSequence)this.a.a(this.k));
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
