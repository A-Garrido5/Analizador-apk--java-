// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.internal.network.j;
import com.twitter.library.media.util.MediaException;
import com.twitter.library.service.aa;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.bg;
import com.twitter.util.n;

public class k extends ag implements n
{
    private bg a;
    private long e;
    private MediaFile f;
    
    public k(final Context context, final ab ab) {
        super(context, k.class.getName(), ab);
    }
    
    public k a(final q m) {
        this.m = m;
        return this;
    }
    
    @Override
    protected void a(final aa aa) {
        if (!this.e()) {
            throw new IllegalStateException();
        }
        this.f = this.m.g();
        if (this.f == null) {
            aa.a(1002, new MediaException("Failed to process media"));
            return;
        }
        final ab p = this.P();
        final i a = MediaProcessorFactory.a(this.p, this.f, MediaProcessorFactory$MediaUsage.a, p.c);
        this.a = bg.a(55);
        this.l = new ah(this.p, p).a(this.t()).a(this.a);
        this.u();
        this.m.a(this.l).a(a).a("media").a(this).a(aa);
        this.v();
        if (aa.a()) {
            this.e = (long)this.a.a();
            return;
        }
        while (true) {
            try {
                final ArrayList list = (ArrayList)this.a.a();
                this.a("custom_errors", ae.a(list));
            }
            catch (Exception ex) {
                final ArrayList list = null;
                continue;
            }
            break;
        }
    }
    
    public void a(final nz nz) {
        this.c(nz.c);
    }
    
    @Override
    public int ay_() {
        return 3;
    }
    
    public long b() {
        return this.m.b();
    }
    
    public boolean e() {
        return this.m != null && this.m.a();
    }
    
    public long g() {
        return this.e;
    }
    
    public MediaFile h() {
        return this.f;
    }
    
    protected StringBuilder t() {
        return ae.a(this.q.g, "1.1", "media", "upload").append(".json");
    }
}
