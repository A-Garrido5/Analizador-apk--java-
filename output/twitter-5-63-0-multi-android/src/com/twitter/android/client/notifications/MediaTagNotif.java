// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.provider.ae;
import com.twitter.android.TweetActivity;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class MediaTagNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new t();
    }
    
    MediaTagNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public MediaTagNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    @Override
    protected String b() {
        return this.e.getString(2131297338, new Object[] { this.a.a() });
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
        return this.e.getString(2131297318);
    }
    
    @Override
    protected int i() {
        return 2130839309;
    }
    
    @Override
    protected Intent j() {
        return new Intent(this.e, (Class)TweetActivity.class).setData(ae.a(this.a.f, this.b)).setAction("com.twitter.android.home.mediatags." + this.c);
    }
    
    @Override
    protected String k() {
        return "media_tagged";
    }
    
    public aa l() {
        if (!this.y()) {
            return new m(this.a, this.c, this.b);
        }
        return m.a(this.a, this.c, this.b, this, null);
    }
}
