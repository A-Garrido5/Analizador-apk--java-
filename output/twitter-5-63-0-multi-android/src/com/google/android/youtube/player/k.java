// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.content.Context;
import com.google.android.youtube.player.internal.bg;
import android.content.Intent;
import android.app.Activity;

public final class k
{
    public static Intent a(final Activity activity, final String s, final String s2) {
        return a(activity, s, s2, 0, false, false);
    }
    
    public static Intent a(final Activity activity, final String s, final String s2, final int n, final boolean b, final boolean b2) {
        return a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", s2), activity, s, n, b, b2);
    }
    
    private static Intent a(final Intent intent, final Activity activity, final String s, final int n, final boolean b, final boolean b2) {
        intent.putExtra("developer_key", s).putExtra("app_package", activity.getPackageName()).putExtra("app_version", bg.d((Context)activity)).putExtra("autoplay", b).putExtra("lightbox_mode", b2).putExtra("start_time_millis", n).putExtra("window_has_status_bar", (0x400 & activity.getWindow().getAttributes().flags) == 0x0);
        return intent;
    }
}
