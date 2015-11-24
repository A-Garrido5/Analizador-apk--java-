// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.util.AttributeSet;
import android.content.Context;

public class NFLTeamRowView extends SportsTeamRowView
{
    public NFLTeamRowView(final Context context) {
        this(context, null, 2130772080);
    }
    
    public NFLTeamRowView(final Context context, final AttributeSet set) {
        this(context, set, 2130772080);
    }
    
    public NFLTeamRowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    protected void a(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        if (com.twitter.library.featureswitch.d.f("nfl_show_live_scores_enabled")) {
            super.a(twitterTopic$SportsEvent$Player, s);
            return;
        }
        SportsTeamRowView.a(this.c, null);
    }
}
