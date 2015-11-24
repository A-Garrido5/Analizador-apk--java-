// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.control;

import android.view.View;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public interface f
{
    public static final f t = new g();
    
    void a(final Context p0, final int p1);
    
    void a(final Context p0, final AVPlayer p1);
    
    void a(final AVPlayer$PlayerStartType p0);
    
    void a(final aw p0, final int p1, final boolean p2);
    
    boolean a();
    
    void b();
    
    void b_(final boolean p0);
    
    void c();
    
    void c(final boolean p0);
    
    void c_(final boolean p0);
    
    void d();
    
    void e();
    
    void f();
    
    boolean g();
    
    h getOnChromeClickListener();
    
    View getView();
    
    void h();
    
    void i();
    
    void j();
    
    void k();
    
    void layout(final int p0, final int p1, final int p2, final int p3);
    
    void setDockingAllowed(final boolean p0);
    
    void setFullScreenAllowed(final boolean p0);
    
    void setOnChromeClickListener(final h p0);
}
