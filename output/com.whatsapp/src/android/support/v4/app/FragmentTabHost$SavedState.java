// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class FragmentTabHost$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    String curTab;
    
    static {
        final String[] z2 = new String[2];
        String s = "l!h(@O=}\u001bLH\u001bf<Y\u0004\u0000h9HN\u0000}.YO(";
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
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = '*';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
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
                    s = "\n0|=yK14";
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
        CREATOR = (Parcelable$Creator)new FragmentTabHost$SavedState$1();
    }
    
    private FragmentTabHost$SavedState(final Parcel parcel) {
        super(parcel);
        this.curTab = parcel.readString();
    }
    
    FragmentTabHost$SavedState(final Parcel parcel, final FragmentTabHost$1 fragmentTabHost$1) {
        this(parcel);
    }
    
    FragmentTabHost$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return FragmentTabHost$SavedState.z[0] + Integer.toHexString(System.identityHashCode(this)) + FragmentTabHost$SavedState.z[1] + this.curTab + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.curTab);
    }
}
