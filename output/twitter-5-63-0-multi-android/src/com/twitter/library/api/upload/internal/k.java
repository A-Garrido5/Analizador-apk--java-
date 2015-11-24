// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.client.as;
import com.twitter.library.api.upload.n;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.media.model.MediaFile;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.upload.p;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class k extends z
{
    final /* synthetic */ j a;
    
    k(final j a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        long b = -1L;
        if (aa.a()) {
            b = ((i)y).b();
            this.a.a(10000, 10000);
        }
        this.a.b(new p(aa, this.a.d, b));
    }
}
