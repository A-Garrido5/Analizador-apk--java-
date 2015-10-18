// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import android.view.View;
import android.widget.MediaController$MediaPlayerControl;

class dk implements dh
{
    private dj a;
    private MediaController$MediaPlayerControl b;
    private boolean c;
    private dg d;
    
    public dk(final dj a) {
        this.a = null;
        this.a = a;
        this.d = new dg(this);
    }
    
    private void b() {
        if (this.b.isPlaying()) {
            this.b.pause();
            return;
        }
        this.b.start();
    }
    
    @Override
    public void a() {
        this.b();
    }
    
    @Override
    public void a(final View view) {
    }
    
    @Override
    public void hide() {
        this.c = false;
        if (this.a != null) {
            this.a.f();
        }
    }
    
    @Override
    public boolean isShowing() {
        return this.c;
    }
    
    @Override
    public void setMediaPlayer(final MediaController$MediaPlayerControl b) {
        this.b = b;
    }
    
    @Override
    public void show(final int n) {
        this.c = true;
        if (this.a != null) {
            this.a.b(n);
        }
        final Message obtainMessage = this.d.obtainMessage(1);
        if (n != 0) {
            this.d.removeMessages(1);
            this.d.sendMessageDelayed(obtainMessage, (long)n);
        }
    }
}
