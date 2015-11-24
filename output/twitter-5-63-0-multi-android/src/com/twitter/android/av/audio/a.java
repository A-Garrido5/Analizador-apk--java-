// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import com.twitter.library.av.p;
import com.twitter.android.av.f;
import com.twitter.library.provider.Tweet;
import com.twitter.android.av.ay;
import com.twitter.android.av.y;
import com.twitter.android.av.ax;
import com.twitter.android.av.r;

public class a
{
    private static final r a;
    private static final ax b;
    private static final ax c;
    private static final y d;
    
    static {
        a = new r();
        b = new ax();
        c = new ay();
        d = new y();
    }
    
    public f a(final Tweet tweet) {
        switch (com.twitter.android.av.audio.b.a[p.b(tweet).ordinal()]) {
            default: {
                return com.twitter.android.av.audio.a.b;
            }
            case 1: {
                return com.twitter.android.av.audio.a.a;
            }
            case 2: {
                return com.twitter.android.av.audio.a.d;
            }
            case 3: {
                return com.twitter.android.av.audio.a.c;
            }
        }
    }
}
