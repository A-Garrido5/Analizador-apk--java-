// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class ClientNetworkRequestDetails extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final Long a;
    private final Integer b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;
    private final Long h;
    private final Long i;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    protected ClientNetworkRequestDetails(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        if (parcel.readByte() != 0) {
            this.b = parcel.readInt();
        }
        else {
            this.b = null;
        }
        if (parcel.readByte() != 0) {
            this.c = parcel.readLong();
        }
        else {
            this.c = null;
        }
        if (parcel.readByte() != 0) {
            this.d = parcel.readLong();
        }
        else {
            this.d = null;
        }
        if (parcel.readByte() != 0) {
            this.e = parcel.readLong();
        }
        else {
            this.e = null;
        }
        if (parcel.readByte() != 0) {
            this.f = parcel.readLong();
        }
        else {
            this.f = null;
        }
        if (parcel.readByte() != 0) {
            this.g = parcel.readLong();
        }
        else {
            this.g = null;
        }
        if (parcel.readByte() != 0) {
            this.h = parcel.readLong();
        }
        else {
            this.h = null;
        }
        if (parcel.readByte() != 0) {
            this.i = parcel.readLong();
            return;
        }
        this.i = null;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.a("duration_ms", this.a);
        if (this.b != null) {
            jsonGenerator.a("stream_id", this.b);
        }
        if (this.c != null) {
            jsonGenerator.a("rx_bytes", this.c);
        }
        if (this.d != null) {
            jsonGenerator.a("tx_bytes", this.d);
        }
        if (this.e != null) {
            jsonGenerator.a("latency_ms", this.e);
        }
        if (this.f != null) {
            jsonGenerator.a("connected_ms", this.f);
        }
        if (this.g != null) {
            jsonGenerator.a("blocked_ms", this.g);
        }
        if (this.h != null) {
            jsonGenerator.a("request_body_size", this.h);
        }
        if (this.i != null) {
            jsonGenerator.a("response_body_size", this.i);
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
            final ClientNetworkRequestDetails clientNetworkRequestDetails = (ClientNetworkRequestDetails)o;
            Label_0059: {
                if (this.g != null) {
                    if (this.g.equals(clientNetworkRequestDetails.g)) {
                        break Label_0059;
                    }
                }
                else if (clientNetworkRequestDetails.g == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.f != null) {
                    if (this.f.equals(clientNetworkRequestDetails.f)) {
                        break Label_0089;
                    }
                }
                else if (clientNetworkRequestDetails.f == null) {
                    break Label_0089;
                }
                return false;
            }
            if (!this.a.equals(clientNetworkRequestDetails.a)) {
                return false;
            }
            Label_0135: {
                if (this.e != null) {
                    if (this.e.equals(clientNetworkRequestDetails.e)) {
                        break Label_0135;
                    }
                }
                else if (clientNetworkRequestDetails.e == null) {
                    break Label_0135;
                }
                return false;
            }
            Label_0165: {
                if (this.h != null) {
                    if (this.h.equals(clientNetworkRequestDetails.h)) {
                        break Label_0165;
                    }
                }
                else if (clientNetworkRequestDetails.h == null) {
                    break Label_0165;
                }
                return false;
            }
            Label_0195: {
                if (this.i != null) {
                    if (this.i.equals(clientNetworkRequestDetails.i)) {
                        break Label_0195;
                    }
                }
                else if (clientNetworkRequestDetails.i == null) {
                    break Label_0195;
                }
                return false;
            }
            Label_0225: {
                if (this.c != null) {
                    if (this.c.equals(clientNetworkRequestDetails.c)) {
                        break Label_0225;
                    }
                }
                else if (clientNetworkRequestDetails.c == null) {
                    break Label_0225;
                }
                return false;
            }
            Label_0255: {
                if (this.b != null) {
                    if (this.b.equals(clientNetworkRequestDetails.b)) {
                        break Label_0255;
                    }
                }
                else if (clientNetworkRequestDetails.b == null) {
                    break Label_0255;
                }
                return false;
            }
            if (this.d != null) {
                if (this.d.equals(clientNetworkRequestDetails.d)) {
                    return true;
                }
            }
            else if (clientNetworkRequestDetails.d == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.a.hashCode();
        int hashCode;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.c != null) {
            hashCode2 = this.c.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.d != null) {
            hashCode3 = this.d.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.e != null) {
            hashCode4 = this.e.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.f != null) {
            hashCode5 = this.f.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.g != null) {
            hashCode6 = this.g.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.h != null) {
            hashCode7 = this.h.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (hashCode7 + n7);
        final Long i = this.i;
        int hashCode8 = 0;
        if (i != null) {
            hashCode8 = this.i.hashCode();
        }
        return n8 + hashCode8;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong((long)this.a);
        wv.a(parcel, this.b);
        if (this.b != null) {
            parcel.writeInt((int)this.b);
        }
        wv.a(parcel, this.c);
        if (this.c != null) {
            parcel.writeLong((long)this.c);
        }
        wv.a(parcel, this.d);
        if (this.d != null) {
            parcel.writeLong((long)this.d);
        }
        wv.a(parcel, this.e);
        if (this.e != null) {
            parcel.writeLong((long)this.e);
        }
        wv.a(parcel, this.f);
        if (this.f != null) {
            parcel.writeLong((long)this.f);
        }
        wv.a(parcel, this.g);
        if (this.g != null) {
            parcel.writeLong((long)this.g);
        }
        wv.a(parcel, this.h);
        if (this.h != null) {
            parcel.writeLong((long)this.h);
        }
        wv.a(parcel, this.i);
        if (this.i != null) {
            parcel.writeLong((long)this.i);
        }
    }
}
