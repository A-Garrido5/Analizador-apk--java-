// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.text.TextUtils;
import com.twitter.android.UsersActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class FollowRequestNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    FollowRequestNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public FollowRequestNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    private static Intent a(final Context context, final String s, final String s2) {
        return new Intent(context, (Class)UsersActivity.class).putExtra("type", 18).putExtra("fetch_always", true).putExtra("follow_request_sender", s).setAction("com.twitter.android.home.folreq." + s2);
    }
    
    @Override
    public String al_() {
        return '@' + this.c;
    }
    
    @Override
    protected String b() {
        return this.e.getString(2131297336, new Object[] { this.a.a() });
    }
    
    @Override
    protected String c() {
        if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
            return this.a.d;
        }
        return this.a.a();
    }
    
    @Override
    protected String d() {
        return this.e.getString(2131297317);
    }
    
    @Override
    protected int i() {
        return 2130839309;
    }
    
    @Override
    protected Intent j() {
        return a(this.e, this.a.h, this.c);
    }
    
    @Override
    protected String k() {
        return "followed_request";
    }
    
    public aa l() {
        if (!this.y()) {
            return new m(this.a, this.c, this.b);
        }
        return m.a(this.a, this.c, this.b, this, null);
    }
}
