// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.MediaFile;
import com.twitter.library.client.Session;
import com.twitter.util.concurrent.d;

class ft implements d
{
    final /* synthetic */ Session a;
    final /* synthetic */ EditAccountActivity b;
    
    ft(final EditAccountActivity b, final Session a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final MediaFile mediaFile) {
        if (mediaFile != null) {
            this.b.a(mediaFile, this.a);
            return;
        }
        this.b.a(this.a);
    }
}
