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
import android.hardware.Camera$Parameters;
import android.media.MediaRecorder;
import android.graphics.SurfaceTexture;
import android.content.Context;
import android.hardware.Camera$ShutterCallback;
import com.twitter.util.d;
import android.hardware.Camera;
import android.hardware.Camera$PreviewCallback;

class o implements Camera$PreviewCallback
{
    final /* synthetic */ m a;
    
    o(final m a) {
        this.a = a;
    }
    
    public void onPreviewFrame(final byte[] array, final Camera camera) {
        d.a();
        this.a.m = 2;
    }
}
