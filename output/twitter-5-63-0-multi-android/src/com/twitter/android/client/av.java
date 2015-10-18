// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.view.KeyEvent;
import android.support.v4.content.CursorLoader;
import android.text.Editable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.ui.dialog.e;
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
import com.twitter.library.client.as;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.preference.PreferenceManager;
import com.twitter.android.mz;
import android.content.Context;
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

class av implements jy
{
    final /* synthetic */ SearchSuggestionController a;
    
    av(final SearchSuggestionController a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final jx jx) {
        return this.a.b(jx);
    }
    
    @Override
    public boolean b(final jx jx) {
        return this.a.a(jx);
    }
}
