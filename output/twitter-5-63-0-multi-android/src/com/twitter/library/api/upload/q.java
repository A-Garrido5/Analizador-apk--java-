// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.twitter.util.d;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.EditableSegmentedVideo;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.util.p;
import com.twitter.library.media.util.MediaException;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import android.text.TextUtils;
import com.twitter.library.service.aa;
import com.twitter.internal.network.l;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLException;
import com.twitter.internal.network.HttpOperation;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.concurrent.ScheduledExecutorService;
import com.twitter.util.n;
import java.util.ArrayList;
import com.twitter.library.media.model.EditableMedia;
import android.content.Context;

public class q
{
    protected static final boolean a;
    protected final Context b;
    protected ah c;
    protected i d;
    protected boolean e;
    protected EditableMedia f;
    protected String g;
    protected int h;
    protected ArrayList i;
    protected long j;
    protected boolean k;
    protected n l;
    private final StringBuilder m;
    private ScheduledExecutorService n;
    
    static {
        a = (App.l() && Log.isLoggable("MediaUploader", 3));
    }
    
    public q(final Context context) {
        this.m = new StringBuilder();
        this.b = context.getApplicationContext();
    }
    
    public q(final Context b, final EditableMedia f) {
        this.m = new StringBuilder();
        this.b = b;
        this.f = f;
    }
    
    private void a(final HttpOperation httpOperation, final r r) {
        this.e = false;
        final l l = httpOperation.l();
        if ((r != null && r.a()) || l.c instanceof SSLException || l.c instanceof SocketTimeoutException) {
            this.e = true;
            if (r == null || !r.a()) {
                this.a("Cause", "NetworkTimeout", l.c);
                return;
            }
            this.a("Cause", "ForcedTimeout");
        }
    }
    
    public q a(final ah c) {
        this.c = c;
        return this;
    }
    
    public q a(final i d) {
        this.d = d;
        return this;
    }
    
    public final q a(final aa aa) {
        if (this.c == null || this.d == null || TextUtils.isEmpty((CharSequence)this.g)) {
            throw new IllegalStateException();
        }
        this.n = Executors.newSingleThreadScheduledExecutor();
        this.b(aa);
        this.n.shutdownNow();
        this.d.b();
        return this;
    }
    
    public q a(final n l) {
        this.l = l;
        return this;
    }
    
    public q a(final String g) {
        this.g = g;
        return this;
    }
    
    protected void a(final int n, final int n2) {
        if (this.l != null) {
            final String string = Integer.toString(this.hashCode());
            nz nz;
            if (n >= n2) {
                nz = nz.b(string, 3);
            }
            else {
                nz = nz.a(string, 3, n * 10000 / n2);
            }
            this.l.a(nz);
        }
    }
    
    protected void a(final HttpOperation httpOperation) {
        final r r = new r(httpOperation);
        this.n.schedule(r, 120L, TimeUnit.SECONDS);
        httpOperation.c();
        r.b();
        this.a(httpOperation, r);
    }
    
    protected void a(final File file, final aa aa) {
        this.k = true;
        this.c.a(this.g, Uri.fromFile(file));
        if (this.c.g == null) {
            this.a("Cause", "setEntity");
            aa.a(1007, new MediaException("Error creating entity from image"));
        }
        else {
            if (q.a) {
                Log.i("MediaUploader", "Uploading media. retry #: " + this.h);
            }
            final HttpOperation c = this.c.c();
            this.b(c);
            final p p2 = new p();
            final long contentLength = this.c.g.getContentLength();
            p2.a("upload-" + this.h, contentLength);
            ++this.h;
            this.a(c);
            this.c.a(c, aa);
            p2.a(c.l().a);
            this.i.add(p2);
            if (c.k()) {
                this.a(1, 1);
                this.j = contentLength;
            }
        }
    }
    
    protected void a(final String s, final String s2) {
        if (this.m.length() > 0) {
            this.m.append(',');
        }
        this.m.append(s).append('=').append(s2);
    }
    
    protected void a(final String s, final String s2, final Exception ex) {
        this.a(s, s2);
        if (ex != null) {
            this.m.append(',').append(s).append("_ex=\"").append(ex.toString()).append('\"');
        }
    }
    
    public boolean a() {
        return this.f != null;
    }
    
    public long b() {
        return this.j;
    }
    
    protected void b(final HttpOperation httpOperation) {
        if (this.f != null) {
            final MediaType e = this.f.e();
            if (e == MediaType.d) {
                httpOperation.a("X-Media-Type", "video/mp4");
            }
            else if (e == MediaType.e) {
                httpOperation.a("X-Media-Type", "video/mp4");
                if (((EditableSegmentedVideo)this.f).b()) {
                    httpOperation.a("X-Media-Cropping", "center");
                }
            }
        }
    }
    
    protected void b(final aa aa) {
        this.h = 0;
        this.i = new ArrayList();
        this.a(0, 1);
        while (true) {
            do {
                this.i();
                final MediaFile d = this.d.d();
                if (d != null) {
                    this.a(d.file, aa);
                    if (aa.a() || aa.c() != 0) {
                        this.a("FileSize", Long.toString(this.j));
                        return;
                    }
                    continue;
                }
            } while (this.h());
            continue;
        }
    }
    
    public int c() {
        return this.h;
    }
    
    public ArrayList d() {
        return this.i;
    }
    
    public boolean e() {
        return this.k;
    }
    
    public String f() {
        return this.m.toString();
    }
    
    public MediaFile g() {
        com.twitter.util.d.c();
        if (this.f != null) {
            return this.f.c(this.b);
        }
        return null;
    }
    
    protected boolean h() {
        return this.e && !this.d.a();
    }
    
    protected void i() {
        this.m.delete(0, this.m.length());
    }
}
