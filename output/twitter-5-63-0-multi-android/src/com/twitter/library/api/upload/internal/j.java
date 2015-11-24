// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.api.upload.n;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.media.model.MediaFile;

public class j extends a
{
    private final MediaFile d;
    
    public j(final Context context, final ab ab, final MediaFile d, final n n, final com.twitter.util.n n2) {
        super(context, ab, n, n2);
        this.d = d;
    }
    
    @Override
    public void a() {
        final i i = new i(this.a, "non_segmented_upload", this.b, this.d);
        this.a(0, 10000);
        as.a(this.a).a(i, new k(this));
    }
}
