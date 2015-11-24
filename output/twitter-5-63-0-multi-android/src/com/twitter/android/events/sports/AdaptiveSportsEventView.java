// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import com.twitter.android.util.bf;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.SearchActivity;
import android.view.View;
import android.content.SharedPreferences;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.app.PendingIntent;
import android.content.Intent;
import com.twitter.android.events.sports.cricket.EventAlarmBroadcastReceiver;
import com.twitter.library.featureswitch.d;
import com.twitter.android.events.b;
import com.twitter.android.widget.TopicView;
import com.twitter.android.util.q;
import android.content.res.Resources;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;
import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.android.widget.SportsEventView;

public class AdaptiveSportsEventView extends SportsEventView implements View$OnClickListener
{
    private final Context g;
    private String h;
    private TextView i;
    private CheckBox j;
    private String k;
    private int l;
    
    public AdaptiveSportsEventView(final Context context) {
        this(context, null, 0);
    }
    
    public AdaptiveSportsEventView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AdaptiveSportsEventView(final Context g, final AttributeSet set, final int n) {
        super(g, set, n);
        this.g = g;
    }
    
    @Override
    protected void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent, final Resources resources, final String s, final long n, final String s2) {
        switch (s2) {
            case "SCHEDULED": {
                if (n > 0L) {
                    q.a().a(this.a, n, resources, false, true);
                    ((AdaptiveTeamRowView)this.c).b();
                    ((AdaptiveTeamRowView)this.d).b();
                    this.a.setTextColor(resources.getColor(2131689606));
                    break;
                }
                break;
            }
            case "POSTPONED": {
                TopicView.a(this.a, resources.getString(2131297466));
                ((AdaptiveTeamRowView)this.c).b();
                ((AdaptiveTeamRowView)this.d).b();
                this.a.setTextColor(resources.getColor(2131689606));
                break;
            }
            case "CANCELLED": {
                TopicView.a(this.a, resources.getString(2131296446));
                ((AdaptiveTeamRowView)this.c).b();
                ((AdaptiveTeamRowView)this.d).b();
                this.a.setTextColor(resources.getColor(2131689606));
                break;
            }
            case "IN_PROGRESS": {
                ((AdaptiveTeamRowView)this.c).a();
                ((AdaptiveTeamRowView)this.d).a();
                this.a.setTextColor(resources.getColor(2131689556));
                if (com.twitter.android.events.b.b(s)) {
                    TopicView.a(this.a, resources.getString(2131297445));
                    break;
                }
                if (com.twitter.android.events.b.d(s)) {
                    TopicView.a(this.a, resources.getString(2131297164));
                    break;
                }
                break;
            }
            case "COMPLETED": {
                TopicView.a(this.a, resources.getString(2131296700));
                ((AdaptiveTeamRowView)this.c).b();
                ((AdaptiveTeamRowView)this.d).b();
                this.a.setTextColor(resources.getColor(2131689606));
                break;
            }
        }
        TopicView.a(this.i, twitterTopic$SportsEvent.summary, 1);
        if (com.twitter.android.events.b.d(s)) {
            if (!"IN_PROGRESS".equals(s2)) {
                this.i.setVisibility(8);
            }
            else {
                this.i.setVisibility(0);
            }
        }
        this.b.setVisibility(8);
    }
    
    @Override
    public void a(final String k, final int l, final String s, final String s2, final String s3, final String s4, final String s5, final int n, final long n2, final String h, final String s6, final byte[] array, final boolean b, final boolean b2, final Long n3, final String s7, final String s8, final String s9, final String s10) {
        super.a(k, l, s, s2, s3, s4, s5, n, n2, h, s6, array, b, b2, n3, s7, s8, s9, s10);
        this.k = k;
        this.h = h;
        this.l = l;
        if ("SCHEDULED".equals(s10) && s4 != null && ((com.twitter.library.featureswitch.d.f("cricket_experience_tournament_remindme_enabled") && b.b(k)) || (com.twitter.library.featureswitch.d.f("soccer_experience_tournament_remindme_enabled") && b.d(k)))) {
            final Intent intent = new Intent(this.g, (Class)EventAlarmBroadcastReceiver.class);
            intent.putExtra("key_event_alarm_type", "event_alarm_cricket").putExtra("query", s4).putExtra("terminal", true).putExtra("seed_hashtag", s4).putExtra("search_src_ref", "ref_src_notification");
            final PendingIntent broadcast = PendingIntent.getBroadcast(this.g, k.hashCode(), intent, 134217728);
            this.j.setVisibility(0);
            final SharedPreferences sharedPreferences = this.g.getSharedPreferences("adaptive_sports", 0);
            final long long1 = sharedPreferences.getLong(k, -1L);
            this.j.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
            if (long1 == -1L) {
                this.j.setChecked(false);
                this.j.setText((CharSequence)this.g.getResources().getString(2131297539));
            }
            else {
                this.j.setChecked(true);
                this.j.setText((CharSequence)this.g.getResources().getString(2131297543));
            }
            this.j.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new a(this, sharedPreferences, n2, broadcast, k));
            return;
        }
        this.j.setVisibility(8);
    }
    
    public void onClick(final View view) {
        this.g.startActivity(new Intent(this.g, (Class)SearchActivity.class).putExtra("query", this.h).putExtra("terminal", true).putExtra("search_button", true).putExtra("query_name", this.h));
        com.twitter.android.client.c.a(this.g).a(az.a(this.g).b().g(), "search:games:" + com.twitter.android.events.b.a(this.k, this.l).toLowerCase() + "::click");
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.i = (TextView)this.findViewById(2131886213);
        this.j = (CheckBox)this.findViewById(2131886248);
        bf.a(this.a, 2);
        bf.a(this.i, 2);
        this.setOnClickListener((View$OnClickListener)this);
    }
}
