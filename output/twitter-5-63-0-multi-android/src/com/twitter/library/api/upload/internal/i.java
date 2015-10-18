// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.d;
import java.io.IOException;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.q;
import com.twitter.library.network.l;
import com.twitter.library.service.f;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.api.bg;

public class i extends BaseUploadRequest
{
    private final bg f;
    private long g;
    
    protected i(final Context context, final String s, final ab ab, final MediaFile mediaFile) {
        super(context, s, ab, mediaFile);
        this.f = bg.a(55);
        this.g = -1L;
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        if (((aa)x.b()).a()) {
            final Long n = (Long)this.f.a();
            if (n != null) {
                this.g = n;
            }
        }
    }
    
    @Override
    protected void a(final f f) {
        final l l = new l(this.p, null);
        try {
            l.a("media", com.twitter.util.q.a(8), this.a.b());
            l.a();
            f.a((HttpEntity)l);
        }
        catch (IOException ex) {
            throw new BaseUploadRequest$BuilderInitException(1008, ex);
        }
    }
    
    public long b() {
        return this.g;
    }
    
    protected bg e() {
        return this.f;
    }
}
