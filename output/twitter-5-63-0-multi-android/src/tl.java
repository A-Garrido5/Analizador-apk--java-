import android.app.Application$ActivityLifecycleCallbacks;
import com.twitter.library.client.p;
import android.app.Application;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class tl extends ts
{
    protected void a(final Context context, final Void void1) {
        ((Application)context).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new tm(this, p.a()));
    }
}
