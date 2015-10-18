// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import com.twitter.library.widget.UserView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.twitter.library.api.DiscoverStoryMetadata;
import java.util.Iterator;
import java.util.Map;
import com.twitter.library.provider.Tweet;
import com.twitter.library.util.bj;
import com.twitter.util.f;
import com.twitter.library.api.PromotedContent;
import android.view.View;
import com.twitter.library.util.bo;
import com.twitter.library.provider.bq;
import com.twitter.library.widget.UserSocialView;
import android.database.Cursor;
import com.twitter.internal.android.widget.GroupedRowView;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.animation.Animation;
import java.util.HashMap;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;

public class ez extends it
{
    private final c h;
    private final FriendshipCache i;
    private final fb j;
    private final HashMap k;
    private final Animation l;
    
    public ez(final TwitterFragmentActivity twitterFragmentActivity, final int n, final boolean b, final z z, final vf vf, final c h, final FriendshipCache i, final fb j, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, n, true, b, z, vf, i, -1, twitterScribeAssociation);
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = new HashMap();
        this.l = AnimationUtils.loadAnimation((Context)twitterFragmentActivity, 2131034141);
    }
    
    private fa a(final GroupedRowView groupedRowView, final Cursor cursor) {
        final UserSocialView userSocialView = (UserSocialView)groupedRowView.getChildAt(0);
        final fe fe = (fe)userSocialView.getTag();
        final long long1 = cursor.getLong(bq.i);
        final String string = cursor.getString(bq.t);
        userSocialView.setContentSize(bo.a);
        userSocialView.setUserId(long1);
        userSocialView.setUserImageUrl(cursor.getString(bq.l));
        final long long2 = cursor.getLong(0);
        this.a((View)groupedRowView, long1, long2);
        final int int1 = cursor.getInt(bq.p);
        fe.d = long1;
        fe.e = int1;
        fe.f = string;
        fe.c = long2;
        fe.a = cursor.getInt(bq.h);
        userSocialView.a();
        userSocialView.a(cursor.getString(bq.j), cursor.getString(bq.k));
        final int int2 = cursor.getInt(bq.m);
        userSocialView.setProtected((int2 & 0x1) != 0x0);
        userSocialView.setVerified((int2 & 0x2) != 0x0);
        final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(cursor.getBlob(bq.n));
        userSocialView.a(promotedContent, bj.e);
        if (this.i.a(long1)) {
            userSocialView.l.setChecked(this.i.k(long1));
        }
        else {
            userSocialView.l.setChecked(com.twitter.library.api.z.b(cursor.getInt(bq.p)));
        }
        final int int3 = cursor.getInt(bq.q);
        if (int3 == 1) {
            userSocialView.a(int3, 2130838677, cursor.getString(bq.r), cursor.getInt(bq.s), bj.e);
        }
        else {
            userSocialView.a(int3, 0, null, 0, bj.e);
        }
        return new fa(long2, long1, cursor.getInt(bq.f), cursor.getInt(bq.g), null, long1, promotedContent, string);
    }
    
    private void a(final View view, final long n, final long n2) {
        view.clearAnimation();
        for (final Map.Entry<K, Long> entry : this.k.entrySet()) {
            if (n2 == entry.getValue()) {
                final Long n3 = (Long)entry.getKey();
                if (n != n3) {
                    this.k.remove(n3);
                    view.startAnimation(this.l);
                    break;
                }
                continue;
            }
        }
    }
    
    public Long a(final long n) {
        return this.k.get(n);
    }
    
    public void a() {
        this.k.clear();
    }
    
    public void a(final long n, final long n2) {
        this.k.put(n, n2);
    }
    
    public Long b(final long n) {
        return this.k.remove(n);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final Bundle extras = cursor.getExtras();
        final boolean boolean1 = extras.getBoolean("start", false);
        final boolean boolean2 = extras.getBoolean("end", false);
        final int position = cursor.getPosition();
        final GroupedRowView groupedRowView = (GroupedRowView)view;
        extras.putInt("position", cursor.getPosition());
        if (DiscoverFragment.b(cursor)) {
            final hh hh = (hh)this.g.b(cursor);
            if (hh instanceof hi) {
                final hi hi = (hi)hh;
                if (boolean1) {
                    this.a(view, hi, 2130839525);
                }
                else if (boolean2) {
                    this.a(view, hi, 2130839524);
                }
                else {
                    this.a(view, hi, 2130839523);
                }
            }
            else {
                final Tweet a = this.a(view, (hk)hh, position);
                this.j.a(view, new fa(cursor.getLong(0), a.D, cursor.getInt(bq.f), cursor.getInt(bq.g), a, 0L, null, null), extras);
                ((xb)view.getTag()).f.setTag((Object)com.twitter.util.f.a(cursor.getBlob(bq.v)));
            }
        }
        else if (DiscoverFragment.c(cursor)) {
            this.j.a(view, this.a((GroupedRowView)view, cursor), extras);
        }
        if (boolean1 && boolean2) {
            groupedRowView.setSingle(true);
            if (cursor.getPosition() == 0) {
                groupedRowView.setGroupStyle(1);
                return;
            }
            if (cursor.getPosition() == -1 + cursor.getCount()) {
                groupedRowView.setGroupStyle(3);
                return;
            }
            groupedRowView.setGroupStyle(2);
        }
        else {
            groupedRowView.setSingle(false);
            if (boolean1) {
                if (cursor.getPosition() == 0) {
                    groupedRowView.setGroupStyle(1);
                    return;
                }
                groupedRowView.setGroupStyle(2);
            }
            else {
                if (boolean2) {
                    if (cursor.getPosition() == -1 + cursor.getCount()) {
                        groupedRowView.setGroupStyle(3);
                    }
                    groupedRowView.setStyle(3);
                    return;
                }
                if (this.getItemViewType(1 + cursor.getPosition()) == 3) {
                    groupedRowView.setStyle(0);
                    return;
                }
                groupedRowView.setStyle(2);
            }
        }
    }
    
    @Override
    public long getItemId(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (cursor != null) {
            return cursor.getLong(0);
        }
        return 0L;
    }
    
    @Override
    public int getItemViewType(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (DiscoverFragment.b(cursor)) {
            if (this.a(cursor)) {
                return 1;
            }
            return 0;
        }
        else {
            if (DiscoverFragment.c(cursor)) {
                return 2;
            }
            return 3;
        }
    }
    
    @Override
    public int getViewTypeCount() {
        return 4;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        if (DiscoverFragment.b(cursor)) {
            return super.newView(context, cursor, viewGroup);
        }
        if (DiscoverFragment.c(cursor)) {
            final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968806, (ViewGroup)null);
            final UserView userView = (UserView)groupedRowView.getChildAt(0);
            userView.l.setBackgroundResource(2130837601);
            userView.a(2130837600, this.h);
            userView.setTag((Object)new fe(userView));
            return (View)groupedRowView;
        }
        final GroupedRowView groupedRowView2 = (GroupedRowView)sz.a(2130968795, null, viewGroup, new sy(context.getString(2131298147), null), bo.a);
        groupedRowView2.setSingle(false);
        return (View)groupedRowView2;
    }
}
