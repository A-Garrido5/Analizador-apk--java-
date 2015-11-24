// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.soccer;

import android.content.res.Resources;
import java.util.List;
import com.twitter.android.util.q;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.LinearLayout;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class SoccerScoreCardView extends RelativeLayout
{
    private final TextView a;
    private final UserImageView b;
    private final UserImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final Context h;
    private long i;
    private long j;
    private b k;
    private LinearLayout l;
    private Rect m;
    
    public SoccerScoreCardView(final Context context) {
        this(context, null, 0);
    }
    
    public SoccerScoreCardView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SoccerScoreCardView(final Context h, final AttributeSet set, final int n) {
        super(h, set);
        LayoutInflater.from(h).inflate(2130969113, (ViewGroup)this, true);
        this.a = (TextView)this.findViewById(2131886605);
        this.b = (UserImageView)this.findViewById(2131886609);
        this.c = (UserImageView)this.findViewById(2131886614);
        this.d = (TextView)this.findViewById(2131886612);
        this.e = (TextView)this.findViewById(2131886617);
        this.f = (TextView)this.findViewById(2131886610);
        this.g = (TextView)this.findViewById(2131886615);
        this.l = (LinearLayout)this.findViewById(2131886698);
        this.h = h;
        this.k = new b(this, null);
        this.b.setOnClickListener((View$OnClickListener)this.k);
        this.c.setOnClickListener((View$OnClickListener)this.k);
        this.f.setOnClickListener((View$OnClickListener)this.k);
        this.g.setOnClickListener((View$OnClickListener)this.k);
        this.m = new Rect();
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
        this.b.a(twitterTopic$SportsEvent$Player.logoUrl);
        this.c.a(twitterTopic$SportsEvent$Player2.logoUrl);
        this.f.setText((CharSequence)twitterTopic$SportsEvent$Player.abbreviation);
        this.g.setText((CharSequence)twitterTopic$SportsEvent$Player2.abbreviation);
        this.i = twitterTopic$SportsEvent$Player.userId;
        this.j = twitterTopic$SportsEvent$Player2.userId;
        if (this.i == 0L || TextUtils.isEmpty((CharSequence)twitterTopic$SportsEvent$Player.name)) {
            this.b.setClickable(false);
            this.f.setClickable(false);
        }
        else {
            this.b.setClickable(true);
            this.f.setClickable(true);
        }
        if (this.j == 0L || TextUtils.isEmpty((CharSequence)twitterTopic$SportsEvent$Player2.name)) {
            this.c.setClickable(false);
            this.g.setClickable(false);
        }
        else {
            this.c.setClickable(true);
            this.g.setClickable(true);
        }
        this.d.setText((CharSequence)twitterTopic$SportsEvent$Player.score);
        this.e.setText((CharSequence)twitterTopic$SportsEvent$Player2.score);
        final Resources resources = this.getResources();
        final String status = twitterTopic$SportsEvent.status;
        switch (status) {
            default: {}
            case "IN_PROGRESS": {
                final String summary = twitterTopic$SportsEvent.summary;
                if (!TextUtils.isEmpty((CharSequence)summary)) {
                    this.a.setText((CharSequence)summary);
                    this.a.setBackgroundDrawable((Drawable)null);
                    this.a.setTextColor(resources.getColor(2131689606));
                    return;
                }
                this.a.setText((CharSequence)resources.getString(2131297164));
                this.a.setBackgroundDrawable(resources.getDrawable(2130839504));
                this.a.setTextColor(resources.getColor(2131689637));
            }
            case "SCHEDULED": {
                q.a().a(this.a, topicView$TopicData.l);
                this.a.setBackgroundDrawable((Drawable)null);
                this.a.setTextColor(resources.getColor(2131689606));
            }
            case "POSTPONED": {
                this.a.setText((CharSequence)resources.getString(2131297466));
                this.a.setBackgroundDrawable((Drawable)null);
                this.a.setTextColor(resources.getColor(2131689606));
            }
            case "COMPLETED": {
                this.a.setText((CharSequence)resources.getString(2131296700));
                this.a.setBackgroundDrawable((Drawable)null);
                this.a.setTextColor(resources.getColor(2131689606));
            }
            case "CANCELLED": {
                this.a.setText((CharSequence)resources.getString(2131296446));
                this.a.setBackgroundDrawable((Drawable)null);
                this.a.setTextColor(resources.getColor(2131689606));
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final String string = this.a.getText().toString();
        this.a.getPaint().getTextBounds(string, 0, string.length(), this.m);
        if (this.l.getMeasuredWidth() < 100 && this.m.width() > 100) {
            this.l.setVisibility(4);
            return;
        }
        this.a.setVisibility(0);
    }
}
