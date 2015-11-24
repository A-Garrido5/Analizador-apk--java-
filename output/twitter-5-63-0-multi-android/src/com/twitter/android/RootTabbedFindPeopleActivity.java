// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bn;
import android.os.Bundle;

public class RootTabbedFindPeopleActivity extends TabbedFindPeopleActivity
{
    @Override
    protected Bundle a(final int n) {
        final Bundle a = super.a(n);
        a.putBoolean("follow_flow_people_button_intent", true);
        a.putBoolean("follow_flow_clear_stack", true);
        return a;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.e(true);
        return a;
    }
}
