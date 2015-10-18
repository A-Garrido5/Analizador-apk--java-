// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.concurrent.CountedCompleter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Contended;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.ToLongBiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Enumeration;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.Collection;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import sun.misc.Unsafe;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import org.json.JSONException;
import com.twitter.library.featureswitch.FeatureSwitchesValue;
import org.json.JSONObject;
import android.preference.PreferenceScreen;
import com.twitter.library.client.App;
import android.preference.PreferenceManager;
import android.os.Looper;
import android.os.Bundle;
import android.text.Editable;
import com.twitter.library.service.y;
import com.twitter.library.featureswitch.FeatureSwitchesManifest;
import org.json.JSONArray;
import java.util.List;
import java.util.Collections;
import com.twitter.library.featureswitch.h;
import android.util.Log;
import android.preference.Preference;
import com.twitter.library.featureswitch.FeatureSwitchesParameter;
import java.util.Iterator;
import android.preference.ListPreference;
import android.content.Context;
import com.twitter.library.featureswitch.d;
import android.preference.EditTextPreference;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.preference.PreferenceCategory;
import com.twitter.ui.widget.TwitterEditText;
import android.text.TextWatcher;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class FeatureSwitchesSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener, TextWatcher
{
    private TwitterEditText a;
    private PreferenceCategory b;
    private SharedPreferences c;
    private SharedPreferences d;
    private ArrayList e;
    private Map f;
    private Handler g;
    
    public FeatureSwitchesSettingsActivity() {
        this.e = new ArrayList();
        this.f = new HashMap();
    }
    
    private EditTextPreference a(final String key, final String text) {
        String s;
        if (com.twitter.library.featureswitch.d.a().keySet().contains(key)) {
            s = "[Overridden] ";
        }
        else {
            s = "";
        }
        final String string = s + "Current: " + text;
        final EditTextPreference editTextPreference = new EditTextPreference((Context)this);
        editTextPreference.setTitle((CharSequence)key);
        editTextPreference.setDialogTitle((CharSequence)key);
        editTextPreference.setKey(key);
        editTextPreference.setText(text);
        editTextPreference.setSummary((CharSequence)string);
        editTextPreference.setPersistent(false);
        editTextPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        return editTextPreference;
    }
    
    private ListPreference a(final String key, final CharSequence[] array, final String value) {
        String s;
        if (com.twitter.library.featureswitch.d.a().keySet().contains(key)) {
            s = "[Overridden] ";
        }
        else {
            s = "";
        }
        final String string = s + "Current: " + value;
        final ListPreference listPreference = new ListPreference((Context)this);
        listPreference.setTitle((CharSequence)key);
        listPreference.setDialogTitle((CharSequence)key);
        listPreference.setKey(key);
        listPreference.setEntries(array);
        listPreference.setEntryValues(array);
        listPreference.setValue(value);
        listPreference.setSummary((CharSequence)string);
        listPreference.setPersistent(false);
        listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        return listPreference;
    }
    
    private ArrayList a(final ArrayList list, final Object o) {
        final ArrayList<String> list2 = new ArrayList<String>();
        if (list.size() > 0) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().toString());
            }
            list2.add("unassigned");
        }
        else if (o != null && o.getClass().equals(Boolean.class)) {
            list2.add(Boolean.TRUE.toString());
            list2.add(Boolean.FALSE.toString());
            return list2;
        }
        return list2;
    }
    
    private void a(final String s) {
        if (this.e.size() == 0) {
            this.c();
        }
        else {
            this.b.removeAll();
            final Iterator<FeatureSwitchesParameter> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                final String a = iterator.next().a();
                if (a.contains(s)) {
                    final Preference preference = this.f.get(a);
                    if (preference == null) {
                        continue;
                    }
                    this.b.addPreference(preference);
                }
            }
        }
    }
    
    private void a(final String s, final Preference preference) {
        final Preference preference2 = this.f.get(s);
        if (preference2 != null) {
            preference2.setSummary((CharSequence)("[DUPLICATE FEATURESWITCH - PLEASE CHECK CONFIG] " + (Object)preference2.getSummary()));
            return;
        }
        this.f.put(s, preference);
    }
    
    private Preference b(final String s) {
        for (final FeatureSwitchesParameter featureSwitchesParameter : this.e) {
            if (featureSwitchesParameter.a().equalsIgnoreCase(s)) {
                return (Preference)this.f.get(featureSwitchesParameter.a());
            }
        }
        return null;
    }
    
    private void b() {
        final String string = this.c.getString("feature_switch_search", "");
        this.a.setText((CharSequence)string);
        this.a.setSelection(string.length());
    }
    
    private void b(final String s, final String s2) {
        final Preference b = this.b(s);
        if (b != null) {
            this.onPreferenceChange(b, s2);
            this.finish();
            return;
        }
        Log.d("FeatureSwitches", "No feature switch found with key: " + s);
    }
    
    private void c() {
        this.b.removeAll();
        final FeatureSwitchesManifest c = com.twitter.library.featureswitch.d.c();
        final HashMap a = c.debug.a;
        this.e.clear();
        this.f.clear();
        final Iterator<h> iterator = a.values().iterator();
        while (iterator.hasNext()) {
            final Iterator<FeatureSwitchesParameter> iterator2 = iterator.next().b().values().iterator();
            while (iterator2.hasNext()) {
                this.e.add(iterator2.next());
            }
        }
        Collections.sort((List<Comparable>)this.e);
        final Iterator<FeatureSwitchesParameter> iterator3 = (Iterator<FeatureSwitchesParameter>)this.e.iterator();
        int order = 0;
        while (iterator3.hasNext()) {
            final FeatureSwitchesParameter featureSwitchesParameter = iterator3.next();
            final String a2 = featureSwitchesParameter.a();
            final boolean contains = c.availableExperiments.contains(a2);
            final Object i = com.twitter.library.featureswitch.d.i(featureSwitchesParameter.a());
            String string;
            if (i != null) {
                string = i.toString();
            }
            else if (contains) {
                string = "unassigned";
            }
            else {
                string = null;
            }
            int n;
            if (contains || (i != null && ((ArrayList<Object>)i).getClass().equals(Boolean.class))) {
                n = 1;
            }
            else {
                n = 0;
            }
            Object o;
            if (n != 0) {
                final ArrayList a3 = this.a(featureSwitchesParameter.b(), i);
                o = this.a(a2, a3.toArray(new CharSequence[a3.size()]), string);
            }
            else {
                String string2;
                if (i != null && ArrayList.class.equals(((ArrayList<Object>)i).getClass())) {
                    final JSONArray jsonArray = new JSONArray();
                    final Iterator<Object> iterator4 = ((ArrayList<Object>)i).iterator();
                    while (iterator4.hasNext()) {
                        jsonArray.put(iterator4.next());
                    }
                    string2 = jsonArray.toString();
                }
                else {
                    string2 = string;
                }
                o = this.a(a2, string2);
            }
            final int n2 = order + 1;
            ((Preference)o).setOrder(order);
            this.a(a2, (Preference)o);
            order = n2;
        }
        if (this.e.size() > 0) {
            this.a(this.c.getString("feature_switch_search", ""));
        }
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        if (n == 0) {
            this.c();
        }
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        this.c.edit().putString("feature_switch_search", string).apply();
        this.a(string);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.g = new Handler(Looper.getMainLooper());
        this.setTitle(2131298267);
        this.addPreferencesFromResource(2131165196);
        (this.a = (TwitterEditText)this.findViewById(2131887159)).setVisibility(0);
        this.a.setLabelText(2131298265);
        this.a.addTextChangedListener((TextWatcher)this);
        final PreferenceScreen preferenceScreen = this.getPreferenceScreen();
        this.c = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.b = (PreferenceCategory)preferenceScreen.findPreference((CharSequence)"fs_values");
        this.d = this.getSharedPreferences("fs_override", 0);
        preferenceScreen.findPreference((CharSequence)"reset").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.b();
        this.a(new com.twitter.library.api.y((Context)this, this.m(), com.twitter.library.featureswitch.d.b()).j("FS fetches are always polling."), 0);
        final String stringExtra = this.getIntent().getStringExtra("override_key");
        final String stringExtra2 = this.getIntent().getStringExtra("override_value");
        if (App.f() && stringExtra != null && stringExtra2 != null) {
            this.b(stringExtra, stringExtra2);
        }
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        final Object i = com.twitter.library.featureswitch.d.i(key);
        Label_0151: {
            if (i != null) {
                break Label_0151;
            }
            String s = String.class.toString();
        Label_0033_Outer:
            while (true) {
                Label_0164: {
                    if (o == null) {
                        break Label_0164;
                    }
                    String string = o.toString();
                    try {
                        while (true) {
                            final JSONObject jsonObject = new JSONObject();
                            jsonObject.put("type", (Object)s);
                            jsonObject.put("value", (Object)string);
                            final String string2 = jsonObject.toString();
                            final FeatureSwitchesValue a = FeatureSwitchesValue.a(key, string2);
                            if (string2 != null && a != null) {
                                com.twitter.library.featureswitch.d.a().put(key, a);
                                this.d.edit().putString(preference.getKey(), string2).apply();
                                preference.setSummary((CharSequence)("[Overridden] Current: " + string));
                            }
                            return true;
                            s = i.getClass().toString();
                            continue Label_0033_Outer;
                            string = null;
                            continue;
                        }
                    }
                    catch (JSONException ex) {
                        this.g.post((Runnable)new hp(this, ex));
                        return false;
                    }
                }
                break;
            }
        }
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final boolean equals = "reset".equals(preference.getKey());
        boolean b = false;
        if (equals) {
            com.twitter.library.featureswitch.d.a().clear();
            this.d.edit().clear().apply();
            this.a(new com.twitter.library.api.y((Context)this, this.m(), com.twitter.library.featureswitch.d.b()).j("FS fetches are always polling."), 0);
            b = true;
        }
        return b;
    }
    
    public boolean onSearchRequested() {
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
