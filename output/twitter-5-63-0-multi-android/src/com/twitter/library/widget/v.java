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
import android.view.animation.Animation;
import com.twitter.library.util.f;

class v extends f
{
    final /* synthetic */ z a;
    final /* synthetic */ InlineActionsView b;
    
    v(final InlineActionsView b, final z a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (this.b.n != null) {
            this.b.n.a(this.a.b);
        }
    }
}
