// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.aa;

public class p extends aa
{
    public final long a;
    public final MediaFile b;
    
    public p(final MediaFile mediaFile, final int n, final Exception ex) {
        this(new aa(), mediaFile, -1L);
        this.a(n, ex);
    }
    
    public p(final aa aa, final MediaFile b, final long a) {
        this.a(aa);
        this.a = a;
        this.b = b;
    }
}
