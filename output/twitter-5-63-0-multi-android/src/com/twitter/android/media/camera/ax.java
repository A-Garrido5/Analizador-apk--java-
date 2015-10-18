// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import com.twitter.library.media.model.VideoFile;
import java.io.IOException;
import android.os.SystemClock;
import android.media.MediaRecorder$OnInfoListener;
import android.os.Environment;
import com.twitter.util.d;
import java.util.Iterator;
import java.util.List;
import android.hardware.Camera$Size;
import com.twitter.errorreporter.ErrorReporter;
import android.media.CamcorderProfile;
import java.io.File;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.AsyncTask;

class ax extends AsyncTask
{
    final /* synthetic */ au a;
    private final int b;
    private boolean c;
    
    ax(final au a, final int b) {
        this.a = a;
        this.b = b;
        this.c = (a.d() < 2000);
    }
    
    protected Boolean a(final Void... array) {
        boolean b = true;
        if (this.a.c(this.b)) {
            return b;
        }
        if (!this.c || !this.a.c(this.b)) {
            b = false;
        }
        return b;
    }
    
    protected void a(final Boolean b) {
        if (b) {
            if (this.a.g != null) {
                this.a.g.i();
            }
        }
        else {
            this.a.i = null;
            if (this.a.g != null) {
                this.a.g.a(true);
            }
        }
    }
    
    protected void onCancelled() {
        new ay(this.a, true).executeOnExecutor(ax.SERIAL_EXECUTOR, (Object[])new Void[0]);
    }
}
