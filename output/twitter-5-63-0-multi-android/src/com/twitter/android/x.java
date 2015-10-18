// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.api.TwitterUser;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.ActivityUserView;
import android.database.Cursor;
import android.view.View;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.UserView;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import android.content.Context;

final class x extends yo
{
    private final boolean a;
    private final int b;
    private final long k;
    private final mz l;
    
    public x(final Context context, final int n, final int n2, final c c, final FriendshipCache friendshipCache, final int n3, final int n4, final boolean b, final boolean b2, final boolean a, final int b3, final long k, final mz l) {
        super(context, n, n2, c, friendshipCache, n3, n4, b, b2);
        this.a = a;
        this.b = b3;
        this.k = k;
        this.l = l;
    }
    
    @Override
    protected UserView a(final UserView userView) {
        userView.a(2130837600, this.f);
        userView.l.setBackgroundResource(2130837601);
        userView.setTag((Object)new yk(userView));
        return userView;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final TwitterUser a = ActivityCursor.a(cursor);
        final ActivityUserView activityUserView = (ActivityUserView)view;
        activityUserView.setUserId(a.userId);
        activityUserView.a(this.g, a, this.a, this.j);
        final TwitterScribeItem a2 = TwitterScribeItem.a(this.b, this.k, a.a());
        activityUserView.setScribeItem(a2);
        if (this.l != null) {
            a2.c = 3;
            final Bundle bundle = new Bundle(3);
            bundle.putParcelable("scribe_item", (Parcelable)a2);
            bundle.putLong("user_tag", a.a());
            bundle.putInt("position", cursor.getPosition());
            this.l.a(view, null, bundle);
        }
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final ActivityUserView activityUserView = (ActivityUserView)LayoutInflater.from(context).inflate(2130968587, viewGroup, false);
        this.a(activityUserView);
        return (View)activityUserView;
    }
}
