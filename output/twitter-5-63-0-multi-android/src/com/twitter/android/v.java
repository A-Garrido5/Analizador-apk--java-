// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.FriendshipCache;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.util.a;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.widget.ActivityUserView;

final class v
{
    public ActivityUserView a;
    public TwitterUser b;
    public String c;
    public long d;
    public SocialBylineView e;
    
    public v(final ActivityUserView a) {
        this.a = a;
        if (this.a != null) {
            com.twitter.util.a.a((View)this.a, 2);
        }
    }
    
    public static View a(final LayoutInflater layoutInflater, final int n, final View$OnClickListener view$OnClickListener) {
        final ActivityUserView activityUserView = (ActivityUserView)layoutInflater.inflate(n, (ViewGroup)null);
        final v tag = new v(activityUserView);
        if (activityUserView.l != null) {
            activityUserView.l.setTag((Object)new p());
            activityUserView.a(2130837600, view$OnClickListener);
            activityUserView.l.setBackgroundResource(2130837601);
        }
        activityUserView.setTag((Object)tag);
        return (View)activityUserView;
    }
    
    public static void a(final View view, final TwitterUser twitterUser, final FriendshipCache friendshipCache, final boolean b, final long n) {
        final v v = (v)view.getTag();
        final ActivityUserView a = v.a;
        a.a(friendshipCache, twitterUser, b, n);
        ((p)a.l.getTag()).a = twitterUser;
        v.b = twitterUser;
    }
}
