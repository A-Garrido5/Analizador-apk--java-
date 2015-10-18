// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.io.Serializable;
import android.view.MenuItem;
import android.content.Intent;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import com.whatsapp.util.aw;
import java.io.File;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.Toolbar;
import android.location.LocationManager;
import android.view.View$OnLongClickListener;
import android.widget.ImageView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.text.method.LinkMovementMethod;
import android.view.View$OnClickListener;
import com.google.android.maps.MapView;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import android.text.Html;
import android.os.AsyncTask;
import android.view.View;
import com.google.android.maps.MyLocationOverlay;
import android.widget.ListView;
import com.whatsapp.util.b7;
import android.location.Location;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.maps.MapActivity;

public class LocationPicker extends MapActivity implements ast
{
    private static long e;
    private static boolean h;
    private static final String[] z;
    private PlaceInfo a;
    private boolean b;
    private TextView c;
    private ProgressBar d;
    private TextView f;
    private Handler g;
    private Location i;
    private b7 j;
    private ah k;
    private ListView l;
    private GoogleMapView m;
    private String n;
    private boolean o;
    private aso p;
    private MyLocationOverlay q;
    private cj r;
    private Runnable s;
    private k_ t;
    
    static {
        final String[] z2 = new String[18];
        String s = "veKQ\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0482:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "f~JQ\u0003nt\u0000J\u0002su@WBfsZJ\u0003i>}f-USf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "}\u007fAN";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "k\u007f@";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "w|O@\tt";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "kqZ";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "k\u007f@";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "k\u007fMB\u0018n\u007f@S\u0005d{KQCdbKB\u0018b";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "k\u007fMB\u0018n\u007f@";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "``]";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "frAQ\u0018n~I\u0003\bru\u000eW\u0003'~OW\u0005qu\u000eO\u0005ebOQ\u0005bc\u000eN\u0005tcGM\u000b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "}\u007fAN";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "myJ";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "kqZ";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "W|O@\tt";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "w|O@\tt";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "iuZT\u0003u{";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = ";q\u000eK\u001ebv\u0013\u0004\u0004sd^PV(?HL\u0019uc_V\ruu\u0000@\u0003j?\t\u001d\nhe\\P\u001drq\\FP(q\u0010";
                    n = 16;
                    continue;
                }
                case 16: {
                    break Label_0482;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LocationPicker.e = 0L;
        LocationPicker.h = false;
    }
    
    public LocationPicker() {
        this.o = true;
    }
    
    static long a() {
        return LocationPicker.e;
    }
    
    static long a(final long e) {
        return LocationPicker.e = e;
    }
    
    static Location a(final LocationPicker locationPicker, final Location i) {
        return locationPicker.i = i;
    }
    
    static PlaceInfo a(final LocationPicker locationPicker, final PlaceInfo a) {
        return locationPicker.a = a;
    }
    
    static k_ a(final LocationPicker locationPicker) {
        return locationPicker.t;
    }
    
    static k_ a(final LocationPicker locationPicker, final k_ t) {
        return locationPicker.t = t;
    }
    
    private void a(final Location location, final int n, final String s, final boolean b) {
        this.g.removeCallbacks(this.s);
        this.d.setVisibility(0);
        this.findViewById(2131755644).setVisibility(8);
        this.l.removeFooterView((View)this.f);
        this.t = new k_();
        this.r.notifyDataSetChanged();
        a8s.a(this.k = new ah(this, location, n, s, b), new Void[0]);
    }
    
    static void a(final LocationPicker locationPicker, final Location location, final int n, final String s, final boolean b) {
        locationPicker.a(location, n, s, b);
    }
    
    static boolean a(final LocationPicker locationPicker, final boolean o) {
        return locationPicker.o = o;
    }
    
    static boolean a(final boolean h) {
        return LocationPicker.h = h;
    }
    
    static cj b(final LocationPicker locationPicker) {
        return locationPicker.r;
    }
    
    private void b() {
        String s;
        if (this.t != null) {
            if (this.t.g() == 2) {
                s = this.getString(2131231278, new Object[] { LocationPicker.z[17] });
            }
            else {
                s = this.t.f();
            }
        }
        else {
            s = null;
        }
        this.l.removeFooterView((View)this.f);
        if (s != null) {
            this.f.setText((CharSequence)Html.fromHtml(s));
            this.l.addFooterView((View)this.f, (Object)null, true);
        }
    }
    
    static boolean b(final LocationPicker locationPicker, final boolean b) {
        return locationPicker.b = b;
    }
    
    static aso c(final LocationPicker locationPicker) {
        return locationPicker.p;
    }
    
    static boolean c() {
        return LocationPicker.h;
    }
    
    static PlaceInfo d(final LocationPicker locationPicker) {
        return locationPicker.a;
    }
    
    static b7 e(final LocationPicker locationPicker) {
        return locationPicker.j;
    }
    
    static String f(final LocationPicker locationPicker) {
        return locationPicker.n;
    }
    
    static GoogleMapView g(final LocationPicker locationPicker) {
        return locationPicker.m;
    }
    
    static ProgressBar h(final LocationPicker locationPicker) {
        return locationPicker.d;
    }
    
    static ListView i(final LocationPicker locationPicker) {
        return locationPicker.l;
    }
    
    static Location j(final LocationPicker locationPicker) {
        return locationPicker.i;
    }
    
    static void k(final LocationPicker locationPicker) {
        locationPicker.b();
    }
    
    static boolean l(final LocationPicker locationPicker) {
        return locationPicker.b;
    }
    
    static TextView m(final LocationPicker locationPicker) {
        return locationPicker.c;
    }
    
    static MyLocationOverlay n(final LocationPicker locationPicker) {
        return locationPicker.q;
    }
    
    static boolean o(final LocationPicker locationPicker) {
        return locationPicker.o;
    }
    
    public void a(final GeoPoint geoPoint, final int n, final int n2) {
    }
    
    protected boolean isRouteDisplayed() {
        return false;
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(LocationPicker.z[7]);
        if (alm.c) {
            this.getWindow().getDecorView().setLayoutDirection(3);
        }
        super.onCreate(bundle);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(LocationPicker.z[10]);
            this.finish();
            return;
        }
        if (App.aX == null) {
            this.finish();
            return;
        }
        DialogToastActivity.a((Activity)this, 2130903176);
        this.n = this.getIntent().getStringExtra(LocationPicker.z[12]);
        if (bundle != null) {
            this.t = (k_)bundle.getSerializable(LocationPicker.z[15]);
        }
        (this.m = new GoogleMapView((Context)this)).setClickable(true);
        this.m.setEnabled(true);
        this.m.setMapListener(this);
        this.m.setBuiltInZoomControls(false);
        this.m.getController().setZoom(18);
        ((ViewGroup)this.findViewById(2131755493)).addView((View)this.m);
        this.q = new aw6(this, (Context)this, this.m);
        this.g = new Handler();
        this.s = new d5(this);
        Label_0374: {
            if (this.t == null) {
                this.q.runOnFirstFix((Runnable)new a27(this));
                this.g.postDelayed(this.s, 15000L);
                if (!i) {
                    break Label_0374;
                }
            }
            if (bundle != null) {
                final int int1 = bundle.getInt(LocationPicker.z[11]);
                if (int1 > 0) {
                    this.m.getController().setCenter(new GeoPoint(bundle.getInt(LocationPicker.z[13]), bundle.getInt(LocationPicker.z[6])));
                    this.m.getController().setZoom(int1);
                }
                if (!i) {
                    break Label_0374;
                }
            }
            if (this.t.h() != null) {
                this.m.a(GoogleMapView.a(this.t.h()));
            }
        }
        (this.p = new aso(this)).a();
        this.m.getOverlays().add(this.p);
        this.m.getOverlays().add(this.q);
        this.c = (TextView)this.findViewById(2131755641);
        final View viewById = this.findViewById(2131755639);
        viewById.setOnClickListener((View$OnClickListener)new q0(this));
        this.r = new cj(this, (Context)this);
        this.l = (ListView)this.findViewById(2131755643);
        (this.f = new TextView((Context)this)).setMovementMethod(LinkMovementMethod.getInstance());
        this.f.setGravity(17);
        this.f.setPadding((int)vc.b().d, 0, (int)vc.b().d, 0);
        this.l.setFooterDividersEnabled(true);
        this.l.addFooterView((View)this.f, (Object)null, true);
        this.l.setAdapter((ListAdapter)this.r);
        this.b();
        this.l.setOnItemClickListener((AdapterView$OnItemClickListener)new in(this));
        this.d = (ProgressBar)this.findViewById(2131755513);
        final ProgressBar d = this.d;
        int visibility;
        if (this.t == null) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d.setVisibility(visibility);
        this.findViewById(2131755638).setVisibility(8);
        final ImageView imageView = (ImageView)this.findViewById(2131755606);
        imageView.setImageResource(2130837667);
        imageView.setOnClickListener((View$OnClickListener)new so(this));
        if (App.aV == 3) {
            viewById.setOnLongClickListener((View$OnLongClickListener)new h0(this));
        }
        if (bundle == null) {
            final LocationManager locationManager = (LocationManager)this.getSystemService(LocationPicker.z[8]);
            if (!locationManager.isProviderEnabled(LocationPicker.z[9]) && !locationManager.isProviderEnabled(LocationPicker.z[16])) {
                this.showDialog(2);
            }
        }
        final Toolbar toolbar = (Toolbar)this.findViewById(2131755371);
        MenuItemCompat.setShowAsAction(toolbar.getMenu().add(0, 0, 0, 2131231614).setIcon(2130838731), 2);
        MenuItemCompat.setShowAsAction(toolbar.getMenu().add(0, 1, 0, 2131231524).setIcon(2130838729), 2);
        toolbar.setOnMenuItemClickListener(new alb(this));
        final File file = new File(App.aq.getCacheDir(), LocationPicker.z[14]);
        file.mkdirs();
        this.j = new aw(file).a((int)(48.0f * vc.b().b)).a();
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setTitle(2131231153).setMessage(2131231152).setCancelable(true).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new aas(this)).create();
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.g != null) {
            this.g.removeCallbacks(this.s);
        }
        if (this.k != null) {
            this.k.cancel(true);
            this.k = null;
        }
        this.j.b();
    }
    
    public void onNewIntent(final Intent intent) {
        if (LocationPicker.z[1].equals(intent.getAction())) {
            this.a(this.m.c(), Math.max(this.m.b(), 1500), intent.getStringExtra(LocationPicker.z[0]), true);
        }
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    protected void onPause() {
        super.onPause();
        this.q.disableMyLocation();
    }
    
    protected void onResume() {
        super.onResume();
        this.q.enableMyLocation();
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final GeoPoint mapCenter = this.m.getMapCenter();
        bundle.putInt(LocationPicker.z[5], mapCenter.getLatitudeE6());
        bundle.putInt(LocationPicker.z[3], mapCenter.getLongitudeE6());
        bundle.putInt(LocationPicker.z[2], this.m.getZoomLevel());
        bundle.putSerializable(LocationPicker.z[4], (Serializable)this.t);
    }
    
    public boolean onSearchRequested() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755491);
        if (viewGroup != null) {
            viewGroup.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        String c;
        if (this.t == null) {
            c = null;
        }
        else {
            c = this.t.c();
        }
        this.startSearch(c, true, (Bundle)null, false);
        return true;
    }
}
