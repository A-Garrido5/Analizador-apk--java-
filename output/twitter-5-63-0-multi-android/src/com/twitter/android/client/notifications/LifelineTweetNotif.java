// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class LifelineTweetNotif extends TweetNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    LifelineTweetNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public LifelineTweetNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    @Override
    protected int a() {
        return 2131297323;
    }
    
    public int i() {
        return 2130839293;
    }
    
    @Override
    protected String k() {
        return "lifeline_alert";
    }
    
    @Override
    protected int m() {
        return 2131297323;
    }
    
    @Override
    protected int n() {
        return 2131297337;
    }
}
