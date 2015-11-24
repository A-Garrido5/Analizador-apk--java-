// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.net.InetAddress;
import java.net.Socket;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

abstract class aq extends SSLSocketFactory
{
    private static final String[] z;
    private SSLSocketFactory a;
    private final SSLContext b;
    
    static {
        final String[] z2 = new String[5];
        String s = "*\u001c\u0000\u000f\u001fx\u0014\u0018\u0000\u001d*\u0013\u0003\u001cPk\u000b\r\u0001\u001ck\u001f\u0000\rPl\u0012\u001eH#Y1/\u0007\u001e~\u0018\u0014\u001cJ*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Y. ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "^1?";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Y. \u001eC";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "D\u0012L\u0003\u001ee\n\u0002H\u0011f\u001a\u0003\u001a\u0019~\u0015\u0001H\u0011|\u001c\u0005\u0004\u0011h\u0011\tH\u0004e]\u001c\u001a\u001f|\u0014\b\rPY. H\u0003e\u001e\u0007\r\u0004y";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected aq() {
        final SSLContext a = a(a(a(null, aq.z[2]), aq.z[3]), aq.z[1]);
        if (a == null) {
            final NoSuchAlgorithmException ex = new NoSuchAlgorithmException(aq.z[4]);
            Log.b(ex);
            throw new RuntimeException(ex);
        }
        this.b = a;
    }
    
    private static SSLContext a(SSLContext instance, final String s) {
        if (instance != null) {
            return instance;
        }
        try {
            instance = SSLContext.getInstance(s);
            return instance;
        }
        catch (NoSuchAlgorithmException ex) {
            Log.w(s + aq.z[0] + ex);
            return instance;
        }
    }
    
    private SSLSocketFactory a() {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = this.a(this.b);
                }
                return this.a;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    protected abstract SSLSocketFactory a(final SSLContext p0);
    
    @Override
    public Socket createSocket() {
        return this.a().createSocket();
    }
    
    @Override
    public Socket createSocket(final String s, final int n) {
        return this.a().createSocket(s, n);
    }
    
    @Override
    public Socket createSocket(final String s, final int n, final InetAddress inetAddress, final int n2) {
        return this.a().createSocket(s, n, inetAddress, n2);
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n) {
        return this.a().createSocket(inetAddress, n);
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) {
        return this.a().createSocket(inetAddress, n, inetAddress2, n2);
    }
    
    @Override
    public Socket createSocket(final Socket socket, final String s, final int n, final boolean b) {
        return this.a().createSocket(socket, s, n, b);
    }
    
    @Override
    public String[] getDefaultCipherSuites() {
        return this.a().getDefaultCipherSuites();
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        return this.a().getSupportedCipherSuites();
    }
}
