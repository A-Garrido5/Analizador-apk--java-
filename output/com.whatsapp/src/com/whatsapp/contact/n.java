// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import com.whatsapp.protocol.bo;
import android.os.Parcel;
import android.os.Parcelable$Creator;

final class n implements Parcelable$Creator
{
    public l a(final Parcel parcel) {
        final bo bo = new bo();
        bo.c = parcel.readString();
        bo.a = parcel.readString();
        bo.b = parcel.readInt();
        return new l(bo);
    }
    
    public l[] a(final int n) {
        return new l[n];
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.a(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.a(n);
    }
}
