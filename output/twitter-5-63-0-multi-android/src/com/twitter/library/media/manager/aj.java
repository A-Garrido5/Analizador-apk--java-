// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import android.text.TextUtils;
import com.twitter.library.util.af;
import android.net.Uri;
import java.io.File;
import android.content.Context;
import com.twitter.library.network.a;

public abstract class aj
{
    private final String a;
    private final a b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final ResourceRequestType f;
    private al g;
    private Object h;
    
    protected aj(final ak ak) {
        this.a = ak.l;
        this.b = ak.m;
        this.c = ak.n;
        this.d = ak.o;
        this.e = ak.p;
        this.g = ak.q;
        this.h = ak.r;
        ResourceRequestType f;
        if (ak.s == null) {
            f = ResourceRequestType.a;
        }
        else {
            f = ak.s;
        }
        this.f = f;
    }
    
    public File a(final Context context) {
        return af.b(context, Uri.parse(this.a));
    }
    
    public String a() {
        return this.a;
    }
    
    public void a(final al g) {
        this.g = g;
    }
    
    public void a(final Object h) {
        this.h = h;
    }
    
    public boolean a(final aj aj) {
        return this == aj || (aj != null && this.n().equals(aj.n()));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && o instanceof aj && this.a((aj)o));
    }
    
    @Override
    public int hashCode() {
        return this.n().hashCode();
    }
    
    public String n() {
        return this.a;
    }
    
    public boolean o() {
        return !TextUtils.isEmpty((CharSequence)this.a);
    }
    
    public a p() {
        return this.b;
    }
    
    public boolean q() {
        return this.c;
    }
    
    public boolean r() {
        return this.d;
    }
    
    public boolean s() {
        return this.e;
    }
    
    public ResourceRequestType t() {
        return this.f;
    }
    
    @Override
    public String toString() {
        return this.n();
    }
    
    public Object u() {
        return this.h;
    }
    
    public al v() {
        return this.g;
    }
}
