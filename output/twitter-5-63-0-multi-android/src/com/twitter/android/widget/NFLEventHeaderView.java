// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.text.TextUtils;
import java.util.Date;
import com.twitter.library.featureswitch.d;
import android.content.res.Resources;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import java.util.TimeZone;
import java.util.Locale;
import android.util.AttributeSet;
import android.content.Context;
import java.text.SimpleDateFormat;
import android.widget.TextView;

public class NFLEventHeaderView extends SportsEventView
{
    private TextView g;
    private TextView h;
    private TextView i;
    private SimpleDateFormat j;
    private SimpleDateFormat k;
    
    public NFLEventHeaderView(final Context context) {
        super(context);
        this.a();
    }
    
    public NFLEventHeaderView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public NFLEventHeaderView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    private void a() {
        final Locale default1 = Locale.getDefault();
        final TimeZone default2 = TimeZone.getDefault();
        (this.j = new SimpleDateFormat("MM/dd", default1)).setTimeZone(default2);
        (this.k = new SimpleDateFormat("h:mm a", default1)).setTimeZone(default2);
    }
    
    private void a(final String s, final int n) {
        TopicView.a(this.g, null);
        TopicView.a(this.h, null);
        TopicView.a(this.i, s, n);
    }
    
    private void a(final String s, final String s2) {
        TopicView.a(this.g, s);
        TopicView.a(this.h, s2);
        TopicView.a(this.i, null);
    }
    
    @Override
    protected void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent, final Resources resources, final String s, final long n, final String s2) {
        if (!com.twitter.library.featureswitch.d.f("nfl_show_live_status_enabled")) {
            this.a(resources.getString(2131297889), 1);
            return;
        }
        if ("SCHEDULED".equals(s2) && n > 0L) {
            final Date date = new Date(n);
            this.a(this.j.format(date), this.k.format(date));
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)twitterTopic$SportsEvent.status)) {
            this.a(twitterTopic$SportsEvent.status, 0);
            return;
        }
        this.a(resources.getString(2131297889), 1);
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (NFLTeamRowView)this.findViewById(2131886244);
        this.d = (NFLTeamRowView)this.findViewById(2131886245);
        this.g = (TextView)this.findViewById(2131887061);
        this.h = (TextView)this.findViewById(2131887062);
        this.i = (TextView)this.findViewById(2131887063);
    }
}
