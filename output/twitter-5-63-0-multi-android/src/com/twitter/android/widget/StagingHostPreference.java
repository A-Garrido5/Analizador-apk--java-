// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.util.bn;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;

public class StagingHostPreference extends DebugUrlPreference
{
    public StagingHostPreference(final Context context, final AttributeSet set) {
        super(context, set, "staging_enabled", null, "staging_url", "Enable Staging Server", "Example: " + context.getString(2131298192), context.getString(2131298192));
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
    protected boolean a() {
        return true;
    }
}
