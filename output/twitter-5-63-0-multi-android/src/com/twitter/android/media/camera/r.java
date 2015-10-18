// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

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
import com.twitter.android.util.l;
import java.util.List;
import android.text.TextUtils;
import android.os.AsyncTask;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$PreviewCallback;
import android.hardware.Camera$Parameters;
import android.media.MediaRecorder;
import android.graphics.SurfaceTexture;
import android.content.Context;
import android.hardware.Camera$ShutterCallback;
import android.hardware.Camera;
import android.hardware.Camera$AutoFocusCallback;

class r implements Camera$AutoFocusCallback
{
    final /* synthetic */ m a;
    
    r(final m a) {
        this.a = a;
    }
    
    public void onAutoFocus(final boolean b, final Camera camera) {
        if (!this.a.p() || this.a.m != 2) {
            return;
        }
        final String focusMode = this.a.q.getFocusMode();
        if (focusMode.equals("continuous-picture") || focusMode.equals("continuous-video")) {
            if (!b && this.a.a("auto")) {
                this.a.a = 0;
                this.a.o();
            }
            else {
                this.a.j.cancelAutoFocus();
                if (this.a.f != null) {
                    this.a.f.b();
                }
            }
        }
        else {
            if (this.a.f != null) {
                this.a.f.b();
            }
            this.a.v();
        }
        this.a.a = 0;
    }
}
