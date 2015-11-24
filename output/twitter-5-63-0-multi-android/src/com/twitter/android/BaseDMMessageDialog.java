// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.android.client.c;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import com.twitter.ui.dialog.BaseDialogFragment;
import android.app.Activity;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.aq;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.api.conversations.DMLocalMessageEntry;
import com.twitter.library.api.conversations.DMMessageEntry;
import com.twitter.android.widget.PromptDialogFragment;

public abstract class BaseDMMessageDialog extends PromptDialogFragment
{
    private long a;
    private DMMessageEntry b;
    private boolean c;
    private dr d;
    
    private void a() {
        if (this.d != null) {
            this.d.d(this.a);
        }
    }
    
    protected static boolean a(final DMLocalMessageEntry dmLocalMessageEntry) {
        return dmLocalMessageEntry.status == 0 || dmLocalMessageEntry.status == 1;
    }
    
    private void b() {
        if (this.d != null) {
            this.d.c(this.a);
        }
    }
    
    private void c() {
        final FragmentActivity activity = this.getActivity();
        final Session b = az.a((Context)activity).b();
        final long g = b.g();
        if (this.c) {
            new as(this, this.a, g).execute((Object[])new Void[0]);
            return;
        }
        com.twitter.library.client.as.a((Context)activity).a(new aq((Context)this.getActivity(), b, this.a), new ar(this, (Context)activity));
    }
    
    protected void a(final long a, final DMMessageEntry b, final boolean c, final dr d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected abstract void a(final DMMessageEntry p0);
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        final Fragment targetFragment = this.getTargetFragment();
        if (this.d == null) {
            this.d = (dr)BaseDialogFragment.a(dr.class, targetFragment, activity);
        }
    }
    
    @Override
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final FragmentActivity activity = this.getActivity();
        final c a = com.twitter.android.client.c.a((Context)activity);
        final long g = az.a((Context)activity).b().g();
        switch (n) {
            case 0: {
                a.a(g, "messages:thread::message:copy");
                this.a(this.b);
                break;
            }
            case 1: {
                a.a(g, "messages:thread::message:delete_dm");
                this.c();
                break;
            }
            case 2: {
                if (this.c) {
                    this.b();
                    break;
                }
                this.a();
                break;
            }
        }
        super.onClick(dialogInterface, n);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getLong("entry_id");
            this.b = (DMMessageEntry)bundle.get("message");
            this.c = bundle.getBoolean("is_draft");
        }
        return super.onCreateDialog(bundle);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putLong("entry_id", this.a);
        bundle.putSerializable("message", (Serializable)this.b);
        bundle.putBoolean("is_draft", this.c);
        super.onSaveInstanceState(bundle);
    }
}
