// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.Iterator;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.aa;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;

public class u extends ag implements o
{
    private final nw a;
    private final List e;
    private com.twitter.library.api.upload.y f;
    private LinkedHashMap g;
    private long h;
    private int i;
    private final int n;
    
    public u(final Context context, final ab ab, final int n, final List list) {
        this(null, context, ab, n, list);
    }
    
    public u(final String s, final Context context, final ab ab, final int n, final List e) {
        super(s, context, u.class.getName(), ab);
        if (e.isEmpty()) {
            throw new IllegalArgumentException("The media list should not be empty");
        }
        this.n = n;
        this.e = e;
        this.a = new nw(e.size(), this.an_(), 3, true);
    }
    
    public u(final String s, final Context context, final ab ab, final List list) {
        this(s, context, ab, Integer.MAX_VALUE, list);
    }
    
    protected k a(final k k) {
        return k;
    }
    
    public u a(final com.twitter.library.api.upload.y f) {
        this.f = f;
        return this;
    }
    
    @Override
    protected void a(final aa aa) {
        final LinkedHashMap<Long, MediaFile> g = new LinkedHashMap<Long, MediaFile>();
        final Iterator<EditableMedia> iterator = (Iterator<EditableMedia>)this.e.iterator();
        long h = 0L;
        while (iterator.hasNext()) {
            final EditableMedia editableMedia = iterator.next();
            long n;
            if (this.i < this.n) {
                final q a = s.a(this.p, editableMedia, true);
                final k k = new k(this.p, this.P());
                this.a.a(k.an_());
                k.a(a).b(this.f).g(this.O());
                aa.a(this.a(this.a(k)));
                final MediaFile h2 = k.h();
                if (aa.a()) {
                    g.put(k.g(), h2);
                    h += k.b();
                }
                else if (h2 != null) {
                    h2.a();
                }
                if (!this.a(k, aa)) {
                    break;
                }
                n = h;
            }
            else {
                this.a.a(nz.b(this.an_(), this.ay_()));
                n = h;
            }
            h = n;
        }
        if (g.size() == this.e.size()) {
            this.g = g;
            this.h = h;
        }
    }
    
    protected boolean a(final k k, final aa aa) {
        final boolean a = aa.a();
        if (a) {
            ++this.i;
        }
        this.a.a();
        return a;
    }
    
    @Override
    public int ay_() {
        return 3;
    }
    
    @Override
    public LinkedHashMap az_() {
        return this.g;
    }
    
    @Override
    public aa b() {
        return this.S();
    }
}
