import com.twitter.library.client.az;
import com.twitter.library.featureswitch.d;
import com.twitter.android.dialog.TakeoverDialogFragment;
import com.twitter.android.widget.InstantTimelineFollowOverlay;
import com.twitter.library.client.k;
import com.twitter.android.client.c;
import android.support.v4.app.FragmentActivity;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

class fk implements fi
{
    private final Context a;
    
    fk(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final FragmentActivity fragmentActivity) {
        if (fragmentActivity != null && !new k((Context)fragmentActivity, c.a((Context)fragmentActivity).a().b().e()).getBoolean("timeline_follow_overlay_shown", false)) {
            ((InstantTimelineFollowOverlay)((InstantTimelineFollowOverlay)TakeoverDialogFragment.a(InstantTimelineFollowOverlay.class)).c(2131297109).d(2131296998).e(2131297311).b(2130839196)).a(fragmentActivity);
        }
    }
    
    @Override
    public boolean a() {
        return d.a("instant_timeline_ux_android_3109", "spinner", "control", "unassigned");
    }
    
    @Override
    public boolean b() {
        return d.a("instant_timeline_ux_android_3109", new String[] { "welcome_msg" });
    }
    
    @Override
    public boolean c() {
        return d.a("instant_timeline_ux_android_3109", "first_follow_overlay", "control", "unassigned");
    }
    
    @Override
    public boolean d() {
        return this.f().getBoolean("instant_timeline_welcome_msg_dismissed", false);
    }
    
    @Override
    public void e() {
        this.f().a().a("instant_timeline_welcome_msg_dismissed", true).apply();
    }
    
    k f() {
        return new k(this.a, az.a(this.a).b().e(), "instant_timeline_prefs");
    }
}
