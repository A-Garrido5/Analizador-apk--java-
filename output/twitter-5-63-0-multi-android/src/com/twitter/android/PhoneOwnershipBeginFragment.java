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
import android.view.View;
import android.app.Activity;
import android.text.Editable;
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
import android.text.TextWatcher;
import android.support.v4.app.Fragment;

public class PhoneOwnershipBeginFragment extends Fragment implements TextWatcher, View$OnClickListener, AdapterView$OnItemSelectedListener
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
    private ns j;
    private boolean k;
    private boolean l;
    private final Runnable m;
    
    public PhoneOwnershipBeginFragment() {
        this.m = new nq(this);
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
        return this.b();
    }
    
    private String a(final String s, final int n) {
        return s + " +" + n;
    }
    
    private void a() {
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
    
    private String b() {
        return this.a(Locale.US.getDisplayCountry(), 1);
    }
    
    private String c() {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        try {
            return a.a(a.a(this.a.g(), (String)null), PhoneNumberUtil$PhoneNumberFormat.c);
        }
        catch (NumberParseException ex) {
            return null;
        }
    }
    
    private String d() {
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
            return this.b();
        }
    }
    
    private ArrayAdapter e() {
        final ArrayList<Comparable> list = new ArrayList<Comparable>(this.b.keySet());
        Collections.sort(list);
        return new ArrayAdapter((Context)this.getActivity(), 17367048, (List)list);
    }
    
    private String f() {
        if (this.d.getSelectedItem() == null) {
            return null;
        }
        final String s = this.b.get(this.d.getSelectedItem().toString());
        if (s == null) {
            return null;
        }
        return this.a.a(this.a.a("+" + s + this.e.getText().toString()));
    }
    
    private void g() {
        final String f = this.f();
        if (!TextUtils.isEmpty((CharSequence)f)) {
            this.j.a(f);
        }
    }
    
    private void h() {
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
    
    public void afterTextChanged(final Editable editable) {
        int enabled = 1;
        if (this.k && this.l) {
            final c h = this.h;
            final long g = this.i.g();
            final String[] array = { "unlock_account", null };
            array[enabled] = "enter_phone::phone_number:input";
            h.a(g, array);
            this.k = false;
        }
        final Button f = this.f;
        if (TextUtils.isEmpty((CharSequence)this.f())) {
            enabled = 0;
        }
        f.setEnabled((boolean)(enabled != 0));
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.j = (ns)activity;
        }
        catch (ClassCastException ex) {
            throw new ClassCastException(activity.toString() + " must implement OnPhoneOwnershipBeginListener");
        }
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887123) {
            this.h.a(this.i.g(), new String[] { "unlock_account", "enter_phone::continue:click" });
            this.g();
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968964, viewGroup, false);
        this.g = this.getActivity().getApplicationContext();
        this.h = com.twitter.android.client.c.a((Context)this.getActivity());
        this.i = az.a((Context)this.getActivity()).b();
        this.k = false;
        this.l = false;
        this.getActivity().setTitle(2131297412);
        this.a = ap.a((Context)this.getActivity());
        this.a();
        this.d = (Spinner)inflate.findViewById(2131887114);
        final ArrayAdapter e = this.e();
        final int position = e.getPosition((Object)this.d());
        e.setDropDownViewResource(17367049);
        this.d.setAdapter((SpinnerAdapter)e);
        if (position >= 0) {
            this.d.setSelection(position);
        }
        this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        this.e = (EditText)inflate.findViewById(2131887115);
        this.h();
        this.f = (Button)inflate.findViewById(2131887123);
        this.e.addTextChangedListener((TextWatcher)this);
        this.e.setText((CharSequence)this.c());
        if (TextUtils.isEmpty((CharSequence)this.e.getText())) {
            this.e.postDelayed(this.m, 500L);
        }
        else {
            this.e.setSelection(this.e.getText().length());
        }
        this.f.setOnClickListener((View$OnClickListener)this);
        this.h.a(this.i.g(), new String[] { "unlock_account", "enter_phone:::impression" });
        inflate.postDelayed((Runnable)new nr(this), 500L);
        return inflate;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        int enabled = 1;
        if (this.l) {
            final c h = this.h;
            final long g = this.i.g();
            final String[] array = { "unlock_account", null };
            array[enabled] = "enter_phone::country_code:change";
            h.a(g, array);
        }
        this.h();
        final Button f = this.f;
        if (TextUtils.isEmpty((CharSequence)this.f())) {
            enabled = 0;
        }
        f.setEnabled((boolean)(enabled != 0));
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
