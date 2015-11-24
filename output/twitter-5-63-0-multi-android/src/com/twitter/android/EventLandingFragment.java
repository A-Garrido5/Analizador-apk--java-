// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.android.client.u;
import android.os.Bundle;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.client.c;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.widget.TopicView;
import java.io.Serializable;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import android.os.Parcelable;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import android.view.View;
import android.widget.ListView;
import android.content.Context;

public class EventLandingFragment extends SearchResultsFragment
{
    private boolean a;
    private String ao;
    
    @Override
    protected String M_() {
        return this.ao;
    }
    
    @Override
    protected void a(final Context context) {
        if (this.a) {
            super.a(context);
            return;
        }
        this.A();
    }
    
    @Override
    public void a(final ListView listView, final View view, final int n, final long n2) {
        final rh rh = (rh)view.getTag();
        final ro m = rh.m;
        final String d = SearchFragment.d(this.m);
        switch (m.b) {
            default: {
                super.a(listView, view, n, n2);
                break;
            }
            case 28: {
                final TopicView j = rh.j;
                final int topicType = j.getTopicType();
                final String topicId = j.getTopicId();
                final TwitterScribeItem a = TwitterScribeItem.a(topicId, topicType);
                a.b = j.getTopicId();
                this.aw().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { ScribeLog.a(this.B, this.ao, "matches_pivot", "match", "click") })).a(this.u, d, this.d, this.c)).a(this.Z)).a(a));
                final FragmentActivity activity = this.getActivity();
                if (activity != null) {
                    final String seedHashtag = j.getSeedHashtag();
                    final Intent a2 = uk.a((Context)activity, topicId, topicType, seedHashtag, seedHashtag, null, seedHashtag, false, j.getTopicData(), true, null);
                    a2.putExtra("EXTRA_PARENT_EVENT", (Parcelable)activity.getIntent());
                    a2.putExtra("event_page_type", "GAME");
                    this.startActivity(a2);
                    return;
                }
                break;
            }
            case 1: {
                final UserView userView = (UserView)((GroupedRowView)view).getChildAt(0);
                final long userId = userView.getUserId();
                final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", userId).putExtra("screen_name", userView.getUserName());
                if (this.Z != null) {
                    putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(5)).a(this.X));
                }
                final com.twitter.android.client.c aw = this.aw();
                final PromotedContent promotedContent = userView.getPromotedContent();
                if (promotedContent != null) {
                    aw.a(PromotedEvent.d, promotedContent);
                    putExtra.putExtra("pc", (Serializable)promotedContent);
                }
                this.startActivity(putExtra);
                aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(userId, userView.getPromotedContent(), null, n).b(this.B, this.ao, "people_pivot", "user", "click")).a(this.Z)).a(TwitterScribeItem.a(this.D, this.q))).a(this.u, d, this.d, this.c));
            }
        }
    }
    
    @Override
    protected void a(final TwitterTopic twitterTopic) {
        final FragmentActivity activity = this.getActivity();
        if (twitterTopic != null && activity instanceof EventLandingActivity) {
            final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)twitterTopic.a(TwitterTopic$SportsEvent.class);
            if (twitterTopic$SportsEvent != null) {
                ((EventLandingActivity)activity).a(twitterTopic$SportsEvent);
            }
        }
    }
    
    protected void ae_() {
        this.a = false;
        super.ae_();
    }
    
    @Override
    protected void c() {
        this.a = true;
        super.c();
    }
    
    @Override
    protected void e() {
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(this.B, this.ao, null, null, "show_polled_content")).a(TwitterScribeItem.a(this.D, this.q)));
        super.e();
    }
    
    @Override
    protected String e_(final int n) {
        return this.ao;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.I != null) {
            this.a(this.I);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ao = bundle.getString("scribe_section");
        }
        else {
            this.ao = this.getArguments().getString("scribe_section");
        }
        this.Z = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().b(this.B)).c(this.ao)).b(6)).a(this.D);
        this.K = new ul(this, this.Z);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("scribe_section", this.ao);
    }
}
