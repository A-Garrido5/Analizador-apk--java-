// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.spec.PBEParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import javax.crypto.spec.PBEKeySpec;

public class PBE$Util
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "H\u0007yL\rJ\u00072F\u000bZ\faVBN\nzG\u000fXItM\u0010\u001d9PgBm\"QqWn[2G\f^\u001bkR\u0016T\u0006|\f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'b';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = 'i';
                    break;
                }
                case 2: {
                    c2 = '\u0012';
                    break;
                }
                case 3: {
                    c2 = '\"';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "H\u0007yL\rJ\u00072V\u001bM\f2Q\u0001U\f\u007fGB[\u0006`\u00022\u007f,2G\f^\u001bkR\u0016T\u0006|\f".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'b';
                    break;
                }
                case 0: {
                    c4 = '=';
                    break;
                }
                case 1: {
                    c4 = 'i';
                    break;
                }
                case 2: {
                    c4 = '\u0012';
                    break;
                }
                case 3: {
                    c4 = '\"';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "s\fwFB\\IB`'m\b`C\u000fX\u001dwPBN\u0019wABJ\u0000fJB\\IB`'\u001d\u0002w[L".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'b';
                    break;
                }
                case 0: {
                    c6 = '=';
                    break;
                }
                case 1: {
                    c6 = 'i';
                    break;
                }
                case 2: {
                    c6 = '\u0012';
                    break;
                }
                case 3: {
                    c6 = '\"';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "s\fwFB\\IB`'m\b`C\u000fX\u001dwPBN\u0019wABJ\u0000fJB\\IB`'\u001d\u0002w[L".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'b';
                    break;
                }
                case 0: {
                    c8 = '=';
                    break;
                }
                case 1: {
                    c8 = 'i';
                    break;
                }
                case 2: {
                    c8 = '\u0012';
                    break;
                }
                case 3: {
                    c8 = '\"';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    private static byte[] convertPassword(final int n, final PBEKeySpec pbeKeySpec) {
        if (n == 5) {
            final byte[] array = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pbeKeySpec.getPassword());
            if (BaseMac.a == 0) {
                return array;
            }
        }
        return PBEParametersGenerator.PKCS5PasswordToBytes(pbeKeySpec.getPassword());
    }
    
    private static PBEParametersGenerator makePBEGenerator(final int n, final int n2) {
        final int a = BaseMac.a;
        if (n == 1 || n == 5) {
            while (true) {
                Label_0104: {
                    switch (n2) {
                        case 0: {
                            final PKCS5S2ParametersGenerator pkcs5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new MD5Digest());
                            if (a != 0) {
                                break Label_0104;
                            }
                            return pkcs5S2ParametersGenerator;
                        }
                        case 1: {
                            final PKCS5S2ParametersGenerator pkcs5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
                            if (a != 0) {
                                break Label_0104;
                            }
                            return pkcs5S2ParametersGenerator;
                        }
                        case 4: {
                            final PKCS5S2ParametersGenerator pkcs5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
                            if (a == 0) {
                                return pkcs5S2ParametersGenerator;
                            }
                            break;
                        }
                    }
                }
                try {
                    throw new IllegalStateException(PBE$Util.z[0]);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                continue;
            }
        }
        throw new IllegalStateException(PBE$Util.z[1]);
    }
    
    public static CipherParameters makePBEMacParameters(final PBEKeySpec pbeKeySpec, final int n, final int n2, final int n3) {
        final int a = BaseMac.a;
        final PBEParametersGenerator pbeGenerator = makePBEGenerator(n, n2);
        final byte[] convertPassword = convertPassword(n, pbeKeySpec);
        pbeGenerator.init(convertPassword, pbeKeySpec.getSalt(), pbeKeySpec.getIterationCount());
        final CipherParameters generateDerivedMacParameters = pbeGenerator.generateDerivedMacParameters(n3);
        int i = 0;
        while (i != convertPassword.length) {
            convertPassword[i] = 0;
            ++i;
            if (a != 0) {
                break;
            }
        }
        return generateDerivedMacParameters;
    }
    
    public static CipherParameters makePBEMacParameters(final BCPBEKey bcpbeKey, final AlgorithmParameterSpec algorithmParameterSpec) {
        final int a = BaseMac.a;
        while (true) {
            if (algorithmParameterSpec != null) {
                try {
                    if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        throw new IllegalArgumentException(PBE$Util.z[2]);
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final PBEParameterSpec pbeParameterSpec = (PBEParameterSpec)algorithmParameterSpec;
                final PBEParametersGenerator pbeGenerator = makePBEGenerator(bcpbeKey.getType(), bcpbeKey.getDigest());
                byte[] encoded = bcpbeKey.getEncoded();
                if (bcpbeKey.shouldTryWrongPKCS12()) {
                    encoded = new byte[2];
                }
                pbeGenerator.init(encoded, pbeParameterSpec.getSalt(), pbeParameterSpec.getIterationCount());
                final CipherParameters generateDerivedMacParameters = pbeGenerator.generateDerivedMacParameters(bcpbeKey.getKeySize());
                int i = 0;
                while (i != encoded.length) {
                    encoded[i] = 0;
                    ++i;
                    if (a != 0) {
                        break;
                    }
                }
                return generateDerivedMacParameters;
            }
            continue;
        }
    }
    
    public static CipherParameters makePBEParameters(final PBEKeySpec pbeKeySpec, final int n, final int n2, final int n3, final int n4) {
        final int a = BaseMac.a;
        final PBEParametersGenerator pbeGenerator = makePBEGenerator(n, n2);
        final byte[] convertPassword = convertPassword(n, pbeKeySpec);
        pbeGenerator.init(convertPassword, pbeKeySpec.getSalt(), pbeKeySpec.getIterationCount());
        CipherParameters cipherParameters = null;
        Label_0062: {
            if (n4 != 0) {
                cipherParameters = pbeGenerator.generateDerivedParameters(n3, n4);
                if (a == 0) {
                    break Label_0062;
                }
            }
            cipherParameters = pbeGenerator.generateDerivedParameters(n3);
        }
        int i = 0;
        while (i != convertPassword.length) {
            convertPassword[i] = 0;
            ++i;
            if (a != 0) {
                break;
            }
        }
        return cipherParameters;
    }
    
    public static CipherParameters makePBEParameters(final BCPBEKey bcpbeKey, final AlgorithmParameterSpec algorithmParameterSpec, final String s) {
        final int a = BaseMac.a;
        while (true) {
            if (algorithmParameterSpec != null) {
                try {
                    if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        throw new IllegalArgumentException(PBE$Util.z[3]);
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final PBEParameterSpec pbeParameterSpec = (PBEParameterSpec)algorithmParameterSpec;
                final PBEParametersGenerator pbeGenerator = makePBEGenerator(bcpbeKey.getType(), bcpbeKey.getDigest());
                byte[] encoded = bcpbeKey.getEncoded();
                if (bcpbeKey.shouldTryWrongPKCS12()) {
                    encoded = new byte[2];
                }
                pbeGenerator.init(encoded, pbeParameterSpec.getSalt(), pbeParameterSpec.getIterationCount());
                CipherParameters cipherParameters = null;
                Label_0124: {
                    if (bcpbeKey.getIvSize() != 0) {
                        cipherParameters = pbeGenerator.generateDerivedParameters(bcpbeKey.getKeySize(), bcpbeKey.getIvSize());
                        if (a == 0) {
                            break Label_0124;
                        }
                    }
                    cipherParameters = pbeGenerator.generateDerivedParameters(bcpbeKey.getKeySize());
                }
                int i = 0;
                while (i != encoded.length) {
                    encoded[i] = 0;
                    ++i;
                    if (a != 0) {
                        break;
                    }
                }
                return cipherParameters;
            }
            continue;
        }
    }
}
