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
import com.twitter.util.e;
import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.android.util.l;
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
import java.util.Set;
import android.content.Context;
import com.twitter.library.media.model.ImageFile;
import android.hardware.Camera;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

class j implements u
{
    final /* synthetic */ CameraFragment a;
    
    private j(final CameraFragment a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.a.isAdded()) {
            final FragmentActivity activity = this.a.getActivity();
            Toast.makeText(activity.getApplicationContext(), (CharSequence)this.a.getString(2131297364), 0).show();
            activity.setResult(0);
            activity.finish();
        }
    }
    
    @Override
    public void a(final Camera camera) {
        this.a.h.setVisibility(8);
        this.a.a(true);
        this.a.f.a.a();
        if (this.a.z != null) {
            this.a.z.c();
        }
        if (this.a.q && this.a.m == 1) {
            final VideoTooltipManager j = this.a.j();
            if (j != null) {
                j.a(VideoTooltipManager$CameraTooltip.f);
            }
        }
    }
    
    @Override
    public void a(final ImageFile imageFile) {
        if (this.a.isAdded()) {
            this.a.x.a(imageFile);
        }
    }
    
    @Override
    public void a(final CharSequence charSequence, final CharSequence charSequence2) {
        Toast.makeText((Context)this.a.getActivity(), (CharSequence)this.a.getString(2131297943), 0).show();
        this.a.u.a(charSequence);
    }
    
    @Override
    public void a(final Set set, final CharSequence charSequence) {
        this.a.u.a(set, charSequence);
    }
    
    @Override
    public void b() {
        this.a.g.clearAnimation();
        this.a.g.startAnimation(this.a.t);
    }
    
    @Override
    public void c() {
        Toast.makeText((Context)this.a.getActivity(), (CharSequence)this.a.getString(2131297932), 0).show();
        this.a.e.setVisibility(8);
        this.a.a(true);
    }
}
