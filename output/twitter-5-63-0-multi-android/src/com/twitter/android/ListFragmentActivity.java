// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.content.Intent;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class ListFragmentActivity extends TwitterFragmentActivity
{
    private TwitterListFragment b(final Intent intent, final bn bn) {
        final jy a = this.a(intent, bn);
        final TwitterListFragment a2 = a.a;
        a2.a(intent).h(a.c);
        this.getSupportFragmentManager().beginTransaction().add(2131886241, a2, a.b).commit();
        return a2;
    }
    
    protected abstract jy a(final Intent p0, final bn p1);
    
    protected abstract CharSequence a(final Intent p0);
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.setTitle(this.a(intent));
        if (bundle == null) {
            this.b(intent, bn);
        }
        else if (this.getSupportFragmentManager().findFragmentById(2131886241) == null) {
            this.b(intent, bn);
        }
    }
}
