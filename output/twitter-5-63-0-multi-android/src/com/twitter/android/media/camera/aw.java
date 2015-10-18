// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import java.io.IOException;
import android.os.SystemClock;
import android.media.MediaRecorder$OnInfoListener;
import android.os.Environment;
import java.util.Iterator;
import java.util.List;
import android.hardware.Camera$Size;
import com.twitter.errorreporter.ErrorReporter;
import android.media.CamcorderProfile;
import java.io.File;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import android.media.MediaRecorder;
import com.twitter.util.d;
import com.twitter.library.media.model.VideoFile;
import android.os.AsyncTask;

class aw extends AsyncTask
{
    final /* synthetic */ au a;
    
    private aw(final au a) {
        this.a = a;
    }
    
    protected VideoFile a(final Void... array) {
        d.c();
        return VideoFile.a(this.a.f);
    }
    
    protected void a(final VideoFile videoFile) {
        if (this.a.g == null) {
            return;
        }
        if (videoFile == null) {
            this.a.g.j();
        }
        else {
            this.a.g.a(videoFile);
        }
        this.a.j = false;
    }
}
