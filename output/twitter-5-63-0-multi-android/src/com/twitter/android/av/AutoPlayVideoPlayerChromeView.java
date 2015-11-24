// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.view.View;
import com.twitter.library.av.control.h;
import com.twitter.library.av.playback.aw;
import android.os.Build$VERSION;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.library.av.playback.bf;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.av.playback.AVPlayer;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.av.control.f;
import android.widget.FrameLayout;

public class AutoPlayVideoPlayerChromeView extends FrameLayout implements f
{
    AutoPlayBadgeView a;
    
    public AutoPlayVideoPlayerChromeView(final Context context) {
        super(context);
    }
    
    public AutoPlayVideoPlayerChromeView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public AutoPlayVideoPlayerChromeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public void a(final Context context, final int n) {
        this.a.b();
    }
    
    public void a(final Context context, final AVPlayer avPlayer) {
        this.removeAllViews();
        LayoutInflater.from(this.getContext()).inflate(2130968601, (ViewGroup)this);
        (this.a = (AutoPlayBadgeView)this.findViewById(2131886295)).setDurationText(bf.g(avPlayer.q()));
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        if (avPlayer$PlayerStartType != AVPlayer$PlayerStartType.c || Build$VERSION.SDK_INT < 17) {
            this.a.a();
        }
    }
    
    public void a(final aw aw, final int n, final boolean b) {
    }
    
    public boolean a() {
        return false;
    }
    
    public void b() {
        this.a.b();
    }
    
    public void b_(final boolean b) {
        this.a.b();
    }
    
    public void c() {
        this.a.a();
    }
    
    public void c(final boolean b) {
    }
    
    public void c_(final boolean b) {
    }
    
    public void d() {
    }
    
    public void e() {
    }
    
    public void f() {
    }
    
    public boolean g() {
        return false;
    }
    
    public h getOnChromeClickListener() {
        return null;
    }
    
    public View getView() {
        return (View)this;
    }
    
    public void h() {
    }
    
    public void i() {
    }
    
    public void j() {
    }
    
    public void k() {
    }
    
    public void setDockingAllowed(final boolean b) {
    }
    
    public void setFullScreenAllowed(final boolean b) {
    }
    
    public void setOnChromeClickListener(final h h) {
    }
}
