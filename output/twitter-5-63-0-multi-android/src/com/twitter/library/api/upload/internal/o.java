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
import com.twitter.library.api.upload.p;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;

class o implements b
{
    final /* synthetic */ s a;
    final /* synthetic */ m b;
    
    o(final m b, final s a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final x x) {
        final aa aa = (aa)x.b();
        if (aa == null) {
            x.a(new p(this.b.f, 1005, new Exception("Finalize request result is null")));
        }
        if (this.a.X()) {
            this.b.a(10000, 10000);
        }
        this.b.b(new p(aa, this.b.f, this.b.j));
    }
}
