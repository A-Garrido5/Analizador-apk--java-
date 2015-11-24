// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.ListCreateEditActivity;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class ListsActivity extends TwitterFragmentActivity implements h
{
    private long a;
    private boolean b;
    
    private int a(final boolean b, final int n) {
        switch (n) {
            case 0: {
                if (b) {
                    return 2131297159;
                }
                break;
            }
            case 1: {
                return 2131297485;
            }
            case 2: {
                return 2131297484;
            }
        }
        return 2131297486;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(0);
        bn.e(true);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final long n, final String s) {
        this.setResult(-1, new c(n, this.a).a());
        this.finish();
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951627, toolBar);
        if (this.b) {
            final jx a = toolBar.a(2131887414);
            a.d(2131297150);
            a.b(true);
        }
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887414) {
            this.startActivity(new Intent((Context)this, (Class)ListCreateEditActivity.class));
            this.G().a(this.U().g(), "me:lists:list:new_list:create");
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        final b a = com.twitter.android.lists.b.a(intent);
        int n;
        if (a.c) {
            n = 0;
        }
        else {
            n = -1;
        }
        this.a = a.a;
        final long n2 = lcmp(a.d, this.U().g());
        boolean b = false;
        if (n2 == 0) {
            b = true;
        }
        this.b = b;
        this.setTitle(this.a(a.c, n));
        if (bundle == null) {
            final ListsFragment listsFragment = new ListsFragment();
            listsFragment.setArguments(new g(intent.getExtras(), a.b, this.b, n, a.e).a());
            listsFragment.a(this);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, listsFragment).commit();
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        final com.twitter.android.client.c g = this.G();
        final long g2 = this.U().g();
        final String[] array = new String[2];
        String s;
        if (this.b) {
            s = "own_lists";
        }
        else {
            s = "lists";
        }
        array[0] = s;
        array[1] = ":::impression";
        g.a(g2, array);
    }
}
