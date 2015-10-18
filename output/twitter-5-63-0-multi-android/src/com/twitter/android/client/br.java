// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.kg;
import android.app.Activity;
import android.os.Parcelable;
import com.twitter.internal.android.widget.GroupedRowView;
import android.database.ContentObserver;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import android.content.Context;
import com.twitter.library.media.manager.o;
import android.text.TextUtils;
import android.app.Dialog;
import android.widget.AbsListView;
import com.twitter.refresh.widget.j;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.internal.android.widget.ToolBar;
import android.widget.TextView;
import android.support.v4.content.Loader;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.widget.PromptView;
import com.twitter.refresh.widget.RefreshableListView;
import com.twitter.library.metrics.h;
import com.twitter.refresh.widget.a;
import android.support.v4.widget.CursorAdapter;
import android.database.Cursor;
import com.twitter.library.scribe.ScribeLog;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.api.Prompt;
import java.util.ArrayList;
import android.widget.ListView;
import android.graphics.Bitmap;
import com.twitter.android.revenue.d;
import com.twitter.android.sl;
import android.widget.ProgressBar;
import com.twitter.android.UmfPromptView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.ListAdapter;
import com.twitter.library.client.aa;
import com.twitter.android.av.x;
import com.twitter.refresh.widget.e;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.refresh.widget.b;
import com.twitter.library.media.manager.m;
import com.twitter.internal.android.widget.aq;
import android.widget.AbsListView$OnScrollListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;
import java.util.Iterator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class br implements View$OnTouchListener
{
    final /* synthetic */ TwitterListFragment a;
    
    br(final TwitterListFragment a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final Iterator iterator = this.a.H.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
