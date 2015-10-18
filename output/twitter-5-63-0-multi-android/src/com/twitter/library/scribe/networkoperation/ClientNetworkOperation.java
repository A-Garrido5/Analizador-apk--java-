// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcelable;
import java.util.Iterator;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class ClientNetworkOperation extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final ClientNetworkOperationType a;
    private final Long b;
    private final String c;
    private final ClientNetworkOperationStatus d;
    private final Long e;
    private final Integer f;
    private final List g;
    private final MediaUploadDetails h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    protected ClientNetworkOperation(final Parcel parcel) {
        super(parcel);
        this.a = ClientNetworkOperationType.a(parcel.readInt());
        this.b = parcel.readLong();
        if (parcel.readByte() != 0) {
            this.c = parcel.readString();
        }
        else {
            this.c = null;
        }
        this.d = ClientNetworkOperationStatus.a(parcel.readInt());
        this.e = parcel.readLong();
        this.f = parcel.readInt();
        this.g = parcel.readArrayList(ClientNetworkRequest.class.getClassLoader());
        if (parcel.readByte() != 0) {
            this.h = (MediaUploadDetails)parcel.readParcelable(MediaUploadDetails.class.getClassLoader());
            return;
        }
        this.h = null;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.a("type", this.a.a());
        jsonGenerator.a("id", this.b);
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            jsonGenerator.a("retry_policy_id", this.c);
        }
        jsonGenerator.a("status", this.d.a());
        jsonGenerator.a("duration_ms", this.e);
        jsonGenerator.a("retry_count", this.f);
        jsonGenerator.d("requests");
        final Iterator<ClientNetworkRequest> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(jsonGenerator);
        }
        jsonGenerator.b();
        if (this.h != null) {
            jsonGenerator.a("media_upload_details");
            this.h.b(jsonGenerator);
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
            final ClientNetworkOperation clientNetworkOperation = (ClientNetworkOperation)o;
            if (!this.e.equals(clientNetworkOperation.e)) {
                return false;
            }
            if (!this.b.equals(clientNetworkOperation.b)) {
                return false;
            }
            Label_0091: {
                if (this.h != null) {
                    if (this.h.equals(clientNetworkOperation.h)) {
                        break Label_0091;
                    }
                }
                else if (clientNetworkOperation.h == null) {
                    break Label_0091;
                }
                return false;
            }
            if (!this.g.equals(clientNetworkOperation.g)) {
                return false;
            }
            if (!this.f.equals(clientNetworkOperation.f)) {
                return false;
            }
            Label_0155: {
                if (this.c != null) {
                    if (this.c.equals(clientNetworkOperation.c)) {
                        break Label_0155;
                    }
                }
                else if (clientNetworkOperation.c == null) {
                    break Label_0155;
                }
                return false;
            }
            if (this.d != clientNetworkOperation.d) {
                return false;
            }
            if (this.a != clientNetworkOperation.a) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * this.a.hashCode() + this.b.hashCode());
        int hashCode;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (31 * (31 * (31 * (hashCode + n) + this.d.hashCode()) + this.e.hashCode()) + this.f.hashCode()) + this.g.hashCode());
        final MediaUploadDetails h = this.h;
        int hashCode2 = 0;
        if (h != null) {
            hashCode2 = this.h.hashCode();
        }
        return n2 + hashCode2;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a.a());
        parcel.writeLong((long)this.b);
        wv.a(parcel, this.c);
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            parcel.writeString(this.c);
        }
        parcel.writeInt(this.d.a());
        parcel.writeLong((long)this.e);
        parcel.writeInt((int)this.f);
        parcel.writeList(this.g);
        wv.a(parcel, this.h);
        if (this.h != null) {
            parcel.writeParcelable((Parcelable)this.h, n);
        }
    }
}
