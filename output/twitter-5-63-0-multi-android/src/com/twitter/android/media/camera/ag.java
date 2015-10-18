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
import com.twitter.android.media.widget.bi;
import com.twitter.library.media.model.VideoFile;
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

public class ag extends b implements az, bb, bc, be
{
    static final /* synthetic */ boolean e;
    private static final int[] f;
    private static final ac[][] g;
    private static final ac[][] h;
    private static final ac[][] i;
    private static final ac[][] j;
    private static final ac[][] k;
    private static int l;
    private static int m;
    private VideoTextureView A;
    private int B;
    private File C;
    private final Runnable D;
    private final Runnable E;
    private final View$OnClickListener F;
    private final Handler G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private ArrayList M;
    private boolean N;
    private o O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private int ae;
    private final VideoSegmentEditView n;
    private final CameraPreviewContainer o;
    private final View p;
    private final VideoEditGarbageCanView q;
    private final CameraShutterBar r;
    private final VideoDurationView s;
    private final VideoSegmentListView t;
    private final View u;
    private final at v;
    private final ProgressBar w;
    private final Animation x;
    private final Animation y;
    private VideoTextureView z;
    
    static {
        e = !ag.class.desiredAssertionStatus();
        f = new int[] { 2131558994, 2131558993, 2131558992 };
        g = new ac[][] { { new ac(9), new ac(11) }, { new ac(9) }, { new ac(11) } };
        h = new ac[][] { { new ac(9), new ac(11) }, { new ac(9), new ac(0, 2131886346) }, { new ac(11), new ac(1, 2131886346) } };
        i = new ac[][] { { new ac(3, 2131886345), new ac(9), new ac(11) }, { new ac(2, 2131886345), new ac(9), new ac(0, 2131886346) }, { new ac(2, 2131886345), new ac(11), new ac(1, 2131886346) } };
        j = new ac[][] { { new ac(5, 2131886334) }, { new ac(5, 2131886334) }, { new ac(1, 2131886346) } };
        k = new ac[][] { { new ac(3, 2131886334), new ac(9), new ac(11) }, { new ac(9), new ac(0, 2131886346), new ac(12) }, { new ac(11), new ac(1, 2131886346), new ac(12) } };
    }
    
    ag(final Context context, final m m, final c c) {
        super(context, m, c, 2);
        this.D = new ah(this);
        this.E = new ak(this);
        this.F = (View$OnClickListener)new al(this);
        this.G = new Handler();
        this.L = 0;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.Z = 2;
        final CameraToolbar b = this.d.b();
        this.v = new at(this, null);
        final View a = c.a();
        this.n = (VideoSegmentEditView)a.findViewById(2131886333);
        this.o = (CameraPreviewContainer)a.findViewById(2131886334);
        this.p = this.n.findViewById(2131886340);
        this.q = (VideoEditGarbageCanView)this.o.findViewById(2131886337);
        this.t = (VideoSegmentListView)a.findViewById(16908298);
        this.u = a.findViewById(2131886344);
        this.r = (CameraShutterBar)a.findViewById(2131886346);
        (this.s = (VideoDurationView)a.findViewById(2131886341)).setDuration(0);
        this.x = AnimationUtils.loadAnimation(this.b, 2131034121);
        this.y = AnimationUtils.loadAnimation(this.b, 2131034122);
        this.x.setAnimationListener((Animation$AnimationListener)new am(this));
        this.y.setAnimationListener((Animation$AnimationListener)new an(this));
        this.w = (ProgressBar)a.findViewById(2131886345);
        b.a.setOnClickListener((View$OnClickListener)new ao(this));
    }
    
    private void A() {
        if (this.u.getVisibility() == 0) {
            ((TransitionDrawable)this.u.getBackground()).reverseTransition(200);
        }
    }
    
    private ScribeSectionSegmentedVideo a(final int n, final long n2) {
        return new ScribeSectionSegmentedVideo().a(this.M.size(), n, n2);
    }
    
    private void a(final String s, final ScribeSectionSegmentedVideo scribeSectionSegmentedVideo) {
        this.a(s);
        ScribeService.a(this.b, new TwitterScribeLog(this.d.d().g()).a(scribeSectionSegmentedVideo.a(s)));
    }
    
    private void e(int duration) {
        if (this.c.q() && duration > 20000) {
            this.s.setBackgroundResource(2130837576);
        }
        else {
            this.s.setBackgroundResource(2130837553);
        }
        if (!this.J || duration > 30000) {
            duration = 30000;
        }
        this.s.setDuration(duration);
    }
    
    private void u() {
        boolean enabled = true;
        final CameraToolbar b = this.d.b();
        this.d.b().a(false);
        this.d.a(enabled);
        this.t.setEnabled(enabled);
        final boolean doneButtonEnabled = !this.M.isEmpty() && enabled;
        b.setFlipCameraButtonEnabled(!doneButtonEnabled && enabled);
        b.setFlashEnabled(!this.q() && this.c.n() != null && enabled);
        b.setDoneButtonEnabled(doneButtonEnabled);
        this.r.a(!doneButtonEnabled && enabled);
        this.e(this.I);
        if (!doneButtonEnabled || this.q()) {
            enabled = false;
        }
        this.b(enabled);
        if (!this.J) {
            this.x();
            this.a(0, 0);
            if (this.d.j() != null) {
                this.d.j().a(VideoTooltipManager$CameraTooltip.d);
            }
            this.s();
            this.z.a();
        }
    }
    
    private void v() {
        final FragmentActivity i = this.d.i();
        if (i != null) {
            if (com.twitter.android.util.l.d()) {
                if (this.M.isEmpty()) {
                    if (this.L == 0) {
                        this.ac = 4;
                    }
                    else {
                        boolean b;
                        if (this.b.getResources().getConfiguration().orientation == 2) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (com.twitter.android.media.camera.z.a(this.b) < 180) {
                            int ac = 0;
                            if (!b) {
                                ac = 1;
                            }
                            this.ac = ac;
                        }
                        else {
                            int ac2;
                            if (b) {
                                ac2 = 8;
                            }
                            else {
                                ac2 = 9;
                            }
                            this.ac = ac2;
                        }
                    }
                }
            }
            else {
                this.ac = 1;
                this.d.b(0);
            }
            i.setRequestedOrientation(this.ac);
            if (this.O != null) {
                this.O.a(this.ac);
            }
        }
    }
    
    private VideoTextureView w() {
        final VideoTextureView videoTextureView = new VideoTextureView(this.b);
        videoTextureView.setPlaybackListener(this);
        videoTextureView.setOnClickListener(this.F);
        videoTextureView.setVisibility(4);
        this.o.addView((View)videoTextureView, 0);
        final ViewGroup$LayoutParams layoutParams = videoTextureView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        return videoTextureView;
    }
    
    private void x() {
        this.c.i();
        this.o.a.setVisibility(4);
        this.r.setShutterButtonMode(1);
        this.w.setMax(this.I);
        this.b(false);
        this.t.a(true);
        this.z();
        this.w.setVisibility(0);
        this.v.a(true);
        final Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra("command", "pause");
        this.b.sendBroadcast(intent);
        this.c.a((CharSequence)"off");
        final CameraToolbar b = this.d.b();
        b.setFlashEnabled(false);
        b.setFlipCameraButtonEnabled(false);
        this.U = false;
        this.z.setVisibility(0);
        this.z.e();
        this.A.setVisibility(0);
        this.A.f();
    }
    
    private void y() {
        boolean flashEnabled = true;
        this.z.d();
        this.z.setVisibility(4);
        this.A.d();
        this.A.setVisibility(4);
        this.w.setVisibility(4);
        this.Q = -1;
        this.o.a.setVisibility(0);
        this.p.setVisibility(8);
        this.c.h();
        this.b(this.H > 0 && flashEnabled);
        this.t.a(false);
        if (!this.M.isEmpty() && !this.ab) {
            this.A();
        }
        final CameraToolbar b = this.d.b();
        if (this.c.n() == null) {
            flashEnabled = false;
        }
        b.setFlashEnabled(flashEnabled);
        b.setFlipCameraButtonEnabled(this.M.isEmpty());
        this.v.a(false);
    }
    
    private void z() {
        if (this.u.getVisibility() == 0) {
            this.u.setVisibility(0);
            ((TransitionDrawable)this.u.getBackground()).startTransition(200);
        }
    }
    
    VideoTextureView a(final int q, final int t) {
        if (this.Q >= 0 && this.Q < this.M.size() && this.Q != q) {
            this.v.b(this.Q, 0);
        }
        this.Q = q;
        this.T = t;
        int i = 0;
        int s = 0;
        while (i < q) {
            s += this.M.get(i).duration;
            ++i;
        }
        this.S = s;
        this.w.setProgress(s + t);
        this.v.b(q, 2);
        this.v.i(q);
        final VideoFile videoFile = this.M.get(q);
        VideoTextureView z2;
        VideoTextureView a2;
        if (videoFile.a(this.A.getVideoFile())) {
            final VideoTextureView a = this.A;
            final VideoTextureView z = this.z;
            this.z = a;
            this.A = z;
            z2 = a;
            a2 = z;
        }
        else {
            z2 = this.z;
            a2 = this.A;
            z2.a(videoFile, t);
        }
        a2.d();
        final int n = q + 1;
        if (n < this.M.size()) {
            z2.a((VideoFile)this.M.get(n), a2);
        }
        else {
            z2.a(null, null);
        }
        z2.a(a2);
        return z2;
    }
    
    @Override
    public void a() {
        int shutterButtonMode = 1;
        this.c.a(shutterButtonMode != 0);
        this.v();
        this.ab = false;
        this.A = this.w();
        this.z = this.w();
        if (this.d.j() != null) {
            this.d.j().a(VideoTooltipManager$CameraTooltip.b);
        }
        this.q.setVisibility(0);
        this.q.b();
        this.t.setVisibility(0);
        this.w.setVisibility(4);
        this.n.setAdapter(this.v);
        this.n.setListItemClickListener(this);
        final CameraShutterBar r = this.r;
        if (this.R < 0) {
            shutterButtonMode = 0;
        }
        r.setShutterButtonMode(shutterButtonMode);
        this.u();
    }
    
    @Override
    public void a(final int n) {
        this.ad = true;
        this.ae = n;
        this.o.setDisplayOrientation(n);
        com.twitter.android.media.camera.ac.a((View)this.o, ag.g, n);
        com.twitter.android.media.camera.ac.a(this.p, ag.h, n);
        com.twitter.android.media.camera.ac.a((View)this.w, ag.k, n);
        com.twitter.android.media.camera.ac.a((View)this.t, ag.i, n);
        final Resources resources = this.b.getResources();
        com.twitter.android.media.camera.ac.a(this.s, ag.j, n).setMargins(resources.getDimensionPixelSize(2131558411), 0, 0, resources.getDimensionPixelSize(2131558410));
        this.t.setDividerWidth(resources.getDimensionPixelOffset(2131558408));
        if (n == 0) {
            this.o.a(1.0f, false);
            this.u.setVisibility(0);
            this.n.setPostLayoutListener(this);
            return;
        }
        this.u.setVisibility(8);
        final Point point = new Point();
        ((WindowManager)this.b.getSystemService("window")).getDefaultDisplay().getSize(point);
        this.o.a(point.x / point.y, false);
        this.n.setPostLayoutListener(null);
    }
    
    public void a(final Bundle bundle) {
        bundle.putParcelableArrayList("video_segments", this.M);
        bundle.putBoolean("editing_prior_session", this.N);
        bundle.putBoolean("editing_session_dirty", this.W);
        bundle.putInt("active_segment", this.R);
        bundle.putBoolean("paused", this.V);
        if (this.O != null) {
            final File c = this.O.c();
            if (c != null) {
                bundle.putString("session_directory", c.getAbsolutePath());
            }
        }
        bundle.putBoolean("can_add_segment", this.J);
        bundle.putInt("orientation", this.ac);
    }
    
    public void a(final Bundle bundle, final Bundle bundle2) {
        int i = 0;
        if (bundle2 != null) {
            final String string = bundle2.getString("session_directory");
            o o;
            if (string != null) {
                o = com.twitter.library.media.model.o.a(new File(string));
            }
            else {
                o = com.twitter.library.media.model.o.a();
            }
            this.O = o;
            this.M = bundle2.getParcelableArrayList("video_segments");
            this.N = bundle2.getBoolean("editing_prior_session");
            this.W = bundle2.getBoolean("editing_session_dirty");
            if (this.M == null) {
                this.M = new ArrayList();
            }
            else {
                final Iterator<VideoFile> iterator = (Iterator<VideoFile>)this.M.iterator();
                while (iterator.hasNext()) {
                    i += iterator.next().duration;
                }
            }
            this.J = bundle2.getBoolean("can_add_segment");
            this.ac = bundle2.getInt("orientation");
            this.O.a(this.ac);
            this.R = bundle2.getInt("active_segment");
            this.V = bundle2.getBoolean("paused");
        }
        else {
            this.O = com.twitter.library.media.model.o.a();
            this.M = new ArrayList();
            this.J = true;
            i = 0;
            if (bundle != null) {
                final boolean b = bundle.getParcelable("seg_video_uri") instanceof Uri;
                i = 0;
                if (b) {
                    this.R = 0;
                    i = 0;
                }
            }
        }
        this.I = i;
    }
    
    public void a(final SegmentedVideoFile segmentedVideoFile) {
        com.twitter.util.d.a();
        this.N = true;
        this.W = false;
        this.ac = segmentedVideoFile.screenOrientation;
        this.M.clear();
        this.I = 0;
        this.O = com.twitter.library.media.model.o.a(segmentedVideoFile);
        for (final VideoFile videoFile : segmentedVideoFile.videoFiles) {
            this.M.add(videoFile);
            this.I += videoFile.duration;
        }
        this.u();
        this.v();
    }
    
    @Override
    public void a(final VideoFile videoFile) {
        this.L = 0;
        this.m();
        if (videoFile.duration < 400 && this.B >= 400) {
            if (this.d.j() != null) {
                this.d.j().a(VideoTooltipManager$CameraTooltip.a);
            }
            videoFile.c();
            this.u();
            this.v.notifyDataSetChanged();
            this.a("twitter_camera::video:segment:deny", this.a(-1 + this.M.size(), (long)videoFile.duration));
        }
        else {
            this.I += videoFile.duration;
            this.B = 30000 - this.I;
            if (this.B >= 400) {
                if (this.d.j() != null) {
                    this.d.j().a(VideoTooltipManager$CameraTooltip.c);
                }
            }
            else {
                this.J = false;
            }
            this.M.add(videoFile);
            this.W = true;
            final VideoSegmentListItemView h = this.v.h(-1 + this.M.size());
            if (h != null) {
                h.setVideoFile(videoFile);
                h.setStatus(0);
                this.t.a();
            }
            else {
                this.v.notifyDataSetChanged();
            }
            this.u();
            this.a("twitter_camera::video:segment:create");
            final ScribeSectionSegmentedVideo a = this.a(-1 + this.M.size(), (long)videoFile.duration);
            final int ae = this.ae;
            int n = 0;
            if (ae != 0) {
                n = 1;
            }
            this.a("twitter_camera::video:segment:create", a.c(n).a("torch".equals(this.c.n())));
            if (!this.J) {
                this.a("twitter_camera::video:segment:limit_exceed", this.a(-1 + this.M.size(), (long)videoFile.duration));
            }
            if (com.twitter.android.util.l.b()) {
                this.c.t();
            }
            if (this.K && this.J && this.d.i() != null) {
                this.k();
            }
        }
    }
    
    void a(final String s) {
        ScribeService.a(this.b, new TwitterScribeLog(this.d.d().g()).b(new String[] { s }));
    }
    
    @Override
    public void a(final boolean b) {
        this.L = 0;
        this.v();
        this.m();
        final long n = this.c.r();
        if (!b && n > 100L && n < 400L) {
            if (this.d.j() != null) {
                this.d.j().a(VideoTooltipManager$CameraTooltip.a);
            }
            this.a("twitter_camera::video:segment:deny", this.a(-1 + this.M.size(), 0L));
        }
        else {
            final FragmentActivity i = this.d.i();
            if (i != null) {
                Toast.makeText((Context)i, 2131298112, 0).show();
            }
            this.a("twitter_camera::video:segment:failure", this.a(-1 + this.M.size(), 0L));
        }
        this.u();
        this.v.notifyDataSetChanged();
    }
    
    @Override
    public boolean a(final View view, final MotionEvent motionEvent) {
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0: {
                this.K = true;
                if (this.J && this.c.p() && !this.c.q() && !this.n.a()) {
                    if (this.O == null) {
                        this.O = com.twitter.library.media.model.o.a();
                        if (this.O == null) {
                            break;
                        }
                    }
                    this.B = 30000 - this.I;
                    if (this.B <= 0) {
                        this.J = false;
                        this.e(30000);
                        return false;
                    }
                    this.C = this.O.d();
                    this.a("twitter_camera::video:shutter:click");
                    final boolean q = this.q();
                    if (q) {
                        this.y();
                    }
                    this.r.setShutterButtonMode(0);
                    if (q) {
                        view.postDelayed(this.E, 200L);
                    }
                    else if (this.L == 0) {
                        this.k();
                    }
                }
                return true;
            }
            case 1:
            case 3: {
                this.K = false;
                view.removeCallbacks(this.E);
                if (this.L > 0) {
                    this.L = 3;
                    this.c.s();
                    this.r.setShutterButtonMode(0);
                    this.d.a(false);
                    this.d.b().a(true);
                    this.v.notifyDataSetChanged();
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void b() {
        this.n.setPostLayoutListener(null);
        this.n.setAdapter(null);
        this.L = 0;
        this.K = false;
        this.ab = true;
        this.R = this.Q;
        this.V = this.U;
        this.c.t();
        this.y();
        this.o.removeView((View)this.z);
        this.z = null;
        this.o.removeView((View)this.A);
        this.A = null;
        this.q.setVisibility(8);
        this.s.clearAnimation();
        this.s.setVisibility(8);
        this.s.removeCallbacks(this.D);
        this.X = false;
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        this.w.setVisibility(8);
        this.d.c();
    }
    
    void b(final boolean x) {
        if (this.X != x) {
            this.X = x;
            final VideoDurationView s = this.s;
            Animation animation;
            if (x) {
                animation = this.x;
            }
            else {
                animation = this.y;
            }
            s.startAnimation(animation);
        }
    }
    
    @Override
    public void c() {
        if (this.R < 0 || this.R >= this.M.size()) {
            this.y();
            return;
        }
        this.d.b().setFlashEnabled(false);
        this.x();
        final VideoTextureView a = this.a(this.R, 0);
        if (this.V) {
            a.b();
            this.p.setVisibility(0);
            return;
        }
        a.a();
        this.p.setVisibility(8);
    }
    
    @Override
    public void c(final int n) {
        if (n >= this.M.size() || this.c.q()) {
            return;
        }
        if (this.Q == n) {
            this.t();
            final StringBuilder append = new StringBuilder().append("twitter_camera::video:segment:");
            String s;
            if (this.U) {
                s = "pause";
            }
            else {
                s = "play";
            }
            this.a(append.append(s).toString(), this.a(this.Q, (long)this.M.get(this.Q).duration));
            return;
        }
        this.a("twitter_camera::video:segment:replay");
        this.x();
        this.a(n, 0).a();
        if (this.d.j() != null) {
            this.d.j().a(VideoTooltipManager$CameraTooltip.e);
        }
        this.s();
    }
    
    @Override
    public void d(final int t) {
        if (t >= this.T) {
            this.T = t;
            this.w.setProgress(t + this.S);
        }
    }
    
    @Override
    public boolean d() {
        boolean b;
        if (this.Y) {
            b = true;
        }
        else {
            if (this.M.isEmpty()) {
                final boolean n = this.N;
                b = false;
                if (!n) {
                    return b;
                }
            }
            if (this.N) {
                final boolean w = this.W;
                b = false;
                if (!w) {
                    return b;
                }
            }
            final ap ap = new ap(this);
            final FragmentActivity i = this.d.i();
            b = false;
            if (i != null) {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)i);
                int title;
                if (this.N) {
                    title = 2131296284;
                }
                else {
                    title = 2131296813;
                }
                final AlertDialog$Builder setTitle = alertDialog$Builder.setTitle(title);
                int message;
                if (this.N) {
                    message = 2131296811;
                }
                else {
                    message = 2131296812;
                }
                final AlertDialog create = setTitle.setMessage(message).setPositiveButton(2131296810, (DialogInterface$OnClickListener)ap).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null).create();
                create.setOnDismissListener((DialogInterface$OnDismissListener)new ar(this));
                this.Y = true;
                create.show();
                return true;
            }
        }
        return b;
    }
    
    @Override
    public void g() {
        if (this.t.getBottom() <= this.r.getTop()) {
            return;
        }
        final int n = this.t.getBottom() - this.r.getTop();
        final int n2 = n / 2;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.o.getHeight() - n, 1073741824);
        this.o.measure(measureSpec, measureSpec);
        this.o.layout(n2 + this.o.getLeft(), this.o.getTop(), this.o.getRight() - n2, this.o.getBottom() - n);
        this.w.layout(this.w.getLeft(), this.w.getTop() - n, this.w.getRight(), this.w.getBottom() - n);
        this.t.layout(this.t.getLeft(), this.t.getTop() - n, this.t.getRight(), this.t.getBottom() - n);
        this.u.layout(this.u.getLeft(), this.u.getTop() - n, this.u.getRight(), this.u.getBottom() - n);
    }
    
    @Override
    public void h() {
        if (this.Q >= 0 && this.Q < this.M.size()) {
            final int size = this.M.size();
            final int n = 1 + this.Q;
            if (n >= size) {
                this.Q = -1;
                this.w.setProgress(this.I);
                this.r();
                return;
            }
            this.a(n, 0).a();
        }
    }
    
    @Override
    public void i() {
        this.L = 2;
        this.v();
        final VideoSegmentListItemView h = this.v.h(this.M.size());
        if (h != null) {
            h.setStatus(4);
        }
        else {
            this.v.notifyDataSetChanged();
        }
        this.d.a(true);
        this.d.b().setControlsEnabled(false);
        this.d.b().b(true);
        ViewCompat.postOnAnimation(this.s, this.D);
    }
    
    @Override
    public void j() {
        this.L = 0;
        this.v();
        this.m();
        if (this.d.j() != null) {
            this.d.j().a(VideoTooltipManager$CameraTooltip.a);
        }
        this.s.removeCallbacks(this.D);
        this.u();
        this.v.notifyDataSetChanged();
    }
    
    void k() {
        int l = 1;
        this.L = l;
        this.v();
        this.v.notifyDataSetChanged();
        this.l();
        this.c.a(this.C, this.B, this);
        final ViewTreeObserver viewTreeObserver = this.t.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new as(this, viewTreeObserver));
        this.r.a(false);
        this.t.setEnabled(false);
        this.b(l != 0);
        this.d.b().b(l != 0);
        final ScribeSectionSegmentedVideo a = this.a(this.M.size(), 0L);
        int n;
        if (this.ae == 0) {
            n = 0;
        }
        else {
            n = l;
        }
        final ScribeSectionSegmentedVideo a2 = a.c(n).a("torch".equals(this.c.n()));
        if (!this.c.k()) {
            l = 0;
        }
        this.a("twitter_camera::video:segment:attempt", a2.d(l));
    }
    
    @TargetApi(17)
    void l() {
        this.G.removeCallbacksAndMessages((Object)null);
        if (!this.aa) {
            this.aa = true;
            final AudioManager audioManager = (AudioManager)this.b.getSystemService("audio");
            audioManager.setStreamSolo(1, true);
            this.Z = audioManager.getRingerMode();
            audioManager.setRingerMode(0);
            audioManager.setStreamMute(1, true);
            final Camera$CameraInfo e = this.c.e();
            if (Build$VERSION.SDK_INT >= 17 && e.canDisableShutterSound) {
                this.c.b(false);
            }
        }
    }
    
    void m() {
        if (!this.aa) {
            return;
        }
        this.G.removeCallbacksAndMessages((Object)null);
        this.G.postDelayed((Runnable)new ai(this), 1000L);
    }
    
    void n() {
        final int n = this.I + this.c.r();
        if (this.c.q()) {
            final int h = n / 1000;
            if (h != this.H) {
                this.H = h;
                this.e(n);
            }
            ViewCompat.postOnAnimation(this.s, this.D);
        }
    }
    
    void o() {
        if (this.M.isEmpty()) {
            return;
        }
        if (!ag.e && this.O == null) {
            throw new AssertionError();
        }
        final Iterator<VideoFile> iterator = this.M.iterator();
        while (iterator.hasNext()) {
            this.O.a(iterator.next());
        }
        this.d.a(MediaType.e, this.O.b(this.c.d()).b());
    }
    
    int p() {
        int i = 0;
        if (!this.ad) {
            return 0;
        }
        final Resources resources = this.n.getResources();
        if (this.ae == 0) {
            if (resources.getConfiguration().orientation != 1) {
                return 0;
            }
            if (ag.m > 0) {
                return ag.m;
            }
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131558409);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.t.getLayoutParams();
            final int min = Math.min(this.r.getTop() - this.w.getBottom() - viewGroup$MarginLayoutParams.topMargin - viewGroup$MarginLayoutParams.bottomMargin - dimensionPixelSize, (this.n.getWidth() - 2 * this.t.getDividerWidth()) / 3);
            final int[] f = ag.f;
            final int length = f.length;
            int dimensionPixelSize2 = 0;
            while (i < length) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(f[i]);
                if (dimensionPixelSize2 <= min) {
                    break;
                }
                ++i;
            }
            return ag.m = dimensionPixelSize2;
        }
        else {
            if (resources.getConfiguration().orientation != 2) {
                return 0;
            }
            if (ag.l <= 0) {
                ag.l = resources.getDimensionPixelSize(2131558992);
            }
            return ag.l;
        }
    }
    
    boolean q() {
        return this.o.a.getVisibility() != 0;
    }
    
    void r() {
        this.p.setVisibility(0);
        this.p.startAnimation(AnimationUtils.loadAnimation(this.b, 2131034132));
    }
    
    void s() {
        if (this.p.getVisibility() != 0) {
            return;
        }
        final Animation loadAnimation = AnimationUtils.loadAnimation(this.b, 2131034133);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new aj(this));
        this.p.startAnimation(loadAnimation);
    }
    
    void t() {
        if (this.U) {
            this.U = false;
            this.z.a();
            this.s();
            return;
        }
        this.U = true;
        this.z.c();
        this.r();
    }
}
