// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import java.io.Serializable;
import android.os.Parcel;
import com.twitter.library.network.t;
import com.twitter.util.q;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.RateLimit;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.OAuth2Token;
import com.twitter.library.network.OAuthToken;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Session implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private Session$LoginStatus a;
    private final String b;
    private boolean c;
    private String d;
    private OAuthToken e;
    private final OAuth2Token f;
    private TwitterUser g;
    private RateLimit h;
    private UserSettings i;
    private ax j;
    
    static {
        CREATOR = (Parcelable$Creator)new aw();
    }
    
    public Session() {
        this.b = q.a(6);
        this.a = Session$LoginStatus.a;
        this.f = new OAuth2Token("bearer_token", t.f);
    }
    
    public Session(final Parcel parcel) {
        this.a = (Session$LoginStatus)parcel.readSerializable();
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.e = (OAuthToken)parcel.readParcelable(OAuthToken.class.getClassLoader());
        this.f = (OAuth2Token)parcel.readParcelable(OAuth2Token.class.getClassLoader());
        this.g = (TwitterUser)parcel.readParcelable(TwitterUser.class.getClassLoader());
    }
    
    public void a() {
        this.c = false;
        this.d = null;
        this.e = null;
        this.g = null;
        this.i = null;
        this.j = null;
    }
    
    public void a(final RateLimit h) {
        if (h != null) {
            this.h = h;
        }
    }
    
    public void a(final TwitterUser g) {
        boolean b;
        if (g != null && !g.a(this.g)) {
            b = true;
        }
        else {
            b = false;
        }
        this.g = g;
        if (this.j != null && b) {
            this.j.a();
        }
    }
    
    public void a(final UserSettings i) {
        if (i != null) {
            this.i = i;
        }
    }
    
    public void a(final Session$LoginStatus a) {
        this.a = a;
    }
    
    public void a(final ax j) {
        this.j = j;
    }
    
    public void a(final OAuthToken e) {
        this.e = e;
    }
    
    public void a(final String d) {
        this.d = d;
    }
    
    public void a(final boolean c) {
        this.c = c;
    }
    
    public Session$LoginStatus b() {
        return this.a;
    }
    
    public String c() {
        return this.b;
    }
    
    public boolean d() {
        return this.a.equals(Session$LoginStatus.c);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.b.equals(((Session)o).b));
    }
    
    public TwitterUser f() {
        return this.g;
    }
    
    public long g() {
        if (this.g != null) {
            return this.g.userId;
        }
        return 0L;
    }
    
    public OAuthToken h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    public boolean i() {
        return this.c;
    }
    
    public UserSettings j() {
        return this.i;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeParcelable((Parcelable)this.e, n);
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeParcelable((Parcelable)this.g, n);
    }
}
