// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.model.c;
import java.util.Iterator;
import com.twitter.util.collection.i;
import com.twitter.library.av.model.a;
import java.util.LinkedList;
import java.util.List;

public class ba
{
    List a;
    
    public ba() {
        this.a = new LinkedList();
    }
    
    public void a() {
        this.a.clear();
    }
    
    public void a(final a a, final PlaybackMode playbackMode) {
        this.a.add(new i(a, playbackMode));
    }
    
    public boolean a(final a a) {
        for (final i i : this.a) {
            if (i.a != null && ((a)i.a).equals(a)) {
                return true;
            }
        }
        return false;
    }
    
    public int b() {
        return this.a.size();
    }
    
    public int c() {
        int i = 0;
        final int size = this.a.size();
        i j = null;
        int n = 0;
        while (i < size) {
            i k = this.a.get(i);
            int n2;
            if (c.a((a)k.a)) {
                n2 = i;
            }
            else {
                k = j;
                n2 = n;
            }
            ++i;
            j = k;
            n = n2;
        }
        if (n == 0) {
            if (j == null) {
                return -1;
            }
            return 1;
        }
        else {
            if (j != null && j.b == PlaybackMode.d) {
                return 3;
            }
            return 2;
        }
    }
}
