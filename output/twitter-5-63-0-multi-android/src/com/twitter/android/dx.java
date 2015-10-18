// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.android.provider.l;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.provider.ae;
import android.widget.ListAdapter;
import com.twitter.library.api.conversations.au;
import com.twitter.library.api.conversations.ai;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.app.FragmentActivity;
import android.annotation.TargetApi;
import com.twitter.library.api.conversations.bj;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.content.Intent;
import com.twitter.library.api.conversations.z;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.util.al;
import android.view.View;
import com.twitter.android.util.ap;
import com.twitter.library.util.n;
import com.twitter.library.client.Session;
import com.twitter.ui.widget.PromptView;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.ui.widget.q;
import com.twitter.android.autocomplete.a;
import android.widget.AdapterView$OnItemLongClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.conversations.bg;
import android.support.v4.app.Fragment;
import com.twitter.library.api.conversations.ak;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;

class dx implements e
{
    final /* synthetic */ cw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ DMInboxFragment c;
    
    dx(final DMInboxFragment c, final cw a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        int n3 = 1;
        switch (n2) {
            default: {}
            case 0: {
                if (!this.a.o || ak.a(this.c.aF().j())) {
                    n3 = 0;
                }
                final DeleteConversationDialog a = DeleteConversationDialog.a(3, this.c.c, n3 != 0, this.c.b, "inbox");
                a.setTargetFragment(this.c, 0);
                a.a(this.c.getActivity().getSupportFragmentManager());
            }
            case 1: {
                if (this.b) {
                    final c e = this.c.aw();
                    final long g = this.c.aF().g();
                    final String[] array = new String[n3];
                    array[0] = "messages:inbox::thread:mute_dm_thread";
                    e.a(g, array);
                    this.c.a(new bg((Context)this.c.getActivity(), this.c.aF(), this.c.b, (boolean)(n3 != 0)), 6, 0);
                    return;
                }
                final c h = this.c.aw();
                final long g2 = this.c.aF().g();
                final String[] array2 = new String[n3];
                array2[0] = "messages:inbox::thread:unmute_dm_thread";
                h.a(g2, array2);
                this.c.a(new bg((Context)this.c.getActivity(), this.c.aF(), this.c.b, false), 7, 0);
            }
            case 2: {
                final ReportConversationDialog a2 = ReportConversationDialog.a(6, this.c.c, this.c.b, "inbox", this.c);
                a2.setTargetFragment(this.c, 0);
                a2.a(this.c.getActivity().getSupportFragmentManager());
            }
        }
    }
}
