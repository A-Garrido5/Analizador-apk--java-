// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.content.Context;
import android.media.SoundPool;
import android.media.AudioManager;

public class aa
{
    private static aa a;
    private final AudioManager b;
    private SoundPool c;
    private int[] d;
    private int e;
    
    private aa(final Context context) {
        this.b = (AudioManager)context.getSystemService("audio");
        this.e = 0;
    }
    
    public static aa a(final Context context) {
        synchronized (aa.class) {
            final Context applicationContext = context.getApplicationContext();
            if (aa.a == null) {
                aa.a = new aa(applicationContext);
            }
            final aa a = aa.a;
            if (a.e == 0) {
                a.b(applicationContext);
            }
            ++a.e;
            return a;
        }
    }
    
    private void b(final Context context) {
        final SoundPool c = new SoundPool(2, 5, 0);
        this.d = new int[] { c.load(context, 2131230727, 1), c.load(context, 2131230728, 1), c.load(context, 2131230726, 1), c.load(context, 2131230730, 1) };
        this.c = c;
    }
    
    public int a(final int n) {
        final SoundPool c = this.c;
        int play = 0;
        if (c != null) {
            if (this.b != null) {
                final boolean musicActive = this.b.isMusicActive();
                play = 0;
                if (musicActive) {
                    return play;
                }
            }
            play = this.c.play(this.d[n], 1.0f, 1.0f, 0, 0, 1.0f);
        }
        return play;
    }
    
    public void a() {
        if (this.e > 0) {
            --this.e;
        }
        if (this.e == 0 && this.c != null) {
            final int[] d = this.d;
            for (int length = d.length, i = 0; i < length; ++i) {
                this.c.unload(d[i]);
            }
            this.c = null;
            this.d = null;
        }
    }
}
