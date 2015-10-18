// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import android.text.TextUtils;
import com.twitter.errorreporter.ErrorReporter;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.library.api.Prompt;

public class TakeoverPromptDialogFragment extends TakeoverDialogFragment
{
    public TakeoverPromptDialogFragment a(final Prompt prompt) {
        this.getArguments().putParcelable("prompt", (Parcelable)prompt);
        return this;
    }
    
    @Override
    protected void a() {
        super.a();
        com.twitter.android.client.c.a((Context)this.getActivity()).a(this.i().b);
    }
    
    @Override
    public void a(final FragmentManager fragmentManager) {
        try {
            super.a(fragmentManager);
        }
        catch (IllegalStateException ex) {
            ErrorReporter.a(ex);
        }
    }
    
    public TakeoverPromptDialogFragment b(final Prompt prompt) {
        this.a(prompt);
        this.c(prompt.e);
        this.a(prompt.d);
        this.a(prompt.j);
        return this;
    }
    
    @Override
    protected void b() {
        super.b();
        com.twitter.android.client.c.a((Context)this.getActivity()).c(this.i().b);
    }
    
    @Override
    protected void c() {
        super.c();
        final String f = this.i().f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            am.a((Context)this.getActivity(), null, f, this.h().g(), null, null, null);
        }
        com.twitter.android.client.c.a((Context)this.getActivity()).b(this.i().b);
    }
    
    protected Prompt i() {
        return (Prompt)this.getArguments().getParcelable("prompt");
    }
}
