// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.h;
import com.twitter.library.api.Conversation$Metadata;
import android.content.res.Resources;
import com.twitter.library.util.aj;
import com.twitter.android.events.c;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.provider.bb;
import com.twitter.library.api.timeline.w;
import android.view.View$OnClickListener;
import com.twitter.library.api.Prompt;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.TwitterTopic;
import android.view.ViewStub;
import com.twitter.android.trends.b;
import com.twitter.android.widget.EventView;
import com.twitter.util.f;
import com.twitter.library.provider.cn;
import android.database.Cursor;
import com.twitter.internal.android.widget.GroupedRowView;
import android.text.TextUtils;
import android.widget.TextView;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import android.os.Bundle;
import com.twitter.library.api.PromotedContent;
import java.util.Collections;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.TweetEntities;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.view.ViewParent;
import com.twitter.android.widget.cr;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity;
import android.graphics.drawable.Drawable;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo;
import android.view.ViewConfiguration;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import android.util.SparseArray;
import com.twitter.android.util.av;
import com.twitter.android.trends.n;
import android.view.LayoutInflater;
import java.util.HashMap;
import com.twitter.android.widget.eb;

public class tl extends it implements eb
{
    private final int h;
    private final pb i;
    private final HashMap j;
    private int k;
    private mz l;
    private int m;
    private ul n;
    private final LayoutInflater o;
    private final n p;
    private final int q;
    private av r;
    private SparseArray s;
    private boolean t;
    private final boolean u;
    
    public tl(final TwitterFragmentActivity twitterFragmentActivity, final int n, final int h, final boolean b, final boolean b2, final int m, final z z, final vf vf, final pb i, final FriendshipCache friendshipCache, final TwitterScribeAssociation twitterScribeAssociation, final boolean u) {
        super(twitterFragmentActivity, n, b, b2, z, vf, friendshipCache, h, twitterScribeAssociation);
        this.j = new HashMap();
        this.h = h;
        this.i = i;
        this.m = m;
        this.o = LayoutInflater.from((Context)twitterFragmentActivity);
        this.q = ViewConfiguration.get((Context)twitterFragmentActivity).getScaledTouchSlop();
        this.g();
        this.p = new n(twitterFragmentActivity.getResources());
        this.u = u;
    }
    
    private Drawable a(final TwitterTopic$TrendsPlus$ContextInfo twitterTopic$TrendsPlus$ContextInfo) {
        if (twitterTopic$TrendsPlus$ContextInfo != null) {
            final TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity velocity = twitterTopic$TrendsPlus$ContextInfo.velocity;
            int a;
            if (velocity != null) {
                a = velocity.a();
            }
            else {
                a = -1;
            }
            return (Drawable)this.s.get(a);
        }
        return null;
    }
    
    private View a(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130968803, (ViewGroup)null);
        final to to = new to(inflate);
        inflate.setTag((Object)new tr().a(to).a(6).a());
        to.a.setOnPageChangeListener(new cr(this.b, to.a, (ViewParent)viewGroup, this.q));
        return inflate;
    }
    
    private List a(final List list) {
        if (!CollectionUtils.a((Collection)list)) {
            return com.twitter.library.media.util.q.d(list.get(0).media, Size.a);
        }
        return Collections.emptyList();
    }
    
    private void a(final int n, final View view, final PromotedContent promotedContent, final String s, final boolean b, final int n2, final boolean b2) {
        if (this.l != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("position", n);
            bundle.putLong("entity_id", this.d(n));
            bundle.putString("name", s);
            bundle.putBoolean("isread", b);
            bundle.putInt("changes", n2);
            bundle.putString("description", TwitterTopic$TrendsPlus.a(b2));
            this.l.a(view, promotedContent, bundle);
        }
    }
    
    private void a(final TextView textView, final String text) {
        if (textView != null) {
            textView.setText((CharSequence)text);
            int visibility;
            if (TextUtils.isEmpty((CharSequence)text)) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            textView.setVisibility(visibility);
        }
    }
    
    private static void a(final GroupedRowView groupedRowView, final int n, final boolean b, final boolean b2, final boolean b3) {
        switch (n) {
            default: {}
            case 0: {
                a(groupedRowView, b, b2, b3);
            }
            case 1: {
                a(groupedRowView, b, b2);
            }
        }
    }
    
    private static void a(final GroupedRowView groupedRowView, final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        if (!b2) {
            if (b3) {
                switch (n) {
                    default: {
                        if (!b) {
                            groupedRowView.setStyle(2);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (b4) {
                            groupedRowView.setStyle(2);
                            return;
                        }
                        if (b && !b5) {
                            groupedRowView.a();
                            return;
                        }
                        groupedRowView.setStyle(0);
                    }
                }
            }
            else {
                if (b4) {
                    groupedRowView.setStyle(2);
                    return;
                }
                if (n == 4) {
                    groupedRowView.setStyle(2);
                    return;
                }
                groupedRowView.setStyle(0);
            }
        }
    }
    
    private static void a(final GroupedRowView groupedRowView, final boolean b, final boolean b2) {
        if (b || b2) {
            groupedRowView.setStyle(2);
        }
        groupedRowView.setGroupStyle(2);
    }
    
    private static void a(final GroupedRowView groupedRowView, final boolean b, final boolean b2, final boolean b3) {
        if (b && b2) {
            if (b3) {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(3);
            }
            else {
                groupedRowView.setSingle(true);
            }
        }
        else {
            groupedRowView.setSingle(false);
            if (b3) {
                groupedRowView.setStyle(2);
            }
            else if (b) {
                groupedRowView.setStyle(1);
            }
            else if (b2) {
                groupedRowView.setStyle(3);
            }
        }
        groupedRowView.setGroupStyle(2);
    }
    
    private View b(final Context context) {
        return new View(context);
    }
    
    private View b(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969139, viewGroup, false);
        final ts ts = new ts(inflate);
        ts.c.setTextSize(0, this.p.a());
        inflate.setTag((Object)new tr().a(ts).a(2).a());
        return inflate;
    }
    
    private int c(final Cursor cursor) {
        final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)com.twitter.util.f.a(cursor.getBlob(cn.D));
        final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(cursor.getBlob(cn.C));
        final String string = cursor.getString(cn.w);
        boolean b;
        if (promotedContent != null) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (twitterTopic$TrendsPlus != null && twitterTopic$TrendsPlus.isDegraded) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)string);
        if (b && b2) {
            return 16;
        }
        if (b2) {
            return 15;
        }
        if (b && empty) {
            return 17;
        }
        if (b) {
            return 13;
        }
        if (empty) {
            return 14;
        }
        return 9;
    }
    
    private View c(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969153, viewGroup, false);
        final float a = this.p.a();
        final float c = this.p.c();
        final tx tx = new tx(inflate);
        tx.f.b.setTextSize(0, a);
        tx.c.setTextSize(0, a);
        tx.b.setTextSize(0, a);
        tx.h.setTextSize(0, c);
        inflate.setTag((Object)new tr().a(tx).a(5).a("trendsplus").a());
        return inflate;
    }
    
    public static boolean c(final int n) {
        return n == 0 || n == 1 || n == 3 || n == 4 || n == 10 || n == 11 || n == 12;
    }
    
    private View d(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969157, viewGroup, false);
        final float a = this.p.a();
        final float c = this.p.c();
        final tw tw = new tw(inflate);
        tw.e.b.setTextSize(0, a);
        tw.b.setTextSize(0, a);
        tw.c.setTextSize(0, c);
        inflate.setTag((Object)new tr().a(tw).a(5).a("trendsplus").a());
        return inflate;
    }
    
    private View e(final int n) {
        final View inflate = this.o.inflate(n, (ViewGroup)null);
        inflate.setTag((Object)new tr().a((EventView)inflate.findViewById(2131886242)).a(1).a());
        return inflate;
    }
    
    private View e(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969156, viewGroup, false);
        final float a = this.p.a();
        final tw tw = new tw(inflate);
        tw.e.b.setTextSize(0, a);
        tw.b.setTextSize(0, a);
        inflate.setTag((Object)new tr().a(tw).a(5).a("trendsplus").a());
        return inflate;
    }
    
    private View f(final int n) {
        return this.a(n, null);
    }
    
    private View f(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969143, viewGroup, false);
        final float a = this.p.a();
        final tx tx = new tx(inflate);
        tx.f.b.setTextSize(0, a);
        tx.c.setTextSize(0, a);
        tx.b.setTextSize(0, a);
        inflate.setTag((Object)new tr().a(tx).a(5).a("trendsplus").a());
        return inflate;
    }
    
    private View g(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969150, viewGroup, false);
        final float a = this.p.a();
        final float b = this.p.b();
        final tv tv = new tv(inflate);
        tv.b.b.setTextSize(0, b);
        tv.a.setTextSize(0, a);
        inflate.setTag((Object)new tr().a(tv).a(5).a("trendsplus").a());
        return inflate;
    }
    
    private void g() {
        if (this.h == 28) {
            this.s = com.twitter.android.trends.b.a((Context)this.a);
        }
    }
    
    private static boolean g(final int n) {
        return n == 0;
    }
    
    private View h() {
        final View inflate = this.o.inflate(2130968789, (ViewGroup)null);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131886792);
        viewStub.setLayoutResource(2130969166);
        viewStub.inflate();
        this.a(inflate);
        if (16 == this.h) {
            inflate.setTag((Object)new tr().a((xb)inflate.getTag()).a(4).a());
        }
        return inflate;
    }
    
    private View h(final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(2130969151, viewGroup, false);
        final float a = this.p.a();
        final float b = this.p.b();
        final tu tu = new tu(inflate);
        tu.c.b.setTextSize(0, b);
        tu.b.setTextSize(0, a);
        inflate.setTag((Object)new tr().a(tu).a(5).a("trendsplus").a());
        return inflate;
    }
    
    @Override
    protected int H_() {
        return cn.d;
    }
    
    @Override
    protected Bundle a(final hk hk, final int n) {
        final Bundle a = super.a(hk, n);
        final TimelineScribeContent b = hk.b;
        if (b != null) {
            a.putInt("cursor", b.tweetProofCursor);
            a.putString("entity_type", TwitterTopic.c(b.eventType));
            a.putString("query", b.query);
            a.putLong("tweet_count", b.tweetCount);
        }
        return a;
    }
    
    View a(final int n, final ViewGroup viewGroup) {
        final View inflate = this.o.inflate(n, viewGroup, false);
        inflate.setTag((Object)new tr().a(new sz(inflate)).a(3).a());
        return inflate;
    }
    
    protected View a(final Context context) {
        final GroupedRowView groupedRowView = new GroupedRowView(context);
        final UmfInlinePromptView umfInlinePromptView = new UmfInlinePromptView(context);
        umfInlinePromptView.setLayoutParams((ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2));
        umfInlinePromptView.f();
        groupedRowView.addView((View)umfInlinePromptView);
        groupedRowView.setTag((Object)new tp(umfInlinePromptView));
        return (View)groupedRowView;
    }
    
    @Override
    protected Tweet a(final View view, final hk hk, final int n) {
        final Tweet a = super.a(view, hk, n);
        final TweetView f = ((xb)view.getTag()).f;
        if (this.r != null) {
            final com.twitter.android.util.b a2 = this.r.a();
            final Prompt a3 = a2.a(a.Q);
            if (a3 == null) {
                f.setShowActionPrompt(false);
                return a;
            }
            if (a3.c() && a3.k()) {
                f.setShowActionPrompt(false);
                a2.b(a.Q);
                return a;
            }
            f.a(a3, 2131493186);
            a3.a(true);
            a3.d();
            this.b.a(a3.b);
        }
        return a;
    }
    
    @Override
    protected lv a(final int n) {
        return new hg(true, n);
    }
    
    @Override
    public void a(final View view, final int n, final int n2, final int n3) {
        final hh hh = (hh)this.g.b(this.getItem(Math.max(n - n2, 0)));
        if (hh instanceof he) {
            this.a(view, (he)hh);
        }
    }
    
    protected void a(final View view, final hc hc) {
        final tp tp = (tp)view.getTag();
        final Prompt a = tp.a.a;
        if (a != null && a.equals(hc.a) && tp.a.e()) {
            tp.a.c();
            tp.a.f();
            return;
        }
        tp.a.a(hc.a);
    }
    
    void a(final View view, final he he) {
        final tq tag = (tq)view.getTag();
        view.findViewById(2131886108).setTag((Object)tag);
        if (this.i != null) {
            view.findViewById(2131886108).setOnClickListener((View$OnClickListener)this.i);
        }
        if (he.a != null) {
            tag.m = he.a;
            tag.i.a.setText((CharSequence)he.a.header);
        }
    }
    
    public void a(final mz l) {
        this.l = l;
    }
    
    public void a(final ul n) {
        this.n = n;
    }
    
    public void a(final av r) {
        this.r = r;
    }
    
    public void a(final boolean t) {
        this.t = t;
    }
    
    @Override
    protected boolean a(final Cursor cursor) {
        return cursor.getInt(cn.f) == 5;
    }
    
    @Override
    public int a_(final int n, final int n2) {
        final boolean e = w.e();
        int n3 = 0;
        if (e) {
            final int n4 = n - n2;
            n3 = 0;
            if (n4 >= 0) {
                final Cursor cursor = this.getCursor();
                n3 = 0;
                if (cursor != null) {
                    final int position = cursor.getPosition();
                    final boolean moveToPosition = cursor.moveToPosition(n4);
                    n3 = 0;
                    if (moveToPosition) {
                        boolean b;
                        if (4 == cursor.getInt(cn.e)) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final boolean boolean1 = cursor.getExtras().getBoolean("entity_group_end");
                        if (b && boolean1) {
                            n3 = 2;
                        }
                        else {
                            n3 = 0;
                            if (b) {
                                n3 = 1;
                            }
                        }
                    }
                    if (position != n4) {
                        cursor.moveToPosition(position);
                    }
                }
            }
        }
        return n3;
    }
    
    public boolean b() {
        return this.t;
    }
    
    public boolean b(final int n) {
        return this.getItemViewType(n) == 11;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final int int1 = cursor.getInt(cn.h);
        final int int2 = cursor.getInt(cn.e);
        final int position = cursor.getPosition();
        final int itemViewType = this.getItemViewType(position);
        final Bundle extras = cursor.getExtras();
        final boolean boolean1 = extras.getBoolean("entity_group_start");
        final boolean boolean2 = extras.getBoolean("entity_group_end");
        final boolean boolean3 = extras.getBoolean("entity_start");
        final boolean boolean4 = extras.getBoolean("entity_end");
        extras.putInt("position", cursor.getPosition());
        while (true) {
            switch (itemViewType) {
                default: {
                    super.bindView(view, context, cursor);
                    if (bb.e(int1)) {
                        final xb xb = (xb)view.getTag();
                        xb.f.e(xb.f.getTweet().q());
                        if (bb.j(int1)) {
                            final Tweet tweet = xb.f.getTweet();
                            this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).b("instant_timeline", null, tweet.af(), "tweet", "impression")).a(tweet.D));
                        }
                    }
                    else if (bb.m(int1)) {
                        ((xb)view.getTag()).f.e(false);
                    }
                    if (this.h == 0 && this.a(cursor)) {
                        this.b.a(this.c.b().g(), "home::gap::impression");
                    }
                    break Label_0392;
                }
                case 20: {
                    this.a(view, ((hs)this.g.b(cursor)).b.get(0), position);
                    ((xb)view.getTag()).f.e(true);
                    break Label_0392;
                }
                case 19: {
                    this.a(view, (hk)this.g.c(cursor), position);
                    break Label_0392;
                }
                case 12: {
                    this.a(view, (he)this.g.b(cursor));
                    break Label_0392;
                }
                case 10:
                case 11: {
                    if (itemViewType == 11 && !this.t) {
                        this.t = true;
                    }
                    this.a(view, (hc)this.g.b(cursor));
                    break Label_0392;
                }
                case 7: {
                    ((tq)view.getTag()).i.a.setText(2131296457);
                    break Label_0392;
                }
                case 9:
                case 14: {
                    final hn hn = (hn)this.g.b(cursor);
                    final tq tq = (tq)view.getTag();
                    final tx d = tq.d;
                    final View i = d.i;
                    int visibility;
                    if (cursor.isLast()) {
                        visibility = 4;
                    }
                    else {
                        visibility = 0;
                    }
                    i.setVisibility(visibility);
                    int rank;
                    String metaDescription;
                    Drawable a;
                    List a2;
                    int changedFields;
                    if (hn.e != null) {
                        rank = hn.e.rank;
                        metaDescription = hn.e.metaDescription;
                        a = this.a(hn.e.contextInfo);
                        a2 = this.a(hn.e.mediaInfo);
                        changedFields = hn.e.changedFields;
                    }
                    else {
                        rank = -1;
                        a2 = null;
                        a = null;
                        changedFields = 0;
                        metaDescription = null;
                    }
                    tq.r = hn.a;
                    d.f.b.setText((CharSequence)hn.b);
                    this.a(d.b, String.valueOf(rank));
                    this.a(d.h, hn.d);
                    this.a(d.c, metaDescription);
                    d.a.setImageDrawable(a);
                    d.d.setMediaEntities(a2);
                    d.d.setBadgeText(2131297946);
                    if (!CollectionUtils.a((Collection)a2)) {
                        d.d.setVisibility(0);
                        d.e.setVisibility(0);
                        d.g.setVisibility(0);
                    }
                    else {
                        d.d.setVisibility(8);
                        d.e.setVisibility(8);
                        d.g.setVisibility(8);
                    }
                    this.a(position, view, null, hn.b, hn.f, changedFields, false);
                    break Label_0392;
                }
                case 16: {
                    final hn hn2 = (hn)this.g.b(cursor);
                    final tq tq2 = (tq)view.getTag();
                    final tu g = tq2.g;
                    final Resources resources = context.getResources();
                    tq2.r = hn2.a;
                    g.c.b.setText((CharSequence)hn2.b);
                    g.b.setText((CharSequence)resources.getString(2131297492, new Object[] { hn2.c.advertiserName }));
                    if (hn2.c.a()) {
                        g.a.setImageDrawable(resources.getDrawable(2130838723));
                    }
                    else {
                        g.a.setImageDrawable(resources.getDrawable(2130838724));
                    }
                    this.a(position, view, hn2.c, hn2.b, true, 0, true);
                    break Label_0392;
                }
                case 15: {
                    final hn hn3 = (hn)this.g.b(cursor);
                    final tq tq3 = (tq)view.getTag();
                    final tv f = tq3.f;
                    String metaDescription2;
                    if (hn3.e != null) {
                        metaDescription2 = hn3.e.metaDescription;
                    }
                    else {
                        metaDescription2 = null;
                    }
                    tq3.r = hn3.a;
                    f.b.b.setText((CharSequence)hn3.b);
                    this.a(f.a, metaDescription2);
                    this.a(position, view, null, hn3.b, true, 0, true);
                    break Label_0392;
                }
                case 13:
                case 17: {
                    final hn hn4 = (hn)this.g.b(cursor);
                    final tq tq4 = (tq)view.getTag();
                    final tw e = tq4.e;
                    final Resources resources2 = context.getResources();
                    final View d2 = e.d;
                    int visibility2;
                    if (cursor.isLast()) {
                        visibility2 = 4;
                    }
                    else {
                        visibility2 = 0;
                    }
                    d2.setVisibility(visibility2);
                    tq4.r = hn4.a;
                    e.e.b.setText((CharSequence)hn4.b);
                    this.a(e.c, hn4.d);
                    e.b.setText((CharSequence)resources2.getString(2131297492, new Object[] { hn4.c.advertiserName }));
                    if (hn4.c.a()) {
                        e.a.setImageDrawable(resources2.getDrawable(2130838723));
                    }
                    else {
                        e.a.setImageDrawable(resources2.getDrawable(2130838724));
                    }
                    this.a(position, view, hn4.c, hn4.b, true, 0, false);
                    break Label_0392;
                }
                case 3:
                case 4: {
                    final boolean b = !boolean3;
                    final boolean b2 = !boolean4;
                    xb j;
                    if (16 == this.h) {
                        j = ((tq)view.getTag()).j;
                    }
                    else {
                        j = (xb)view.getTag();
                    }
                    this.a(view, (hk)this.g.b(cursor), position);
                    j.f.a(b, b2);
                    break Label_0392;
                }
                case 2: {
                    final gx gx = (gx)this.g.b(cursor);
                    final tn a3 = ((tq)view.getTag()).a;
                    long targetTweetId = 0L;
                    final Conversation$Metadata a4 = gx.a;
                    String text;
                    if (a4 != null) {
                        targetTweetId = a4.targetTweetId;
                        text = context.getResources().getQuantityString(2131427348, a4.targetCount, new Object[] { a4.targetCount });
                    }
                    else {
                        text = context.getString(2131297975);
                    }
                    a3.c = targetTweetId;
                    a3.b.setText((CharSequence)text);
                    a3.a.getLayoutParams().width = com.twitter.library.experiments.b.d();
                    a3.a.requestLayout();
                }
                case 8:
                case 21:
                case 22: {
                    if (18 == itemViewType) {
                        final GroupedRowView groupedRowView = (GroupedRowView)view;
                        groupedRowView.setSingle(false);
                        groupedRowView.setGroupStyle(0);
                        groupedRowView.setStyle(0);
                    }
                    else if (itemViewType != 8 && itemViewType != 19) {
                        final GroupedRowView groupedRowView2 = (GroupedRowView)view;
                        final boolean first = cursor.isFirst();
                        a(groupedRowView2, this.m, boolean1, boolean2, first);
                        a(groupedRowView2, int2, boolean1, boolean2, boolean3, boolean4, first);
                    }
                }
                case 18: {
                    final hf hf = (hf)this.g.b(cursor);
                    final tq tq5 = (tq)view.getTag();
                    tq5.l = hf.a;
                    final to b3 = tq5.b;
                    final int d3 = b3.d;
                    final int int3 = extras.getInt("data_type_source_start");
                    boolean b4;
                    if (hf.n != b3.b) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    boolean b5;
                    if (d3 != int3) {
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    if (!b4 && !b5) {
                        final int currentItem = b3.a.getCurrentItem();
                        final wp wp = (wp)b3.a.getAdapter();
                        final ln b6 = hf.b;
                        int currentItem2;
                        if (currentItem < b6.a()) {
                            currentItem2 = currentItem;
                        }
                        else {
                            currentItem2 = 0;
                        }
                        wp.a(b6);
                        b3.a.setCurrentItem(currentItem2);
                        continue;
                    }
                    b3.b = hf.n;
                    b3.d = int3;
                    final wp adapter = new wp(this.a, this.d, this.n, this.e, this.c(), 2130969161, hf.n);
                    int currentItem3;
                    if (b4) {
                        currentItem3 = 0;
                    }
                    else {
                        currentItem3 = b3.a.getCurrentItem();
                    }
                    adapter.a(hf.b);
                    b3.a.setClipToPadding(false);
                    b3.a.setPageMargin(this.mContext.getResources().getDimensionPixelSize(2131558972));
                    b3.a.setAdapter(adapter);
                    b3.a.setCurrentItem(currentItem3);
                    if (this.l != null) {
                        this.l.a(view, null, extras);
                    }
                    continue;
                }
                case 5: {
                    final com.twitter.android.events.sports.f f2 = (com.twitter.android.events.sports.f)this.g.b(cursor);
                    final tq tq6 = (tq)view.getTag();
                    tq6.l = f2.k;
                    if (this.h == 16) {
                        extras.putInt("tweet_count", f2.m);
                    }
                    tq6.h.a(f2.a, f2.b, f2.c, f2.e, f2.f, f2.d, f2.l, f2.m, -1L, f2.h, f2.i, f2.g, g(this.h), true, null, null, null, null, f2.j);
                    tq6.o = TwitterTopic.c(f2.b);
                    tq6.n = "event";
                    tq6.q = 16;
                    tq6.r = f2.a;
                    if (this.l != null) {
                        this.l.a(view, null, extras);
                    }
                    continue;
                }
                case 6: {
                    final c c = (c)this.g.b(cursor);
                    final tq tq7 = (tq)view.getTag();
                    tq7.r = c.a;
                    tq7.n = "trend";
                    final ts c2 = tq7.c;
                    c2.c.setText((CharSequence)c.b);
                    extras.putString("entity_type", TwitterTopic.c(c.c.type));
                    if (c.d == 2) {
                        c2.f = c.e;
                    }
                    final PromotedContent f3 = c.f;
                    if (f3 != null) {
                        c2.e.setVisibility(8);
                        if (f3.b()) {
                            c2.d.setVisibility(8);
                        }
                        else {
                            c2.d.setVisibility(0);
                            if (!TextUtils.isEmpty((CharSequence)f3.advertiserName)) {
                                c2.d.setText((CharSequence)context.getString(2131297492, new Object[] { f3.advertiserName }));
                            }
                            if (f3.a()) {
                                c2.d.setCompoundDrawablesWithIntrinsicBounds(2130838723, 0, 0, 0);
                            }
                            else {
                                c2.d.setCompoundDrawablesWithIntrinsicBounds(2130838724, 0, 0, 0);
                            }
                        }
                    }
                    else {
                        c2.d.setVisibility(8);
                        int n = 0;
                        switch (c.c.type) {
                            default: {
                                if (c.c.spiking) {
                                    n = 2130839436;
                                    break;
                                }
                                n = 2130839446;
                                break;
                            }
                            case 2: {
                                n = 2130839443;
                                break;
                            }
                        }
                        c2.b.setDefaultDrawable(this.mContext.getResources().getDrawable(n));
                        final int g2 = c.g;
                        if (g2 > 0) {
                            int n2 = 0;
                            switch (c.c.type) {
                                default: {
                                    n2 = 2131296953;
                                    break;
                                }
                                case 1: {
                                    n2 = 2131296954;
                                    break;
                                }
                                case 2: {
                                    n2 = 2131296953;
                                    break;
                                }
                            }
                            c2.e.setText((CharSequence)context.getString(n2, new Object[] { aj.b(context.getResources(), g2) }));
                            c2.e.setVisibility(0);
                        }
                        else {
                            c2.e.setVisibility(8);
                        }
                    }
                    if (this.l != null) {
                        int p3;
                        if (!this.j.containsKey(c.a)) {
                            p3 = this.k;
                            this.j.put(c.a, this.k);
                            ++this.k;
                        }
                        else {
                            p3 = this.j.get(c.a);
                        }
                        extras.putInt("trend_cursor", tq7.p = p3);
                        extras.putInt("tweet_count", c.g);
                        this.l.a(view, f3, extras);
                    }
                    continue;
                }
            }
            break;
        }
    }
    
    public long d(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (cursor != null) {
            return cursor.getLong(cn.d);
        }
        return -1L;
    }
    
    @Override
    public int getItemViewType(final int n) {
        int itemViewType = 8;
        final Cursor cursor = (Cursor)this.getItem(n);
        final int int1 = cursor.getInt(cn.h);
        final int int2 = cursor.getInt(cn.f);
        final boolean boolean1 = cursor.getExtras().getBoolean("entity_group_end");
        switch (int2) {
            case 2: {
                if (boolean1) {
                    return 7;
                }
                if (bb.b(int1)) {
                    return 2;
                }
                if (bb.l(int1)) {
                    int n2;
                    if (w.e()) {
                        n2 = 12;
                    }
                    else {
                        n2 = itemViewType;
                    }
                    return n2;
                }
                if (!bb.n(int1)) {
                    break;
                }
                if (w.t()) {
                    return 21;
                }
                return itemViewType;
            }
            case 1: {
                if (bb.c(int1)) {
                    return 3;
                }
                if (bb.d(int1)) {
                    return 4;
                }
                if (bb.m(int1) && !w.e()) {
                    return itemViewType;
                }
                if (bb.f(int1)) {
                    if (com.twitter.library.api.h.d()) {
                        return 18;
                    }
                    return itemViewType;
                }
                else {
                    if (this.u && ov.a_(cursor)) {
                        return 19;
                    }
                    if (!bb.o(int1)) {
                        break;
                    }
                    if (w.f()) {
                        return 20;
                    }
                    return itemViewType;
                }
                break;
            }
            case 3: {
                if (bb.k(int1)) {
                    return 5;
                }
                break;
            }
            case 7: {
                if (16 == this.h) {
                    return 6;
                }
                if (28 == this.h) {
                    return this.c(cursor);
                }
                break;
            }
            case 6: {
                int n3;
                if (bb.u(int1)) {
                    n3 = 11;
                }
                else {
                    n3 = 10;
                }
                return n3;
            }
            case 8: {
                if (!bb.p(int1)) {
                    break;
                }
                if (w.t()) {
                    return 22;
                }
                return itemViewType;
            }
        }
        itemViewType = super.getItemViewType(n);
        return itemViewType;
    }
    
    @Override
    public int getViewTypeCount() {
        return 23;
    }
    
    public boolean isEnabled(final int n) {
        final int itemViewType = this.getItemViewType(n);
        return itemViewType != 10 && itemViewType != 11 && itemViewType != 12 && super.isEnabled(n);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        switch (this.getItemViewType(cursor.getPosition())) {
            default: {
                return super.newView(context, cursor, viewGroup);
            }
            case 2: {
                final View inflate = this.o.inflate(2130968788, (ViewGroup)null);
                inflate.setTag((Object)new tr().a(new tn(inflate)).a(0).a());
                return inflate;
            }
            case 3: {
                return this.h();
            }
            case 4: {
                return this.h();
            }
            case 5: {
                return this.e(2130968801);
            }
            case 6: {
                return this.b(viewGroup);
            }
            case 9: {
                return this.c(viewGroup);
            }
            case 13: {
                return this.d(viewGroup);
            }
            case 17: {
                return this.e(viewGroup);
            }
            case 14: {
                return this.f(viewGroup);
            }
            case 15: {
                return this.g(viewGroup);
            }
            case 16: {
                return this.h(viewGroup);
            }
            case 7: {
                return this.f(2130968795);
            }
            case 12: {
                return this.f(2130968790);
            }
            case 8: {
                return this.b(context);
            }
            case 18: {
                return this.a(viewGroup);
            }
            case 10:
            case 11: {
                return this.a(context);
            }
            case 19: {
                final View a = ov.a(context);
                this.a(a);
                return a;
            }
        }
    }
}
