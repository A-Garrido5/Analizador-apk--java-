// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.MediaFile;
import com.twitter.util.concurrent.d;

class au implements d
{
    final /* synthetic */ BaseEditProfileActivity a;
    
    au(final BaseEditProfileActivity a) {
        this.a = a;
    }
    
    public void a(final MediaFile b) {
        if (b != null) {
            if (this.a.b != null) {
                this.a.b.c();
            }
            this.a.b = b;
            return;
        }
        this.a.u();
    }
}
