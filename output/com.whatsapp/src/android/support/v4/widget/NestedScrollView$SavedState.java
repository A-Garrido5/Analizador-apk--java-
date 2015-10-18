// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class NestedScrollView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    public int scrollPosition;
    
    static {
        final String[] z2 = new String[2];
        String s = "5\\o\u001bu\u0012]i\u0013c.Po\u001dc\u0011et\u0017xS`|\u0004j\u0019`i\u0013{\u0018H";
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
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = '}';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
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
                    s = "]@~\u0000`\u0011_M\u001d|\u0014Gt\u001da@";
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
        CREATOR = (Parcelable$Creator)new NestedScrollView$SavedState$1();
    }
    
    public NestedScrollView$SavedState(final Parcel parcel) {
        super(parcel);
        this.scrollPosition = parcel.readInt();
    }
    
    NestedScrollView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return NestedScrollView$SavedState.z[0] + Integer.toHexString(System.identityHashCode(this)) + NestedScrollView$SavedState.z[1] + this.scrollPosition + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.scrollPosition);
    }
}
