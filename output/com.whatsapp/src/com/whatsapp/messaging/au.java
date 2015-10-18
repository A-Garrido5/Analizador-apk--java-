// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class au implements X509TrustManager
{
    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) {
    }
    
    @Override
    public void checkServerTrusted(final X509Certificate[] array, final String s) {
    }
    
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
