// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.Activity;
import com.twitter.android.FollowFlowController;
import android.content.Context;
import com.twitter.library.client.k;
import com.twitter.android.dialog.TakeoverDialogFragment;

public class InstantTimelineFollowOverlay extends TakeoverDialogFragment
{
    @Override
    protected void a() {
        super.a();
        new k((Context)this.getActivity(), this.h().e()).a().a("timeline_follow_overlay_shown", true).apply();
        this.a("instant_timeline::follow_takeover_prompt:", "impression");
    }
    
    @Override
    protected void b() {
        super.b();
        this.a("instant_timeline::follow_takeover_prompt:", "cancel");
    }
    
    @Override
    protected void c() {
        super.c();
        new FollowFlowController("instant_timeline").a(new String[] { "follow_recommendations" }).b(this.getActivity());
        this.a("instant_timeline::follow_takeover_prompt:", "click");
    }
}
