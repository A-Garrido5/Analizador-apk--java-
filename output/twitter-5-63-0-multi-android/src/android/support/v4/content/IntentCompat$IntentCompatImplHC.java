// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.content.Intent;
import android.content.ComponentName;

class IntentCompat$IntentCompatImplHC extends IntentCompat$IntentCompatImplBase
{
    @Override
    public Intent makeMainActivity(final ComponentName componentName) {
        return IntentCompatHoneycomb.makeMainActivity(componentName);
    }
    
    @Override
    public Intent makeRestartActivityTask(final ComponentName componentName) {
        return IntentCompatHoneycomb.makeRestartActivityTask(componentName);
    }
}
