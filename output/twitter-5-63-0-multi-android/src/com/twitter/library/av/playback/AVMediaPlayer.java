// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.view.Surface;
import com.twitter.library.av.l;
import android.view.SurfaceHolder;
import android.media.MediaPlayer$OnCompletionListener;
import java.util.Map;
import com.twitter.library.av.model.a;
import android.content.Context;

public interface AVMediaPlayer
{
    void a(final float p0);
    
    void a(final Context p0, final a p1, final Map p2);
    
    void a(final MediaPlayer$OnCompletionListener p0);
    
    void a(final SurfaceHolder p0);
    
    void a(final l p0);
    
    void a(final a p0, final boolean p1);
    
    void a(final boolean p0);
    
    void b(final int p0);
    
    void b(final Surface p0);
    
    f c();
    
    boolean o();
    
    void p();
    
    boolean q();
    
    boolean r();
    
    void s();
    
    void t();
    
    aw u();
}
