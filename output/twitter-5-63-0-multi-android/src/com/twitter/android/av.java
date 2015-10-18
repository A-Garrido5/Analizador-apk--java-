// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.MediaFile;
import com.twitter.util.concurrent.d;

class av implements d
{
    final /* synthetic */ BaseEditProfileActivity a;
    
    av(final BaseEditProfileActivity a) {
        this.a = a;
    }
    
    public void a(final MediaFile mediaFile) {
        if (mediaFile != null) {
            this.a.d(mediaFile);
            return;
        }
        this.a.t();
    }
}
