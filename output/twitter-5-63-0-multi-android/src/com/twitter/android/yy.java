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
import com.twitter.library.widget.BaseUserView;
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
import android.content.Context;
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
import com.twitter.library.widget.c;
import com.twitter.android.widget.eb;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class yy extends z
{
    final /* synthetic */ UsersFragment a;
    
    private yy(final UsersFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        super.a(y);
        if (y instanceof ml) {
            if (!this.a.R) {
                this.a.b(y);
            }
        }
        else if (y instanceof pm && !this.a.S) {
            this.a.c(y);
        }
    }
}
