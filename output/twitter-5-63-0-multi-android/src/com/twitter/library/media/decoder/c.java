// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import android.content.res.AssetFileDescriptor;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import com.twitter.internal.android.util.Size;
import com.twitter.media.filters.g;
import android.graphics.Bitmap;
import com.twitter.media.filters.Filters;
import android.content.Context;
import com.twitter.library.media.manager.l;

public class c implements l
{
    private static ThreadLocal a;
    private final int b;
    private final boolean c;
    private final Context d;
    private final float e;
    private final Filters f;
    
    static {
        c.a = new ThreadLocal();
    }
    
    public c(final Context context, final int n, final boolean b, final float n2) {
        this(context, n, b, n2, null);
    }
    
    public c(final Context d, final int b, final boolean c, final float e, final Filters f) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    @Override
    public Bitmap a(final Bitmap bitmap) {
        if (g.a(this.d) && (this.b != 0 || this.c)) {
            final Bitmap a = m.a(Size.a(bitmap), Bitmap$Config.ARGB_8888);
            if (a != null) {
                while (true) {
                    Label_0199: {
                        if (this.f != null) {
                            break Label_0199;
                        }
                        Label_0122: {
                            if (com.twitter.library.media.decoder.c.a.get() != null) {
                                break Label_0122;
                            }
                            while (true) {
                                final AssetFileDescriptor openRawResourceFd = this.d.getResources().openRawResourceFd(lf.filter_resources);
                                while (true) {
                                    Label_0207: {
                                        try {
                                            final Filters filters = new Filters();
                                            filters.a(this.d, openRawResourceFd, this.b > 8);
                                            com.twitter.library.media.decoder.c.a.set(filters);
                                            yp.a(openRawResourceFd);
                                            final Filters f = com.twitter.library.media.decoder.c.a.get();
                                            final int a2 = f.a(bitmap, this.c);
                                            if (a2 <= 0 || !f.a(this.b, a2, a, 1.0f, this.e)) {
                                                break Label_0207;
                                            }
                                            final int n = 1;
                                            f.a(a2);
                                            if (n != 0) {
                                                return a;
                                            }
                                            break;
                                        }
                                        finally {
                                            yp.a(openRawResourceFd);
                                        }
                                        break Label_0199;
                                    }
                                    final int n = 0;
                                    continue;
                                }
                            }
                        }
                        a.recycle();
                        return bitmap;
                    }
                    final Filters f = this.f;
                    continue;
                }
            }
        }
        return bitmap;
    }
    
    @Override
    public String a() {
        return String.format("filter_%d_enhance_%b_intensity%f", this.b, this.c, this.e);
    }
}
