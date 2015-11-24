// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.apache.http.HttpHost;

public final class k
{
    public final HttpHost a;
    public final boolean b;
    
    public k(final boolean b, final String s, final String s2) {
        final String trim = s.trim();
        while (true) {
            Label_0066: {
                if (trim.length() != 0) {
                    break Label_0066;
                }
                boolean b2 = false;
                while (true) {
                    try {
                        final int int1 = Integer.parseInt(s2);
                        this.a = new HttpHost(trim, int1, "http");
                        this.b = b2;
                        return;
                    }
                    catch (NumberFormatException ex) {
                        final int int1 = -1;
                        b2 = false;
                        continue;
                    }
                    break;
                }
            }
            boolean b2 = b;
            continue;
        }
    }
    
    public Proxy a() {
        if (this.b) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.a.getHostName(), this.a.getPort()));
        }
        return Proxy.NO_PROXY;
    }
}
