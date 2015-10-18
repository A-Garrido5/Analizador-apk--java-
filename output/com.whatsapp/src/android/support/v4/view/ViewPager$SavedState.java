// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.os.ParcelableCompat;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class ViewPager$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    Parcelable adapterState;
    ClassLoader loader;
    int position;
    
    static {
        final String[] z2 = new String[2];
        String s = "K2(t\u0018h.=C\u0014j%;=&l6,w&y!=v\u000e";
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
                        c2 = 'u';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
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
                    s = "-0&`\u001cy)&}H";
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
        CREATOR = ParcelableCompat.newCreator(new ViewPager$SavedState$1());
    }
    
    ViewPager$SavedState(final Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        if (classLoader == null) {
            classLoader = this.getClass().getClassLoader();
        }
        this.position = parcel.readInt();
        this.adapterState = parcel.readParcelable(classLoader);
        this.loader = classLoader;
    }
    
    public ViewPager$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return ViewPager$SavedState.z[0] + Integer.toHexString(System.identityHashCode(this)) + ViewPager$SavedState.z[1] + this.position + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.position);
        parcel.writeParcelable(this.adapterState, n);
    }
}
