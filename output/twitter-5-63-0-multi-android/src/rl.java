import android.text.TextUtils;
import com.twitter.library.service.f;
import android.os.Bundle;
import com.twitter.library.api.ad;
import com.twitter.library.service.aa;
import android.preference.PreferenceManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class rl
{
    public static String a(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("debug_card_commerce_host_v2", (String)null);
    }
    
    public static void a(final aa aa, final ad ad) {
        if (ad.b() != null) {
            aa.c.putBundle("commerce_error_list_bundle", (Bundle)ad.b());
            return;
        }
        aa.c.putBundle("commerce_error_list_bundle", rd.a(aa, "commerce_bundle_errors"));
    }
    
    public static void a(final f f, final Context context) {
        final String a = a(context);
        if (!TextUtils.isEmpty((CharSequence)a)) {
            f.b(a);
        }
    }
    
    public static String b(final Context context) {
        return context.getString(lg.twitter_authority);
    }
}
