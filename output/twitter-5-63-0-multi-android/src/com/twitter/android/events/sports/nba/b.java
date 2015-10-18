// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.nba;

import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import com.twitter.android.ProfileActivity;
import android.view.View;
import android.view.View$OnClickListener;

class b implements View$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ NBAScoreCardImpl b;
    
    b(final NBAScoreCardImpl b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent putExtra = new Intent(this.b.getContext(), (Class)ProfileActivity.class).putExtra("user_id", this.a);
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.a));
        this.b.getContext().startActivity(putExtra);
        final c a = c.a(this.b.getContext());
        a.a(a.a().b().g(), "search:event_card:basketball::profile_click");
    }
}
