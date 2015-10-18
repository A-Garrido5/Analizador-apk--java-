// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.view.KeyEvent;
import android.support.v4.content.CursorLoader;
import android.text.Editable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.kg;
import android.os.Parcelable;
import android.net.Uri;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.util.bj;
import com.twitter.library.widget.SearchQueryView;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import android.text.TextUtils;
import android.os.ResultReceiver;
import android.view.View;
import com.twitter.util.t;
import android.widget.TextView;
import com.twitter.android.provider.SuggestionsProvider;
import android.annotation.SuppressLint;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.search.f;
import com.twitter.library.featureswitch.d;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.preference.PreferenceManager;
import com.twitter.android.mz;
import android.os.Handler;
import android.os.Looper;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import com.twitter.library.widget.af;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.api.search.h;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;

class ax implements e
{
    public String a;
    final /* synthetic */ SearchSuggestionController b;
    
    ax(final SearchSuggestionController b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1 && n2 == -1) {
            final h h = (h)new h((Context)this.b.j, this.b.l.b()).c(3);
            h.g = this.a;
            as.a((Context)this.b.j).a(h);
            this.b.a();
        }
    }
}
