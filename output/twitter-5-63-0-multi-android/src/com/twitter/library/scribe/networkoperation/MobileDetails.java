// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class MobileDetails extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final MobileDetails$Orientation a;
    private final Integer b;
    private final Boolean c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final RadioStatus k;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    protected MobileDetails(final Parcel parcel) {
        super(parcel);
        if (parcel.readByte() != 0) {
            this.a = MobileDetails$Orientation.a(parcel.readInt());
        }
        else {
            this.a = null;
        }
        if (parcel.readByte() != 0) {
            this.b = parcel.readInt();
        }
        else {
            this.b = null;
        }
        if (parcel.readByte() != 0) {
            this.c = wv.c(parcel);
        }
        else {
            this.c = null;
        }
        if (parcel.readByte() != 0) {
            this.d = parcel.readString();
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
            this.g = parcel.readString();
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
            this.j = parcel.readString();
        }
        else {
            this.j = null;
        }
        if (parcel.readByte() != 0) {
            this.k = RadioStatus.a(parcel.readInt());
            return;
        }
        this.k = null;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        if (this.a != null) {
            jsonGenerator.a("orientation", this.a.a());
        }
        if (this.b != null) {
            jsonGenerator.a("signal_strength", this.b);
        }
        if (this.c != null) {
            jsonGenerator.a("limit_ad_tracking", this.c);
        }
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            jsonGenerator.a("mobile_network_operator_country_code", this.d);
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            jsonGenerator.a("mobile_network_operator_iso_country_code", this.e);
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            jsonGenerator.a("mobile_network_operator_code", this.f);
        }
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            jsonGenerator.a("mobile_network_operator_name", this.g);
        }
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            jsonGenerator.a("mobile_sim_provider_iso_country_code", this.h);
        }
        if (!TextUtils.isEmpty((CharSequence)this.i)) {
            jsonGenerator.a("mobile_sim_provider_code", this.i);
        }
        if (!TextUtils.isEmpty((CharSequence)this.j)) {
            jsonGenerator.a("mobile_sim_provider_name", this.j);
        }
        if (this.k != null) {
            jsonGenerator.a("radio_status", this.k.a());
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
            final MobileDetails mobileDetails = (MobileDetails)o;
            Label_0059: {
                if (this.c != null) {
                    if (this.c.equals(mobileDetails.c)) {
                        break Label_0059;
                    }
                }
                else if (mobileDetails.c == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.f != null) {
                    if (this.f.equals(mobileDetails.f)) {
                        break Label_0089;
                    }
                }
                else if (mobileDetails.f == null) {
                    break Label_0089;
                }
                return false;
            }
            Label_0119: {
                if (this.d != null) {
                    if (this.d.equals(mobileDetails.d)) {
                        break Label_0119;
                    }
                }
                else if (mobileDetails.d == null) {
                    break Label_0119;
                }
                return false;
            }
            Label_0149: {
                if (this.e != null) {
                    if (this.e.equals(mobileDetails.e)) {
                        break Label_0149;
                    }
                }
                else if (mobileDetails.e == null) {
                    break Label_0149;
                }
                return false;
            }
            Label_0179: {
                if (this.g != null) {
                    if (this.g.equals(mobileDetails.g)) {
                        break Label_0179;
                    }
                }
                else if (mobileDetails.g == null) {
                    break Label_0179;
                }
                return false;
            }
            Label_0209: {
                if (this.i != null) {
                    if (this.i.equals(mobileDetails.i)) {
                        break Label_0209;
                    }
                }
                else if (mobileDetails.i == null) {
                    break Label_0209;
                }
                return false;
            }
            Label_0239: {
                if (this.h != null) {
                    if (this.h.equals(mobileDetails.h)) {
                        break Label_0239;
                    }
                }
                else if (mobileDetails.h == null) {
                    break Label_0239;
                }
                return false;
            }
            Label_0269: {
                if (this.j != null) {
                    if (this.j.equals(mobileDetails.j)) {
                        break Label_0269;
                    }
                }
                else if (mobileDetails.j == null) {
                    break Label_0269;
                }
                return false;
            }
            if (this.a != mobileDetails.a) {
                return false;
            }
            if (this.k != mobileDetails.k) {
                return false;
            }
            if (this.b != null) {
                if (this.b.equals(mobileDetails.b)) {
                    return true;
                }
            }
            else if (mobileDetails.b == null) {
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
        int hashCode7;
        if (this.g != null) {
            hashCode7 = this.g.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.h != null) {
            hashCode8 = this.h.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        int hashCode9;
        if (this.i != null) {
            hashCode9 = this.i.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n9 = 31 * (hashCode9 + n8);
        int hashCode10;
        if (this.j != null) {
            hashCode10 = this.j.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n10 = 31 * (hashCode10 + n9);
        final RadioStatus k = this.k;
        int hashCode11 = 0;
        if (k != null) {
            hashCode11 = this.k.hashCode();
        }
        return n10 + hashCode11;
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
            parcel.writeInt((int)this.b);
        }
        wv.a(parcel, this.c);
        if (this.c != null) {
            wv.a(parcel, (boolean)this.c);
        }
        wv.a(parcel, this.d);
        if (this.d != null) {
            parcel.writeString(this.d);
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
            parcel.writeString(this.g);
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
            parcel.writeString(this.j);
        }
        wv.a(parcel, this.k);
        if (this.k != null) {
            parcel.writeInt(this.k.a());
        }
    }
}
