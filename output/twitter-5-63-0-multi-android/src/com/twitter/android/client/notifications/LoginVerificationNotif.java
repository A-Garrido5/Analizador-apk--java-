// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.SecuritySettingsActivity;
import com.twitter.android.LoginVerificationActivity;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class LoginVerificationNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new p();
    }
    
    LoginVerificationNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public LoginVerificationNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    public String b() {
        return this.B();
    }
    
    public String c() {
        if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
            return this.a.d;
        }
        return this.e.getString(2131297324);
    }
    
    public String d() {
        if (!TextUtils.isEmpty((CharSequence)this.a.e)) {
            return this.a.e;
        }
        return "@" + this.c;
    }
    
    public int i() {
        return 2130839309;
    }
    
    @Override
    protected Intent j() {
        if (com.twitter.library.api.account.p.g(this.e, this.c)) {
            final Intent intent = new Intent(this.e, (Class)LoginVerificationActivity.class);
            intent.putExtra("lv_account_name", this.c);
            return intent;
        }
        final Intent intent2 = new Intent(this.e, (Class)SecuritySettingsActivity.class);
        intent2.putExtra("SecuritySettingsActivity_account_name", this.c);
        return intent2;
    }
    
    @Override
    protected String k() {
        return null;
    }
}
