// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import com.twitter.library.media.model.ImageFile;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.hardware.Camera$Size;
import com.twitter.android.util.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import android.view.View;
import com.twitter.android.media.widget.CameraPreviewContainer;

public class ad extends b
{
    private static final ac[][] e;
    private final CameraPreviewContainer f;
    private final View g;
    private final af h;
    
    static {
        e = new ac[][] { { new ac(9), new ac(11) }, { new ac(0, 2131886346) }, { new ac(1, 2131886346) } };
    }
    
    ad(final Context context, final m m, final c c) {
        super(context, m, c, 1);
        final View a = c.a();
        this.f = (CameraPreviewContainer)a.findViewById(2131886334);
        this.g = a.findViewById(2131886335);
        this.h = new af(this, a);
    }
    
    private void a(final String s) {
        ScribeService.a(this.b, new TwitterScribeLog(this.d.d().g()).b("twitter_camera", "", "speed_bump", s, "click"));
    }
    
    private float c(final int n) {
        if (l.a()) {
            if (n != 0) {
                return 1.3333334f;
            }
        }
        else {
            final Camera$Size a = this.c.a();
            if (a == null) {
                if (n != 0) {
                    return 1.3333334f;
                }
            }
            else {
                final float n2 = Math.max(a.width, a.height);
                final float n3 = Math.min(a.width, a.height);
                if (n == 0) {
                    return n3 / n2;
                }
                return n2 / n3;
            }
        }
        return 0.75f;
    }
    
    @Override
    public void a() {
        this.c.a(false);
        if (this.h.a()) {
            this.h.b();
        }
        else {
            this.g.setVisibility(0);
        }
        final FragmentActivity i = this.d.i();
        if (i != null) {
            int requestedOrientation;
            if (l.d()) {
                requestedOrientation = 4;
            }
            else {
                requestedOrientation = 1;
            }
            i.setRequestedOrientation(requestedOrientation);
        }
    }
    
    @Override
    public void a(final int displayOrientation) {
        this.f.setDisplayOrientation(displayOrientation);
        ac.a((View)this.f, ad.e, displayOrientation);
        this.f.a(this.c(displayOrientation), false);
    }
    
    public void a(final Bundle bundle) {
        this.h.a(bundle);
    }
    
    public void a(final Bundle bundle, final Bundle bundle2) {
        this.h.a(bundle, bundle2);
    }
    
    public void a(final ImageFile imageFile) {
        this.h.a(imageFile);
        this.h.b();
    }
    
    @Override
    public boolean a(final View view, final MotionEvent motionEvent) {
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            default: {
                return false;
            }
            case 0: {
                return true;
            }
            case 1: {
                if (l.a(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                    ScribeService.a(this.b, new TwitterScribeLog(this.d.d().g()).b(new String[] { "twitter_camera::photo:shutter:click" }));
                    this.d.a(false);
                    this.c.j();
                    return true;
                }
                return false;
            }
        }
    }
    
    @Override
    public void b() {
        this.f.a.setVisibility(0);
        this.g.setVisibility(8);
    }
    
    @Override
    public void b(final int n) {
        if (this.h.a()) {
            this.h.b(n);
        }
    }
    
    @Override
    public void c() {
        if (!this.h.a()) {
            this.c.h();
        }
    }
    
    @Override
    public boolean d() {
        if (this.h.a()) {
            this.h.c();
            return true;
        }
        return false;
    }
    
    @Override
    public void e() {
        this.h.e();
    }
    
    @Override
    public void f() {
        this.h.f();
    }
}
