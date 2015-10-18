// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.AsyncTask;
import com.twitter.util.concurrent.b;
import java.util.concurrent.Callable;
import com.twitter.media.ImageInfo;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.media.MediaUtils;
import com.twitter.library.util.af;
import com.twitter.util.d;
import android.net.Uri;
import android.content.Context;
import android.os.Parcel;
import com.twitter.internal.android.util.Size;
import java.io.File;
import com.twitter.library.util.ab;
import java.io.Serializable;
import android.os.Parcelable;

public abstract class MediaFile implements Parcelable, Serializable
{
    public static final ab a;
    public final File file;
    public final Size size;
    public final MediaType type;
    
    static {
        a = new i();
    }
    
    protected MediaFile(final Parcel parcel) {
        this.file = new File(parcel.readString());
        this.size = (Size)parcel.readParcelable(Size.class.getClassLoader());
        this.type = MediaType.a(parcel.readInt());
    }
    
    protected MediaFile(final File file, final Size size, final MediaType type) {
        this.file = file;
        this.size = size;
        this.type = type;
    }
    
    public static MediaFile a(final Context context, final Uri uri, final MediaType mediaType) {
        d.c();
        final File e = af.e(context, uri);
        if (e != null) {
            return a(e, mediaType);
        }
        return null;
    }
    
    public static MediaFile a(final File file, MediaType mediaType) {
        d.c();
        if (!file.exists()) {
            return null;
        }
        if (mediaType == MediaType.a) {
            final String c = af.c(file.getPath());
            if ("segv".equals(c)) {
                mediaType = MediaType.e;
            }
            else {
                final String b = af.b(c);
                if (b != null) {
                    mediaType = MediaType.a(b);
                }
            }
        }
        switch (l.a[mediaType.ordinal()]) {
            default: {
                if (!com.twitter.library.featureswitch.d.f("animated_content_composer_enabled")) {
                    if (mediaType == MediaType.c) {
                        return ImageFile.a(file);
                    }
                    throw new IllegalStateException("unknown type (not identified): " + mediaType);
                }
                else {
                    Label_0246: {
                        try {
                            final ImageInfo a = MediaUtils.a(file);
                            if (a == null) {
                                break Label_0246;
                            }
                            final Size a2 = Size.a(a.width, a.height);
                            if (a.isAnimated) {
                                return new AnimatedGifFile(file, a2);
                            }
                            return new ImageFile(file, a2);
                        }
                        catch (Throwable t) {
                            ErrorReporter.a(t);
                        }
                        throw new IllegalStateException("unknown type (identified): " + mediaType);
                    }
                    if (mediaType == MediaType.c) {
                        return ImageFile.a(file);
                    }
                    throw new IllegalStateException("unknown type (identified): " + mediaType);
                }
                break;
            }
            case 1: {
                return ImageFile.a(file);
            }
            case 2: {
                return VideoFile.a(file);
            }
            case 3: {
                return SegmentedVideoFile.a(file);
            }
        }
    }
    
    private static com.twitter.util.concurrent.i a(final Callable callable) {
        return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(callable).a(new k()).a();
    }
    
    public static com.twitter.util.concurrent.i b(final Context context, final Uri uri, final MediaType mediaType) {
        return a(new j(context.getApplicationContext(), uri, mediaType));
    }
    
    public boolean a() {
        d.c();
        return af.b(this.file);
    }
    
    public boolean a(final MediaFile mediaFile) {
        return this == mediaFile || (mediaFile != null && mediaFile.file.equals(this.file) && mediaFile.size.d(this.size) && mediaFile.type == this.type);
    }
    
    public Uri b() {
        return Uri.fromFile(this.file);
    }
    
    public com.twitter.util.concurrent.i c() {
        return af.c(this.file);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MediaFile && this.a((MediaFile)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (0 + this.type.hashCode()) + this.size.hashCode()) + this.file.hashCode();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.file.getPath());
        parcel.writeParcelable((Parcelable)this.size, n);
        parcel.writeInt(this.type.typeId);
    }
}
