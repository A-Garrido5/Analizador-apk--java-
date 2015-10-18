// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import java.io.File;
import com.twitter.library.media.model.MediaType;
import android.content.Context;
import android.app.Activity;
import com.twitter.library.media.model.MediaFile;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class l extends AsyncTask
{
    private final WeakReference a;
    private final MediaFile b;
    private final long c;
    private final m d;
    
    l(final Activity activity, final MediaFile b, final long c, final m d) {
        this.a = new WeakReference((T)activity);
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    protected MediaFile a(final Void... array) {
        final Activity activity = (Activity)this.a.get();
        if (this.b == null || activity == null) {
            return null;
        }
        com.twitter.library.media.util.m.c((Context)activity, this.c);
        final File file = this.b.file;
        final File b = com.twitter.library.media.util.m.b((Context)activity, this.c);
        if (b == null) {
            file.delete();
            return null;
        }
        if (b.exists()) {
            b.delete();
        }
        if (file.renameTo(b)) {
            return MediaFile.a(b, MediaType.b);
        }
        file.delete();
        return null;
    }
    
    protected void a(final MediaFile mediaFile) {
        if (this.d != null) {
            this.d.b(mediaFile);
            return;
        }
        mediaFile.c();
    }
}
