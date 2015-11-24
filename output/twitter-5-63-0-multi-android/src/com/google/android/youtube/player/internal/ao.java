// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import java.util.Map;
import android.content.res.Resources;
import java.util.Locale;
import android.content.Context;

public final class ao
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    
    public ao(final Context context) {
        final Resources resources = context.getResources();
        Locale locale;
        if (resources != null && resources.getConfiguration() != null && resources.getConfiguration().locale != null) {
            locale = resources.getConfiguration().locale;
        }
        else {
            locale = Locale.getDefault();
        }
        final Map a = bf.a(locale);
        this.a = a.get("error_initializing_player");
        this.b = a.get("get_youtube_app_title");
        this.c = a.get("get_youtube_app_text");
        this.d = a.get("get_youtube_app_action");
        this.e = a.get("enable_youtube_app_title");
        this.f = a.get("enable_youtube_app_text");
        this.g = a.get("enable_youtube_app_action");
        this.h = a.get("update_youtube_app_title");
        this.i = a.get("update_youtube_app_text");
        this.j = a.get("update_youtube_app_action");
    }
}
