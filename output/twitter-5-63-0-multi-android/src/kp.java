import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import java.util.HashSet;
import javax.net.ssl.SSLSocketFactory;
import java.util.Set;
import org.apache.http.conn.ssl.X509HostnameVerifier;

// 
// Decompiled by Procyon v0.5.30
// 

class kp
{
    private static final X509HostnameVerifier a;
    private final Set b;
    private final SSLSocketFactory c;
    private final SSLSocketFactory d;
    
    static {
        a = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
    }
    
    public kp(final kr kr, final String[] array, final long n, final String[] array2) {
        this.b = new HashSet();
        final SSLContext instance = SSLContext.getInstance("TLS");
        final SSLContext instance2 = SSLContext.getInstance("TLS");
        final TrustManager[] a = this.a(kr, array, n);
        final TrustManager[] a2 = this.a(kr);
        instance.init(null, a, null);
        instance2.init(null, a2, null);
        this.c = instance.getSocketFactory();
        this.d = instance2.getSocketFactory();
        for (int length = array2.length, i = 0; i < length; ++i) {
            this.b.add(array2[i]);
        }
    }
    
    private int a(int n) {
        if (n == -1) {
            n = 443;
        }
        return n;
    }
    
    private SSLSocketFactory a(final String s) {
        if (this.b.contains(s)) {
            return this.c;
        }
        return this.d;
    }
    
    private void a(final String s, final SSLSocket sslSocket) {
        try {
            kp.a.verify(s, sslSocket);
        }
        catch (Throwable t) {
            try {
                sslSocket.close();
                throw t;
            }
            catch (Exception ex) {}
        }
    }
    
    private TrustManager[] a(final kr kr) {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
        instance.init(kr.a);
        return instance.getTrustManagers();
    }
    
    private TrustManager[] a(final kr kr, final String[] array, final long n) {
        return new TrustManager[] { new kq(kr, array, n) };
    }
    
    public Socket a(final String s, final int n) {
        final SSLSocket sslSocket = (SSLSocket)this.a(s).createSocket(s, this.a(n));
        this.a(s, sslSocket);
        return sslSocket;
    }
    
    public Socket a(final String s, final int n, final InetAddress inetAddress, final int n2) {
        final SSLSocket sslSocket = (SSLSocket)this.a(s).createSocket(s, this.a(n), inetAddress, n2);
        this.a(s, sslSocket);
        return sslSocket;
    }
    
    public Socket a(final InetAddress inetAddress, final int n) {
        final SSLSocket sslSocket = (SSLSocket)this.a(inetAddress.getHostName()).createSocket(inetAddress, this.a(n));
        this.a(inetAddress.getHostName(), sslSocket);
        return sslSocket;
    }
    
    public Socket a(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) {
        final SSLSocket sslSocket = (SSLSocket)this.a(inetAddress.getHostName()).createSocket(inetAddress, this.a(n), inetAddress2, n2);
        this.a(inetAddress.getHostName(), sslSocket);
        return sslSocket;
    }
    
    public Socket a(final Socket socket, final String s, final int n, final boolean b) {
        final SSLSocket sslSocket = (SSLSocket)this.a(s).createSocket(socket, s, this.a(n), b);
        this.a(s, sslSocket);
        return sslSocket;
    }
    
    public String[] a() {
        return this.d.getDefaultCipherSuites();
    }
    
    public String[] b() {
        return this.d.getSupportedCipherSuites();
    }
}
