// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.params;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.crypto.CipherParameters;

public class ParametersWithIV implements CipherParameters
{
    public static boolean a;
    private byte[] iv;
    private CipherParameters parameters;
    
    public ParametersWithIV(final CipherParameters cipherParameters, final byte[] array) {
        this(cipherParameters, array, 0, array.length);
    }
    
    public ParametersWithIV(final CipherParameters parameters, final byte[] array, final int n, final int n2) {
        final boolean a = ParametersWithIV.a;
        this.iv = new byte[n2];
        this.parameters = parameters;
        System.arraycopy(array, n, this.iv, 0, n2);
        if (a) {
            final boolean a2 = BaseKeyGenerator.a;
            boolean a3 = false;
            if (!a2) {
                a3 = true;
            }
            BaseKeyGenerator.a = a3;
        }
    }
    
    public byte[] getIV() {
        return this.iv;
    }
    
    public CipherParameters getParameters() {
        return this.parameters;
    }
}
