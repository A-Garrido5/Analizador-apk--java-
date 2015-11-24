// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.ui.widget.PromptView;
import android.support.v4.content.CursorLoader;
import com.twitter.library.util.k;
import com.twitter.library.provider.ae;
import com.twitter.android.client.bv;
import com.twitter.android.widget.ec;
import android.app.Activity;
import android.widget.AbsListView;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import java.util.Iterator;
import com.twitter.library.api.g;
import com.twitter.library.api.l;
import com.twitter.android.client.x;
import com.twitter.library.platform.PushService;
import com.twitter.library.util.bq;
import android.widget.Toast;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collection;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.twitter.android.util.am;
import android.widget.Button;
import com.twitter.android.util.ap;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.database.Cursor;
import com.twitter.library.api.PromotedEvent;
import java.io.Serializable;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.api.z;
import com.twitter.android.widget.al;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.Session;
import android.widget.ListAdapter;
import com.twitter.android.widget.fb;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import android.content.Intent;
import java.util.Map;
import android.widget.BaseAdapter;
import android.text.TextUtils;
import com.twitter.library.provider.az;
import com.twitter.library.provider.ao;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.library.provider.cw;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.n;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.widget.ez;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.UserView;
import com.twitter.library.api.PromotedContent;
import java.util.HashMap;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import android.net.Uri;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import com.twitter.ui.dialog.e;
import com.twitter.android.widget.eb;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.widget.UserApprovalView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.c;

class yt implements c
{
    final /* synthetic */ UsersFragment a;
    
    public yt(final UsersFragment a) {
        this.a = a;
    }
    
    public void a(final UserApprovalView userApprovalView, final long n, final int n2) {
        if (userApprovalView.a(2)) {
            this.a.a(n, userApprovalView.getPromotedContent(), (yk)userApprovalView.getTag());
            this.a.m.put(n, 3);
            return;
        }
        if (userApprovalView.a(0)) {
            if (!this.a.m.containsKey(n)) {
                this.a.a(new pn((Context)this.a.getActivity(), this.a.aF(), n, 1));
            }
            else {
                this.a.a(n, ((yk)userApprovalView.getTag()).f, userApprovalView.getPromotedContent());
            }
            this.a.m.put(n, 1);
            return;
        }
        if (userApprovalView.a(1)) {
            if (!this.a.m.containsKey(n)) {
                this.a.a(new pn((Context)this.a.getActivity(), this.a.aF(), n, 2));
            }
            this.a.m.put(n, 2);
            return;
        }
        this.a.m.remove(n);
    }
}
