// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import com.twitter.library.client.Session$LoginStatus;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.av;
import android.widget.CompoundButton;
import android.support.v4.app.FragmentActivity;
import java.util.Collection;
import com.twitter.library.widget.aj;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.concurrent.h;
import com.twitter.library.util.bq;
import com.twitter.library.experiments.a;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.events.b;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.app.Activity;
import android.app.AlertDialog$Builder;
import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import android.text.SpannableString;
import android.app.AlertDialog;
import android.view.InflateException;
import android.view.ViewStub;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import android.view.View;
import com.twitter.library.featureswitch.d;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.util.q;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Intent;
import com.twitter.library.network.ae;
import com.twitter.library.client.Session;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.bg;
import com.twitter.android.geo.c;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.RelativeLayout;
import java.util.HashMap;
import com.twitter.android.geo.e;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.support.v4.app.FragmentManager$OnBackStackChangedListener;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.service.y;
import com.twitter.library.api.PromotedContent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class qv implements DialogInterface$OnClickListener
{
    final /* synthetic */ SearchActivity a;
    
    qv(final SearchActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a(new pb((Context)this.a, this.a.U(), 2451739231L, null), 102);
    }
}
