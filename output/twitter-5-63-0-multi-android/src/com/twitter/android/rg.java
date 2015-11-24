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
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.UserSocialView;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.view.ViewConfiguration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import com.twitter.android.widget.TopicView;
import android.widget.TextView;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.library.provider.Tweet;
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
import android.view.ViewGroup;
import com.twitter.android.events.b;
import com.twitter.library.featureswitch.d;
import android.content.Context;
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
import com.twitter.android.client.c;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.HashSet;
import java.util.HashMap;
import com.twitter.android.client.u;
import android.widget.BaseAdapter;
import android.view.View;
import android.os.Bundle;
import android.view.ViewParent;
import com.twitter.android.widget.PipView;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.view.o;

class rg extends o
{
    final /* synthetic */ int a;
    final /* synthetic */ GroupedRowView b;
    final /* synthetic */ PipView c;
    final /* synthetic */ rf d;
    
    rg(final rf d, final ViewParent viewParent, final int n, final int a, final GroupedRowView b, final PipView c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        super(viewParent, n);
    }
    
    @Override
    public void onPageSelected(final int pipOnPosition) {
        if (this.d.h != null) {
            final Bundle bundle = new Bundle(2);
            bundle.putInt("position", this.a);
            bundle.putInt("page", pipOnPosition);
            this.d.h.a((View)this.b, null, bundle);
        }
        this.c.setPipOnPosition(pipOnPosition);
        super.onPageSelected(pipOnPosition);
    }
}
