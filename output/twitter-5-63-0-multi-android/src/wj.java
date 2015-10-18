import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.BufferedInputStream;
import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.security.KeyStore;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class wj
{
    public static final Map a;
    public static final String[] b;
    public static final String[] c;
    private static KeyStore d;
    
    static {
        c = new String[] { "api.twitter.com" };
        final HashMap<String, String> a2 = (HashMap<String, String>)new HashMap<String, Object>();
        a2.put("VERISIGN_CLASS1", "2343d148a255899b947d461a797ec04cfed170b7");
        a2.put("VERISIGN_CLASS1_G3", "5519b278acb281d7eda7abc18399c3bb690424b5");
        a2.put("VERISIGN_CLASS2_G2", "1237ba4517eead2926fdc1cdfebeedf2ded9145c");
        a2.put("VERISIGN_CLASS2_G3", "5abec575dcaef3b08e271943fc7f250c3df661e3");
        a2.put("VERISIGN_CLASS3", "e27f7bd877d5df9e0a3f9eb4cb0e2ea9efdb6977");
        a2.put("VERISIGN_CLASS3_G2", "1a21b4952b6293ce18b365ec9c0e934cb381e6d4");
        a2.put("VERISIGN_CLASS3_G3", "22f19e2ec6eaccfc5d2346f4c2e8f6c554dd5e07");
        a2.put("VERISIGN_CLASS3_G4", "ed663135d31bd4eca614c429e319069f94c12650");
        a2.put("VERISIGN_CLASS3_G5", "b181081a19a4c0941ffae89528c124c99b34acc7");
        a2.put("VERISIGN_CLASS4_G3", "3c03436868951cf3692ab8b426daba8fe922e5bd");
        a2.put("VERISIGN_UNIVERSAL", "bbc23e290bb328771dad3ea24dbdf423bd06b03d");
        a2.put("GEOTRUST_GLOBAL", "c07a98688d89fbab05640c117daa7d65b8cacc4e");
        a2.put("GEOTRUST_GLOBAL2", "713836f2023153472b6eba6546a9101558200509");
        a2.put("GEOTRUST_PRIMARY", "b01989e7effb4aafcb148f58463976224150e1ba");
        a2.put("GEOTRUST_PRIMARY_G2", "bdbea71bab7157f9e475d954d2b727801a822682");
        a2.put("GEOTRUST_PRIMARY_G3", "9ca98d00af740ddd8180d21345a58b8f2e9438d6");
        a2.put("GEOTRUST_UNIVERAL", "87e85b6353c623a3128cb0ffbbf551fe59800e22");
        a2.put("GEOTRUST_UNIVERSAL2", "5e4f538685dd4f9eca5fdc0d456f7d51b1dc9b7b");
        a2.put("DIGICERT_GLOBAL_ROOT", "d52e13c1abe349dae8b49594ef7c3843606466bd");
        a2.put("DIGICERT_EV_ROOT", "83317e62854253d6d7783190ec919056e991b9e3");
        a2.put("DIGICERT_ASSUREDID_ROOT", "68330e61358521592983a3c8d2d2e1406e7ab3c1");
        a2.put("TWITTER1", "56fef3c2147d4ed38837fdbd3052387201e5778d");
        a = a2;
        final Collection<Object> values = a2.values();
        b = values.toArray(new String[values.size()]);
    }
    
    public static KeyStore a(final Context context) {
        synchronized (wj.class) {
            if (wj.d == null) {
                wj.d = b(context);
            }
            return wj.d;
        }
    }
    
    private static KeyStore b(final Context context) {
        try {
            final KeyStore instance = KeyStore.getInstance("BKS");
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(lf.cacerts), 143360);
            try {
                instance.load(bufferedInputStream, "changeit".toCharArray());
                return instance;
            }
            finally {
                yh.a((Closeable)bufferedInputStream);
            }
        }
        catch (KeyStoreException ex) {}
        catch (NoSuchAlgorithmException o) {
            goto Label_0052;
        }
        catch (CertificateException o) {
            goto Label_0052;
        }
        catch (IOException o) {
            goto Label_0052;
        }
        catch (Resources$NotFoundException o) {
            goto Label_0052;
        }
    }
}
