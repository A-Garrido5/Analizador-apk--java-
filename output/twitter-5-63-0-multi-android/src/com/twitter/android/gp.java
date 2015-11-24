// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.widget.Filter;
import com.twitter.library.api.TwitterUser;
import android.view.ViewTreeObserver;
import com.twitter.library.media.model.MediaFile;
import com.twitter.internal.util.Optional;
import android.text.TextWatcher;
import com.twitter.android.client.bz;
import android.widget.ListAdapter;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.Toast;
import android.content.Intent;
import com.twitter.android.client.c;
import com.twitter.library.api.geo.e;
import java.util.Collections;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.featureswitch.d;
import android.graphics.Rect;
import com.twitter.library.service.y;
import com.twitter.library.api.geo.b;
import java.util.List;
import java.util.Iterator;
import com.twitter.library.api.UrlEntity;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import com.twitter.library.api.TweetEntities;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.content.res.Resources;
import android.widget.ScrollView;
import android.support.v4.util.LruCache;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.twitter.internal.android.widget.ad;
import android.widget.Filterable;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import com.twitter.library.api.geo.TwitterPlace;
import android.text.Editable;
import com.twitter.library.util.h;

class gp extends h
{
    final /* synthetic */ EditProfileActivity a;
    
    gp(final EditProfileActivity a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        if (this.a.v != null && !this.a.v.fullName.equals(editable.toString())) {
            this.a.v = null;
        }
    }
}
