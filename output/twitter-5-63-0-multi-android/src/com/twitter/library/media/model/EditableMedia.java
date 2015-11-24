// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.concurrent.i;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.k;
import java.util.List;
import java.io.File;
import com.twitter.library.util.af;
import com.twitter.util.d;
import android.net.Uri;
import android.content.Context;
import android.os.Parcel;
import java.io.Serializable;
import android.os.Parcelable;

public abstract class EditableMedia implements Parcelable, Serializable
{
    public final MediaFile mediaFile;
    public final String source;
    
    EditableMedia(final Parcel parcel) {
        this.mediaFile = (MediaFile)parcel.readParcelable(EditableMedia.class.getClassLoader());
        this.source = parcel.readString();
    }
    
    protected EditableMedia(final MediaFile mediaFile, final String source) {
        this.mediaFile = mediaFile;
        this.source = source;
    }
    
    public static EditableMedia a(final Context context, final Uri uri, MediaType a, final String s) {
        d.c();
        if (a == MediaType.a) {
            final String a2 = af.a(context, uri);
            if (a2 != null) {
                a = MediaType.a(a2);
            }
        }
        final File e = af.e(context, uri);
        if (e != null) {
            final MediaFile a3 = MediaFile.a(e, a);
            if (a3 != null) {
                return a(a3, s);
            }
        }
        return null;
    }
    
    public static EditableMedia a(final MediaFile mediaFile, final String s) {
        switch (com.twitter.library.media.model.d.a[mediaFile.type.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unknown media type");
            }
            case 1: {
                return new EditableImage((ImageFile)mediaFile, s);
            }
            case 2: {
                return new EditableAnimatedGif((AnimatedGifFile)mediaFile, s);
            }
            case 3: {
                return new EditableVideo((VideoFile)mediaFile, s);
            }
            case 4: {
                return new EditableSegmentedVideo((SegmentedVideoFile)mediaFile, s);
            }
        }
    }
    
    public static MediaType a(final List list) {
        if (list.isEmpty()) {
            return MediaType.a;
        }
        return list.get(0).e();
    }
    
    public abstract float a();
    
    public boolean a(final EditableMedia editableMedia) {
        return this.mediaFile.file.equals(editableMedia.mediaFile.file);
    }
    
    public abstract k b(final Context p0);
    
    public boolean b(final EditableMedia editableMedia) {
        return this == editableMedia || (editableMedia != null && editableMedia.mediaFile.a(this.mediaFile) && editableMedia.source.equals(this.source));
    }
    
    public Uri c() {
        return this.mediaFile.b();
    }
    
    public abstract MediaFile c(final Context p0);
    
    public Size d() {
        return this.mediaFile.size;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public MediaType e() {
        return this.mediaFile.type;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EditableMedia && this.b((EditableMedia)o));
    }
    
    public boolean f() {
        d.c();
        return this.mediaFile.a();
    }
    
    public i g() {
        return this.mediaFile.c();
    }
    
    @Override
    public int hashCode() {
        return 31 * (0 + this.mediaFile.hashCode()) + this.source.hashCode();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.mediaFile, n);
        parcel.writeString(this.source);
    }
}
