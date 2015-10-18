// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher
{
    private static final String[] z;
    private final BlockCipher cipher;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "\u0001I8n\r\u001a\u001c.k\u001e\bY>>\f\u0001Slm\u0010\u0001N8".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = 'n';
                    break;
                }
                case 1: {
                    c2 = '<';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '\u001e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0007R<k\fN^9x\u001e\u000bNlj\u0017\u0001\u001c?s\u0019\u0002P".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'x';
                    break;
                }
                case 0: {
                    c4 = 'n';
                    break;
                }
                case 1: {
                    c4 = '<';
                    break;
                }
                case 2: {
                    c4 = 'L';
                    break;
                }
                case 3: {
                    c4 = '\u001e';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    protected StreamBlockCipher(final BlockCipher cipher) {
        this.cipher = cipher;
    }
    
    protected abstract byte calculateByte(final byte p0);
    
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
    
    @Override
    public int processBytes(final byte[] array, int i, final int n, final byte[] array2, int n2) {
        final int a = DataLengthException.a;
        final int n3 = n2 + n;
        try {
            if (n3 > array2.length) {
                throw new DataLengthException(StreamBlockCipher.z[0]);
            }
        }
        catch (DataLengthException ex) {
            throw ex;
        }
        final int n4 = i + n;
        try {
            if (n4 > array.length) {
                throw new DataLengthException(StreamBlockCipher.z[1]);
            }
        }
        catch (DataLengthException ex2) {
            throw ex2;
        }
        while (i < i + n) {
            final int n5 = n2 + 1;
            final int n6 = i + 1;
            array2[n2] = this.calculateByte(array[i]);
            if (a != 0) {
                break;
            }
            n2 = n5;
            i = n6;
        }
        return n;
    }
    
    @Override
    public final byte returnByte(final byte b) {
        return this.calculateByte(b);
    }
}
