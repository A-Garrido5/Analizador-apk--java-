// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.util.af;
import com.twitter.library.media.decoder.ImageDecoder;
import com.twitter.util.d;
import com.twitter.internal.android.util.Size;
import java.io.File;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ImageFile extends MediaFile
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    ImageFile(final Parcel parcel) {
        super(parcel);
    }
    
    ImageFile(final File file, final Size size) {
        super(file, size, MediaType.b);
    }
    
    public static ImageFile a(final File file) {
        d.c();
        final Size c = ImageDecoder.a(file).c();
        if (c.c()) {
            return null;
        }
        return new ImageFile(file, c);
    }
    
    private Object writeReplace() {
        return new ImageFile$SerializationProxy(this);
    }
    
    @Override
    public boolean a() {
        d.c();
        return af.b(this.file);
    }
}
