import org.spongycastle.crypto.c;
import org.spongycastle.crypto.InvalidCipherTextException;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.security.SecureRandom;
import org.spongycastle.crypto.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class zs implements a
{
    private SecureRandom a;
    private a b;
    private boolean c;
    private boolean d;
    private boolean e;
    
    public zs(final a b) {
        this.b = b;
        this.e = this.c();
    }
    
    private byte[] b(final byte[] array, final int n, final int n2) {
        int i = 1;
        if (n2 > this.a()) {
            throw new IllegalArgumentException("input data too large");
        }
        final byte[] array2 = new byte[this.b.a()];
        if (this.d) {
            array2[0] = (byte)i;
            while (i != -1 + (array2.length - n2)) {
                array2[i] = -1;
                ++i;
            }
        }
        else {
            this.a.nextBytes(array2);
            array2[0] = 2;
            while (i != -1 + (array2.length - n2)) {
                while (array2[i] == 0) {
                    array2[i] = (byte)this.a.nextInt();
                }
                ++i;
            }
        }
        array2[-1 + (array2.length - n2)] = 0;
        System.arraycopy(array, n, array2, array2.length - n2, n2);
        return this.b.a(array2, 0, array2.length);
    }
    
    private boolean c() {
        final String s = AccessController.doPrivileged((PrivilegedAction<String>)new zt(this));
        return s == null || s.equals("true");
    }
    
    private byte[] c(final byte[] array, final int n, final int n2) {
        final byte[] a = this.b.a(array, n, n2);
        if (a.length < this.b()) {
            throw new InvalidCipherTextException("block truncated");
        }
        final byte b = a[0];
        if (b != 1 && b != 2) {
            throw new InvalidCipherTextException("unknown block type");
        }
        if (this.e && a.length != this.b.b()) {
            throw new InvalidCipherTextException("block incorrect size");
        }
        int i;
        for (i = 1; i != a.length; ++i) {
            final byte b2 = a[i];
            if (b2 == 0) {
                break;
            }
            if (b == 1 && b2 != -1) {
                throw new InvalidCipherTextException("block padding incorrect");
            }
        }
        final int n3 = i + 1;
        if (n3 > a.length || n3 < 10) {
            throw new InvalidCipherTextException("no data in block");
        }
        final byte[] array2 = new byte[a.length - n3];
        System.arraycopy(a, n3, array2, 0, array2.length);
        return array2;
    }
    
    @Override
    public int a() {
        int a = this.b.a();
        if (this.c) {
            a -= 10;
        }
        return a;
    }
    
    @Override
    public void a(final boolean c, final c c2) {
        zx zx;
        if (c2 instanceof zy) {
            final zy zy = (zy)c2;
            this.a = zy.a();
            zx = (zx)zy.b();
        }
        else {
            this.a = new SecureRandom();
            zx = (zx)c2;
        }
        this.b.a(c, c2);
        this.d = zx.a();
        this.c = c;
    }
    
    @Override
    public byte[] a(final byte[] array, final int n, final int n2) {
        if (this.c) {
            return this.b(array, n, n2);
        }
        return this.c(array, n, n2);
    }
    
    @Override
    public int b() {
        final int b = this.b.b();
        if (this.c) {
            return b;
        }
        return b - 10;
    }
}
