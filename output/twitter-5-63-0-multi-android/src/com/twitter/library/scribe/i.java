// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class i implements Parcelable$Creator
{
    public ScribeSectionNamespace a(final Parcel parcel) {
        return new ScribeSectionNamespace(parcel);
    }
    
    public ScribeSectionNamespace[] a(final int n) {
        return new ScribeSectionNamespace[n];
    }
}
