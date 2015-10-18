// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.util.bn;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;

public class ScribeThriftUrlPreference extends DebugUrlPreference
{
    public ScribeThriftUrlPreference(final Context context, final AttributeSet set) {
        super(context, set, "scribe_thrift_endpoint_enabled", null, "scribe_thrift_endpoint_url", "Enable Scribe Thrift Endpoint", "Example: " + context.getString(2131298253), context.getString(2131298253));
    }
    
    @Override
    protected URI a(final String s) {
        return bn.a(s, "https", null);
    }
    
    @Override
    protected URI a(final URI uri) {
        return null;
    }
}
