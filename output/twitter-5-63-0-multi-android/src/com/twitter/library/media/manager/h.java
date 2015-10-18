// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.util.Iterator;
import com.twitter.library.media.model.MediaType;
import com.twitter.util.d;
import android.graphics.Bitmap$CompressFormat;
import com.twitter.library.media.model.ImageFormat;
import java.io.OutputStream;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.model.MediaFile;
import com.twitter.internal.network.l;
import com.twitter.library.media.decoder.ImageDecoder;
import android.graphics.Bitmap;
import java.io.File;
import com.twitter.library.util.aa;
import com.twitter.library.util.ak;
import com.twitter.library.util.x;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import java.util.concurrent.ConcurrentHashMap;

public class h extends t
{
    private final ConcurrentHashMap h;
    private final Size i;
    private final int j;
    
    h(final String s, final Context context, final Size i, final int j, final x x, final a a, final a a2) {
        super(s, context, x, a, a2);
        this.i = i;
        this.j = j;
        final ConcurrentHashMap h = new ConcurrentHashMap();
        this.h = h;
        if (x != null) {
            x.a(new i(this, h));
        }
    }
    
    protected Bitmap a(final j j, final File file) {
        return ImageDecoder.a(file).a(j.n()).b();
    }
    
    protected p a(final j j, final Bitmap bitmap, final ResourceResponse$ResourceSource resourceResponse$ResourceSource, final l l) {
        return new p(j, this.h.get(j.n()), bitmap, resourceResponse$ResourceSource, l);
    }
    
    public com.twitter.util.concurrent.i a(final j j) {
        if (j != null && j.e().c()) {
            ErrorReporter.a(new IllegalStateException("Request with an empty size."));
        }
        return super.b(j);
    }
    
    protected boolean a(final Bitmap bitmap) {
        return !bitmap.isRecycled();
    }
    
    protected boolean a(final j j, final Bitmap bitmap, final OutputStream outputStream) {
        final ImageFormat a = ImageFormat.a(j.a());
        Bitmap$CompressFormat bitmap$CompressFormat;
        if (a == ImageFormat.b || a == ImageFormat.c) {
            bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
        }
        else {
            bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
        }
        return bitmap.compress(bitmap$CompressFormat, 90, outputStream);
    }
    
    protected Bitmap b(final j j, final File file) {
        com.twitter.util.d.c();
        final MediaFile mediaFile = this.h.get(j.n());
        MediaFile mediaFile3;
        if (mediaFile == null) {
            MediaFile mediaFile2;
            if (j.d() != null) {
                mediaFile2 = j.d();
            }
            else {
                mediaFile2 = MediaFile.a(file, MediaType.b);
            }
            mediaFile3 = mediaFile2;
        }
        else {
            mediaFile3 = mediaFile;
        }
        Bitmap b = null;
        if (mediaFile3 != null) {
            final ImageDecoder a = ImageDecoder.a(mediaFile3).a(j.e()).a(j.f()).a(j.h()).d(this.i).d(this.j).e(j.g()).a(j.j()).a(j.a()).a(j.k());
            if (a instanceof com.twitter.library.media.decoder.i) {
                ((com.twitter.library.media.decoder.i)a).f(j.m());
            }
            b = a.b();
        }
        if (b != null) {
            final com.twitter.library.media.manager.l i = j.i();
            while (true) {
                Label_0218: {
                    if (i == null) {
                        break Label_0218;
                    }
                    final Bitmap a2 = i.a(b);
                    if (a2 == b || a2 == null) {
                        break Label_0218;
                    }
                    b.recycle();
                    this.h.put(j.n(), mediaFile3);
                    return a2;
                }
                final Bitmap a2 = b;
                continue;
            }
        }
        return b;
    }
    
    public File b(final j j) {
        com.twitter.util.d.c();
        final Iterator<String> iterator = j.b().iterator();
        while (iterator.hasNext()) {
            final File a = this.d.a(iterator.next());
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
