// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class AbsSpinnerCompat$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    int position;
    long selectedId;
    
    static {
        final String[] z2 = new String[3];
        String s = "\"}\f?U\nq\u0011\tWML\u001e\u001a@\u0007L\u000b\rQ\u0006d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '%';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Cl\u001a\u0000@\u0000k\u001a\bl\u0007\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Co\u0010\u001fL\u0017v\u0010\u0002\u0018";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CREATOR = (Parcelable$Creator)new AbsSpinnerCompat$SavedState$1();
    }
    
    AbsSpinnerCompat$SavedState(final Parcel parcel) {
        super(parcel);
        this.selectedId = parcel.readLong();
        this.position = parcel.readInt();
    }
    
    AbsSpinnerCompat$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return AbsSpinnerCompat$SavedState.z[0] + Integer.toHexString(System.identityHashCode(this)) + AbsSpinnerCompat$SavedState.z[1] + this.selectedId + AbsSpinnerCompat$SavedState.z[2] + this.position + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong(this.selectedId);
        parcel.writeInt(this.position);
    }
}
