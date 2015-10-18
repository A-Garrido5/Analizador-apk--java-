// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.d;
import com.twitter.library.service.f;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.api.bg;

public class t extends BaseUploadRequest
{
    private final long f;
    private final bg g;
    private long h;
    
    public t(final Context context, final String s, final ab ab, final MediaFile mediaFile, final long f) {
        super(context, s, ab, mediaFile);
        this.g = bg.a(55);
        this.h = -1L;
        this.f = f;
    }
    
    @Override
    public void a(final x x) {
        if (this.X()) {
            final Long n = (Long)this.g.a();
            if (n == null) {
                ((aa)x.b()).a(1006, "Error, no media id");
            }
            else {
                this.h = n;
            }
        }
        super.a(x);
    }
    
    @Override
    protected void a(final f f) {
        f.b("X-SessionPhase", "INIT");
        f.b("X-TotalBytes", Long.toString(this.f));
    }
    
    public long b() {
        return this.h;
    }
    
    protected bg e() {
        return this.g;
    }
}
