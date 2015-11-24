// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class TwitterEditText$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public CharSequence a;
    
    static {
        CREATOR = (Parcelable$Creator)new ae();
    }
    
    private TwitterEditText$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }
    
    TwitterEditText$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return TwitterEditText.class.getSimpleName() + ".SavedState{" + "error=" + (Object)this.a + "; " + " superState=" + this.getSuperState().toString() + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        TextUtils.writeToParcel(this.a, parcel, n);
    }
}
