// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.hardware.Camera$AutoFocusCallback;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import android.hardware.Camera$CameraInfo;
import android.media.CamcorderProfile;
import android.annotation.TargetApi;
import com.twitter.util.d;
import java.io.File;
import android.os.Bundle;
import java.io.IOException;
import android.hardware.Camera$Size;
import java.util.List;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$PreviewCallback;
import android.media.MediaRecorder;
import android.graphics.SurfaceTexture;
import android.content.Context;
import android.hardware.Camera$ShutterCallback;
import android.hardware.Camera$Parameters;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.android.util.l;
import android.hardware.Camera;
import android.os.AsyncTask;

class w extends AsyncTask
{
    final /* synthetic */ m a;
    private final int b;
    
    w(final m a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    protected Camera a(final Void... array) {
        if (this.isCancelled()) {
            return null;
        }
        try {
            final Camera open = Camera.open(this.b);
            open.setDisplayOrientation(this.a.d(z.a(this.a.d)));
            final Camera$Parameters parameters = open.getParameters();
            final int[] a = l.a(parameters.getSupportedPreviewFpsRange());
            if (a != null) {
                parameters.setPreviewFpsRange(a[0], a[1]);
                open.setParameters(parameters);
            }
            return open;
        }
        catch (RuntimeException ex) {
            ErrorReporter.a(ex);
            return null;
        }
    }
    
    protected void a(final Camera camera) {
        if (this.a.t == this) {
            this.a.t = null;
        }
        this.a.a(camera);
    }
    
    protected void b(final Camera camera) {
        if (this.a.t == this) {
            this.a.t = null;
        }
        if (camera != null) {
            c(camera);
        }
    }
}
