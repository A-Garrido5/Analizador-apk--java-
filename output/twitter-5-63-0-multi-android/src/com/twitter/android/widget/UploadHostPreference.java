// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.internal.network.HttpOperation;
import java.net.URISyntaxException;
import com.twitter.library.util.bn;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;

public class UploadHostPreference extends DebugUrlPreference
{
    private static String f;
    
    static {
        UploadHostPreference.f = "/1.1/media/upload.json";
    }
    
    public UploadHostPreference(final Context context, final AttributeSet set) {
        super(context, set, "upload_staging_enabled", null, "upload_staging_host", "Enable Staging Upload Server", "Example: " + context.getString(2131298291), context.getString(2131298270));
    }
    
    @Override
    protected URI a(final String s) {
        return bn.a(s, "https", null);
    }
    
    @Override
    protected URI a(final URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getHost(), UploadHostPreference.f, null);
        }
        catch (URISyntaxException ex) {
            return null;
        }
    }
    
    @Override
    protected boolean a() {
        return true;
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation) {
        return httpOperation.l().a == 400;
    }
}
