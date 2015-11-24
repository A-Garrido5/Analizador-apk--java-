// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.featureswitch.d;
import java.util.Arrays;
import com.twitter.library.scribe.TwitterScribeLog;
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
import android.net.Uri;
import com.twitter.library.media.widget.o;
import android.view.View$OnClickListener;

public class EmailExploreActivity extends ScrollingHeaderActivity implements View$OnClickListener, rp, o
{
    private static final Uri a;
    private static final Uri b;
    private static final Uri c;
    private String A;
    private String B;
    private long[] d;
    private bg e;
    private mn f;
    private HashMap g;
    private ArrayList h;
    private Button i;
    private Button j;
    private hj y;
    private int z;
    
    static {
        a = Uri.parse("twitter://events/default");
        b = Uri.parse("twitter://events/media");
        c = Uri.parse("twitter://events/people");
    }
    
    public EmailExploreActivity() {
        this.z = 0;
    }
    
    private gm a(final Uri uri, final int n) {
        Serializable s;
        Bundle bundle;
        String s2;
        String s3;
        int n2;
        if (uri.equals((Object)EmailExploreActivity.a)) {
            s = EmailExploreSearchResultsFragment.class;
            final Bundle a = TwitterListFragment.a(this.getIntent(), true);
            final String string = this.getString(2131297085);
            bundle = a;
            s2 = string;
            s3 = "tweets_pivot";
            n2 = 1;
        }
        else if (uri.equals((Object)EmailExploreActivity.b)) {
            s = EventGridFragment.class;
            bundle = TwitterListFragment.a(this.getIntent(), true);
            s2 = this.getString(2131297626);
            n2 = 7;
            s3 = "photos_pivot";
        }
        else if (uri.equals((Object)EmailExploreActivity.c)) {
            s = ScrollingHeaderUsersListFragment.class;
            bundle = TwitterListFragment.a(this.getIntent(), true);
            s2 = this.getString(2131297915);
            n2 = 2;
            s3 = "people_pivot";
        }
        else {
            s = null;
            n2 = 0;
            s3 = null;
            s2 = null;
            bundle = null;
        }
        final go go = new go(uri, (Class)s);
        go.a((CharSequence)s2);
        go.a(s3);
        bundle.putString("query_name", "email explore query");
        bundle.putString("query", this.h());
        bundle.putBoolean("terminal", true);
        bundle.putInt("search_type", n2);
        bundle.putInt("fetch_type", 5);
        bundle.putInt("fragment_page_number", n);
        bundle.putString("scribe_page", "explore_email");
        bundle.putString("scribe_section", "category");
        bundle.putInt("fragment_page_number", n);
        bundle.putString("scribe_component", s3);
        bundle.putString("q_source", "api_call");
        bundle.putInt("empty_title", 2131297635);
        bundle.putInt("empty_desc", 2131297636);
        bundle.putBoolean("follow", true);
        bundle.putBoolean("refresh", false);
        bundle.putLong("owner_id", this.U().g());
        bundle.putParcelableArrayList("explore_email_users", this.h);
        bundle.putInt("type", 6);
        long n3;
        if (this.g.get(n2) != null) {
            n3 = this.g.get(n2);
        }
        else {
            n3 = com.twitter.util.q.a.nextLong();
        }
        this.e.i(n3);
        bundle.putLong("search_id", n3);
        this.g.put(n2, n3);
        go.a(bundle);
        return go.a();
    }
    
    private static String a(final String s, final float n) {
        if (s == null) {
            return null;
        }
        String s2;
        if (n > 1.0f) {
            s2 = HeaderImageVariant.i.postfix;
        }
        else {
            s2 = HeaderImageVariant.h.postfix;
        }
        return s + s2;
    }
    
    private String h() {
        if (this.h == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        final Iterator<TwitterUser> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            sb.append("from:").append(iterator.next().username).append(", OR ");
        }
        return sb.substring(0, sb.length() - ", OR ".length());
    }
    
    private long[] k() {
        if (this.d == null) {
            final long[] d = new long[this.h.size()];
            final Iterator<TwitterUser> iterator = (Iterator<TwitterUser>)this.h.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final TwitterUser twitterUser = iterator.next();
                final int n2 = n + 1;
                d[n] = twitterUser.userId;
                n = n2;
            }
            this.d = d;
        }
        return this.d;
    }
    
    @Override
    protected String K_() {
        return null;
    }
    
    @Override
    protected PagerAdapter a(final List list, final ViewPager viewPager) {
        return new hh(this, this, list, viewPager, this.n, this.f);
    }
    
    @Override
    protected BaseAdapter a(final List list) {
        return this.f = new mn(this.k);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.e(true);
        return super.a(bundle, bn);
    }
    
    @Override
    protected void a(final int currentItem) {
        if (currentItem == this.f.b()) {
            final Fragment a = this.k.get(currentItem).a(this.getSupportFragmentManager());
            if (a != null && a instanceof SearchFragment) {
                ((SearchFragment)a).r();
            }
            return;
        }
        this.l.setCurrentItem(currentItem);
        this.f.a(currentItem);
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        switch (n) {
            case 1: {
                ++this.z;
                if (this.z == this.h.size()) {
                    if (this.y != null) {
                        this.y.d();
                    }
                    this.z = 0;
                    return;
                }
                break;
            }
            case 2: {
                if (((aa)y.l().b()).a() && this.y != null) {
                    this.y.b();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void a(final Drawable drawable) {
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        try {
            this.a(bitmap);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
        }
    }
    
    public void a(final boolean b, final ListView listView) {
    }
    
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        return false;
    }
    
    @Override
    protected String b() {
        return this.A;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.e = bg.a((Context)this, this.U().g());
        final Intent intent = this.getIntent();
        if (bundle == null) {
            this.g = new HashMap();
            final long longExtra = intent.getLongExtra("search_id", -1L);
            if (longExtra != -1L) {
                this.g.put(0, longExtra);
            }
        }
        else {
            this.g = (HashMap)bundle.getSerializable("state_search_ids");
        }
        final Intent intent2 = (Intent)intent.getParcelableExtra("EXTRA_PARENT_EVENT");
        if (intent2 != null) {
            this.c(intent2);
        }
        this.e.a(this.g.values());
        this.h = intent.getParcelableArrayListExtra("extra_sul");
        this.B = intent.getStringExtra("category");
        super.b(bundle, bn);
        final LinearLayout headerView = (LinearLayout)LayoutInflater.from((Context)this).inflate(2130968751, (ViewGroup)null);
        this.setHeaderView((View)headerView);
        final MediaImageView mediaImageView = (MediaImageView)headerView.findViewById(2131886708);
        final String a = a(intent.getStringExtra("extra_header_image_url"), bj.a);
        final String stringExtra = intent.getStringExtra("extra_header_image_username");
        if (a != null && stringExtra != null) {
            mediaImageView.setOnImageLoadedListener(this);
            mediaImageView.a(com.twitter.library.media.manager.j.a(a));
            ((TextView)headerView.findViewById(2131886709)).setText((CharSequence)this.getString(2131297988, new Object[] { stringExtra }));
        }
        this.A = intent.getStringExtra("extra_title");
        ((TypefacesTextView)headerView.findViewById(2131886711)).setText((CharSequence)this.A);
        ((TypefacesTextView)headerView.findViewById(2131886712)).setText((CharSequence)this.getString(2131296929, new Object[] { this.A }));
        (this.i = (Button)headerView.findViewById(2131886714)).setText((CharSequence)this.getString(2131297009, new Object[] { this.h.size() }));
        this.i.setOnClickListener((View$OnClickListener)this);
        (this.j = (Button)headerView.findViewById(2131886715)).setText((CharSequence)this.getString(2131298027, new Object[] { this.h.size() }));
        this.j.setOnClickListener((View$OnClickListener)this);
        if (bundle != null) {
            int n;
            if (bundle.getInt("state_follow_all_visibility") == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.i.setVisibility(8);
                this.j.setVisibility(0);
            }
        }
        this.G().a(((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b("explore_email", "category", this.k.get(this.l.getCurrentItem()).h, null, "impression")).d(this.B));
    }
    
    @Override
    protected List d() {
        return Arrays.asList(this.a(EmailExploreActivity.a, 0), this.a(EmailExploreActivity.b, 1), this.a(EmailExploreActivity.c, 2));
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        final c g = this.G();
        final long g2 = this.U().g();
        if (id == 2131886714) {
            if (this.y != null) {
                this.y.a();
            }
            this.a(new pd(this.getApplicationContext(), this.U(), this.k(), true), 2);
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            g.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g2).b("explore_email", "category", null, null, "follow_all")).d(this.B)).a((long)this.h.size()));
        }
        else if (id == 2131886715) {
            if (this.y != null) {
                this.y.ad_();
            }
            final long[] k = this.k();
            if (com.twitter.library.featureswitch.d.f("bulk_unfollow_enabled")) {
                this.a(new pg((Context)this, this.U(), k), 1);
            }
            else {
                for (int length = k.length, i = 0; i < length; ++i) {
                    this.a(new pe((Context)this, this.U(), k[i], null).c(-1), 1);
                }
            }
            this.j.setVisibility(8);
            this.i.setVisibility(0);
            g.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g2).b("explore_email", "category", null, null, "unfollow_all")).d(this.B)).a((long)this.h.size()));
        }
    }
    
    @Override
    protected void onDestroy() {
        if (this.U().b() == Session$LoginStatus.c) {
            this.e.b(this.g.values());
        }
        super.onDestroy();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        bundle.putSerializable("state_search_ids", (Serializable)this.g);
        bundle.putInt("state_follow_all_visibility", this.i.getVisibility());
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    public void setHeaderView(final View headerView) {
        if (this.t()) {
            super.setHeaderView(headerView);
        }
    }
}
