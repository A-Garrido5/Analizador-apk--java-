// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.AbsListView;
import android.os.Parcelable;
import android.widget.AbsListView$RecyclerListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ListAdapter;
import com.twitter.library.media.util.v;
import com.twitter.library.media.util.aq;
import java.util.Iterator;
import com.twitter.library.featureswitch.d;
import java.util.HashMap;
import com.twitter.eventreporter.EventReporter;
import android.graphics.Typeface;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.LayoutInflater;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.support.v4.content.Loader;
import android.net.Uri;
import android.widget.Scroller;
import android.os.AsyncTask;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import com.twitter.util.concurrent.i;
import android.os.Bundle;
import android.content.res.Resources;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.content.Context;
import android.database.Cursor;
import com.twitter.library.media.model.EditableImage;
import java.util.Map;
import android.widget.TextView;
import android.widget.GridView;
import android.view.View;
import com.twitter.android.gh;
import android.widget.AbsListView$OnScrollListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;

class ci implements Runnable
{
    final /* synthetic */ GalleryGridFragment a;
    
    ci(final GalleryGridFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.i.setSelection(this.a.p);
    }
}
