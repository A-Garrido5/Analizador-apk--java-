// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnTouchListener;
import com.twitter.android.media.widget.a;
import com.twitter.android.media.widget.h;
import java.io.Serializable;
import android.view.LayoutInflater;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.content.res.Configuration;
import com.twitter.library.client.az;
import android.os.Bundle;
import com.twitter.util.e;
import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.Session;
import com.twitter.android.media.widget.CameraToolbar;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import com.twitter.android.media.widget.CameraPreviewContainer;
import android.view.View;
import com.twitter.android.media.widget.CameraShutterBar;
import android.view.ViewGroup;
import android.view.Display;
import com.twitter.library.media.util.r;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.SegmentedVideoFile;
import android.net.Uri;
import android.os.AsyncTask;

class l extends AsyncTask
{
    final /* synthetic */ CameraFragment a;
    private final Uri b;
    
    public l(final CameraFragment a, final Uri b) {
        this.a = a;
        this.b = b;
    }
    
    protected SegmentedVideoFile a(final Void... array) {
        final FragmentActivity activity = this.a.getActivity();
        if (activity == null) {
            return null;
        }
        SegmentedVideoFile segmentedVideoFile = (SegmentedVideoFile)MediaFile.a((Context)activity, this.b, MediaType.e);
        if (segmentedVideoFile == null || segmentedVideoFile.videoFiles.isEmpty()) {
            segmentedVideoFile = null;
        }
        return segmentedVideoFile;
    }
    
    protected void a(final SegmentedVideoFile segmentedVideoFile) {
        if (segmentedVideoFile != null) {
            this.a.y.a(segmentedVideoFile);
            this.a.a.b(segmentedVideoFile.cameraId);
            return;
        }
        this.a.a.b();
    }
}
