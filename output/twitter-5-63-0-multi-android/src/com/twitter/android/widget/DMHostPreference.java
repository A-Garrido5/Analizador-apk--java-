// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.api.conversations.q;
import com.twitter.library.provider.bg;
import com.twitter.library.client.az;
import com.twitter.library.util.bn;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;

public class DMHostPreference extends DebugUrlPreference
{
    private Context f;
    
    public DMHostPreference(final Context f, final AttributeSet set) {
        super(f, set, "dm_staging_enabled", null, "dm_staging_host", "Enable Staging DM Server", "Example: " + f.getString(2131298174), "https://api-staging1.smf1.twitter.com");
        this.f = f;
    }
    
    @Override
    protected URI a(final String s) {
        return bn.a(s, "https", null);
    }
    
    @Override
    protected URI a(final URI uri) {
        return null;
    }
    
    @Override
    protected void a(final Boolean b) {
        if (b) {
            bg.a(this.f, az.a(this.f).b().g()).a((q)null);
        }
    }
    
    @Override
    protected boolean a() {
        return true;
    }
}
