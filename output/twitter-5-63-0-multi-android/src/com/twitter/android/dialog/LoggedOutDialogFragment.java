// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import android.text.TextUtils;
import android.app.Activity;
import com.twitter.android.kg;
import android.view.View;
import android.os.Bundle;
import android.app.Dialog;
import android.view.animation.Animation;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.ui.dialog.SimpleDialogFragment;

public class LoggedOutDialogFragment extends SimpleDialogFragment
{
    private void b() {
        final FragmentActivity activity = this.getActivity();
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)activity, 2131034174);
        loadAnimation.setStartOffset(100L);
        this.l(2131886103).startAnimation(loadAnimation);
        if (activity.getResources().getConfiguration().orientation == 1) {
            final Animation loadAnimation2 = AnimationUtils.loadAnimation((Context)activity, 2131034174);
            loadAnimation2.setStartOffset(300L);
            this.l(2131886093).startAnimation(loadAnimation2);
        }
        final Animation loadAnimation3 = AnimationUtils.loadAnimation((Context)activity, 2131034175);
        loadAnimation3.setStartOffset(100L);
        this.l(2131886092).startAnimation(loadAnimation3);
    }
    
    public LoggedOutDialogFragment a(final String s) {
        this.getArguments().putString("logged_out_dialog_scribe", s);
        return this;
    }
    
    public String a() {
        return this.getArguments().getString("logged_out_dialog_scribe");
    }
    
    @Override
    protected void a(final Dialog dialog, final Bundle bundle) {
        super.a(dialog, bundle);
        if (bundle == null) {
            this.b();
        }
    }
    
    @Override
    protected void d_(final int n) {
        super.d_(n);
        this.d(2131297173);
        this.e(2131297172);
    }
    
    @Override
    public void onClick(final View view) {
        String s = null;
        final FragmentActivity activity = this.getActivity();
        switch (view.getId()) {
            default: {
                super.onClick(view);
                break;
            }
            case 2131886094: {
                kg.b(activity);
                s = "signup";
                break;
            }
            case 2131886093: {
                kg.c(activity);
                s = "login";
                break;
            }
            case 2131886092: {
                this.dismiss();
                s = "cancel";
                break;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            kg.a(activity, this.a() + ":" + s + ":click");
        }
    }
}
