// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.UserSettings;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.jy;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.view.View;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.client.Session;
import android.widget.TextView;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import android.view.View$OnClickListener;
import com.twitter.android.ListFragmentActivity;
import com.twitter.internal.android.service.a;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.api.account.ab;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class l extends z
{
    final /* synthetic */ TrendsPlusActivity a;
    
    private l(final TrendsPlusActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof ab) {
            final com.twitter.library.service.ab p = y.P();
            if (p != null && p.c == this.a.U().g()) {
                if (!y.X()) {
                    Toast.makeText((Context)this.a, 2131297968, 1).show();
                    return;
                }
                final TrendsPlusFragment h = this.a.h();
                if (h != null) {
                    h.L();
                }
            }
            return;
        }
        super.a(y);
    }
}
