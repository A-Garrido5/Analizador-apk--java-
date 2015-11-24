// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class ClientNetworkRequest extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final ClientNetworkStatus f;
    private final ClientNetworkStatus g;
    private final String h;
    private final String i;
    private final Integer j;
    private final Integer k;
    private final String l;
    private final ClientNetworkRequest$ClientNetworkResponseSource m;
    private final ClientNetworkRequestDetails n;
    private final ClientNetworkRequest$ClientNetworkProxyStatus o;
    private final Boolean p;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    protected ClientNetworkRequest(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        if (parcel.readByte() != 0) {
            this.e = parcel.readString();
        }
        else {
            this.e = null;
        }
        if (parcel.readByte() != 0) {
            this.f = (ClientNetworkStatus)parcel.readParcelable(ClientNetworkStatus.class.getClassLoader());
        }
        else {
            this.f = null;
        }
        if (parcel.readByte() != 0) {
            this.g = (ClientNetworkStatus)parcel.readParcelable(ClientNetworkStatus.class.getClassLoader());
        }
        else {
            this.g = null;
        }
        if (parcel.readByte() != 0) {
            this.h = parcel.readString();
        }
        else {
            this.h = null;
        }
        if (parcel.readByte() != 0) {
            this.i = parcel.readString();
        }
        else {
            this.i = null;
        }
        if (parcel.readByte() != 0) {
            this.j = parcel.readInt();
        }
        else {
            this.j = null;
        }
        if (parcel.readByte() != 0) {
            this.k = parcel.readInt();
        }
        else {
            this.k = null;
        }
        if (parcel.readByte() != 0) {
            this.l = parcel.readString();
        }
        else {
            this.l = null;
        }
        if (parcel.readByte() != 0) {
            this.m = ClientNetworkRequest$ClientNetworkResponseSource.a(parcel.readInt());
        }
        else {
            this.m = null;
        }
        this.n = (ClientNetworkRequestDetails)parcel.readParcelable(ClientNetworkRequestDetails.class.getClassLoader());
        if (parcel.readByte() != 0) {
            this.o = ClientNetworkRequest$ClientNetworkProxyStatus.a(parcel.readInt());
        }
        else {
            this.o = null;
        }
        if (parcel.readByte() != 0) {
            this.p = wv.c(parcel);
            return;
        }
        this.p = null;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.a("uri_scheme", this.a);
        jsonGenerator.a("uri_host_name", this.b);
        jsonGenerator.a("uri_path", this.c);
        jsonGenerator.a("http_method", this.d);
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            jsonGenerator.a("protocol", this.e);
        }
        if (this.f != null) {
            jsonGenerator.a("start_network_status");
            this.f.b(jsonGenerator);
        }
        if (this.g != null) {
            jsonGenerator.a("end_network_status");
            this.g.b(jsonGenerator);
        }
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            jsonGenerator.a("server_name", this.h);
        }
        if (!TextUtils.isEmpty((CharSequence)this.i)) {
            jsonGenerator.a("server_ip", this.i);
        }
        if (this.j != null) {
            jsonGenerator.a("http_status_code", this.j);
        }
        if (this.k != null) {
            jsonGenerator.a("twitter_api_error_code", this.k);
        }
        if (!TextUtils.isEmpty((CharSequence)this.l)) {
            jsonGenerator.a("client_error_info", this.l);
        }
        if (this.m != null) {
            jsonGenerator.a("response_source", this.m.a());
        }
        this.n.a(jsonGenerator);
        if (this.o != null) {
            jsonGenerator.a("proxy_status", this.o.a());
        }
        if (this.p != null) {
            jsonGenerator.a("via_proxy", this.p);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final ClientNetworkRequest clientNetworkRequest = (ClientNetworkRequest)o;
            Label_0059: {
                if (this.l != null) {
                    if (this.l.equals(clientNetworkRequest.l)) {
                        break Label_0059;
                    }
                }
                else if (clientNetworkRequest.l == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.g != null) {
                    if (this.g.equals(clientNetworkRequest.g)) {
                        break Label_0089;
                    }
                }
                else if (clientNetworkRequest.g == null) {
                    break Label_0089;
                }
                return false;
            }
            if (!this.d.equals(clientNetworkRequest.d)) {
                return false;
            }
            Label_0135: {
                if (this.j != null) {
                    if (this.j.equals(clientNetworkRequest.j)) {
                        break Label_0135;
                    }
                }
                else if (clientNetworkRequest.j == null) {
                    break Label_0135;
                }
                return false;
            }
            Label_0165: {
                if (this.e != null) {
                    if (this.e.equals(clientNetworkRequest.e)) {
                        break Label_0165;
                    }
                }
                else if (clientNetworkRequest.e == null) {
                    break Label_0165;
                }
                return false;
            }
            if (this.o != clientNetworkRequest.o) {
                return false;
            }
            if (!this.n.equals(clientNetworkRequest.n)) {
                return false;
            }
            if (this.m != clientNetworkRequest.m) {
                return false;
            }
            Label_0237: {
                if (this.i != null) {
                    if (this.i.equals(clientNetworkRequest.i)) {
                        break Label_0237;
                    }
                }
                else if (clientNetworkRequest.i == null) {
                    break Label_0237;
                }
                return false;
            }
            Label_0267: {
                if (this.h != null) {
                    if (this.h.equals(clientNetworkRequest.h)) {
                        break Label_0267;
                    }
                }
                else if (clientNetworkRequest.h == null) {
                    break Label_0267;
                }
                return false;
            }
            Label_0297: {
                if (this.f != null) {
                    if (this.f.equals(clientNetworkRequest.f)) {
                        break Label_0297;
                    }
                }
                else if (clientNetworkRequest.f == null) {
                    break Label_0297;
                }
                return false;
            }
            Label_0327: {
                if (this.k != null) {
                    if (this.k.equals(clientNetworkRequest.k)) {
                        break Label_0327;
                    }
                }
                else if (clientNetworkRequest.k == null) {
                    break Label_0327;
                }
                return false;
            }
            if (!this.b.equals(clientNetworkRequest.b)) {
                return false;
            }
            if (!this.c.equals(clientNetworkRequest.c)) {
                return false;
            }
            if (!this.a.equals(clientNetworkRequest.a)) {
                return false;
            }
            if (this.p != null) {
                if (this.p.equals(clientNetworkRequest.p)) {
                    return true;
                }
            }
            else if (clientNetworkRequest.p == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode());
        int hashCode;
        if (this.e != null) {
            hashCode = this.e.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.f != null) {
            hashCode2 = this.f.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.g != null) {
            hashCode3 = this.g.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.h != null) {
            hashCode4 = this.h.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.i != null) {
            hashCode5 = this.i.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.j != null) {
            hashCode6 = this.j.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.k != null) {
            hashCode7 = this.k.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (hashCode7 + n7);
        int hashCode8;
        if (this.l != null) {
            hashCode8 = this.l.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n9 = 31 * (hashCode8 + n8);
        int hashCode9;
        if (this.m != null) {
            hashCode9 = this.m.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n10 = 31 * (31 * (hashCode9 + n9) + this.n.hashCode());
        int hashCode10;
        if (this.o != null) {
            hashCode10 = this.o.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n11 = 31 * (hashCode10 + n10);
        final Boolean p = this.p;
        int hashCode11 = 0;
        if (p != null) {
            hashCode11 = this.p.hashCode();
        }
        return n11 + hashCode11;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        wv.a(parcel, this.e);
        if (this.e != null) {
            parcel.writeString(this.e);
        }
        wv.a(parcel, this.f);
        if (this.f != null) {
            parcel.writeParcelable((Parcelable)this.f, n);
        }
        wv.a(parcel, this.g);
        if (this.g != null) {
            parcel.writeParcelable((Parcelable)this.g, n);
        }
        wv.a(parcel, this.h);
        if (this.h != null) {
            parcel.writeString(this.h);
        }
        wv.a(parcel, this.i);
        if (this.i != null) {
            parcel.writeString(this.i);
        }
        wv.a(parcel, this.j);
        if (this.j != null) {
            parcel.writeInt((int)this.j);
        }
        wv.a(parcel, this.k);
        if (this.k != null) {
            parcel.writeInt((int)this.k);
        }
        wv.a(parcel, this.l);
        if (this.l != null) {
            parcel.writeString(this.l);
        }
        wv.a(parcel, this.m);
        if (this.m != null) {
            parcel.writeInt(this.m.a());
        }
        parcel.writeParcelable((Parcelable)this.n, n);
        wv.a(parcel, this.o);
        if (this.o != null) {
            parcel.writeInt(this.o.a());
        }
        wv.a(parcel, this.p);
        if (this.p != null) {
            wv.a(parcel, (boolean)this.p);
        }
    }
}
