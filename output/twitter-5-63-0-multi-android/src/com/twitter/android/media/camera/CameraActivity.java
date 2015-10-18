// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.media.CamcorderProfile;
import android.hardware.Camera$CameraInfo;
import android.hardware.Camera;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import com.twitter.android.bd;
import com.twitter.android.client.TwitterFragmentActivity;

public class CameraActivity extends TwitterFragmentActivity implements bd
{
    private CameraFragment a;
    
    private static Intent a(final Context context, final int n, final Uri uri, final boolean b) {
        return new Intent(context, (Class)CameraActivity.class).putExtra("start_mode", n).putExtra("segmented_video", (Parcelable)uri).putExtra("allow_video", b);
    }
    
    public static Intent a(final Context context, final int n, final boolean b) {
        return a(context, n, null, b);
    }
    
    public static Intent a(final Context context, final Uri uri) {
        return a(context, 2, uri, true);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968621);
        bn.a(false);
        bn.c(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.getWindow().addFlags(128);
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        if (bundle == null) {
            final Intent intent = this.getIntent();
            final Bundle arguments = new Bundle();
            arguments.putInt("start_mode", intent.getIntExtra("start_mode", 1));
            arguments.putParcelable("seg_video_uri", intent.getParcelableExtra("segmented_video"));
            arguments.putBoolean("allow_video", intent.getBooleanExtra("allow_video", true));
            (this.a = new CameraFragment()).setArguments(arguments);
            supportFragmentManager.beginTransaction().add(2131886332, this.a).commit();
        }
        else {
            this.a = (CameraFragment)supportFragmentManager.findFragmentById(2131886332);
        }
        this.a.a(new a(this));
    }
    
    @Override
    public String b() {
        final StringBuilder sb = new StringBuilder();
        for (int numberOfCameras = Camera.getNumberOfCameras(), i = 0; i < numberOfCameras; ++i) {
            sb.append("Camera Id=").append(i);
            final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
            Camera.getCameraInfo(i, camera$CameraInfo);
            sb.append("\n  orientation=").append(camera$CameraInfo.orientation);
            sb.append("\n  facing=").append(camera$CameraInfo.facing);
            final CamcorderProfile b = com.twitter.android.media.camera.au.b(i);
            if (b != null) {
                sb.append("\n  duration=").append(b.duration);
                sb.append("\n  quality=").append(b.quality);
                sb.append("\n  fileFormat=").append(b.fileFormat);
                sb.append("\n  videoCodec=").append(b.videoCodec);
                sb.append("\n  videoBitRate=").append(b.videoBitRate);
                sb.append("\n  videoFrameRate=").append(b.videoFrameRate);
                sb.append("\n  videoFrameWidth=").append(b.videoFrameWidth);
                sb.append("\n  videoFrameHeight=").append(b.videoFrameHeight);
                sb.append("\n  audioCodec=").append(b.audioCodec);
                sb.append("\n  audioBitRate=").append(b.audioBitRate);
                sb.append("\n  audioSampleRate=").append(b.audioSampleRate);
                sb.append("\n  audioChannels=").append(b.audioChannels);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
    
    @Override
    public void onBackPressed() {
        if (!this.a.l()) {
            this.setResult(0);
            this.finish();
        }
    }
}
