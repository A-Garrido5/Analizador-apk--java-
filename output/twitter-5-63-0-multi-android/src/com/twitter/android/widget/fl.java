// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.view.TweetActionType;
import com.twitter.library.provider.i;
import com.twitter.library.provider.j;
import android.view.View$OnClickListener;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.view.BadgeView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.twitter.library.util.bo;
import com.twitter.library.util.bj;
import com.twitter.library.util.t;
import com.twitter.library.view.e;
import com.twitter.library.view.k;
import com.twitter.library.view.l;
import com.twitter.library.api.TweetEntities;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.ul;
import com.twitter.android.xa;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.widget.InlineActionsView;
import com.twitter.library.view.TweetContentView;
import com.twitter.library.view.TweetHeaderView;
import com.twitter.library.media.widget.UserImageView;
import android.view.ViewGroup;
import android.content.Context;
import android.text.TextPaint;
import com.twitter.library.widget.ag;
import com.twitter.library.widget.aa;
import android.widget.LinearLayout;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.RootTweetActivity;
import android.view.View;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.c;

class fl extends c
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ TweetCarouselView b;
    
    fl(final TweetCarouselView b, final int n, final int n2, final boolean b2, final Tweet a) {
        this.b = b;
        this.a = a;
        super(n, n2, b2);
    }
    
    public void onClick(final View view) {
        this.b.b.startActivity(new Intent(this.b.b, (Class)RootTweetActivity.class).putExtra("tw", (Parcelable)this.a));
    }
}
