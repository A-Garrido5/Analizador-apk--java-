// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.support.v4.content.CursorLoader;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import com.twitter.android.widget.TopicView;
import com.twitter.library.provider.Tweet;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import com.twitter.errorreporter.ErrorReporter;
import android.widget.ListView;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import java.io.Serializable;
import com.twitter.library.api.PromotedEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.TwitterTopic$Data;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.android.events.b;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import android.support.v4.app.Fragment;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog$SearchDetails;
import com.twitter.library.util.FriendshipCache;
import java.util.HashSet;
import java.util.ArrayList;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class rn extends z
{
    final /* synthetic */ SearchResultsFragment a;
    
    rn(final SearchResultsFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        super.a(y);
        if (y instanceof g) {
            this.a.aq = this.a.b((g)y);
        }
    }
}
