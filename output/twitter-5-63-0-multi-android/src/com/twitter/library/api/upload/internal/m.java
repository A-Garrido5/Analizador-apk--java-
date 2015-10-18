// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import java.io.Closeable;
import java.io.IOException;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.util.bd;
import com.twitter.library.api.upload.n;
import com.twitter.library.service.ab;
import android.content.Context;
import java.io.RandomAccessFile;
import com.twitter.library.util.ac;
import com.twitter.library.media.model.MediaFile;

public class m extends a
{
    public final int d;
    public final int e;
    private final MediaFile f;
    private final int g;
    private int h;
    private long i;
    private long j;
    private ac k;
    private int l;
    private RandomAccessFile m;
    
    m(final Context context, final ab ab, final MediaFile f, final n n, final com.twitter.util.n n2, final int g) {
        super(context, ab, n, n2);
        this.d = 1000;
        this.e = 8000;
        this.j = -1L;
        this.k = null;
        this.l = 0;
        this.g = g;
        this.f = f;
    }
    
    private void a(final bd bd, final int n, final long n2, final String s) {
        final q q = new q(this.a, "segmented_upload_append", this.b, this.f, this.j, bd, n, n2, s);
        q.a(new p(this));
        as.a(this.a).a(q, (z)null);
    }
    
    private void b() {
        final t t = new t(this.a, "segmented_upload_init", this.b, this.f, this.i);
        this.a(0, 10000);
        t.a(new com.twitter.library.api.upload.internal.n(this, t));
        as.a(this.a).a(t, (z)null);
    }
    
    private void c() {
        try {
            this.m = new RandomAccessFile(this.f.file, "r");
            this.k = new ac(this.m, this.i, this.g);
            this.h = 8000 / this.k.a();
            this.d();
        }
        catch (IOException ex) {
            this.a(this.f, 1008, ex);
        }
    }
    
    private void d() {
        if (!this.k.hasNext()) {
            this.e();
            return;
        }
        final bd b = this.k.b();
        if (b == null) {
            this.a(this.f, 1008, new IOException("RewindableInputStream is null"));
            return;
        }
        this.a(b, this.l, this.k.d(), this.k.e());
    }
    
    private void e() {
        final s s = new s(this.a, "segmented_upload_finalize", this.b, this.f, this.j);
        s.a(new o(this, s));
        as.a(this.a).a(s, (z)null);
    }
    
    private void f() {
        yh.a(this.m);
        yh.a(this.k);
    }
    
    @Override
    public void a() {
        try {
            this.i = this.f.file.length();
            if (this.i == 0L) {
                this.a(this.f, 1008, new IOException("EditableMedia filesize is empty"));
                return;
            }
        }
        catch (Exception ex) {
            this.a(this.f, 1008, ex);
            return;
        }
        this.b();
    }
    
    @Override
    protected void b(final com.twitter.library.api.upload.p p) {
        this.f();
        super.b(p);
    }
}
