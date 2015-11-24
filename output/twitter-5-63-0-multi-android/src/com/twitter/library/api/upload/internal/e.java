// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.aa;
import com.twitter.library.api.upload.p;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.client.as;
import com.twitter.library.media.util.MediaException;
import com.twitter.library.api.upload.MediaProcessorFactory;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.List;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.upload.i;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.upload.MediaProcessorFactory$MediaUsage;
import com.twitter.library.api.upload.n;

public class e extends a implements n
{
    private final MediaProcessorFactory$MediaUsage d;
    private EditableMedia e;
    private i f;
    private MediaFile g;
    private List h;
    
    public e(final Context context, final ab ab, final EditableMedia e, final n n, final com.twitter.util.n n2, final MediaProcessorFactory$MediaUsage d, final List h) {
        super(context, ab, n, n2);
        this.f = null;
        this.g = null;
        this.e = e;
        this.d = d;
        this.h = h;
    }
    
    private void a(final c c) {
        this.g = c.b();
        final Exception a = c.a();
        if (a != null) {
            this.a(this.g, 1002, a);
            return;
        }
        this.f = MediaProcessorFactory.a(this.a, this.g, this.d, this.b.c);
        this.c();
    }
    
    private void a(final d d) {
        final MediaFile b = d.b();
        final Exception a = d.a();
        if (a != null) {
            this.a(b, 1002, a);
            return;
        }
        if (b == null) {
            this.a(b, 1002, new MediaException("Error creating media file"));
            return;
        }
        this.a(b);
    }
    
    private void a(final MediaFile mediaFile) {
        a a;
        if (this.b(mediaFile)) {
            a = new l(this.a, this.b, mediaFile, this, this.c, this.h);
        }
        else {
            a = new j(this.a, this.b, mediaFile, this, this.c);
        }
        a.a();
    }
    
    private void b() {
        final c c = new c(this.a, this.e);
        c.b(4);
        c.a(new f(this, c));
        as.a(this.a).a(c);
    }
    
    private boolean b(final MediaFile mediaFile) {
        final MediaType type = mediaFile.type;
        return type == MediaType.d || type == MediaType.e || mediaFile.file.length() > this.h.get(0);
    }
    
    private void c() {
        final d d = new d(this.f);
        d.a(new g(this, d));
        as.a(this.a).a(d);
    }
    
    @Override
    public void a() {
        this.b();
    }
    
    @Override
    public void a(final p p) {
        if (p.a() || this.f.a()) {
            this.b(p);
            return;
        }
        if (this.h.size() > 1) {
            this.h = this.h.subList(-1 + this.h.size(), this.h.size());
        }
        this.c();
    }
    
    @Override
    protected void b(final p p) {
        if (this.f != null) {
            this.f.c();
        }
        super.b(new p(p, this.g, p.a));
    }
}
