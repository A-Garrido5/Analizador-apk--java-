// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;

public class g
{
    public final int a;
    
    public g(final int a) {
        this.a = a;
    }
    
    public g(final Parcel parcel) {
        this.a = parcel.readInt();
    }
    
    public void a(final Parcel parcel) {
        parcel.writeInt(this.a);
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.a("photo_count");
        jsonGenerator.b(this.a);
        jsonGenerator.d();
    }
}
