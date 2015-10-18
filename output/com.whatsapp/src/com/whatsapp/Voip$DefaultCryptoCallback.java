// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.math.BigInteger;

public class Voip$DefaultCryptoCallback implements Voip$CryptoCallback
{
    private static final BigInteger G;
    private static final BigInteger P;
    private static final String[] z;
    private final SecureRandom secureRandom;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u00176;lDMf,|\u0001\u001ew;~\rRw/s\u0001\u001e>";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Wx>j\u0002X\u007f.v\u0001Pbml\u0014_u(?\u0002Qdml\u001dS{(k\u0016Wumt\u0001G6`!D[x.p\u0000[rms\u0001Pq9wD\u0016";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Wx>j\u0002X\u007f.v\u0001Pbml\u0014_u(?\u0002Qdmo\u0011\\z$|DUs4?I\u00006(q\u0007Qr({DRs#x\u0010V6e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00176;lDMf,|\u0001\u001ew;~\rRw/s\u0001\u001e>";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "xP\u000bY\"xP\u000bY\"xP\u000bY\"xUt/\"zW\f-V\u000f u\\V\r\"\u000e+'\b \u007f'&\u0006&\t\\U}R|-]\u000e$yZT\u0006.\f)S}Uz+T\f&\u000f]!\u007f ~]U\r/\u000f-V\u000b'y^T\u0006!t'!\r\"}+ zS\u000b&Q\u000f/\u000f,'z%\f+W\u000fT~/V|&\f) x$xYU\n%z+\"{'~*Rz \t*U}$y*!\n.x]Q\t {-Q{!\b\\Rx\"y\\P\fSt^R\r!\b[R|&\u000fY\"\u000bU\u000f)\"\n&{]S{R\bZW\u0006 \u000fY&\u000bWu&]xWx^!\u0007P\u007f+U\u000f!\u000e+&\u000fP\b)P\u0007$u)R\u000b'\b\\!\n#\u000f, }$}/S}Tu^U\b%\u000fYT\u000b/u[%\n.~)U}#x[W\u0007W{&U\b%\u000b^\\xR\u007f+'x#\u000b'W\b#x[V\rR\u000e^W\u007fRt)U} \u007fYW\u000b \u007f/\\\u000b#\u007f]&\u0007S\t*V\u0007&z(T\u0007 t)Rz z/'\r#yZP\u007fT\u000e&\\\u000e\"\u000b.S\n \u000e/\\}W\u007f,S\r$zY\"xP\u000bY\"xP\u000bY\"xP\u000bY";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        P = new BigInteger(Voip$DefaultCryptoCallback.z[4], 16);
        G = BigInteger.valueOf(2L);
    }
    
    public Voip$DefaultCryptoCallback() {
        this.secureRandom = new SecureRandom();
    }
    
    @Override
    public BigInteger generateDiffieHellmanSharedPublicKey(final byte[] array) {
        final boolean i = App.I;
        final byte[] array2 = new byte[193];
        this.secureRandom.nextBytes(array2);
        array2[0] = 0;
        final BigInteger bigInteger = new BigInteger(array2);
        final byte[] byteArray = Voip$DefaultCryptoCallback.G.modPow(bigInteger, Voip$DefaultCryptoCallback.P).toByteArray();
        int n = 0;
        Label_0178: {
            if (byteArray.length > array.length) {
                int j = 0;
                while (j < byteArray.length - array.length) {
                    if (byteArray[j] != 0) {
                        Log.e(Voip$DefaultCryptoCallback.z[2] + byteArray.length + Voip$DefaultCryptoCallback.z[3] + array.length + ")");
                        return null;
                    }
                    ++j;
                    if (i) {
                        break;
                    }
                }
                n = byteArray.length - array.length;
                if (!i) {
                    break Label_0178;
                }
            }
            else {
                n = 0;
            }
            if (byteArray.length < array.length) {
                int k = 0;
                while (k < array.length - byteArray.length) {
                    array[k] = 0;
                    ++k;
                    if (i) {
                        break;
                    }
                }
            }
        }
        System.arraycopy(byteArray, n, array, Math.max(array.length - byteArray.length, 0), Math.min(array.length, byteArray.length));
        return bigInteger;
    }
    
    @Override
    public boolean generateDiffieHellmanSymmetricKey(final BigInteger bigInteger, byte[] array, final byte[] array2) {
        final boolean i = App.I;
        if (array[0] != 0) {
            final byte[] array3 = new byte[1 + array.length];
            array3[0] = 0;
            System.arraycopy(array, 0, array3, 1, array.length);
            array = array3;
        }
        final byte[] byteArray = new BigInteger(array).modPow(bigInteger, Voip$DefaultCryptoCallback.P).toByteArray();
        int n = 0;
        Label_0190: {
            if (byteArray.length > array2.length) {
                int j = 0;
                while (j < byteArray.length - array2.length) {
                    if (byteArray[j] != 0) {
                        Log.e(Voip$DefaultCryptoCallback.z[1] + byteArray.length + Voip$DefaultCryptoCallback.z[0] + array2.length + ")");
                        return false;
                    }
                    ++j;
                    if (i) {
                        break;
                    }
                }
                n = byteArray.length - array2.length;
                if (!i) {
                    break Label_0190;
                }
            }
            else {
                n = 0;
            }
            if (byteArray.length < array2.length) {
                int k = 0;
                while (k < array2.length - byteArray.length) {
                    array2[k] = 0;
                    ++k;
                    if (i) {
                        break;
                    }
                }
            }
        }
        System.arraycopy(byteArray, n, array2, Math.max(array2.length - byteArray.length, 0), Math.min(array2.length, byteArray.length));
        return true;
    }
    
    @Override
    public byte[] generateRandomBytes(final int n) {
        final byte[] array = new byte[n];
        this.secureRandom.nextBytes(array);
        return array;
    }
}
