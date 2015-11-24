// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

import org.spongycastle.util.Strings;

public abstract class PBEParametersGenerator
{
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;
    
    public static byte[] PKCS12PasswordToBytes(final char[] array) {
        int i = 0;
        final int a = DataLengthException.a;
        if (array != null) {
            try {
                if (array.length > 0) {
                    final byte[] array2 = new byte[2 * (1 + array.length)];
                    while (i != array.length) {
                        array2[i * 2] = (byte)(array[i] >>> 8);
                        array2[1 + i * 2] = (byte)array[i];
                        ++i;
                        if (a != 0) {
                            break;
                        }
                    }
                    return array2;
                }
            }
            catch (DataLengthException ex) {
                throw ex;
            }
        }
        return new byte[0];
    }
    
    public static byte[] PKCS5PasswordToBytes(final char[] array) {
        int i = 0;
        final int a = DataLengthException.a;
        if (array != null) {
            final byte[] array2 = new byte[array.length];
            while (i != array2.length) {
                array2[i] = (byte)array[i];
                ++i;
                if (a != 0) {
                    break;
                }
            }
            return array2;
        }
        return new byte[0];
    }
    
    public static byte[] PKCS5PasswordToUTF8Bytes(final char[] array) {
        if (array != null) {
            try {
                return Strings.toUTF8ByteArray(array);
            }
            catch (DataLengthException ex) {
                throw ex;
            }
        }
        return new byte[0];
    }
    
    public abstract CipherParameters generateDerivedMacParameters(final int p0);
    
    public abstract CipherParameters generateDerivedParameters(final int p0);
    
    public abstract CipherParameters generateDerivedParameters(final int p0, final int p1);
    
    public int getIterationCount() {
        return this.iterationCount;
    }
    
    public byte[] getPassword() {
        return this.password;
    }
    
    public byte[] getSalt() {
        return this.salt;
    }
    
    public void init(final byte[] password, final byte[] salt, final int iterationCount) {
        this.password = password;
        this.salt = salt;
        this.iterationCount = iterationCount;
    }
}
