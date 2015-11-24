// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.f;
import com.twitter.library.featureswitch.d;
import com.twitter.library.featureswitch.FeatureSwitchesConfig;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public class y extends i
{
    private String a;
    
    public y(final Context context, final Session session, final String a) {
        super(context, y.class.getName(), session);
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final long c = this.P().c;
            final FeatureSwitchesConfig featureSwitchesConfig = (FeatureSwitchesConfig)bg.a();
            com.twitter.library.featureswitch.d.a(c, featureSwitchesConfig);
            com.twitter.library.featureswitch.d.b(c, featureSwitchesConfig);
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "help", "settings" });
        if (this.a != null && com.twitter.library.featureswitch.d.f("feature_switches_configs_use_feature_set_token")) {
            a.a("feature_set_token", this.a);
        }
        return a;
    }
    
    protected bg e() {
        return bg.a(52);
    }
}
