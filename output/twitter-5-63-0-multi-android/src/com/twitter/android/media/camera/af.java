// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.support.v4.app.FragmentActivity;
import android.hardware.Camera$Size;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import com.twitter.android.media.widget.CameraPreviewContainer;
import android.widget.Toast;
import com.twitter.library.media.model.MediaType;
import com.twitter.util.e;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.manager.j;
import com.twitter.android.util.l;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.library.media.model.ImageFile;
import android.view.View;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.media.widget.CameraSpeedBumpBar;
import com.twitter.library.media.util.r;
import com.twitter.android.media.widget.d;

class af implements d, r
{
    final CameraSpeedBumpBar a;
    final /* synthetic */ ad b;
    private final MediaImageView c;
    private final View d;
    private final View e;
    private ImageFile f;
    
    public af(final ad b, final View view) {
        this.b = b;
        this.c = (MediaImageView)view.findViewById(2131886339);
        this.d = view.findViewById(2131886338);
        this.e = view.findViewById(2131886346);
        (this.a = (CameraSpeedBumpBar)view.findViewById(2131886347)).setListener(this);
    }
    
    private void g() {
        this.f();
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
    }
    
    @Override
    public void a(final int n) {
        switch (n) {
            case 1: {
                this.b.a("retake");
                this.c();
            }
            case 2: {
                if (this.f != null) {
                    this.b.a("use");
                    new ae(this.b.b, this.f, this).execute((Object[])new Void[0]);
                    this.f = null;
                    return;
                }
                break;
            }
            case 3: {
                this.b.a("close");
                this.g();
                this.b.d.h();
            }
        }
    }
    
    public void a(final Bundle bundle) {
        if (this.f != null) {
            bundle.putParcelable("preview_image", (Parcelable)this.f);
        }
    }
    
    public void a(final Bundle bundle, final Bundle bundle2) {
        if (bundle2 != null && bundle2.containsKey("preview_image")) {
            this.f = (ImageFile)bundle2.getParcelable("preview_image");
        }
    }
    
    public void a(final ImageFile f) {
        this.f = f;
    }
    
    public boolean a() {
        return this.f != null;
    }
    
    public void b() {
        if (this.f != null) {
            this.d.setVisibility(0);
            this.e.setVisibility(4);
            this.b.f.a.setVisibility(8);
            this.b.g.setVisibility(8);
            this.b.d.b().b(true);
            this.c.setVisibility(0);
            this.a.setVisibility(0);
            if (!l.d()) {
                final int g = this.b.d.g();
                this.c.a(j.a(this.f).a(l.a(g)), false);
                this.a.a(g);
                return;
            }
            this.c.a(j.a(this.f), false);
        }
    }
    
    public void b(final int n) {
        com.twitter.util.e.b(!l.d());
        l.a(n, "speed_bump", this.b.d.d().g(), this.b.b.getApplicationContext());
        if (this.f != null) {
            this.c.a(j.a(this.f).a(n), false);
        }
        this.a.a(n);
    }
    
    void b(final ImageFile imageFile) {
        this.b.d.a(MediaType.b, imageFile);
    }
    
    public void c() {
        this.g();
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.a.setVisibility(8);
        this.e.setVisibility(0);
        this.b.f.a.setVisibility(0);
        this.b.d.b().a(true);
        this.b.g.setVisibility(0);
        this.b.d.a(true);
        this.b.c.h();
    }
    
    void d() {
        Toast.makeText(this.b.b.getApplicationContext(), (CharSequence)this.b.b.getString(2131297598), 0).show();
        this.b.d.h();
    }
    
    @Override
    public void e() {
        this.c.e();
    }
    
    @Override
    public void f() {
        this.c.f();
    }
}
