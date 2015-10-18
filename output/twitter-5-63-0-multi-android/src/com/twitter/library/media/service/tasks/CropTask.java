// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Matrix;
import com.twitter.library.media.util.m;
import com.twitter.library.media.decoder.ImageDecoder;
import com.twitter.library.util.af;
import com.twitter.media.ImageInfo;
import com.twitter.library.media.util.h;
import com.twitter.media.MediaUtils;
import android.content.Context;
import com.twitter.util.j;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import android.os.Parcel;
import android.graphics.RectF;
import java.io.File;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class CropTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    public Uri a;
    public File b;
    public RectF c;
    public int d;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public CropTask(final Uri a, final File b, final RectF c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private CropTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    private Rect a(final Size size) {
        return j.a(j.a(j.a(this.c, size)), size.f());
    }
    
    private boolean e(final Context context) {
        final boolean a = MediaUtils.a();
        boolean b = false;
        if (a) {
            final ImageInfo a2 = MediaUtils.a(context, this.a);
            b = false;
            if (a2 != null) {
                final Rect a3 = this.a(Size.a(a2.width, a2.height));
                if (a3.isEmpty() || (a3.width() == a2.width && a3.height() == a2.height)) {
                    b = yp.a(context, this.a, this.b);
                }
                else {
                    b = MediaUtils.a(context, this.a, this.b, a3);
                }
            }
        }
        if (b && this.d != 0) {
            h.a(this.b, this.d);
        }
        if (!b) {
            this.b.delete();
        }
        return b;
    }
    
    private boolean f(final Context context) {
        int n = 1;
        final String a = af.a(context, this.a);
        final Bitmap b = ImageDecoder.a(context, this.a).b();
        boolean b2 = false;
        if (b != null) {
            final Size a2 = Size.a(b);
            final Rect a3 = this.a(a2);
            int n2;
            if (!a2.c() && !a3.isEmpty()) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (a3.width() == a2.a() && a3.height() == a2.b()) {
                n = 0;
            }
            if (n2 != 0 && n != 0) {
                final Bitmap a4 = m.a(b, a3, null, false);
                b2 = false;
                if (a4 != null) {
                    Bitmap$CompressFormat bitmap$CompressFormat;
                    if ("image/png".equals(a)) {
                        bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
                    }
                    else {
                        bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
                    }
                    b2 = m.a(a4, this.b, bitmap$CompressFormat, 95);
                    a4.recycle();
                }
            }
            else {
                b2 = yp.a(context, this.a, this.b);
            }
            b.recycle();
            if (b2 && this.d != 0) {
                h.a(this.b, this.d);
            }
            if (!b2) {
                this.b.delete();
                return b2;
            }
        }
        return b2;
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = Uri.parse(parcel.readString());
        this.b = new File(parcel.readString());
        this.c = (RectF)RectF.CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt();
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
        return this.b(context);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.toString());
        parcel.writeString(this.b.getAbsolutePath());
        this.c.writeToParcel(parcel, n);
        parcel.writeInt(this.d);
    }
}
