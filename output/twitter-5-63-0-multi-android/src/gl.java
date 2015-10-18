import android.content.ComponentName;
import com.twitter.android.samsung.single.TwitterWidgetProvider;
import com.twitter.library.client.App;
import com.twitter.library.util.an;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class gl extends ts
{
    protected boolean a(final Context context, final Void void1) {
        return !an.a() && !App.f();
    }
    
    protected void b(final Context context, final Void void1) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class)TwitterWidgetProvider.class), 2, 1);
    }
}
