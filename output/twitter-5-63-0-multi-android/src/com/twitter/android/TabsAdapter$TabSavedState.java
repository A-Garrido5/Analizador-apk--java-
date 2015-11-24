// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TabsAdapter$TabSavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new ti();
    }
    
    public TabsAdapter$TabSavedState(final Parcel parcel) {
        this.a = parcel.createStringArray();
    }
    
    public TabsAdapter$TabSavedState(final ArrayList list) {
        final int size = list.size();
        final String[] a = new String[size];
        for (int i = 0; i < size; ++i) {
            a[i] = list.get(i).a();
        }
        this.a = a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringArray(this.a);
    }
}
