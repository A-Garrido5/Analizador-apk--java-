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
import android.widget.AbsListView$OnScrollListener;
import com.twitter.android.widget.DraggableHeaderLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.bz;
import android.os.Bundle;
import android.content.Context;
import com.twitter.util.t;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import com.twitter.library.util.bq;
import com.twitter.library.api.z;
import android.database.Cursor;
import android.text.TextUtils;
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
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.autocomplete.e;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;
import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import android.os.Build$VERSION;
import android.view.ViewGroup$MarginLayoutParams;

class mh implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ ViewGroup$MarginLayoutParams b;
    final /* synthetic */ MediaTagFragment c;
    
    mh(final MediaTagFragment c, final int a, final ViewGroup$MarginLayoutParams b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final ListViewSuggestionEditText b = this.c.f;
        if (b.getLayout() != null) {
            int a;
            if (b.getLineCount() > 1) {
                a = this.a;
            }
            else {
                a = 0;
            }
            b.setLineSpacing((float)a, 1.0f);
            if (Build$VERSION.SDK_INT < 21) {
                this.b.bottomMargin = -a;
            }
        }
    }
}
