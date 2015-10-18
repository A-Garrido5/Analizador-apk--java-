import com.twitter.library.provider.bg;
import com.twitter.util.c;
import com.twitter.library.client.App;
import com.twitter.library.client.az;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.accounts.Account;
import com.twitter.library.client.k;
import android.preference.PreferenceManager;
import com.twitter.library.util.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class tn extends ts
{
    private void a(final Context context) {
        final Account[] a = com.twitter.library.util.a.a(context);
        if (a.length != 0) {
            final String[] array = { "auto_clean", "antispam_last_poll_timestamp" };
            final String[] array2 = { "notifications_follow_only", "connect_tab" };
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            final SharedPreferences$Editor edit = defaultSharedPreferences.edit();
            final int length = array.length;
            boolean b = false;
            for (final String s : array) {
                if (defaultSharedPreferences.contains(s)) {
                    final long long1 = defaultSharedPreferences.getLong(s, 0L);
                    for (int length2 = a.length, j = 0; j < length2; ++j) {
                        new k(context, a[j].name).a().a(s, long1).apply();
                    }
                    edit.remove(s);
                    b = true;
                }
            }
            for (final String s2 : array2) {
                if (defaultSharedPreferences.contains(s2)) {
                    final boolean boolean1 = defaultSharedPreferences.getBoolean(s2, false);
                    for (int length4 = a.length, l = 0; l < length4; ++l) {
                        new k(context, a[l].name).a().a(s2, boolean1).apply();
                    }
                    edit.remove(s2);
                    b = true;
                }
            }
            if (b) {
                edit.apply();
            }
        }
    }
    
    @Override
    protected boolean a() {
        return true;
    }
    
    protected boolean a(final Context context, final Void void1) {
        return az.a(context).b().d();
    }
    
    protected void b(final Context context, final Void void1) {
        int i = 0;
        final SharedPreferences sharedPreferences = context.getSharedPreferences(App.j(), 0);
        final int int1 = sharedPreferences.getInt("app_v", -1);
        int n;
        if (App.f()) {
            n = App.k();
        }
        else {
            n = c.d(context);
        }
        if (int1 < n) {
            this.a(context);
            for (long[] c = a.c(context); i < c.length; ++i) {
                bg.a(context, c[i]).c(null, (String[])null);
            }
            sharedPreferences.edit().putInt("app_v", n).apply();
        }
    }
}
