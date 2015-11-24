// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import java.util.Iterator;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import android.os.Handler;

final class h implements d
{
    private final Handler a;
    private final j b;
    private final CopyOnWriteArraySet c;
    private final boolean[] d;
    private boolean e;
    private int f;
    private int g;
    
    public h(final int n, final int n2, final int n3, final int n4) {
        Log.i("ExoPlayerImpl", "Init 1.1.0");
        this.f = 1;
        this.c = new CopyOnWriteArraySet();
        this.d = new boolean[n];
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i] = true;
        }
        this.a = new i(this);
        this.b = new j(this.a, this.e, this.d, n2, n3, n4);
    }
    
    @Override
    public void a() {
        this.b.c();
        this.a.removeCallbacksAndMessages((Object)null);
    }
    
    @Override
    public void a(final long n) {
        this.b.a(n);
    }
    
    void a(final Message message) {
        switch (message.what) {
            case 1: {
                this.f = message.arg1;
                final Iterator<g> iterator = (Iterator<g>)this.c.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(this.e, this.f);
                }
                break;
            }
            case 2: {
                --this.g;
                if (this.g == 0) {
                    final Iterator<g> iterator2 = (Iterator<g>)this.c.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().a();
                    }
                    break;
                }
                break;
            }
            case 3: {
                final ExoPlaybackException ex = (ExoPlaybackException)message.obj;
                final Iterator<g> iterator3 = (Iterator<g>)this.c.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().a(ex);
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final e e, final int n, final Object o) {
        this.b.a(e, n, o);
    }
    
    @Override
    public void a(final g g) {
        this.c.add(g);
    }
    
    @Override
    public void a(final boolean e) {
        if (this.e != e) {
            this.e = e;
            ++this.g;
            this.b.a(e);
            final Iterator<g> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(e, this.f);
            }
        }
    }
    
    @Override
    public void a(final aj... array) {
        this.b.a(array);
    }
    
    @Override
    public long b() {
        return this.b.b();
    }
    
    @Override
    public void b(final e e, final int n, final Object o) {
        this.b.b(e, n, o);
    }
    
    @Override
    public void b(final g g) {
        this.c.remove(g);
    }
    
    @Override
    public long c() {
        return this.b.a();
    }
}
