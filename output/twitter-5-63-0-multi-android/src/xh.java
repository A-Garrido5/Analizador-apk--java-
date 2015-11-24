import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.5.30
// 

public final class xh
{
    static final /* synthetic */ boolean a;
    
    static {
        a = !xh.class.desiredAssertionStatus();
    }
    
    public static String a(final byte[] array, final int n) {
        try {
            return new String(b(array, n), "US-ASCII");
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static byte[] a(final byte[] array, final int n, final int n2, final int n3) {
        final xj xj = new xj(n3, null);
        int n4 = 4 * (n2 / 3);
        if (xj.c) {
            if (n2 % 3 > 0) {
                n4 += 4;
            }
        }
        else {
            switch (n2 % 3) {
                case 2: {
                    n4 += 3;
                    break;
                }
                case 1: {
                    n4 += 2;
                }
            }
        }
        if (xj.d && n2 > 0) {
            final int n5 = 1 + (n2 - 1) / 57;
            int n6;
            if (xj.e) {
                n6 = 2;
            }
            else {
                n6 = 1;
            }
            n4 += n6 * n5;
        }
        xj.a = new byte[n4];
        xj.a(array, n, n2, true);
        if (!xh.a && xj.b != n4) {
            throw new AssertionError();
        }
        return xj.a;
    }
    
    public static byte[] b(final byte[] array, final int n) {
        return a(array, 0, array.length, n);
    }
}
