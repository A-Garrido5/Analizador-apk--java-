import java.util.List;
import java.lang.reflect.InvocationTargetException;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.5.30
// 

class bc extends ba
{
    protected final Class a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    
    private bc(final Class a, final Method b, final Method c, final Method d, final Method e, final Method f, final Method g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public void a(final Socket socket, final InetSocketAddress inetSocketAddress, final int n) {
        try {
            socket.connect(inetSocketAddress, n);
        }
        catch (SecurityException ex2) {
            final IOException ex = new IOException("Exception in connect");
            ex.initCause(ex2);
            throw ex;
        }
    }
    
    @Override
    public void a(final SSLSocket sslSocket, final String s) {
        super.a(sslSocket, s);
        if (!this.a.isInstance(sslSocket)) {
            return;
        }
        try {
            this.b.invoke(sslSocket, true);
            this.c.invoke(sslSocket, s);
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (IllegalAccessException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    @Override
    public void a(final SSLSocket sslSocket, final List list) {
        if (this.d == null || !this.a.isInstance(sslSocket)) {
            return;
        }
        try {
            final Object[] array = { ba.a(list) };
            if (this.f != null) {
                this.f.invoke(sslSocket, array);
            }
            this.d.invoke(sslSocket, array);
        }
        catch (IllegalAccessException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (InvocationTargetException ex2) {
            throw new RuntimeException(ex2);
        }
    }
    
    @Override
    public bk b(final SSLSocket sslSocket) {
        if (this.e == null) {
            return null;
        }
        if (!this.a.isInstance(sslSocket)) {
            return null;
        }
        try {
            if (this.g != null) {
                final byte[] array = (byte[])this.g.invoke(sslSocket, new Object[0]);
                if (array != null) {
                    return bk.a(array);
                }
            }
            final byte[] array2 = (byte[])this.e.invoke(sslSocket, new Object[0]);
            if (array2 == null) {
                return null;
            }
            return bk.a(array2);
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (IllegalAccessException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
}
