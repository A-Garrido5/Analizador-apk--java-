// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.util.TypedValue;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import android.content.res.Resources;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SportsEventView extends EventView
{
    protected TextView a;
    protected TextView b;
    protected SportsTeamRowView c;
    protected SportsTeamRowView d;
    protected LinearLayout e;
    protected int f;
    
    public SportsEventView(final Context context) {
        super(context);
    }
    
    public SportsEventView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SportsEventView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent, final Resources resources, final String s, final long n, final String s2) {
        TopicView.a(this.a, twitterTopic$SportsEvent.status);
    }
    
    @Override
    public void a(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final int n2, final long n3, final String s7, final String s8, final byte[] array, final boolean b, final boolean b2, final Long n4, final String s9, final String s10, final String s11, final String s12) {
        super.a(s, n, s2, s3, s4, s5, s6, n2, n3, s7, s8, array, b, b2, n4, s9, s10, null, s12);
        final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)com.twitter.util.f.a(array);
        this.c.b((TwitterTopic$SportsEvent$Player)twitterTopic$SportsEvent.players.get(0), s);
        this.d.b((TwitterTopic$SportsEvent$Player)twitterTopic$SportsEvent.players.get(1), s);
        final Resources resources = this.getResources();
        TopicView.a(this.b, EventView.a(s6, n2, resources));
        this.a(twitterTopic$SportsEvent, resources, s, n3, s12);
        if (this.e != null) {
            int f;
            if (b2) {
                this.e.setBackgroundDrawable(resources.getDrawable(2130839505));
                f = this.f;
            }
            else {
                this.e.setBackgroundColor(resources.getColor(2131689637));
                f = 0;
            }
            this.e.setPadding(f, f, f, f);
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final int n, final byte[] array, final String s4, final long n2, final String s5) {
        super.a(s, s2, s3, n, array, s4, n2, s5);
        final Resources resources = this.getResources();
        TopicView.a(this.b, EventView.a(s3, n, resources));
        final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)com.twitter.util.f.a(array);
        this.a(twitterTopic$SportsEvent, resources, s4, n2, s5);
        this.c.c((TwitterTopic$SportsEvent$Player)twitterTopic$SportsEvent.players.get(0), s4);
        this.d.c((TwitterTopic$SportsEvent$Player)twitterTopic$SportsEvent.players.get(1), s4);
    }
    
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131886247);
        this.b = (TextView)this.findViewById(2131886246);
        this.c = (SportsTeamRowView)this.findViewById(2131886244);
        this.d = (SportsTeamRowView)this.findViewById(2131886245);
        this.e = (LinearLayout)this.findViewById(2131886243);
        final Resources resources = this.getResources();
        this.f = (int)TypedValue.applyDimension(0, (float)resources.getDimensionPixelSize(2131558931), resources.getDisplayMetrics());
    }
}
