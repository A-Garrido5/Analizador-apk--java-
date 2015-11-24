// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Pack;
import org.spongycastle.util.Memoable;
import org.spongycastle.crypto.ExtendedDigest;

public abstract class GeneralDigest implements ExtendedDigest, Memoable
{
    private static final int BYTE_LENGTH = 64;
    public static boolean a;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;
    
    protected GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }
    
    protected GeneralDigest(final GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        this.copyIn(generalDigest);
    }
    
    protected GeneralDigest(final byte[] array) {
        System.arraycopy(array, 0, this.xBuf = new byte[4], 0, this.xBuf.length);
        this.xBufOff = Pack.bigEndianToInt(array, 4);
        this.byteCount = Pack.bigEndianToLong(array, 8);
    }
    
    protected void copyIn(final GeneralDigest generalDigest) {
        System.arraycopy(generalDigest.xBuf, 0, this.xBuf, 0, generalDigest.xBuf.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }
    
    public void finish() {
        final boolean a = GeneralDigest.a;
        final long n = this.byteCount << 3;
        this.update((byte)(-128));
        while (this.xBufOff != 0) {
            this.update((byte)0);
            if (a) {
                break;
            }
        }
        this.processLength(n);
        this.processBlock();
    }
    
    @Override
    public int getByteLength() {
        return 64;
    }
    
    protected void populateState(final byte[] array) {
        System.arraycopy(this.xBuf, 0, array, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, array, 4);
        Pack.longToBigEndian(this.byteCount, array, 8);
    }
    
    protected abstract void processBlock();
    
    protected abstract void processLength(final long p0);
    
    protected abstract void processWord(final byte[] p0, final int p1);
    
    @Override
    public void reset() {
        final boolean a = GeneralDigest.a;
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (i < this.xBuf.length) {
            this.xBuf[i] = 0;
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    @Override
    public void update(final byte b) {
        this.xBuf[this.xBufOff++] = b;
        if (this.xBufOff == this.xBuf.length) {
            this.processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        ++this.byteCount;
    }
    
    @Override
    public void update(final byte[] array, int n, int i) {
        final boolean a = GeneralDigest.a;
        while (this.xBufOff != 0 && i > 0) {
            this.update(array[n]);
            ++n;
            --i;
            if (a) {
                break;
            }
        }
        while (i > this.xBuf.length) {
            this.processWord(array, n);
            n += this.xBuf.length;
            i -= this.xBuf.length;
            this.byteCount += this.xBuf.length;
            if (a) {
                break;
            }
        }
        while (i > 0) {
            this.update(array[n]);
            ++n;
            --i;
            if (a) {
                break;
            }
        }
    }
}
