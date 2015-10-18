// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.media.util.MediaException;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.EditableMedia;
import android.content.Context;
import com.twitter.internal.android.service.a;

public class c extends a
{
    private final Context a;
    private final EditableMedia e;
    private Exception f;
    private MediaFile g;
    
    public c(final Context a, final EditableMedia e) {
        super("MediaPreparationOperation");
        this.e = e;
        this.a = a;
    }
    
    public Exception a() {
        return this.f;
    }
    
    public MediaFile b() {
        return this.g;
    }
    
    @Override
    protected Object c() {
        return null;
    }
    
    @Override
    protected Object d() {
        this.g = this.e.c(this.a);
        if (this.g == null) {
            this.f = new MediaException("Failed to process media");
        }
        return null;
    }
}
