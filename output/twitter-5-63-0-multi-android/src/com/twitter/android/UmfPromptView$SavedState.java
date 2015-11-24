// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.os.Parcel;
import com.twitter.library.api.Prompt;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class UmfPromptView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    public Prompt b;
    
    static {
        CREATOR = (Parcelable$Creator)new xk();
    }
    
    public UmfPromptView$SavedState(final Parcel parcel) {
        super(parcel);
        this.b = (Prompt)parcel.readParcelable(Prompt.class.getClassLoader());
        this.a = (parcel.readInt() == 1);
    }
    
    public UmfPromptView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.b, n);
        int n2;
        if (this.a) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
