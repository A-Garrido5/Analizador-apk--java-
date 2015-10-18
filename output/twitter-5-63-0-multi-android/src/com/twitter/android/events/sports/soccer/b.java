// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.soccer;

import android.content.res.Resources;
import java.util.List;
import com.twitter.android.util.q;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.LinearLayout;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import com.twitter.android.ProfileActivity;
import android.view.View;
import android.view.View$OnClickListener;

class b implements View$OnClickListener
{
    final /* synthetic */ SoccerScoreCardView a;
    
    private b(final SoccerScoreCardView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        long n;
        if (view.getId() == 2131886609 || view.getId() == 2131886610) {
            n = this.a.i;
        }
        else if (view.getId() == 2131886614 || view.getId() == 2131886615) {
            n = this.a.j;
        }
        else {
            n = 0L;
        }
        if (n > 0L) {
            this.a.h.startActivity(new Intent(this.a.h, (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(n)));
            final c a = c.a(this.a.h);
            a.a(a.a().b().g(), "search:event_card:soccer::profile_click");
        }
    }
}
