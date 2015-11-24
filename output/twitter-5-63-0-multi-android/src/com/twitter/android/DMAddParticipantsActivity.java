// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.content.Intent;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class DMAddParticipantsActivity extends TwitterFragmentActivity
{
    private DMComposeFragment a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        bn.a(0);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951631, toolBar);
        return super.a(jv, toolBar);
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887419) {
            this.G().a(this.U().g(), "messages:add_participants:::done");
            this.setResult(-1, new Intent().putExtra("user_ids", CollectionUtils.c(this.a.e())));
            this.finish();
            return true;
        }
        if (a == 2131886126) {
            this.setResult(0);
            this.finish();
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        intent.putExtra("add_participants", true);
        if (bundle == null) {
            (this.a = new DMComposeFragment()).a(intent);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, this.a, "composer").commit();
            return;
        }
        this.a = (DMComposeFragment)this.getSupportFragmentManager().findFragmentByTag("composer");
    }
}
