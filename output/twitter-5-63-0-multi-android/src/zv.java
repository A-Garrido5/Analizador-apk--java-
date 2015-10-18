import org.spongycastle.crypto.c;
import org.spongycastle.crypto.DataLengthException;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.30
// 

class zv
{
    private aaa a;
    private boolean b;
    
    public int a() {
        final int bitLength = this.a.b().bitLength();
        if (this.b) {
            return -1 + (bitLength + 7) / 8;
        }
        return (bitLength + 7) / 8;
    }
    
    public BigInteger a(byte[] array, final int n, final int n2) {
        if (n2 > 1 + this.a()) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (n2 == 1 + this.a() && !this.b) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (n != 0 || n2 != array.length) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            array = array2;
        }
        final BigInteger bigInteger = new BigInteger(1, array);
        if (bigInteger.compareTo(this.a.b()) >= 0) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        return bigInteger;
    }
    
    public void a(final boolean b, final c c) {
        if (c instanceof zy) {
            this.a = (aaa)((zy)c).b();
        }
        else {
            this.a = (aaa)c;
        }
        this.b = b;
    }
    
    public byte[] a(final BigInteger bigInteger) {
        final byte[] byteArray = bigInteger.toByteArray();
        if (this.b) {
            if (byteArray[0] == 0 && byteArray.length > this.b()) {
                final byte[] array = new byte[-1 + byteArray.length];
                System.arraycopy(byteArray, 1, array, 0, array.length);
                return array;
            }
            if (byteArray.length < this.b()) {
                final byte[] array2 = new byte[this.b()];
                System.arraycopy(byteArray, 0, array2, array2.length - byteArray.length, byteArray.length);
                return array2;
            }
        }
        else if (byteArray[0] == 0) {
            final byte[] array3 = new byte[-1 + byteArray.length];
            System.arraycopy(byteArray, 1, array3, 0, array3.length);
            return array3;
        }
        return byteArray;
    }
    
    public int b() {
        final int bitLength = this.a.b().bitLength();
        if (this.b) {
            return (bitLength + 7) / 8;
        }
        return -1 + (bitLength + 7) / 8;
    }
    
    public BigInteger b(final BigInteger bigInteger) {
        if (this.a instanceof aab) {
            final aab aab = (aab)this.a;
            final BigInteger e = aab.e();
            final BigInteger f = aab.f();
            final BigInteger g = aab.g();
            final BigInteger h = aab.h();
            final BigInteger i = aab.i();
            final BigInteger modPow = bigInteger.remainder(e).modPow(g, e);
            final BigInteger modPow2 = bigInteger.remainder(f).modPow(h, f);
            return modPow.subtract(modPow2).multiply(i).mod(e).multiply(f).add(modPow2);
        }
        return bigInteger.modPow(this.a.c(), this.a.b());
    }
}
