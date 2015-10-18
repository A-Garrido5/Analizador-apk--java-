// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.MediaImageView;
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
import android.widget.ListView;
import android.widget.TextView;
import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.autocomplete.e;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class md implements View$OnTouchListener
{
    final /* synthetic */ MediaTagFragment a;
    
    md(final MediaTagFragment a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        this.a.o = -1;
        return false;
    }
}
