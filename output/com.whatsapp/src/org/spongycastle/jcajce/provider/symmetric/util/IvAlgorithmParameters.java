// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.util.Arrays;

public class IvAlgorithmParameters extends BaseAlgorithmParameters
{
    private static final String[] z;
    private byte[] iv;
    
    static {
        final String[] z2 = new String[7];
        final char[] charArray = "\u0010A\u0011lw+v\\Yb<eB".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0016';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = '1';
                    break;
                }
                case 3: {
                    c2 = '<';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = ",yZRy.y\u0011Lw+v\\Yb<e\u0011Of<t\u0011Lw*dTX6-x\u0011u@ygPNw4rEYd*7^^|<tE\u0012".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0016';
                    break;
                }
                case 0: {
                    c4 = 'Y';
                    break;
                }
                case 1: {
                    c4 = '\u0017';
                    break;
                }
                case 2: {
                    c4 = '1';
                    break;
                }
                case 3: {
                    c4 = '<';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0010aa]d8zTHs+DAYuyeTMc0eTX6-x\u0011Ux0cX]z0dT\u001cwy^g\u001cf8ePQs-rCO68{VSd0cYQ6)vC]{<cTNeyxSVs:c".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0016';
                    break;
                }
                case 0: {
                    c6 = 'Y';
                    break;
                }
                case 1: {
                    c6 = '\u0017';
                    break;
                }
                case 2: {
                    c6 = '1';
                    break;
                }
                case 3: {
                    c6 = '<';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u000bVf".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0016';
                    break;
                }
                case 0: {
                    c8 = 'Y';
                    break;
                }
                case 1: {
                    c8 = '\u0017';
                    break;
                }
                case 2: {
                    c8 = '1';
                    break;
                }
                case 3: {
                    c8 = '<';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0018D\u007f\u0012'".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0016';
                    break;
                }
                case 0: {
                    c10 = 'Y';
                    break;
                }
                case 1: {
                    c10 = '\u0017';
                    break;
                }
                case 2: {
                    c10 = '1';
                    break;
                }
                case 3: {
                    c10 = '<';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u000bVf".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0016';
                    break;
                }
                case 0: {
                    c12 = 'Y';
                    break;
                }
                case 1: {
                    c12 = '\u0017';
                    break;
                }
                case 2: {
                    c12 = '1';
                    break;
                }
                case 3: {
                    c12 = '<';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\fyZRy.y\u0011Lw+v\\Yb<eB\u001cp6e\\]by~_\u001c_\u000f7A]d8zTHs+d\u0011St3rRH".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0016';
                    break;
                }
                case 0: {
                    c14 = 'Y';
                    break;
                }
                case 1: {
                    c14 = '\u0017';
                    break;
                }
                case 2: {
                    c14 = '1';
                    break;
                }
                case 3: {
                    c14 = '<';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        z = z2;
    }
    
    @Override
    protected byte[] engineGetEncoded() {
        return this.engineGetEncoded(IvAlgorithmParameters.z[4]);
    }
    
    @Override
    protected byte[] engineGetEncoded(final String s) {
        if (s.equals(IvAlgorithmParameters.z[3])) {
            return Arrays.clone(this.iv);
        }
        return null;
    }
    
    @Override
    protected void engineInit(final AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException(IvAlgorithmParameters.z[2]);
        }
        this.iv = ((IvParameterSpec)algorithmParameterSpec).getIV();
    }
    
    @Override
    protected void engineInit(final byte[] array) {
        this.iv = Arrays.clone(array);
    }
    
    @Override
    protected void engineInit(final byte[] array, final String s) {
        if (s.equals(IvAlgorithmParameters.z[5])) {
            this.engineInit(array);
            return;
        }
        throw new IOException(IvAlgorithmParameters.z[6]);
    }
    
    @Override
    protected String engineToString() {
        return IvAlgorithmParameters.z[0];
    }
    
    @Override
    protected AlgorithmParameterSpec localEngineGetParameterSpec(final Class clazz) {
        if (clazz == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException(IvAlgorithmParameters.z[1]);
    }
}
