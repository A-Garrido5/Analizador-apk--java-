import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bk
{
    public static final bk a;
    private static final char[] c;
    final byte[] b;
    private transient int d;
    private transient String e;
    
    static {
        c = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        a = a(new byte[0]);
    }
    
    bk(final byte[] b) {
        this.b = b;
    }
    
    public static bk a(final String e) {
        try {
            final bk bk = new bk(e.getBytes("UTF-8"));
            bk.e = e;
            return bk;
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static bk a(final byte... array) {
        return new bk(array.clone());
    }
    
    public String a() {
        final String e = this.e;
        if (e != null) {
            return e;
        }
        try {
            return this.e = new String(this.b, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public String b() {
        return bh.a(this.b);
    }
    
    public boolean b(final String s) {
        if (s != null && this.b.length == s.length()) {
            if (s == this.e) {
                return true;
            }
            for (int i = 0; i < this.b.length; ++i) {
                if (this.b[i] != s.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public String c() {
        int i = 0;
        final char[] array = new char[2 * this.b.length];
        final byte[] b = this.b;
        final int length = b.length;
        int n = 0;
        while (i < length) {
            final byte b2 = b[i];
            final int n2 = n + 1;
            array[n] = bk.c[0xF & b2 >> 4];
            n = n2 + 1;
            array[n2] = bk.c[b2 & 0xF];
            ++i;
        }
        return new String(array);
    }
    
    public bk d() {
        bk bk = null;
        for (int i = 0; i < this.b.length; ++i) {
            final byte b = this.b[i];
            if (b >= 65 && b <= 90) {
                final byte[] array = this.b.clone();
                final int n = i + 1;
                array[i] = (byte)(b + 32);
                for (int j = n; j < array.length; ++j) {
                    final byte b2 = array[j];
                    if (b2 >= 65 && b2 <= 90) {
                        array[j] = (byte)(b2 + 32);
                    }
                }
                bk = new bk(array);
                break;
            }
        }
        return bk;
    }
    
    public int e() {
        return this.b.length;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof bk && Arrays.equals(((bk)o).b, this.b));
    }
    
    public byte[] f() {
        return this.b.clone();
    }
    
    @Override
    public int hashCode() {
        final int d = this.d;
        if (d != 0) {
            return d;
        }
        return this.d = Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        if (this.b.length == 0) {
            return "ByteString[size=0]";
        }
        if (this.b.length <= 16) {
            return String.format("ByteString[size=%s data=%s]", this.b.length, this.c());
        }
        try {
            return String.format("ByteString[size=%s md5=%s]", this.b.length, a(MessageDigest.getInstance("MD5").digest(this.b)).c());
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
    }
}
