// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.util.d;
import com.twitter.library.av.model.b;

public class bb
{
    String a;
    boolean b;
    long c;
    
    public bb() {
        this.b = false;
    }
    
    public void a(final String s, final b b, final d d, final long c) {
        if (this.a == null && b != null) {
            this.a = b.f();
        }
        if (d != null && this.a != null) {
            d.put(16, (Object)this.a);
        }
        if (s == null) {
            return;
        }
        switch (s) {
            default: {}
            case "replay": {
                this.b = true;
                this.c = c;
            }
            case "show": {
                this.c = c;
            }
            case "playback_0":
            case "playback_start": {
                if (this.c != 0L && d != null) {
                    final long n2 = c - this.c;
                    d.put(15, (Object)this.b);
                    d.put(17, (Object)n2);
                }
                this.c = 0L;
            }
            case "playback_100":
            case "playback_complete": {
                this.c = c;
            }
        }
    }
}
