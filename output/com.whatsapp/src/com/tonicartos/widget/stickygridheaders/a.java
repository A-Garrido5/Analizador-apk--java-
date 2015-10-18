// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class a extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    boolean a;
    
    static {
        final String[] z2 = new String[2];
        String s = "M\u0002x\\f\b\u0002n\\\\\u001e0~PM\u0006\u001a7";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '.';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = ">\u0017cZE\u0014$xPJ%\u0006k]K\u001f\u0010MKG\t5c\\YC0kOK\t0~XZ\b\u0018";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CREATOR = (Parcelable$Creator)new p();
    }
    
    private a(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readByte() != 0);
    }
    
    a(final Parcel parcel, final g g) {
        this(parcel);
    }
    
    public a(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return com.tonicartos.widget.stickygridheaders.a.z[1] + Integer.toHexString(System.identityHashCode(this)) + com.tonicartos.widget.stickygridheaders.a.z[0] + this.a + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        boolean b;
        if (this.a) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
    }
}
