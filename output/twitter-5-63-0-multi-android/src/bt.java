import java.io.InputStream;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bt
{
    public static bi a(final cc cc) {
        return new bw(cc);
    }
    
    public static bj a(final cd cd) {
        return new by(cd);
    }
    
    public static cc a(final OutputStream outputStream) {
        return new bu(outputStream);
    }
    
    public static cd a(final InputStream inputStream) {
        return new bv(inputStream);
    }
    
    public static void a(final bq bq, long n, long n2, final OutputStream outputStream) {
        ce.a(bq.b, n, n2);
        ca ca;
        for (ca = bq.a; n >= ca.c - ca.b; n -= ca.c - ca.b, ca = ca.d) {}
        while (n2 > 0L) {
            final int n3 = (int)(n + ca.b);
            final int n4 = (int)Math.min(ca.c - n3, n2);
            outputStream.write(ca.a, n3, n4);
            n2 -= n4;
            n = 0L;
        }
    }
}
