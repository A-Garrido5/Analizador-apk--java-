// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import com.twitter.android.widget.DraggableHeaderLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.bz;
import android.os.Bundle;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import com.twitter.library.util.bq;
import com.twitter.library.api.z;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.Editable;
import java.util.ArrayList;
import android.view.inputmethod.InputMethodManager;
import java.util.Iterator;
import android.content.res.Resources;
import java.util.Set;
import com.twitter.library.api.MediaTag;
import java.util.HashSet;
import android.text.SpannableStringBuilder;
import java.util.List;
import android.widget.TextView;
import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.autocomplete.e;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.util.t;
import android.widget.AbsListView;
import android.view.View;
import android.widget.ListView;
import android.widget.AbsListView$OnScrollListener;

class mb implements AbsListView$OnScrollListener
{
    final /* synthetic */ ListView a;
    final /* synthetic */ View b;
    final /* synthetic */ MediaTagFragment c;
    
    mb(final MediaTagFragment c, final ListView a, final View b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.c.o == -1) {
            this.c.o = absListView.getFirstVisiblePosition();
        }
        int n4;
        if (n2 > 0 && (n != 0 || this.a.getChildAt(0).getTop() != 0)) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        final View b = this.b;
        int visibility;
        if (n4 != 0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        b.setVisibility(visibility);
        if (this.c.o > -1 && Math.abs(n - this.c.o) > 3) {
            t.a((Context)this.c.getActivity(), (View)this.c.f, false);
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
