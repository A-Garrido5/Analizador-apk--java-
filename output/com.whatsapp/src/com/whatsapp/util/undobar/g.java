// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

import com.whatsapp.DialogToastActivity;
import android.os.Parcel;
import android.view.animation.Animation;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class g implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    int a;
    Animation b;
    int c;
    Animation d;
    int e;
    long f;
    
    static {
        final String[] z2 = new String[6];
        String s = "8<)\u001bb\f \u001e\u0000Y\u000176\u001dC\u0002<\u001f\u0011SP";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ar9\u001dT\u00017\u001f\u0011SP";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Ar$\u001aa\u0003; \u0015T\u0004=#I";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Ar\"\u0001T,<$\u0019A\u0019;\"\u001a\u001d";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Ar)\u0001R\f&$\u001bNP";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Ar/\u0013r\b!p";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public g(final int a, final int e) {
        this.f = 5000L;
        this.a = a;
        this.e = e;
    }
    
    public g(final int n, final int n2, final long f) {
        this(n, n2);
        this.f = f;
    }
    
    public g(final Parcel parcel) {
        this.f = 5000L;
        this.a = parcel.readInt();
        this.e = parcel.readInt();
        this.c = parcel.readInt();
        this.f = parcel.readLong();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            final g g = (g)o;
            if (this.c != g.c || this.f != g.f || this.a != g.a || this.e != g.e) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        final boolean t = UndoBarController.t;
        final String string = g.z[0] + this.a + g.z[1] + this.e + g.z[5] + this.c + g.z[4] + this.f + g.z[2] + this.d + g.z[3] + this.b + '}';
        if (t) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.e);
        parcel.writeInt(this.c);
        parcel.writeLong(this.f);
    }
}
