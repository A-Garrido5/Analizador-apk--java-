// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.bp;
import java.util.List;
import java.util.ArrayList;
import com.twitter.internal.android.service.x;
import com.twitter.library.provider.b;
import java.util.Locale;
import com.twitter.library.network.ae;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.api.ar;

public abstract class a extends ar
{
    private int[] a;
    private final long e;
    private int f;
    private boolean g;
    private final String h;
    private final bg i;
    private final com.twitter.library.api.bg j;
    
    protected a(final Context context, final ab ab, final long e, final boolean g, final bg i, final com.twitter.library.api.bg j) {
        super(context, f.class.getName(), ab);
        this.a = ae.a;
        this.i = i;
        this.j = j;
        this.g = g;
        this.e = e;
        this.h = String.format(Locale.ENGLISH, "request_favorite_%d_%d", this.P().c, e);
    }
    
    @Override
    public Runnable a(final com.twitter.internal.android.service.a a) {
        if (a != null) {
            a.cancel(true);
        }
        return new com.twitter.library.api.timeline.b(this);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final boolean x2 = this.X();
        final long c = this.P().c;
        if (!x2) {
            this.a = ae.a((List)this.j.a());
            return;
        }
        final bp bp = (bp)this.j.a();
        if (bp != null) {
            bp.A = this.g;
            bp.B = Math.max(bp.B, this.f);
            this.f = bp.B;
            final b w = this.W();
            int n;
            if (this.g) {
                n = 2;
            }
            else {
                n = -1;
            }
            this.i.a(Collections.singletonList(bp), c, n, -1L, true, false, true, null, true, w, true);
            w.a();
            return;
        }
        ErrorReporter.a(new com.twitter.library.service.a(c, this.a().a).a(new InvalidDataException("Received null status.")));
    }
    
    protected com.twitter.library.api.bg e() {
        return this.j;
    }
    
    public long f() {
        return this.e;
    }
    
    public int g() {
        return this.f;
    }
    
    @Override
    protected String p() {
        return this.h;
    }
    
    public int[] t() {
        return this.a;
    }
}
