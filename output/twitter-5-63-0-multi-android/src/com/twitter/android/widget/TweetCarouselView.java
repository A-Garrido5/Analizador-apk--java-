// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Paint;
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
import android.view.View;
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
import com.twitter.library.provider.Tweet;
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

public class TweetCarouselView extends LinearLayout implements aa, ag, wt
{
    private static final TextPaint a;
    private Context b;
    private ViewGroup c;
    private UserImageView d;
    private TweetHeaderView e;
    private TweetContentView f;
    private InlineActionsView g;
    private Tweet h;
    private f i;
    private long j;
    private xa k;
    private ul l;
    private FriendshipCache m;
    private ws n;
    private SparseArray o;
    private float p;
    private float q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private int[] v;
    
    static {
        a = new TextPaint(1);
    }
    
    public TweetCarouselView(final Context context) {
        this(context, null);
    }
    
    public TweetCarouselView(final Context context, final AttributeSet set) {
        super(context, set);
        this.j = -1L;
        this.o = new SparseArray();
        this.v = new int[] { 0, 2, 1 };
        this.a();
    }
    
    public TweetCarouselView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.j = -1L;
        this.o = new SparseArray();
        this.v = new int[] { 0, 2, 1 };
        this.a();
    }
    
    private CharSequence a(final Tweet tweet) {
        final Resources resources = this.b.getResources();
        final fl fl = new fl(this, this.s, this.r, false, tweet);
        final String string = resources.getString(2131296925);
        final String string2 = resources.getString(2131296769);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence)string).append((CharSequence)string2);
        spannableStringBuilder.setSpan((Object)fl, string.length(), string.length() + string2.length(), 33);
        return (CharSequence)spannableStringBuilder;
    }
    
    private CharSequence a(final String s, final TweetEntities tweetEntities) {
        final Tweet h = this.h;
        CharSequence charSequence;
        if (tweetEntities.b()) {
            charSequence = com.twitter.library.view.l.a(s, tweetEntities, new fm(this, h), this.s, this.r, false, false);
        }
        else {
            charSequence = s;
        }
        if (com.twitter.library.view.e.a() && h.j()) {
            charSequence = com.twitter.library.view.e.a(this.b, h, s, true);
        }
        if (charSequence != null) {
            final TextPaint a = TweetCarouselView.a;
            ((Paint)a).setTextSize(this.p);
            ((Paint)a).setTypeface(com.twitter.ui.widget.ag.a(this.b).a);
            charSequence = com.twitter.library.util.t.a(this.b).a((View)this, charSequence, ((Paint)a).getFontMetrics());
        }
        return charSequence;
    }
    
    private void a() {
        this.b = this.getContext();
        final Resources resources = this.getResources();
        this.r = resources.getColor(2131689600);
        this.s = resources.getColor(2131689601);
        this.t = bj.e;
        this.p = bo.a;
        this.q = bo.a(this.p);
    }
    
    private void b() {
        if (this.i != null) {
            this.i.v();
            this.i.w();
            final View z = this.i.z();
            if (z != null) {
                final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
                layoutParams.addRule(3, 2131886102);
                z.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                this.c.addView(z);
                this.i.x();
            }
        }
    }
    
    private void c() {
        if (this.i != null) {
            final f i = this.i;
            this.i = null;
            i.y();
            final View z = i.z();
            if (z != null) {
                this.c.removeView(z);
            }
        }
    }
    
    public void a(final int n, final String s, final boolean alignEnd) {
        final BadgeView badgeView = (BadgeView)this.o.get(this.u);
        if (badgeView != null) {
            badgeView.setContentSize(this.q);
            badgeView.setAlignEnd(alignEnd);
            badgeView.a(n, s);
        }
    }
    
    public void a(final Tweet tweet, final g g) {
        if (tweet == null) {
            return;
        }
        this.h = tweet;
        final Tweet h = this.h;
        this.d.a(tweet.B);
        this.d.setOnClickListener((View$OnClickListener)new fk(this, h));
        final Context b = this.b;
        this.e.setRenderRTL(this.t);
        this.e.a(this.p, this.q, this.q);
        this.e.a(tweet.a(), tweet.F, null, 0, 0);
        this.f.setRenderRTL(tweet.k());
        this.f.setTruncateText(this.a(tweet));
        final i a = new j(tweet).a(true).c(true).a();
        this.f.setContent(this.a(a.a, a.b));
        this.c();
        this.i = g.a();
        this.b();
        this.n.a(tweet, this.getResources());
        this.g.setFriendshipCache(this.m);
        this.g.setOnInlineActionClickListener(this);
        this.g.setTweet(tweet);
        this.invalidate();
    }
    
    public void a(final TweetActionType tweetActionType) {
        if (this.l == null) {
            return;
        }
        this.l.a(tweetActionType, this.h, this.m, null, this);
    }
    
    public void a(final boolean b) {
        this.g.a();
    }
    
    public void b(final boolean b) {
        if (b) {
            this.h.e = true;
            final Tweet h = this.h;
            ++h.t;
        }
        else {
            this.h.e = false;
            this.h.t = Math.max(-1 + this.h.t, 0);
        }
        this.g.a();
    }
    
    public void c(final boolean b) {
        int n = 1;
        final Tweet h = this.h;
        boolean h2;
        if (!b) {
            h2 = (n != 0);
        }
        else {
            h2 = false;
        }
        h.h = h2;
        final Tweet h3 = this.h;
        final int p = this.h.p;
        if (b) {
            n = -1;
        }
        h3.p = Math.max(n + p, 0);
        this.g.a();
    }
    
    public void d(final boolean b) {
        final BadgeView badgeView = (BadgeView)this.o.get(this.u);
        if (badgeView != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            badgeView.setVisibility(visibility);
        }
    }
    
    public final Tweet getTweet() {
        return this.h;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ViewGroup)this.findViewById(2131886945);
        this.d = (UserImageView)this.findViewById(2131886644);
        (this.e = (TweetHeaderView)this.findViewById(2131886123)).a(true);
        this.e.setShowTimestamp(false);
        (this.f = (TweetContentView)this.findViewById(2131886102)).setFontSize(this.p);
        this.g = (InlineActionsView)this.findViewById(2131887312);
        this.o.put(0, (Object)this.findViewById(2131887311));
        this.o.put(1, (Object)this.findViewById(2131887313));
        this.o.put(2, (Object)this.findViewById(2131887310));
        this.n = new ws(this, wr.a(), 2130838723, 2130838724, 2130838725, 2130838722);
    }
    
    public void setBadgeLocation(final int u) {
        if (this.u != u) {
            final int[] v = this.v;
            for (int length = v.length, i = 0; i < length; ++i) {
                final BadgeView badgeView = (BadgeView)this.o.get(v[i]);
                if (badgeView != null) {
                    badgeView.setVisibility(8);
                }
            }
            if (this.u == 2) {
                this.e.a(true);
            }
            if (u == 2) {
                this.e.a(false);
            }
            this.u = u;
        }
    }
    
    public void setFriendshipCache(final FriendshipCache m) {
        this.m = m;
    }
    
    public void setTweetActionsHandler(final ul l) {
        this.l = l;
    }
    
    public void setTweetViewClickHandler(final xa k) {
        this.k = k;
    }
}
