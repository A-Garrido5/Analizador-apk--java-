// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.api.upload.p;
import com.twitter.util.e;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.media.model.MediaFile;
import java.util.List;
import com.twitter.library.api.upload.n;

public class l extends a implements n
{
    private final List d;
    private final MediaFile e;
    private int f;
    
    public l(final Context context, final ab ab, final MediaFile e, final n n, final com.twitter.util.n n2, final List list) {
        super(context, ab, n, n2);
        this.f = 0;
        this.d = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        this.e = e;
        final boolean empty = this.d.isEmpty();
        boolean b = false;
        if (!empty) {
            b = true;
        }
        com.twitter.util.e.b(b);
    }
    
    private void b() {
        synchronized (this) {
            new m(this.a, this.b, this.e, this, this.c, this.d.get(this.f)).a();
        }
    }
    
    private boolean c(final p p) {
        return !p.a() && this.f < this.d.size() && p.c() == 1009;
    }
    
    @Override
    public void a() {
        this.b();
    }
    
    @Override
    public void a(final p p) {
        ++this.f;
        if (this.c(p)) {
            this.b();
            return;
        }
        this.b(p);
    }
}
