// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AdapterView$OnItemSelectedListener;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.regex.Pattern;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import android.widget.Spinner;
import android.widget.TextView;
import com.twitter.android.client.TwitterFragmentActivity;

public class LogViewerActivity extends TwitterFragmentActivity
{
    private TextView a;
    private Spinner b;
    private List c;
    
    private void h() {
        final kf kf = (kf)this.b.getSelectedItem();
        Pattern b;
        if (kf != null) {
            b = kf.b;
        }
        else {
            b = null;
        }
        List<String> c;
        if (b == null) {
            c = (List<String>)this.c;
        }
        else {
            final ArrayList<String> list = new ArrayList<String>();
            for (final String s : this.c) {
                if (b.matcher(s).find()) {
                    list.add(s);
                }
            }
            c = list;
        }
        this.a.setText((CharSequence)TextUtils.join((CharSequence)"\n", (Iterable)c));
    }
    
    private List i() {
        final ArrayList<String> list = new ArrayList<String>();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                list.add(line);
            }
        }
        catch (IOException ex) {}
        return list;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968855);
        bn.d(false);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.c = this.i();
        final Spinner b = (Spinner)this.findViewById(2131886898);
        b.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new kd(this));
        final ArrayList<kf> list = new ArrayList<kf>();
        list.add(new kf("All", "."));
        list.add(new kf("Error", "^E"));
        list.add(new kf("Warning", "^W"));
        list.add(new kf("Info", "^I"));
        list.add(new kf("Debug", "^D"));
        final ArrayAdapter adapter = new ArrayAdapter((Context)this, 17367048, (List)list);
        adapter.setDropDownViewResource(17367049);
        b.setAdapter((SpinnerAdapter)adapter);
        b.setSelection(1);
        this.b = b;
        this.a = (TextView)this.findViewById(2131886899);
        ((Button)this.findViewById(2131886900)).setOnClickListener((View$OnClickListener)new ke(this));
        this.h();
    }
}
