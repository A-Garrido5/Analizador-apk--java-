// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.AlgorithmParameterSpec;
import java.security.AlgorithmParametersSpi;

public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi
{
    private static final String z;
    
    static {
        final char[] charArray = "T\u000b\u0013\u000e\u007fP\u0017\u0000[fZY\u0013\u001efe\u0018\u0006\u001a\u007fP\r\u0011\tAE\u001c\u0017[\u007f@\n\u0000[|Z\rT\u0019w\u0015\u0017\u0001\u0017~".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '5';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = '{';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    protected AlgorithmParameterSpec engineGetParameterSpec(final Class clazz) {
        if (clazz == null) {
            try {
                throw new NullPointerException(BaseAlgorithmParameters.z);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return this.localEngineGetParameterSpec(clazz);
    }
    
    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(final Class p0);
}
