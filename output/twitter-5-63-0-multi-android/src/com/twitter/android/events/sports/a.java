// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import com.twitter.android.util.bf;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.SearchActivity;
import android.view.View;
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
import android.content.SharedPreferences$Editor;
import android.app.AlarmManager;
import android.widget.CompoundButton;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.widget.CompoundButton$OnCheckedChangeListener;

class a implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ long b;
    final /* synthetic */ PendingIntent c;
    final /* synthetic */ String d;
    final /* synthetic */ AdaptiveSportsEventView e;
    
    a(final AdaptiveSportsEventView e, final SharedPreferences a, final long b, final PendingIntent c, final String d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        final AlarmManager alarmManager = (AlarmManager)this.e.g.getSystemService("alarm");
        final SharedPreferences$Editor edit = this.a.edit();
        if (b) {
            this.e.j.setText((CharSequence)this.e.g.getResources().getString(2131297543));
            alarmManager.set(0, this.b, this.c);
            edit.putLong(this.d, this.b);
        }
        else {
            this.e.j.setText((CharSequence)this.e.g.getResources().getString(2131297539));
            edit.remove(this.d);
            alarmManager.cancel(this.c);
        }
        edit.apply();
    }
}
