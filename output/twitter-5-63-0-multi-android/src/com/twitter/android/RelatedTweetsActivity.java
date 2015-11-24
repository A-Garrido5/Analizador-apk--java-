// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import android.content.Context;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import android.view.View;
import android.util.Pair;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import java.io.Serializable;
import com.twitter.util.q;
import android.content.Intent;
import java.util.HashMap;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.bg;
import com.twitter.android.client.TwitterFragmentActivity;

public class RelatedTweetsActivity extends TwitterFragmentActivity
{
    RelatedTweetsFragment a;
    private bg b;
    private TwitterScribeAssociation c;
    private HashMap d;
    private pn e;
    
    private void a(final Intent intent) {
        final long longExtra = intent.getLongExtra("status_id", 0L);
        if (!intent.hasExtra("search_id")) {
            final Pair b = this.e.b(Long.valueOf(longExtra));
            long nextLong;
            if (b == null) {
                nextLong = q.a.nextLong();
            }
            else {
                final long longValue = (long)b.first;
                intent.putExtra("related_count", (Serializable)b.second);
                nextLong = longValue;
            }
            this.d.put(longExtra, nextLong);
            intent.putExtra("search_id", nextLong);
            this.b.i(nextLong);
        }
        final RelatedTweetsFragment relatedTweetsFragment = new RelatedTweetsFragment();
        final Bundle arguments = new Bundle();
        arguments.putInt("empty_title", 2131297635);
        arguments.putInt("empty_desc", 2131297636);
        arguments.putBoolean("show_related_in_fragment", true);
        relatedTweetsFragment.setArguments(arguments);
        relatedTweetsFragment.a(this.getIntent());
        relatedTweetsFragment.h(true);
        this.getSupportFragmentManager().beginTransaction().setTransition(4097).replace(2131886399, relatedTweetsFragment, "related_tweets_fragment").commit();
    }
    
    private void a(final RelatedTweetsFragment a) {
        final ToolBar m = this.M();
        a.R();
        m.setCustomView(null);
        m.setDisplayShowTitleEnabled(true);
        a.a(new pj(a, false));
        this.setTitle(2131297538);
        this.a = a;
        this.Q();
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        final int a = super.a(toolBar);
        toolBar.a(2131887461).b(false);
        return a;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969018);
        bn.e(true);
        bn.b(6);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951658, toolBar);
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.b = bg.a((Context)this, this.U().g());
        this.e = pn.a((Context)this);
        this.c = (TwitterScribeAssociation)new TwitterScribeAssociation().b("search");
        this.H().a(this.c);
        if (bundle == null) {
            this.d = new HashMap();
            this.a(this.getIntent());
        }
        else {
            this.d = (HashMap)bundle.getSerializable("search_ids");
        }
        this.b.a(this.d.values());
    }
    
    @Override
    protected void onDestroy() {
        if (this.U().d()) {
            this.b.b(this.d.values());
        }
        super.onDestroy();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.a(intent);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a((RelatedTweetsFragment)this.getSupportFragmentManager().findFragmentByTag("related_tweets_fragment"));
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("search_ids", (Serializable)this.d);
    }
    
    @Override
    protected int[] u_() {
        return new int[] { 0, 0 };
    }
}
