// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.security.KeyManagementException;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

final class aw extends aq
{
    private static aw c;
    private static final TrustManager[] d;
    
    static {
        d = new TrustManager[] { new au() };
        aw.c = new aw();
    }
    
    public static aw a() {
        return aw.c;
    }
    
    @Override
    protected SSLSocketFactory a(final SSLContext sslContext) {
        try {
            sslContext.init(null, aw.d, null);
            return sslContext.getSocketFactory();
        }
        catch (KeyManagementException ex) {
            Log.b(ex);
            throw new RuntimeException(ex);
        }
    }
}
