// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.view.MotionEvent;
import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.youtube.player.internal.ba;
import com.google.android.youtube.player.internal.w$a;
import com.google.android.youtube.player.internal.b;
import java.util.HashSet;
import com.google.android.youtube.player.internal.c;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Bundle;
import com.google.android.youtube.player.internal.n;
import com.google.android.youtube.player.internal.ax;
import java.util.Set;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import com.google.android.youtube.player.internal.az;

final class g implements az
{
    final /* synthetic */ Activity a;
    final /* synthetic */ YouTubePlayerView b;
    
    g(final YouTubePlayerView b, final Activity a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.b.d != null) {
            YouTubePlayerView.a(this.b, this.a);
        }
        this.b.d = null;
    }
    
    @Override
    public final void b() {
        if (!this.b.k && this.b.e != null) {
            this.b.e.f();
        }
        this.b.g.a();
        if (this.b.indexOfChild((View)this.b.g) < 0) {
            this.b.addView((View)this.b.g);
            this.b.removeView(this.b.f);
        }
        this.b.f = null;
        this.b.e = null;
        this.b.d = null;
    }
}
