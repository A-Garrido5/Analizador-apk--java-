// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.t;
import android.view.MotionEvent;
import android.widget.AbsListView;
import java.io.Serializable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.view.KeyEvent;
import android.content.res.Resources;
import android.widget.ListAdapter;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.api.geo.e;
import com.twitter.android.geo.f;
import java.util.Collection;
import java.util.ArrayList;
import android.location.Location;
import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.util.bj;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import com.twitter.android.util.bm;
import android.content.Context;
import com.twitter.library.api.geo.b;
import android.text.TextUtils;
import com.twitter.android.geo.PlacePickerModel$PlaceListSource;
import com.twitter.android.geo.i;
import java.util.List;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeGeoDetails$ScribeGeoPlace;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.android.geo.GeoTagState;
import com.twitter.library.api.geo.TwitterPlace;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.HashSet;
import android.widget.TextSwitcher;
import android.widget.EditText;
import com.twitter.android.geo.k;
import com.twitter.android.geo.g;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import com.twitter.library.scribe.ScribeGeoDetails;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Set;
import com.twitter.android.geo.l;
import android.widget.TextView$OnEditorActionListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AbsListView$OnScrollListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.Editable;
import com.twitter.library.util.h;

class z extends h
{
    final /* synthetic */ ComposerPoiFragment a;
    
    z(final ComposerPoiFragment a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.B = true;
        this.a.f(true);
    }
}
