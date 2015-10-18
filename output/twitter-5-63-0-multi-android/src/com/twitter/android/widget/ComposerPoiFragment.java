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
import android.text.Editable;
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
import com.twitter.library.util.h;
import com.twitter.library.scribe.ScribeGeoDetails;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Set;
import com.twitter.android.geo.l;
import android.widget.TextView$OnEditorActionListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AbsListView$OnScrollListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;

public class ComposerPoiFragment extends ComposerLocationFragment implements View$OnClickListener, View$OnTouchListener, AbsListView$OnScrollListener, AdapterView$OnItemClickListener, TextView$OnEditorActionListener, l, ff
{
    private boolean A;
    private boolean B;
    private Set C;
    private TwitterScribeItem D;
    private ScribeGeoDetails E;
    private h F;
    private View j;
    private TextView k;
    private TextView l;
    private ProgressBar m;
    private ListView n;
    private aa o;
    private g p;
    private k q;
    private EditText r;
    private TextSwitcher s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    public ComposerPoiFragment() {
        this.C = new HashSet();
    }
    
    private View a(final LayoutInflater layoutInflater, final int layoutResource, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2130968980, viewGroup, false);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131887147);
        viewStub.setLayoutResource(layoutResource);
        viewStub.inflate();
        return inflate;
    }
    
    private void a(final TwitterPlace twitterPlace, final String s) {
        final GeoTagState b = this.b();
        if (!b.d() && twitterPlace != null) {
            this.a(new GeoTagState(twitterPlace, this.k(), s, this.x, false, this.q.c()));
            final String placeId = twitterPlace.placeId;
            final TwitterPlace$PlaceType placeType = twitterPlace.placeType;
            String s2;
            if (this.x) {
                s2 = "auto_default";
            }
            else {
                s2 = "default";
            }
            this.a(false, true, "compose:poi:poi_list:location:select", placeId, placeType, Double.NaN, Double.NaN, s2, 1, 0, this.a.a(twitterPlace), this.i(), "geotag", System.currentTimeMillis());
        }
        else if (b.c() && this.E.c.isEmpty()) {
            final TwitterPlace e = b.e();
            this.a(false, true, "compose:poi:poi_list:location:select", e.placeId, e.placeType, Double.NaN, Double.NaN, "default", 1, 0, this.a.a(e), this.i(), "geotag", System.currentTimeMillis());
        }
    }
    
    private void a(final boolean b, final boolean b2, final String s, final String s2, final TwitterPlace$PlaceType twitterPlace$PlaceType, final double n, final double n2, final String s3, final int n3, final int n4, final int n5, final String s4, final String s5, final long n6) {
        if (b) {
            final List c = this.E.c;
            if (!c.isEmpty()) {
                c.get(-1 + c.size()).j = "removed";
            }
        }
        final TwitterScribeItem b3 = TwitterScribeItem.b();
        if (b2) {
            b3.ak.c.add(this.E.a(s2, twitterPlace$PlaceType, n, n2, s3, n3, n4, n5, s4, s5, n6));
        }
        else {
            b3.ak.a(s2, twitterPlace$PlaceType, n, n2, s3, n3, n4, n5, s4, s5, n6);
        }
        this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.e).b(new String[] { s })).a(b3));
    }
    
    private void f(final boolean b) {
        final ListView n = this.n;
        if (this.f()) {
            this.j(true);
            final String string = this.r.getText().toString();
            this.o.a(com.twitter.android.geo.i.a(this.o.a(), string));
            if (this.o.isEmpty() && !this.B) {
                this.p.a();
            }
            else if (this.B) {
                this.p.a(this.getString(2131297449, new Object[] { string }));
                if (b) {
                    final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                    twitterScribeItem.x = string;
                    this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.e).b(new String[] { "compose:poi:poi_list::filter" })).a(twitterScribeItem));
                }
            }
        }
        else {
            this.o.a(new i(this.a, PlacePickerModel$PlaceListSource.a));
            this.p.a();
            this.j(false);
        }
        this.h(false);
        this.j();
        n.setSelectionFromTop(0, 0);
    }
    
    private boolean f() {
        return this.r != null && !TextUtils.isEmpty((CharSequence)this.r.getText());
    }
    
    private void g(final boolean b) {
        boolean b2 = true;
        this.x = b2;
        if (b && (this.g != null || this.a.b().c())) {
            this.q.a();
        }
        if (this.g == null) {
            this.b(b2);
            this.h(b2);
        }
        else if (this.h && !this.w && this.a.a(this.g)) {
            this.h(this.w = b2);
            final FragmentActivity activity = this.getActivity();
            this.a(new b((Context)activity, this.d).a("tweet_compose_location").a(bm.a((Context)activity)), 0, 0);
        }
        if (this.f != null) {
            final com.twitter.android.widget.y f = this.f;
            if (b) {
                b2 = false;
            }
            f.b(b2);
        }
    }
    
    private boolean g() {
        this.E.b = 1;
        final Editable text = this.r.getText();
        final int length = ((CharSequence)text).length();
        boolean b = false;
        if (length > 0) {
            this.B = false;
            if (!this.w) {
                this.h(this.w = true);
                final FragmentActivity activity = this.getActivity();
                this.a(new b((Context)activity, this.d).a("tweet_compose_location").b(((CharSequence)text).toString()).a(bm.a((Context)activity)), 1, 0);
            }
            final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
            twitterScribeItem.x = ((CharSequence)text).toString();
            this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.e).b(new String[] { "compose:poi:poi_list::search" })).a(twitterScribeItem));
            b = true;
        }
        return b;
    }
    
    private void h() {
        this.z = false;
        if (this.C.isEmpty()) {
            return;
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.e).b(new String[] { "compose:poi:poi_list:location:results" });
        for (final ac ac : this.C) {
            final TwitterScribeItem b = TwitterScribeItem.b();
            final ScribeGeoDetails$ScribeGeoPlace scribeGeoDetails$ScribeGeoPlace = new ScribeGeoDetails$ScribeGeoPlace();
            scribeGeoDetails$ScribeGeoPlace.a = ac.a;
            scribeGeoDetails$ScribeGeoPlace.b = ac.b.toString();
            scribeGeoDetails$ScribeGeoPlace.e = ac.d;
            scribeGeoDetails$ScribeGeoPlace.g = ac.f;
            scribeGeoDetails$ScribeGeoPlace.h = ac.e;
            scribeGeoDetails$ScribeGeoPlace.i = ac.c;
            b.ak.c.add(scribeGeoDetails$ScribeGeoPlace);
            twitterScribeLog.a(b);
        }
        this.b.a(twitterScribeLog);
        this.C.clear();
    }
    
    private void h(final boolean b) {
        if (this.m != null) {
            final ListView n = this.n;
            final EditText r = this.r;
            if (b) {
                n.setVisibility(8);
                ((View)r).setEnabled(false);
                this.i(false);
                this.j.setVisibility(0);
                this.m.setVisibility(0);
                return;
            }
            if (!this.w) {
                this.m.setVisibility(8);
                if (!this.o.isEmpty() || this.B) {
                    n.setVisibility(0);
                    this.j.setVisibility(8);
                }
                else {
                    this.i(true);
                    this.j.setVisibility(0);
                }
                ((View)r).setEnabled(true);
            }
        }
    }
    
    private String i() {
        String string = this.r.getText().toString();
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = null;
        }
        return string;
    }
    
    private void i(final boolean b) {
        if (!b) {
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        }
        else if (this.aD()) {
            if (this.g == null && !this.f()) {
                this.k.setText(2131297305);
                this.l.setText(2131297306);
                this.l.setVisibility(0);
            }
            else if (this.o.isEmpty()) {
                this.k.setText(2131297308);
                this.l.setVisibility(8);
            }
            this.k.setVisibility(0);
        }
    }
    
    private void j() {
        final EditText r = this.r;
        int n;
        if (TextUtils.isEmpty(((TextView)r).getText())) {
            n = 0;
        }
        else {
            n = 2130839224;
        }
        if (bj.e) {
            ((TextView)r).setCompoundDrawablesWithIntrinsicBounds(n, 0, 2130839243, 0);
            return;
        }
        ((TextView)r).setCompoundDrawablesWithIntrinsicBounds(2130839243, 0, n, 0);
    }
    
    private void j(final boolean b) {
        final FragmentActivity activity = this.getActivity();
        if (!b) {
            if (this.t == 1) {
                this.s.setInAnimation((Context)activity, 2131034150);
                this.s.setOutAnimation((Context)activity, 2131034149);
                this.s.setText((CharSequence)this.getString(2131297446));
                this.t = 0;
            }
        }
        else {
            final GeoTagState b2 = this.b();
            if (this.t == 0 && b2.c()) {
                this.s.setInAnimation((Context)activity, 2131034152);
                this.s.setOutAnimation((Context)activity, 2131034151);
                this.s.setText((CharSequence)b2.e().fullName);
                this.t = 1;
            }
        }
    }
    
    private Coordinate k() {
        final Location a = this.c.a();
        if (a == null) {
            return null;
        }
        return Coordinate.a(a);
    }
    
    public void a(final int n, final y y) {
        if (y.O() != 1) {
            super.a(n, y);
        }
        else {
            final b b = (b)y;
            this.w = false;
            final e f = b.f();
            if (f == null || !this.h) {
                if (this.f()) {
                    this.p.a();
                }
                this.h(false);
                return;
            }
            switch (n) {
                default: {}
                case 0: {
                    this.a.a(this.g, new f(new ArrayList(f.a()), f.c(), f.d()));
                    this.o.a(new i(this.a, PlacePickerModel$PlaceListSource.a));
                    this.a(f.b(), f.c());
                    if (!this.o.isEmpty() || !this.i) {
                        this.h(false);
                        return;
                    }
                    break;
                }
                case 1: {
                    this.a.a(new f(new ArrayList(f.a()), f.c(), f.d()));
                    if (this.f()) {
                        this.p.a();
                        this.o.a(new i(this.a, PlacePickerModel$PlaceListSource.b));
                    }
                    this.h(false);
                }
            }
        }
    }
    
    @Override
    public void a(final Location g) {
        if (g == null) {
            return;
        }
        this.q.a(Coordinate.a(g));
        this.q.a();
        if (!this.w && this.a.a(g)) {
            this.h(this.w = true);
            final FragmentActivity activity = this.getActivity();
            this.a(new b((Context)activity, this.d).a("tweet_compose_location").a(bm.a((Context)activity)), 0, 0);
        }
        this.g = g;
    }
    
    public void a(final boolean b) {
        final GeoTagState b2 = this.a.b();
        if (b2.c()) {
            this.a.a(b2.a(b));
        }
    }
    
    public void a(final boolean b, final int n) {
        if (this.x || n == 1) {
            this.E.a = 1;
            this.D.a = this.e;
            String s;
            String s2;
            if (!b) {
                s = null;
                s2 = "composition";
            }
            else {
                s2 = "drafts";
                s = "composition";
            }
            String s3 = null;
            switch (n) {
                case 2: {
                    return;
                }
                default: {
                    return;
                }
                case 0: {
                    s3 = "discard_tweet_geo_interaction";
                    break;
                }
                case 1: {
                    s3 = "send_tweet_geo_interaction";
                    break;
                }
            }
            this.b.a(((TwitterScribeLog)new TwitterScribeLog(this.e).b(null, s2, s, null, s3)).a(this.D));
        }
    }
    
    public boolean a(final int n) {
        int n2;
        if (bj.e) {
            n2 = 0;
        }
        else {
            n2 = 2;
        }
        if (n == n2) {
            this.r.setText((CharSequence)"");
        }
        return false;
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            case 2: {
                this.n.setSelectionFromTop(0, 0);
                this.z = true;
            }
            case 0: {
                if (this.A) {
                    if (!this.f()) {
                        this.o.notifyDataSetChanged();
                    }
                    this.n.setSelectionFromTop(0, 0);
                    this.A = false;
                }
                if (this.f()) {
                    if (this.w) {
                        this.h(this.w = false);
                    }
                    this.r.setText((CharSequence)"");
                }
                if (this.v) {
                    this.v = false;
                }
                if (this.z) {
                    this.h();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void b(final Location location) {
        super.b(location);
        this.h(false);
    }
    
    @Override
    protected void b(final boolean b) {
        super.b(b);
        if (!this.h) {
            this.g = null;
            if (this.r != null) {
                this.r.setText((CharSequence)"");
            }
            if (this.a != null) {
                this.a.a();
            }
        }
    }
    
    public void c(final boolean b) {
        final c b2 = this.b;
        final long e = this.e;
        final String[] array = { null };
        String s;
        if (b) {
            s = "compose:map::map_pin:close";
        }
        else {
            s = "compose:map::map_pin:open";
        }
        array[0] = s;
        b2.a(e, array);
    }
    
    public void d(final boolean b) {
        this.g(b);
    }
    
    public void e(final boolean b) {
        if (this.h && !b && this.f != null) {
            this.b.a(this.e, "compose:poi::poi_tag:click");
            this.g(false);
        }
    }
    
    public boolean e() {
        return this.q != null && this.q.c();
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131887140: {
                if (this.f != null) {
                    this.v = true;
                    this.f.b(false);
                    break;
                }
                break;
            }
            case 2131887153: {
                final GeoTagState b = this.b();
                if (!b.c()) {
                    break;
                }
                final TwitterPlace e = b.e();
                this.a(true, false, "compose:poi:poi_list:location:deselect", e.placeId, e.placeType, Double.NaN, Double.NaN, this.a.b(e), -1, 0, this.a.a(e), this.i(), null, -1L);
                this.b(false);
                if (this.f != null) {
                    this.f.b(false);
                    break;
                }
                break;
            }
        }
        if ("footer_text_tag".equals(view.getTag())) {
            this.g();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.D = TwitterScribeItem.b();
        this.E = this.D.ak;
        this.E.a = 0;
        this.E.b = 0;
        this.F = new z(this);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968978, viewGroup, false);
        this.j = inflate.findViewById(16908292);
        inflate.setOnTouchListener((View$OnTouchListener)this);
        this.k = (TextView)inflate.findViewById(2131887144);
        this.l = (TextView)inflate.findViewById(2131887145);
        this.m = (ProgressBar)inflate.findViewById(2131886129);
        final ListView n = (ListView)inflate.findViewById(2131887143);
        n.setOnTouchListener((View$OnTouchListener)this);
        n.setOnScrollListener((AbsListView$OnScrollListener)this);
        n.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        PlacePickerModel$PlaceListSource a;
        if (bundle != null) {
            this.B = bundle.getBoolean("has_search_text_changed_since_last_search");
            a = (PlacePickerModel$PlaceListSource)bundle.getSerializable("place_picker_presenter_source");
        }
        else {
            a = PlacePickerModel$PlaceListSource.a;
        }
        (this.p = new g(n.getContext(), (ViewGroup)n)).a((View$OnClickListener)this);
        (this.q = new k((ViewGroup)inflate.findViewById(2131887146), this)).b();
        n.addFooterView(this.p.b(), (Object)"poi_footer_tag", false);
        final Resources resources = this.getResources();
        n.setAdapter((ListAdapter)(this.o = new aa(this, 2130968983, 2130968984, this.a, new i(this.a, a))));
        this.n = n;
        (this.s = (TextSwitcher)inflate.findViewById(2131887141)).setCurrentText((CharSequence)resources.getString(2131297446));
        ((TextView)inflate.findViewById(2131887140)).setOnClickListener((View$OnClickListener)this);
        final EditText r = (EditText)inflate.findViewById(2131887142);
        r.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        r.setOnTouchListener((View$OnTouchListener)new fe((TextView)r, this));
        this.r = r;
        return inflate;
    }
    
    public void onDestroy() {
        this.a.unregisterAll();
        super.onDestroy();
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        return textView == this.r && n == 3 && this.g();
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final int n3 = n - this.n.getHeaderViewsCount();
        if (n3 < 0 || n3 >= this.o.getCount()) {
            return;
        }
        final TwitterPlace a = this.o.a(n3);
        final GeoTagState b = this.b();
        if (b.c() && a.equals(b.e()) && this.f != null) {
            this.v = true;
            this.f.b(false);
            return;
        }
        final f a2 = this.a.a(this.o.a().b());
        if (a2 == null) {
            com.twitter.util.e.a(new IllegalStateException("PlaceList cannot be null here"));
        }
        else {
            this.a(new GeoTagState(a, this.k(), a2.a(), true, false, this.q.c()));
        }
        if (this.f != null) {
            this.v = true;
            this.f.b(false);
        }
        this.a(this.A = true, true, "compose:poi:poi_list:location:select", a.placeId, a.placeType, Double.NaN, Double.NaN, this.a.b(a), 0, n3, this.a.a(a), this.i(), "geotag", System.currentTimeMillis());
    }
    
    @Override
    public void onPause() {
        this.r.removeTextChangedListener((TextWatcher)this.F);
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.y) {
            if (this.f != null) {
                this.v = true;
                this.f.b(false);
                final GeoTagState b = this.b();
                if (b.c()) {
                    this.f.a(b.e().fullName);
                }
            }
            this.y = false;
        }
        this.f(false);
        this.r.addTextChangedListener((TextWatcher)this.F);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_search_text_changed_since_last_search", this.B);
        bundle.putSerializable("place_picker_presenter_source", (Serializable)this.o.a().b());
    }
    
    public void onScroll(final AbsListView absListView, final int u, final int n, final int n2) {
        if (this.u > u) {
            this.q.a();
        }
        else if (this.u < u) {
            this.q.b();
        }
        if (this.f()) {
            return;
        }
        int headerViewsCount;
        if (this.n == null) {
            headerViewsCount = 0;
        }
        else {
            headerViewsCount = this.n.getHeaderViewsCount();
        }
        if (u - headerViewsCount > 0) {
            this.j(true);
        }
        else {
            this.j(false);
        }
        this.u = u;
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (this.v) {
            return true;
        }
        final int id = view.getId();
        if (id == 2131887143) {
            this.r.clearFocus();
            com.twitter.util.t.a((Context)this.getActivity(), (View)this.r, false);
        }
        else if (id == 2131887138) {
            return true;
        }
        return false;
    }
}
