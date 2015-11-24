// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import com.whatsapp.util.b_;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.google.android.maps.MapView;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;
import com.whatsapp.util.cq;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Locale;
import android.text.format.DateUtils;
import android.widget.TextView;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import com.google.android.maps.MapView$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import com.google.android.maps.GeoPoint;
import android.graphics.Point;
import java.util.HashMap;
import android.view.View;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.bt;
import java.util.ArrayList;
import com.google.android.maps.MapActivity;

public class GroupChatLiveLocationsActivity extends MapActivity implements ast
{
    private static final String[] z;
    private int a;
    private ArrayList b;
    private bt c;
    private ck d;
    private GoogleMapView e;
    private ao2 f;
    private MyLocationOverlay g;
    
    static {
        final String[] z2 = new String[8];
        String s = "C$\u000fq0H9\u0003e4M9\u000ewo@3\u0013p2K/";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = 'V';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bv";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001gD(n\u00150";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0001gD(n\u00150";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\bv";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "C$\u000fq0H9\u0003e4M9\u000ewoG$\u0005e4A";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "N?\u0004";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "H7\u0019k5P\t\tj&H7\u0014a2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GroupChatLiveLocationsActivity() {
        this.b = new ArrayList();
        this.a = -1;
        this.f = new aor(this);
    }
    
    static ck a(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.d;
    }
    
    static bt a(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, final bt c) {
        return groupChatLiveLocationsActivity.c = c;
    }
    
    private void a() {
        final boolean i = App.I;
        final Iterator<View> iterator = (Iterator<View>)this.b.iterator();
        while (iterator.hasNext()) {
            this.e.removeView((View)iterator.next());
            if (i) {
                break;
            }
        }
        final int width = this.e.getWidth();
        final int height = this.e.getHeight();
        if (width != 0 && height != 0) {
            final double n = Math.min(width, height) / 10 * 360 / (256.0 * Math.pow(2.0, this.e.getZoomLevel()) / 2.0);
            final double n2 = n / 2.0;
            final HashMap<String, ArrayList<bt>> hashMap = new HashMap<String, ArrayList<bt>>();
            final Point point = new Point();
            for (final bt bt : this.f.g) {
                final double c = bt.c;
                final double f = bt.f;
                this.e.getProjection().toPixels(new GeoPoint((int)(1000000.0 * bt.f), (int)(1000000.0 * bt.c)), point);
                final String string = (int)((c + 180.0) / n) + " " + (int)((90.0 + f) / n2);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList<bt>());
                }
                hashMap.get(string).add(bt);
                if (i) {
                    break;
                }
            }
            final ArrayList list = new ArrayList<ArrayList<bt>>(hashMap.values());
            Collections.sort((List<E>)list, new dk(this));
            final ArrayList<LinearLayout> list2 = new ArrayList<LinearLayout>();
            final ArrayList<GeoPoint> list3 = new ArrayList<GeoPoint>();
        Label_0760:
            for (final ArrayList<bt> tag : list) {
                final LinearLayout linearLayout = new LinearLayout((Context)this);
                linearLayout.setOrientation(0);
                linearLayout.setPadding(0, 0, 0, (int)(7.0f * vc.b().b));
                final LinearLayout linearLayout2 = new LinearLayout((Context)this);
                linearLayout2.setOrientation(1);
                linearLayout.addView((View)linearLayout2);
                linearLayout2.setClickable(true);
                linearLayout2.setFocusable(true);
                final LayoutInflater layoutInflater = (LayoutInflater)this.getSystemService(GroupChatLiveLocationsActivity.z[7]);
                final yj backgroundDrawable = new yj();
                backgroundDrawable.a((int)(12.0f * vc.b().b));
                linearLayout2.setBackgroundDrawable((Drawable)backgroundDrawable);
                double n3 = 0.0;
                double n4 = 0.0;
                final Iterator<bt> iterator4 = tag.iterator();
                boolean b = false;
                while (true) {
                    while (iterator4.hasNext()) {
                        final bt tag2 = iterator4.next();
                        final View a = alm.a(layoutInflater, 2130903098, null);
                        this.a(a, tag2);
                        linearLayout2.addView(a);
                        a.setTag((Object)tag2);
                        n3 += tag2.f;
                        n4 += tag2.c;
                        final boolean selected = this.f.k.contains(tag2) || b;
                        if (i) {
                            final GeoPoint geoPoint = new GeoPoint((int)(1000000.0 * (n3 / tag.size())), (int)(1000000.0 * (n4 / tag.size())));
                            linearLayout2.setTag((Object)tag);
                            linearLayout2.setSelected(selected);
                            linearLayout2.setOnClickListener((View$OnClickListener)new a(this, tag, geoPoint));
                            Label_0746: {
                                if (selected) {
                                    list2.add(linearLayout);
                                    list3.add(geoPoint);
                                    if (!i) {
                                        break Label_0746;
                                    }
                                }
                                this.e.addView((View)linearLayout, (ViewGroup$LayoutParams)new MapView$LayoutParams(-2, -2, geoPoint, 81));
                            }
                            this.b.add(linearLayout);
                            if (i) {
                                break Label_0760;
                            }
                            continue Label_0760;
                        }
                        else {
                            b = selected;
                        }
                    }
                    final boolean selected = b;
                    continue;
                }
            }
            int n5;
            for (int j = 0; j < list2.size(); j = n5) {
                this.e.addView((View)list2.get(j), (ViewGroup$LayoutParams)new MapView$LayoutParams(-2, -2, (GeoPoint)list3.get(j), 81));
                n5 = j + 1;
                if (i) {
                    break;
                }
            }
        }
    }
    
    private void a(final View view, final bt bt) {
        final boolean i = App.I;
        final a_9 e = App.S.e(bt.e);
        final TextView textView = (TextView)view.findViewById(2131755394);
        textView.setText((CharSequence)e.a((Context)this));
        final TextView textView2 = (TextView)view.findViewById(2131755395);
        String text = null;
        Label_0100: {
            if (System.currentTimeMillis() - bt.d < 60000L) {
                text = this.getString(2131231280);
                if (!i) {
                    break Label_0100;
                }
            }
            text = DateUtils.getRelativeTimeSpanString(bt.d, System.currentTimeMillis(), 60000L, 0).toString();
        }
        if (bt.a != 0) {
            text = text + GroupChatLiveLocationsActivity.z[1] + this.getString(2131231277, new Object[] { bt.a });
        }
        Label_0376: {
            if (bt.h > 0.44704) {
                text += GroupChatLiveLocationsActivity.z[4];
                if (Locale.US.equals(Locale.getDefault())) {
                    text += this.getString(2131231285, new Object[] { String.format(GroupChatLiveLocationsActivity.z[2], 2.23694 * bt.h) });
                    if (!i) {
                        break Label_0376;
                    }
                }
                text += this.getString(2131231284, new Object[] { String.format(GroupChatLiveLocationsActivity.z[3], 3.6 * bt.h) });
            }
        }
        textView2.setText((CharSequence)text);
        final ImageView imageView = (ImageView)view.findViewById(2131755393);
        final Bitmap a = e.a(this.getResources().getDimensionPixelSize(2131361952), this.getResources().getDimension(2131361814), true);
        Label_0449: {
            if (a != null) {
                imageView.setImageBitmap(a);
                if (!i) {
                    break Label_0449;
                }
            }
            imageView.setImageResource(e.A());
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }
    
    static GoogleMapView b(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.e;
    }
    
    private void b() {
        final boolean i = App.I;
        final Iterator<bt> iterator = (Iterator<bt>)this.f.g.iterator();
        double min = 90.0;
        double max = -90.0;
        double min2 = 180.0;
        double n = -180.0;
        while (true) {
            while (iterator.hasNext()) {
                final bt bt = iterator.next();
                min = Math.min(min, bt.f);
                max = Math.max(max, bt.f);
                min2 = Math.min(min2, bt.c);
                final double max2 = Math.max(n, bt.c);
                if (i) {
                    final GeoPoint center = new GeoPoint((int)(1000000.0 * (min + max) / 2.0) + (int)(1000000.0 * (max - min) / 6.0), (int)(1000000.0 * (min2 + max2) / 2.0));
                    Label_0199: {
                        if (this.f.g.size() > 0) {
                            this.e.getController().setCenter(center);
                            if (!i) {
                                break Label_0199;
                            }
                        }
                        this.g.runOnFirstFix((Runnable)new ahm(this));
                    }
                    final int n2 = (int)(1000000.0 * (1.3 * (max - min)));
                    final int n3 = (int)(1000000.0 * (1.3 * (max2 - min2)));
                    Label_0275: {
                        if (this.f.g.size() <= 1) {
                            this.e.getController().setZoom(17);
                            if (!i) {
                                break Label_0275;
                            }
                        }
                        this.e.getController().zoomToSpan(n2, n3);
                    }
                    if (this.e.getZoomLevel() <= 1) {
                        this.e.getController().setZoom(2);
                    }
                    return;
                }
                n = max2;
            }
            final double max2 = n;
            continue;
        }
    }
    
    static bt c(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.c;
    }
    
    static void d(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.a();
    }
    
    static ArrayList e(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.b;
    }
    
    static void f(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.b();
    }
    
    static MyLocationOverlay g(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.g;
    }
    
    static ao2 h(final GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.f;
    }
    
    public void a(final GeoPoint geoPoint, final int n, final int n2) {
        int zoomLevel = this.e.getZoomLevel();
        if (zoomLevel <= 1) {
            zoomLevel = 2;
            this.e.getController().setZoom(zoomLevel);
        }
        if (this.a != zoomLevel) {
            this.a = zoomLevel;
            this.a();
        }
    }
    
    protected boolean isRouteDisplayed() {
        return false;
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(GroupChatLiveLocationsActivity.z[5]);
        if (alm.c) {
            this.getWindow().getDecorView().setLayoutDirection(3);
        }
        super.onCreate(bundle);
        DialogToastActivity.a((Activity)this, 2130903168);
        final a_9 a = z8.a(this.getIntent().getStringExtra(GroupChatLiveLocationsActivity.z[6]));
        final Toolbar toolbar = (Toolbar)this.findViewById(2131755371);
        toolbar.setTitle(cq.c(a.a((Context)this), (Context)this));
        this.onCreateOptionsMenu(toolbar.getMenu());
        toolbar.setOnMenuItemClickListener(new m(this));
        this.f.a((Activity)this);
        (this.e = new GroupChatLiveLocationsActivity$3(this, (Context)this)).setClickable(true);
        this.e.setEnabled(true);
        this.e.setMapListener(this);
        this.e.setBuiltInZoomControls(false);
        this.e.getController().setZoom(17);
        ((ViewGroup)this.findViewById(2131755493)).addView((View)this.e);
        this.g = new aww(this, (Context)this, this.e);
        this.e.getOverlays().add(this.g);
        (this.d = new ck(this)).a();
        this.e.getOverlays().add(this.d);
        this.e.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new aq5(this));
        this.findViewById(2131755606).setOnClickListener((View$OnClickListener)new i1(this));
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231295).setIcon(2130837696), 2);
        if (App.aS == 3) {
            b_.c((Activity)this);
        }
        return true;
    }
    
    public void onDestroy() {
        Log.i(GroupChatLiveLocationsActivity.z[0]);
        super.onDestroy();
        this.f.g();
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 0: {
                this.e.setSatellite(!this.e.isSatellite());
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    protected void onPause() {
        super.onPause();
        this.g.disableMyLocation();
        this.f.b();
    }
    
    protected void onResume() {
        super.onResume();
        this.g.enableMyLocation();
        this.f.h();
    }
}
