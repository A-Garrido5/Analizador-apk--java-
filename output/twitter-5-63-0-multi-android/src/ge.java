import com.twitter.library.client.App;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.SharedPreferences;
import com.twitter.library.util.bj;
import java.util.Locale;
import android.text.TextUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ge extends ts
{
    @Override
    protected void a(final Context context, final Object o) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("debug_prefs", 0);
        if (sharedPreferences.getBoolean("custom_locale_enabled", false)) {
            final String string = sharedPreferences.getString("custom_language", (String)null);
            final String string2 = sharedPreferences.getString("custom_country", (String)null);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                final Locale locale = new Locale(string, string2);
                Locale.setDefault(locale);
                final Resources resources = context.getResources();
                final Configuration configuration = resources.getConfiguration();
                configuration.locale = locale;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                bj.a(context);
            }
        }
    }
    
    @Override
    protected boolean b(final Context context, final Object o) {
        return App.f();
    }
}
