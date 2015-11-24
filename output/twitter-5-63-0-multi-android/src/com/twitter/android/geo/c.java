// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import android.content.Intent;
import android.content.DialogInterface;
import com.twitter.library.client.Session;
import com.twitter.util.t;
import com.twitter.library.client.az;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.app.Activity;
import com.twitter.ui.dialog.e;

public class c implements e
{
    private final String a;
    private int b;
    private final Activity c;
    private final com.twitter.android.client.c d;
    private final FragmentManager e;
    private final com.twitter.android.geo.e f;
    private d g;
    
    public c(final FragmentActivity c, final String a, final com.twitter.android.geo.e f) {
        this.d = com.twitter.android.client.c.a((Context)c);
        this.e = c.getSupportFragmentManager();
        this.c = c;
        this.f = f;
        this.a = a;
        final PromptDialogFragment promptDialogFragment = (PromptDialogFragment)this.e.findFragmentByTag(a);
        if (promptDialogFragment != null) {
            promptDialogFragment.a(this);
            this.b = promptDialogFragment.getArguments().getInt("requested_permissions");
        }
    }
    
    private long a() {
        return az.a((Context)this.c).b().g();
    }
    
    private void b(final int n) {
        final Activity c = this.c;
        t.a((Context)c, c.getWindow().getDecorView(), false);
        final PromptDialogFragment b = PromptDialogFragment.b(n);
        b.getArguments().putInt("requested_permissions", this.b);
        switch (n) {
            default: {
                return;
            }
            case 1: {
                b.d(2131296801).h(2131297362).j(2131297035).a(this).setCancelable(false);
                break;
            }
            case 2: {
                b.c(2131297980).d(2131297979).h(2131296943).j(2131296445).a(this).setCancelable(false);
                break;
            }
            case 3: {
                b.d(2131296802).h(2131297667).j(2131296445).a(this).setCancelable(false);
                break;
            }
        }
        b.a(this.e, this.a);
    }
    
    public void a(final int b) {
        this.b = b;
        final boolean b2 = (b & 0x1) > 0;
        boolean b3;
        if ((b & 0x2) > 0) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        final boolean b4 = (b & 0x4) > 0;
        final Session b5 = az.a((Context)this.c).b();
        final sl a = sk.a();
        if (b3 && !a.b(b5)) {
            this.b(2);
        }
        else {
            if (b2 && !a.d()) {
                this.b(1);
                this.d.a(this.a(), "location_prompt::::impression");
                return;
            }
            if (b4 && !a.e()) {
                this.b(3);
                return;
            }
            if (this.f != null) {
                this.f.a(true);
            }
        }
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                final com.twitter.android.client.c d = this.d;
                if (-1 == n2) {
                    sk.a().a(true);
                    this.a(this.b);
                    d.a(this.a(), "location_prompt:::allow:click");
                    return;
                }
                if (-2 != n2) {
                    break;
                }
                d.a(this.a(), "location_prompt:::deny:click");
                if (this.f != null) {
                    this.f.a(false);
                    return;
                }
                break;
            }
            case 2: {
                if (-1 == n2) {
                    sk.a().b(az.a((Context)this.c).b(), true);
                    this.a(this.b);
                    return;
                }
                if (-2 == n2 && this.f != null) {
                    this.f.a(false);
                    return;
                }
                break;
            }
            case 3: {
                if (-1 == n2) {
                    if (this.g != null) {
                        this.g.a();
                    }
                    this.c.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS").setFlags(268435456));
                    return;
                }
                if (-2 == n2 && this.f != null) {
                    this.f.a(false);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final d g) {
        this.g = g;
    }
}
