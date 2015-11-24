// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.Session;
import com.twitter.ui.dialog.e;
import java.util.Map;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.util.bd;
import com.twitter.library.api.z;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.library.view.TweetActionType;
import java.util.HashMap;
import android.content.Context;
import com.twitter.library.client.az;
import java.util.ArrayList;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.TwitterListFragment;
import android.widget.ListView;
import android.widget.AdapterView$OnItemLongClickListener;
import android.view.View$OnTouchListener;

public class vi implements View$OnTouchListener, AdapterView$OnItemLongClickListener
{
    private final vf a;
    private final ListView b;
    private int c;
    private int d;
    private int e;
    private vk f;
    private TwitterListFragment g;
    
    public vi(final TwitterListFragment g, final vf a, final ListView b, final int e) {
        if (a == null) {
            throw new IllegalArgumentException("tweetActionsHelper cannot be null");
        }
        this.a = a;
        this.b = b;
        this.e = e;
        this.b.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)this);
        this.g = g;
    }
    
    public static void a(final Tweet tweet, final TweetView tweetView, final FragmentActivity fragmentActivity, final vf vf, final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        final Session b2 = az.a((Context)fragmentActivity).b();
        final long g = b2.g();
        final HashMap<Integer, TweetActionType> hashMap = new HashMap<Integer, TweetActionType>();
        if (b2.d()) {
            hashMap.put(list.size(), TweetActionType.p);
            list.add(fragmentActivity.getString(2131297796));
            if (EngagementActionBar.b(tweet, g)) {
                hashMap.put(list.size(), TweetActionType.f);
                list.add(fragmentActivity.getString(2131296388));
            }
        }
        if (EngagementActionBar.a(tweet, g)) {
            hashMap.put(list.size(), TweetActionType.g);
            list.add(fragmentActivity.getString(2131297789));
        }
        if (EngagementActionBar.a(tweet)) {
            hashMap.put(list.size(), TweetActionType.h);
            list.add(fragmentActivity.getString(2131296390));
        }
        int n;
        if (tweetView == null || tweetView.getFriendshipCache() == null) {
            n = tweet.r;
        }
        else {
            final FriendshipCache friendshipCache = tweetView.getFriendshipCache();
            if (friendshipCache.a(tweet.C)) {
                n = friendshipCache.j(tweet.C);
            }
            else {
                n = 0;
            }
        }
        final boolean d = z.d(n);
        final boolean e = z.e(n);
        int n2;
        if (tweet.C == g) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean a = bd.a(tweet);
        if (n2 == 0) {
            if (!a) {
                if (d) {
                    hashMap.put(list.size(), TweetActionType.m);
                    list.add(fragmentActivity.getString(2131298028));
                }
                else {
                    hashMap.put(list.size(), TweetActionType.l);
                    list.add(fragmentActivity.getString(2131297283));
                }
            }
            if (e) {
                hashMap.put(list.size(), TweetActionType.o);
                list.add(fragmentActivity.getString(2131298089));
            }
            else {
                hashMap.put(list.size(), TweetActionType.n);
                list.add(fragmentActivity.getString(2131296376));
            }
        }
        if (list.size() == 1 && hashMap.get(0) == TweetActionType.g) {
            vf.a(tweet, tweetView, TweetActionType.g);
        }
        else if (b) {
            PromptDialogFragment.b(0).a(list.toArray(new CharSequence[list.size()])).a(new vj(vf, tweet, tweetView, hashMap)).a(fragmentActivity.getSupportFragmentManager());
        }
    }
    
    private boolean b() {
        if (!this.g.h_()) {
            return false;
        }
        final FragmentActivity activity = this.g.getActivity();
        if (activity instanceof jv) {
            return ((jv)activity).h_();
        }
        return !activity.isFinishing();
    }
    
    public void a() {
        this.a.b();
        this.b.setPressed(false);
    }
    
    public void a(final vk f) {
        this.f = f;
    }
    
    public boolean a(final xb xb) {
        a(xb.f.getTweet(), xb.f, this.g.getActivity(), this.a, this.b());
        return true;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (this.f != null) {
            final xb b = this.f.b(view);
            if (b != null && !b.e) {
                return this.a(b);
            }
        }
        final Object tag = view.getTag();
        if (tag instanceof xb) {
            final xb xb = (xb)tag;
            if (!xb.e) {
                return this.a(xb);
            }
        }
        return false;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int n = 0xFF & motionEvent.getAction();
        final int d = (int)motionEvent.getY();
        final int c = (int)motionEvent.getX();
        switch (n) {
            case 0: {
                this.c = c;
                this.d = d;
                break;
            }
            case 2: {
                if (Math.abs(this.c - c) > this.e || Math.abs(this.d - d) > this.e) {
                    this.a();
                    break;
                }
                break;
            }
        }
        return false;
    }
}
