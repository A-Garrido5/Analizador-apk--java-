// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.PasswordAuthentication;
import java.net.Authenticator;
import com.squareup.okhttp.h;
import com.squareup.okhttp.i;
import java.util.List;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.URL;
import java.net.Proxy;
import com.squareup.okhttp.g;

final class j implements g
{
    private InetAddress a(final Proxy proxy, final URL url) {
        if (proxy != null && proxy.type() != Proxy.Type.DIRECT) {
            return ((InetSocketAddress)proxy.address()).getAddress();
        }
        return InetAddress.getByName(url.getHost());
    }
    
    @Override
    public i a(final Proxy proxy, final URL url, final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final h h = list.get(i);
            if ("Basic".equalsIgnoreCase(h.a())) {
                final PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(url.getHost(), this.a(proxy, url), url.getPort(), url.getProtocol(), h.b(), h.a(), url, Authenticator.RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    return i.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                }
            }
        }
        return null;
    }
    
    @Override
    public i b(final Proxy proxy, final URL url, final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final h h = list.get(i);
            if ("Basic".equalsIgnoreCase(h.a())) {
                final InetSocketAddress inetSocketAddress = (InetSocketAddress)proxy.address();
                final PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), this.a(proxy, url), inetSocketAddress.getPort(), url.getProtocol(), h.b(), h.a(), url, Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return i.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                }
            }
        }
        return null;
    }
}
