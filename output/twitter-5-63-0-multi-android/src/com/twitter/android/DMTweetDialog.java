// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.util.bq;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.DMLocalMessageEntry;
import com.twitter.library.api.conversations.DMMessageEntry;

public class DMTweetDialog extends BaseDMMessageDialog
{
    public static DMTweetDialog a(final int n, final boolean b, final long n2, final DMMessageEntry dmMessageEntry, final dr dr) {
        final DMTweetDialog dmTweetDialog = new DMTweetDialog();
        a(dmTweetDialog, n, b, dmMessageEntry);
        dmTweetDialog.a(n2, dmMessageEntry, b, dr);
        return dmTweetDialog;
    }
    
    private static void a(final DMTweetDialog dmTweetDialog, final int n, final boolean b, final DMMessageEntry dmMessageEntry) {
        dmTweetDialog.d_(n);
        if (!b) {
            dmTweetDialog.e(2131361806);
            return;
        }
        if (BaseDMMessageDialog.a((DMLocalMessageEntry)dmMessageEntry)) {
            dmTweetDialog.e(2131361805);
            return;
        }
        dmTweetDialog.e(2131361802);
    }
    
    @Override
    protected void a(final DMMessageEntry dmMessageEntry) {
        final DMTweet dmTweet = (DMTweet)dmMessageEntry.attachment;
        bq.b((Context)this.getActivity(), this.getString(2131298282, new Object[] { dmTweet.quotedTweetData.userHandle, dmTweet.quotedTweetData.statusId }));
    }
}
