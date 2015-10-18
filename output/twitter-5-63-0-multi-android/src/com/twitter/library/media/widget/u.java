// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.model.MediaFile;
import com.twitter.errorreporter.ErrorReporter;
import java.util.zip.DataFormatException;
import com.twitter.errorreporter.a;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.al;

class u implements al
{
    final /* synthetic */ float a;
    final /* synthetic */ k b;
    final /* synthetic */ t c;
    
    u(final t c, final float a, final k b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void a(final p p) {
        final MediaFile a = p.a();
        if (p.c() != null && a != null && Math.abs(this.a - a.size.e()) > 0.3) {
            ErrorReporter.a(new a().a("RequestedUrl", this.b.l).a("ExpectedAspectRatio", this.a).a("RecievedAspectRatio", a.size.e()).a("ItemType", this.c.a.getClass().getSimpleName()).a("Source", p.d().name()).a(new DataFormatException("Received bad image data")));
        }
    }
}
