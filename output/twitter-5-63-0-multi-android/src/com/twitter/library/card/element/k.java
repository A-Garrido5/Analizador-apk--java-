// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import com.twitter.library.media.manager.aj;
import com.twitter.library.media.manager.al;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.media.manager.ResourceResponse$ResourceSource;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.manager.ResourceResponse;
import java.lang.ref.WeakReference;
import com.twitter.library.media.manager.ap;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.ar;

public class k implements ar
{
    private final ao a;
    private final ap b;
    private final WeakReference c;
    
    public k(final ao a, final ap b, final j j) {
        this.a = a;
        this.b = b;
        this.c = new WeakReference((T)j);
    }
    
    @Override
    public void a(final ResourceResponse resourceResponse) {
        boolean b = true;
        final VideoFile videoFile = (VideoFile)resourceResponse.c();
        if (videoFile != null) {
            final boolean b2 = resourceResponse.d() == ResourceResponse$ResourceSource.b && b;
            final j j = (j)this.c.get();
            if (j != null) {
                final String absolutePath = videoFile.file.getAbsolutePath();
                final ap b3 = this.b;
                if (b2) {
                    b = false;
                }
                j.a(b3, absolutePath, b);
            }
            String s;
            if (b2) {
                s = "Retrieved Cached Video " + this.b.a();
            }
            else {
                s = "Fetched Video " + this.b.a();
            }
            CardDebugLog.b(s, null);
        }
    }
    
    public boolean a() {
        this.b.a(this);
        return !this.a.b(this.b).isDone();
    }
}
