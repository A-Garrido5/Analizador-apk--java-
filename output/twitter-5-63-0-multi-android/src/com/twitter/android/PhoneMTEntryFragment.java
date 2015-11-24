// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.twitter.android.util.ap;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.twitter.library.api.aj;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import android.text.TextWatcher;
import com.twitter.library.service.y;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import java.util.HashMap;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.Locale;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Map;
import com.twitter.android.util.al;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class PhoneMTEntryFragment extends AbsFragment implements View$OnClickListener, AdapterView$OnItemSelectedListener
{
    private al a;
    private Map b;
    private np c;
    private Spinner d;
    private EditText e;
    private Button f;
    private Context g;
    private c h;
    private Session i;
    private boolean j;
    private boolean k;
    private final Runnable l;
    
    public PhoneMTEntryFragment() {
        this.l = new nj(this);
    }
    
    private static int a(final Locale locale) {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        if (!TextUtils.isEmpty((CharSequence)locale.getLanguage()) && !TextUtils.isEmpty((CharSequence)locale.getCountry()) && TextUtils.isEmpty((CharSequence)locale.getVariant())) {
            return a.g(locale.getCountry());
        }
        return 0;
    }
    
    private String a(final int n) {
        final String b = PhoneNumberUtil.a().b(n);
        final Locale[] availableLocales = Locale.getAvailableLocales();
        if (availableLocales != null) {
            for (final Locale locale : availableLocales) {
                if (locale.getCountry().equals(b)) {
                    return this.a(locale.getDisplayCountry(), n);
                }
            }
        }
        return this.d();
    }
    
    private String a(final String s, final int n) {
        return s + " +" + n;
    }
    
    private void c() {
        if (this.b == null) {
            this.b = new HashMap();
            final Locale[] availableLocales = Locale.getAvailableLocales();
            if (availableLocales != null) {
                for (final Locale locale : availableLocales) {
                    final int a = a(locale);
                    if (a > 0) {
                        this.b.put(this.a(locale.getDisplayCountry(), a), Integer.toString(a));
                    }
                }
            }
        }
    }
    
    private String d() {
        return this.a(Locale.US.getDisplayCountry(), 1);
    }
    
    private String e() {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        try {
            return a.a(a.a(this.a.g(), (String)null), PhoneNumberUtil$PhoneNumberFormat.c);
        }
        catch (NumberParseException ex) {
            return null;
        }
    }
    
    private String f() {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        final Locale locale = this.getResources().getConfiguration().locale;
        try {
            final int a2 = a.a(this.a.g(), (String)null).a();
            if (a(locale) == a2) {
                return this.a(locale.getDisplayCountry(), a2);
            }
            return this.a(a2);
        }
        catch (NumberParseException ex) {
            return this.d();
        }
    }
    
    private ArrayAdapter g() {
        final ArrayList<Comparable> list = new ArrayList<Comparable>(this.b.keySet());
        Collections.sort(list);
        return new ArrayAdapter((Context)this.getActivity(), 17367048, (List)list);
    }
    
    private String h() {
        if (this.d.getSelectedItem() == null) {
            return null;
        }
        final String s = this.b.get(this.d.getSelectedItem().toString());
        if (s == null) {
            return null;
        }
        return this.a.a(this.a.a("+" + s + this.e.getText().toString()));
    }
    
    private void i() {
        final String h = this.h();
        if (!TextUtils.isEmpty((CharSequence)h)) {
            this.a(mp.a((Context)this.getActivity(), this.i, h), 1, 0);
        }
    }
    
    private void j() {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        this.e.removeTextChangedListener((TextWatcher)this.c);
        if (this.d.getSelectedItem() != null) {
            this.c = new np(a.b(Integer.parseInt(this.b.get(this.d.getSelectedItem().toString()))));
        }
        else {
            this.c = new np();
        }
        this.e.addTextChangedListener((TextWatcher)this.c);
    }
    
    @Override
    public void a(final int n, final y y) {
        if (n == 1) {
            final aj t = ((mp)y).t();
            final int[] e = ((mp)y).e();
            if (!((aa)y.l().b()).a() || TextUtils.isEmpty((CharSequence)t.a)) {
                int n2;
                if (CollectionUtils.a(e, 285)) {
                    this.h.a(this.aF().g(), new String[] { "phone_loggedin_mt", "enter_phone:register_begin::error" });
                    n2 = 2131297394;
                }
                else {
                    this.h.a(this.aF().g(), new String[] { "phone_loggedin_mt", "enter_phone:register_begin::failure" });
                    n2 = 2131297395;
                }
                Toast.makeText(this.g, n2, 1).show();
                return;
            }
            ((PhoneMTFlowActivity)this.getActivity()).a(t.a, t.b);
        }
    }
    
    void b() {
        int enabled = 1;
        if (this.j && this.k) {
            final c h = this.h;
            final long g = this.i.g();
            final String[] array = { "phone_loggedin_mt", null };
            array[enabled] = "enter_phone::phone_number:input";
            h.a(g, array);
            this.j = false;
        }
        final Button f = this.f;
        if (TextUtils.isEmpty((CharSequence)this.h())) {
            enabled = 0;
        }
        f.setEnabled((boolean)(enabled != 0));
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887116) {
            this.h.a(this.i.g(), new String[] { "phone_loggedin_mt", "enter_phone::continue:click" });
            this.i();
        }
        else if (view.getId() == 2131887117) {
            this.h.a(this.i.g(), new String[] { "phone_loggedin_mt", "enter_phone::learn_more:click" });
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.twitter.com/articles/110250")));
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968961, viewGroup, false);
        this.g = this.getActivity().getApplicationContext();
        this.h = com.twitter.android.client.c.a((Context)this.getActivity());
        this.i = az.a((Context)this.getActivity()).b();
        this.j = false;
        this.k = false;
        this.getActivity().setTitle(2131297400);
        this.a = ap.a((Context)this.getActivity());
        this.c();
        this.d = (Spinner)inflate.findViewById(2131887114);
        final ArrayAdapter g = this.g();
        final int position = g.getPosition((Object)this.f());
        g.setDropDownViewResource(17367049);
        this.d.setAdapter((SpinnerAdapter)g);
        if (position >= 0) {
            this.d.setSelection(position);
        }
        this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        this.e = (EditText)inflate.findViewById(2131887115);
        this.j();
        this.f = (Button)inflate.findViewById(2131887116);
        inflate.findViewById(2131887117).setOnClickListener((View$OnClickListener)this);
        this.e.addTextChangedListener((TextWatcher)new nk(this));
        this.e.setText((CharSequence)this.e());
        if (TextUtils.isEmpty((CharSequence)this.e.getText())) {
            this.e.postDelayed(this.l, 500L);
        }
        else {
            this.e.setSelection(this.e.getText().length());
        }
        this.f.setOnClickListener((View$OnClickListener)this);
        this.h.a(this.i.g(), new String[] { "phone_loggedin_mt", "enter_phone:::impression" });
        inflate.postDelayed((Runnable)new nl(this), 500L);
        return inflate;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        int enabled = 1;
        if (this.k) {
            final c h = this.h;
            final long g = this.i.g();
            final String[] array = { "phone_loggedin_mt", null };
            array[enabled] = "enter_phone::country_code:change";
            h.a(g, array);
        }
        this.j();
        final Button f = this.f;
        if (TextUtils.isEmpty((CharSequence)this.h())) {
            enabled = 0;
        }
        f.setEnabled((boolean)(enabled != 0));
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
