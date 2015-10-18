// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.ProfileActivity;
import android.content.Intent;
import android.text.TextUtils;
import android.content.Context;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class FollowNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    FollowNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public FollowNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    private boolean n() {
        return this.a.v != null && this.a.v.b != null && this.a.v.b.h;
    }
    
    @Override
    public String al_() {
        return "@" + this.c;
    }
    
    @Override
    protected String b() {
        final Context e = this.e;
        int n;
        if (this.n()) {
            n = 2131297334;
        }
        else {
            n = 2131297335;
        }
        return e.getString(n, new Object[] { this.a.a() });
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
        final Context e = this.e;
        int n;
        if (this.n()) {
            n = 2131297315;
        }
        else {
            n = 2131297316;
        }
        return e.getString(n);
    }
    
    @Override
    protected int i() {
        return 2130839309;
    }
    
    @Override
    protected Intent j() {
        return new Intent(this.e, (Class)ProfileActivity.class).putExtra("screen_name", this.a.h).setAction("com.twitter.android.home.fol." + this.c);
    }
    
    @Override
    protected String k() {
        if (this.n()) {
            return "followed_back";
        }
        return "followed";
    }
    
    public aa l() {
        if (!this.y()) {
            return new m(this.a, this.c, this.b);
        }
        return m.a(this.a, this.c, this.b, this, new i(this.a, this.c, this.b));
    }
    
    @Override
    protected String o() {
        return this.e.getString(2131297500);
    }
    
    @Override
    protected String p() {
        return "follow";
    }
}
