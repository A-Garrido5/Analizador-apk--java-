// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.b2;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class a2 implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final b2 a;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a2(final Parcel parcel) {
        this.a = new b2(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }
    
    public a2(final b2 a) {
        this.a = a;
    }
    
    public static a2[] a(final b2[] array) {
        final boolean a = e.a;
        final a2[] array2 = new a2[array.length];
        int i = 0;
        while (i < array.length) {
            array2[i] = new a2(array[i]);
            ++i;
            if (a) {
                break;
            }
        }
        return array2;
    }
    
    public static b2[] a(final a2[] array) {
        final boolean a = e.a;
        final b2[] array2 = new b2[array.length];
        int i = 0;
        while (i < array.length) {
            array2[i] = array[i].a();
            ++i;
            if (a) {
                break;
            }
        }
        return array2;
    }
    
    public b2 a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.a.c);
        parcel.writeByteArray(this.a.b);
        parcel.writeByteArray(this.a.a);
    }
}
