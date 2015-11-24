// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import com.twitter.library.client.Session$LoginStatus;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import android.view.LayoutInflater;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.List;
import java.util.Collection;
import android.content.Intent;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import java.io.Serializable;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.view.ViewGroup;
import com.twitter.android.widget.br;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import com.twitter.library.client.Session;
import android.os.Bundle;
import com.twitter.util.q;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import com.twitter.android.widget.bt;
import java.util.HashMap;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.widget.TopicView;
import com.twitter.library.provider.bg;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import android.net.Uri;

class ho extends na
{
    final /* synthetic */ EventLandingActivity a;
    
    public ho(final EventLandingActivity a, final Uri uri, final mn mn) {
        this.a = a;
        super(uri, mn);
    }
    
    @Override
    protected void a(final gm gm) {
        this.a.G().a(((TwitterScribeLog)new TwitterScribeLog(this.a.U().g()).b(this.a.o, gm.h, null, null, "polled_content_available")).a(TwitterScribeItem.a(this.a.l, this.a.m)));
    }
}
