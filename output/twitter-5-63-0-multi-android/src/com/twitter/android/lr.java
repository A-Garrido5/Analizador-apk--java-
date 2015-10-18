// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import com.twitter.android.composer.au;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.widget.SocialBylineView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.errorreporter.ErrorReporter;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.ActivityDataList;
import com.twitter.android.widget.ActivityUserView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.util.i;
import com.twitter.library.api.TwitterUser;
import android.widget.TextView;
import com.twitter.library.experiments.b;
import com.twitter.library.util.bj;
import android.content.res.Resources;
import java.util.ArrayList;
import com.twitter.library.widget.TweetView;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.content.Context;
import com.twitter.internal.android.widget.TypefacesSpan;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.util.ah;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.util.SparseIntArray;
import android.util.SparseArray;
import com.twitter.library.widget.c;

public class lr extends l implements c
{
    private static final int[] A;
    private static final int[] B;
    private static final int[] C;
    private static final int[] D;
    private static final int[] E;
    private static final int[] F;
    private static final int[] G;
    private static final int[] H;
    private static final int[] I;
    private static final int[] J;
    private static final SparseArray K;
    private static final SparseArray L;
    private static final SparseIntArray M;
    private static final int[] s;
    private static final int[] t;
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;
    private static final int[] z;
    private final TwitterScribeAssociation N;
    private final ah O;
    private long P;
    
    static {
        s = new int[] { 0, 2131297020, 2131297024, 2131297021, 2131297019, 2131297020, 2131297022 };
        t = new int[] { 0, 2131297119 };
        u = new int[] { 0, 2131296973, 2131296977, 2131296973, 2131296973, 2131296975, 2131296973 };
        v = new int[] { 0, 2131296974, 2131296978, 2131296974, 2131296974, 2131296976, 2131296974 };
        w = new int[] { 0, 2131296979, 2131296983, 2131296979, 2131296979, 2131296981, 2131296979 };
        x = new int[] { 0, 2131296980, 2131296984, 2131296980, 2131296980, 2131296982, 2131296980 };
        y = new int[] { 0, 2131296962, 2131296966, 2131296962, 2131296962, 2131296964, 2131296962 };
        z = new int[] { 0, 2131296963, 2131296967, 2131296963, 2131296963, 2131296965, 2131296963 };
        A = new int[] { 0, 2131297583, 2131297587, 2131297583, 2131297583, 2131297585, 2131297583 };
        B = new int[] { 0, 2131297584, 2131297588, 2131297584, 2131297586, 2131297584 };
        C = new int[] { 0, 2131297589, 2131297593, 2131297589, 2131297589, 2131297591, 2131297589 };
        D = new int[] { 0, 2131297590, 2131297594, 2131297590, 2131297592, 2131297590 };
        E = new int[] { 0, 2131297572, 2131297576, 2131297572, 2131297572, 2131297574, 2131297572 };
        F = new int[] { 0, 2131297573, 2131297577, 2131297573, 2131297575, 2131297573 };
        G = new int[] { 0, 2131296956, 2131296960, 2131296956, 2131296956, 2131296958, 2131296956 };
        H = new int[] { 0, 2131296957, 2131296961, 2131296957, 2131296957, 2131296959, 2131296957 };
        I = new int[] { 0, 2131297566, 2131297570, 2131297566, 2131297566, 2131297568, 2131297566 };
        J = new int[] { 0, 2131297567, 2131297571, 2131297567, 2131297567, 2131297569, 2131297567 };
        (K = new SparseArray(8)).put(5, (Object)lr.s);
        lr.K.put(13, (Object)lr.t);
        lr.K.put(4, (Object)lr.A);
        lr.K.put(9, (Object)lr.C);
        lr.K.put(11, (Object)lr.E);
        lr.K.put(1, (Object)lr.u);
        lr.K.put(10, (Object)lr.w);
        lr.K.put(12, (Object)lr.y);
        lr.K.put(16, (Object)lr.G);
        lr.K.put(17, (Object)lr.I);
        lr.K.put(19, (Object)lr.s);
        (L = new SparseArray(6)).put(4, (Object)lr.B);
        lr.L.put(9, (Object)lr.D);
        lr.L.put(11, (Object)lr.F);
        lr.L.put(1, (Object)lr.v);
        lr.L.put(10, (Object)lr.x);
        lr.L.put(12, (Object)lr.z);
        lr.L.put(16, (Object)lr.H);
        lr.L.put(17, (Object)lr.J);
        (M = new SparseIntArray(8)).put(5, 2130838676);
        lr.M.put(13, 2130838676);
        lr.M.put(1, 2130838674);
        lr.M.put(10, 2130838674);
        lr.M.put(12, 2130838674);
        lr.M.put(4, 2130838681);
        lr.M.put(9, 2130838681);
        lr.M.put(11, 2130838681);
        lr.M.put(16, 2130838674);
        lr.M.put(17, 2130838681);
    }
    
    public lr(final TwitterFragmentActivity twitterFragmentActivity, final boolean b, final z z, final s s, final FriendshipCache friendshipCache, final ah o, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, b, z, s, friendshipCache, twitterScribeAssociation);
        this.P = -1L;
        this.N = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("connect")).c("activity");
        this.p = 3;
        this.O = o;
        this.n = new TypefacesSpan[] { new TypefacesSpan((Context)twitterFragmentActivity, 1) };
        this.o = new TypefacesSpan[] { this.n[0], new TypefacesSpan((Context)twitterFragmentActivity, 1), new TypefacesSpan((Context)twitterFragmentActivity, 1), new TypefacesSpan((Context)twitterFragmentActivity, 1) };
        this.q = new int[] { 2130968695, 2130968587, 2130968696 };
    }
    
    @Override
    public Intent a(final Context context, final View view, final Cursor cursor) {
        return null;
    }
    
    @Override
    protected void a(final View view, final Tweet tweet, final long n, final int n2, final int n3, final String s, final int n4) {
        final n n5 = (n)view.getTag();
        n5.f.setQuoteDisplayMode(1);
        super.a(view, tweet, n, n2, n3, s, n4);
        n5.f.setHighlighted(!tweet.k);
    }
    
    protected void a(final View view, final Tweet tweet, final long n, final int n2, final int n3, final String s, final int n4, final long n5) {
        int n6 = 1;
        final n n7 = (n)view.getTag();
        n7.f.setQuoteDisplayMode(n6);
        super.a(view, tweet, n, n2, n3, s, n4);
        final TweetView f = n7.f;
        if (tweet.k) {
            n6 = 0;
        }
        f.setHighlighted(n6 != 0);
        n7.f.setScribeItem(TwitterScribeItem.a(n2, n5, tweet.Q));
    }
    
    protected void a(final View view, final ArrayList list, final ArrayList list2, final int n, final int n2, final int n3, final boolean b, final int n4, final int[] array, final int[] array2, final long n5, final int n6, final Resources resources) {
        final af af = (af)view.getTag();
        com.twitter.android.af.a(this.mContext, view, n4, list, list2, b, n5, n6, bj.e, this.m);
        this.a(af.b, resources, array, array2, list, n, n3, n2);
        if (af.e != null) {
            this.a(af.e, list);
        }
        af.f.getLayoutParams().width = b.d();
        af.f.requestLayout();
    }
    
    @Override
    protected void a(final TextView textView, final Resources resources, final int[] array, int[] array2, final ArrayList list, final int n, final int n2, final int n3) {
        final int a = this.a(list);
        if (a == 0) {
            this.a(textView, null, null);
            return;
        }
        final int min = Math.min(n2, 4);
        final boolean e = bj.e;
        final int n4 = min - 1;
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int n5 = 0; n5 <= n4 && list2.size() < a; ++n5) {
            if (n5 <= n4 - 1 || a == min) {
                list2.add(list.get(n5).name);
            }
        }
        final int size = list2.size();
        final int n6 = n - size;
        int n7;
        if (a <= 1 && n6 == 0) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        if (n3 <= 1) {
            array2 = array;
        }
        int n8 = 0;
        switch (size) {
            default: {
                n8 = array[1];
                break;
            }
            case 1: {
                if (n6 > 0) {
                    n8 = array2[5];
                    break;
                }
                n8 = array2[1];
                break;
            }
            case 2: {
                n8 = array2[2];
                break;
            }
            case 3: {
                if (n6 > 0) {
                    n8 = array2[6];
                    break;
                }
                n8 = array2[3];
                break;
            }
            case 4: {
                n8 = array2[4];
                break;
            }
        }
        if (n6 > 0) {
            list2.add((String)n6);
        }
        if (n3 > 0) {
            list2.add((String)n3);
        }
        final String a2 = com.twitter.util.i.a(resources.getString(n8, list2.toArray()), e);
        TypefacesSpan[] array3;
        if (n7 != 0) {
            array3 = this.n;
        }
        else {
            array3 = this.o;
        }
        this.a(textView, a2, array3);
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        final com.twitter.android.client.c b = this.b;
        final Session b2 = this.c.b();
        final PromotedContent promotedContent = userView.getPromotedContent();
        final as a = as.a(this.mContext);
        String s;
        if (userView.l.isChecked()) {
            a.a(new pe(this.mContext, b2, n, promotedContent));
            this.g.c(n);
            s = "unfollow";
        }
        else {
            a.a(new pb(this.mContext, b2, n, promotedContent));
            this.g.b(n);
            s = "follow";
        }
        b.a(((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).b(new String[] { TwitterScribeLog.a(this.N, "user_module", "user", s) })).a(TwitterScribeItem.a(19, this.P, n)));
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final ActivityCursor activityCursor = (ActivityCursor)cursor;
        final int int1 = cursor.getInt(1);
        final long long1 = cursor.getLong(0);
        final long long2 = cursor.getLong(12);
        final Resources resources = context.getResources();
        boolean b;
        if (cursor.getInt(16) == 0) {
            b = true;
        }
        else {
            b = false;
        }
        final boolean b2 = b || long2 <= this.O.a();
        this.O.a(long2);
        final int[] array = (int[])lr.K.get(int1);
        final int[] array2 = (int[])lr.L.get(int1);
        final Integer value = lr.M.get(int1);
        while (true) {
            Tweet tweet5 = null;
            Label_1853: {
                switch (int1) {
                    case 8: {
                        this.a(view, context, cursor);
                        final Tweet tweet = null;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 19: {
                        this.P = cursor.getLong(17);
                        final ArrayList a = this.a(activityCursor, ActivityCursor$ObjectField.b);
                        final ArrayList a2 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        int size;
                        if (a2 != null) {
                            size = a2.size();
                        }
                        else {
                            size = 0;
                        }
                        final ActivityUserView activityUserView = (ActivityUserView)view;
                        final TwitterUser b3 = a.get(0);
                        activityUserView.setUserId(b3.userId);
                        activityUserView.a(this.g, b3, false, this.m);
                        activityUserView.a();
                        String quantityString;
                        if (size > 0) {
                            quantityString = resources.getQuantityString(2131427333, size - 1, new Object[] { a2.get(0).name, size - 1 });
                        }
                        else {
                            quantityString = null;
                        }
                        final v v = (v)activityUserView.getTag();
                        v.c = b3.profileImageUrl;
                        v.b = b3;
                        v.a.setReason(quantityString);
                        v.d = long1;
                        v.e.setRenderRTL(bj.e);
                        activityUserView.l.setChecked(com.twitter.library.api.z.b(b3.friendship));
                        v.e.setLabel(quantityString);
                        v.e.setIcon(2130839286);
                        v.e.setVisibility(0);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final TwitterUser twitterUser = b3;
                        final Tweet tweet = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 13: {
                        final TwitterUser twitterUser2 = this.a(activityCursor, ActivityCursor$ObjectField.a).get(0);
                        lt.a(context, view, twitterUser2, null, int1, this.g);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final TwitterUser twitterUser = twitterUser2;
                        final Tweet tweet = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 5: {
                        final ArrayList a3 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        TwitterUser twitterUser3;
                        if (!a3.isEmpty()) {
                            twitterUser3 = a3.get(0);
                        }
                        else {
                            twitterUser3 = null;
                        }
                        this.a(view, a3, null, cursor.getInt(3), 0, 4, false, value, array, array, long1, int1, resources);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final TwitterUser twitterUser = twitterUser3;
                        final Tweet tweet = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 1:
                    case 11:
                    case 12:
                    case 16:
                    case 17: {
                        final ArrayList a4 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        final ArrayList b4 = this.b(activityCursor, ActivityCursor$ObjectField.b);
                        final int int2 = cursor.getInt(6);
                        final int int3 = cursor.getInt(3);
                        final Tweet tweet2 = b4.get(0);
                        tweet2.k = b2;
                        this.a(view, a4, b4, int3, int2, 2, int2 > this.a(b4), value, array, array2, long1, int1, resources);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final Tweet tweet = tweet2;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 9:
                    case 10: {
                        final ArrayList a5 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        final ArrayList a6 = this.a(activityCursor, ActivityCursor$ObjectField.b, ActivityCursor$IdType.b);
                        final int int4 = cursor.getInt(6);
                        final int int5 = cursor.getInt(3);
                        final Tweet tweet3 = a6.get(0);
                        tweet3.k = b2;
                        this.a(view, a5, a6, int5, int4, 2, int4 > this.a(a6), value, array, array2, long1, int1, resources);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final Tweet tweet = tweet3;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 4: {
                        final ArrayList a7 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        final ArrayList b5 = this.b(activityCursor, ActivityCursor$ObjectField.c);
                        final int int6 = cursor.getInt(9);
                        final int int7 = cursor.getInt(3);
                        final Tweet tweet4 = b5.get(0);
                        tweet4.k = b2;
                        this.a(view, a7, b5, int7, int6, 2, int6 > this.a(b5), value, array, array2, long1, int1, resources);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final Tweet tweet = tweet4;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 6: {
                        final ArrayList a8 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        final ArrayList a9 = this.a((Cursor)activityCursor, ActivityCursor$ObjectField.c);
                        final af af = (af)view.getTag();
                        final ActivityDataList j = a9.get(0);
                        com.twitter.android.af.a(this.mContext, view, 2130838678, a8, null, false, long1, int1, bj.e, this.m);
                        af.j = j;
                        this.a(af.b, resources.getString(2131297146, new Object[] { a8.get(0).name, a9.get(0).name }), this.o);
                        ((com.twitter.internal.android.widget.n)view).setHighlighted(!b2);
                        final ActivityDataList list = j;
                        final Tweet tweet = null;
                        final TwitterUser twitterUser = null;
                        break Label_0233;
                    }
                    case 18:
                    case 20: {
                        this.P = cursor.getLong(17);
                        final ArrayList b6 = this.b(activityCursor, ActivityCursor$ObjectField.b);
                        final ArrayList a10 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                        if (CollectionUtils.a((Collection)b6) || CollectionUtils.a((Collection)a10)) {
                            break;
                        }
                        tweet5 = b6.get(0);
                        if (tweet5 != null) {
                            tweet5.k = b2;
                            this.a(view, tweet5, long1, int1, cursor.getPosition(), a10.get(0).name, a10.size(), this.P);
                            final Tweet tweet = tweet5;
                            final TwitterUser twitterUser = null;
                            final ActivityDataList list = null;
                            break Label_0233;
                        }
                        break Label_1853;
                    }
                    case 2: {
                        final ArrayList b7 = this.b(activityCursor, ActivityCursor$ObjectField.c);
                        if (CollectionUtils.a((Collection)b7)) {
                            break;
                        }
                        tweet5 = b7.get(0);
                        if (tweet5 != null) {
                            tweet5.k = b2;
                            this.a(view, tweet5, long1, int1, cursor.getPosition(), null, -1);
                            final Tweet tweet = tweet5;
                            final TwitterUser twitterUser = null;
                            final ActivityDataList list = null;
                            break Label_0233;
                        }
                        break Label_1853;
                    }
                    case 3: {
                        final Tweet tweet6 = this.b(activityCursor, ActivityCursor$ObjectField.b).get(0);
                        tweet6.k = b2;
                        this.a(view, tweet6, long1, int1, cursor.getPosition(), null, -1);
                        final Tweet tweet = tweet6;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 15: {
                        final Tweet tweet7 = this.b(activityCursor, ActivityCursor$ObjectField.b).get(0);
                        tweet7.k = b2;
                        this.a(view, tweet7, long1, int1, cursor.getPosition(), null, -1);
                        final Tweet tweet = tweet7;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                    case 14: {
                        final ArrayList b8 = this.b(activityCursor, ActivityCursor$ObjectField.b);
                        if (CollectionUtils.a((Collection)b8)) {
                            ErrorReporter.a(new RuntimeException("Quote Notification statuses null or empty"));
                            final Tweet tweet = null;
                            final TwitterUser twitterUser = null;
                            final ActivityDataList list = null;
                            break Label_0233;
                        }
                        final Tweet tweet8 = b8.get(0);
                        if (tweet8 != null) {
                            tweet8.k = b2;
                            this.a(view, tweet8, long1, int1, cursor.getPosition(), null, -1);
                            final Tweet tweet = tweet8;
                            final TwitterUser twitterUser = null;
                            final ActivityDataList list = null;
                            break Label_0233;
                        }
                        ErrorReporter.a(new RuntimeException("Quote Notification null status"));
                        final Tweet tweet = tweet8;
                        final TwitterUser twitterUser = null;
                        final ActivityDataList list = null;
                        break Label_0233;
                    }
                }
                final ActivityDataList list = null;
                final TwitterUser twitterUser = null;
                final Tweet tweet = null;
                this.a(tweet, twitterUser, list, long1, int1, cursor.getPosition(), this.P);
                return;
            }
            final Tweet tweet = tweet5;
            final TwitterUser twitterUser = null;
            final ActivityDataList list = null;
            continue;
        }
    }
    
    @Override
    public int getItemViewType(final int n) {
        int n2 = 0;
        switch (((ActivityCursor)this.getItem(n)).getInt(1)) {
            default: {
                n2 = super.getItemViewType(n);
                if (n2 != -1) {
                    break;
                }
                return 11;
            }
            case 6: {
                return 10;
            }
            case 2:
            case 3:
            case 14:
            case 15: {
                n2 = super.getItemViewType(n);
                if (n2 == -1) {
                    return 11;
                }
                break;
            }
            case 1:
            case 4: {
                return 0;
            }
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17: {
                return 0;
            }
            case 19: {
                return 14;
            }
            case 18: {
                return 15;
            }
            case 20: {
                return 16;
            }
            case 5: {
                return 17;
            }
            case 13: {
                return 13;
            }
        }
        return n2;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(context);
        final int int1 = cursor.getInt(1);
        switch (int1) {
            default: {
                final View a = this.a(from, viewGroup);
                a.setOnClickListener((View$OnClickListener)this);
                return a;
            }
            case 8: {
                return this.a(context, cursor, viewGroup, from);
            }
            case 19: {
                final View inflate = ActivityUserView.inflate(context, 2130968864, (ViewGroup)null);
                final UserView userView = (UserView)inflate;
                userView.a(2130837600, this);
                userView.l.setBackgroundResource(2130837601);
                final v tag = new v((ActivityUserView)userView);
                tag.e = (SocialBylineView)userView.findViewById(2131886151);
                userView.setTag((Object)tag);
                userView.setOnClickListener((View$OnClickListener)this);
                return inflate;
            }
            case 13: {
                return lt.a(from, context, (View$OnClickListener)this, 2130968585);
            }
            case 1:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17: {
                return af.a(from, (View$OnClickListener)this, 2130968586, int1);
            }
        }
    }
    
    @Override
    public void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof n) {
            final n n = (n)view.getTag();
            final TweetView f = n.f;
            final Tweet tweet = f.getTweet();
            if (tweet != null) {
                final TwitterScribeItem scribeItem = f.getScribeItem();
                this.b.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).a(this.mContext, tweet, this.N, null).b(new String[] { TwitterScribeLog.a(this.N, "tweet", "tweet", "click") })).a(this.N)).a(scribeItem));
                String s;
                if (n.f.getSocialContextType() == 2) {
                    s = "mention";
                }
                else {
                    s = "reply";
                }
                final int socialContextType = n.f.getSocialContextType();
                switch (socialContextType) {
                    default: {
                        this.l.a(tweet, s);
                        break;
                    }
                    case 18:
                    case 20: {
                        this.l.a(tweet, s, n.a, socialContextType, n.f.getSocialContextCount(), n.f.getSocialContextName(), scribeItem, this.P);
                    }
                }
            }
            return;
        }
        if (tag instanceof ls) {
            final Tweet d = ((ls)tag).d;
            this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).b(new String[] { TwitterScribeLog.a(this.N, "joined_twitter", "composebox", "click") })).a(this.N));
            if (d != null) {
                au.a(this.mContext).a(d).a(this.c.b().e()).b(this.mContext);
                return;
            }
            au.a(this.mContext).a("@" + ((ls)tag).e.username + " ", null).b(this.mContext);
        }
        else {
            if (tag instanceof lt) {
                final lt lt = (lt)tag;
                if (lt.g != null) {
                    this.l.a(lt.g, lt.f);
                }
                else if (lt.h != null) {
                    this.l.a(lt.h.userId, lt.h.username);
                }
                this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).b(new String[] { TwitterScribeLog.a(this.N, "joined_twitter", lt.f, "click") })).a(this.N));
                return;
            }
            if (tag instanceof v) {
                final v v = (v)tag;
                final TwitterScribeItem a = TwitterScribeItem.a(19, this.P, v.b.userId);
                final Intent putExtra = new Intent(this.mContext, (Class)ProfileActivity.class).putExtra("user_id", v.b.userId).putExtra("screen_name", v.b.username).putExtra("reason", v.a.getReason()).putExtra("activity_row_id", v.d).putExtra("scribe_item", (Parcelable)a).putExtra("magic_rec_id", this.P);
                this.b.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c.b().g()).b(new String[] { TwitterScribeLog.a(this.N, "user_module", "user", "profile_click") })).a(this.N)).a(a));
                this.mContext.startActivity(putExtra);
                return;
            }
            super.onClick(view);
        }
    }
}
