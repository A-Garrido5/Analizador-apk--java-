import android.support.v4.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import com.twitter.library.client.az;
import android.view.accessibility.AccessibilityManager;
import com.twitter.util.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class th extends ts
{
    protected void a(final Context context, final Void void1) {
        a.a(context);
        AccessibilityManagerCompat.addAccessibilityStateChangeListener((AccessibilityManager)context.getSystemService("accessibility"), new ti(this, context, az.a(context)));
    }
}
