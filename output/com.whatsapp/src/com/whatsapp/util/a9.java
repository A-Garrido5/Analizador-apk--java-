// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer;

class a9 extends ao
{
    MediaPlayer a;
    
    public a9(final String dataSource) {
        (this.a = new MediaPlayer()).setDataSource(dataSource);
    }
    
    @Override
    public void a() {
        this.a.pause();
    }
    
    @Override
    public void a(final int n) {
        this.a.seekTo(n);
    }
    
    @Override
    public void a(final MediaPlayer$OnErrorListener onErrorListener) {
        this.a.setOnErrorListener(onErrorListener);
    }
    
    @Override
    public void a(final MediaPlayer$OnPreparedListener onPreparedListener) {
        this.a.setOnPreparedListener(onPreparedListener);
    }
    
    @Override
    public void b() {
        this.a.reset();
    }
    
    @Override
    public void b(final int audioStreamType) {
        this.a.setAudioStreamType(audioStreamType);
    }
    
    @Override
    public void c() {
        this.a.stop();
    }
    
    @Override
    public void d() {
        this.a.release();
    }
    
    @Override
    public int e() {
        return this.a.getDuration();
    }
    
    @Override
    public boolean f() {
        return this.a.isPlaying();
    }
    
    @Override
    public void g() {
        this.a.prepare();
    }
    
    @Override
    public void h() {
        this.a.start();
    }
    
    @Override
    public int i() {
        return this.a.getCurrentPosition();
    }
}
