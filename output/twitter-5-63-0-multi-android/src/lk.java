import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.content.Context;
import com.twitter.library.featureswitch.d;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class lk
{
    public static int a() {
        if (d.a("seamful_app_bar_android_3110", new String[] { "enabled" })) {
            return lh.SeamfulToolbarEnabledStyle;
        }
        return lh.SeamfulToolbarDisabledStyle;
    }
    
    public static int a(final Context context) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(kv.toolbarForegroundColor, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }
    
    public static Drawable a(final Drawable drawable, final int n) {
        if (drawable == null || n == 0) {
            return drawable;
        }
        drawable.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_IN));
        return drawable;
    }
}
