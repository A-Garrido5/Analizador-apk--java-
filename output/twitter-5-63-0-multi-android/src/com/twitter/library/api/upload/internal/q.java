// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import org.apache.http.HttpEntity;
import com.twitter.library.network.l;
import com.twitter.library.service.f;
import java.io.Closeable;
import java.io.IOException;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import java.util.TimerTask;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.Timer;
import com.twitter.library.util.bd;

public class q extends BaseUploadRequest
{
    private final int f;
    private final long g;
    private final String h;
    private final bd i;
    private final long j;
    private Timer k;
    private volatile boolean l;
    
    public q(final Context context, final String s, final ab ab, final MediaFile mediaFile, final long j, final bd i, final int f, final long g, final String h) {
        super(context, s, ab, mediaFile);
        this.k = null;
        this.l = false;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.b(2);
    }
    
    private void a(final long n) {
        synchronized (this) {
            if (this.k != null) {
                this.k.cancel();
            }
            (this.k = new Timer()).schedule(new r(this), n);
        }
    }
    
    @Override
    public void a(final x x) {
        if (this.l) {
            ((aa)x.b()).a(1009, new IOException());
        }
        this.k.cancel();
        yh.a((Closeable)this.i);
        super.a(x);
    }
    
    @Override
    protected void a(final f f) {
        final l l = new l(this.p, null);
        try {
            l.a("media", com.twitter.util.q.a(8), this.i, (int)this.g);
            l.a();
            f.b("X-SessionPhase", "APPEND");
            f.a((HttpEntity)l);
            f.b("X-MediaId", Long.toString(this.j));
            f.b("Content-MD5", this.h);
            f.b("X-SegmentIndex", Integer.toString(this.f));
            f.b("X-TotalBytes", Long.toString(this.g));
        }
        catch (IOException ex) {
            throw new BaseUploadRequest$BuilderInitException(1008, ex);
        }
    }
    
    protected bg b() {
        return bg.a(82);
    }
    
    @Override
    public void b(final x x) {
        super.b(x);
        try {
            this.i.a();
        }
        catch (Exception ex) {
            ((aa)x.b()).a(1008, ex);
            this.cancel(true);
        }
    }
    
    public boolean c(final aa aa) {
        this.a(120000L);
        return super.c(aa);
    }
}
