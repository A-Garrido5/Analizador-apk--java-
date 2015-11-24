// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.ViewTreeObserver$OnPreDrawListener;
import android.net.Uri;
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
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.util.l;
import com.twitter.library.scribe.ScribeLog;
import android.content.Context;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.Session;
import com.twitter.android.media.widget.CameraToolbar;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import com.twitter.android.media.widget.CameraPreviewContainer;
import com.twitter.android.media.widget.CameraShutterBar;
import android.view.ViewGroup;
import android.view.Display;
import com.twitter.library.media.util.r;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.android.media.widget.b;

class e implements b
{
    final /* synthetic */ CameraFragment a;
    
    e(final CameraFragment a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final View view, final MotionEvent motionEvent) {
        return this.a.z != null && this.a.z.a(view, motionEvent);
    }
}
