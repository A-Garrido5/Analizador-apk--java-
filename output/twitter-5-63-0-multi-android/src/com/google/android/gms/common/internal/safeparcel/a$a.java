// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class a$a extends RuntimeException
{
    public a$a(final String s, final Parcel parcel) {
        super(s + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
