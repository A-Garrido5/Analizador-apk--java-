// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.Context;
import android.appwidget.AppWidgetProvider;

public class WidgetSmallProvider extends AppWidgetProvider
{
    public void onDeleted(final Context context, final int[] array) {
        super.onDeleted(context, array);
        context.startService(new Intent(context, (Class)WidgetService.class).setAction("on_delete").putExtra("widget_ids", array));
    }
    
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] array) {
        context.sendBroadcast(new Intent(WidgetControl.c).putExtra("widget_provider", 2131165190));
    }
}
