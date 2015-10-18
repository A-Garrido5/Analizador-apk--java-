// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import java.util.List;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.concurrent.CountDownLatch;

@Deprecated
public class b
{
    private m a;
    private final CountDownLatch b;
    private p c;
    private final n d;
    
    public b(final Context context, final ab ab) {
        this.b = new CountDownLatch(1);
        this.d = new c(this);
        this.a = new m(context, ab);
    }
    
    public p a(final EditableMedia editableMedia, final com.twitter.util.n n, final MediaProcessorFactory$MediaUsage mediaProcessorFactory$MediaUsage, final List list) {
        this.a.a(editableMedia, this.d, n, mediaProcessorFactory$MediaUsage, list);
        try {
            this.b.await();
            return this.c;
        }
        catch (Exception ex) {
            return new p(null, 1008, ex);
        }
    }
}
