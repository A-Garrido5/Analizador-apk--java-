// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.commerce.util.e;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.android.commerce.view.ab;
import com.twitter.util.q;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.Collection;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import android.view.View;
import com.twitter.library.provider.bg;
import java.util.HashMap;
import android.widget.LinearLayout;

public class ProductSearchContainer extends LinearLayout implements d
{
    private HashMap a;
    private ProductSearchFragment b;
    private bg c;
    private View d;
    private Tweet e;
    private String f;
    
    public ProductSearchContainer(final Context context) {
        super(context);
        View.inflate(context, 2130968679, (ViewGroup)this);
        this.a = new HashMap();
    }
    
    public void a() {
        this.c.b(this.a.values());
    }
    
    public void a(final TwitterFragmentActivity twitterFragmentActivity, final View d, final Session session, final Tweet e, final String f, final String s) {
        final Intent intent = twitterFragmentActivity.getIntent();
        intent.putExtra("q_source", "api_call");
        intent.putExtra("query", s);
        this.c = bg.a((Context)twitterFragmentActivity, session.g());
        this.d = d;
        this.e = e;
        this.f = f;
        final long nextLong = q.a.nextLong();
        this.a.put(new ab(s + "product_search", 1, false, false, false).hashCode(), nextLong);
        intent.putExtra("search_id", nextLong);
        this.c.i(nextLong);
        this.b = new ProductSearchFragment();
        final Bundle arguments = new Bundle();
        arguments.putBoolean("should_poll", false);
        this.b.setArguments(arguments);
        this.b.a(intent);
        this.b.h(false);
        this.b.b(false);
        this.b.a(this);
        twitterFragmentActivity.getSupportFragmentManager().beginTransaction().add(2131886399, this.b).commit();
        this.c.a(this.a.values());
    }
    
    public void a(final ViewMoreContainer viewMoreContainer) {
        viewMoreContainer.setClickScribeLog(com.twitter.android.commerce.util.e.b(this.getContext(), this.e, "tweets_list", "view_more_button", "click", this.f, null));
    }
    
    public void a(final boolean b, final ListView listView) {
        if (listView == null) {
            return;
        }
        if (b) {
            this.a(false, (String)null);
            listView.setVisibility(8);
            return;
        }
        this.a(true, (String)null);
        listView.setVisibility(0);
        this.b.S();
    }
    
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        return false;
    }
    
    public boolean a(final boolean b, final String s) {
        return false;
    }
    
    public View getHeaderView() {
        return this.d;
    }
}
