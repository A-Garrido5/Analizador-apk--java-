// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import com.twitter.library.media.model.VideoFile;
import java.io.IOException;
import android.os.SystemClock;
import android.media.MediaRecorder$OnInfoListener;
import android.os.Environment;
import android.os.AsyncTask;
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

class au
{
    private final MediaRecorder a;
    private final Camera b;
    private final int c;
    private final Camera$Parameters d;
    private final int e;
    private final File f;
    private az g;
    private volatile long h;
    private ax i;
    private boolean j;
    
    public au(final MediaRecorder a, final Camera b, final int c, final Camera$Parameters d, final int e, final File f) {
        this.h = -1L;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static CamcorderProfile b(final int n) {
        if (CamcorderProfile.hasProfile(n, 5)) {
            return CamcorderProfile.get(n, 5);
        }
        if (CamcorderProfile.hasProfile(n, 4)) {
            return CamcorderProfile.get(n, 4);
        }
        return CamcorderProfile.get(n, 1);
    }
    
    private void f() {
        final CamcorderProfile b = b(this.c);
    Label_0178:
        while (true) {
            try {
                this.a.setVideoSource(1);
                this.a.setAudioSource(5);
                this.a.setOrientationHint(this.e);
                this.a.setOutputFormat(2);
                this.a.setVideoFrameRate(Math.min(b.videoFrameRate, 38));
                this.a.setVideoSize(b.videoFrameWidth, b.videoFrameHeight);
                this.a.setVideoEncodingBitRate(3700000);
                this.a.setVideoEncoder(2);
                if (b.quality < 1000 || b.quality > 1007) {
                    this.a.setAudioEncodingBitRate(b.audioBitRate);
                    this.a.setAudioChannels(b.audioChannels);
                    this.a.setAudioSamplingRate(b.audioSampleRate);
                    this.a.setAudioEncoder(b.audioCodec);
                }
                if (this.d == null) {
                    return;
                }
                break Label_0178;
            }
            catch (RuntimeException ex) {
                ErrorReporter.a(ex);
                continue;
            }
            continue;
        }
        final Camera$Size previewSize = this.d.getPreviewSize();
        Camera$Size camera$Size = null;
        final List supportedVideoSizes = this.d.getSupportedVideoSizes();
        if (supportedVideoSizes == null) {
            camera$Size = previewSize;
        }
        else {
            final int n = b.videoFrameWidth * b.videoFrameHeight;
            int n2 = Integer.MAX_VALUE;
        Label_0332_Outer:
            for (final Camera$Size camera$Size2 : supportedVideoSizes) {
                while (true) {
                    Label_0388: {
                        if (camera$Size2.width * previewSize.height != camera$Size2.height * previewSize.width) {
                            break Label_0388;
                        }
                        final int abs = Math.abs(camera$Size2.width * camera$Size2.height - n);
                        if (abs >= n2) {
                            break Label_0388;
                        }
                        final Camera$Size camera$Size3 = camera$Size2;
                        final int n3 = abs;
                        n2 = n3;
                        camera$Size = camera$Size3;
                        continue Label_0332_Outer;
                    }
                    final int n3 = n2;
                    final Camera$Size camera$Size3 = camera$Size;
                    continue;
                }
            }
        }
        if (camera$Size != null) {
            this.a.setVideoSize(camera$Size.width, camera$Size.height);
            return;
        }
        ErrorReporter.a(new Exception("cannot find supported video recording size for preview size " + previewSize.width + "x" + previewSize.height));
    }
    
    public void a() {
        com.twitter.util.d.a();
        final ax i = this.i;
        if (i != null) {
            this.i = null;
            if (!i.cancel(false)) {
                new ay(this, false).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, (Object[])new Void[0]);
            }
        }
    }
    
    public void a(final int n) {
        com.twitter.util.d.a();
        if (!this.j) {
            this.j = true;
            (this.i = new ax(this, n)).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, (Object[])new Void[0]);
        }
    }
    
    public void a(final az g) {
        this.g = g;
    }
    
    public void b() {
        com.twitter.util.d.a();
        final ax i = this.i;
        if (i != null) {
            this.i = null;
            if (!i.cancel(false)) {
                while (true) {
                    try {
                        this.a.stop();
                        new aw(this, null).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, (Object[])new Void[0]);
                    }
                    catch (Exception ex) {
                        ErrorReporter.a(ex);
                        this.f.delete();
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public boolean c() {
        return this.i != null;
    }
    
    boolean c(final int maxDuration) {
        com.twitter.util.d.c();
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return false;
        }
        this.a.reset();
        this.a.setOnInfoListener((MediaRecorder$OnInfoListener)new av(this));
        this.a.setOutputFile(this.f.getAbsolutePath());
        Camera b;
        try {
            this.a.setMaxDuration(maxDuration);
            b = this.b;
            // monitorenter(b)
            final au au = this;
            final Camera camera = au.b;
            camera.unlock();
            final au au2 = this;
            final MediaRecorder mediaRecorder = au2.a;
            final au au3 = this;
            final Camera camera2 = au3.b;
            mediaRecorder.setCamera(camera2);
            final au au4 = this;
            au4.f();
            final au au5 = this;
            final MediaRecorder mediaRecorder2 = au5.a;
            mediaRecorder2.prepare();
            final au au6 = this;
            final MediaRecorder mediaRecorder3 = au6.a;
            mediaRecorder3.start();
            final Camera camera3 = b;
            // monitorexit(camera3)
            final au au7 = this;
            final long n = SystemClock.elapsedRealtime();
            au7.h = n;
            return true;
        }
        catch (RuntimeException ex) {
            this.a.reset();
            return false;
        }
        try {
            final au au = this;
            final Camera camera = au.b;
            camera.unlock();
            final au au2 = this;
            final MediaRecorder mediaRecorder = au2.a;
            final au au3 = this;
            final Camera camera2 = au3.b;
            mediaRecorder.setCamera(camera2);
            final au au4 = this;
            au4.f();
            final au au5 = this;
            final MediaRecorder mediaRecorder2 = au5.a;
            mediaRecorder2.prepare();
            final au au6 = this;
            final MediaRecorder mediaRecorder3 = au6.a;
            mediaRecorder3.start();
            final Camera camera3 = b;
            // monitorexit(camera3)
            final au au7 = this;
            final long n = SystemClock.elapsedRealtime();
            au7.h = n;
            return true;
        }
        catch (RuntimeException ex2) {}
        catch (IOException ex3) {}
    }
    
    public int d() {
        if (this.h == -1L) {
            return 0;
        }
        return (int)(SystemClock.elapsedRealtime() - this.h);
    }
    
    VideoFile e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        com/twitter/android/media/camera/au.a:Landroid/media/MediaRecorder;
        //     7: invokevirtual   android/media/MediaRecorder.stop:()V
        //    10: aload_0        
        //    11: getfield        com/twitter/android/media/camera/au.f:Ljava/io/File;
        //    14: invokestatic    com/twitter/library/media/model/VideoFile.a:(Ljava/io/File;)Lcom/twitter/library/media/model/VideoFile;
        //    17: astore          5
        //    19: aload           5
        //    21: astore_3       
        //    22: aload_0        
        //    23: getfield        com/twitter/android/media/camera/au.a:Landroid/media/MediaRecorder;
        //    26: invokevirtual   android/media/MediaRecorder.reset:()V
        //    29: aload_0        
        //    30: getfield        com/twitter/android/media/camera/au.b:Landroid/hardware/Camera;
        //    33: invokevirtual   android/hardware/Camera.lock:()V
        //    36: aload_0        
        //    37: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    40: putfield        com/twitter/android/media/camera/au.h:J
        //    43: aload_3        
        //    44: areturn        
        //    45: astore_1       
        //    46: aload_1        
        //    47: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    50: aload_0        
        //    51: getfield        com/twitter/android/media/camera/au.f:Ljava/io/File;
        //    54: invokevirtual   java/io/File.delete:()Z
        //    57: pop            
        //    58: aconst_null    
        //    59: astore_3       
        //    60: goto            22
        //    63: astore          4
        //    65: aload           4
        //    67: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    70: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      19     45     63     Ljava/lang/Exception;
        //  29     36     63     73     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
