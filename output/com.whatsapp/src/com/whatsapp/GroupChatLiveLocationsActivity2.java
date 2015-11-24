// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences$Editor;
import com.whatsapp.util.b_;
import android.view.Menu;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import android.app.Activity;
import com.whatsapp.util.cq;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import android.os.Bundle;
import com.google.android.gms.maps.Projection;
import com.whatsapp.util.Log;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.util.Pair;
import java.util.ArrayList;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.SharedPreferences;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap$OnMapClickListener;
import com.google.android.gms.maps.GoogleMap$OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap$OnMarkerClickListener;
import java.util.Iterator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.graphics.Paint$Align;
import android.text.TextPaint;
import android.graphics.MaskFilter;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Collection;
import android.graphics.Point;
import com.google.android.gms.maps.model.VisibleRegion;
import android.location.Location;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMap;
import android.view.MenuItem;
import java.util.HashMap;
import com.whatsapp.protocol.bt;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;

public class GroupChatLiveLocationsActivity2 extends DialogToastActivity implements GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener, LocationListener
{
    private static final String[] z;
    private bt k;
    private HashMap l;
    private MenuItem m;
    private boolean n;
    private HashMap o;
    private GoogleMapView2 p;
    private float q;
    private GoogleMap r;
    private ImageView s;
    private ao2 t;
    
    static {
        final String[] z2 = new String[24];
        String s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0632:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '2';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001a0y.F\u000e!l";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001b>g";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001b0}";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\r>f\u001c";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u00049f\u0006m\u0003#h\u0017T\u001e2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001b0}";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\r>f\u001c";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001b>g";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "6{\u001eG\u0007=f\u0012S\u00038f\u001fAX<h\u0003Y\u0012#j\u0003W\u0016%l\u0015\u0012";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "qz\u0014^\u00122}\u0014V";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001a0y.F\u000e!l";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001a0y.F\u000e!l";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u00049f\u0006m\u0003#h\u0017T\u001e2";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "=`\u0007W(=f\u0012S\u00038f\u001fm\u001a0y.F\u000e!l";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "2f\u001c\u001c\u00009h\u0005A\u0016!y.B\u00054o\u0014@\u0012?j\u0014A";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = ";`\u0015";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "6{\u001eG\u0007=f\u0012S\u00038f\u001fAX2{\u0014S\u00034";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    break Label_0632;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GroupChatLiveLocationsActivity2() {
        this.l = new HashMap();
        this.o = new HashMap();
        this.q = -1.0f;
        this.t = new aoc(this);
    }
    
    private float a(final float n) {
        if (n > 0.0f) {
            final VisibleRegion visibleRegion = this.r.getProjection().getVisibleRegion();
            final Location location = new Location("");
            location.setLatitude(visibleRegion.nearLeft.latitude);
            location.setLongitude(visibleRegion.nearLeft.longitude);
            final Location location2 = new Location("");
            location2.setLatitude(visibleRegion.nearRight.latitude);
            location2.setLongitude(visibleRegion.nearRight.longitude);
            final double n2 = location2.distanceTo(location);
            if (n2 > 0.0) {
                final float n3 = (float)(this.r.getCameraPosition().zoom + Math.log(n2 / n / 30.0) / Math.log(2.0));
                if (n3 <= 17.0f) {
                    return n3;
                }
            }
        }
        return 17.0f;
    }
    
    static float a(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, final float q) {
        return groupChatLiveLocationsActivity2.q = q;
    }
    
    private Point a(final int n) {
        if (n < 4) {
            return new Point(n, 1);
        }
        return new Point(2, 2);
    }
    
    private Point a(final int n, final Point point) {
        return new Point(n % point.x, n / point.x);
    }
    
    private MarkerOptions a(final Collection collection, final boolean b, final int color) {
        final boolean i = App.I;
        final Point a = this.a(collection.size());
        final int n = (int)(32.0f * vc.b().b);
        final int n2 = (int)(3.5f * vc.b().b);
        final int n3 = n2 + (n + n2) * a.x;
        final int n4 = n2 + (n + n2) * a.y;
        final int n5 = (int)(10.0f * vc.b().b);
        final float n6 = 3.0f * vc.b().b / 2.0f;
        final int n7 = n / 5 - (int)n6;
        final yj yj = new yj();
        if (b) {
            yj.setState(new int[] { 16842913 });
        }
        yj.a(n5);
        final Rect rect = new Rect();
        yj.getPadding(rect);
        yj.setBounds(0, 0, n3 + rect.left + rect.right, n4 + rect.top + rect.bottom);
        final Bitmap bitmap = Bitmap.createBitmap(n3 + rect.left + rect.right, n4 + rect.top + rect.bottom + (int)(n6 + n7 * 2), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final int n8 = rect.left + n3 / 2;
        final int n9 = n4 + rect.top + rect.bottom + (int)(n7 - n6);
        final BlurMaskFilter maskFilter = new BlurMaskFilter(n6, BlurMaskFilter$Blur.NORMAL);
        final Paint paint = new Paint(1);
        paint.setColor(-6710887);
        paint.setStyle(Paint$Style.FILL);
        paint.setMaskFilter((MaskFilter)maskFilter);
        canvas.translate(0.0f, n6);
        canvas.drawCircle((float)n8, (float)n9, (float)n7, paint);
        canvas.translate(0.0f, -n6);
        paint.setMaskFilter((MaskFilter)null);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint$Style.STROKE);
        paint.setColor(-1728053248);
        canvas.drawCircle((float)n8, (float)n9, (float)n7, paint);
        paint.setStyle(Paint$Style.FILL);
        paint.setColor(color);
        canvas.drawCircle((float)n8, (float)n9, (float)n7, paint);
        yj.draw(canvas);
        final Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
        final Iterator<String> iterator = collection.iterator();
        int n10 = 0;
        while (iterator.hasNext()) {
            final a_9 e = App.S.e(iterator.next());
            Bitmap bitmap2 = e.a(this.getResources().getDimensionPixelSize(2131361952), this.getResources().getDimension(2131361814), true);
            if (bitmap2 == null) {
                bitmap2 = e.x();
            }
            final Point a2 = this.a(n10, a);
            final Rect rect2 = new Rect(n2 + rect.left, n2 + rect.top, n + (n2 + rect.left), n + (n2 + rect.top));
            rect2.offset(a2.x * (n2 + n), a2.y * (n2 + n));
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), rect2, paint2);
            final int n11 = n10 + 1;
            if ((n11 >= 4 && !i) || i) {
                break;
            }
            n10 = n11;
        }
        if (collection.size() > 4) {
            final float n12 = rect.left + n3 / 2;
            final float n13 = rect.top + n4 / 2;
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint$Style.STROKE);
            paint.setColor(-1728053248);
            paint.setStyle(Paint$Style.FILL);
            paint.setColor(-1);
            canvas.drawCircle(n12, n13, (float)(n7 * 2), paint);
            final TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(1.3f * (n7 * 2));
            textPaint.setColor(-16737844);
            textPaint.setTextAlign(Paint$Align.CENTER);
            textPaint.setFakeBoldText(true);
            final Rect rect3 = new Rect();
            final String string = Integer.toString(collection.size());
            textPaint.getTextBounds(string, 0, string.length(), rect3);
            canvas.drawText(Integer.toString(collection.size()), n12, n13 + rect3.height() / 2, (Paint)textPaint);
        }
        final MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmap)).anchor(0.5f, (bitmap.getHeight() - n7) / bitmap.getHeight());
        return markerOptions;
    }
    
    static GoogleMapView2 a(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.p;
    }
    
    static bt a(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, final bt k) {
        return groupChatLiveLocationsActivity2.k = k;
    }
    
    private void a() {
    }
    
    static void a(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, final boolean b) {
        groupChatLiveLocationsActivity2.b(b);
    }
    
    static float b(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, final float n) {
        return groupChatLiveLocationsActivity2.a(n);
    }
    
    static HashMap b(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.l;
    }
    
    private void b() {
        final boolean boolean1 = this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[1], 0).getBoolean(GroupChatLiveLocationsActivity2.z[7], false);
        this.r.setTrafficEnabled(boolean1);
        if (this.m != null) {
            this.m.setChecked(boolean1);
        }
        this.r.setMapType(this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[6], 0).getInt(GroupChatLiveLocationsActivity2.z[2], 1));
        this.r.setIndoorEnabled(true);
        this.r.setMyLocationEnabled(true);
        this.r.getUiSettings().setCompassEnabled(true);
        this.r.getUiSettings().setZoomControlsEnabled(false);
        this.r.getUiSettings().setMyLocationButtonEnabled(false);
        this.r.setOnMarkerClickListener(new bo(this));
        this.r.setOnCameraChangeListener(new y4(this));
        this.r.setOnMapClickListener(new kd(this));
        this.g();
        if (this.t.g.isEmpty()) {
            final SharedPreferences sharedPreferences = this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[0], 0);
            this.r.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(sharedPreferences.getFloat(GroupChatLiveLocationsActivity2.z[4], 37.389805f), sharedPreferences.getFloat(GroupChatLiveLocationsActivity2.z[3], -122.08141f))));
            this.r.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(GroupChatLiveLocationsActivity2.z[5], 17.0f) - 0.2f));
            if (!App.I) {
                return;
            }
        }
        this.b(false);
    }
    
    private void b(final boolean b) {
        final boolean i = App.I;
        if (this.r != null && !this.t.g.isEmpty()) {
            if (this.p.getWidth() <= 0 || this.p.getHeight() <= 0) {
                this.p.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new a2h(this));
                return;
            }
            final Iterator<bt> iterator = this.t.g.iterator();
            double min = 90.0;
            double max = -90.0;
            double n = 180.0;
            double n2 = -180.0;
            while (true) {
                while (iterator.hasNext()) {
                    final bt bt = iterator.next();
                    min = Math.min(min, bt.f);
                    max = Math.max(max, bt.f);
                    n = Math.min(n, bt.c);
                    double n3 = Math.max(n2, bt.c);
                    if (i) {
                        final double n4 = min;
                        final double n5 = max;
                        Label_0293: {
                            if (n3 - n > 180.0) {
                                final Iterator<bt> iterator2 = this.t.g.iterator();
                                n = 360.0;
                                double n6 = 0.0;
                                while (iterator2.hasNext()) {
                                    final bt bt2 = iterator2.next();
                                    double c;
                                    if (bt2.c < 0.0) {
                                        c = 360.0 + bt2.c;
                                    }
                                    else {
                                        c = bt2.c;
                                    }
                                    n = Math.min(n, c);
                                    double c2;
                                    if (bt2.c < 0.0) {
                                        c2 = 360.0 + bt2.c;
                                    }
                                    else {
                                        c2 = bt2.c;
                                    }
                                    n3 = Math.max(n6, c2);
                                    if (i) {
                                        break Label_0293;
                                    }
                                    n6 = n3;
                                }
                                n3 = n6;
                            }
                        }
                        double n7;
                        if (this.t.g.size() > 1) {
                            n7 = n5 + (n5 - n4) / 10.0;
                            if (b) {
                                this.r.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(n4, n), new LatLng(n7, n3)), (int)(64.0f * vc.b().b)));
                                if (!i) {
                                    return;
                                }
                            }
                            this.r.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(n4, n), new LatLng(n7, n3)), (int)(64.0f * vc.b().b)));
                            if (!i) {
                                return;
                            }
                        }
                        else {
                            n7 = n5;
                        }
                        if (b) {
                            this.r.animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(new LatLng((n4 + n7) / 2.0, (n + n3) / 2.0)).zoom(17.0f).build()));
                            if (!i) {
                                return;
                            }
                        }
                        this.r.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((n7 + n4) / 2.0, (n3 + n) / 2.0)));
                        this.r.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                        return;
                    }
                    n2 = n3;
                }
                double n3 = n2;
                final double n4 = min;
                final double n5 = max;
                continue;
            }
        }
    }
    
    static boolean b(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, final boolean n) {
        return groupChatLiveLocationsActivity2.n = n;
    }
    
    static ImageView c(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.s;
    }
    
    static void d(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.g();
    }
    
    private void e() {
        if (this.r == null) {
            this.r = this.p.getMap();
            if (this.r != null) {
                this.b();
            }
        }
    }
    
    static boolean e(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.n;
    }
    
    static float f(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.q;
    }
    
    private void f() {
        this.b(true);
    }
    
    private void g() {
        final boolean i = App.I;
        if (this.r != null) {
            final int width = this.p.getWidth();
            final int height = this.p.getHeight();
            if (width != 0 && height != 0) {
                this.l.clear();
                final Iterator<Marker> iterator = this.o.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().setVisible(false);
                    if (i) {
                        break;
                    }
                }
                final Projection projection = this.r.getProjection();
                final float n = 32.0f * vc.b().b;
                final float n2 = 48.0f * vc.b().b;
                final ArrayList<Object> list = new ArrayList<Object>();
                for (final bt bt : this.t.g) {
                    list.add(new Pair((Object)bt, (Object)projection.toScreenLocation(new LatLng(bt.f, bt.c))));
                    if (i) {
                        break;
                    }
                }
                Collections.sort(list, new ar_(this));
                final ArrayList<ArrayList<Pair>> list2 = new ArrayList<ArrayList<Pair>>();
                final Iterator<Pair> iterator3 = list.iterator();
                int x = Integer.MIN_VALUE;
                while (iterator3.hasNext()) {
                    final Pair pair = iterator3.next();
                    Log.i(((bt)pair.first).e + " " + x + " " + ((Point)pair.second).x);
                    Label_0400: {
                        if (n + x < ((Point)pair.second).x) {
                            final ArrayList<Pair> list3 = new ArrayList<Pair>();
                            list3.add(pair);
                            list2.add(list3);
                            x = ((Point)pair.second).x;
                            if (!i) {
                                break Label_0400;
                            }
                        }
                        list2.get(-1 + list2.size()).add(pair);
                    }
                    final int n3 = x;
                    if (i) {
                        break;
                    }
                    x = n3;
                }
                final ArrayList<ArrayList<Pair>> list4 = new ArrayList<ArrayList<Pair>>();
                for (final ArrayList<Pair> list5 : list2) {
                    Collections.sort((List<Object>)list5, new le(this));
                    final Iterator<Pair> iterator5 = list5.iterator();
                    int y = Integer.MIN_VALUE;
                    while (iterator5.hasNext()) {
                        final Pair pair2 = iterator5.next();
                        Label_0578: {
                            if (n2 + y < ((Point)pair2.second).y) {
                                final ArrayList<Pair> list6 = new ArrayList<Pair>();
                                list6.add(pair2);
                                list4.add(list6);
                                y = ((Point)pair2.second).y;
                                if (!i) {
                                    break Label_0578;
                                }
                            }
                            list4.get(-1 + list4.size()).add(pair2);
                        }
                        final int n4 = y;
                        if (i) {
                            break;
                        }
                        y = n4;
                    }
                    if (i) {
                        break;
                    }
                }
            Label_0597:
                for (final ArrayList<Pair> list7 : list4) {
                    long d = Long.MAX_VALUE;
                    final ArrayList<Comparable> list8 = new ArrayList<Comparable>();
                    final ArrayList<bt> list9 = new ArrayList<bt>();
                    final Iterator<Pair> iterator7 = list7.iterator();
                    double n5 = 0.0;
                    double n6 = 0.0;
                    boolean b = false;
                    while (iterator7.hasNext()) {
                        final bt bt2 = (bt)iterator7.next().first;
                        n5 += bt2.f;
                        n6 += bt2.c;
                        list8.add(bt2.e);
                        list9.add(bt2);
                        if (this.t.k.contains(bt2)) {
                            b = true;
                        }
                        if (bt2.d < d) {
                            d = bt2.d;
                        }
                        if (i) {
                            break;
                        }
                    }
                    Collections.sort(list8);
                    final Iterator<String> iterator8 = list8.iterator();
                    String s = "";
                    while (true) {
                        while (iterator8.hasNext()) {
                            final String string = s + " " + iterator8.next();
                            if (i) {
                                int n7;
                                if (d + 1800000L > System.currentTimeMillis()) {
                                    n7 = -1728001024;
                                }
                                else {
                                    n7 = -1718012980;
                                }
                                String s2 = string + " " + Integer.toString(n7);
                                if (b) {
                                    s2 += GroupChatLiveLocationsActivity2.z[13];
                                }
                                final LatLng position = new LatLng(n5 / list7.size(), n6 / list7.size());
                                Marker addMarker = this.o.get(s2);
                                Label_1045: {
                                    if (addMarker == null) {
                                        Log.i(GroupChatLiveLocationsActivity2.z[12] + s2);
                                        addMarker = this.r.addMarker(this.a(list8, b, n7).position(position));
                                        this.o.put(s2, addMarker);
                                        if (!i) {
                                            break Label_1045;
                                        }
                                    }
                                    addMarker.setVisible(true);
                                    addMarker.setPosition(position);
                                }
                                this.l.put(addMarker, list9);
                                if (i) {
                                    return;
                                }
                                continue Label_0597;
                            }
                            else {
                                s = string;
                            }
                        }
                        final String string = s;
                        continue;
                    }
                }
            }
        }
    }
    
    static void g(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.f();
    }
    
    static GoogleMap h(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.r;
    }
    
    static ao2 i(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.t;
    }
    
    static bt j(final GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.k;
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
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
        Log.i(GroupChatLiveLocationsActivity2.z[23]);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903168);
        this.getSupportActionBar().setTitle(cq.c(z8.a(this.getIntent().getStringExtra(GroupChatLiveLocationsActivity2.z[22])).a((Context)this), (Context)this));
        this.t.a(this);
        MapsInitializer.initialize((Context)this);
        final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.mapType(1).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(true).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        this.p = new GroupChatLiveLocationsActivity2$2(this, (Context)this, googleMapOptions);
        ((ViewGroup)this.findViewById(2131755493)).addView((View)this.p);
        this.p.onCreate(bundle);
        this.e();
        (this.s = (ImageView)this.findViewById(2131755606)).setOnClickListener((View$OnClickListener)new awj(this));
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131820545, menu);
        this.m = menu.findItem(2131755853);
        if (this.m != null && this.r != null) {
            this.m.setChecked(this.r.isTrafficEnabled());
        }
        if (App.aS == 3) {
            b_.c(this);
        }
        return true;
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.p.onDestroy();
        this.t.g();
        if (this.r != null) {
            final SharedPreferences$Editor edit = this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[10], 0).edit();
            final CameraPosition cameraPosition = this.r.getCameraPosition();
            edit.putFloat(GroupChatLiveLocationsActivity2.z[8], (float)cameraPosition.target.latitude);
            edit.putFloat(GroupChatLiveLocationsActivity2.z[11], (float)cameraPosition.target.longitude);
            edit.putFloat(GroupChatLiveLocationsActivity2.z[9], cameraPosition.zoom);
            edit.commit();
        }
    }
    
    @Override
    public void onLocationChanged(final Location location) {
    }
    
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        this.p.onLowMemory();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 2131755850: {
                this.r.setMapType(1);
                this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[18], 0).edit().putInt(GroupChatLiveLocationsActivity2.z[20], 1).commit();
                return true;
            }
            case 2131755851: {
                this.r.setMapType(4);
                this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[21], 0).edit().putInt(GroupChatLiveLocationsActivity2.z[14], 4).commit();
                return true;
            }
            case 2131755852: {
                this.r.setMapType(3);
                this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[17], 0).edit().putInt(GroupChatLiveLocationsActivity2.z[15], 3).commit();
                return true;
            }
            case 2131755853: {
                final boolean b = !this.r.isTrafficEnabled();
                this.r.setTrafficEnabled(b);
                this.m.setChecked(b);
                this.getSharedPreferences(GroupChatLiveLocationsActivity2.z[16], 0).edit().putBoolean(GroupChatLiveLocationsActivity2.z[19], b).commit();
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.p.onPause();
        this.p.c();
        this.t.b();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.p.onResume();
        this.p.a();
        this.t.h();
        this.e();
        this.a();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.p.onSaveInstanceState(bundle);
    }
}
