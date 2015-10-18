// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session;
import com.twitter.library.service.z;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import android.widget.TextView;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.bn;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.android.widget.ProgressDialogFragment;
import com.twitter.android.client.TwitterFragmentActivity;

public class PhoneOwnershipActivity extends TwitterFragmentActivity implements ns, nu
{
    private ProgressDialogFragment a;
    
    private void a(final String s, final boolean b) {
        final PhoneOwnershipCompleteFragment phoneOwnershipCompleteFragment = new PhoneOwnershipCompleteFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("phone_number", s);
        arguments.putBoolean("is_numeric", b);
        phoneOwnershipCompleteFragment.setArguments(arguments);
        this.getSupportFragmentManager().beginTransaction().replace(2131886241, phoneOwnershipCompleteFragment).addToBackStack(null).commitAllowingStateLoss();
    }
    
    private void a(final int[] array) {
        int n;
        if (CollectionUtils.a(array, 294)) {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:verify_complete::error" });
            n = 2131297844;
        }
        else if (CollectionUtils.a(array, 295)) {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:verify_complete::rate_limit" });
            n = 2131297845;
        }
        else {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:verify_complete::failure" });
            n = 2131297843;
        }
        Toast.makeText((Context)this, n, 0).show();
    }
    
    private void a(final int[] array, final boolean b) {
        String s;
        if (b) {
            s = "resend_code";
        }
        else {
            s = "verify_begin";
        }
        int n;
        if (CollectionUtils.a(array, 285)) {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_phone:" + s + "::failure" });
            n = 2131297394;
        }
        else if (CollectionUtils.a(array, 295)) {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_phone:" + s + "::rate_limit" });
            n = 2131297845;
        }
        else {
            this.G().a(this.U().g(), new String[] { "unlock_account", "enter_phone:" + s + "::error" });
            n = 2131297395;
        }
        Toast.makeText((Context)this, n, 0).show();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968962);
        bn.d(true);
        bn.a(false);
        bn.b(false);
        return bn;
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        if (this.a != null) {
            this.a.dismiss();
            this.a = null;
        }
        switch (n) {
            default: {}
            case 0: {
                if (aa.a()) {
                    final mr mr = (mr)y;
                    this.G().a(this.U().g(), new String[] { "unlock_account", "enter_phone:verify_begin::success" });
                    this.a(mr.b(), mr.g());
                    return;
                }
                this.a(((mm)y).e(), false);
            }
            case 1: {
                final TextView textView = (TextView)this.findViewById(2131887122);
                if (textView != null) {
                    textView.setText(2131297405);
                    textView.setEnabled(true);
                }
                if (aa.a()) {
                    this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:resend_code::success" });
                    return;
                }
                this.a(((mm)y).e(), true);
            }
            case 2: {
                if (!aa.a()) {
                    this.a(((mm)y).e());
                    return;
                }
                if (((ms)y).g()) {
                    this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:verify_complete::success" });
                    Toast.makeText((Context)this, 2131297417, 0).show();
                    this.finish();
                    return;
                }
                this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code:verify_complete::error" });
                Toast.makeText((Context)this, 2131297844, 0).show();
            }
        }
    }
    
    @Override
    public void a(final String s) {
        if (this.a == null) {
            (this.a = ProgressDialogFragment.a(2131297665)).setRetainInstance(true);
            this.a.a(this.getSupportFragmentManager());
        }
        this.a(new mr((Context)this, this.U(), s), 0);
    }
    
    @Override
    public void a(final String s, final String s2) {
        if (this.a == null) {
            (this.a = ProgressDialogFragment.a(2131298099)).setRetainInstance(true);
            this.a.a(this.getSupportFragmentManager());
        }
        this.a(new ms((Context)this, this.U(), s).a(s2), 2);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Session u = this.U();
        if (u != null && u.j() == null) {
            as.a((Context)this).a(ab.a((Context)this, u), (z)null);
        }
        if (bundle == null) {
            this.getSupportFragmentManager().beginTransaction().add(2131886241, new PhoneOwnershipBeginFragment()).commit();
        }
    }
    
    @Override
    public void b(final String s) {
        this.a(new mr((Context)this, this.U(), s), 1);
    }
    
    @Override
    public void onBackPressed() {
        final Fragment fragmentById = this.getSupportFragmentManager().findFragmentById(2131886241);
        if (fragmentById != null) {
            if (fragmentById instanceof PhoneOwnershipBeginFragment) {
                this.G().a(this.U().g(), new String[] { "unlock_account", "enter_phone::back:click" });
            }
            else if (fragmentById instanceof PhoneOwnershipCompleteFragment) {
                this.G().a(this.U().g(), new String[] { "unlock_account", "enter_code::back:click" });
            }
        }
        super.onBackPressed();
    }
}
