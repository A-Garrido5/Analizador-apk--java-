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
import com.twitter.library.service.ab;
import android.content.Context;
import java.io.RandomAccessFile;
import com.twitter.library.util.ac;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.upload.p;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;

class n implements b
{
    final /* synthetic */ t a;
    final /* synthetic */ m b;
    
    n(final m b, final t a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final x x) {
        final aa aa = (aa)x.b();
        if (aa == null) {
            x.a(new p(this.b.f, 1005, new Exception()));
        }
        if (((aa)x.b()).a()) {
            this.b.j = this.a.b();
            this.b.a(1000, 10000);
            this.b.c();
            return;
        }
        this.b.b(new p(aa, this.b.f, this.b.j));
    }
}
