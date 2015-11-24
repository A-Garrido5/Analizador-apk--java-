// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.api.UserSettings;
import com.twitter.library.client.Session;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import com.twitter.library.api.Prompt;
import com.twitter.library.featureswitch.d;
import android.content.Context;

public class ba
{
    private static ba a;
    private Context b;
    
    private ba(final Context b) {
        this.b = b;
    }
    
    public static ba a(final Context context) {
        if (ba.a == null) {
            ba.a = new ba(context);
        }
        return ba.a;
    }
    
    public final int a() {
        return d.a("rediscoverability_prompt_id", 1673);
    }
    
    public final boolean a(final Prompt prompt) {
        return prompt.a() == this.a();
    }
    
    public void b() {
        final Session b = az.a(this.b).b();
        final UserSettings j = b.j();
        if (j != null) {
            j.l = true;
            j.i = true;
            as.a(this.b).a(ab.a(this.b, b, j, false, null));
        }
    }
    
    public void c() {
        final Session b = az.a(this.b).b();
        final UserSettings j = b.j();
        if (j != null) {
            j.l = false;
            j.i = false;
            as.a(this.b).a(ab.a(this.b, b, j, false, null));
        }
    }
}
