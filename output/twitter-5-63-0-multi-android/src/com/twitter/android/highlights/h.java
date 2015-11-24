// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.media.MediaPlayer;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;

class h implements MediaPlayer$OnCompletionListener, MediaPlayer$OnErrorListener, MediaPlayer$OnPreparedListener
{
    private final WeakReference a;
    private final Context b;
    private WeakReference c;
    
    public h(final Context context, final g g, final i i) {
        this.b = context.getApplicationContext();
        this.a = new WeakReference((T)g);
        this.c = new WeakReference((T)i);
    }
    
    private void a() {
        final g g = (g)this.a.get();
        final i i = (i)this.c.get();
        if (g != null && g.c() == 0 && i != null) {
            g.a(1);
            z.a(g, i, this.b);
        }
    }
    
    public void a(final i i) {
        if (!i.equals(this.c.get())) {
            this.c = new WeakReference((T)i);
        }
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        this.a();
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.a();
        return true;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        final i i = (i)this.c.get();
        if (i != null) {
            i.c.start();
        }
    }
}
