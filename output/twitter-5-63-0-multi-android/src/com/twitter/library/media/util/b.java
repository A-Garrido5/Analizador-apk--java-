// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.media.AudioManager;
import android.content.Context;
import android.media.AudioManager$OnAudioFocusChangeListener;

public class b
{
    final d a;
    boolean b;
    int c;
    final AudioManager$OnAudioFocusChangeListener d;
    private final e e;
    
    public b(final Context context, final d a) {
        this.d = (AudioManager$OnAudioFocusChangeListener)new c(this);
        this.a = a;
        this.e = new f((AudioManager)context.getSystemService("audio"), null);
    }
    
    public static float a(final int n, final int n2) {
        return (float)(1.0 - Math.log(1 + (n - n2)) / Math.log(n + 1));
    }
    
    public boolean a() {
        int b = 1;
        if (!this.b) {
            if (this.c().a(this.d, 3, b) != b) {
                b = 0;
            }
            this.b = (b != 0);
        }
        return this.b;
    }
    
    public void b() {
        if (this.b) {
            this.c().a(this.d);
            this.b = false;
        }
    }
    
    e c() {
        return this.e;
    }
}
