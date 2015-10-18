// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.featureswitch.d;
import java.util.Arrays;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.TextView;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.e;
import com.twitter.library.util.bj;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Collection;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.util.bq;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.graphics.drawable.Drawable;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.support.v4.app.Fragment;
import com.twitter.android.client.bn;
import android.widget.BaseAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.c;
import com.twitter.library.media.util.HeaderImageVariant;
import android.os.Bundle;
import java.io.Serializable;
import com.twitter.util.q;
import com.twitter.android.widget.ScrollingHeaderUsersListFragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.Session;
import android.widget.Button;
import java.util.ArrayList;
import java.util.HashMap;
import com.twitter.library.provider.bg;
import com.twitter.library.media.widget.o;
import android.view.View$OnClickListener;
import com.twitter.library.scribe.TwitterScribeLog;
import android.net.Uri;

class hi extends na
{
    final /* synthetic */ EmailExploreActivity a;
    
    public hi(final EmailExploreActivity a, final Uri uri, final mn mn) {
        this.a = a;
        super(uri, mn);
    }
    
    @Override
    public void a() {
        this.a.a(false);
        super.a();
    }
    
    @Override
    public void a(final int n) {
        this.a.a(false);
        super.a(n);
    }
    
    @Override
    protected void a(final gm gm) {
        this.a.G().a(((TwitterScribeLog)new TwitterScribeLog(this.a.U().g()).b("explore_email", "category", gm.h, null, "polled_content_available")).d(this.a.B));
    }
}
