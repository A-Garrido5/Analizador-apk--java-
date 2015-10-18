// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ScribeItem implements Parcelable
{
    protected ScribeItem() {
    }
    
    protected ScribeItem(final Parcel parcel) {
    }
    
    protected abstract void a(final JsonGenerator p0);
    
    public void b(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        this.a(jsonGenerator);
        jsonGenerator.d();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
    }
}
