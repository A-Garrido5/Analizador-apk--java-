// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.KeyParameter;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.spec.PBEParameterSpec;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import org.spongycastle.crypto.Mac;
import javax.crypto.MacSpi;

public class BaseMac extends MacSpi implements PBE
{
    public static int a;
    private static final String[] z;
    private Mac macEngine;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u007f-30\u007fJ\u001e\u0003y\u007fJ\u001cV@OjO\u0006q\u007fN\u0002\u0013dh]\u001cVdb\u000f\r\u00130~J\u001bX".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\r';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = '\u0010';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "D\n\u000f0d\\O\u0018eaC".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\r';
                    break;
                }
                case 0: {
                    c4 = '/';
                    break;
                }
                case 1: {
                    c4 = 'o';
                    break;
                }
                case 2: {
                    c4 = 'v';
                    break;
                }
                case 3: {
                    c4 = '\u0010';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "Z\u0001\u001d~bX\u0001V`l]\u000e\u001buyJ\u001dVdt_\nX".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\r';
                    break;
                }
                case 0: {
                    c6 = '/';
                    break;
                }
                case 1: {
                    c6 = 'o';
                    break;
                }
                case 2: {
                    c6 = 'v';
                    break;
                }
                case 3: {
                    c6 = '\u0010';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    protected BaseMac(final Mac macEngine) {
        this.macEngine = macEngine;
    }
    
    @Override
    protected byte[] engineDoFinal() {
        final byte[] array = new byte[this.engineGetMacLength()];
        this.macEngine.doFinal(array, 0);
        return array;
    }
    
    @Override
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }
    
    @Override
    protected void engineInit(final Key key, final AlgorithmParameterSpec algorithmParameterSpec) {
        final int a = BaseMac.a;
        if (key == null) {
            throw new InvalidKeyException(BaseMac.z[1]);
        }
        CipherParameters pbeMacParameters = null;
        Label_0173: {
            if (key instanceof BCPBEKey) {
                final BCPBEKey bcpbeKey = (BCPBEKey)key;
                Label_0089: {
                    if (bcpbeKey.getParam() != null) {
                        final CipherParameters param = bcpbeKey.getParam();
                        if (a == 0) {
                            pbeMacParameters = param;
                            break Label_0089;
                        }
                    }
                    if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        pbeMacParameters = PBE$Util.makePBEMacParameters(bcpbeKey, algorithmParameterSpec);
                        if (a == 0) {
                            break Label_0089;
                        }
                    }
                    throw new InvalidAlgorithmParameterException(BaseMac.z[0]);
                }
                if (a == 0) {
                    break Label_0173;
                }
            }
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                final ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmParameterSpec).getIV());
                if (a == 0) {
                    pbeMacParameters = parametersWithIV;
                    break Label_0173;
                }
            }
            if (algorithmParameterSpec == null) {
                pbeMacParameters = new KeyParameter(key.getEncoded());
                if (a == 0) {
                    break Label_0173;
                }
            }
            throw new InvalidAlgorithmParameterException(BaseMac.z[2]);
        }
        this.macEngine.init(pbeMacParameters);
    }
    
    @Override
    protected void engineReset() {
        this.macEngine.reset();
    }
    
    @Override
    protected void engineUpdate(final byte b) {
        this.macEngine.update(b);
    }
    
    @Override
    protected void engineUpdate(final byte[] array, final int n, final int n2) {
        this.macEngine.update(array, n, n2);
    }
}
