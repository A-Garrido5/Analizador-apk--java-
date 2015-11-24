// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import java.util.List;
import com.twitter.android.util.q;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import java.util.regex.Pattern;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.RelativeLayout;
import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import com.twitter.android.ProfileActivity;
import android.view.View;
import android.view.View$OnClickListener;

class a implements View$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ CricketScoreCardView b;
    
    a(final CricketScoreCardView b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent putExtra = new Intent(this.b.q, (Class)ProfileActivity.class).putExtra("user_id", this.a);
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.a));
        this.b.q.startActivity(putExtra);
        final c a = c.a(this.b.q);
        a.a(a.a().b().g(), "search:event_card:cricket::profile_click");
    }
}
