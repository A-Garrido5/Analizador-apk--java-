// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.io.Serializable;
import android.view.MenuItem;
import android.content.Intent;
import com.google.android.gms.maps.model.CameraPosition;
import android.content.SharedPreferences$Editor;
import android.app.Activity;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import com.whatsapp.util.aw;
import java.io.File;
import android.location.LocationManager;
import android.view.View$OnLongClickListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.text.method.LinkMovementMethod;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.graphics.BitmapFactory;
import com.google.android.gms.maps.MapsInitializer;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationServices;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.VisibleRegion;
import android.text.Html;
import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.gms.maps.model.MarkerOptions;
import android.content.Context;
import com.whatsapp.fieldstats.b_;
import com.whatsapp.fieldstats.aa;
import android.os.AsyncTask;
import android.content.SharedPreferences;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap$OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap$OnMapClickListener;
import com.google.android.gms.maps.GoogleMap$OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap$OnMarkerClickListener;
import com.whatsapp.util.b7;
import android.widget.ListView;
import com.whatsapp.fieldstats.at;
import android.widget.ImageView;
import android.os.HandlerThread;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.common.api.GoogleApiClient;
import android.graphics.Bitmap;
import android.os.Handler;
import android.location.Location;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;

public class LocationPicker2 extends DialogToastActivity implements GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener, LocationListener
{
    private static long X;
    private static final String[] bb;
    private static final LocationRequest x;
    private BitmapDescriptor A;
    private View B;
    private int C;
    private Location D;
    private long E;
    private boolean F;
    private Handler G;
    private aog H;
    private aw2 I;
    private int J;
    private PlaceInfo K;
    private k_ L;
    private PlaceInfo M;
    private Bitmap N;
    private float O;
    private String P;
    private float Q;
    private Handler R;
    private GoogleApiClient S;
    private GoogleMap T;
    private TextView U;
    private TextView V;
    private ProgressBar W;
    private HandlerThread Y;
    private ImageView Z;
    private nf aa;
    private View ab;
    private ProgressBar ac;
    private boolean k;
    private boolean l;
    private at m;
    private GoogleMapView2 n;
    private View o;
    private Bitmap p;
    private View q;
    private Runnable r;
    private ListView s;
    private int t;
    private boolean u;
    private View v;
    private b7 w;
    private BitmapDescriptor y;
    private View z;
    
    static {
        final String[] bb2 = new String[22];
        String s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0002\u001c.0";
        int n = -1;
        String[] array = bb2;
        int n2 = 0;
        String intern = null;
    Label_0582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = ']';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0014\u001c/";
                    n2 = 1;
                    array = bb2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0014\u00125";
                    n2 = 2;
                    array = bb2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001b\u001c,ss\u0010\u00125.e\b\u0003\u001e-v\u001d\u0015$/a\u0016\u0010$.";
                    n2 = 3;
                    array = bb2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0014\u001c/";
                    n2 = 4;
                    array = bb2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = bb2;
                    s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0002\u001c.0";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001b\u001c,ss\u0010\u00125.e\b\u0003\u001e-v\u001d\u0015$/a\u0016\u0010$.";
                    n = 5;
                    array = bb2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000b\u001b /a'\u001f.>e\f\u001a.3[\u0014\u00125";
                    n = 6;
                    array = bb2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\b\u001f >a\u000b";
                    n = 7;
                    array = bb2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "D\u0012a5v\u001d\u0015|zl\f\u00071.>W\\'2q\n\u00000(e\n\u0016o>k\u0015\\fcb\u0017\u00063.u\r\u0012388W\u0012\u007f";
                    n = 8;
                    array = bb2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\t\u0006$/}";
                    n = 9;
                    array = bb2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0019\u001d%/k\u0011\u0017o4j\f\u0016/)*\u0019\u001054k\u0016]\u0012\u0018E*0\t";
                    n = 10;
                    array = bb2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0014\u001c\"<p\u0011\u001c/-m\u001b\u0018$/+\u001b\u0001$<p\u001d";
                    n = 11;
                    array = bb2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0012\u001a%";
                    n = 12;
                    array = bb2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\b\u001f >a\u000b";
                    n = 13;
                    array = bb2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u001f\u00032";
                    n = 14;
                    array = bb2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0019\u0011./p\u0011\u001d&}`\r\u0016a)kX\u001d )m\u000e\u0016a1m\u001a\u0001 /m\u001d\u0000a0m\u000b\u0000(3c";
                    n = 15;
                    array = bb2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0016\u00165*k\n\u0018";
                    n = 16;
                    array = bb2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "(\u001f >a\u000b";
                    n = 17;
                    array = bb2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "?\u0016.\u001ek\u001c\u0016";
                    n = 18;
                    array = bb2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0014\u001c\"<p\u0011\u001c/";
                    n = 19;
                    array = bb2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\b\u001f >a\u000b";
                    n = 20;
                    array = bb2;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        bb = bb2;
        LocationPicker2.X = 0L;
        x = LocationRequest.create().setInterval(5000L).setFastestInterval(16L).setPriority(100);
    }
    
    public LocationPicker2() {
        this.C = -1;
        this.l = true;
        this.K = new PlaceInfo();
        this.m = at.DID_NOT_REQUEST;
        this.t = 1;
    }
    
    static int a(final LocationPicker2 locationPicker2, final int j) {
        return locationPicker2.J = j;
    }
    
    static long a(final long x) {
        return LocationPicker2.X = x;
    }
    
    static Location a(final LocationPicker2 locationPicker2, final Location d) {
        return locationPicker2.D = d;
    }
    
    static ListView a(final LocationPicker2 locationPicker2) {
        return locationPicker2.s;
    }
    
    static PlaceInfo a(final LocationPicker2 locationPicker2, final PlaceInfo m) {
        return locationPicker2.M = m;
    }
    
    static aog a(final LocationPicker2 locationPicker2, final aog h) {
        return locationPicker2.H = h;
    }
    
    static at a(final LocationPicker2 locationPicker2, final at m) {
        return locationPicker2.m = m;
    }
    
    static k_ a(final LocationPicker2 locationPicker2, final k_ l) {
        return locationPicker2.L = l;
    }
    
    private void a() {
        this.T.setTrafficEnabled(false);
        this.T.setIndoorEnabled(true);
        this.T.setMyLocationEnabled(true);
        this.T.getUiSettings().setMyLocationButtonEnabled(false);
        this.T.setOnMarkerClickListener(new af(this));
        this.T.setOnInfoWindowClickListener(new sk(this));
        this.T.setOnMapClickListener(new aql(this));
        this.T.setOnCameraChangeListener(new _d(this));
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361930);
        this.T.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.L != null) {
            this.b();
            if (!App.I) {
                return;
            }
        }
        final SharedPreferences sharedPreferences = this.getSharedPreferences(LocationPicker2.bb[3], 0);
        this.T.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(sharedPreferences.getFloat(LocationPicker2.bb[2], 37.389805f), sharedPreferences.getFloat(LocationPicker2.bb[1], -122.08141f))));
        this.T.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(LocationPicker2.bb[0], 18.0f) - 0.2f));
    }
    
    private void a(final Location location, final int n, final String s, final boolean b) {
        this.G.removeCallbacks(this.r);
        this.W.setVisibility(0);
        if (this.o.getVisibility() != 0) {
            this.ac.setVisibility(0);
        }
        this.findViewById(2131755644).setVisibility(8);
        if (this.T != null) {
            this.T.clear();
        }
        this.M = null;
        this.s.removeFooterView((View)this.V);
        this.L = new k_();
        this.I.notifyDataSetChanged();
        this.m = at.CANCEL;
        a8s.a(this.aa = new nf(this, location, n, s, b), new Void[0]);
    }
    
    static void a(final LocationPicker2 locationPicker2, final Location location, final int n, final String s, final boolean b) {
        locationPicker2.a(location, n, s, b);
    }
    
    static void a(final LocationPicker2 locationPicker2, final aa aa) {
        locationPicker2.a(aa);
    }
    
    static void a(final LocationPicker2 locationPicker2, final aa aa, final int n) {
        locationPicker2.a(aa, n);
    }
    
    private void a(final aa aa) {
        this.a(aa, 0);
    }
    
    private void a(final aa aa, final int n) {
        long max = 0L;
        final boolean i = App.I;
        if (this.E > max) {
            max = Math.max(max, System.currentTimeMillis() - this.E);
        }
        b_ b_ = null;
        Label_0061: {
            Label_0116: {
                switch (this.t) {
                    case 1: {
                        b_ = com.whatsapp.fieldstats.b_.GOOGLE;
                        if (i) {
                            break Label_0116;
                        }
                        break Label_0061;
                    }
                    case 2: {
                        b_ = com.whatsapp.fieldstats.b_.FOURSQUARE;
                        if (i) {
                            break;
                        }
                        break Label_0061;
                    }
                }
            }
            b_ = com.whatsapp.fieldstats.b_.FACEBOOK;
        }
        aam.a((Context)this, b_, aa, this.m, this.u, this.o.getVisibility() != 0, this.J, n, max);
    }
    
    static boolean a(final LocationPicker2 locationPicker2, final boolean u) {
        return locationPicker2.u = u;
    }
    
    static int b(final LocationPicker2 locationPicker2, final int t) {
        return locationPicker2.t = t;
    }
    
    static Handler b(final LocationPicker2 locationPicker2) {
        return locationPicker2.R;
    }
    
    private void b() {
        final boolean i = App.I;
        this.T.clear();
        for (final PlaceInfo placeInfo : this.L.d()) {
            final MarkerOptions position = new MarkerOptions().position(new LatLng(placeInfo.lat, placeInfo.lon));
            if (!TextUtils.isEmpty((CharSequence)placeInfo.name)) {
                position.title(placeInfo.name);
            }
            if (!TextUtils.isEmpty((CharSequence)placeInfo.vicinity)) {
                position.snippet(placeInfo.vicinity);
            }
            position.icon(this.A);
            position.anchor(0.5f, 0.5f);
            placeInfo.tag = this.T.addMarker(position);
            if (i) {
                break;
            }
        }
        new MarkerOptions().position(this.T.getCameraPosition().target).title(this.getString(2131231638));
    }
    
    static boolean b(final LocationPicker2 locationPicker2, final boolean f) {
        return locationPicker2.F = f;
    }
    
    static aw2 c(final LocationPicker2 locationPicker2) {
        return locationPicker2.I;
    }
    
    static boolean c(final LocationPicker2 locationPicker2, final boolean l) {
        return locationPicker2.l = l;
    }
    
    static BitmapDescriptor d(final LocationPicker2 locationPicker2) {
        return locationPicker2.A;
    }
    
    static ImageView e(final LocationPicker2 locationPicker2) {
        return locationPicker2.Z;
    }
    
    private void e() {
        String s;
        if (this.L != null && !this.L.a()) {
            if (this.L.g() == 2) {
                s = this.getString(2131231278, new Object[] { LocationPicker2.bb[9] });
            }
            else {
                s = this.L.f();
            }
        }
        else {
            s = null;
        }
        this.s.removeFooterView((View)this.V);
        if (s != null) {
            this.V.setText((CharSequence)Html.fromHtml(s));
            this.s.addFooterView((View)this.V, (Object)null, true);
        }
    }
    
    private int f() {
        final Location g = this.g();
        final VisibleRegion visibleRegion = this.T.getProjection().getVisibleRegion();
        final Location location = new Location("");
        location.setLatitude((visibleRegion.nearLeft.latitude + visibleRegion.nearRight.latitude) / 2.0);
        location.setLongitude((visibleRegion.nearLeft.longitude + visibleRegion.nearRight.longitude) / 2.0);
        return (int)g.distanceTo(location);
    }
    
    static Location f(final LocationPicker2 locationPicker2) {
        return locationPicker2.g();
    }
    
    private Location g() {
        final LatLng target = this.T.getCameraPosition().target;
        final Location location = new Location("");
        location.setLatitude(target.latitude);
        location.setLongitude(target.longitude);
        return location;
    }
    
    static GoogleMap g(final LocationPicker2 locationPicker2) {
        return locationPicker2.T;
    }
    
    static b7 h(final LocationPicker2 locationPicker2) {
        return locationPicker2.w;
    }
    
    private void h() {
        if (this.T == null) {
            this.T = this.n.getMap();
            if (this.T != null) {
                this.a();
            }
        }
    }
    
    static long i() {
        return LocationPicker2.X;
    }
    
    static ProgressBar i(final LocationPicker2 locationPicker2) {
        return locationPicker2.ac;
    }
    
    static View j(final LocationPicker2 locationPicker2) {
        return locationPicker2.z;
    }
    
    static k_ k(final LocationPicker2 locationPicker2) {
        return locationPicker2.L;
    }
    
    static View l(final LocationPicker2 locationPicker2) {
        return locationPicker2.o;
    }
    
    static void m(final LocationPicker2 locationPicker2) {
        locationPicker2.e();
    }
    
    static void n(final LocationPicker2 locationPicker2) {
        locationPicker2.b();
    }
    
    static PlaceInfo o(final LocationPicker2 locationPicker2) {
        return locationPicker2.M;
    }
    
    static PlaceInfo p(final LocationPicker2 locationPicker2) {
        return locationPicker2.K;
    }
    
    static Bitmap q(final LocationPicker2 locationPicker2) {
        return locationPicker2.p;
    }
    
    static int r(final LocationPicker2 locationPicker2) {
        return locationPicker2.f();
    }
    
    static BitmapDescriptor s(final LocationPicker2 locationPicker2) {
        return locationPicker2.y;
    }
    
    static String t(final LocationPicker2 locationPicker2) {
        return locationPicker2.P;
    }
    
    static View u(final LocationPicker2 locationPicker2) {
        return locationPicker2.q;
    }
    
    static GoogleMapView2 v(final LocationPicker2 locationPicker2) {
        return locationPicker2.n;
    }
    
    static int w(final LocationPicker2 locationPicker2) {
        return locationPicker2.t;
    }
    
    static aog x(final LocationPicker2 locationPicker2) {
        return locationPicker2.H;
    }
    
    static Location y(final LocationPicker2 locationPicker2) {
        return locationPicker2.D;
    }
    
    static ProgressBar z(final LocationPicker2 locationPicker2) {
        return locationPicker2.W;
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final boolean i = App.I;
        if (this.o.getVisibility() == 8) {
            Label_0242: {
                switch (motionEvent.getAction()) {
                    case 0: {
                        if (this.k) {
                            break;
                        }
                        this.Q = motionEvent.getX();
                        this.O = motionEvent.getY();
                        if (i) {
                            break Label_0242;
                        }
                        break;
                    }
                    case 2: {
                        if (this.k) {
                            break;
                        }
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        if ((x - this.Q) * (x - this.Q) + (y - this.O) * (y - this.O) > 6.0f * vc.b().b) {
                            this.k = true;
                            this.v.setVisibility(0);
                            final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)this.v.getHeight(), 0.0f);
                            ((Animation)translateAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
                            ((Animation)translateAnimation).setDuration(120L);
                            this.ab.startAnimation((Animation)translateAnimation);
                            if (this.q.getVisibility() == 0) {
                                this.q.startAnimation((Animation)translateAnimation);
                            }
                            this.z.setVisibility(0);
                        }
                        if (i) {
                            break Label_0242;
                        }
                        break;
                    }
                    case 1:
                    case 3: {
                        this.Q = 0.0f;
                        this.O = 0.0f;
                        if (!this.k) {
                            break;
                        }
                        this.k = false;
                        this.v.setVisibility(8);
                        final TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float)(-this.v.getHeight()), 0.0f);
                        ((Animation)translateAnimation2).setInterpolator((Interpolator)new DecelerateInterpolator());
                        ((Animation)translateAnimation2).setDuration(120L);
                        this.ab.startAnimation((Animation)translateAnimation2);
                        if (this.q.getVisibility() == 0) {
                            this.q.startAnimation((Animation)translateAnimation2);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    @Override
    public void onBackPressed() {
        this.a(com.whatsapp.fieldstats.aa.CANCEL);
        super.onBackPressed();
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        LocationServices.FusedLocationApi.requestLocationUpdates(this.S, LocationPicker2.x, this);
        this.D = LocationServices.FusedLocationApi.getLastLocation(this.S);
    }
    
    @Override
    public void onConnectionFailed(final ConnectionResult connectionResult) {
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(LocationPicker2.bb[12]);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(LocationPicker2.bb[16]);
            this.finish();
            return;
        }
        if (App.aX == null) {
            this.finish();
            return;
        }
        final String au = App.au();
        Label_0119: {
            if (au != null && au.length() > 1) {
                if (au.hashCode() % 3 == 0) {
                    this.t = 3;
                    if (!App.I) {
                        break Label_0119;
                    }
                }
                int t;
                if ((-48 + au.charAt(-2 + au.length())) % 2 == 1) {
                    t = 1;
                }
                else {
                    t = 2;
                }
                this.t = t;
            }
        }
        if (App.aV == 3) {
            this.t = 3;
        }
        this.S = new GoogleApiClient$Builder((Context)this).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        this.P = this.getIntent().getStringExtra(LocationPicker2.bb[13]);
        if (bundle != null) {
            this.L = (k_)bundle.getSerializable(LocationPicker2.bb[14]);
            bundle.remove(LocationPicker2.bb[21]);
        }
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903176, null, false));
        this.z = this.findViewById(2131755630);
        (this.ab = this.findViewById(2131755635)).setOnClickListener((View$OnClickListener)new ms(this));
        this.v = this.findViewById(2131755636);
        this.B = this.findViewById(2131755631);
        (this.q = this.findViewById(2131755633)).setOnClickListener((View$OnClickListener)new ag(this));
        this.o = this.findViewById(2131755642);
        MapsInitializer.initialize((Context)this);
        this.N = BitmapFactory.decodeResource(this.getResources(), 2130838892);
        this.A = BitmapDescriptorFactory.fromBitmap(this.N);
        this.p = BitmapFactory.decodeResource(this.getResources(), 2130838894);
        this.y = BitmapDescriptorFactory.fromBitmap(this.p);
        final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.mapType(1).mapToolbarEnabled(false).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(false).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        this.n = new LocationPicker2$3(this, (Context)this, googleMapOptions);
        ((ViewGroup)this.findViewById(2131755493)).addView((View)this.n);
        this.n.onCreate(bundle);
        this.h();
        this.G = new Handler();
        this.r = new su(this);
        if (this.L == null) {
            this.G.postDelayed(this.r, 15000L);
        }
        this.U = (TextView)this.findViewById(2131755641);
        final View viewById = this.findViewById(2131755639);
        viewById.setOnClickListener((View$OnClickListener)new zh(this));
        this.I = new aw2(this, (Context)this);
        this.s = (ListView)this.findViewById(2131755643);
        (this.V = new TextView((Context)this)).setMovementMethod(LinkMovementMethod.getInstance());
        this.V.setGravity(17);
        this.V.setPadding((int)vc.b().d, 0, (int)vc.b().d, 0);
        this.s.setFooterDividersEnabled(true);
        this.s.addFooterView((View)this.V, (Object)null, true);
        this.s.setAdapter((ListAdapter)this.I);
        this.e();
        this.s.setOnItemClickListener((AdapterView$OnItemClickListener)new aq7(this));
        this.W = (ProgressBar)this.findViewById(2131755513);
        final ProgressBar w = this.W;
        int visibility;
        if (this.L == null) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        w.setVisibility(visibility);
        this.ac = (ProgressBar)this.findViewById(2131755637);
        if (App.aV == 3) {
            viewById.setOnLongClickListener((View$OnLongClickListener)new ib(this));
        }
        if (bundle == null) {
            final LocationManager locationManager = (LocationManager)this.getSystemService(LocationPicker2.bb[20]);
            if (!locationManager.isProviderEnabled(LocationPicker2.bb[15]) && !locationManager.isProviderEnabled(LocationPicker2.bb[17])) {
                this.showDialog(2);
            }
        }
        final ImageView imageView = (ImageView)this.findViewById(2131755638);
        imageView.setOnClickListener((View$OnClickListener)new fg(this, imageView));
        (this.Z = (ImageView)this.findViewById(2131755606)).setOnClickListener((View$OnClickListener)new y8(this));
        final File file = new File(App.aq.getCacheDir(), LocationPicker2.bb[18]);
        file.mkdirs();
        this.w = new aw(file).a((int)(48.0f * vc.b().b)).a();
        (this.Y = new HandlerThread(LocationPicker2.bb[19])).start();
        this.R = new Handler(this.Y.getLooper());
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 2: {
                return new AlertDialog$Builder((Context)this).setTitle(2131231153).setMessage(2131231152).setCancelable(true).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new a9s(this)).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231614).setIcon(2130838731), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131231524).setIcon(2130838729), 1);
        if (App.aS == 3) {
            com.whatsapp.util.b_.c(this);
        }
        return true;
    }
    
    @Override
    protected void onDestroy() {
        this.n.onDestroy();
        if (this.G != null) {
            this.G.removeCallbacks(this.r);
        }
        if (this.aa != null) {
            this.aa.cancel(true);
            this.aa = null;
        }
        if (this.T != null) {
            final SharedPreferences$Editor edit = this.getSharedPreferences(LocationPicker2.bb[6], 0).edit();
            final CameraPosition cameraPosition = this.T.getCameraPosition();
            edit.putFloat(LocationPicker2.bb[7], (float)cameraPosition.target.latitude);
            edit.putFloat(LocationPicker2.bb[4], (float)cameraPosition.target.longitude);
            edit.putFloat(LocationPicker2.bb[5], cameraPosition.zoom);
            edit.commit();
        }
        this.w.b();
        this.Y.quit();
        super.onDestroy();
    }
    
    @Override
    public void onLocationChanged(final Location location) {
        final boolean i = App.I;
        if (location != null) {
            if (this.D == null && this.T != null) {
                this.n.setLocationMode(1);
                this.T.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude())));
            }
            this.D = location;
            int max = 0;
            Label_0083: {
                if (location.hasAccuracy()) {
                    max = Math.max(1, (int)location.getAccuracy());
                    if (!i) {
                        break Label_0083;
                    }
                }
                max = -1;
            }
            Label_0165: {
                if (max != this.C) {
                    if ((this.C = max) > 0) {
                        this.U.setVisibility(0);
                        this.U.setText((CharSequence)String.format(App.C.a(2131296275, max), max));
                        if (!i) {
                            break Label_0165;
                        }
                    }
                    this.U.setVisibility(8);
                }
            }
            boolean b;
            if (this.L != null && this.L.h() != null && this.l && location.getAccuracy() < 200.0f && this.L.h().distanceTo(location) > 1000.0f) {
                this.l = false;
                b = true;
            }
            else {
                b = false;
            }
            this.D = location;
            if ((this.L == null || b) && ((location.getAccuracy() < 200.0f && 60000L + location.getTime() > System.currentTimeMillis()) || this.F)) {
                this.runOnUiThread((Runnable)new fj(this, b));
            }
        }
    }
    
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        this.n.onLowMemory();
    }
    
    public void onNewIntent(final Intent intent) {
        if (LocationPicker2.bb[11].equals(intent.getAction())) {
            this.a(this.g(), Math.max(this.f(), 1500), intent.getStringExtra(LocationPicker2.bb[10]), true);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 0: {
                this.onSearchRequested();
                return true;
            }
            case 1: {
                this.l = false;
                this.a(this.g(), this.f(), null, false);
                return true;
            }
            case 16908332: {
                this.a(com.whatsapp.fieldstats.aa.CANCEL);
                this.finish();
                return true;
            }
        }
    }
    
    @Override
    protected void onPause() {
        this.n.onPause();
        this.n.c();
        if (this.S != null && this.S.isConnected()) {
            this.S.disconnect();
        }
        super.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.n.onResume();
        this.n.a();
        this.h();
        this.S.connect();
        this.E = System.currentTimeMillis();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        this.n.onSaveInstanceState(bundle);
        bundle.putSerializable(LocationPicker2.bb[8], (Serializable)this.L);
        super.onSaveInstanceState(bundle);
    }
    
    public boolean onSearchRequested() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755491);
        if (viewGroup != null) {
            viewGroup.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        String c;
        if (this.L == null) {
            c = null;
        }
        else {
            c = this.L.c();
        }
        this.startSearch(c, true, (Bundle)null, false);
        return true;
    }
}
