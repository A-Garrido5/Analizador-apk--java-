// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class PhoneMTFlowActivity extends TwitterFragmentActivity implements nm
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968962);
        bn.d(true);
        bn.a(false);
        bn.b(false);
        return bn;
    }
    
    public void a(final String s, final boolean b) {
        final PhoneMTVerifyFragment phoneMTVerifyFragment = new PhoneMTVerifyFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("verify_phone_number", s);
        arguments.putBoolean("is_verizon", b);
        phoneMTVerifyFragment.setArguments(arguments);
        this.getSupportFragmentManager().beginTransaction().replace(2131886241, phoneMTVerifyFragment).addToBackStack(null).commitAllowingStateLoss();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        if (bundle == null) {
            this.getSupportFragmentManager().beginTransaction().add(2131886241, new PhoneMTEntryFragment()).commit();
        }
    }
    
    public void f() {
        this.finish();
        Toast.makeText((Context)this, 2131297391, 1).show();
    }
    
    @Override
    public void onBackPressed() {
        final Fragment fragmentById = this.getSupportFragmentManager().findFragmentById(2131886241);
        if (fragmentById != null) {
            if (fragmentById instanceof PhoneMTEntryFragment) {
                this.G().a(this.U().g(), new String[] { "phone_loggedin_mt", "enter_phone::back:click" });
            }
            else if (fragmentById instanceof PhoneMTVerifyFragment) {
                this.G().a(this.U().g(), new String[] { "phone_loggedin_mt", "enter_code::back:click" });
            }
        }
        super.onBackPressed();
    }
}
