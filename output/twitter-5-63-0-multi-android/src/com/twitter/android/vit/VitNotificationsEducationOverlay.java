// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vit;

import android.content.Intent;
import com.twitter.android.NotificationsTimelineSettingsActivity;
import android.widget.ImageView$ScaleType;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.k;
import com.twitter.library.featureswitch.d;
import com.twitter.android.util.aj;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import com.twitter.android.dialog.TakeoverDialogFragment;

public class VitNotificationsEducationOverlay extends TakeoverDialogFragment
{
    public static boolean a(final Context context, final TwitterUser twitterUser) {
        return twitterUser != null && aj.a(twitterUser) && d.f("vit_notifications_redesign_education_prompt_enabled") && new k(context, twitterUser.username).getBoolean("vit_notifications_edu", true);
    }
    
    public static void b(final FragmentActivity fragmentActivity) {
        ((VitNotificationsEducationOverlay)((VitNotificationsEducationOverlay)TakeoverDialogFragment.a(VitNotificationsEducationOverlay.class)).a(ImageView$ScaleType.CENTER).c(2131298125).d(2131298127).e(2131298126).b(2130838833)).a(fragmentActivity);
    }
    
    @Override
    protected void a() {
        super.a();
        this.a("notifications::vit_edu_prompt", ":impression");
    }
    
    @Override
    protected void b() {
        super.b();
        this.i();
        this.a("notifications::vit_edu_prompt", ":dismiss");
    }
    
    @Override
    protected void c() {
        super.c();
        this.i();
        this.a("notifications::vit_edu_prompt", "button:click");
    }
    
    @Override
    protected void f() {
        super.f();
        this.i();
        this.a("notifications::vit_edu_prompt", "settings:click");
        this.j();
    }
    
    void i() {
        new k((Context)this.getActivity(), this.h().e()).a().a("vit_notifications_edu", false).apply();
    }
    
    void j() {
        final FragmentActivity activity = this.getActivity();
        activity.startActivity(new Intent((Context)activity, (Class)NotificationsTimelineSettingsActivity.class).putExtra("NotificationsTimelineSettingsActivity_account_name", this.h().e()));
    }
}
