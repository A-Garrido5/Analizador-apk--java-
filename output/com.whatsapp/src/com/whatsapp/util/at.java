// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import java.io.IOException;

class at extends ao
{
    private OpusPlayer a;
    
    public at(final String s) {
        this.a = new OpusPlayer(s);
    }
    
    @Override
    public void a() {
        try {
            this.a.pause();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public void a(final int n) {
        try {
            this.a.seek(n);
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public void a(final MediaPlayer$OnErrorListener mediaPlayer$OnErrorListener) {
    }
    
    @Override
    public void a(final MediaPlayer$OnPreparedListener mediaPlayer$OnPreparedListener) {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void b(final int n) {
    }
    
    @Override
    public void c() {
        try {
            this.a.stop();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public void d() {
        this.a.close();
    }
    
    @Override
    public int e() {
        try {
            return (int)this.a.getLength();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public boolean f() {
        try {
            return this.a.isPlaying();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public void g() {
        this.a.prepare();
    }
    
    @Override
    public void h() {
        try {
            this.a.start();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public int i() {
        try {
            return (int)this.a.getCurrentPosition();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
