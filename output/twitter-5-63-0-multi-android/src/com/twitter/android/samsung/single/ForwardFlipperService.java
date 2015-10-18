// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.data.j;
import android.content.Context;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import android.content.Intent;
import android.content.res.Configuration;
import android.widget.RemoteViewsService;

@Deprecated
public class ForwardFlipperService extends RemoteViewsService
{
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    public void onCreate() {
        super.onCreate();
    }
    
    public void onDestroy() {
        super.onDestroy();
    }
    
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(final Intent intent) {
        final int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra < 0) {
            throw new IllegalArgumentException("Our appWidgetId is missing");
        }
        if (i.d((Context)this, intExtra)) {
            j.b((Context)this, intExtra);
        }
        return (RemoteViewsService$RemoteViewsFactory)new FlipperViewsFactory(this.getApplicationContext(), intent);
    }
}
