// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.content.SharedPreferences;
import com.twitter.library.service.f;
import android.net.Uri;
import com.twitter.library.client.App;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public abstract class d extends c
{
    protected d(final Context context, final String s, final Session session) {
        super(context, s, session);
        this.e(false);
    }
    
    protected d(final Context context, final String s, final ab ab) {
        super(context, s, ab);
        this.e(false);
    }
    
    @Override
    protected final e a() {
        final f b = this.b();
        if (App.f()) {
            final SharedPreferences sharedPreferences = this.p.getSharedPreferences("debug_prefs", 0);
            if (sharedPreferences.getBoolean("dm_staging_enabled", false)) {
                final String string = sharedPreferences.getString("dm_staging_host", (String)null);
                if (string != null) {
                    final Uri parse = Uri.parse(string);
                    b.c(parse.getScheme()).b(parse.getAuthority());
                }
            }
        }
        return b.a();
    }
    
    protected abstract f b();
}
