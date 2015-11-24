// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.net.HttpURLConnection;
import java.net.URL;

final class ab implements aa
{
    @Override
    public final HttpURLConnection a(final URL url) {
        return (HttpURLConnection)url.openConnection();
    }
}
