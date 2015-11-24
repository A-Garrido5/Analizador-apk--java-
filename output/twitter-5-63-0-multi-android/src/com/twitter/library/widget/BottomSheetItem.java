// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.util.l;
import android.text.TextUtils;
import android.os.Parcel;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class BottomSheetItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final BottomSheetItem a;
    private int b;
    private CharSequence c;
    private int d;
    private int e;
    
    static {
        a = new BottomSheetItem(1);
        CREATOR = (Parcelable$Creator)new p();
    }
    
    private BottomSheetItem(final int b) {
        this.b = b;
    }
    
    public BottomSheetItem(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BottomSheetItem);
        this.d = obtainStyledAttributes.getResourceId(li.BottomSheetItem_android_id, 0);
        this.e = obtainStyledAttributes.getResourceId(li.BottomSheetItem_android_icon, 0);
        this.c = obtainStyledAttributes.getText(li.BottomSheetItem_android_title);
        obtainStyledAttributes.recycle();
    }
    
    public BottomSheetItem(final Parcel parcel) {
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }
    
    public final CharSequence a() {
        return this.c;
    }
    
    public final int b() {
        return this.d;
    }
    
    public final boolean c() {
        return this.b == 1;
    }
    
    public final int d() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final int e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final BottomSheetItem bottomSheetItem = (BottomSheetItem)o;
            if (this.e != bottomSheetItem.e) {
                return false;
            }
            if (this.d != bottomSheetItem.d) {
                return false;
            }
            if (this.b != bottomSheetItem.b) {
                return false;
            }
            if (this.c != null) {
                if (this.c.equals(bottomSheetItem.c)) {
                    return true;
                }
            }
            else if (bottomSheetItem.c == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return l.a(this.b, this.c, this.d, this.e);
    }
    
    @Override
    public String toString() {
        if (this.c()) {
            return "Bottom Sheet Divider";
        }
        return "Bottom Sheet item " + (Object)this.c;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        TextUtils.writeToParcel(this.c, parcel, n);
    }
}
