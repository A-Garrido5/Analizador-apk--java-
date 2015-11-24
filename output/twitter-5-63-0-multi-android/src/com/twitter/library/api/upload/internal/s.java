// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.ab;
import android.content.Context;

public class s extends BaseUploadRequest
{
    private final long f;
    
    public s(final Context context, final String s, final ab ab, final MediaFile mediaFile, final long f) {
        super(context, s, ab, mediaFile);
        this.f = f;
    }
    
    @Override
    protected void a(final f f) {
        f.b("X-SessionPhase", "FINALIZE");
        f.b("X-MediaId", Long.toString(this.f));
        f.a(HttpOperation$RequestMethod.b);
    }
    
    protected bg b() {
        return null;
    }
}
