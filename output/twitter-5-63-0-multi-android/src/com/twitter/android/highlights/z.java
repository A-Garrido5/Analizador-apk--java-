// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import java.util.Iterator;
import com.twitter.library.media.widget.e;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.FrameLayout;
import android.support.annotation.LayoutRes;
import android.widget.TextView;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.media.widget.TweetMediaView;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.view.k;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import com.twitter.library.media.widget.s;
import com.twitter.library.widget.ad;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.LayoutInflater;
import android.content.res.Resources;
import com.twitter.library.util.bk;
import com.twitter.library.util.bj;
import com.twitter.library.provider.Tweet;
import android.support.annotation.StringRes;
import com.twitter.android.widget.highlights.a;
import com.twitter.android.widget.highlights.b;
import com.twitter.android.widget.highlights.p;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;
import android.graphics.drawable.Drawable;

public class z
{
    private final Drawable a;
    private final Map b;
    
    public z(final Context context) {
        this.b = new HashMap();
        this.a = (Drawable)new b(GradientDrawable$Orientation.BOTTOM_TOP, new p(context.getResources()));
    }
    
    @StringRes
    static int a(final int n) {
        switch (n) {
            default: {
                return 2131297068;
            }
            case 0:
            case 1:
            case 3:
            case 4: {
                return 2131297072;
            }
            case 2: {
                return 2131297067;
            }
            case 5: {
                return 2131297070;
            }
            case 7: {
                return 2131297071;
            }
            case 6: {
                return 2131297069;
            }
            case 8:
            case 9: {
                return 2131297073;
            }
            case 11: {
                return 2131297074;
            }
        }
    }
    
    public static String a(final Context context, final Tweet tweet) {
        final Resources resources = context.getResources();
        String s;
        String s2;
        if (bj.e) {
            s = '\u200e' + bk.a(resources, tweet.A);
            s2 = resources.getString(2131298173, new Object[] { tweet.z });
        }
        else {
            s = resources.getString(2131298173, new Object[] { tweet.z });
            s2 = bk.a(resources, tweet.A);
        }
        return s + resources.getString(2131298184) + s2;
    }
    
    @TargetApi(16)
    private void a(final af af, final ag tag, final Context context, final LayoutInflater layoutInflater, final y y) {
        if (tag.x != null) {
            a(af.b(2), true, (View)tag.y, (View$OnClickListener)y);
            a(af.b(4), true, (View)tag.z, (View$OnClickListener)y);
            a(af.b(1), true, (View)tag.A, (View$OnClickListener)y);
            a(af.b(8), false, (View)tag.B, (View$OnClickListener)y);
        }
        if (tag.C != null) {
            tag.C.setTag((Object)tag);
            tag.C.setObservableScrollViewListener(y);
        }
        switch (af.a()) {
            default: {}
            case 0: {
                this.a((ax)tag, y);
            }
            case 1: {
                final at at = (at)tag;
                this.a(at, y);
                at.a.setOnMediaClickListener(y);
            }
            case 2: {
                final av tag2 = (av)tag;
                tag2.C.setTag((Object)tag2);
                tag2.C.setObservableScrollViewListener(y);
                tag2.a.setOnClickListener((View$OnClickListener)y);
                tag2.j.setOnClickListener((View$OnClickListener)y);
                tag2.g.setOnMediaClickListener(y);
                a(true, true, (View)tag2.h, (View$OnClickListener)y);
                tag2.G.setOnMediaClickListener(y);
                a(true, true, (View)tag2.p, (View$OnClickListener)y);
            }
            case 3: {
                final ak ak = (ak)tag;
                this.a(ak, y);
                ak.a.setOnClickListener((View$OnClickListener)y);
            }
            case 5: {
                final d d = (d)tag;
                d.a.setOnClickListener((View$OnClickListener)y);
                d.b.setOnClickListener((View$OnClickListener)y);
            }
            case 4:
            case 11: {
                final n n = (n)tag;
                this.a(n, y);
                n.d.setOnClickListener((View$OnClickListener)y);
                n.e.setOnClickListener((View$OnClickListener)y);
                n.f.setOnClickListener((View$OnClickListener)y);
                n.b.setOnClickListener((View$OnClickListener)y);
            }
            case 6:
            case 7:
            case 8:
            case 9: {
                final ai tag3 = (ai)tag;
                tag3.h.setTag((Object)tag3);
                tag3.h.setOnScrollListener((AbsListView$OnScrollListener)y);
                final View inflate = layoutInflater.inflate(2130968835, (ViewGroup)tag3.h, false);
                tag3.h.addHeaderView(inflate);
                tag3.a(inflate);
                if (Build$VERSION.SDK_INT >= 16) {
                    tag3.c.setBackground(this.a);
                }
                else {
                    tag3.c.setBackgroundDrawable(this.a);
                }
                tag3.d.setOnClickListener((View$OnClickListener)y);
            }
            case 10: {
                ((i)tag).f.setOnClickListener((View$OnClickListener)y);
            }
            case 12: {
                final com.twitter.android.highlights.b b = (com.twitter.android.highlights.b)tag;
                b.b.setOnClickListener((View$OnClickListener)y);
                b.s.setBackgroundResource(0);
            }
        }
    }
    
    private void a(final aw aw, final ax ax, final Context context, final y y) {
        ax.h.setText((CharSequence)aw.b.a());
        final View i = ax.i;
        int visibility;
        if (aw.b.V) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        i.setVisibility(visibility);
        ax.j.setText((CharSequence)a(context, aw.b));
        ax.k.setText(aw.a(context, y));
        ax.g.setTag((Object)aw.b.F);
        ax.g.a(UserImageRequest.a(aw.b.B));
        final ac ac = new ac(context, aw.b, ax.y, ax.z, StoryScribeItem.a(aw));
        ax.y.setTag((Object)ac);
        ax.z.setTag((Object)ac);
    }
    
    private void a(final ax ax, final y onClickListener) {
        ax.g.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public static void a(final g g, final i i, final Context context) {
        final Resources resources = context.getResources();
        i.w.setText(2131297051);
        switch (g.c()) {
            default: {
                i.s.setBackgroundResource(2130838605);
                i.t.setVisibility(0);
                i.u.setVisibility(0);
                i.b.setVisibility(0);
                i.c.setVisibility(0);
                i.d.setVisibility(8);
                if (g.a) {
                    i.g.setVisibility(8);
                    i.f.setVisibility(0);
                }
                else {
                    i.f.setVisibility(8);
                    i.g.setVisibility(0);
                }
                i.h.setVisibility(8);
                g.a(i, context);
                break;
            }
            case 2: {
                i.s.setBackgroundResource(2130838597);
                i.t.setVisibility(8);
                i.u.setVisibility(8);
                i.b.setVisibility(8);
                i.c.pause();
                i.e.setVisibility(8);
                i.h.setVisibility(0);
                i.i.setVisibility(0);
                i.j.setVisibility(0);
                i.n.setVisibility(0);
                i.o.setVisibility(0);
                i.p.setVisibility(8);
                i.k.setVisibility(0);
                i.l.setVisibility(0);
                i.m.setVisibility(4);
                i.o.setAlpha(1.0f);
                break;
            }
            case 3: {
                i.s.setBackgroundResource(2130838597);
                i.t.setVisibility(8);
                i.u.setVisibility(8);
                i.b.setVisibility(8);
                i.c.pause();
                i.e.setVisibility(8);
                i.h.setVisibility(0);
                i.i.setVisibility(0);
                i.j.setVisibility(0);
                i.n.setVisibility(0);
                i.p.setVisibility(0);
                i.k.setVisibility(0);
                i.l.setVisibility(4);
                i.m.setVisibility(0);
                if (g.d() != g.c()) {
                    final long duration = resources.getInteger(2131623963);
                    final long startDelay = resources.getInteger(2131623964);
                    final LinearInterpolator interpolator = new LinearInterpolator();
                    i.m.setAlpha(0.0f);
                    i.m.animate().alpha(1.0f).setDuration(duration).setStartDelay(startDelay).setInterpolator((TimeInterpolator)interpolator).setListener((Animator$AnimatorListener)null).start();
                    final long n = resources.getInteger(2131623965);
                    i.o.setVisibility(0);
                    i.o.animate().alpha(0.0f).setDuration(n).setStartDelay(0L).setInterpolator((TimeInterpolator)interpolator).setListener((Animator$AnimatorListener)null).start();
                    i.p.setAlpha(0.0f);
                    i.p.animate().alpha(1.0f).setDuration(n).setStartDelay(0L).setInterpolator((TimeInterpolator)interpolator).setListener((Animator$AnimatorListener)null).start();
                    break;
                }
                i.o.setVisibility(8);
                i.p.setAlpha(1.0f);
                break;
            }
            case 1: {
                i.s.setBackgroundResource(2130838605);
                i.t.setVisibility(0);
                i.u.setVisibility(0);
                i.b.setVisibility(0);
                i.c.setVisibility(8);
                i.c.pause();
                i.d.setVisibility(0);
                if (g.a) {
                    i.g.setVisibility(8);
                    i.f.setVisibility(0);
                }
                else {
                    i.f.setVisibility(8);
                    i.g.setVisibility(0);
                }
                i.h.setVisibility(8);
                break;
            }
        }
        g.e();
    }
    
    public static void a(final TweetMediaView tweetMediaView, final View view, final Tweet tag) {
        boolean b = true;
        tweetMediaView.setTag((Object)tag);
        if (!tag.G.media.c()) {
            tweetMediaView.setMediaEntities(tag.G.media);
        }
        else {
            tweetMediaView.setCard(tag.W());
        }
        final boolean c = tweetMediaView.c();
        if (view != null) {
            int visibility = 0;
            if (!c) {
                visibility = 8;
            }
            view.setVisibility(visibility);
        }
        else if (!c) {
            final com.twitter.errorreporter.a a = new com.twitter.errorreporter.a(new InvalidDataException("Tweet without any media is being shown with media"));
            final CardInstanceData w = tag.W();
            final com.twitter.errorreporter.a a2 = a.a("highlightsHasMedia", !tag.G.media.c() && b);
            if (w == null) {
                b = false;
            }
            a2.a("highlightsHasCard", b);
            if (w != null) {
                a.a("highlightsHasPhotoCard", w.m()).a("highlightsHasPlayerCard", w.k());
            }
            ErrorReporter.a(a);
        }
    }
    
    protected static void a(final boolean b, final boolean b2, final View view, final View$OnClickListener onClickListener) {
        if (!b) {
            view.setVisibility(8);
            view.setOnClickListener((View$OnClickListener)null);
        }
        else {
            view.setVisibility(0);
            view.setOnClickListener(onClickListener);
        }
        if (b2 && view instanceof TextView) {
            ((TextView)view).setText((CharSequence)null);
        }
    }
    
    @LayoutRes
    static int b(final int n) {
        if (n == 13) {
            return 2130968836;
        }
        return 2130968813;
    }
    
    @LayoutRes
    static int c(final int n) {
        switch (n) {
            default: {
                throw new RuntimeException("Unsupported story type being processed");
            }
            case 0: {
                return 2130968829;
            }
            case 1: {
                return 2130968831;
            }
            case 2: {
                return 2130968832;
            }
            case 3: {
                return 2130968830;
            }
            case 5: {
                return 2130968827;
            }
            case 11: {
                return 2130968833;
            }
            case 4: {
                return 2130968828;
            }
            case 6:
            case 7:
            case 8:
            case 9: {
                return 2130968834;
            }
            case 12: {
                return 2130968814;
            }
            case 10: {
                return 2130968816;
            }
            case 13: {
                return 2130968817;
            }
        }
    }
    
    public View a(final af af, final Context context, final LayoutInflater layoutInflater, final y y) {
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(2131886125);
        final ViewGroup viewGroup = (ViewGroup)layoutInflater.inflate(b(af.a()), (ViewGroup)frameLayout, false);
        frameLayout.addView((View)viewGroup);
        layoutInflater.inflate(c(af.a()), (ViewGroup)viewGroup.findViewById(2131886805), true);
        if (af.f()) {
            layoutInflater.inflate(2130968826, viewGroup, true);
        }
        this.a(af, af.a((View)frameLayout), context, layoutInflater, y);
        return (View)frameLayout;
    }
    
    public am a(final String s) {
        return this.b.get(s);
    }
    
    @TargetApi(16)
    public void a(final af af, final ag ag, final Context context, final y onClickListener) {
        final Resources resources = context.getResources();
        for (final MediaImageView mediaImageView : ag.v) {
            mediaImageView.a((com.twitter.library.media.manager.k)null);
            mediaImageView.setVisibility(8);
        }
        if (af.g.c != null) {
            for (int min = Math.min(af.g.c.size(), ag.v.size()), i = 0; i < min; ++i) {
                int n;
                if (bj.e) {
                    n = min - (i + 1);
                }
                else {
                    n = i;
                }
                final MediaImageView mediaImageView2 = ag.v.get(n);
                final String a = aa.a(af.g, i);
                if (a != null) {
                    mediaImageView2.setVisibility(0);
                    mediaImageView2.a(UserImageRequest.a(a, mediaImageView2.getWidth()));
                }
            }
        }
        if (ag.w != null) {
            ag.w.setText((CharSequence)aa.a(af.g, context));
        }
        if (ag.B != null) {
            ag.B.setText((CharSequence)resources.getString(a(af.a())));
        }
        switch (af.a()) {
            default: {}
            case 0: {
                this.a((aw)af, (ax)ag, context, onClickListener);
            }
            case 1: {
                final as as = (as)af;
                final at at = (at)ag;
                this.a(as, at, context, onClickListener);
                a(at.a, null, as.b);
            }
            case 2: {
                final au au = (au)af;
                final av av = (av)ag;
                av.b.setText((CharSequence)au.a.a());
                av.c.setText((CharSequence)resources.getString(2131298173, new Object[] { au.a.F }));
                av.e.setText(au.a(context, onClickListener));
                av.d.setText((CharSequence)bk.a(context.getResources(), au.a.A));
                av.a.setTag((Object)au.a.F);
                av.a.a(UserImageRequest.a(au.a.B));
                a(av.g, av.f, au.a);
                final ac ac = new ac(context, au.a, av.h, av.i, StoryScribeItem.a(au));
                av.h.setTag((Object)ac);
                av.i.setTag((Object)ac);
                av.k.setText((CharSequence)au.b.a());
                av.l.setText((CharSequence)resources.getString(2131298173, new Object[] { au.b.F }));
                av.n.setText(au.b(context, onClickListener));
                av.m.setText((CharSequence)bk.a(context.getResources(), au.b.A));
                av.j.setTag((Object)au.b.F);
                av.j.a(UserImageRequest.a(au.b.B));
                a(av.G, av.o, au.b);
                final ac ac2 = new ac(context, au.b, av.p, av.F, StoryScribeItem.a(au));
                av.p.setTag((Object)ac2);
                av.F.setTag((Object)ac2);
            }
            case 3: {
                final aj aj = (aj)af;
                final ak ak = (ak)ag;
                this.a(aj, ak, context, onClickListener);
                ak.a.a(j.a(aj.a));
            }
            case 5: {
                final c c = (c)af;
                final d d = (d)ag;
                d.c.setText((CharSequence)c.a.c());
                d.d.setText((CharSequence)resources.getString(2131298173, new Object[] { c.a.username }));
                if (c.a.verified) {
                    d.e.setVisibility(0);
                }
                else {
                    d.e.setVisibility(8);
                }
                if (c.d) {
                    d.f.setText(c.a(context, onClickListener));
                    d.f.setVisibility(0);
                }
                else {
                    d.f.setVisibility(8);
                }
                d.g.setText(c.b(context, onClickListener));
                d.A.setTag((Object)new ae(context, c.a, d.A, StoryScribeItem.a(c)));
                d.a.setTag((Object)c.a.username);
                d.a.a(UserImageRequest.a(c.a.profileImageUrl));
                if (c.c) {
                    d.b.a(com.twitter.android.profiles.g.a(c.a.profileHeaderImageUrl));
                    return;
                }
                d.b.a((com.twitter.library.media.manager.k)null);
            }
            case 4:
            case 11: {
                final l l = (l)af;
                final n n2 = (n)ag;
                this.a(l, n2, context, onClickListener);
                l.a((ag)n2);
                if (l.a(context, com.twitter.library.network.forecaster.b.a().b())) {
                    l.a(q.a(context).e());
                    return;
                }
                l.a(n2);
                n2.a.setTag((Object)l.b);
            }
            case 6:
            case 7:
            case 8:
            case 9: {
                final ah ah = (ah)af;
                final ai ai = (ai)ag;
                am am = this.b.get(ah.e);
                if (am == null) {
                    am = new am(ah, context, onClickListener);
                    this.b.put(ah.e, am);
                }
                ai.D.setVisibility(0);
                am.a.a(am.c == 0L);
                ai.a(am.a);
                ai.d.setTag((Object)ah.c);
                if (ah.n) {
                    ai.a.a(j.a(ah.d));
                    ai.a.setOnClickListener((View$OnClickListener)onClickListener);
                    ai.b.setVisibility(8);
                    ai.b.setImageResource(0);
                }
                else {
                    ai.a.setOnImageLoadedListener(null);
                    ai.a.a((com.twitter.library.media.manager.k)null);
                    ai.a.setOnClickListener((View$OnClickListener)null);
                    ai.b.setVisibility(0);
                    ai.b.setImageResource(ah.m);
                }
                ai.e.setText((CharSequence)ah.q);
                if (ah.o) {
                    ai.f.setVisibility(0);
                    ai.f.setText((CharSequence)ah.a);
                }
                else {
                    ai.f.setVisibility(8);
                    ai.f.setText((CharSequence)"");
                }
                ai.g.setText((CharSequence)ah.b);
            }
            case 10: {
                a((g)af, (i)ag, context);
            }
            case 12: {
                ag.t.setVisibility(8);
                ag.u.setVisibility(8);
                final com.twitter.android.highlights.a a2 = (com.twitter.android.highlights.a)af;
                final com.twitter.android.highlights.b b = (com.twitter.android.highlights.b)ag;
                switch (a2.a) {
                    default: {
                        b.a.setText((CharSequence)context.getString(2131297046));
                        b.b.setText((CharSequence)context.getString(2131297044));
                        return;
                    }
                    case 1: {
                        b.a.setText((CharSequence)context.getString(2131297045));
                        b.b.setText((CharSequence)context.getString(2131297043));
                        return;
                    }
                }
                break;
            }
        }
    }
}
