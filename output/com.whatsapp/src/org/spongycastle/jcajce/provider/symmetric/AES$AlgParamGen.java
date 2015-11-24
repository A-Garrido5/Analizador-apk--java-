// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;
import java.security.AlgorithmParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;

public class AES$AlgParamGen extends BaseAlgorithmParameterGenerator
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "bi.Rb\\vaScIb.`{Ki|HcDk^@eMkkUr^U~Dt\f`aS7mC]\u0001gMtoLrXc|\u0001pIhkSvXoaO9".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0017';
                    break;
                }
                case 0: {
                    c2 = ',';
                    break;
                }
                case 1: {
                    c2 = '\u0006';
                    break;
                }
                case 2: {
                    c2 = '\u000e';
                    break;
                }
                case 3: {
                    c2 = '!';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u007fE".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0017';
                    break;
                }
                case 0: {
                    c4 = ',';
                    break;
                }
                case 1: {
                    c4 = '\u0006';
                    break;
                }
                case 2: {
                    c4 = '\u000e';
                    break;
                }
                case 3: {
                    c4 = '!';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "mC]".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0017';
                    break;
                }
                case 0: {
                    c6 = ',';
                    break;
                }
                case 1: {
                    c6 = '\u0006';
                    break;
                }
                case 2: {
                    c6 = '\u000e';
                    break;
                }
                case 3: {
                    c6 = '!';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    @Override
    protected AlgorithmParameters engineGenerateParameters() {
        final byte[] array = new byte[16];
        try {
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(array);
            final String[] array2 = AES$AlgParamGen.z;
            final int n = 2;
            final String s = array2[n];
            final String[] array3 = AES$AlgParamGen.z;
            final int n2 = 1;
            final String s2 = array3[n2];
            final AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(s, s2);
            final AlgorithmParameters algorithmParameters3;
            final AlgorithmParameters algorithmParameters2 = algorithmParameters3 = algorithmParameters;
            final byte[] array4 = array;
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(array4);
            algorithmParameters3.init(ivParameterSpec);
            return algorithmParameters2;
        }
        catch (Exception ex) {
            throw ex;
        }
        try {
            final String[] array2 = AES$AlgParamGen.z;
            final int n = 2;
            final String s = array2[n];
            final String[] array3 = AES$AlgParamGen.z;
            final int n2 = 1;
            final String s2 = array3[n2];
            final AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(s, s2);
            final AlgorithmParameters algorithmParameters3;
            final AlgorithmParameters algorithmParameters2 = algorithmParameters3 = algorithmParameters;
            final byte[] array4 = array;
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(array4);
            algorithmParameters3.init(ivParameterSpec);
            return algorithmParameters2;
        }
        catch (Exception ex2) {
            throw new RuntimeException(ex2.getMessage());
        }
    }
    
    @Override
    protected void engineInit(final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException(AES$AlgParamGen.z[0]);
    }
}
