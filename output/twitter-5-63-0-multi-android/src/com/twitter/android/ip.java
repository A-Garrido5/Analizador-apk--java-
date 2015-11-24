// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.os.Build$VERSION;
import android.widget.ArrayAdapter;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.content.DialogInterface$OnClickListener;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.TextView;
import android.location.Location;
import com.google.android.gms.maps.model.f;
import android.widget.AdapterView$OnItemSelectedListener;
import android.support.v4.app.DialogFragment;

class ip extends DialogFragment implements AdapterView$OnItemSelectedListener
{
    private f a;
    private Location b;
    private TextView c;
    private EditText d;
    private Spinner e;
    private Spinner f;
    private DialogInterface$OnClickListener g;
    
    public ip(final f a, final Location b, final DialogInterface$OnClickListener g) {
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    void a(final String s) {
        final String s2 = (String)this.f.getSelectedItem();
        if (s2 == null) {
            return;
        }
        try {
            if (s2.equals("H-Accuracy")) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    this.b.removeAccuracy();
                }
                else {
                    this.b.setAccuracy(Float.parseFloat(s));
                }
            }
            else if (s2.equals("Altitude")) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    this.b.removeAltitude();
                }
                else {
                    this.b.setAltitude((double)Float.parseFloat(s));
                }
            }
            else if (s2.equals("Speed")) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    this.b.removeSpeed();
                }
                else {
                    this.b.setSpeed(Float.parseFloat(s));
                }
            }
            else if (s2.equals("Bearing")) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    this.b.removeBearing();
                }
                else {
                    this.b.setBearing(Float.parseFloat(s));
                }
            }
            else if (s2.equals("Timestamp")) {
                this.b.setTime(Long.parseLong(s));
            }
            this.c.setText((CharSequence)sn.b(this.b));
        }
        catch (NumberFormatException ex) {}
        catch (Exception ex2) {}
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        final View inflate = this.getActivity().getLayoutInflater().inflate(2130968786, (ViewGroup)null);
        alertDialog$Builder.setView(inflate);
        (this.c = (TextView)inflate.findViewById(2131886786)).setText((CharSequence)sn.b(this.b));
        (this.d = (EditText)inflate.findViewById(2131886788)).addTextChangedListener((TextWatcher)new iq(this));
        final ArrayAdapter adapter = new ArrayAdapter((Context)this.getActivity(), 17367048);
        adapter.setDropDownViewResource(17367049);
        adapter.add((Object)"gps");
        adapter.add((Object)"network");
        if (Build$VERSION.SDK_INT > 16 || com.twitter.library.platform.f.a((Context)this.getActivity())) {
            adapter.add((Object)"fused");
        }
        (this.e = (Spinner)inflate.findViewById(2131886789)).setAdapter((SpinnerAdapter)adapter);
        this.e.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        final ArrayAdapter adapter2 = new ArrayAdapter((Context)this.getActivity(), 17367048);
        adapter2.setDropDownViewResource(17367049);
        adapter2.add((Object)"Latitude");
        adapter2.add((Object)"Longitude");
        adapter2.add((Object)"H-Accuracy");
        adapter2.add((Object)"Altitude");
        adapter2.add((Object)"Speed");
        adapter2.add((Object)"Bearing");
        adapter2.add((Object)"Timestamp");
        adapter2.add((Object)"Source");
        (this.f = (Spinner)inflate.findViewById(2131886787)).setAdapter((SpinnerAdapter)adapter2);
        this.f.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        alertDialog$Builder.setMessage(2131298205).setPositiveButton(2131298212, this.g).setNeutralButton(2131296786, this.g).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null);
        return (Dialog)alertDialog$Builder.create();
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        int visibility = 8;
        switch (adapterView.getId()) {
            case 2131886789: {
                final String provider = (String)adapterView.getSelectedItem();
                if (provider != null) {
                    this.b.setProvider(provider);
                    this.c.setText((CharSequence)sn.b(this.b));
                    return;
                }
                break;
            }
            case 2131886787: {
                final String s = (String)adapterView.getItemAtPosition(n);
                if (s != null) {
                    this.d.setEnabled(true);
                    int visibility2;
                    if (s.equals("Source")) {
                        int selection = 0;
                        while (true) {
                            final int count = this.e.getAdapter().getCount();
                            visibility2 = 0;
                            if (selection >= count) {
                                break;
                            }
                            if (this.b.getProvider().equals(this.e.getItemAtPosition(selection))) {
                                this.e.setSelection(selection);
                                break;
                            }
                            ++selection;
                        }
                    }
                    else if (s.equals("Latitude")) {
                        this.d.setText((CharSequence)String.valueOf(this.b.getLatitude()));
                        this.d.setEnabled(false);
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("Longitude")) {
                        this.d.setText((CharSequence)String.valueOf(this.b.getLongitude()));
                        this.d.setEnabled(false);
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("H-Accuracy")) {
                        this.d.setText((CharSequence)String.valueOf(this.b.getAccuracy()));
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("Altitude")) {
                        if (this.b.hasAltitude()) {
                            this.d.setText((CharSequence)String.valueOf(this.b.getAltitude()));
                        }
                        else {
                            this.d.setText((CharSequence)null);
                        }
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("Speed")) {
                        if (this.b.hasSpeed()) {
                            this.d.setText((CharSequence)String.valueOf(this.b.getSpeed()));
                        }
                        else {
                            this.d.setText((CharSequence)null);
                        }
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("Bearing")) {
                        if (this.b.hasBearing()) {
                            this.d.setText((CharSequence)String.valueOf(this.b.getBearing()));
                        }
                        else {
                            this.d.setText((CharSequence)null);
                        }
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else if (s.equals("Timestamp")) {
                        this.d.setText((CharSequence)String.valueOf(this.b.getTime()));
                        visibility2 = visibility;
                        visibility = 0;
                    }
                    else {
                        visibility2 = visibility;
                    }
                    this.d.setVisibility(visibility);
                    this.e.setVisibility(visibility2);
                    return;
                }
                break;
            }
        }
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
