// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.android.client.c;
import android.content.DialogInterface;
import android.app.AlertDialog$Builder;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.android.util.ba;
import com.twitter.android.dialog.TakeoverDialogFragment;
import android.support.v4.app.Fragment;
import com.twitter.library.api.Prompt;
import android.content.DialogInterface$OnClickListener;
import com.twitter.android.dialog.TakeoverPromptDialogFragment;

public class RediscoverabilityOverlayPrompt extends TakeoverPromptDialogFragment implements DialogInterface$OnClickListener
{
    public static void a(final Prompt prompt, final Fragment fragment) {
        final RediscoverabilityOverlayPrompt rediscoverabilityOverlayPrompt = (RediscoverabilityOverlayPrompt)TakeoverDialogFragment.a(RediscoverabilityOverlayPrompt.class);
        rediscoverabilityOverlayPrompt.b(prompt);
        rediscoverabilityOverlayPrompt.e(2131297526);
        rediscoverabilityOverlayPrompt.a(fragment);
    }
    
    private void a(final String s, final String s2) {
        this.a(new String[] { "home:promptbird:rediscoverability", s, s2 });
    }
    
    @Override
    protected void a() {
        super.a();
        this.a("", "impression");
    }
    
    @Override
    protected void b() {
        super.b();
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            ba.a((Context)activity).b();
            this.a("", "dismiss");
        }
    }
    
    @Override
    protected void c() {
        super.c();
        ba.a((Context)this.getActivity()).b();
        this.a("", "ok");
    }
    
    protected void f() {
        this.a("are_you_sure", "impression");
        new AlertDialog$Builder((Context)this.getActivity()).setTitle(2131297525).setMessage(2131297524).setPositiveButton(2131298158, (DialogInterface$OnClickListener)this).setNegativeButton(2131297527, (DialogInterface$OnClickListener)this).create().show();
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final FragmentActivity activity = this.getActivity();
        final c a = com.twitter.android.client.c.a((Context)activity);
        switch (n) {
            case -2: {
                ba.a((Context)activity).b();
                a.b(this.i().b);
                this.a("are_you_sure", "cancel");
                break;
            }
            case -1: {
                ba.a((Context)activity).c();
                this.a("are_you_sure", "ok");
                break;
            }
        }
        this.dismiss();
    }
}
