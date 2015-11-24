// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.protocol;

import java.nio.ByteBuffer;
import java.io.UnsupportedEncodingException;
import org.apache.thrift.TException;
import org.apache.thrift.transport.b;

public class TBinaryProtocol extends d
{
    private static final e f;
    protected boolean a;
    protected boolean b;
    protected int c;
    protected boolean d;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    
    static {
        f = new e();
    }
    
    public TBinaryProtocol(final b b, final boolean a, final boolean b2) {
        super(b);
        this.a = false;
        this.b = true;
        this.d = false;
        this.g = new byte[1];
        this.h = new byte[2];
        this.i = new byte[4];
        this.j = new byte[8];
        this.k = new byte[1];
        this.l = new byte[2];
        this.m = new byte[4];
        this.n = new byte[8];
        this.a = a;
        this.b = b2;
    }
    
    @Override
    public void a() {
    }
    
    public void a(final byte b) {
        this.g[0] = b;
        this.e.a(this.g, 0, 1);
    }
    
    @Override
    public void a(final int n) {
        this.i[0] = (byte)(0xFF & n >> 24);
        this.i[1] = (byte)(0xFF & n >> 16);
        this.i[2] = (byte)(0xFF & n >> 8);
        this.i[3] = (byte)(n & 0xFF);
        this.e.a(this.i, 0, 4);
    }
    
    @Override
    public void a(final long n) {
        this.j[0] = (byte)(0xFFL & n >> 56);
        this.j[1] = (byte)(0xFFL & n >> 48);
        this.j[2] = (byte)(0xFFL & n >> 40);
        this.j[3] = (byte)(0xFFL & n >> 32);
        this.j[4] = (byte)(0xFFL & n >> 24);
        this.j[5] = (byte)(0xFFL & n >> 16);
        this.j[6] = (byte)(0xFFL & n >> 8);
        this.j[7] = (byte)(0xFFL & n);
        this.e.a(this.j, 0, 8);
    }
    
    @Override
    public void a(final String s) {
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            this.a(bytes.length);
            this.e.a(bytes, 0, bytes.length);
        }
        catch (UnsupportedEncodingException ex) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }
    
    @Override
    public void a(final ByteBuffer byteBuffer) {
        final int n = byteBuffer.limit() - byteBuffer.position() - byteBuffer.arrayOffset();
        this.a(n);
        this.e.a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), n);
    }
    
    @Override
    public void a(final a a) {
        this.a(a.b);
        this.a(a.c);
    }
    
    @Override
    public void a(final org.apache.thrift.protocol.b b) {
        this.a(b.a);
        this.a(b.b);
    }
    
    @Override
    public void a(final c c) {
        this.a(c.a);
        this.a(c.b);
        this.a(c.c);
    }
    
    @Override
    public void a(final e e) {
    }
    
    @Override
    public void a(final short n) {
        this.h[0] = (byte)(0xFF & n >> 8);
        this.h[1] = (byte)(n & 0xFF);
        this.e.a(this.h, 0, 2);
    }
    
    @Override
    public void a(final boolean b) {
        byte b2;
        if (b) {
            b2 = 1;
        }
        else {
            b2 = 0;
        }
        this.a(b2);
    }
    
    @Override
    public void b() {
    }
    
    public void b(final int c) {
        this.c = c;
        this.d = true;
    }
    
    @Override
    public void c() {
        this.a((byte)0);
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public void e() {
    }
}
