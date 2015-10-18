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

public class ClientNetworkStatus extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final ClientNetworkStatus$NetworkStatus a;
    private final ClientNetworkStatus$NetworkStatus b;
    private final String c;
    private final ClientNetworkStatus$CaptivePortalStatus d;
    private final String e;
    private final String f;
    private final MobileDetails g;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    protected ClientNetworkStatus(final Parcel parcel) {
        super(parcel);
        if (parcel.readByte() != 0) {
            this.a = ClientNetworkStatus$NetworkStatus.a(parcel.readInt());
        }
        else {
            this.a = null;
        }
        if (parcel.readByte() != 0) {
            this.b = ClientNetworkStatus$NetworkStatus.a(parcel.readInt());
        }
        else {
            this.b = null;
        }
        if (parcel.readByte() != 0) {
            this.c = parcel.readString();
        }
        else {
            this.c = null;
        }
        if (parcel.readByte() != 0) {
            this.d = ClientNetworkStatus$CaptivePortalStatus.a(parcel.readInt());
        }
        else {
            this.d = null;
        }
        if (parcel.readByte() != 0) {
            this.e = parcel.readString();
        }
        else {
            this.e = null;
        }
        if (parcel.readByte() != 0) {
            this.f = parcel.readString();
        }
        else {
            this.f = null;
        }
        if (parcel.readByte() != 0) {
            this.g = (MobileDetails)parcel.readParcelable(MobileDetails.class.getClassLoader());
            return;
        }
        this.g = null;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        if (this.a != null) {
            jsonGenerator.a("network_status", this.a.a());
        }
        if (this.b != null) {
            jsonGenerator.a("internet_status", this.b.a());
        }
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            jsonGenerator.a("radio_status_raw", this.c);
        }
        if (this.d != null) {
            jsonGenerator.a("captive_portal_status", this.d.a());
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            jsonGenerator.a("ssid_hash", this.e);
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            jsonGenerator.a("bssid_hash", this.f);
        }
        if (this.g != null) {
            jsonGenerator.a("mobile_details");
            this.g.b(jsonGenerator);
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
            final ClientNetworkStatus clientNetworkStatus = (ClientNetworkStatus)o;
            Label_0059: {
                if (this.f != null) {
                    if (this.f.equals(clientNetworkStatus.f)) {
                        break Label_0059;
                    }
                }
                else if (clientNetworkStatus.f == null) {
                    break Label_0059;
                }
                return false;
            }
            if (this.d != clientNetworkStatus.d) {
                return false;
            }
            if (this.b != clientNetworkStatus.b) {
                return false;
            }
            Label_0115: {
                if (this.g != null) {
                    if (this.g.equals(clientNetworkStatus.g)) {
                        break Label_0115;
                    }
                }
                else if (clientNetworkStatus.g == null) {
                    break Label_0115;
                }
                return false;
            }
            if (this.a != clientNetworkStatus.a) {
                return false;
            }
            Label_0158: {
                if (this.c != null) {
                    if (this.c.equals(clientNetworkStatus.c)) {
                        break Label_0158;
                    }
                }
                else if (clientNetworkStatus.c == null) {
                    break Label_0158;
                }
                return false;
            }
            if (this.e != null) {
                if (this.e.equals(clientNetworkStatus.e)) {
                    return true;
                }
            }
            else if (clientNetworkStatus.e == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.b != null) {
            hashCode2 = this.b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.c != null) {
            hashCode3 = this.c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.d != null) {
            hashCode4 = this.d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.e != null) {
            hashCode5 = this.e.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.f != null) {
            hashCode6 = this.f.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        final MobileDetails g = this.g;
        int hashCode7 = 0;
        if (g != null) {
            hashCode7 = this.g.hashCode();
        }
        return n6 + hashCode7;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        wv.a(parcel, this.a);
        if (this.a != null) {
            parcel.writeInt(this.a.a());
        }
        wv.a(parcel, this.b);
        if (this.b != null) {
            parcel.writeInt(this.b.a());
        }
        wv.a(parcel, this.c);
        if (this.c != null) {
            parcel.writeString(this.c);
        }
        wv.a(parcel, this.d);
        if (this.d != null) {
            parcel.writeInt(this.d.a());
        }
        wv.a(parcel, this.e);
        if (this.e != null) {
            parcel.writeString(this.e);
        }
        wv.a(parcel, this.f);
        if (this.f != null) {
            parcel.writeString(this.f);
        }
        wv.a(parcel, this.g);
        if (this.g != null) {
            parcel.writeParcelable((Parcelable)this.g, n);
        }
    }
}
