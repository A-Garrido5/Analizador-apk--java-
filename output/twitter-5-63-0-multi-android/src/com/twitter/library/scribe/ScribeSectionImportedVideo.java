// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ScribeSectionImportedVideo extends ScribeSection
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public ScribeSectionImportedVideo() {
        super(null, 1);
    }
    
    public ScribeSectionImportedVideo(final Parcel parcel) {
        super(parcel);
    }
    
    public ScribeSectionImportedVideo a(final String s) {
        this.a(0, new ScribeSectionNamespace(s));
        return this;
    }
    
    @Override
    protected String a(final int n) {
        return "event_namespace";
    }
}
