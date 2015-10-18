// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ac extends m
{
    private m[] b;
    
    public ac(final byte[] array) {
        super(array);
    }
    
    public ac(final m[] b) {
        super(a(b));
        this.b = b;
    }
    
    private static byte[] a(final m[] array) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != array.length) {
            try {
                byteArrayOutputStream.write(((bb)array[i]).d());
                ++i;
                continue;
            }
            catch (ClassCastException ex2) {
                throw new IllegalArgumentException(array[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
            catch (IOException ex) {
                throw new IllegalArgumentException("exception converting octets " + ex.toString());
            }
            break;
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    private Vector k() {
        final Vector<bb> vector = new Vector<bb>();
        for (int i = 0; i < this.a.length; i += 1000) {
            int length;
            if (i + 1000 > this.a.length) {
                length = this.a.length;
            }
            else {
                length = i + 1000;
            }
            final byte[] array = new byte[length - i];
            System.arraycopy(this.a, i, array, 0, array.length);
            vector.addElement(new bb(array));
        }
        return vector;
    }
    
    public void a(final o o) {
        o.b(36);
        o.b(128);
        final Enumeration j = this.j();
        while (j.hasMoreElements()) {
            o.a(j.nextElement());
        }
        o.b(0);
        o.b(0);
    }
    
    @Override
    public byte[] d() {
        return this.a;
    }
    
    @Override
    boolean h() {
        return true;
    }
    
    @Override
    int i() {
        final Enumeration j = this.j();
        int n = 0;
        while (j.hasMoreElements()) {
            n += j.nextElement().a().i();
        }
        return 2 + (n + 2);
    }
    
    public Enumeration j() {
        if (this.b == null) {
            return this.k().elements();
        }
        return new ad(this);
    }
}
