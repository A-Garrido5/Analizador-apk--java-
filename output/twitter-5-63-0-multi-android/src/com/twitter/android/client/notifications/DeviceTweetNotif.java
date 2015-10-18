// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class DeviceTweetNotif extends TweetNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    DeviceTweetNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public DeviceTweetNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    @Override
    protected int a() {
        return 2131297328;
    }
    
    public int i() {
        return 2130839309;
    }
    
    @Override
    protected String k() {
        return "tweet";
    }
    
    public aa l() {
        if (fl.b() == 3) {
            return new com.twitter.android.client.notifications.d(this, this.a, this.c, this.b);
        }
        return super.l();
    }
    
    @Override
    protected int m() {
        return 2131297328;
    }
    
    @Override
    protected int n() {
        return 2131297340;
    }
    
    @Override
    protected String o() {
        return this.e.getString(2131297503);
    }
    
    @Override
    protected String p() {
        return "tweet_" + this.a.h;
    }
    
    @Override
    protected String q() {
        return "tweet";
    }
}
