// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.widget.ActionButton;
import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.library.util.bq;
import com.twitter.util.i;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.widget.TweetView;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.text.TextUtils;
import com.twitter.library.util.bo;
import com.twitter.android.client.bh;
import com.twitter.library.util.bj;
import android.content.res.Resources;
import com.twitter.library.provider.ActivityDataList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.Tweet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.util.f;
import java.lang.ref.SoftReference;
import android.widget.AbsListView$LayoutParams;
import com.twitter.library.api.UserSettings;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.util.SparseArray;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.library.util.ReferenceList;
import java.util.ArrayList;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.u;
import android.view.View$OnClickListener;
import android.support.v4.widget.CursorAdapter;

public abstract class l extends CursorAdapter implements View$OnClickListener, u
{
    protected final TwitterFragmentActivity a;
    protected final c b;
    protected final az c;
    protected final ArrayList d;
    protected final ReferenceList e;
    protected final z f;
    protected final FriendshipCache g;
    protected final SparseArray h;
    protected final SparseArray i;
    protected final SparseArray j;
    protected final SparseArray k;
    protected final s l;
    protected long m;
    protected TypefacesSpan[] n;
    protected TypefacesSpan[] o;
    protected int p;
    protected int[] q;
    protected boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final TwitterScribeAssociation v;
    private t w;
    
    public l(final TwitterFragmentActivity a, final boolean s, final z f, final s l, final FriendshipCache g, final TwitterScribeAssociation v) {
        int u = 1;
        super((Context)a, null, 2);
        this.d = new ArrayList();
        this.e = ReferenceList.a();
        this.p = 6;
        this.v = v;
        this.a = a;
        this.c = az.a((Context)a);
        this.f = f;
        this.b = com.twitter.android.client.c.a((Context)a);
        final TypefacesSpan[] n = new TypefacesSpan[u];
        n[0] = new TypefacesSpan((Context)a, 0);
        this.n = n;
        final TypefacesSpan[] o = new TypefacesSpan[4];
        o[0] = this.n[0];
        o[u] = new TypefacesSpan((Context)a, 0);
        o[2] = new TypefacesSpan((Context)a, 0);
        o[3] = new TypefacesSpan((Context)a, 0);
        this.o = o;
        this.h = new SparseArray();
        this.i = new SparseArray();
        this.j = new SparseArray();
        this.k = new SparseArray();
        this.s = s;
        final UserSettings j = this.c.b().j();
        if (j == null || !j.k) {
            u = 0;
        }
        this.u = (u != 0);
        this.q = new int[] { 2130968583, 2130968587, 2130968589 };
        this.l = l;
        this.g = g;
    }
    
    protected static int a(final int n) {
        if (n > 4) {
            return 3;
        }
        return Math.min(4, n);
    }
    
    protected static AbsListView$LayoutParams a() {
        return new AbsListView$LayoutParams(-1, -2);
    }
    
    private ArrayList a(final Cursor cursor, final int n, final SparseArray sparseArray) {
        final Integer value = cursor.getInt(0);
        final SoftReference softReference = (SoftReference)sparseArray.get((int)value);
        ArrayList list;
        if (softReference != null) {
            list = softReference.get();
        }
        else {
            list = null;
        }
        if (list == null) {
            list = (ArrayList)com.twitter.util.f.a(cursor.getBlob(n));
            sparseArray.put((int)value, (Object)new SoftReference(list));
        }
        return list;
    }
    
    private ArrayList a(final ActivityCursor activityCursor, final int n, final SparseArray sparseArray, final ActivityCursor$ObjectField activityCursor$ObjectField) {
        final Integer value = activityCursor.getInt(0);
        final SoftReference softReference = (SoftReference)sparseArray.get((int)value);
        ArrayList a;
        if (softReference != null) {
            a = softReference.get();
        }
        else {
            a = null;
        }
        if (a == null) {
            a = activityCursor.a(activityCursor$ObjectField, activityCursor.getBlob(n));
            sparseArray.put((int)value, (Object)new SoftReference(a));
        }
        return a;
    }
    
    private ArrayList a(final ActivityCursor activityCursor, final int n, final SparseArray sparseArray, final ActivityCursor$ObjectField activityCursor$ObjectField, final ActivityCursor$IdType activityCursor$IdType) {
        final Integer value = activityCursor.getInt(0);
        final SoftReference softReference = (SoftReference)sparseArray.get((int)value);
        ArrayList a;
        if (softReference != null) {
            a = softReference.get();
        }
        else {
            a = null;
        }
        if (a == null) {
            a = activityCursor.a(activityCursor$ObjectField, activityCursor.getBlob(n), activityCursor$IdType);
            sparseArray.put((int)value, (Object)new SoftReference(a));
        }
        return a;
    }
    
    protected static LinearLayout$LayoutParams b() {
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        linearLayout$LayoutParams.weight = 1.0f;
        return linearLayout$LayoutParams;
    }
    
    private void g() {
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
    }
    
    protected int a(final ArrayList list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }
    
    public abstract Intent a(final Context p0, final View p1, final Cursor p2);
    
    protected View a(final Context context, final Cursor cursor, final ViewGroup viewGroup, final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2130968582, (ViewGroup)null);
        inflate.setTag((Object)new q(inflate));
        return inflate;
    }
    
    protected View a(final LayoutInflater layoutInflater, final Context context, final int n, final boolean b, final View$OnClickListener onClickListener) {
        final ArrayList<View> list = new ArrayList<View>();
        for (int i = 0; i < n; ++i) {
            final View a = com.twitter.android.v.a(layoutInflater, this.q[1], (View$OnClickListener)this);
            a.setOnClickListener(onClickListener);
            list.add(a);
        }
        return com.twitter.android.r.a(layoutInflater, context, list, b, onClickListener, this.q);
    }
    
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2130969165, viewGroup, false);
        final n tag = new n(inflate);
        tag.f.setOnTweetViewClickListener(this.f);
        tag.f.setFriendshipCache(this.g);
        inflate.setTag((Object)tag);
        this.e.b(tag);
        return inflate;
    }
    
    protected ArrayList a(final Cursor cursor, final ActivityCursor$ObjectField activityCursor$ObjectField) {
        switch (com.twitter.android.m.a[activityCursor$ObjectField.ordinal()]) {
            case 2: {
                if (3 == cursor.getInt(7)) {
                    return this.a(cursor, 8, this.k);
                }
                break;
            }
            case 3: {
                if (3 == cursor.getInt(10)) {
                    return this.a(cursor, 11, this.k);
                }
                break;
            }
        }
        return null;
    }
    
    protected ArrayList a(final ActivityCursor activityCursor, final ActivityCursor$ObjectField activityCursor$ObjectField) {
        switch (com.twitter.android.m.a[activityCursor$ObjectField.ordinal()]) {
            case 1: {
                if (1 == activityCursor.getInt(4)) {
                    return this.a(activityCursor, 5, this.h, activityCursor$ObjectField);
                }
                break;
            }
            case 2: {
                if (1 == activityCursor.getInt(7)) {
                    return this.a(activityCursor, 8, this.i, activityCursor$ObjectField);
                }
                break;
            }
        }
        return null;
    }
    
    protected ArrayList a(final ActivityCursor activityCursor, final ActivityCursor$ObjectField activityCursor$ObjectField, final ActivityCursor$IdType activityCursor$IdType) {
        switch (com.twitter.android.m.a[activityCursor$ObjectField.ordinal()]) {
            case 2: {
                if (2 == activityCursor.getInt(7)) {
                    return this.a(activityCursor, 8, this.j, activityCursor$ObjectField, activityCursor$IdType);
                }
                break;
            }
            case 3: {
                if (2 == activityCursor.getInt(10)) {
                    return this.a(activityCursor, 11, this.j, activityCursor$ObjectField, activityCursor$IdType);
                }
                break;
            }
        }
        return null;
    }
    
    public void a(final long m) {
        this.m = m;
    }
    
    protected void a(final View view, final Context context, final Cursor cursor) {
        final q q = (q)view.getTag();
        if (this.d.contains(cursor.getLong(12))) {
            q.a.setVisibility(0);
            q.c.setVisibility(8);
        }
        else {
            q.a.setVisibility(8);
            q.c.setVisibility(0);
        }
        this.a(null, null, null, -1L, 0, cursor.getPosition(), -1L);
    }
    
    protected void a(final View view, final Resources resources, final Cursor cursor, final long n, final int n2, final int[] array, final boolean b, final long n3) {
        final ActivityCursor activityCursor = (ActivityCursor)cursor;
        final ArrayList a = this.a(activityCursor, ActivityCursor$ObjectField.a);
        final int int1 = cursor.getInt(3);
        ActivityCursor$ObjectField activityCursor$ObjectField;
        if (b) {
            activityCursor$ObjectField = ActivityCursor$ObjectField.a;
        }
        else {
            activityCursor$ObjectField = ActivityCursor$ObjectField.b;
        }
        final ArrayList a2 = this.a(activityCursor, activityCursor$ObjectField);
        int n4;
        if (b) {
            n4 = 3;
        }
        else {
            n4 = 6;
        }
        final int int2 = cursor.getInt(n4);
        this.a(view, a2, int2, 2130838676, n, n2, n3);
        this.a(view, resources, array, array, a, int1, 4, int2);
        this.a(view, a2);
    }
    
    protected void a(final View view, final Resources resources, final int[] array, final int[] array2, final ArrayList list, final int n, final int n2, final int n3) {
        final r r = (r)view.getTag();
        if (r.a != null) {
            this.a(((com.twitter.android.u)r.a.getTag()).c, resources, array, array2, list, n, n2, n3);
        }
    }
    
    protected void a(final View view, final Tweet tweet, final long a, final int socialContextType, final int n, final String socialContextName, int socialContextCount) {
        final n n2 = (n)view.getTag();
        if (this.g != null) {
            this.g.a(tweet);
        }
        n2.a = a;
        n2.f.setRenderRtl(bj.e);
        n2.f.setDisplaySensitiveMedia(this.u);
        n2.f.setAlwaysExpandMedia(this.s && bh.a(this.mContext).a(tweet));
        n2.f.setContentSize(bo.a);
        n2.f.setDisplayTranslationBadge(com.twitter.library.util.text.c.a(this.mContext, tweet));
        final TweetView f = n2.f;
        if (!TextUtils.isEmpty((CharSequence)socialContextName)) {
            --socialContextCount;
        }
        f.setSocialContextCount(socialContextCount);
        n2.f.setSocialContextName(socialContextName);
        n2.f.setSocialContextType(socialContextType);
        n2.f.a(tweet, this.t, new g(this.r, this.a, tweet, DisplayMode.a, this.v, null));
    }
    
    protected void a(final View view, final ArrayList list) {
        this.a(view, list, 3);
    }
    
    protected void a(final View view, final ArrayList list, final int n) {
        final r r = (r)view.getTag();
        if (r.c != null) {
            final o o = (o)r.c.getTag();
            if (o.b != null) {
                final int a = this.a(list);
                if (a <= n) {
                    o.b.setVisibility(8);
                    return;
                }
                o.b.setVisibility(0);
                this.a(o.b, list, n, a);
            }
        }
    }
    
    protected void a(final View view, final ArrayList list, final int n, final int n2, final long n3, final int n4, final long n5) {
        final r r = (r)view.getTag();
        final int size = r.b.size();
        final int min = Math.min(list.size(), size);
        for (int i = 0; i < size; ++i) {
            if (i < min) {
                ((View)r.b.get(i)).setVisibility(0);
                com.twitter.android.v.a((View)r.b.get(i), list.get(i), this.g, true, n5);
            }
            else {
                ((View)r.b.get(i)).setVisibility(8);
            }
        }
        if (r.a != null) {
            com.twitter.android.u.a(r.a, n2, n3, n4);
        }
        if (r.c != null) {
            com.twitter.android.o.a(r.c, n, n3, n4);
        }
    }
    
    protected void a(final ViewGroup viewGroup, final ArrayList list) {
        this.a(viewGroup, list, 0, list.size());
    }
    
    protected void a(final ViewGroup viewGroup, final ArrayList list, int n, final int n2) {
        final int n3 = this.a(list) - n;
        if (n3 > 0) {
            viewGroup.setVisibility(0);
            final int childCount = viewGroup.getChildCount();
            final int min = Math.min(n3, childCount);
            int n5;
            for (int n4 = 0; n4 < min && n < n2; ++n, n4 = n5) {
                final UserImageView userImageView = (UserImageView)viewGroup.getChildAt(n4);
                userImageView.setVisibility(0);
                userImageView.a(list.get(n));
                n5 = n4 + 1;
            }
            for (int i = min; i < childCount; ++i) {
                viewGroup.getChildAt(i).setVisibility(8);
            }
        }
        else {
            viewGroup.setVisibility(8);
        }
    }
    
    protected void a(final TextView textView, final Resources resources, final int[] array, final int[] array2, final ArrayList list, final int n, final int n2, final int n3) {
        final boolean e = bj.e;
        switch (this.a(list)) {
            default: {
                this.a(textView, com.twitter.util.i.a(resources.getString(array[3], new Object[] { list.get(0).name, n - 1 }), e), this.n);
            }
            case 0: {
                this.a(textView, null, null);
            }
            case 1: {
                if (n3 == 2) {
                    this.a(textView, com.twitter.util.i.a(resources.getString(array[4], new Object[] { list.get(0).name, n3 }), e), this.n);
                    return;
                }
                if (n3 > 1) {
                    this.a(textView, com.twitter.util.i.a(resources.getString(array[5], new Object[] { list.get(0).name, n3 }), e), this.n);
                    return;
                }
                this.a(textView, com.twitter.util.i.a(resources.getString(array[1], new Object[] { list.get(0).name }), e), this.n);
            }
            case 2: {
                this.a(textView, com.twitter.util.i.a(resources.getString(array[2], new Object[] { list.get(0).name, list.get(1).name }), e), this.o);
            }
        }
    }
    
    protected void a(final TextView textView, final String s, final TypefacesSpan[] array) {
        if (s == null) {
            textView.setText((CharSequence)null);
            return;
        }
        textView.setText((CharSequence)bq.a(array, s, '\"'));
    }
    
    public void a(final t w) {
        this.w = w;
    }
    
    protected void a(final Tweet tweet, final TwitterUser twitterUser, final ActivityDataList list, final long n, final int n2, final int n3, final long n4) {
        if (this.w != null) {
            final Bundle bundle = new Bundle(7);
            bundle.putParcelable("user", (Parcelable)twitterUser);
            bundle.putParcelable("tweet", (Parcelable)tweet);
            bundle.putSerializable("list", (Serializable)list);
            bundle.putInt("position", n3);
            bundle.putInt("event_type", n2);
            bundle.putLong("activity_row_id", n);
            if (n4 > 0L) {
                bundle.putLong("magic_rec_id", n4);
            }
            this.w.a(bundle);
        }
    }
    
    public void a(final boolean s) {
        if (this.s == s) {
            return;
        }
        this.s = s;
        this.notifyDataSetChanged();
    }
    
    protected ArrayList b(final ActivityCursor activityCursor, final ActivityCursor$ObjectField activityCursor$ObjectField) {
        return this.a(activityCursor, activityCursor$ObjectField, ActivityCursor$IdType.a);
    }
    
    public void b(final long n) {
        this.d.add(n);
    }
    
    public void b(final boolean t) {
        if (this.t != t && !(this.t = t)) {
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().f.q();
            }
        }
    }
    
    public int c() {
        return 4;
    }
    
    public int d() {
        return 8;
    }
    
    public ArrayList e() {
        return this.d;
    }
    
    public void f() {
        this.d.clear();
    }
    
    public int getItemViewType(final int n) {
        final ActivityCursor activityCursor = (ActivityCursor)this.getItem(n);
        switch (activityCursor.getInt(1)) {
            default: {
                return -1;
            }
            case 8: {
                return 12;
            }
            case 5:
            case 6:
            case 13: {
                final int int1 = activityCursor.getInt(this.p);
                if (int1 <= 0) {
                    return 10;
                }
                final int a = a(int1);
                if (a == 1) {
                    return 5;
                }
                if (a == 2) {
                    return 6;
                }
                if (a == 3 && int1 == 3) {
                    return 7;
                }
                if (a == 4) {
                    return 8;
                }
                return 9;
            }
            case 7: {
                return 10;
            }
        }
    }
    
    public int getViewTypeCount() {
        return 18;
    }
    
    public void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof n) {
            final TweetView f = ((n)tag).f;
            if (f.getTweet() != null) {
                this.l.a(f, null);
            }
        }
        else {
            if (tag instanceof v) {
                final v v = (v)tag;
                this.l.a(v.b.userId, v.b.username);
                return;
            }
            if (tag instanceof o) {
                final o o = (o)tag;
                this.l.a(o.c, o.d, 0L);
                return;
            }
            if (tag instanceof com.twitter.android.u) {
                final com.twitter.android.u u = (com.twitter.android.u)tag;
                this.l.a(u.e, u.f, 0L);
                return;
            }
            if (tag instanceof af) {
                final af af = (af)tag;
                final ActivityDataList j = af.j;
                if (j != null) {
                    this.l.a(j.id, j.name, j.fullName, j.creatorUserId);
                    return;
                }
                if (af.h == 5 && af.i != null && af.i.size() == 1) {
                    final TwitterUser twitterUser = af.i.get(0);
                    this.l.a(twitterUser.a(), twitterUser.username);
                    return;
                }
                this.l.a(af.g, af.h, 0L);
            }
            else if (tag instanceof p) {
                final p p = (p)tag;
                final ActionButton actionButton = (ActionButton)view;
                if (actionButton.isChecked()) {
                    actionButton.setChecked(false);
                    this.l.b(p.a);
                    return;
                }
                actionButton.setChecked(true);
                this.l.a(p.a);
            }
        }
    }
    
    public void onContentChanged() {
        this.g();
        super.onContentChanged();
    }
    
    @Override
    public Cursor swapCursor(final Cursor cursor) {
        this.g();
        return super.swapCursor(cursor);
    }
}
