// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import android.os.Parcelable;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.internal.network.j;
import com.twitter.library.service.a;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.ab;
import android.content.Context;

public class ac extends w
{
    public ac(final Context context, final ab ab, final TwitterUser twitterUser) {
        super(context, ac.class.getName(), ab, twitterUser);
    }
    
    @Override
    protected void a(final aa aa) {
        if (this.e.a == null) {
            aa.a(413);
        }
        else {
            final ab p = this.P();
            final long c = p.c;
            final StringBuilder append = ae.a(this.q.d, "1.1", "account", "update_profile_image").append(".json");
            final MediaFile a = this.e.a;
            final i a2 = MediaProcessorFactory.a(this.p, a, MediaProcessorFactory$MediaUsage.b, c);
            final com.twitter.library.service.a a3 = new com.twitter.library.service.a(c, append);
            this.l = new ah(this.p, p).a(append).a(this.a(a3));
            this.u();
            this.m = new q(this.p).a(this.l).a("image").a(a2).a(aa);
            this.v();
            ErrorReporter.a(a3);
            if (this.b(aa)) {
                this.o.putParcelable("avatar_media", (Parcelable)a);
                this.h();
            }
        }
    }
}
