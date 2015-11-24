// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import com.twitter.android.vineloops.i;
import com.twitter.library.client.as;
import com.twitter.android.vineloops.VineLoopAggregator;
import android.support.v4.content.CursorLoader;
import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.Toast;
import java.util.ArrayList;
import android.content.Intent;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import android.text.TextUtils;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bq;
import android.widget.ImageButton;
import com.twitter.library.media.model.MediaDescriptor;
import android.preference.PreferenceManager;
import com.twitter.library.provider.ae;
import com.twitter.util.c;
import com.twitter.android.composer.au;
import android.content.Context;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.view.View;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.os.Build$VERSION;
import com.twitter.library.media.manager.aj;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.ap;
import com.twitter.library.media.manager.aq;
import java.util.concurrent.Future;
import com.twitter.android.vineloops.b;
import android.view.animation.Animation;
import android.net.Uri;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.TweetView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.ProgressBar;
import com.twitter.library.media.player.InlineVideoView;
import android.widget.LinearLayout;
import com.twitter.android.widget.MediaPlayerView;
import com.twitter.android.widget.dj;
import com.twitter.android.vineloops.a;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;

public class MediaPlayerActivity extends TwitterFragmentActivity implements LoaderManager$LoaderCallbacks, View$OnClickListener, cl, a, dj
{
    protected MediaPlayerView a;
    private LinearLayout b;
    private InlineVideoView c;
    private ProgressBar d;
    private MediaImageView e;
    private TweetView f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Tweet l;
    private TwitterScribeAssociation m;
    private Uri n;
    private Animation o;
    private Animation p;
    private boolean q;
    private String r;
    private b s;
    private Future t;
    private MediaActionBarFragment u;
    
    public MediaPlayerActivity() {
        this.q = true;
    }
    
    private void a(final String s) {
        (this.s = new b(this)).a(this.c);
        this.t = this.I().e().b(((aq)ap.a(s).a(new ly(this))).a());
    }
    
    private void i() {
        if (Build$VERSION.SDK_INT < 19) {
            this.b.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)new ma(this));
        }
    }
    
    public Animation U_() {
        return this.p;
    }
    
    protected int a(final ToolBar toolBar) {
        boolean b = true;
        final int a = super.a(toolBar);
        final boolean b2 = this.l.f == this.U().g() && b;
        final jx a2 = toolBar.a(2131886232);
        if (!b2 || this.l.g || this.u == null) {
            b = false;
        }
        a2.b(b);
        return a;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968874);
        bn.a(false);
        bn.d(false);
        bn.c(false);
        return bn;
    }
    
    public void a(final int visibility) {
        if (visibility == 0) {
            this.M().c();
        }
        else {
            this.M().d();
        }
        final LinearLayout b = this.b;
        for (int childCount = ((ViewGroup)b).getChildCount(), i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)b).getChildAt(i);
            if (child.getVisibility() != 8) {
                child.setVisibility(visibility);
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            this.l = new ad(cursor).a();
            if (this.u != null) {
                this.u.a(this.l);
            }
        }
    }
    
    public void a(final boolean q) {
        if (this.q == q) {
            return;
        }
        if (q) {
            this.b.startAnimation(this.o);
        }
        else {
            this.b.startAnimation(this.p);
        }
        this.q = q;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (super.a(jv, toolBar)) {
            if (this.k && !kg.a((Context)this)) {
                jv.a(2131951639, toolBar);
            }
            jv.a(2131951630, toolBar);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887448) {
            com.twitter.android.composer.au.a((Context)this).a(this.l.S().url, null).a(this.U().e()).b((Context)this);
            return true;
        }
        if (a == 2131886232) {
            this.showDialog(1);
        }
        return super.a(jx);
    }
    
    public Animation b() {
        return this.o;
    }
    
    public void b(final int n) {
        com.twitter.util.c.b((View)this.b);
        this.M().c();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.h = intent.getBooleanExtra("aud", false);
        this.j = intent.getBooleanExtra("simple_controls", false);
        this.m = (TwitterScribeAssociation)intent.getParcelableExtra("association");
        this.l = (Tweet)intent.getParcelableExtra("tweet");
        this.n = ae.b(this.l.Q, this.U().g());
        this.k = (PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext()).getBoolean("media_forward", true) && (this.l.F() || this.l.H() || this.l.G()));
        final String stringExtra = intent.getStringExtra("player_url");
        final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("player_stream_urls");
        Uri parse;
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0) {
            parse = Uri.parse(parcelableArrayListExtra.get(0).a);
        }
        else {
            parse = null;
        }
        this.d = (ProgressBar)this.findViewById(2131886235);
        (this.a = (MediaPlayerView)this.findViewById(2131886930)).setUseSimplePlayPauseControls(this.j);
        this.a.setProgressBar(this.d);
        (this.f = (TweetView)this.findViewById(2131887128)).setHideInlineActions(true);
        this.f.setTweet(this.l);
        this.f.setVisibility(8);
        this.a.a((ImageButton)this.findViewById(2131886933), this.findViewById(2131886932));
        this.c = (InlineVideoView)this.findViewById(2131886931);
        this.i = bq.f(stringExtra);
        if (this.i) {
            this.r = stringExtra;
        }
        this.b = (LinearLayout)this.findViewById(2131886934);
        final ck ck = new ck(this);
        (this.o = AnimationUtils.loadAnimation((Context)this, 2131034141)).setAnimationListener((Animation$AnimationListener)ck);
        this.o.setFillAfter(true);
        this.o.setDuration(150L);
        (this.p = AnimationUtils.loadAnimation((Context)this, 2131034143)).setAnimationListener((Animation$AnimationListener)ck);
        this.p.setFillAfter(true);
        this.p.setDuration(150L);
        if (this.i) {
            this.a(String.valueOf(parse));
            this.u = MediaActionBarFragment.a(this, 2131886241, this.m, "tweet", "", "tweet");
            this.b.setOnClickListener((View$OnClickListener)this);
        }
        else {
            this.a.a(parcelableArrayListExtra, intent.getIntExtra("video_index", 0), intent.getIntExtra("video_position", 0));
            this.a.setIsLooping(intent.getBooleanExtra("is_looping", false));
            this.a.setMediaControllerListener(this);
        }
        final String stringExtra2 = intent.getStringExtra("image_url");
        if (!TextUtils.isEmpty((CharSequence)stringExtra2)) {
            final MediaImageView e = (MediaImageView)this.findViewById(2131886643);
            e.setVisibility(0);
            if (this.h) {
                e.setScaleType(BaseMediaImageView$ScaleType.c);
            }
            else {
                e.setScaleType(BaseMediaImageView$ScaleType.a);
            }
            e.a(com.twitter.library.media.manager.j.a(stringExtra2));
            this.e = e;
        }
        if (bundle != null) {
            this.g = bundle.getInt("seek", 0);
        }
        if (this.n != null) {
            this.getSupportLoaderManager().initLoader(1, null, this);
        }
        this.i();
    }
    
    public void c(final int n) {
        this.d.setVisibility(8);
        switch (n) {
            default: {
                Toast.makeText((Context)this, 2131297251, 1).show();
            }
            case 1: {
                Toast.makeText((Context)this, 2131297252, 1).show();
            }
            case 3: {
                Toast.makeText((Context)this, 2131297250, 1).show();
            }
            case 4: {
                Toast.makeText((Context)this, 2131297249, 1).show();
            }
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.finish();
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void f() {
        this.M().d();
        com.twitter.util.c.a((View)this.b);
    }
    
    public void g() {
        this.d.setVisibility(8);
        if (!this.h && this.e != null) {
            this.e.setVisibility(8);
        }
        if (!this.i) {
            this.a.setVisibility(0);
            if (this.c != null) {
                this.c.setVisibility(8);
            }
            return;
        }
        this.a.setVisibility(8);
        this.c.setVisibility(0);
        this.c.start();
    }
    
    public void h() {
    }
    
    public void onClick(final View view) {
        this.a(!this.q);
    }
    
    protected Dialog onCreateDialog(final int n) {
        return MediaActionBarFragment.a(this, this.l.E, n);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this, this.n, Tweet.b, null, null, null);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.t != null) {
            this.t.cancel(true);
            this.t = null;
        }
        if (this.i) {
            this.c.a();
        }
        else {
            this.a.f();
        }
        this.s = null;
        this.b.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (this.i) {
            this.c.pause();
            return;
        }
        this.a.pause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (this.g > 0) {
            if (!this.i) {
                this.a.setStartPosition(this.g);
            }
            this.g = 0;
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int g;
        if (this.i) {
            g = this.c.getCurrentPosition();
        }
        else {
            g = this.a.getCurrentPosition();
        }
        bundle.putInt("seek", this.g = g);
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
    
    @Override
    protected void onStop() {
        if (this.s != null) {
            final int a = this.s.a();
            if (a > 0) {
                VineLoopAggregator.a((Context)this).a(this.r, a);
                com.twitter.android.vineloops.i.a(this.getApplicationContext(), as.a(this.getApplicationContext())).a();
            }
        }
        super.onStop();
    }
}
