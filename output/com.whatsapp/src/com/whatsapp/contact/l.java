// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import android.os.Parcel;
import com.whatsapp.protocol.bo;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class l implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final String z;
    private final bo a;
    
    static {
        final char[] charArray = "\u0015[o%t\u0015GsfL\u0013QufO\tV!$DFLt*M".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '!';
                    break;
                }
                case 0: {
                    c2 = 'f';
                    break;
                }
                case 1: {
                    c2 = '\"';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
                    break;
                }
                case 3: {
                    c2 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        CREATOR = (Parcelable$Creator)new n();
    }
    
    public l(final bo a) {
        if (a == null) {
            throw new NullPointerException(l.z);
        }
        this.a = a;
    }
    
    public bo a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.a);
        parcel.writeInt(this.a.b);
    }
}
