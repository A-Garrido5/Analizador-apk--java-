// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.Prompt;
import com.twitter.library.client.v;
import android.content.Context;

public class UmfInlinePromptView extends UmfPromptView
{
    public UmfInlinePromptView(final Context context) {
        super(context);
        this.setDismissVisibility(0);
    }
    
    private void h() {
        final v a = v.a(this.getContext());
        if (this.a.g()) {
            a.b("optin");
            a.a("optin");
        }
    }
    
    @Override
    protected void a() {
        this.h();
        this.c();
        super.a();
    }
    
    @Override
    protected void b() {
        this.h();
        this.c();
        super.b();
    }
    
    public void c() {
        if (this.a == null) {
            return;
        }
        new xj(this).execute((Object[])new Prompt[] { this.a });
    }
}
