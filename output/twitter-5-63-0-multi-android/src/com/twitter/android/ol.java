// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.PromptDialogFragment;

class ol implements Runnable
{
    final /* synthetic */ PromptDialogFragment a;
    final /* synthetic */ ProfileActivity b;
    
    ol(final ProfileActivity b, final PromptDialogFragment a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(this.b.getSupportFragmentManager());
    }
}
