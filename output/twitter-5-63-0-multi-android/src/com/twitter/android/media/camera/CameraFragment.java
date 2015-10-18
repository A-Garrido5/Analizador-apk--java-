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

public class CameraFragment extends Fragment implements ab, c, r
{
    static final /* synthetic */ boolean i;
    private static final ac[][] j;
    private static final ac[][] k;
    private VideoTooltipManager A;
    private int B;
    private Display C;
    private z D;
    m a;
    i b;
    ViewGroup c;
    CameraShutterBar d;
    View e;
    CameraPreviewContainer f;
    View g;
    ProgressBar h;
    private final j l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Animation s;
    private Animation t;
    private CameraToolbar u;
    private Session v;
    private int w;
    private ad x;
    private ag y;
    private b z;
    
    static {
        i = !CameraFragment.class.desiredAssertionStatus();
        j = new ac[][] { { new ac(5, 2131886334), new ac(7, 2131886334) }, { new ac(0, 2131886346), new ac(5, 2131886334) }, { new ac(1, 2131886346), new ac(7, 2131886334) } };
        k = new ac[][] { { new ac(9), new ac(11) }, { new ac(11), new ac(10) }, { new ac(9), new ac(10) } };
    }
    
    public CameraFragment() {
        this.l = new j(this, null);
        this.w = -1;
    }
    
    private void a(final String s) {
        ScribeService.a((Context)this.getActivity(), new TwitterScribeLog(this.v.g()).b(new String[] { "twitter_camera::" + this.n() + ":" + s + ":click" }));
    }
    
    private void c(final int n) {
        if (this.a != null) {
            this.a.e(n);
        }
        final FragmentActivity activity = this.getActivity();
        this.o = com.twitter.android.media.camera.z.a((Context)activity, n);
        this.d.a(this.o);
        this.u.a(this.o);
        if (this.z != null) {
            this.z.b(this.o);
        }
        com.twitter.android.util.l.a(this.o, this.n(), this.v.g(), (Context)activity);
    }
    
    private String n() {
        if (this.z == null) {
            return "";
        }
        if (this.z == this.x) {
            return "photo";
        }
        return "video";
    }
    
    @Override
    public View a() {
        return (View)this.c;
    }
    
    @Override
    public void a(final int n) {
        this.n = n;
        if (!this.p) {
            this.c(n);
        }
    }
    
    void a(final int n, final int n2) {
        if (this.a.o()) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.g.getLayoutParams();
            viewGroup$MarginLayoutParams.leftMargin = n - viewGroup$MarginLayoutParams.width / 2;
            viewGroup$MarginLayoutParams.topMargin = n2 - viewGroup$MarginLayoutParams.height / 2;
            this.g.requestLayout();
            this.g.clearAnimation();
            this.g.setVisibility(0);
            this.g.startAnimation(this.s);
        }
    }
    
    void a(final int m, final boolean b) {
        this.d.a(m, b);
        if (this.z != null) {
            if (this.z.a == m) {
                return;
            }
            this.z.b();
        }
        if (m == 1) {
            this.z = this.x;
        }
        else if (m == 2) {
            this.z = this.y;
        }
        else {
            com.twitter.util.e.a(new RuntimeException());
        }
        this.z.a();
        this.m = m;
        this.m();
        if (b) {
            this.c.startAnimation((Animation)new x(this.c));
            return;
        }
        this.c.requestLayout();
    }
    
    public void a(final i b) {
        this.b = b;
    }
    
    @Override
    public void a(final MediaType mediaType, final MediaFile mediaFile) {
        if (this.b != null) {
            this.b.a(mediaType, mediaFile);
        }
    }
    
    @Override
    public void a(final boolean b) {
        this.u.setControlsEnabled(b);
        this.d.setEnabled(b);
    }
    
    @Override
    public CameraToolbar b() {
        if (!CameraFragment.i && this.u == null) {
            throw new AssertionError();
        }
        return this.u;
    }
    
    @Override
    public void b(final int n) {
        this.c(n);
        this.p = true;
    }
    
    @Override
    public void c() {
        if (this.p) {
            this.c(this.n);
        }
        this.p = false;
    }
    
    @Override
    public Session d() {
        return this.v;
    }
    
    @Override
    public void e() {
        if (this.z != null) {
            this.z.e();
        }
    }
    
    @Override
    public void f() {
        if (this.z != null) {
            this.z.f();
        }
    }
    
    @Override
    public int g() {
        return this.o;
    }
    
    @Override
    public void h() {
        if (this.z != null) {
            this.z.b();
            this.z = null;
        }
        if (this.b != null) {
            this.b.a();
        }
    }
    
    @Override
    public FragmentActivity i() {
        if (this.r) {
            return null;
        }
        return this.getActivity();
    }
    
    @Override
    public VideoTooltipManager j() {
        if (this.r) {
            return null;
        }
        return this.A;
    }
    
    int k() {
        return 90 * this.C.getRotation();
    }
    
    public boolean l() {
        return this.z != null && this.z.d();
    }
    
    void m() {
        int n = 1;
        if (this.getActivity().getResources().getConfiguration().orientation == n) {
            n = 0;
        }
        else if (this.k() >= 180) {
            n = 2;
        }
        ac.a((View)this.d, CameraFragment.k, n);
        ac.a((View)this.u, CameraFragment.j, n);
        if (this.z != null) {
            this.z.a(n);
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.v = az.a((Context)this.getActivity()).b();
        final Bundle arguments = this.getArguments();
        final FragmentActivity activity = this.getActivity();
        final Context applicationContext = activity.getApplicationContext();
        (this.x = new ad(applicationContext, this.a, this)).a(arguments, bundle);
        (this.y = new ag(applicationContext, this.a, this)).a(arguments, bundle);
        this.A = new VideoTooltipManager(activity.getApplicationContext(), activity.getSupportFragmentManager());
        this.C = activity.getWindowManager().getDefaultDisplay();
        this.B = this.k();
        if (!com.twitter.android.util.l.d()) {
            (this.D = new z(applicationContext)).a(this);
            this.c(this.B);
        }
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        this.B = this.k();
        this.a.a(this.B);
        this.m();
        this.c.requestLayout();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        boolean b = true;
        super.onCreate(bundle);
        this.setRetainInstance(b);
        if (bundle != null) {
            this.q = bundle.getBoolean("camera_video_mode_available");
            this.m = bundle.getInt("camera_mode");
        }
        else {
            if (!com.twitter.android.util.l.a() || !this.getArguments().getBoolean("allow_video")) {
                b = false;
            }
            this.q = b;
        }
        final FragmentActivity activity = this.getActivity();
        this.s = AnimationUtils.loadAnimation((Context)activity, 2131034123);
        (this.t = AnimationUtils.loadAnimation((Context)activity, 2131034124)).setAnimationListener((Animation$AnimationListener)new d(this));
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return (View)(this.c = (ViewGroup)layoutInflater.inflate(2130968622, viewGroup, false));
    }
    
    @Override
    public void onDestroy() {
        this.r = true;
        this.b = null;
        this.a.b(this.l);
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    
    @Override
    public void onPause() {
        if (this.D != null) {
            this.D.b();
        }
        if (this.z != null) {
            this.z.b();
            this.z = null;
        }
        if (this.a != null) {
            this.w = this.a.f();
        }
        super.onPause();
    }
    
    @Override
    public void onResume() {
        this.a(this.m, false);
        if (this.D != null) {
            this.D.a();
        }
        if (this.a != null && this.w >= 0) {
            this.a.b(this.w);
        }
        super.onResume();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int n;
        if (this.z != null) {
            n = this.z.a;
        }
        else {
            n = this.m;
        }
        bundle.putSerializable("camera_mode", (Serializable)n);
        bundle.putBoolean("camera_video_mode_available", this.q);
        this.x.a(bundle);
        this.y.a(bundle);
        this.a.a(bundle);
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.e = view.findViewById(2131886343);
        (this.u = (CameraToolbar)view.findViewById(2131886342)).setOnCameraToolbarClickListener(new k(this, null));
        (this.d = (CameraShutterBar)view.findViewById(2131886346)).setCameraShutterBarListener(new com.twitter.android.media.camera.e(this));
        this.d.a.setListener(new f(this));
        this.h = (ProgressBar)view.findViewById(2131886348);
        this.f = (CameraPreviewContainer)view.findViewById(2131886334);
        this.g = this.f.findViewById(2131886336);
        this.f.setOnTouchListener((View$OnTouchListener)new g(this));
        final Bundle arguments = this.getArguments();
        while (true) {
            Label_0352: {
                if (bundle != null) {
                    break Label_0352;
                }
                if (!this.q) {
                    this.m = 1;
                    break Label_0352;
                }
                final Uri uri = (Uri)arguments.getParcelable("seg_video_uri");
                int int1;
                if (uri != null) {
                    int1 = 2;
                }
                else if (arguments.containsKey("start_mode")) {
                    int1 = arguments.getInt("start_mode");
                }
                else {
                    int1 = 1;
                }
                this.m = int1;
                this.d.setVideoModeAvailable(this.q);
                this.a(false);
                (this.a = com.twitter.android.media.camera.m.a((Context)this.getActivity())).a(this.l);
                this.a.b(bundle);
                this.h.setVisibility(0);
                this.a.a(this.m == 2);
                this.w = -1;
                if (uri != null) {
                    new com.twitter.android.media.camera.l(this, uri).execute((Object[])new Void[0]);
                }
                else {
                    this.a.b();
                }
                if (com.twitter.android.util.l.d()) {
                    view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new com.twitter.android.media.camera.h(this));
                    return;
                }
                this.getActivity().setRequestedOrientation(1);
                return;
            }
            final Uri uri = null;
            continue;
        }
    }
}
