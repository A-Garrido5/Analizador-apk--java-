import java.util.concurrent.TimeUnit;
import java.io.Closeable;
import java.util.concurrent.ThreadFactory;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import com.squareup.okhttp.Protocol;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.nio.charset.Charset;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bf
{
    public static final byte[] a;
    public static final String[] b;
    public static final InputStream c;
    public static final Charset d;
    public static final Charset e;
    public static final List f;
    public static final List g;
    public static final List h;
    
    static {
        a = new byte[0];
        b = new String[0];
        c = new ByteArrayInputStream(bf.a);
        d = Charset.forName("US-ASCII");
        e = Charset.forName("UTF-8");
        f = a(Arrays.asList(Protocol.a, Protocol.b, Protocol.c));
        g = a(Arrays.asList(Protocol.b, Protocol.c));
        h = a(Arrays.asList(Protocol.a, Protocol.c));
    }
    
    public static int a(final String s) {
        if ("http".equals(s)) {
            return 80;
        }
        if ("https".equals(s)) {
            return 443;
        }
        return -1;
    }
    
    private static int a(final String s, final int n) {
        if (n != -1) {
            return n;
        }
        return a(s);
    }
    
    public static int a(final URL url) {
        return a(url.getProtocol(), url.getPort());
    }
    
    public static Protocol a(final bk bk) {
        if (bk != null) {
            for (final Protocol c : Protocol.values()) {
                if (c.name.equals(bk)) {
                    return c;
                }
            }
            throw new IOException("Unexpected protocol: " + bk.a());
        }
        return Protocol.c;
    }
    
    public static List a(final List list) {
        return Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
    }
    
    public static List a(final Object[] array) {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])array.clone()));
    }
    
    public static ThreadFactory a(final String s, final boolean b) {
        return new bg(s, b);
    }
    
    public static void a(final long n, final long n2, final long n3) {
        if ((n2 | n3) < 0L || n2 > n || n - n2 < n3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static void a(final Closeable closeable, final Closeable closeable2) {
        Throwable t = null;
        while (true) {
            try {
                closeable.close();
                while (true) {
                    try {
                        closeable2.close();
                        if (t == null) {
                            return;
                        }
                    }
                    catch (Throwable t2) {
                        if (t == null) {
                            t = t2;
                        }
                        continue;
                    }
                    break;
                }
                if (t instanceof IOException) {
                    throw (IOException)t;
                }
                if (t instanceof RuntimeException) {
                    throw (RuntimeException)t;
                }
                if (t instanceof Error) {
                    throw (Error)t;
                }
                throw new AssertionError((Object)t);
            }
            catch (Throwable t) {
                continue;
            }
            break;
        }
    }
    
    public static boolean a(final cd cd, final int n) {
        final long nanoTime = System.nanoTime();
        final bq bq = new bq();
        while (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime) < n) {
            if (cd.b(bq, 2048L) == -1L) {
                return true;
            }
            bq.o();
        }
        return false;
    }
    
    public static boolean a(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
}
