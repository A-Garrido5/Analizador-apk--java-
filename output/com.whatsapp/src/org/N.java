// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.net.DatagramPacket;
import java.net.InetAddress;

public final class N extends M
{
    private int h;
    
    public N() {
        this.h = 3;
    }
    
    public O a(final InetAddress inetAddress) {
        return this.a(inetAddress, 123);
    }
    
    public O a(final InetAddress address, final int port) {
        final int f = org.b.f;
        if (!this.b()) {
            this.a();
        }
        final a a = new a();
        a.b(3);
        a.a(this.h);
        final DatagramPacket d = a.d();
        d.setAddress(address);
        d.setPort(port);
        final a a2 = new a();
        final DatagramPacket d2 = a2.d();
        a.a(org.b.g());
        this.d.send(d);
        this.d.receive(d2);
        final O o = new O(a2, System.currentTimeMillis(), false);
        if (f != 0) {
            ++l.a;
        }
        return o;
    }
}
