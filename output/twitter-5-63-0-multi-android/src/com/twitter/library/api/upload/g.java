// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.concurrent.Callable;
import android.os.AsyncTask;
import com.twitter.util.concurrent.b;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.internal.android.util.Size;
import java.io.File;
import com.twitter.library.media.service.tasks.ResizeTask;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.ImageFile;
import android.content.Context;

public class g implements i
{
    private final Context a;
    private final int[] b;
    private final int[] c;
    private final int d;
    private final ImageFile e;
    private final long f;
    private ImageFile g;
    private int h;
    
    public g(final Context context, final int[] b, final int[] c, final int d, final ImageFile imageFile, final long f) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = imageFile;
        this.f = f;
        this.g = imageFile;
    }
    
    private ImageFile a(final int n, final int n2) {
        final File a = af.a(this.a, MediaType.b.extension);
        if (!new ResizeTask(this.e.b(), a, n, n2, com.twitter.library.featureswitch.d.f("photo_upload_preserve_exif_data_enabled")).d(this.a)) {
            this.a("resize", "failure", n);
            return null;
        }
        this.a("resize", "success", n);
        ImageFile imageFile = ImageFile.a(a);
        if (imageFile != null) {
            final Size size = this.e.size;
            if (size.a() <= n && size.b() <= n && imageFile.file.length() / this.e.file.length() > 0.7f) {
                this.a("resize", "skip", n);
                imageFile.a();
                imageFile = this.e;
            }
            return imageFile;
        }
        return this.e;
    }
    
    private void a(final String s, final String s2, final int n) {
        ScribeService.a(this.a, ((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.f).b(new String[] { ScribeLog.a("::image_processor", s, s2) })).c(2)).c("size=" + n));
    }
    
    private void e() {
        if (this.g != null && !this.g.a(this.e)) {
            this.g.a();
        }
        this.g = null;
    }
    
    @Override
    public boolean a() {
        return this.h >= this.b.length;
    }
    
    @Override
    public void b() {
        com.twitter.util.d.c();
        this.e();
    }
    
    @Override
    public com.twitter.util.concurrent.i c() {
        return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new h(this)).a();
    }
    
    @Override
    public MediaFile d() {
        com.twitter.util.d.c();
        while (!this.a()) {
            this.e();
            this.g = this.a(this.b[this.h], this.c[this.h]);
            ++this.h;
            if (this.g != null && this.g.file.length() < this.d) {
                break;
            }
        }
        return this.g;
    }
}
