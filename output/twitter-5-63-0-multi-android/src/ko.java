import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

// 
// Decompiled by Procyon v0.5.30
// 

public class ko extends SSLSocketFactory
{
    private final kp a;
    
    public ko(final kr kr, final String[] array, final long n, final String[] array2) {
        this.a = new kp(kr, array, n, array2);
    }
    
    @Override
    public Socket createSocket(final String s, final int n) {
        return this.a.a(s, n);
    }
    
    @Override
    public Socket createSocket(final String s, final int n, final InetAddress inetAddress, final int n2) {
        return this.a.a(s, n, inetAddress, n2);
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n) {
        return this.a.a(inetAddress, n);
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) {
        return this.a.a(inetAddress, n, inetAddress2, n2);
    }
    
    @Override
    public Socket createSocket(final Socket socket, final String s, final int n, final boolean b) {
        return this.a.a(socket, s, n, b);
    }
    
    @Override
    public String[] getDefaultCipherSuites() {
        return this.a.a();
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        return this.a.b();
    }
}
