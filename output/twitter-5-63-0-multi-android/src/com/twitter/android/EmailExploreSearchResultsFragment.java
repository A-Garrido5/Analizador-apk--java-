// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeLog;

public class EmailExploreSearchResultsFragment extends LandingPageSearchResultsFragment
{
    private String ao;
    
    @Override
    protected void e() {
        this.aw().a(new TwitterScribeLog(this.aF().g()).b(this.B, this.ao, this.a, null, "show_polled_content"));
        super.e();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.ao = this.getArguments().getString("scribe_section");
        this.Z = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().b(this.B)).c(this.ao)).d(this.a);
    }
    
    @Override
    public void r() {
        super.r();
        if (this.o > 0) {
            this.a(ScribeLog.a(this.B, this.ao, "new_tweet_prompt", null, "click"));
        }
    }
}
