// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import android.os.Parcelable;
import com.twitter.internal.network.j;
import com.twitter.internal.network.q;
import java.io.OutputStream;
import com.twitter.internal.network.c;
import java.io.ByteArrayOutputStream;
import com.twitter.library.service.aa;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.ab;
import android.content.Context;

public class ae extends w
{
    public ae(final Context context, final ab ab, final TwitterUser twitterUser) {
        super(context, ae.class.getName(), ab, twitterUser);
    }
    
    @Override
    protected void a(final aa aa) {
        if (this.e.b == null) {
            aa.a(413);
        }
        else {
            final ab p = this.P();
            final long c = p.c;
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            final StringBuilder append = com.twitter.library.network.ae.a(this.q.d, "1.1", "account", "update_profile_banner").append(".json");
            final MediaFile b = this.e.b;
            final i a = MediaProcessorFactory.a(this.p, b, MediaProcessorFactory$MediaUsage.c, c);
            this.l = new ah(this.p, p).a(append).a(new c(byteArrayOutputStream, null));
            this.u();
            this.m = new com.twitter.library.api.upload.q(this.p).a(this.l).a("banner").a(a).a(aa);
            this.v();
            if (aa.a()) {
                this.o.putParcelable("header_media", (Parcelable)b);
                this.h();
            }
        }
    }
}
