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
import android.hardware.Camera;
import android.content.Context;
import android.hardware.Camera$ShutterCallback;

public class m
{
    private static final Camera$ShutterCallback b;
    private static m c;
    int a;
    private final Context d;
    private final int e;
    private u f;
    private String g;
    private int h;
    private int i;
    private Camera j;
    private SurfaceTexture k;
    private boolean l;
    private int m;
    private MediaRecorder n;
    private boolean o;
    private boolean p;
    private Camera$Parameters q;
    private int r;
    private int s;
    private w t;
    private au u;
    private final Camera$PreviewCallback v;
    private final Camera$PictureCallback w;
    
    static {
        b = (Camera$ShutterCallback)new n();
    }
    
    private m(final Context context) {
        this.a = 0;
        this.m = 0;
        this.v = (Camera$PreviewCallback)new o(this);
        this.w = (Camera$PictureCallback)new p(this);
        this.d = context.getApplicationContext();
        this.e = Camera.getNumberOfCameras();
    }
    
    public static m a(final Context context) {
        if (m.c == null) {
            m.c = new m(context);
        }
        return m.c;
    }
    
    private void a(final Camera$PictureCallback camera$PictureCallback) {
        if (this.p() && this.m == 2) {
            try {
                this.m = 0;
                this.j.takePicture(com.twitter.android.media.camera.m.b, (Camera$PictureCallback)null, camera$PictureCallback);
                final Context d = this.d;
                final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(az.a(this.d).b().g());
                final String[] array = { "twitter_camera", "", "photo", null, null };
                String s;
                if (this.p) {
                    s = "front";
                }
                else {
                    s = "back";
                }
                array[3] = s;
                array[4] = "captured";
                ScribeService.a(d, twitterScribeLog.b(array));
            }
            catch (RuntimeException ex) {
                if (this.f != null) {
                    this.f.c();
                }
                this.h();
                ErrorReporter.a(ex);
            }
        }
    }
    
    private static void a(final MediaRecorder mediaRecorder) {
        if (mediaRecorder == null) {
            return;
        }
        AsyncTask.SERIAL_EXECUTOR.execute(new t(mediaRecorder));
    }
    
    private boolean a(final String focusMode) {
        if (this.q.getSupportedFocusModes().contains(focusMode)) {
            this.q.setFocusMode(focusMode);
            return this.y();
        }
        return false;
    }
    
    private static void c(final Camera camera) {
        AsyncTask.SERIAL_EXECUTOR.execute(new s(camera));
    }
    
    private void u() {
        if (this.q.getSupportedFlashModes() != null) {
            this.a((CharSequence)this.g);
        }
        this.g = "off";
    }
    
    private void v() {
        final List supportedFocusModes = this.q.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            String s;
            if (this.p && supportedFocusModes.contains("macro")) {
                s = "macro";
            }
            else if (this.o) {
                if (supportedFocusModes.contains("continuous-video")) {
                    s = "continuous-video";
                }
                else if (supportedFocusModes.contains("auto")) {
                    s = "auto";
                }
                else {
                    final boolean contains = supportedFocusModes.contains("fixed");
                    s = null;
                    if (contains) {
                        s = "fixed";
                    }
                }
            }
            else if (supportedFocusModes.contains("continuous-picture")) {
                s = "continuous-picture";
            }
            else {
                final boolean contains2 = supportedFocusModes.contains("auto");
                s = null;
                if (contains2) {
                    s = "auto";
                }
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                this.a(s);
            }
        }
    }
    
    private boolean w() {
        final String focusMode = this.q.getFocusMode();
        return focusMode.equals("continuous-picture") || focusMode.equals("continuous-video") || focusMode.equals("auto") || focusMode.equals("macro");
    }
    
    private void x() {
        if (com.twitter.android.util.l.c() || com.twitter.android.util.l.b()) {
            return;
        }
        this.q.setRecordingHint(this.o);
        this.y();
    }
    
    private boolean y() {
        synchronized (this.j) {
            try {
                this.j.setParameters(this.q);
                return true;
            }
            catch (RuntimeException ex) {
                this.q = this.j.getParameters();
                ErrorReporter.a(ex);
                return false;
            }
        }
    }
    
    public Camera$Size a() {
        if (this.q == null) {
            return null;
        }
        return this.q.getPreviewSize();
    }
    
    public void a(final int n) {
        AsyncTask.SERIAL_EXECUTOR.execute(new q(this, n));
    }
    
    public void a(final SurfaceTexture previewTexture) {
        if (this.j == null) {
            this.k = previewTexture;
        }
        else {
            this.k = previewTexture;
            try {
                this.j.setPreviewTexture(previewTexture);
                if (this.s > 0) {
                    this.c(this.s);
                }
                if (this.l) {
                    this.h();
                }
                if (this.f != null) {
                    this.f.a(this.j);
                    this.m();
                }
            }
            catch (IOException ex) {
                if (this.f != null) {
                    this.f.a();
                }
                ErrorReporter.a(ex);
            }
        }
    }
    
    void a(final Camera j) {
        boolean p = true;
        if (j == null) {
            if (this.f != null) {
                this.f.a();
            }
        }
        else {
            while (true) {
                while (true) {
                    try {
                        this.j = j;
                        this.q = j.getParameters();
                        if (this.e().facing == (p ? 1 : 0)) {
                            this.p = p;
                            this.v();
                            this.u();
                            this.x();
                            if (this.k == null) {
                                break;
                            }
                            j.setPreviewTexture(this.k);
                            if (this.s > 0) {
                                this.c(this.s);
                            }
                            if (this.l) {
                                this.h();
                            }
                            if (this.f != null) {
                                this.f.a(j);
                                this.m();
                                return;
                            }
                            break;
                        }
                    }
                    catch (IOException ex) {
                        this.g();
                        if (this.f != null) {
                            this.f.a();
                        }
                        ErrorReporter.a(ex);
                        return;
                    }
                    p = false;
                    continue;
                }
            }
        }
    }
    
    public void a(final Bundle bundle) {
        bundle.putString("flash_mode", this.g);
        bundle.putInt("camera_id", this.i);
    }
    
    public void a(final u f) {
        this.f = f;
    }
    
    public void a(final File file, final int n, final com.twitter.android.media.camera.az az) {
        com.twitter.util.d.a();
        if (!this.p() || (this.u != null && this.u.c())) {
            return;
        }
        if (this.n == null) {
            this.n = new MediaRecorder();
        }
        (this.u = new au(this.n, this.j, this.i, this.q, this.l(), file)).a(az);
        this.u.a(n);
    }
    
    public void a(final CharSequence charSequence) {
        if (this.q != null) {
            this.q.setFlashMode(charSequence.toString());
            if (!this.y() && this.f != null) {
                this.f.a("flash", charSequence);
            }
        }
    }
    
    public void a(final boolean o) {
        if (this.o != o) {
            this.o = o;
            this.g = "off";
            if (this.p()) {
                this.u();
                this.v();
                this.m();
            }
        }
    }
    
    public void b() {
        this.b(this.h);
    }
    
    public void b(final int i) {
        if (i == this.i && (this.j != null || this.t != null)) {
            return;
        }
        this.g();
        this.i = i;
        (this.t = new w(this, i)).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, (Object[])new Void[0]);
    }
    
    public void b(final SurfaceTexture surfaceTexture) {
        if (this.k != surfaceTexture) {
            return;
        }
        this.k = null;
        this.i();
        if (this.j == null) {
            return;
        }
        try {
            this.j.setPreviewTexture((SurfaceTexture)null);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
        }
    }
    
    public void b(final Bundle bundle) {
        int i = 0;
        if (bundle != null) {
            this.g = bundle.getString("flash_mode");
            this.h = bundle.getInt("camera_id", 0);
        }
        else {
            this.g = "off";
            this.h = 0;
            while (i < this.e) {
                if (this.e().facing == 0) {
                    this.h = i;
                    return;
                }
                ++i;
            }
        }
    }
    
    public void b(final u u) {
        if (this.f == u) {
            this.f = null;
        }
    }
    
    @TargetApi(17)
    public void b(final boolean b) {
        this.j.enableShutterSound(b);
    }
    
    public void c() {
        if (this.e < 2) {
            return;
        }
        this.b((1 + this.i) % this.e);
    }
    
    public void c(final int s) {
        int n = 1;
        this.s = s;
        if (this.q != null) {
            float n2;
            int min;
            if (com.twitter.android.util.l.a()) {
                final CamcorderProfile b = au.b(this.i);
                if (b == null) {
                    n2 = 0.5625f;
                    min = s;
                }
                else {
                    final int videoFrameWidth = b.videoFrameWidth;
                    final int videoFrameHeight = b.videoFrameHeight;
                    if (videoFrameWidth < videoFrameHeight) {
                        n2 = videoFrameWidth / videoFrameHeight;
                    }
                    else {
                        n2 = videoFrameHeight / videoFrameWidth;
                    }
                    min = Math.min(s, Math.min(videoFrameWidth, videoFrameHeight));
                }
            }
            else {
                n2 = 0.75f;
                min = s;
            }
            final Camera$Size a = com.twitter.android.util.l.a(this.q.getSupportedPreviewSizes(), min, n2);
            int n3;
            if (a != null && !this.q.getPreviewSize().equals((Object)a)) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            final Camera$Size a2 = com.twitter.android.util.l.a(this.q.getSupportedPictureSizes(), s, n2);
            if (a2 == null || this.q.getPictureSize().equals((Object)a2)) {
                n = 0;
            }
            if (n3 != 0 || n != 0) {
                boolean l = false;
                if (n3 != 0) {
                    l = this.l;
                    this.i();
                    this.q.setPreviewSize(a.width, a.height);
                    this.q.set("video-size", a.width + "x" + a.height);
                }
                if (n != 0) {
                    this.q.setPictureSize(a2.width, a2.height);
                }
                if (!this.y()) {
                    if (n3 != 0) {
                        this.q.setPreviewSize(a.width, a.height);
                    }
                    if (n != 0) {
                        this.q.setPictureSize(a2.width, a2.height);
                    }
                    this.y();
                }
                if (l) {
                    this.h();
                }
            }
        }
    }
    
    public int d() {
        return this.i;
    }
    
    public int d(final int n) {
        final Camera$CameraInfo e = this.e();
        if (e.facing == 1) {
            return com.twitter.android.util.l.a(-e.orientation - n);
        }
        return com.twitter.android.util.l.a(e.orientation - n);
    }
    
    public Camera$CameraInfo e() {
        final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
        Camera.getCameraInfo(this.i, camera$CameraInfo);
        return camera$CameraInfo;
    }
    
    public void e(final int r) {
        this.r = r;
    }
    
    public int f() {
        this.s();
        a(this.n);
        this.n = null;
        if (this.q != null) {
            this.g = this.q.getFlashMode();
        }
        this.g();
        return this.i;
    }
    
    public void g() {
        Label_0024: {
            if (this.t == null) {
                break Label_0024;
            }
            if (!this.t.cancel(false)) {
                this.t = null;
                break Label_0024;
            }
            return;
        }
        final Camera j = this.j;
        if (j != null) {
            this.j = null;
            this.q = null;
            this.t();
            this.i();
            c(j);
        }
    }
    
    public void h() {
        com.twitter.util.d.a();
        this.l = true;
        if (this.p() && this.m == 0) {
            this.m = 1;
            this.j.setOneShotPreviewCallback(this.v);
            this.j.startPreview();
        }
    }
    
    public void i() {
        com.twitter.util.d.a();
        this.l = false;
        if (this.p() && this.m != 0) {
            this.j.stopPreview();
        }
        this.m = 0;
    }
    
    public void j() {
        if (this.p()) {
            this.a(this.w);
        }
    }
    
    public boolean k() {
        return this.p;
    }
    
    public int l() {
        int n;
        if (com.twitter.android.util.l.d()) {
            n = com.twitter.android.util.l.a(-z.a(this.d));
        }
        else {
            n = this.r;
        }
        final Camera$CameraInfo e = this.e();
        final int n2 = n + e.orientation;
        int n3;
        if (e.facing == 1 && (n == 90 || n == 270)) {
            n3 = n2 + 180;
        }
        else {
            n3 = n2;
        }
        return com.twitter.android.util.l.a(n3);
    }
    
    public void m() {
        if (this.q == null || this.f == null) {
            return;
        }
        final List supportedFlashModes = this.q.getSupportedFlashModes();
        final HashSet<String> set = new HashSet<String>();
        if (supportedFlashModes != null) {
            if (this.o) {
                if (supportedFlashModes.contains("torch")) {
                    set.add("off");
                    set.add("torch");
                }
            }
            else if (!this.p) {
                supportedFlashModes.remove("torch");
                set.addAll((Collection<?>)supportedFlashModes);
            }
        }
        this.f.a(set, this.q.getFlashMode());
    }
    
    public String n() {
        if (this.q != null) {
            return this.q.getFlashMode();
        }
        return null;
    }
    
    public boolean o() {
        if (this.p() && this.m == 2 && this.a == 0 && this.w()) {
            this.a = 1;
            try {
                this.j.autoFocus((Camera$AutoFocusCallback)new r(this));
                return true;
            }
            catch (RuntimeException ex) {
                this.a = 0;
                this.v();
                ErrorReporter.a(ex);
            }
        }
        return false;
    }
    
    public boolean p() {
        return this.j != null && this.k != null;
    }
    
    public boolean q() {
        return this.u != null && this.u.c();
    }
    
    public int r() {
        if (this.u != null) {
            return this.u.d();
        }
        return 0;
    }
    
    public void s() {
        com.twitter.util.d.a();
        if (this.p() && this.u != null) {
            final au u = this.u;
            this.u = null;
            u.a();
        }
    }
    
    public void t() {
        com.twitter.util.d.a();
        final au u = this.u;
        if (u != null) {
            this.u = null;
            u.b();
        }
        a(this.n);
        this.n = null;
    }
}
