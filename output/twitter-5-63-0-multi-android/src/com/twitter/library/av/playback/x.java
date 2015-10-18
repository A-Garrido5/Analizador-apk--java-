// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.client.ad;
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
import com.twitter.library.av.l;
import android.text.TextUtils;
import android.os.Looper;
import android.content.IntentFilter;
import java.util.HashMap;
import com.twitter.library.media.util.g;
import com.twitter.library.av.aa;
import java.util.Map;
import android.content.BroadcastReceiver;
import android.os.Handler;
import com.twitter.library.av.f;
import com.twitter.internal.android.util.Size;
import com.twitter.android.av.ap;
import android.os.Bundle;
import com.twitter.library.av.m;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.av.k;
import com.twitter.library.media.util.d;
import com.twitter.library.client.af;
import com.twitter.library.av.h;
import com.twitter.android.av.as;
import android.media.MediaPlayer$OnCompletionListener;
import com.twitter.library.av.model.b;
import java.lang.ref.WeakReference;
import com.twitter.library.util.e;

public class x extends e
{
    private final WeakReference a;
    private w b;
    private boolean c;
    
    x(final AVPlayer avPlayer, final w b) {
        this.c = true;
        this.a = new WeakReference((T)avPlayer);
        this.b = b;
    }
    
    private void b() {
        final AVPlayer avPlayer = (AVPlayer)this.a.get();
        if (avPlayer != null && avPlayer.F == this) {
            avPlayer.F = null;
        }
    }
    
    protected b a(final Void... array) {
        final AVPlayer avPlayer = (AVPlayer)this.a.get();
        if (avPlayer != null) {
            return avPlayer.a(avPlayer.B);
        }
        return null;
    }
    
    public void a() {
        this.b = null;
    }
    
    protected void a(final b b) {
        final AVPlayer avPlayer = (AVPlayer)this.a.get();
        boolean b2;
        if (b != null && b.a()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        while (true) {
            Label_0129: {
                if (avPlayer == null) {
                    break Label_0129;
                }
                int n;
                if (this.c) {
                    avPlayer.c(b);
                    avPlayer.a(b, avPlayer.B);
                    n = (b2 ? 1 : 0);
                }
                else {
                    if (!b2) {
                        break Label_0129;
                    }
                    if (avPlayer.j.a(b)) {
                        avPlayer.c(b);
                        n = (b2 ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (this.b != null) {
                    if (n != 0) {
                        this.b.d_();
                    }
                    else {
                        this.b.aj_();
                    }
                }
                this.b();
                return;
            }
            int n = b2 ? 1 : 0;
            continue;
        }
    }
    
    public void a(final boolean c) {
        this.c = c;
    }
    
    protected void b(final b b) {
        if (this.b != null) {
            this.b.e_();
        }
        this.b();
    }
}
