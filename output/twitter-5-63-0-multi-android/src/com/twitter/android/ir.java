// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.view.View;
import android.text.TextUtils;
import android.widget.EditText;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.HashMap;
import com.google.android.gms.maps.i;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.Iterator;
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
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.LatLng;
import android.location.Address;
import android.widget.Toast;
import java.io.IOException;
import android.content.Context;
import android.location.Geocoder;
import java.util.List;
import android.os.AsyncTask;

class ir extends AsyncTask
{
    final /* synthetic */ GeoDebugActivity a;
    
    private ir(final GeoDebugActivity a) {
        this.a = a;
    }
    
    protected List a(final String... array) {
        try {
            return new Geocoder((Context)this.a).getFromLocationName(array[0], 1);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    protected void a(final List list) {
        if (list == null) {
            Toast.makeText((Context)this.a, 2131298209, 0).show();
            return;
        }
        if (list.isEmpty()) {
            Toast.makeText((Context)this.a, 2131298210, 0).show();
            return;
        }
        final Address address = list.get(0);
        this.a.e.b(b.a(new LatLng(address.getLatitude(), address.getLongitude()), 15.0f));
    }
}
