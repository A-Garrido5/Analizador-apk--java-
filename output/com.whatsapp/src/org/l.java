// 
// Decompiled by Procyon v0.5.30
// 

package org;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

public abstract class l
{
    public static int a;
    private static final SocketFactory b;
    private static final ServerSocketFactory c;
    
    static {
        b = SocketFactory.getDefault();
        c = ServerSocketFactory.getDefault();
    }
}
