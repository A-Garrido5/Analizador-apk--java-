// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;
import android.text.TextWatcher;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView$OnItemSelectedListener;
import android.support.v4.app.DialogFragment;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.view.View;
import android.widget.Toast;
import android.text.TextUtils;
import android.widget.EditText;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import android.widget.Button;
import android.location.Geocoder;
import android.widget.ImageButton;
import android.content.Context;
import java.util.HashMap;
import com.google.android.gms.maps.i;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.e;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.annotation.TargetApi;
import android.os.SystemClock;
import android.os.Build$VERSION;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import android.widget.CheckBox;
import android.app.Dialog;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.SupportMapFragment;
import java.util.Map;
import com.google.android.gms.maps.m;
import com.google.android.gms.maps.k;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.content.DialogInterface$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class GeoDebugActivity extends TwitterFragmentActivity implements DialogInterface$OnClickListener, View$OnClickListener, CompoundButton$OnCheckedChangeListener, k, m, so
{
    private Map a;
    private st b;
    private Map c;
    private SupportMapFragment d;
    private c e;
    private f f;
    private Dialog g;
    private ip h;
    private CheckBox i;
    
    private is a(final LatLng latLng, final Location a) {
        final MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.a(latLng);
        markerOptions.a(this.b(latLng));
        final f a2 = this.e.a(markerOptions);
        if (a2 != null) {
            final is is = new is(null);
            is.a = a;
            is.b = this.e.a(new CircleOptions().a(latLng).a((double)is.a.getAccuracy()).b(861252846).a(3.0f).a(-867851291));
            this.a.put(a2, is);
            return is;
        }
        return null;
    }
    
    private String b(final LatLng latLng) {
        final DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        final DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setMaximumFractionDigits(7);
        final StringBuilder sb = new StringBuilder("(");
        sb.append(decimalFormat.format(latLng.a));
        sb.append(", ");
        sb.append(decimalFormat.format(latLng.b));
        sb.append(")");
        return sb.toString();
    }
    
    private Location c(final LatLng latLng) {
        final Location location = new Location("gps");
        location.setLatitude(latLng.a);
        location.setLongitude(latLng.b);
        location.setAccuracy(20.0f);
        location.setTime(System.currentTimeMillis());
        this.c(location);
        return location;
    }
    
    @TargetApi(17)
    private void c(final Location location) {
        if (Build$VERSION.SDK_INT > 16) {
            location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        }
    }
    
    private void h() {
        if (this.d == null) {
            this.d = (SupportMapFragment)this.getSupportFragmentManager().findFragmentById(2131886781);
        }
        if (this.d == null) {
            this.d = SupportMapFragment.a();
            final FragmentTransaction beginTransaction = this.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(2131886781, this.d, "map");
            beginTransaction.commit();
        }
    }
    
    private void i() {
        if (this.e == null && this.d != null) {
            final c c = this.d.c();
            if (c != null) {
                (this.e = c).a((m)this);
                c.a(false);
                c.c().b(false);
                c.c().c(false);
                c.c().d(false);
                c.c().a(false);
                c.a((k)this);
                if (!this.b.g()) {
                    this.J().a(this);
                }
            }
        }
    }
    
    private void j() {
        if (this.e != null) {
            final e e = new e();
            final List h = this.b.h();
            for (final Location location : h) {
                final LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                e.a(latLng);
                this.a(latLng, location);
            }
            if (!h.isEmpty()) {
                if (h.size() == 1) {
                    final Location location2 = h.get(0);
                    this.e.a(com.google.android.gms.maps.b.a(new LatLng(location2.getLatitude(), location2.getLongitude()), 12.0f));
                    return;
                }
                this.e.a(com.google.android.gms.maps.b.a(e.a(), this.getResources().getDisplayMetrics().widthPixels / 2, this.getResources().getDisplayMetrics().heightPixels / 2, 0));
            }
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968784);
        bn.d(false);
        bn.a(false);
        return bn;
    }
    
    public void a(final Location location) {
        if (location == null) {
            return;
        }
        final LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        this.e.a(com.google.android.gms.maps.b.a(latLng, 15.0f), 1000, null);
        if (this.f != null) {
            this.f.a();
        }
        final MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.a(latLng);
        markerOptions.a(false);
        markerOptions.a(com.google.android.gms.maps.model.b.a(240.0f));
        this.f = this.e.a(markerOptions);
        this.J().b(this);
    }
    
    public void a(final LatLng latLng) {
        if (this.e == null) {
            return;
        }
        this.b.a(this.a(latLng, this.c(latLng)).a);
        this.b.d();
    }
    
    public void a(final f f) {
        if (this.a.containsKey(f)) {
            (this.h = new ip(f, this.a.get(f).a, (DialogInterface$OnClickListener)this)).show(this.getSupportFragmentManager(), "EditLocation");
        }
    }
    
    public void b(final Location location) {
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131298211);
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = st.a((Context)this);
        final ImageButton imageButton = (ImageButton)this.findViewById(2131886784);
        if (Geocoder.isPresent()) {
            imageButton.setOnClickListener((View$OnClickListener)this);
        }
        else {
            imageButton.setVisibility(8);
        }
        ((Button)this.findViewById(2131886783)).setOnClickListener((View$OnClickListener)this);
        (this.i = (CheckBox)this.findViewById(2131886782)).setChecked(this.b.f());
        this.i.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        this.h();
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.b.a(b);
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (dialogInterface == this.g) {
            final String string = ((EditText)this.g.findViewById(2131886785)).getText().toString();
            if (!TextUtils.isEmpty((CharSequence)string)) {
                new ir(this, null).execute((Object[])new String[] { string });
                Toast.makeText((Context)this, 2131297168, 0).show();
            }
        }
        else if (dialogInterface == this.h.getDialog()) {
            final f a = this.h.a;
            switch (n) {
                default: {}
                case -3: {
                    if (this.a.containsKey(a)) {
                        final is is = this.a.remove(a);
                        this.b.c(is.a);
                        this.b.d();
                        is.b.a();
                        a.a();
                        return;
                    }
                    break;
                }
                case -1: {
                    if (this.a.containsKey(a)) {
                        final Location b = this.h.b;
                        final is is2 = this.a.get(a);
                        this.b.a(is2.a, b);
                        is2.a = b;
                        is2.b.a(is2.a.getAccuracy());
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131886784: {
                (this.g = (Dialog)new AlertDialog$Builder((Context)this).setView(View.inflate((Context)this, 2130968785, (ViewGroup)null)).setPositiveButton(2131296421, (DialogInterface$OnClickListener)this).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null).create()).show();
            }
            case 2131886783: {
                if (this.e != null) {
                    this.e.b();
                }
                this.a.clear();
                this.b.e();
                this.i.setChecked(false);
            }
        }
    }
    
    public void onStart() {
        super.onStart();
        this.i();
        this.j();
        Toast.makeText((Context)this, 2131298206, 1).show();
    }
}
