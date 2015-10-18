// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Locale;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ak implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final String z;
    public String a;
    public int b;
    public boolean c;
    public Uri d;
    public bv e;
    public int f;
    
    static {
        final char[] charArray = ",Z3\u0006P)^!\u0015e\u0004E3\fN\tX1\\\u0010\u0016\u001b;\u000fVX\u00126MF\nE&\\\u0010\u0001\u001b0\u0014V\u000eR&\\\u0010\u0016\u001b7\fE\u0011NoDWID;\u000fR\tRoDF\u0018".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '5';
                    break;
                }
                case 0: {
                    c2 = 'e';
                    break;
                }
                case 1: {
                    c2 = '7';
                    break;
                }
                case 2: {
                    c2 = 'R';
                    break;
                }
                case 3: {
                    c2 = 'a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        CREATOR = (Parcelable$Creator)new as();
    }
    
    public ak() {
    }
    
    private ak(final Parcel parcel) {
        this.e = bv.values()[parcel.readInt()];
        this.b = parcel.readInt();
        this.f = parcel.readInt();
        this.a = parcel.readString();
        this.d = (Uri)parcel.readParcelable((ClassLoader)null);
        this.c = (parcel.readInt() != 0);
    }
    
    ak(final Parcel parcel, final b9 b9) {
        this(parcel);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return String.format(Locale.US, ak.z, this.e, this.b, this.f, this.a, this.c, this.d);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.e.ordinal());
        parcel.writeInt(this.b);
        parcel.writeInt(this.f);
        parcel.writeString(this.a);
        parcel.writeParcelable((Parcelable)this.d, n);
        int n2;
        if (this.c) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
