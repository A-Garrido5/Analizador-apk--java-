// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.internal.android.widget.TypefacesSpan;
import com.twitter.library.provider.ActivityDataList;
import com.twitter.library.api.TwitterUser;
import android.content.res.Resources;
import com.twitter.library.experiments.b;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.View$OnLongClickListener;

public class mp extends l implements View$OnLongClickListener
{
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private final vf v;
    
    public mp(final TwitterFragmentActivity twitterFragmentActivity, final boolean b, final vf v, final z z, final FriendshipCache friendshipCache, final s s, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, b, z, s, friendshipCache, twitterScribeAssociation);
        this.s = new int[] { 0, 2131297015, 2131297018, 2131297016, 2131297017, 2131297017 };
        this.t = new int[] { 0, 2131296968, 2131296970, 2131296969, 2131296972, 2131296971 };
        this.u = new int[] { 0, 2131297578, 2131297580, 2131297579, 2131297582, 2131297581 };
        this.v = v;
        this.r = true;
    }
    
    @Override
    public Intent a(final Context context, final View view, final Cursor cursor) {
        return null;
    }
    
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Context context, final int n, final boolean b, final View$OnClickListener onClickListener, final View$OnLongClickListener onLongClickListener) {
        final ArrayList<View> list = new ArrayList<View>();
        for (int i = 0; i < n; ++i) {
            final View a = this.a(layoutInflater, viewGroup);
            ((n)a.getTag()).f.setShowSocialBadge(false);
            list.add(a);
            a.setOnClickListener(onClickListener);
            a.setOnLongClickListener(onLongClickListener);
        }
        return com.twitter.android.r.a(layoutInflater, context, list, b, onClickListener, this.q);
    }
    
    protected void a(final View view) {
        final r r = (r)view.getTag();
        if (r.a != null) {
            final com.twitter.android.u u = (com.twitter.android.u)r.a.getTag();
            u.d.getLayoutParams().width = com.twitter.library.experiments.b.d();
            u.d.requestLayout();
        }
    }
    
    protected void a(final View view, final Resources resources, final TwitterUser twitterUser, final ActivityDataList list) {
        final com.twitter.android.u u = (com.twitter.android.u)view.getTag();
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131558446);
        view.setPadding(resources.getDimensionPixelOffset(2131558422), dimensionPixelOffset, 0, dimensionPixelOffset);
        if (twitterUser == null || twitterUser.name == null || list == null || list.name == null) {
            this.a(u.c, null, null);
            return;
        }
        this.a(u.c, resources.getString(2131297138, new Object[] { twitterUser.name, list.name }), this.o);
    }
    
    protected void a(final View view, final Resources resources, final TwitterUser twitterUser, final ActivityDataList list, final int n) {
        final r r = (r)view.getTag();
        if (r.a != null) {
            final com.twitter.android.u u = (com.twitter.android.u)r.a.getTag();
            if (twitterUser == null || twitterUser.name == null || list == null || list.name == null || n == 0) {
                this.a(u.c, null, null);
            }
            else {
                if (n == 1) {
                    this.a(u.c, resources.getString(2131297143, new Object[] { twitterUser.name, list.name }), this.o);
                    return;
                }
                if (n == 2) {
                    this.a(u.c, resources.getString(2131297145, new Object[] { twitterUser.name, list.name }), this.o);
                    return;
                }
                this.a(u.c, resources.getString(2131297144, new Object[] { twitterUser.name, n, list.name }), this.o);
            }
        }
    }
    
    public void a(final View view, final ArrayList list, final int n, final int n2, final long n3, final vf vf, final int n4, final Resources resources, final int n5) {
        final r r = (r)view.getTag();
        for (int min = Math.min(list.size(), r.b.size()), i = 0; i < min; ++i) {
            final Tweet tweet = list.get(i);
            final View view2 = r.b.get(i);
            this.a(view2, tweet, n3, n4, n5, null, -1);
            this.a(tweet, null, null, n3, n4, n5, -1L);
            vf.b((xb)view2.getTag(), tweet.Q);
        }
        if (r.a != null) {
            com.twitter.android.u.a(r.a, n2, n3, n4);
        }
        if (r.c != null) {
            com.twitter.android.o.a(r.c, n, n3, n4);
        }
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final ActivityCursor activityCursor = (ActivityCursor)cursor;
        final int int1 = cursor.getInt(1);
        final long long1 = cursor.getLong(0);
        final Resources resources = context.getResources();
        switch (int1) {
            default: {}
            case 8: {
                this.a(view, context, cursor);
            }
            case 5: {
                this.a(view, resources, cursor, long1, int1, this.s, false, this.m);
            }
            case 7: {
                final ArrayList a = this.a(activityCursor, ActivityCursor$ObjectField.a);
                final ArrayList a2 = this.a((Cursor)activityCursor, ActivityCursor$ObjectField.b);
                TwitterUser twitterUser;
                if (this.a(a) == 0) {
                    twitterUser = null;
                }
                else {
                    twitterUser = a.get(0);
                }
                ActivityDataList list;
                if (this.a(a2) == 0) {
                    list = null;
                }
                else {
                    list = a2.get(0);
                }
                com.twitter.android.u.a(view, 2130838678, long1, int1);
                this.a(view, resources, twitterUser, list);
                this.a(null, null, list, long1, int1, cursor.getPosition(), -1L);
            }
            case 6: {
                final ArrayList a3 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                final ArrayList a4 = this.a((Cursor)activityCursor, ActivityCursor$ObjectField.c);
                final ArrayList a5 = this.a(activityCursor, ActivityCursor$ObjectField.b);
                final int int2 = cursor.getInt(6);
                final ActivityDataList list2 = a4.get(0);
                this.a(view, a5, int2, 2130838678, long1, int1, this.m);
                this.a(view, resources, a3.get(0), list2, int2);
                this.a(null, null, list2, long1, int1, cursor.getPosition(), -1L);
            }
            case 4: {
                final ArrayList a6 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                final ArrayList b = this.b(activityCursor, ActivityCursor$ObjectField.c);
                final int int3 = cursor.getInt(9);
                this.a(view, b, int3, 2130838681, long1, this.v, int1, resources, cursor.getPosition());
                this.a(view, resources, this.u, this.u, a6, a6.size(), 2, int3);
                this.a(view);
            }
            case 1: {
                final ArrayList a7 = this.a(activityCursor, ActivityCursor$ObjectField.a);
                final ArrayList b2 = this.b(activityCursor, ActivityCursor$ObjectField.b);
                if (a7 != null && !a7.isEmpty()) {
                    for (final Tweet tweet : b2) {
                        tweet.m = 16;
                        tweet.n = a7.get(0).name;
                    }
                }
                final int int4 = cursor.getInt(6);
                this.a(view, b2, int4, 2130838674, long1, this.v, int1, resources, cursor.getPosition());
                final int[] t = this.t;
                final int[] t2 = this.t;
                int size;
                if (a7 == null) {
                    size = 0;
                }
                else {
                    size = a7.size();
                }
                this.a(view, resources, t, t2, a7, size, 2, int4);
                this.a(view);
            }
        }
    }
    
    @Override
    public int d() {
        return 8;
    }
    
    @Override
    public int getItemViewType(final int n) {
        final int itemViewType = super.getItemViewType(n);
        if (itemViewType != -1) {
            return itemViewType;
        }
        final ActivityCursor activityCursor = (ActivityCursor)this.getItem(n);
        final int int1 = activityCursor.getInt(1);
        switch (int1) {
            case 1:
            case 4: {
                int n2;
                if (int1 == 4) {
                    n2 = 9;
                }
                else {
                    n2 = 6;
                }
                final int int2 = activityCursor.getInt(n2);
                if (int2 <= 0) {
                    break;
                }
                final int a = com.twitter.android.l.a(int2);
                if (a == 1) {
                    return 0;
                }
                if (a == 2) {
                    return 1;
                }
                if (a == 3 && int2 == 3) {
                    return 2;
                }
                if (a == 4) {
                    return 3;
                }
                return 4;
            }
        }
        return itemViewType;
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(context);
        switch (cursor.getInt(1)) {
            default: {
                return null;
            }
            case 8: {
                return this.a(context, cursor, viewGroup, from);
            }
            case 5:
            case 6: {
                final int int1 = cursor.getInt(6);
                final int a = com.twitter.android.l.a(int1);
                return this.a(from, context, a, int1 > a, (View$OnClickListener)this);
            }
            case 7: {
                return com.twitter.android.u.a(from, (View$OnClickListener)this, this.q[0]);
            }
            case 1: {
                final int int2 = cursor.getInt(6);
                final int a2 = com.twitter.android.l.a(int2);
                return this.a(from, viewGroup, context, a2, int2 > a2, (View$OnClickListener)this, (View$OnLongClickListener)this);
            }
            case 4: {
                final int int3 = cursor.getInt(9);
                final int a3 = com.twitter.android.l.a(int3);
                return this.a(from, viewGroup, context, a3, int3 > a3, (View$OnClickListener)this, (View$OnLongClickListener)this);
            }
        }
    }
    
    public boolean onLongClick(final View view) {
        if (view.getTag() instanceof n) {
            final n n = (n)view.getTag();
            this.v.a(n, n.f.getTweet().Q);
            return true;
        }
        return false;
    }
}
