// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.util.bq;
import com.twitter.library.api.conversations.DMLocalMessageEntry;
import com.twitter.library.api.conversations.DMMessageEntry;

public class DMMessageDialog extends BaseDMMessageDialog
{
    public static DMMessageDialog a(final int n, final boolean b, final long n2, final DMMessageEntry dmMessageEntry, final dr dr) {
        final DMMessageDialog dmMessageDialog = new DMMessageDialog();
        a(dmMessageDialog, n, b, dmMessageEntry);
        dmMessageDialog.a(n2, dmMessageEntry, b, dr);
        return dmMessageDialog;
    }
    
    private static void a(final DMMessageDialog dmMessageDialog, final int n, final boolean b, final DMMessageEntry dmMessageEntry) {
        dmMessageDialog.d_(n);
        if (!b) {
            dmMessageDialog.e(2131361803);
            return;
        }
        if (BaseDMMessageDialog.a((DMLocalMessageEntry)dmMessageEntry)) {
            dmMessageDialog.e(2131361804);
            return;
        }
        dmMessageDialog.e(2131361801);
    }
    
    @Override
    protected void a(final DMMessageEntry dmMessageEntry) {
        final FragmentActivity activity = this.getActivity();
        String trim;
        if (dmMessageEntry.text == null) {
            trim = null;
        }
        else {
            trim = dmMessageEntry.text.trim();
        }
        bq.b((Context)activity, trim);
    }
}
