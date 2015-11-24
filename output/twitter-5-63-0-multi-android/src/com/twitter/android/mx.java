// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.android.widget.NotificationSettingsDialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.View$OnClickListener;

public class mx implements View$OnClickListener
{
    private final FragmentManager a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private NotificationSettingsDialogFragment f;
    
    public mx(final FragmentManager a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void onClick(final View view) {
        if (this.f == null) {
            this.f = NotificationSettingsDialogFragment.a(this.b, this.c, this.d, this.e);
        }
        this.f.show(this.a, "notification_setting");
    }
}
