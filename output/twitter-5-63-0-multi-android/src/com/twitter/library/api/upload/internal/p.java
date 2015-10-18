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
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;

class p implements b
{
    final /* synthetic */ m a;
    
    p(final m a) {
        this.a = a;
    }
    
    @Override
    public void a(final x x) {
        final aa aa = (aa)x.b();
        if (aa == null) {
            x.a(new com.twitter.library.api.upload.p(this.a.f, 1005, new Exception("Append request result is null")));
        }
        if (aa.a()) {
            this.a.l++;
            this.a.a(this.a.h * this.a.l, 10000);
            this.a.d();
            return;
        }
        this.a.b(new com.twitter.library.api.upload.p(aa, this.a.f, this.a.j));
    }
}
