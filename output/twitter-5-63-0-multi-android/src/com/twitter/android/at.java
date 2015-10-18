// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.MediaFile;
import com.twitter.util.concurrent.d;

class at implements d
{
    final /* synthetic */ BaseEditProfileActivity a;
    
    at(final BaseEditProfileActivity a) {
        this.a = a;
    }
    
    public void a(final MediaFile mediaFile) {
        if (mediaFile != null) {
            this.a.c(mediaFile);
            return;
        }
        this.a.u();
    }
}
