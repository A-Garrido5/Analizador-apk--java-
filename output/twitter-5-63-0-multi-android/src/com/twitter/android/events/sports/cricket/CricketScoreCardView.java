// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import java.util.List;
import com.twitter.android.util.q;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import java.util.regex.Pattern;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.RelativeLayout;

public class CricketScoreCardView extends RelativeLayout implements ViewTreeObserver$OnPreDrawListener
{
    private static final String a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final UserImageView e;
    private final UserImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final Context q;
    private String r;
    
    static {
        a = Pattern.quote("|");
    }
    
    public CricketScoreCardView(final Context context) {
        this(context, null, 0);
    }
    
    public CricketScoreCardView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CricketScoreCardView(final Context q, final AttributeSet set, final int n) {
        super(q, set, n);
        LayoutInflater.from(q).inflate(2130968706, (ViewGroup)this, true);
        this.b = (TextView)this.findViewById(2131886605);
        this.c = (TextView)this.findViewById(2131886604);
        this.d = (TextView)this.findViewById(2131886606);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131558911);
        (this.e = (UserImageView)this.findViewById(2131886609)).setSize(dimensionPixelSize);
        (this.f = (UserImageView)this.findViewById(2131886614)).setSize(dimensionPixelSize);
        this.g = (TextView)this.findViewById(2131886611);
        this.h = (TextView)this.findViewById(2131886616);
        this.i = (TextView)this.findViewById(2131886612);
        this.j = (TextView)this.findViewById(2131886617);
        this.k = (TextView)this.findViewById(2131886613);
        this.l = (TextView)this.findViewById(2131886618);
        this.m = (TextView)this.findViewById(2131886607);
        this.n = (TextView)this.findViewById(2131886608);
        this.o = (TextView)this.findViewById(2131886610);
        this.p = (TextView)this.findViewById(2131886615);
        this.q = q;
    }
    
    private void a() {
        final String r = this.r;
        switch (r) {
            default: {}
            case "IN_PROGRESS": {
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                this.k.setVisibility(0);
                this.l.setVisibility(0);
                this.g.setVisibility(0);
                this.h.setVisibility(0);
                this.o.setVisibility(4);
                this.p.setVisibility(4);
                this.b.setVisibility(4);
                this.d.setVisibility(4);
                this.m.setVisibility(4);
                this.n.setVisibility(4);
                this.c.setVisibility(4);
            }
            case "SCHEDULED": {
                final int[] array = new int[2];
                this.p.getLocationOnScreen(array);
                int n2;
                if (this.b.getLeft() < this.d.getLeft()) {
                    n2 = this.b.getLeft();
                }
                else {
                    n2 = this.d.getLeft();
                }
                int n3;
                if (this.b.getRight() > this.d.getRight()) {
                    n3 = this.b.getRight();
                }
                else {
                    n3 = this.d.getRight();
                }
                if (40 + this.o.getRight() > n2 || n3 + 40 > array[0]) {
                    this.o.setVisibility(4);
                    this.p.setVisibility(4);
                }
                else {
                    this.o.setVisibility(0);
                    this.p.setVisibility(0);
                }
                this.b.setVisibility(0);
                this.d.setVisibility(0);
                this.i.setVisibility(4);
                this.j.setVisibility(4);
                this.k.setVisibility(4);
                this.l.setVisibility(4);
                this.g.setVisibility(4);
                this.h.setVisibility(4);
                this.m.setVisibility(4);
                this.n.setVisibility(4);
                this.c.setVisibility(4);
            }
            case "COMPLETED": {
                final int[] array2 = new int[2];
                this.j.getLocationOnScreen(array2);
                if (20 + this.i.getRight() > this.c.getLeft() || 20 + this.c.getRight() > array2[0]) {
                    this.g.setVisibility(4);
                    this.h.setVisibility(4);
                    this.i.setVisibility(4);
                    this.j.setVisibility(4);
                    this.k.setVisibility(4);
                    this.l.setVisibility(4);
                    this.b.setVisibility(0);
                    this.c.setVisibility(4);
                    this.m.setVisibility(0);
                    this.n.setVisibility(0);
                }
                else {
                    this.g.setVisibility(0);
                    this.h.setVisibility(0);
                    this.i.setVisibility(0);
                    this.j.setVisibility(0);
                    this.k.setVisibility(0);
                    this.l.setVisibility(0);
                    this.b.setVisibility(4);
                    this.c.setVisibility(0);
                    this.m.setVisibility(4);
                    this.n.setVisibility(4);
                }
                this.o.setVisibility(4);
                this.p.setVisibility(4);
                this.d.setVisibility(4);
            }
        }
    }
    
    private void a(final View view, final long n, final String s) {
        if (n != 0L && !TextUtils.isEmpty((CharSequence)s)) {
            view.setClickable(true);
            view.setOnClickListener((View$OnClickListener)new a(this, n));
            return;
        }
        view.setClickable(false);
    }
    
    public void a(final TopicView$TopicData topicView$TopicData) {
        final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)com.twitter.util.f.a(topicView$TopicData.m);
        if (twitterTopic$SportsEvent == null || twitterTopic$SportsEvent.status == null || twitterTopic$SportsEvent.players == null) {
            this.setVisibility(8);
            return;
        }
        this.setVisibility(0);
        final List players = twitterTopic$SportsEvent.players;
        final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player = players.get(0);
        final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player2 = players.get(1);
        if (twitterTopic$SportsEvent$Player == null || twitterTopic$SportsEvent$Player2 == null) {
            this.setVisibility(8);
            return;
        }
        this.e.a(twitterTopic$SportsEvent$Player.logoUrl);
        this.f.a(twitterTopic$SportsEvent$Player2.logoUrl);
        this.a((View)this.e, twitterTopic$SportsEvent$Player.userId, twitterTopic$SportsEvent$Player.name);
        this.a((View)this.f, twitterTopic$SportsEvent$Player2.userId, twitterTopic$SportsEvent$Player2.name);
        this.g.setText((CharSequence)twitterTopic$SportsEvent$Player.abbreviation);
        this.h.setText((CharSequence)twitterTopic$SportsEvent$Player2.abbreviation);
        if ("IN_PROGRESS".equals(twitterTopic$SportsEvent.status) || "COMPLETED".equals(twitterTopic$SportsEvent.status)) {
            if (twitterTopic$SportsEvent$Player.score == null || twitterTopic$SportsEvent$Player2.score == null) {
                this.setVisibility(8);
                return;
            }
            final String[] split = twitterTopic$SportsEvent$Player.score.split(CricketScoreCardView.a);
            final String[] split2 = twitterTopic$SportsEvent$Player2.score.split(CricketScoreCardView.a);
            final TextView i = this.i;
            String text;
            if (TextUtils.isEmpty((CharSequence)split[0])) {
                text = "-";
            }
            else {
                text = split[0];
            }
            i.setText((CharSequence)text);
            final TextView j = this.j;
            String text2;
            if (TextUtils.isEmpty((CharSequence)split2[0])) {
                text2 = "-";
            }
            else {
                text2 = split2[0];
            }
            j.setText((CharSequence)text2);
            final TextView k = this.k;
            String text3;
            if (split.length > 1) {
                text3 = split[1];
            }
            else {
                text3 = null;
            }
            k.setText((CharSequence)text3);
            final TextView l = this.l;
            final int length = split2.length;
            CharSequence text4 = null;
            if (length > 1) {
                text4 = split2[1];
            }
            l.setText(text4);
        }
        final String status = twitterTopic$SportsEvent.status;
        switch (status) {
            default: {
                this.setVisibility(8);
            }
            case "SCHEDULED": {
                this.o.setText((CharSequence)twitterTopic$SportsEvent$Player.abbreviation);
                this.p.setText((CharSequence)twitterTopic$SportsEvent$Player2.abbreviation);
                com.twitter.android.util.q.a().a(this.d, topicView$TopicData.l, this.getResources(), true, false);
                this.b.setText((CharSequence)this.getResources().getString(2131296741, new Object[] { twitterTopic$SportsEvent$Player.location, twitterTopic$SportsEvent$Player2.location }));
            }
            case "COMPLETED": {
                if (twitterTopic$SportsEvent$Player.score.endsWith("/50")) {
                    this.m.setText((CharSequence)(twitterTopic$SportsEvent$Player.abbreviation + " " + twitterTopic$SportsEvent$Player.score.replace("|", " (").substring(0, 1 + (twitterTopic$SportsEvent$Player.score.length() - "/50".length())) + ")"));
                }
                else {
                    this.m.setText((CharSequence)(twitterTopic$SportsEvent$Player.abbreviation + " " + twitterTopic$SportsEvent$Player.score.replace("|", " ")));
                }
                if (twitterTopic$SportsEvent$Player2.score.endsWith("/50")) {
                    this.n.setText((CharSequence)(twitterTopic$SportsEvent$Player2.abbreviation + " " + twitterTopic$SportsEvent$Player2.score.replace("|", " (").substring(0, 1 + (twitterTopic$SportsEvent$Player2.score.length() - "/50".length())) + ")"));
                }
                else {
                    this.n.setText((CharSequence)(twitterTopic$SportsEvent$Player2.abbreviation + " " + twitterTopic$SportsEvent$Player2.score.replace("|", " ")));
                }
                this.b.setText((CharSequence)twitterTopic$SportsEvent.summary);
                this.c.setText((CharSequence)twitterTopic$SportsEvent.summary);
            }
            case "IN_PROGRESS": {
                this.r = twitterTopic$SportsEvent.status;
                this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                this.a();
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
    }
    
    public boolean onPreDraw() {
        this.a();
        this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
