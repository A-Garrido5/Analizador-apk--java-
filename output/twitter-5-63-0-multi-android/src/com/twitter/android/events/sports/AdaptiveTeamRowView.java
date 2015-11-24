// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import com.twitter.android.util.bf;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import android.content.Context;
import com.twitter.android.widget.SportsTeamRowView;

public class AdaptiveTeamRowView extends SportsTeamRowView
{
    private final Context g;
    private TextView h;
    
    public AdaptiveTeamRowView(final Context context) {
        this(context, null, 2130772080);
    }
    
    public AdaptiveTeamRowView(final Context context, final AttributeSet set) {
        this(context, set, 2130772080);
    }
    
    public AdaptiveTeamRowView(final Context g, final AttributeSet set, final int n) {
        super(g, set, n);
        this.g = g;
    }
    
    public void a() {
        final Resources resources = this.g.getResources();
        this.a.setTypeface(Typeface.DEFAULT_BOLD);
        this.a.setTextColor(resources.getColor(2131689630));
        this.c.setTextColor(resources.getColor(2131689630));
    }
    
    @Override
    protected void a(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        super.a(twitterTopic$SportsEvent$Player, s);
        com.twitter.android.events.sports.b.a(twitterTopic$SportsEvent$Player.score, this.c, this.h, s);
        this.b.setVisibility(8);
    }
    
    public void b() {
        final Resources resources = this.g.getResources();
        this.a.setTypeface(Typeface.DEFAULT);
        this.a.setTextColor(resources.getColor(2131689540));
        this.c.setTextColor(resources.getColor(2131689540));
    }
    
    @Override
    public void b(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        super.b(twitterTopic$SportsEvent$Player, s);
        if (twitterTopic$SportsEvent$Player != null) {
            SportsTeamRowView.a(this.a, twitterTopic$SportsEvent$Player.name);
        }
    }
    
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView)this.findViewById(2131886623);
        bf.a(this.a, 1);
        bf.a(this.c, 1);
        bf.a(this.h, 3);
    }
}
