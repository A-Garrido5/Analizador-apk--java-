// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.support.v4.app.Fragment;
import com.twitter.android.ul;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.os.Bundle;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.AbsListView;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.library.api.TwitterTopic;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.ScrollingHeaderActivity;
import com.twitter.library.service.y;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.twitter.android.ro;
import com.twitter.android.SearchResultsFragment;

class a implements Runnable
{
    final /* synthetic */ TwitterEventActivity a;
    final /* synthetic */ EventLandingFragment b;
    
    a(final EventLandingFragment b, final TwitterEventActivity a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b(this.b.aq, this.a.A());
    }
}
