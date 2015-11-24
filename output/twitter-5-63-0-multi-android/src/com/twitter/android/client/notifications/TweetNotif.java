// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.provider.ae;
import com.twitter.android.TweetActivity;
import android.os.Parcelable;
import com.twitter.android.MainActivity;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.library.platform.d;
import android.os.Parcel;

public abstract class TweetNotif extends StatusBarNotif
{
    protected TweetNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public TweetNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    protected abstract int a();
    
    public String b() {
        if (this.a.b > 1) {
            return this.e.getString(this.m());
        }
        return this.e.getString(this.n(), new Object[] { this.a.a(), this.a.e });
    }
    
    public String c() {
        if (this.a.b > 1) {
            return this.e.getString(this.a());
        }
        if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
            return this.a.d;
        }
        return this.a.a();
    }
    
    public String d() {
        if (this.a.b > 1) {
            return "@" + this.c;
        }
        return this.a.e;
    }
    
    @Override
    protected Intent j() {
        if (this.a.b > 1) {
            return new Intent(this.e, (Class)MainActivity.class).putExtra("page", (Parcelable)MainActivity.c).setAction("com.twitter.android.home." + this.c);
        }
        final Intent setAction = new Intent(this.e, (Class)TweetActivity.class).setData(ae.a(this.a.f, this.b)).setAction("com.twitter.android.home.tw." + this.c);
        if (!com.twitter.library.featureswitch.d.a("intp_nux_autodevicefollow_3263", new String[] { "auto_devicefollow_bucket" })) {
            return setAction;
        }
        final String g = com.twitter.library.featureswitch.d.g("intp_nux_autodevicefollow_account");
        try {
            if (this.a.v.b.a == Long.parseLong(g)) {
                setAction.putExtra("routed_from", "cat_autodevicefollow.");
            }
            return setAction;
        }
        catch (NumberFormatException ex) {}
        catch (NullPointerException ex2) {
            goto Label_0170;
        }
    }
    
    protected abstract int m();
    
    protected abstract int n();
}
