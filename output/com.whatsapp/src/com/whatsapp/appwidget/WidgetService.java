// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import android.widget.RemoteViewsService$RemoteViewsFactory;
import android.content.Intent;
import android.annotation.TargetApi;
import android.widget.RemoteViewsService;

@TargetApi(11)
public class WidgetService extends RemoteViewsService
{
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(final Intent intent) {
        return (RemoteViewsService$RemoteViewsFactory)new d(this.getApplicationContext());
    }
}
