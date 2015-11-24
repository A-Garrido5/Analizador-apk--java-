// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Date;
import com.twitter.library.featureswitch.d;
import android.content.res.Resources;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import java.util.TimeZone;
import java.util.Locale;
import android.util.AttributeSet;
import android.content.Context;
import java.text.SimpleDateFormat;

public class NFLEventView extends SportsEventView
{
    private SimpleDateFormat g;
    
    public NFLEventView(final Context context) {
        super(context);
        this.a();
    }
    
    public NFLEventView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public NFLEventView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    private void a() {
        (this.g = new SimpleDateFormat("MM/dd h:mm a z", Locale.getDefault())).setTimeZone(TimeZone.getDefault());
    }
    
    @Override
    protected void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent, final Resources resources, final String s, final long n, final String s2) {
        if (!com.twitter.library.featureswitch.d.f("nfl_show_live_status_enabled")) {
            TopicView.a(this.a, null);
            return;
        }
        if ("SCHEDULED".equals(s2) && n > 0L) {
            TopicView.a(this.a, this.g.format(new Date(n)));
            return;
        }
        TopicView.a(this.a, twitterTopic$SportsEvent.status);
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (NFLTeamRowView)this.findViewById(2131886244);
        this.d = (NFLTeamRowView)this.findViewById(2131886245);
    }
}
