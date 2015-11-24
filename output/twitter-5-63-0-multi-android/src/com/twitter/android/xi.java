// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import android.widget.ListAdapter;
import android.widget.AutoCompleteTextView;
import com.twitter.android.util.al;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import android.text.TextUtils;
import com.twitter.android.util.ap;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import android.widget.ArrayAdapter;
import com.twitter.library.network.c;
import java.util.List;
import android.content.Context;

public final class xi
{
    public static List a(final Context context) {
        return c.a(context).b();
    }
    
    public static void a(final ArrayAdapter arrayAdapter, final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final Context context) {
        final al a = ap.a(context);
        final String a2 = a.a(phonenumber$PhoneNumber);
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            arrayAdapter.add((Object)a2);
            if (a2.startsWith("+")) {
                arrayAdapter.add((Object)a2.substring(1));
            }
            final String a3 = a.a(phonenumber$PhoneNumber, PhoneNumberUtil$PhoneNumberFormat.c);
            if (!TextUtils.isEmpty((CharSequence)a3)) {
                arrayAdapter.add((Object)a3.replaceAll("[^0-9]", ""));
            }
        }
    }
    
    public static void a(final AutoCompleteTextView autoCompleteTextView, final Context context) {
        a(autoCompleteTextView, context, ap.a(context).f());
    }
    
    public static void a(final AutoCompleteTextView autoCompleteTextView, final Context context, final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (phonenumber$PhoneNumber != null) {
            final ArrayAdapter adapter = new ArrayAdapter(context, 17367050);
            a(adapter, phonenumber$PhoneNumber, context);
            autoCompleteTextView.setAdapter((ListAdapter)adapter);
        }
    }
    
    public static List b(final Context context) {
        final ArrayList<String> list = new ArrayList<String>();
        final String g = ap.a(context).g();
        if (!TextUtils.isEmpty((CharSequence)g)) {
            list.add(g);
        }
        return list;
    }
}
