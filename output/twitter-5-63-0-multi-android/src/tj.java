import com.twitter.android.ac;
import com.twitter.library.client.p;
import com.twitter.library.client.App;
import android.content.Context;
import com.twitter.util.c;
import android.preference.PreferenceManager;
import android.app.Activity;

// 
// Decompiled by Procyon v0.5.30
// 

public class tj extends ts
{
    private static void b(final Activity activity) {
        if (PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).getBoolean("debug_lock_portrait", false) && !c.g((Context)activity)) {
            activity.setRequestedOrientation(1);
        }
    }
    
    protected boolean a(final Context context, final Void void1) {
        return App.f();
    }
    
    protected void b(final Context context, final Void void1) {
        p.a().a(new tk(this));
    }
}
