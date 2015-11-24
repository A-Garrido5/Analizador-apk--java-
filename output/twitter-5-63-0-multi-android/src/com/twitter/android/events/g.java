// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.os.Build$VERSION;
import com.twitter.library.client.Session$LoginStatus;
import java.util.Collection;
import android.content.Intent;
import android.content.res.Resources;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.view.LayoutInflater;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import java.util.ArrayList;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.UnboundedFrameLayout;
import java.io.Serializable;
import com.twitter.util.q;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.kg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.View;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.text.TextUtils;
import android.support.v4.app.Fragment;
import android.graphics.Bitmap;
import com.twitter.library.util.af;
import android.content.Context;
import android.annotation.TargetApi;
import com.twitter.library.provider.bg;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.io.File;
import android.widget.TextView;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.qi;
import java.util.HashMap;
import com.twitter.android.mn;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.media.widget.BackgroundImageView;
import android.net.Uri;
import com.twitter.library.media.manager.m;
import com.twitter.android.rp;
import com.twitter.android.hm;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;
import com.twitter.android.SearchFragment;

class g implements Runnable
{
    final /* synthetic */ SearchFragment a;
    final /* synthetic */ f b;
    
    g(final f b, final SearchFragment a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        ((e)this.a).e(this.b.g.X);
    }
}
