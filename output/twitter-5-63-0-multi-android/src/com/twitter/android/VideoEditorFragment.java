// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.media.camera.VideoTooltipManager$CameraTooltip;
import com.twitter.util.g;
import android.view.View$OnClickListener;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.EditableVideo;
import android.view.animation.Animation;
import com.twitter.android.widget.eq;
import android.view.animation.Animation$AnimationListener;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.android.media.camera.VideoTooltipManager;
import com.twitter.android.media.widget.VideoClipRangeSeekBar;
import android.view.View;
import com.twitter.android.widget.ProgressReportingVideoView;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.view.x;
import com.twitter.android.widget.ep;
import com.twitter.android.media.widget.aq;
import android.support.v4.app.Fragment;

public class VideoEditorFragment extends Fragment implements aq, ep
{
    private static final x[] a;
    private VideoFile b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private ProgressReportingVideoView j;
    private View k;
    private VideoClipRangeSeekBar l;
    private boolean m;
    private VideoTooltipManager n;
    
    static {
        a = new x[] { new zd(60000, 0.75f, 2.0f, 255), new x(30000, 0.375f, 2.0f, 255), new x(5000, 0.1875f, 1.0f, 128) };
    }
    
    public VideoEditorFragment() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.setRetainInstance(this.g = true);
    }
    
    private void b(final int n) {
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this.getActivity(), 2131034133);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new zg(this));
        this.k.startAnimation(loadAnimation);
        this.l.a(this.c, this.d, n);
        this.j.a(n, new zh(this));
    }
    
    private void g() {
        this.j.a();
        this.l.a(this.j.getCurrentPosition());
        this.f = true;
        this.k.setVisibility(0);
        this.k.startAnimation(AnimationUtils.loadAnimation((Context)this.getActivity(), 2131034132));
    }
    
    private void h() {
        int n;
        if (this.f) {
            n = this.j.getCurrentPosition();
        }
        else {
            n = this.c;
        }
        this.f = false;
        this.b(n);
    }
    
    @Override
    public void a() {
        this.j.a();
        this.f = false;
        this.k.setVisibility(8);
    }
    
    @Override
    public void a(final float n, final float n2, final boolean b) {
        if (!this.j.f()) {
            final int duration = this.b.duration;
            final int n3 = (int)(n * duration);
            final int n4 = (int)(n2 * duration);
            if (!b) {
                this.n.a((500 + (n4 - n3)) / 1000);
            }
            if (n3 == this.c) {
                if (Math.abs(n4 - this.j.getCurrentPosition()) > 100) {
                    this.j.a(n4, null);
                }
            }
            else if (Math.abs(n3 - this.j.getCurrentPosition()) > 100) {
                this.j.a(n3, null);
            }
        }
    }
    
    @Override
    public void a(final int n) {
        if (n >= this.d) {
            this.j.a();
            this.c();
            return;
        }
        this.l.a(n);
    }
    
    @Override
    public void a(final boolean i) {
        this.i = i;
    }
    
    @Override
    public void b() {
        this.l.setEnabled(true);
    }
    
    @Override
    public void b(final float n, final float n2, final boolean b) {
        if (!b) {
            this.n.a();
        }
        final int duration = this.b.duration;
        final int c = (int)(n * duration);
        final int d = (int)(n2 * duration);
        if (c == this.c && d == this.d) {
            this.k.setVisibility(0);
        }
        else {
            this.m = true;
            this.c = c;
            this.d = d;
            if (!this.h) {
                this.b(c);
            }
        }
    }
    
    @Override
    public void c() {
        this.k.setVisibility(0);
        this.l.b();
    }
    
    public boolean d() {
        return this.m;
    }
    
    public EditableVideo e() {
        final EditableVideo editableVideo = (EditableVideo)EditableMedia.a(this.b, "gallery");
        editableVideo.clipStart = this.c;
        editableVideo.clipEnd = this.d;
        return editableVideo;
    }
    
    void f() {
        final ProgressReportingVideoView j = this.j;
        if (j.e()) {
            if (!j.g()) {
                this.h();
                return;
            }
            this.g();
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final FragmentActivity activity = this.getActivity();
        this.n = new VideoTooltipManager(activity.getApplicationContext(), activity.getSupportFragmentManager());
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final EditableVideo editableVideo = (EditableVideo)this.getActivity().getIntent().getParcelableExtra("editable_video");
        this.b = (VideoFile)editableVideo.mediaFile;
        this.c = editableVideo.clipStart;
        this.d = Math.min(editableVideo.clipEnd, 30000 + this.c);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final ze ze = new ze(this);
        final View inflate = layoutInflater.inflate(2130968776, viewGroup, false);
        final AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout)inflate.findViewById(2131886766);
        aspectRatioFrameLayout.setAspectRatio(this.b.size.e());
        aspectRatioFrameLayout.setOnClickListener((View$OnClickListener)ze);
        (this.j = (ProgressReportingVideoView)aspectRatioFrameLayout.findViewById(2131886767)).setProgressListener(this);
        (this.k = aspectRatioFrameLayout.findViewById(2131886340)).setOnClickListener((View$OnClickListener)ze);
        (this.l = (VideoClipRangeSeekBar)inflate.findViewById(2131886768)).setVideoTrimBarListener(this);
        if (bundle != null) {
            this.c = bundle.getInt("state_clip_start", -1);
            this.d = bundle.getInt("state_clip_end", -1);
            this.e = bundle.getInt("state_current_position", -1);
            this.f = bundle.getBoolean("state_paused", false);
            this.m = bundle.getBoolean("state_editing", false);
            this.i = bundle.getBoolean("state_zoomed", false);
        }
        return inflate;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.h = true;
        this.e = this.j.getCurrentPosition();
        this.g = this.j.g();
        this.j.b();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.h = false;
        this.l.setEnabled(false);
        this.j.setVideoFile(this.b);
        this.c = com.twitter.util.g.a(this.c, 0, this.b.duration);
        this.d = com.twitter.util.g.a(this.d, this.c, Math.min(30000 + this.c, this.b.duration));
        final float n = this.b.duration;
        this.l.b(this.c / n, this.d / n);
        this.l.a(1000.0f / n, 30000.0f / n);
        this.l.a(this.b.duration, VideoEditorFragment.a, this.i);
        if (this.l.a()) {
            this.n.a(VideoTooltipManager$CameraTooltip.g);
        }
        final int a = com.twitter.util.g.a(this.e, this.c, this.d);
        this.e = -1;
        if (this.g) {
            this.b(a);
        }
        else {
            this.k.setVisibility(0);
            this.l.a(this.c, this.d, a);
            this.j.a(a, new zf(this));
        }
        if (this.i) {
            this.l.h();
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putInt("state_clip_start", this.c);
        bundle.putInt("state_clip_end", this.d);
        int n;
        if (this.h) {
            n = this.e;
        }
        else {
            n = this.j.getCurrentPosition();
        }
        bundle.putInt("state_current_position", n);
        bundle.putBoolean("state_paused", this.f);
        bundle.putBoolean("state_editing", this.m);
        bundle.putBoolean("state_zoomed", this.i);
    }
}
