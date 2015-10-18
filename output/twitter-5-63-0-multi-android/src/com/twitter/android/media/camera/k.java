// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.ViewTreeObserver$OnPreDrawListener;
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
import com.twitter.library.scribe.ScribeLog;
import android.content.Context;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.media.widget.h;

class k implements h
{
    final /* synthetic */ CameraFragment a;
    
    private k(final CameraFragment a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.a("cancel");
        if (this.a.z == null || !this.a.z.d()) {
            this.a.h();
        }
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        ScribeService.a((Context)this.a.getActivity(), new TwitterScribeLog(this.a.v.g()).b(new String[] { "twitter_camera::" + this.a.n() + ":flash:" + (Object)charSequence }));
        this.a.a.a(charSequence);
    }
    
    @Override
    public void b() {
        this.a.a("flip_camera");
        this.a.a(false);
        this.a.g.clearAnimation();
        this.a.g.setVisibility(8);
        this.a.a.c();
    }
}
