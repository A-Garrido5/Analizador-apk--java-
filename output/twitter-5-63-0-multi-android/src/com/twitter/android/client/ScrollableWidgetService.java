// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.widget.RemoteViewsService$RemoteViewsFactory;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class ScrollableWidgetService extends RemoteViewsService
{
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(final Intent intent) {
        return (RemoteViewsService$RemoteViewsFactory)new ci(this.getApplicationContext(), intent.getIntExtra("contentType", 0), intent.getLongExtra("ownerId", 0L), intent.getStringExtra("accountName"));
    }
}
