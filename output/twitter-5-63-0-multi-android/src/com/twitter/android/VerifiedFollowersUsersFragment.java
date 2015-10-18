// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.PromotedContent;

public class VerifiedFollowersUsersFragment extends UsersFragment
{
    private String B;
    
    @Override
    void N() {
    }
    
    @Override
    void a(final long n, final PromotedContent promotedContent, final String s, final String s2) {
        this.aw().a(this.a(n, promotedContent, s, "followers:vit_verified_followers:" + this.B, s2));
    }
    
    @Override
    void a(final String s) {
        this.aw().a(this.aF().g(), "followers:vit_verified_followers", this.B, "", s);
    }
    
    @Override
    void a(final String s, final long n, final PromotedContent promotedContent, final String s2) {
        this.aw().a(this.a(n, promotedContent, s2, new String[] { String.format("followers:vit_verified_followers:%s:%s:profile_click", this.B, s) }));
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.B = bundle.getString("verified_followers_tab");
            return;
        }
        this.B = this.getArguments().getString("verified_followers_tab");
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("verified_followers_tab", this.B);
    }
}
