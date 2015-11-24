// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import com.twitter.android.ProfileActivity;
import android.view.View;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.content.Context;
import android.view.View$OnClickListener;

final class c implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ TwitterTopic$SportsEvent$Player b;
    
    c(final Context a, final TwitterTopic$SportsEvent$Player b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final Intent putExtra = new Intent(this.a, (Class)ProfileActivity.class).putExtra("user_id", this.b.userId).putExtra("screen_name", this.b.name);
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.b.userId));
        this.a.startActivity(putExtra);
        final com.twitter.android.client.c a = com.twitter.android.client.c.a(this.a);
        a.a(a.a().b().g(), "search:event_card:cricket::profile_click");
    }
}
