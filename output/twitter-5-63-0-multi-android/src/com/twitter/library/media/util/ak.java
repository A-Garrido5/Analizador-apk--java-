// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.util.bk;
import com.twitter.library.media.model.MediaFile;
import java.util.concurrent.TimeUnit;
import android.support.v4.util.LongSparseArray;

public class ak
{
    public static final long a;
    private static ak b;
    private final LongSparseArray c;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
        ak.b = null;
    }
    
    public ak() {
        this.c = new LongSparseArray();
    }
    
    public static ak a() {
        if (ak.b == null) {
            ak.b = new ak();
        }
        return ak.b;
    }
    
    public static String a(final long n, String string) {
        final MediaFile a = a().a(n);
        if (a != null) {
            string = a.b().toString();
        }
        return string;
    }
    
    public MediaFile a(final long n) {
        final al al = (al)this.c.get(n);
        if (al != null) {
            if (al.b >= bk.a()) {
                return al.a;
            }
            this.b(n);
        }
        return null;
    }
    
    public void a(final long n, final MediaFile mediaFile) {
        this.c.put(n, new al(mediaFile));
    }
    
    public void b(final long n) {
        final al al = (al)this.c.get(n);
        if (al != null) {
            final MediaFile a = al.a;
            this.c.remove(n);
            a.c();
        }
    }
}
