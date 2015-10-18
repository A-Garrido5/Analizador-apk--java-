// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.library.provider.al;
import android.support.v4.content.CursorLoader;
import com.twitter.android.client.x;
import java.util.HashSet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.res.Resources;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.model.MediaType;
import android.app.Activity;
import com.twitter.library.api.conversations.v;
import android.text.TextUtils;
import com.twitter.library.api.conversations.ai;
import com.twitter.library.api.conversations.bg;
import com.twitter.library.platform.d;
import android.view.KeyEvent;
import com.twitter.util.f;
import com.twitter.library.api.conversations.DMMessageEntry;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.media.manager.j;
import java.util.List;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.conversations.au;
import com.twitter.library.api.conversations.s;
import android.support.v4.content.Loader;
import com.twitter.library.client.Session;
import com.twitter.library.api.conversations.bb;
import com.twitter.library.api.conversations.ag;
import java.util.Set;
import com.twitter.library.api.conversations.aw;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.conversations.ad;
import com.twitter.library.api.conversations.af;
import com.twitter.android.dialog.RateLimitDialogFragmentActivity;
import com.twitter.library.api.conversations.bd;
import com.twitter.library.service.aa;
import android.view.LayoutInflater;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.bc;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.ListAdapter;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;
import android.database.Cursor;
import com.twitter.library.widget.ae;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView$OnItemLongClickListener;
import com.twitter.library.util.bj;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.content.Intent;
import android.widget.Toast;
import com.twitter.library.api.conversations.av;
import com.twitter.android.metrics.c;
import java.util.UUID;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.view.u;
import android.text.SpannableStringBuilder;
import com.twitter.library.media.manager.k;
import com.twitter.library.service.y;
import com.twitter.library.widget.PageableListView;
import android.content.Context;
import com.twitter.library.api.conversations.w;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import com.twitter.library.view.QuoteView;
import android.app.ProgressDialog;
import com.twitter.android.composer.TweetBox;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.twitter.library.media.widget.MediaImageView;
import android.net.Uri;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.aq;
import android.view.View;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.ui.dialog.b;
import com.twitter.library.media.util.a;
import com.twitter.android.composer.bo;
import com.twitter.android.client.aj;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;

class dq implements e
{
    final /* synthetic */ long a;
    final /* synthetic */ DMConversationFragment b;
    
    dq(final DMConversationFragment b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            this.b.h(this.a);
        }
    }
}
