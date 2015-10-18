// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.annotation.TargetApi;
import android.hardware.Camera$CameraInfo;
import android.os.Build$VERSION;
import android.media.AudioManager;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.support.v4.view.ViewCompat;
import android.view.View$MeasureSpec;
import android.app.AlertDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.widget.Toast;
import com.twitter.android.media.widget.VideoSegmentListItemView;
import com.twitter.util.d;
import com.twitter.library.media.model.SegmentedVideoFile;
import java.util.Iterator;
import android.net.Uri;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.WindowManager;
import android.graphics.Point;
import android.content.Intent;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.util.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeSection;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeSectionSegmentedVideo;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.android.media.widget.CameraToolbar;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import com.twitter.android.media.widget.VideoSegmentListView;
import com.twitter.library.media.widget.VideoDurationView;
import com.twitter.android.media.widget.CameraShutterBar;
import com.twitter.android.media.widget.VideoEditGarbageCanView;
import android.view.View;
import com.twitter.android.media.widget.CameraPreviewContainer;
import com.twitter.android.media.widget.VideoSegmentEditView;
import com.twitter.library.media.model.o;
import java.util.ArrayList;
import android.os.Handler;
import android.view.View$OnClickListener;
import java.io.File;
import com.twitter.android.media.widget.be;
import com.twitter.android.media.widget.bc;
import com.twitter.library.media.model.VideoFile;
import android.graphics.Rect;
import java.util.List;
import java.util.Collections;
import com.twitter.android.media.widget.bi;

class at extends bi
{
    final /* synthetic */ ag a;
    private int c;
    
    private at(final ag a) {
        this.a = a;
    }
    
    @Override
    public int a() {
        return this.a.p();
    }
    
    @Override
    protected int a(final int n) {
        if (n < this.a.M.size()) {
            if (n == this.a.Q) {
                return 2;
            }
            return 0;
        }
        else {
            if (this.a.L == 2) {
                return 4;
            }
            return 3;
        }
    }
    
    @Override
    protected void a(final int n, final int n2) {
        Collections.swap(this.a.M, n, n2);
        this.a.W = true;
    }
    
    @Override
    protected boolean a(final int n, final Rect rect) {
        final boolean b = this.a.q.getGarbageCanState() == 2;
        this.a.q.a();
        if (!this.a.q()) {
            this.a.b(true);
        }
        return b;
    }
    
    @Override
    protected boolean a(final Rect rect) {
        return this.a.q.getGarbageCanState() != 2;
    }
    
    @Override
    protected VideoFile b(final int n) {
        if (n < this.a.M.size()) {
            return this.a.M.get(n);
        }
        return null;
    }
    
    @Override
    protected void b(final Rect rect) {
        this.a.q.a(this.a.d.a(), rect);
    }
    
    @Override
    protected boolean c(final int n) {
        return n < this.a.M.size();
    }
    
    @Override
    protected boolean d(final int n) {
        if (this.a.q()) {
            final int size = this.a.M.size();
            if (size > 1 && n == size - 1) {
                this.b(n, 0);
                this.b(n - 1, 2);
                return false;
            }
        }
        return true;
    }
    
    @Override
    protected void e(final int n) {
        final VideoFile videoFile = this.a.M.remove(n);
        ag.a(this.a, videoFile.duration);
        this.a.w.setMax(this.a.I);
        this.a.J = true;
        this.a.W = true;
        this.a.a("twitter_camera::video:segment:delete", this.a.a(this.c, videoFile.duration));
        final int size = this.a.M.size();
        if (size == 0) {
            if (this.a.q()) {
                this.a.A();
            }
            this.a.y();
            this.a.r.setShutterButtonMode(0);
        }
        else if (this.a.q()) {
            final VideoTextureView a = this.a.a(Math.min(this.a.P, size - 1), 0);
            if (this.a.U) {
                a.b();
                this.a.r();
            }
            else {
                a.a();
            }
        }
        else {
            this.a.t.a(false);
        }
        this.a.u();
        if (this.a.q()) {
            this.a.d.b().setFlashEnabled(false);
        }
        this.a.v();
    }
    
    @Override
    protected void f(final int c) {
        this.a.s();
        if (this.a.q()) {
            this.a.P = c;
            if (this.a.Q == c) {
                this.a.z.c();
            }
            else {
                this.a.T = 0;
                this.a.a(c, 0).b();
            }
        }
        else {
            this.a.t.a(true);
        }
        this.b(this.a.Q, 1);
        this.c = c;
        this.a.Q = -1;
        this.a.b(false);
    }
    
    @Override
    protected void g(final int n) {
        if (n != this.c) {
            this.a.a("twitter_camera::video:segment:change", this.a.a(n, this.a.M.get(n).duration).b(this.c));
        }
        if (!this.a.q()) {
            this.a.t.a(false);
            return;
        }
        final VideoTextureView a = this.a.a(n, this.a.T);
        if (this.a.U) {
            this.a.r();
            return;
        }
        a.a();
    }
    
    public int getCount() {
        final int size = this.a.M.size();
        int n;
        if (this.a.L == 0) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n + size;
    }
}
