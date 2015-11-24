// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import com.twitter.internal.android.util.Size;
import java.io.File;
import com.twitter.library.media.service.tasks.CropTask;
import android.graphics.RectF;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.util.h;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.ImageFile;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.AsyncTask;

class v extends AsyncTask
{
    private final Context a;
    private final int b;
    private final WeakReference c;
    private byte[] d;
    
    v(final Context context, final byte[] d, final int b, final u u) {
        this.a = context.getApplicationContext();
        this.d = d;
        this.b = b;
        this.c = new WeakReference((T)u);
    }
    
    protected ImageFile a(final Void... array) {
        ImageFile imageFile;
        if (this.d == null) {
            imageFile = null;
        }
        else {
            final File a = af.a(this.a, MediaType.b.extension);
            if (a == null || !yh.a(this.d, a)) {
                return null;
            }
            this.d = null;
            h.a(a, ImageOrientation.a(this.b), true);
            imageFile = (ImageFile)MediaFile.a(a, MediaType.b);
            if (imageFile == null) {
                return null;
            }
            final Size size = imageFile.size;
            final int a2 = size.a();
            final int b = size.b();
            if (a2 * 3 != b * 4 && a2 * 4 != b * 3) {
                float n;
                float n2;
                if (a2 <= b) {
                    n = a2 / 3;
                    n2 = b / 4;
                }
                else {
                    n = a2 / 4;
                    n2 = b / 3;
                }
                final float n3 = Math.min(n, n2) / 2.0f;
                final float n4 = 0.5f - n3 / n;
                final float n5 = 0.5f - n3 / n2;
                final RectF rectF = new RectF(n4, n5, 1.0f - n4, 1.0f - n5);
                final File a3 = af.a(this.a, MediaType.b.extension);
                if (a3 != null) {
                    final CropTask cropTask = new CropTask(imageFile.b(), a3, rectF, 0);
                    cropTask.d(this.a);
                    if (cropTask.b()) {
                        imageFile.a();
                        return (ImageFile)MediaFile.a(a3, MediaType.b);
                    }
                }
            }
        }
        return imageFile;
    }
    
    protected void a(final ImageFile imageFile) {
        if (imageFile != null) {
            final u u = (u)this.c.get();
            if (u != null) {
                u.a(imageFile);
            }
        }
    }
}
