// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.net.Uri;
import android.view.View$OnTouchListener;
import com.twitter.android.media.widget.a;
import java.io.Serializable;
import android.view.LayoutInflater;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.content.res.Configuration;
import com.twitter.library.client.az;
import android.os.Bundle;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.util.e;
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
import android.view.View;
import com.twitter.android.media.widget.CameraShutterBar;
import android.view.ViewGroup;
import android.view.Display;
import com.twitter.library.media.util.r;
import android.support.v4.app.Fragment;
import android.view.ViewTreeObserver$OnPreDrawListener;

class h implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ CameraFragment a;
    
    h(final CameraFragment a) {
        this.a = a;
    }
    
    public boolean onPreDraw() {
        final int k = this.a.k();
        if (this.a.B != k) {
            final int n = k - this.a.B;
            this.a.B = k;
            if (this.a.z != null && (n == 180 || n == -180)) {
                this.a.a.a(k);
                this.a.m();
                this.a.c.requestLayout();
                return false;
            }
        }
        return true;
    }
}
