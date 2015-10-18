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
import android.widget.ListAdapter;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.api.geo.e;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.util.bj;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import android.text.Editable;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import com.twitter.android.util.bm;
import com.twitter.library.api.geo.b;
import com.twitter.android.geo.PlacePickerModel$PlaceListSource;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeGeoDetails$ScribeGeoPlace;
import android.view.ViewStub;
import java.util.HashSet;
import android.widget.TextSwitcher;
import android.widget.EditText;
import com.twitter.android.geo.k;
import com.twitter.android.geo.g;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.twitter.library.util.h;
import com.twitter.library.scribe.ScribeGeoDetails;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Set;
import com.twitter.android.geo.l;
import android.widget.TextView$OnEditorActionListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AbsListView$OnScrollListener;
import android.view.View$OnTouchListener;
import com.twitter.android.geo.f;
import com.twitter.library.api.geo.Coordinate;
import java.util.HashMap;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.util.aj;
import android.location.Location;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.android.geo.GeoTagState;
import android.widget.TextView;
import android.text.TextUtils;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.library.api.geo.TwitterPlace;
import android.content.Context;
import java.util.Collections;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.twitter.android.geo.i;
import java.util.List;
import com.twitter.android.geo.PlacePickerModel;
import android.widget.BaseAdapter;

class aa extends BaseAdapter
{
    final /* synthetic */ ComposerPoiFragment a;
    private final PlacePickerModel b;
    private List c;
    private i d;
    private LayoutInflater e;
    private int f;
    private int g;
    private Resources h;
    
    public aa(final ComposerPoiFragment a, final int f, final int g, final PlacePickerModel b, final i d) {
        this.a = a;
        this.c = Collections.emptyList();
        this.h = a.getResources();
        this.e = LayoutInflater.from((Context)a.getActivity());
        this.f = f;
        this.g = g;
        b.registerObserver((Object)new ab(this, a));
        this.b = b;
        this.d = d;
    }
    
    private String a(final TwitterPlace twitterPlace) {
        if (twitterPlace.placeType == TwitterPlace$PlaceType.a) {
            String s = twitterPlace.placeInfo.name;
            if (TextUtils.isEmpty((CharSequence)s)) {
                s = twitterPlace.fullName;
                final int lastIndex = s.lastIndexOf(",");
                if (lastIndex != -1) {
                    s = s.substring(0, lastIndex);
                }
            }
            return s;
        }
        return twitterPlace.fullName;
    }
    
    private void a(final TextView textView, final CharSequence text) {
        textView.setText(text);
        if (TextUtils.isEmpty(text)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
    }
    
    public i a() {
        return this.d;
    }
    
    public TwitterPlace a(final int n) {
        return this.c.get(n);
    }
    
    public void a(final i d) {
        this.d = d;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public int getItemViewType(final int n) {
        final GeoTagState b = this.a.b();
        if (b.c() && this.a(n).equals(b.e())) {
            return 1;
        }
        return 0;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final TwitterPlace a2 = this.a(n);
        final GeoTagState b = this.a.b();
        boolean b2;
        if (b.c() && b.e().equals(a2)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        ad ad;
        if (a == null) {
            final ComposerPoiFragment a3 = this.a;
            final LayoutInflater e = this.e;
            int n2;
            if (b2) {
                n2 = this.g;
            }
            else {
                n2 = this.f;
            }
            a = a3.a(e, n2, viewGroup);
            final ad tag = new ad(a);
            a.setTag((Object)tag);
            ad = tag;
        }
        else {
            ad = (ad)a.getTag();
        }
        ad.a.setText((CharSequence)this.a(a2));
        if (b2) {
            ad.e.setOnClickListener((View$OnClickListener)this.a);
        }
        final TwitterPlace$PlaceInfo placeInfo = a2.placeInfo;
        final HashMap attributes = placeInfo.attributes;
        String s2;
        String s3;
        if (attributes != null) {
            final String s = attributes.get("twitter");
            s2 = attributes.get("street_address");
            s3 = s;
        }
        else {
            s2 = null;
            s3 = null;
        }
        final Location g = this.a.g;
        final Coordinate centroid = placeInfo.centroid;
        final TwitterPlace$PlaceType placeType = a2.placeType;
        final TwitterPlace$PlaceType a4 = TwitterPlace$PlaceType.a;
        String s4 = null;
        if (placeType == a4) {
            s4 = null;
            if (centroid != null) {
                s4 = null;
                if (g != null) {
                    final float[] array = { 0.0f };
                    Location.distanceBetween(g.getLatitude(), g.getLongitude(), centroid.a(), centroid.b(), array);
                    s4 = aj.a(this.h, array[0]);
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        s4 = " · " + s4;
                    }
                }
            }
        }
        this.a(ad.b, s3);
        this.a(ad.d, s4);
        this.a(ad.c, s2);
        ad.d.measure(0, 0);
        ad.c.setMaxWidth((int)(this.a.n.getWidth() - 2.0f * this.a.getResources().getDimension(2131558845) - ad.d.getMeasuredWidth()));
        this.a.C.add(new ac(a2.placeId, a2.placeType, this.a.i(), this.b.b(a2), this.b.a(a2), n));
        return a;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public void notifyDataSetChanged() {
        this.c = this.d.a();
        final f a = this.b.a(this.d.b());
        if (a != null) {
            this.a.p.a(a.b());
        }
        else {
            this.a.p.a(Collections.emptyList());
        }
        super.notifyDataSetChanged();
    }
}
