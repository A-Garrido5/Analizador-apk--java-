// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue.requirements;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class NetworkRequirementProvider$1 extends BroadcastReceiver
{
    final b a;
    
    public void onReceive(final Context context, final Intent intent) {
        if (b.b(this.a) != null && b.a(this.a).a()) {
            b.b(this.a).a();
        }
    }
}
