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

class c implements n
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    @Override
    public void a(final p p) {
        this.a.c = p;
        this.a.b.countDown();
    }
}
