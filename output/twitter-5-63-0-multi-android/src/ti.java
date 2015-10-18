import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.a;
import com.twitter.library.client.az;
import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;

// 
// Decompiled by Procyon v0.5.30
// 

class ti extends AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat
{
    final /* synthetic */ Context a;
    final /* synthetic */ az b;
    final /* synthetic */ th c;
    
    ti(final th c, final Context a, final az b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onAccessibilityStateChanged(final boolean b) {
        com.twitter.util.a.a(this.a);
        if (b) {
            ScribeService.a(this.a, new TwitterScribeLog(this.b.b().g()).b(new String[] { "app::::explorebytouch_enabled" }));
        }
    }
}
