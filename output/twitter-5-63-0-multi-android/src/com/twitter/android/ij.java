// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import android.net.Uri;
import com.twitter.library.media.manager.q;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import com.twitter.library.featureswitch.d;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.twitter.library.util.af;
import com.twitter.library.media.util.z;
import com.twitter.library.media.util.y;
import com.twitter.library.media.util.w;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import android.content.Context;
import android.os.AsyncTask;

class ij extends AsyncTask
{
    private final Context a;
    
    public ij(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    private File a(final ik ik) {
        final ImageView imageView = ik.a.getImageView();
        Bitmap bitmap;
        if (imageView != null && imageView.getDrawable() != null && imageView.getDrawable() instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
        }
        else {
            bitmap = null;
        }
        if (bitmap != null && this.a != null) {
            final File a = m.a(this.a, bitmap, Bitmap$CompressFormat.JPEG, 95);
            try {
                return w.a(this.a).c(new y(a));
            }
            finally {
                af.b(a);
            }
        }
        return null;
    }
    
    private boolean b(final File file) {
        final boolean equals = d.a("webp_images_3149").equals("webp");
        boolean b = false;
        if (equals) {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), bitmapFactory$Options);
            if (bitmapFactory$Options.outMimeType != null) {
                final boolean equals2 = bitmapFactory$Options.outMimeType.equals("image/webp");
                b = false;
                if (!equals2) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    protected File a(final ik... array) {
        final ik ik = array[0];
        if (ik != null) {
            final File c = q.a(this.a).c(ik.d);
            if (c != null) {
                final String lastPathSegment = Uri.parse(ik.d.l).getLastPathSegment();
                synchronized (c) {
                    if (this.b(c)) {
                        return this.a(ik);
                    }
                    final y y = new y(c);
                    y.j = lastPathSegment;
                    return w.a(this.a).b(y);
                }
            }
        }
        return null;
    }
    
    protected void a(final File file) {
        int n;
        if (file != null) {
            n = 2131297599;
        }
        else {
            n = 2131297598;
        }
        Toast.makeText(this.a, n, 0).show();
    }
}
