// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

public class Matrix
{
    public static final Matrix ROTATE_0;
    public static final Matrix ROTATE_180;
    public static final Matrix ROTATE_270;
    public static final Matrix ROTATE_90;
    double a;
    double b;
    double c;
    double d;
    double tx;
    double ty;
    double u;
    double v;
    double w;
    
    static {
        ROTATE_0 = new Matrix(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        ROTATE_90 = new Matrix(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        ROTATE_180 = new Matrix(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        ROTATE_270 = new Matrix(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }
    
    public Matrix(final double a, final double b, final double c, final double d, final double u, final double v, final double w, final double tx, final double ty) {
        this.u = u;
        this.v = v;
        this.w = w;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tx = tx;
        this.ty = ty;
    }
    
    public static Matrix fromByteBuffer(final ByteBuffer byteBuffer) {
        return fromFileOrder(IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer));
    }
    
    public static Matrix fromFileOrder(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9) {
        return new Matrix(n, n2, n4, n5, n3, n6, n9, n7, n8);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Matrix matrix = (Matrix)o;
            if (Double.compare(matrix.a, this.a) != 0) {
                return false;
            }
            if (Double.compare(matrix.b, this.b) != 0) {
                return false;
            }
            if (Double.compare(matrix.c, this.c) != 0) {
                return false;
            }
            if (Double.compare(matrix.d, this.d) != 0) {
                return false;
            }
            if (Double.compare(matrix.tx, this.tx) != 0) {
                return false;
            }
            if (Double.compare(matrix.ty, this.ty) != 0) {
                return false;
            }
            if (Double.compare(matrix.u, this.u) != 0) {
                return false;
            }
            if (Double.compare(matrix.v, this.v) != 0) {
                return false;
            }
            if (Double.compare(matrix.w, this.w) != 0) {
                return false;
            }
        }
        return true;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.a);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.b);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.u);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.c);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.d);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.v);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.tx);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.ty);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.w);
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.u);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.v);
        final int n2 = n * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.w);
        final int n3 = n2 * 31 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.a);
        final int n4 = n3 * 31 + (int)(doubleToLongBits4 ^ doubleToLongBits4 >>> 32);
        final long doubleToLongBits5 = Double.doubleToLongBits(this.b);
        final int n5 = n4 * 31 + (int)(doubleToLongBits5 ^ doubleToLongBits5 >>> 32);
        final long doubleToLongBits6 = Double.doubleToLongBits(this.c);
        final int n6 = n5 * 31 + (int)(doubleToLongBits6 ^ doubleToLongBits6 >>> 32);
        final long doubleToLongBits7 = Double.doubleToLongBits(this.d);
        final int n7 = n6 * 31 + (int)(doubleToLongBits7 ^ doubleToLongBits7 >>> 32);
        final long doubleToLongBits8 = Double.doubleToLongBits(this.tx);
        final int n8 = n7 * 31 + (int)(doubleToLongBits8 ^ doubleToLongBits8 >>> 32);
        final long doubleToLongBits9 = Double.doubleToLongBits(this.ty);
        return n8 * 31 + (int)(doubleToLongBits9 ^ doubleToLongBits9 >>> 32);
    }
    
    @Override
    public String toString() {
        if (this.equals(Matrix.ROTATE_0)) {
            return "Rotate 0°";
        }
        if (this.equals(Matrix.ROTATE_90)) {
            return "Rotate 90°";
        }
        if (this.equals(Matrix.ROTATE_180)) {
            return "Rotate 180°";
        }
        if (this.equals(Matrix.ROTATE_270)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.u + ", v=" + this.v + ", w=" + this.w + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", tx=" + this.tx + ", ty=" + this.ty + '}';
    }
}
