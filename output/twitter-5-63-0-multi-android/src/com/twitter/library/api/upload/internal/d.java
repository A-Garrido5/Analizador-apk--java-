// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.media.util.MediaException;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.upload.i;
import com.twitter.internal.android.service.a;

public class d extends a
{
    private final i a;
    private Exception e;
    private MediaFile f;
    
    public d(final i a) {
        super("MediaProcessOperation");
        this.a = a;
    }
    
    public Exception a() {
        return this.e;
    }
    
    public MediaFile b() {
        return this.f;
    }
    
    @Override
    protected Object c() {
        return null;
    }
    
    @Override
    protected Object d() {
        this.f = this.a.d();
        if (this.f == null) {
            this.e = new MediaException("Error in MediaProcessor");
        }
        return null;
    }
}
