// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import android.os.Parcelable;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;

public class ab extends w
{
    public ab(final Context context, final Session session) {
        super(context, ab.class.getName(), session);
    }
    
    private aa a(final w w, final String s) {
        w.a(this.e).g(this.O());
        if (s != null) {
            w.b(new e(this.p, s));
        }
        return super.a(w);
    }
    
    private aa c(final w w) {
        return this.a(w, null);
    }
    
    @Override
    protected void a(final aa aa) {
        this.o.putParcelable("user", (Parcelable)this.a);
        final com.twitter.library.service.ab p = this.P();
        aa aa2;
        if (this.e.c) {
            aa2 = this.a(new af(this.p, p, this.a), "edit_profile::header:remove");
        }
        else {
            final MediaFile b = this.e.b;
            aa2 = null;
            if (b != null) {
                aa2 = this.a(new ae(this.p, p, this.a), "edit_profile::header:upload");
            }
        }
        if ((aa2 == null || aa2.a()) && this.e.a != null) {
            aa2 = this.a(new ac(this.p, p, this.a), "edit_profile::avatar:upload");
        }
        if ((aa2 == null || aa2.a()) && this.e.i) {
            aa2 = this.c(new ad(this.p, p, this.a));
        }
        if (aa2 != null) {
            aa.a(aa2);
            return;
        }
        aa.a(false);
    }
}
