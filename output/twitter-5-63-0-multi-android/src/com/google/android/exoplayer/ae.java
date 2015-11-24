// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.annotation.SuppressLint;
import java.util.Arrays;
import android.annotation.TargetApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import android.media.MediaFormat;
import java.util.List;

public class ae
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    private int j;
    private int k;
    private int l;
    private MediaFormat m;
    
    private ae(final MediaFormat m) {
        this.m = m;
        this.a = m.getString("mime");
        this.b = a(m, "max-input-size");
        this.c = a(m, "width");
        this.d = a(m, "height");
        this.f = a(m, "channel-count");
        this.g = a(m, "sample-rate");
        this.h = a(m, "bitrate");
        this.e = b(m, "com.google.android.videos.pixelWidthHeightRatio");
        this.i = new ArrayList();
        for (int n = 0; m.containsKey("csd-" + n); ++n) {
            final ByteBuffer byteBuffer = m.getByteBuffer("csd-" + n);
            final byte[] array = new byte[byteBuffer.limit()];
            byteBuffer.get(array);
            this.i.add(array);
            byteBuffer.flip();
        }
        this.j = -1;
        this.k = -1;
    }
    
    @TargetApi(16)
    private static final int a(final MediaFormat mediaFormat, final String s) {
        if (mediaFormat.containsKey(s)) {
            return mediaFormat.getInteger(s);
        }
        return -1;
    }
    
    @TargetApi(16)
    public static ae a(final MediaFormat mediaFormat) {
        return new ae(mediaFormat);
    }
    
    @TargetApi(16)
    private static final void a(final MediaFormat mediaFormat, final String s, final float n) {
        if (n != -1.0f) {
            mediaFormat.setFloat(s, n);
        }
    }
    
    @TargetApi(16)
    private static final void a(final MediaFormat mediaFormat, final String s, final int n) {
        if (n != -1) {
            mediaFormat.setInteger(s, n);
        }
    }
    
    private boolean a(final ae ae, final boolean b) {
        if (this.b == ae.b && this.c == ae.c && this.d == ae.d && this.e == ae.e && (b || (this.j == ae.j && this.k == ae.k)) && this.f == ae.f && this.g == ae.g && ai.a(this.a, ae.a) && this.h == ae.h && this.i.size() == ae.i.size()) {
            for (int i = 0; i < this.i.size(); ++i) {
                if (!Arrays.equals((byte[])this.i.get(i), (byte[])ae.i.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @TargetApi(16)
    private static final float b(final MediaFormat mediaFormat, final String s) {
        if (mediaFormat.containsKey(s)) {
            return mediaFormat.getFloat(s);
        }
        return -1.0f;
    }
    
    @SuppressLint({ "InlinedApi" })
    @TargetApi(16)
    private final void b(final MediaFormat mediaFormat) {
        a(mediaFormat, "max-width", this.j);
        a(mediaFormat, "max-height", this.k);
    }
    
    @TargetApi(16)
    public final MediaFormat a() {
        if (this.m == null) {
            final MediaFormat m = new MediaFormat();
            m.setString("mime", this.a);
            a(m, "max-input-size", this.b);
            a(m, "width", this.c);
            a(m, "height", this.d);
            a(m, "channel-count", this.f);
            a(m, "sample-rate", this.g);
            a(m, "bitrate", this.h);
            a(m, "com.google.android.videos.pixelWidthHeightRatio", this.e);
            for (int i = 0; i < this.i.size(); ++i) {
                m.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[])this.i.get(i)));
            }
            this.b(m);
            this.m = m;
        }
        return this.m;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b;
        if (this == o) {
            b = true;
        }
        else {
            b = false;
            if (o != null) {
                final Class<? extends ae> class1 = this.getClass();
                final Class<?> class2 = o.getClass();
                b = false;
                if (class1 == class2) {
                    return this.a((ae)o, false);
                }
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        int i = 0;
        if (this.l == 0) {
            int hashCode;
            if (527 + this.a == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.a.hashCode();
            }
            int l = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (hashCode * 31 + this.b) + this.c) + this.d) + Float.floatToRawIntBits(this.e)) + this.j) + this.k) + this.f) + this.g) + this.h;
            while (i < this.i.size()) {
                l = l * 31 + Arrays.hashCode(this.i.get(i));
                ++i;
            }
            this.l = l;
        }
        return this.l;
    }
    
    @Override
    public String toString() {
        return "MediaFormat(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.j + ", " + this.k + ")";
    }
}
