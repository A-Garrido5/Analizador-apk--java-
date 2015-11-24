// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.media.util.z;
import com.twitter.library.media.util.w;
import com.twitter.library.media.util.y;
import com.twitter.internal.network.j;
import com.twitter.library.service.o;
import com.twitter.library.network.g;
import android.content.Context;
import com.twitter.library.util.af;
import com.twitter.library.media.model.MediaType;
import java.io.File;
import android.os.AsyncTask;

class jk extends AsyncTask
{
    final /* synthetic */ ImageActivity a;
    
    public jk(final ImageActivity a) {
        this.a = a;
    }
    
    protected File a(final String... array) {
        if (this.a.e != null) {
            final ImageActivity a = this.a;
            final File a2 = af.a((Context)a, MediaType.b.extension);
            if (a2 != null) {
                final HttpOperation c = new g((Context)a, this.a.e.toString()).a(new o(a2)).a().c();
                try {
                    if (c.j()) {
                        final y y = new y(a2);
                        y.j = this.a.e.getLastPathSegment();
                        y.k = this.a.g;
                        return w.a((Context)a).c(y);
                    }
                    return null;
                }
                finally {
                    af.b(a2);
                }
            }
        }
        return null;
    }
    
    protected void a(final File d) {
        this.a.removeDialog(1);
        if (d != null) {
            this.a.d = d;
            Toast.makeText((Context)this.a, 2131297599, 0).show();
            return;
        }
        Toast.makeText((Context)this.a, 2131297598, 0).show();
    }
    
    protected void onPreExecute() {
        this.a.showDialog(1);
    }
}
