// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.graphics.Bitmap;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$CompressFormat;
import com.twitter.library.media.decoder.ImageDecoder;
import com.twitter.media.MediaUtils;
import com.twitter.library.media.util.h;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.util.af;
import android.content.Context;
import android.os.Parcel;
import com.twitter.library.featureswitch.d;
import java.io.File;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class ResizeTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private Uri a;
    private File b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public ResizeTask(final Uri a, final File b, final int c, final int d, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = com.twitter.library.featureswitch.d.f("media_service_native_resize_enabled");
        this.f = f;
    }
    
    private ResizeTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    private void a(final Context context, final boolean b) {
        final File b2 = af.b(context, this.a);
        if (b2 != null) {
            if (this.f) {
                final File b3 = this.b;
                ImageOrientation imageOrientation;
                if (b) {
                    imageOrientation = ImageOrientation.a;
                }
                else {
                    imageOrientation = ImageOrientation.b;
                }
                h.a(b2, b3, imageOrientation);
            }
            else if (b) {
                final ImageOrientation a = h.a(b2);
                if (a != ImageOrientation.a) {
                    h.a(this.b, a);
                }
            }
        }
    }
    
    private boolean e(final Context context) {
        if (this.e && MediaUtils.a() && MediaUtils.a(context, this.a) != null && MediaUtils.a(context, this.a, this.b, this.c, this.d)) {
            this.a(context, true);
            return true;
        }
        return false;
    }
    
    private boolean f(final Context context) {
        if (!ImageDecoder.a(context, this.a).c().c()) {
            Bitmap bitmap = ImageDecoder.a(context, this.a).a(this.c).b();
            boolean b;
            if (bitmap == null) {
                bitmap = ImageDecoder.a(context, this.a).c(this.c).a().b();
                b = true;
            }
            else {
                b = false;
            }
            if (bitmap == null) {
                bitmap = ImageDecoder.a(context, this.a).b(this.c).a().b();
            }
            if (bitmap != null) {
                final boolean a = m.a(bitmap, this.b, Bitmap$CompressFormat.JPEG, this.d);
                this.a(context, b);
                bitmap.recycle();
                return a;
            }
        }
        return false;
    }
    
    @Override
    public void a(final Parcel parcel) {
        boolean f = true;
        super.a(parcel);
        this.a = Uri.parse(parcel.readString());
        this.b = new File(parcel.readString());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = (parcel.readInt() != 0 && f);
        if (parcel.readInt() == 0) {
            f = false;
        }
        this.f = f;
    }
    
    @Override
    protected boolean b(final Context context) {
        boolean b = this.e(context);
        if (!b) {
            b = this.f(context);
        }
        return b;
    }
    
    @Override
    protected boolean c(final Context context) {
        return this.f(context);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.toString());
        parcel.writeString(this.b.getAbsolutePath());
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        int n3;
        if (this.e) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.f) {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
