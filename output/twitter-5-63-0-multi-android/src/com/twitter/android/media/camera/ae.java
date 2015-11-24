// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import java.io.File;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.util.z;
import com.twitter.library.media.util.w;
import com.twitter.library.media.util.y;
import com.twitter.library.media.model.ImageFile;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.AsyncTask;

class ae extends AsyncTask implements com.twitter.library.media.util.ae
{
    private final Context a;
    private final WeakReference b;
    private final ImageFile c;
    private ImageFile d;
    private boolean e;
    
    ae(final Context context, final ImageFile c, final af af) {
        this.a = context.getApplicationContext();
        this.c = c;
        this.b = new WeakReference((T)af);
    }
    
    protected ImageFile a(final Void... array) {
        final y y = new y(this.c.file);
        y.k = "TwitterCamera";
        y.l = this;
        try {
            final File c = w.a(this.a).c(y);
            if (c != null) {
                return (ImageFile)MediaFile.a(c, MediaType.b);
            }
            return null;
        }
        catch (Throwable t) {
            ErrorReporter.a(t);
            this.c.a();
            return null;
        }
        finally {
            this.c.a();
        }
    }
    
    protected void a(final ImageFile d) {
        final af af = (af)this.b.get();
        if (af != null) {
            if (d == null) {
                af.d();
            }
            else {
                if (this.e) {
                    af.b(d);
                    return;
                }
                this.d = d;
            }
        }
    }
    
    public void a(final File file) {
        this.e = true;
        if (this.d != null) {
            final af af = (af)this.b.get();
            if (af != null) {
                af.b(this.d);
            }
        }
    }
}
