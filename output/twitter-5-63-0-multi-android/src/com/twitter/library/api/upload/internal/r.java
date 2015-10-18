// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import org.apache.http.HttpEntity;
import com.twitter.library.network.l;
import com.twitter.library.service.f;
import java.io.Closeable;
import java.io.IOException;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.Timer;
import com.twitter.library.util.bd;
import java.util.TimerTask;

class r extends TimerTask
{
    final /* synthetic */ q a;
    
    r(final q a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.l = true;
        this.a.N();
    }
}
