// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import android.os.Looper;
import android.os.Handler;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;

class c implements Runnable
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.o != null) {
            this.a.o.a();
        }
    }
}
