// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Build$VERSION;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import com.twitter.library.media.manager.k;
import android.text.TextUtils;
import com.twitter.android.DMActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class DMNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public DMNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public DMNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    private String a(final String s, String a, final boolean b) {
        if (a == null) {
            a = ak.a(this.e.getResources(), this.a.g, this.a.a(), "", false, b, true, 0, null, false);
        }
        if (this.b(s)) {
            return a;
        }
        return this.e.getString(2131296884, new Object[] { a, s });
    }
    
    static Intent b(final Context context, final String s) {
        return new Intent(context, (Class)DMActivity.class).putExtra("conversation_id", s).putExtra("is_from_notification", true).setAction("com.twitter.android.home.messages." + s);
    }
    
    private boolean b(final String s) {
        return TextUtils.isEmpty((CharSequence)s) || TextUtils.getTrimmedLength((CharSequence)s) == 0;
    }
    
    private boolean n() {
        return !ak.a(this.a.i, this.a.g, this.b);
    }
    
    private String r() {
        final String e = this.a.e;
        String a;
        if (this.b(this.a.e) && !TextUtils.isEmpty((CharSequence)this.a.l)) {
            a = null;
        }
        else {
            a = this.a.a();
        }
        return this.a(e, a, this.n());
    }
    
    public b a() {
        return new b(this, this.a, this.c, this.b);
    }
    
    @Override
    protected k a(final Context context, final String s) {
        return (k)super.a(context, s).a(new t(az.a(context).b(this.v()).h()));
    }
    
    public String b() {
        if (this.b(this.a.e) && !TextUtils.isEmpty((CharSequence)this.a.l)) {
            return this.a(this.a.e, null, true);
        }
        return this.r();
    }
    
    public String c() {
        if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
            return this.a.d;
        }
        return this.a.a();
    }
    
    public String d() {
        if (!TextUtils.isEmpty((CharSequence)this.a.l)) {
            return this.a(this.a.e, null, this.n());
        }
        return this.e();
    }
    
    @Override
    public String e() {
        if (this.n()) {
            return this.r();
        }
        return this.a.e;
    }
    
    @Override
    public String f() {
        if (this.a.v != null) {
            return this.a.v.a();
        }
        return null;
    }
    
    @Override
    public boolean g() {
        return Build$VERSION.SDK_INT >= 16 && this.G() != null;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    public int i() {
        return 2130839295;
    }
    
    @Override
    protected Intent j() {
        return b(this.e, this.a.i);
    }
    
    @Override
    protected String k() {
        return "message";
    }
}
