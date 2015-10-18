// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import com.twitter.android.widget.TextSwitcherView;
import java.util.Collection;
import java.util.Iterator;
import android.widget.ImageButton;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.text.SpannableString;
import com.twitter.util.f;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.widget.UserSocialView;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import com.twitter.android.widget.PipView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import com.twitter.android.widget.TopicView;
import android.widget.TextView;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.android.client.bh;
import com.twitter.library.provider.ad;
import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import android.text.TextUtils;
import com.twitter.library.provider.cc;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import android.view.LayoutInflater;
import com.twitter.internal.android.widget.GroupedRowView;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.android.events.b;
import com.twitter.library.featureswitch.d;
import java.util.LinkedList;
import java.util.ArrayList;
import android.database.Cursor;
import com.twitter.library.view.z;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.ReferenceList;
import java.util.List;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.az;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.HashSet;
import java.util.HashMap;
import com.twitter.android.client.u;
import android.widget.BaseAdapter;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.c;

class ri implements c
{
    final /* synthetic */ rf a;
    private PromotedContent b;
    private int c;
    
    public ri(final rf a) {
        this.a = a;
        this.b = null;
        this.c = -1;
    }
    
    public void a(final int c) {
        this.c = c;
    }
    
    public void a(final PromotedContent b) {
        this.b = b;
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        final com.twitter.android.client.c b = this.a.d;
        boolean b2;
        if (this.a.p == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final Context applicationContext = this.a.c.getApplicationContext();
        final as a = as.a(applicationContext);
        final Session b3 = this.a.e.b();
        if (!kg.a(applicationContext)) {
            String s;
            if (userView.l.isChecked()) {
                a.a(new pe(applicationContext, b3, n, this.b));
                this.a.g.c(n);
                if (this.a.G != null && b2) {
                    s = "search:" + TwitterTopic.d(this.a.q) + ":people_pivot:user:unfollow";
                }
                else if (b2) {
                    s = "search:people:users:user:unfollow";
                }
                else {
                    s = "search:universal::user:unfollow";
                }
            }
            else {
                a.a(new pb(applicationContext, b3, n, this.b));
                this.a.g.b(n);
                if (this.a.G != null && b2) {
                    s = "search:" + TwitterTopic.d(this.a.q) + ":people_pivot:user:follow";
                }
                else if (b2) {
                    s = "search:people:users:user:follow";
                }
                else {
                    s = "search:universal::user:follow";
                }
            }
            b.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.a.e.b().g()).a((Context)this.a.c, null, this.a.r, null).a(n, userView.getPromotedContent(), null, this.c).b(new String[] { s })).a(this.a.r)).e(this.a.o));
            return;
        }
        userView.l.toggle();
        kg.a(this.a.c, 4, userView.getBestName().toString());
    }
}
