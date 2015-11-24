// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.util.bn;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;

public class ScribeUrlPreference extends DebugUrlPreference
{
    public ScribeUrlPreference(final Context context, final AttributeSet set) {
        super(context, set, "scribe_endpoint_enabled", null, "scribe_endpoint_url", "Enable Scribe Endpoint", "Example: " + context.getString(2131298254), context.getString(2131298254));
    }
    
    @Override
    protected URI a(final String s) {
        return bn.a(s, "https", "/scribe");
    }
    
    @Override
    protected URI a(final URI uri) {
        return null;
    }
}
