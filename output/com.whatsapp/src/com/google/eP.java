// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.net.InetAddress;

final class eP extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (InetAddress)o);
    }
    
    public void a(final c3 c3, final InetAddress inetAddress) {
        String hostAddress;
        if (inetAddress == null) {
            hostAddress = null;
        }
        else {
            hostAddress = inetAddress.getHostAddress();
        }
        c3.a(hostAddress);
    }
}
