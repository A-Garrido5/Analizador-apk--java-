// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.widget.ListAdapter;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.aw;
import android.support.v4.content.Loader;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.vf;
import com.twitter.library.view.z;
import com.twitter.android.xc;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.os.Bundle;
import java.io.Serializable;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.provider.ae;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.TweetActivity;
import com.twitter.android.RootTweetActivity;
import com.twitter.android.xb;
import android.view.View;
import android.widget.ListView;
import android.database.Cursor;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.xa;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterListFragment;

public class ViewMoreVideoFragment extends TwitterListFragment implements LoaderManager$LoaderCallbacks
{
    private long a;
    private Tweet b;
    private boolean c;
    
    public ViewMoreVideoFragment() {
        this.c = true;
    }
    
    private xa a(final String s) {
        final StringBuilder sb = new StringBuilder();
        return new xa(this, this.Z, null, TwitterScribeLog.a(this.Z, s, "avatar", "profile_click"), ScribeLog.a(sb, "video_timeline", "", s, "link", "open_link"), ScribeLog.a(sb, "video_timeline", "", s, "platform_photo_card", "click"), ScribeLog.a(sb, "video_timeline", "", s, "platform_player_card", "click"));
    }
    
    private void d(final int n) {
        int n2 = 2;
        if (n == n2) {
            n2 = 1;
        }
        this.a(bg.a((Context)this.getActivity(), this.aE().b(), this.a, this.b, n2), n, n);
    }
    
    @Override
    public void a(final int n, final y y) {
        boolean c = true;
        super.a(n, y);
        if (n == (c ? 1 : 0)) {
            if (((g)y).t() <= 0) {
                c = false;
            }
            this.c = c;
        }
        this.A_();
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && cursor.getInt(14) == 0 && cursor.getCount() < 400 && this.c) {
            this.d(1);
        }
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        super.a(listView, view, n, n2);
        final Tweet tweet = ((xb)view.getTag()).f.getTweet();
        final FragmentActivity activity = this.getActivity();
        Serializable s;
        if (this.ac()) {
            s = RootTweetActivity.class;
        }
        else {
            s = TweetActivity.class;
        }
        this.startActivity(new Intent((Context)activity, (Class)s).putExtra("association", (Parcelable)this.Z).setData(com.twitter.library.provider.ae.b(tweet.Q, this.aE().b().g())));
    }
    
    @Override
    protected void i() {
        this.d(2);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final Bundle arguments = this.getArguments();
        this.Z = (TwitterScribeAssociation)arguments.getParcelable("association");
        this.a = arguments.getLong("search_id", -1L);
        this.b = (Tweet)arguments.getParcelable("tw");
        this.W = (ListAdapter)new xc(this.ax(), 2, true, true, false, this.a(""), null, null, this.Z);
        this.Y().setAdapter(this.W);
        this.q();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.c = bundle.getBoolean("more_old_data_available", true);
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(aw.a, this.aF().g()), cc.a, "search_id=?", new String[] { String.valueOf(this.a) }, "type_id ASC, _id ASC");
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("more_old_data_available", this.c);
    }
}
