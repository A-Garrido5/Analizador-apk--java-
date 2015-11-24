import com.twitter.android.jw;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.client.p;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.5.30
// 

class tm implements Application$ActivityLifecycleCallbacks
{
    final /* synthetic */ p a;
    final /* synthetic */ tl b;
    
    tm(final tl b, final p a) {
        this.b = b;
        this.a = a;
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (activity instanceof jw) {
            this.a.a((jw)activity, bundle);
        }
    }
    
    public void onActivityDestroyed(final Activity activity) {
    }
    
    public void onActivityPaused(final Activity activity) {
    }
    
    public void onActivityResumed(final Activity activity) {
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public void onActivityStarted(final Activity activity) {
    }
    
    public void onActivityStopped(final Activity activity) {
    }
}
