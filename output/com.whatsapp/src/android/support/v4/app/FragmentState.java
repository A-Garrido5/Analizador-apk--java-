// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.util.Log;
import android.content.Context;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class FragmentState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    final Bundle mArguments;
    final String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final int mIndex;
    Fragment mInstance;
    final boolean mRetainInstance;
    Bundle mSavedFragmentState;
    final String mTag;
    
    static {
        final String[] z2 = new String[2];
        String s = "826\u0016\u0003\u001f(,\u0003\u0016\u00148e\u0004\u0010\u0010;(\u0007\f\u0005|";
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
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = 'E';
                        break;
                    }
                    case 3: {
                        c2 = 'b';
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
                    s = "7.$\u0005\u000f\u001421/\u0003\u001f=\"\u0007\u0010";
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
        CREATOR = (Parcelable$Creator)new FragmentState$1();
    }
    
    public FragmentState(final Parcel parcel) {
        boolean mDetached = true;
        this.mClassName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mFromLayout = (parcel.readInt() != 0 && mDetached);
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        this.mRetainInstance = (parcel.readInt() != 0 && mDetached);
        if (parcel.readInt() == 0) {
            mDetached = false;
        }
        this.mDetached = mDetached;
        this.mArguments = parcel.readBundle();
        this.mSavedFragmentState = parcel.readBundle();
    }
    
    public FragmentState(final Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mIndex = fragment.mIndex;
        this.mFromLayout = fragment.mFromLayout;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mDetached = fragment.mDetached;
        this.mArguments = fragment.mArguments;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public Fragment instantiate(final FragmentActivity fragmentActivity, final Fragment fragment) {
        if (this.mInstance != null) {
            return this.mInstance;
        }
        if (this.mArguments != null) {
            this.mArguments.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.mInstance = Fragment.instantiate((Context)fragmentActivity, this.mClassName, this.mArguments);
        if (this.mSavedFragmentState != null) {
            this.mSavedFragmentState.setClassLoader(fragmentActivity.getClassLoader());
            this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
        }
        this.mInstance.setIndex(this.mIndex, fragment);
        this.mInstance.mFromLayout = this.mFromLayout;
        this.mInstance.mRestored = true;
        this.mInstance.mFragmentId = this.mFragmentId;
        this.mInstance.mContainerId = this.mContainerId;
        this.mInstance.mTag = this.mTag;
        this.mInstance.mRetainInstance = this.mRetainInstance;
        this.mInstance.mDetached = this.mDetached;
        this.mInstance.mFragmentManager = fragmentActivity.mFragments;
        if (FragmentManagerImpl.DEBUG) {
            Log.v(FragmentState.z[1], FragmentState.z[0] + this.mInstance);
        }
        return this.mInstance;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeString(this.mClassName);
        parcel.writeInt(this.mIndex);
        int n3;
        if (this.mFromLayout) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        int n4;
        if (this.mRetainInstance) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        if (!this.mDetached) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeBundle(this.mArguments);
        parcel.writeBundle(this.mSavedFragmentState);
    }
}
