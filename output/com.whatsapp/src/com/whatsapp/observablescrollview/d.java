// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

import com.whatsapp.DialogToastActivity;
import android.os.Parcelable;
import android.os.Parcel;
import android.util.SparseIntArray;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class d extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    int a;
    int b;
    int c;
    int d;
    int e;
    SparseIntArray f;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    private d(final Parcel parcel) {
        final boolean i = ObservableListView.i;
        super(parcel);
        this.d = -1;
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.c = parcel.readInt();
        this.a = parcel.readInt();
        this.f = new SparseIntArray();
        final int int1 = parcel.readInt();
        if (int1 > 0) {
            int j = 0;
            while (j < int1) {
                this.f.put(parcel.readInt(), parcel.readInt());
                ++j;
                if (i) {
                    break;
                }
            }
        }
    }
    
    d(final Parcel parcel, final f f) {
        this(parcel);
    }
    
    private d(final Parcelable parcelable) {
        super(parcelable);
        this.d = -1;
    }
    
    d(final Parcelable parcelable, final f f) {
        this(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final boolean i = ObservableListView.i;
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.c);
        parcel.writeInt(this.a);
        int size;
        if (this.f == null) {
            size = 0;
        }
        else {
            size = this.f.size();
        }
        parcel.writeInt(size);
        if (size > 0) {
            int j = 0;
            while (j < size) {
                parcel.writeInt(this.f.keyAt(j));
                parcel.writeInt(this.f.valueAt(j));
                ++j;
                if (i) {
                    final boolean h = DialogToastActivity.h;
                    boolean h2 = false;
                    if (!h) {
                        h2 = true;
                    }
                    DialogToastActivity.h = h2;
                    break;
                }
            }
        }
    }
}
