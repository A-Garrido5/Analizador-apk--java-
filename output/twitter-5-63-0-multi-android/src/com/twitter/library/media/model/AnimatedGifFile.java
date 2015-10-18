// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.internal.android.util.Size;
import java.io.File;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class AnimatedGifFile extends MediaFile
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    AnimatedGifFile(final Parcel parcel) {
        super(parcel);
    }
    
    AnimatedGifFile(final File file, final Size size) {
        super(file, size, MediaType.c);
    }
    
    private Object writeReplace() {
        return new AnimatedGifFile$SerializationProxy(this);
    }
}
