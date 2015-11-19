// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.net.URI;
import com.twitter.library.network.ae;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.e;
import com.twitter.library.service.m;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.u;
import com.twitter.library.service.l;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.f;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.c;

public abstract class BaseUploadRequest extends c
{
    protected final MediaFile a;
    protected b e;
    private f f;
    
    protected BaseUploadRequest(final Context context, final String s, final ab ab, final MediaFile a) {
        super(context, s, ab);
        this.a = a;
        final l l = new l();
        l.a(new u()).a(new m(context)).a(new h());
        this.a(l);
    }
    
    @Override
    protected final e a() {
        return this.f.a();
    }
    
    @Override
    public void a(final x x) {
        if (this.e != null) {
            this.e.a(x);
        }
    }
    
    public void a(final b e) {
        this.e = e;
    }
    
    protected abstract void a(final f p0);
    
    @Override
    protected boolean c(final aa aa) {
        final f m = this.M();
        final MediaType type = this.a.type;
        Label_0096: {
            if (type != MediaType.d) {
                break Label_0096;
            }
            m.b("X-Media-Type", "video/mp4");
        Block_4_Outer:
            while (true) {
                m.b(URI.create(ae.a(this.p).g).getHost());
                m.a("1.1");
                m.a(new Object[] { "media", "upload" });
                m.a(HttpOperation$RequestMethod.b);
                try {
                    this.a(m);
                    this.f = m;
                    return true;
                    while (true) {
                        m.b("X-Media-Type", "video/mp4");
                        m.b("X-Media-Cropping", "center");
                        continue Block_4_Outer;
                        continue;
                    }
                }
                // iftrue(Label_0029:, type != MediaType.e)
                catch (BaseUploadRequest$BuilderInitException ex) {
                    aa.a(ex.a(), ex.b());
                    return false;
                }
            }
        }
    }
}
