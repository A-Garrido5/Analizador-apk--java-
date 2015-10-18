// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.ay;
import android.content.res.Resources$NotFoundException;
import android.view.SurfaceHolder;
import android.app.Activity;
import com.twitter.android.av.t;
import android.media.AudioManager;
import android.view.Surface;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.text.TextUtils;
import android.content.IntentFilter;
import java.util.HashMap;
import com.twitter.library.media.util.g;
import com.twitter.library.av.aa;
import java.util.Map;
import android.content.BroadcastReceiver;
import com.twitter.library.av.f;
import java.lang.ref.WeakReference;
import com.twitter.library.av.model.b;
import android.os.Bundle;
import com.twitter.library.av.m;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.av.k;
import com.twitter.library.media.util.d;
import com.twitter.library.av.h;
import com.twitter.android.av.as;
import android.media.MediaPlayer$OnCompletionListener;
import android.os.Looper;
import android.media.MediaPlayer;
import com.twitter.internal.android.util.Size;
import android.os.Handler;
import com.twitter.library.av.l;

public class ab implements l
{
    boolean a;
    final l b;
    final AVPlayer c;
    final Handler d;
    
    ab(final l b, final AVPlayer c, final Handler d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final int n) {
        this.a(new an(this, n));
    }
    
    @Override
    public void a(final int n, final int n2) {
        this.c.g = Size.a(n, n2);
        this.a(new ac(this, n, n2));
    }
    
    @Override
    public void a(final int n, final int n2, final boolean b, final boolean b2) {
        boolean b3 = true;
        if (this.c.l > 0L) {
            if (this.c.J) {
                this.c.b(b3);
            }
            else {
                this.c.j.c().b((int)this.c.l);
            }
            this.c.l = 0L;
            this.c.A = false;
        }
        else {
            b3 = b2;
        }
        if (this.c.j.c() != null) {
            this.c.a(this.c.j.c());
        }
        if (this.c.A() && !this.c.w()) {
            this.c.b(false);
        }
        this.a(new aj(this, n, n2, b, b3));
    }
    
    @Override
    public void a(final int n, final String s) {
        this.c.a("error", s);
        if (this.c.D()) {
            this.c.onCompletion(null);
            return;
        }
        this.a(new am(this, n, s));
    }
    
    @Override
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.a(new ao(this, avPlayer$PlayerStartType));
    }
    
    @Override
    public void a(final aw aw, final int n, final boolean b) {
        this.a(new ai(this, aw, n, b));
    }
    
    void a(final Runnable runnable) {
        if (this.a()) {
            runnable.run();
            return;
        }
        this.d.post(runnable);
    }
    
    boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    @Override
    public void b(final int n, final int n2) {
        this.a(new ad(this, n, n2));
    }
    
    @Override
    public void b(final boolean b) {
        this.a(new ag(this, b));
    }
    
    @Override
    public void e() {
        this.a(new ak(this));
    }
    
    @Override
    public void f() {
        this.a(new al(this));
    }
    
    @Override
    public void h() {
        if (!this.a) {
            this.a = true;
            this.a(new ap(this));
        }
    }
    
    @Override
    public void i() {
        if (this.a) {
            this.a = false;
            this.a(new aq(this));
        }
    }
    
    @Override
    public void j() {
        this.a(new ae(this));
    }
    
    @Override
    public void k() {
        this.a(new af(this));
    }
    
    @Override
    public void l() {
        this.a(new ah(this));
    }
}
