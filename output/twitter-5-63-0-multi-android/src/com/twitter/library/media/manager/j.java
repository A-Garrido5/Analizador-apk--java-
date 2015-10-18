// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.File;
import android.content.Context;
import java.util.Collections;
import android.graphics.Bitmap$Config;
import android.graphics.RectF;
import com.twitter.library.media.decoder.ImageDecoder$ScaleType;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.MediaFile;
import java.util.List;

public final class j extends aj
{
    private final String a;
    private final List b;
    private final MediaFile c;
    private final Size d;
    private final ImageDecoder$ScaleType e;
    private final RectF f;
    private final boolean g;
    private final String h;
    private final l i;
    private final int j;
    private final String k;
    private final Bitmap$Config l;
    private final int m;
    
    protected j(final k k) {
        super(k);
        this.d = k.c;
        if (k.b != null) {
            this.b = k.b.a(k.l, this.d);
            this.a = this.b.get(0);
        }
        else {
            this.b = Collections.singletonList(k.l);
            this.a = k.l;
        }
        this.c = k.a;
        ImageDecoder$ScaleType e;
        if (k.d == null) {
            e = ImageDecoder$ScaleType.a;
        }
        else {
            e = k.d;
        }
        this.e = e;
        this.f = k.e;
        this.g = k.g;
        this.h = k.j;
        this.i = k.h;
        this.j = k.f;
        Bitmap$Config l;
        if (k.i == null) {
            l = Bitmap$Config.ARGB_8888;
        }
        else {
            l = k.i;
        }
        this.l = l;
        this.m = k.k;
        this.k = this.w();
    }
    
    public static k a(final MediaFile mediaFile) {
        return new k(mediaFile);
    }
    
    public static k a(final String s) {
        return a(s, Size.a);
    }
    
    public static k a(final String s, final int n, final int n2) {
        return a(s, Size.a(n, n2));
    }
    
    public static k a(final String s, final Size size) {
        return new k(s).a(size);
    }
    
    private String w() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.n());
        sb.append('_');
        sb.append(Integer.toString(this.d.a(), 36));
        sb.append('_');
        sb.append(Integer.toString(this.d.b(), 36));
        if (this.e != ImageDecoder$ScaleType.a) {
            sb.append('_');
            sb.append(this.e.ordinal());
        }
        final RectF f = this.f;
        if (f != null && (f.width() != 1.0f || f.height() != 1.0f)) {
            sb.append('_');
            sb.append(String.format("[%s,%s,%s,%s]", Integer.toString(Float.floatToIntBits(f.left), 36), Integer.toString(Float.floatToIntBits(f.top), 36), Integer.toString(Float.floatToIntBits(f.right), 36), Integer.toString(Float.floatToIntBits(f.bottom), 36)));
        }
        if (this.i != null) {
            sb.append('_');
            sb.append(this.i.a());
        }
        if (this.j != 0) {
            sb.append('_');
            sb.append(this.j);
        }
        if (this.l != Bitmap$Config.ARGB_8888) {
            sb.append('_');
            sb.append(this.l.ordinal());
        }
        if (this.m > 0) {
            sb.append('_');
            sb.append(this.m);
        }
        return sb.toString();
    }
    
    @Override
    public File a(final Context context) {
        if (this.c != null) {
            return this.c.file;
        }
        return super.a(context);
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    public List b() {
        return this.b;
    }
    
    public String c() {
        return super.a();
    }
    
    public MediaFile d() {
        return this.c;
    }
    
    public Size e() {
        return this.d;
    }
    
    public ImageDecoder$ScaleType f() {
        return this.e;
    }
    
    public int g() {
        return this.j;
    }
    
    public RectF h() {
        return this.f;
    }
    
    public l i() {
        return this.i;
    }
    
    public boolean j() {
        return this.g;
    }
    
    public Bitmap$Config k() {
        return this.l;
    }
    
    public String l() {
        return this.h;
    }
    
    public int m() {
        return this.m;
    }
    
    @Override
    public String n() {
        return this.k;
    }
}
