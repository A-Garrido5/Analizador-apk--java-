// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.util.collection.CollectionUtils;
import android.net.Uri;
import com.twitter.android.lists.f;
import com.twitter.library.provider.aq;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.az;
import com.twitter.library.util.k;
import com.twitter.library.provider.cw;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import android.widget.ListAdapter;
import android.support.v4.app.Fragment;
import com.twitter.android.client.v;
import android.widget.BaseAdapter;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.service.y;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.provider.ad;
import android.widget.ListView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import android.os.Bundle;
import android.support.v4.content.Loader;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.database.Cursor;
import java.util.HashSet;
import com.twitter.library.client.Session;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import com.twitter.library.api.timeline.z;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.provider.af;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.util.i;
import com.twitter.library.util.bj;
import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import com.twitter.android.lists.d;
import com.twitter.android.widget.ez;
import com.twitter.library.util.FriendshipCache;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.twitter.library.widget.c;
import com.twitter.android.client.TwitterListFragment;

public class ActivityDetailFragment extends TwitterListFragment implements mz, c
{
    private final Map a;
    private final List b;
    private final ArrayList c;
    private final List d;
    private long e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private Set k;
    private FriendshipCache l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int[] q;
    private boolean r;
    private ez s;
    private yo t;
    private yo u;
    private xc v;
    private com.twitter.android.lists.d w;
    private boolean x;
    
    public ActivityDetailFragment() {
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
    }
    
    private String a(final String s, final boolean b, final boolean b2) {
        switch (this.f) {
            case 1: {
                return "favorited_you";
            }
            case 10: {
                return "favorited_retweet";
            }
            case 12: {
                return "favorited_mention";
            }
            case 4: {
                return "retweeted_you";
            }
            case 9: {
                return "retweeted_retweet";
            }
            case 11: {
                return "retweeted_mention";
            }
            case 5: {
                if (b) {
                    return "followed_you";
                }
                break;
            }
            case 13: {
                if (b) {
                    return "joined_twitter";
                }
                break;
            }
            case 6: {
                if (b2) {
                    return "listed_you";
                }
                break;
            }
            case 15: {
                return "media_tagged_you";
            }
            case 16: {
                return "favorited_media_tag";
            }
            case 17: {
                return "retweeted_media_tag";
            }
        }
        return s;
    }
    
    private void a(final View view, final long n) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("screen_name", ((yk)view.getTag()).b.getUserName());
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(5)).a(this.X));
        final Integer j = this.l.j(n);
        if (j != null) {
            putExtra.putExtra("friendship", (Serializable)j);
        }
        this.startActivityForResult(putExtra, 1);
    }
    
    private void a(final yo yo) {
        final TwitterFragmentActivity ax = this.ax();
        if (ax != null) {
            final int count = yo.getCount();
            final String[] b = this.b(yo);
            if (b != null) {
                switch (count) {
                    default: {
                        ax.b(com.twitter.util.i.a(this.getResources().getString(2131296294, new Object[] { b[0], count - 1 }), bj.e));
                    }
                    case 1: {
                        ax.b(com.twitter.util.i.a(this.getResources().getString(2131296293, new Object[] { b[0] }), bj.e));
                    }
                    case 2: {
                        ax.b(com.twitter.util.i.a(this.getResources().getString(2131296295, new Object[] { b[0], b[1] }), bj.e));
                    }
                }
            }
        }
    }
    
    private void a(final Tweet tweet, final int n) {
        final TwitterScribeItem a = TwitterScribeItem.a(this.getActivity().getApplicationContext(), tweet, this.Z, null);
        a.g = n + 1;
        this.c.add(a);
    }
    
    private void a(final TwitterScribeItem twitterScribeItem) {
        String string = null;
        final com.twitter.android.client.c aw = this.aw();
        String a = null;
        if (com.twitter.library.provider.af.a(this.g)) {
            switch (this.f) {
                default: {
                    a = this.a(null, true, false);
                    break;
                }
                case 18: {
                    a = "magic_rec_favorited_by";
                    string = "magic_rec_favorited_by::user_module:user:follow";
                    break;
                }
                case 19: {
                    a = "magic_rec_followed_by";
                    string = "magic_rec_followed_by::user_module:user:follow";
                    break;
                }
                case 20: {
                    a = "magic_rec_retweeted_by";
                    string = "magic_rec_retweeted_by::user_module:user:follow";
                    break;
                }
            }
        }
        else {
            switch (this.f) {
                default: {
                    return;
                }
                case 1: {
                    a = "favorited_by";
                    string = null;
                    break;
                }
                case 5: {
                    a = "followed";
                    string = null;
                    break;
                }
                case 4: {
                    a = "retweeted_by";
                    string = null;
                    break;
                }
            }
        }
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.aF().g());
        final String[] array = { null };
        if (string == null) {
            string = a + ":::unfollow";
        }
        array[0] = string;
        aw.a(((TwitterScribeLog)twitterScribeLog.b(array)).a(twitterScribeItem));
    }
    
    private void a(final Boolean b, final TwitterScribeItem twitterScribeItem) {
        final com.twitter.android.client.c aw = this.aw();
        String a = null;
        String string = null;
        if (com.twitter.library.provider.af.a(this.g)) {
            switch (this.f) {
                default: {
                    a = this.a(null, true, false);
                    string = null;
                    break;
                }
                case 18: {
                    a = "magic_rec_favorited_by";
                    string = "magic_rec_favorited_by::user_module:user:follow";
                    break;
                }
                case 19: {
                    a = "magic_rec_followed_by";
                    string = "magic_rec_followed_by::user_module:user:follow";
                    break;
                }
                case 20: {
                    a = "magic_rec_retweeted_by";
                    string = "magic_rec_retweeted_by::user_module:user:follow";
                    break;
                }
            }
        }
        else {
            switch (this.f) {
                default: {
                    return;
                }
                case 1: {
                    a = "favorited_by";
                    string = null;
                    break;
                }
                case 5: {
                    a = "followed";
                    string = null;
                    break;
                }
                case 4: {
                    a = "retweeted_by";
                    string = null;
                    break;
                }
            }
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.aF().g()).a(twitterScribeItem);
        final String[] array = { null };
        if (string == null) {
            string = a + ":::follow";
        }
        array[0] = string;
        final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)twitterScribeLog.b(array);
        aw.a(twitterScribeLog2);
        if (b) {
            twitterScribeLog2.b(new String[] { a + ":::follow_back" });
            aw.a(twitterScribeLog2);
        }
    }
    
    private void b(final long n) {
        if (n != 0L) {
            final Session b = this.aE().b(n);
            final List b2 = this.b;
            if (b != null && !b2.isEmpty()) {
                this.a(new z((Context)this.getActivity(), b, -1, b2));
                b2.clear();
            }
        }
    }
    
    private boolean b(final long n, final long n2) {
        final Long value = n;
        HashSet<Long> set = this.a.get(value);
        if (set == null) {
            set = new HashSet<Long>();
            this.a.put(value, set);
        }
        return set.add(n2);
    }
    
    private String[] b(final yo yo) {
        final Cursor cursor = yo.getCursor();
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        final String[] array = { cursor.getString(3), null };
        String string;
        if (cursor.moveToNext()) {
            string = cursor.getString(3);
        }
        else {
            string = "";
        }
        array[1] = string;
        return array;
    }
    
    private void c(final long n) {
        String string = null;
        if (com.twitter.library.provider.af.a(this.g)) {
            switch (this.f) {
                default: {
                    final String a = this.a(null, false, false);
                    string = null;
                    if (a != null) {
                        string = a + "::stream::results";
                        break;
                    }
                    break;
                }
                case 19: {
                    string = "magic_rec_followed_by::stream::results";
                    break;
                }
                case 18: {
                    string = "magic_rec_favorited_by::stream::results";
                    break;
                }
                case 20: {
                    string = "magic_rec_retweeted_by::stream::results";
                    break;
                }
            }
        }
        else {
            switch (this.f) {
                default: {
                    string = null;
                    break;
                }
                case 1: {
                    string = "favorited_by::stream::results";
                    break;
                }
                case 4: {
                    string = "retweeted_by::stream::results";
                    break;
                }
            }
        }
        if (string != null && !this.c.isEmpty()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { string })).b(this.c));
            this.c.clear();
        }
    }
    
    private yo e() {
        final FragmentActivity activity = this.getActivity();
        final FriendshipCache l = this.l;
        final boolean r = this.r;
        final int f = this.f;
        final long e = this.e;
        ActivityDetailFragment activityDetailFragment;
        if (this.e > 0L) {
            activityDetailFragment = this;
        }
        else {
            activityDetailFragment = null;
        }
        return new x((Context)activity, 0, 2130837600, this, l, 0, 0, false, false, r, f, e, activityDetailFragment);
    }
    
    private String r() {
        String a = null;
        if (com.twitter.library.provider.af.a(this.g)) {
            a = this.a(null, false, false);
        }
        else {
            switch (this.f) {
                default: {
                    return null;
                }
                case 1: {
                    a = "favorited_by";
                    break;
                }
                case 4: {
                    a = "retweeted_by";
                    break;
                }
            }
        }
        return ScribeLog.a(new String[] { a, ":tweet:link:open_link" });
    }
    
    private void s() {
        String a = null;
        if (com.twitter.library.provider.af.a(this.g)) {
            a = this.a("connect", true, false);
        }
        else {
            switch (this.f) {
                default: {
                    a = "connect";
                    break;
                }
                case 1: {
                    a = "favorited_by";
                    break;
                }
                case 5: {
                    a = "followed_by";
                    break;
                }
                case 4: {
                    a = "retweeted_by";
                    break;
                }
                case 6: {
                    a = "list_member_added";
                    break;
                }
            }
        }
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).b(a));
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968581, viewGroup);
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            case 0: {
                this.t.swapCursor(cursor);
                break;
            }
            case 1: {
                this.u.swapCursor(cursor);
                break;
            }
            case 2: {
                this.v.swapCursor(cursor);
                break;
            }
            case 3: {
                this.w.swapCursor(cursor);
                break;
            }
        }
        boolean b = true;
        if (this.t != null && this.t.getCursor() == null) {
            b = false;
        }
        if (this.u != null && this.u.getCursor() == null) {
            b = false;
        }
        if (this.v != null && this.v.getCursor() == null) {
            b = false;
        }
        if (this.w != null && this.w.getCursor() == null) {
            b = false;
        }
        if (b) {
            this.c_(3);
        }
        if (this.x) {
            yo yo;
            if (this.f != 5 && this.f != 13 && this.u != null) {
                yo = this.u;
            }
            else {
                yo = this.t;
            }
            this.a(yo);
        }
    }
    
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        if (tweet == null) {
            final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)bundle.getParcelable("scribe_item");
            final long long1 = bundle.getLong("user_tag");
            if (twitterScribeItem != null && this.d.add(long1)) {
                twitterScribeItem.g = 1 + bundle.getInt("position");
                this.c.add(twitterScribeItem);
            }
        }
        else if (!tweet.k && this.b(this.aF().g(), tweet.Z)) {
            this.b.add(tweet.Z);
            this.a(tweet, bundle.getInt("position"));
            final PromotedContent j = tweet.j;
            if (j != null) {
                this.aw().a(PromotedEvent.a, j);
            }
        }
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        if (this.s != null) {
            final int c = this.s.c(n);
            if (c == this.m || c == this.n) {
                this.a(view, n2);
                return;
            }
            if (c == this.o) {
                final Cursor cursor = (Cursor)listView.getItemAtPosition(n);
                if (cursor != null) {
                    final Tweet a = new ad(cursor).a();
                    if (com.twitter.library.provider.af.a(this.g) && this.f == 1) {
                        a.m = 16;
                    }
                    final String[] b = this.b(this.t);
                    if (b != null) {
                        a.n = b[0];
                    }
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).putExtra("tw", (Parcelable)a).putExtra("association", (Parcelable)this.Z));
                }
            }
            else if (c == this.p) {
                final Intent intent = (Intent)listView.getItemAtPosition(n);
                if (intent != null) {
                    this.startActivity(intent);
                }
            }
        }
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        final TwitterScribeItem scribeItem = userView.getScribeItem();
        final PromotedContent promotedContent = userView.getPromotedContent();
        if (userView.l.isChecked()) {
            if (!this.k.remove(n)) {
                this.a(new pe((Context)this.getActivity(), this.aF(), n, promotedContent));
            }
            this.l.c(n);
            this.a(scribeItem);
            return;
        }
        if (promotedContent != null) {
            this.a(new pb((Context)this.getActivity(), this.aF(), n, promotedContent));
        }
        else {
            this.k.add(n);
        }
        this.l.b(n);
        this.a(Boolean.valueOf(com.twitter.library.api.z.c(((yk)userView.getTag()).e)), scribeItem);
    }
    
    @Override
    protected void a(final boolean b) {
        int i = 0;
        super.a(b);
        final LoaderManager loaderManager = this.getLoaderManager();
        if (b) {
            for (int[] q = this.q; i < q.length; ++i) {
                loaderManager.restartLoader(q[i], null, this);
            }
        }
        else {
            for (int[] q2 = this.q; i < q2.length; ++i) {
                loaderManager.initLoader(q2[i], null, this);
            }
        }
    }
    
    public void j_() {
        if (this.s != null) {
            this.s.notifyDataSetChanged();
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.s == null) {
            final TwitterFragmentActivity ax = this.ax();
            switch (this.f) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 5:
                case 13:
                case 19: {
                    if (com.twitter.library.provider.af.a(this.g)) {
                        this.t = this.e();
                        this.s = new ez(new BaseAdapter[] { this.t });
                        this.m = 0;
                        this.q = new int[] { 0 };
                        break;
                    }
                    this.t = this.e();
                    this.u = this.e();
                    this.s = new ez(new BaseAdapter[] { this.u, this.t });
                    this.n = 0;
                    this.m = 1;
                    this.q = new int[] { 1, 0 };
                    break;
                }
                case 1:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 16:
                case 17:
                case 18:
                case 20: {
                    this.t = this.e();
                    (this.v = new xc(ax, 0, false, com.twitter.android.client.v.a(this.an).a(), false, new xa(this, this.Z, TwitterScribeLog.a(this.Z, "tweet", "avatar", "profile_click"), this.r()), null, null, this.Z)).b(this);
                    this.s = new ez(new BaseAdapter[] { this.v, this.t });
                    this.o = 0;
                    this.m = 1;
                    this.q = new int[] { 2, 0 };
                    break;
                }
                case 7: {
                    this.t = this.e();
                    this.w = new com.twitter.android.lists.d((Context)ax, 0, true);
                    this.s = new ez(new BaseAdapter[] { this.t, this.w });
                    this.m = 0;
                    this.p = 1;
                    this.q = new int[] { 0, 3 };
                    break;
                }
                case 6: {
                    this.w = new com.twitter.android.lists.d((Context)ax, 0, true);
                    this.u = this.e();
                    this.s = new ez(new BaseAdapter[] { this.w, this.u });
                    this.p = 0;
                    this.n = 1;
                    this.q = new int[] { 3, 1 };
                    break;
                }
            }
        }
        this.Y().setAdapter((ListAdapter)this.s);
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                if (-1 != n2 || intent == null) {
                    break;
                }
                final long longExtra = intent.getLongExtra("user_id", 0L);
                if (longExtra <= 0L || !intent.hasExtra("friendship")) {
                    break;
                }
                final int intExtra = intent.getIntExtra("friendship", 0);
                final FriendshipCache l = this.l;
                if (!l.a(longExtra, intExtra)) {
                    l.b(longExtra, intExtra);
                    this.s.notifyDataSetChanged();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        this.e = arguments.getLong("magic_rec_id");
        this.f = arguments.getInt("event_type");
        this.g = arguments.getInt("type");
        this.h = arguments.getLong("user_tag", 0L);
        this.i = arguments.getLong("status_tag", 0L);
        this.j = arguments.getLong("list_id", 0L);
        this.x = true;
        this.k = new HashSet();
        final com.twitter.android.client.c aw = this.aw();
        if (bundle != null) {
            if (bundle.containsKey("friendship_cache")) {
                this.l = (FriendshipCache)bundle.getSerializable("friendship_cache");
            }
            else {
                this.l = new FriendshipCache();
            }
            this.r = bundle.getBoolean("hide_action_button", true);
        }
        else {
            this.r = arguments.getBoolean("hide_action_button", true);
            this.l = new FriendshipCache();
            if (com.twitter.library.provider.af.a(this.g)) {
                if (this.f == 5 || this.f == 13 || this.f == 6) {
                    this.x = false;
                }
                final String a = this.a(null, true, true);
                if (a != null) {
                    aw.a(this.aF().g(), new String[] { a, ":::impression" });
                }
            }
            else {
                final int f = this.f;
                String s = null;
                switch (f) {
                    case 1: {
                        s = "favorited";
                        break;
                    }
                    case 5: {
                        s = "followed";
                        break;
                    }
                    case 6: {
                        s = "listed";
                        this.x = false;
                        break;
                    }
                    case 4: {
                        s = "retweeted";
                        break;
                    }
                }
                if (s != null) {
                    aw.a(this.aF().g(), new String[] { s, ":::impression" });
                }
            }
        }
        this.s();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final long g = this.aF().g();
        switch (n) {
            case 0: {
                return new k((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(be.o, g), g), cw.a, "tag=?", new String[] { String.valueOf(this.h) }, "_id ASC");
            }
            case 1: {
                return new k((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(be.p, g), g), cw.a, "tag=?", new String[] { String.valueOf(this.h) }, "_id ASC");
            }
            case 2: {
                Uri uri = null;
                switch (this.f) {
                    default: {
                        uri = null;
                        break;
                    }
                    case 1:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 16:
                    case 17: {
                        uri = com.twitter.library.provider.ae.a(ContentUris.withAppendedId(az.p, g), g);
                        break;
                    }
                    case 4: {
                        uri = com.twitter.library.provider.ae.a(ContentUris.withAppendedId(az.q, g), g);
                        break;
                    }
                }
                if (uri != null) {
                    return new CursorLoader((Context)this.getActivity(), uri, Tweet.a, "tag=?", new String[] { String.valueOf(this.i) }, "_id ASC");
                }
                break;
            }
            case 3: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(com.twitter.library.provider.aq.b, this.j), g), com.twitter.android.lists.f.a, null, null, null);
            }
        }
        return null;
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        switch (loader.getId()) {
            default: {}
            case 0: {
                this.t.swapCursor(null);
            }
            case 1: {
                this.u.swapCursor(null);
            }
            case 2: {
                this.v.swapCursor(null);
            }
            case 3: {
                this.w.swapCursor(null);
            }
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hide_action_button", this.r);
        if (!this.l.a()) {
            bundle.putSerializable("friendship_cache", (Serializable)this.l);
        }
    }
    
    @Override
    public void onStop() {
        final long[] c = CollectionUtils.c(this.k);
        final Session af = this.aF();
        final long g = af.g();
        if (c != null) {
            this.a(new pd(this.an, af, c, true), 0, 0);
            this.k.clear();
        }
        super.onStop();
        this.b(g);
        this.c(g);
    }
}
