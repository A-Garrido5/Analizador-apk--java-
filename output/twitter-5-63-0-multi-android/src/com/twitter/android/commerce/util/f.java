// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.app.Activity;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.AlertDialog;
import android.view.WindowManager$BadTokenException;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.widget.Toast;
import android.text.TextUtils;
import java.util.List;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.HashSet;
import java.util.HashMap;
import android.content.Context;
import java.util.Set;
import java.util.Map;

public class f
{
    private Map a;
    private Set b;
    private Context c;
    
    public f(final Context c) {
        this.a = new HashMap();
        this.b = new HashSet();
        this.c = c;
    }
    
    private static int a(final String s) {
        int n = 2131296554;
        switch (s) {
            default: {
                n = 2131296577;
                return n;
            }
            case "display_name":
            case "full_name": {
                return n;
            }
            case "street1": {
                return 2131296548;
            }
            case "city": {
                return 2131296549;
            }
            case "subdivision": {
                return 2131296555;
            }
            case "postal_code": {
                return 2131296556;
            }
            case "country": {
                return 2131296550;
            }
            case "ccNumber": {
                return 2131296567;
            }
            case "ccCvv": {
                return 2131296558;
            }
            case "ccExpirationMonth": {
                return 2131296564;
            }
            case "ccExpirationYear": {
                return 2131296571;
            }
            case "postalCode": {
                return 2131296573;
            }
            case "email_address": {
                return 2131296575;
            }
        }
    }
    
    private void a() {
        final Iterator<TextView> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().setError((CharSequence)null, (Drawable)null);
        }
    }
    
    private boolean e(final List list) {
        final StringBuilder sb = new StringBuilder();
        final String format = String.format("%n", new Object[0]);
        final Iterator<Integer> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Integer n2 = iterator.next();
            final String string = this.c.getResources().getString((int)n2);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (sb.length() != 0) {
                    sb.append(format);
                }
                sb.append(string);
            }
            int n3;
            if (n != 0 && !this.b.contains(n2)) {
                n3 = 0;
            }
            else {
                n3 = n;
            }
            n = n3;
        }
        if (sb.length() != 0) {
            if (n != 0) {
                Toast.makeText(this.c, (CharSequence)sb.toString(), 1).show();
                return true;
            }
            final AlertDialog create = new AlertDialog$Builder(this.c).setMessage((CharSequence)sb.toString()).setCancelable(true).setPositiveButton(2131297362, (DialogInterface$OnClickListener)new g(this)).create();
            try {
                create.show();
                return true;
            }
            catch (WindowManager$BadTokenException ex) {
                return true;
            }
        }
        return false;
    }
    
    public List a(final List list) {
        this.a();
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        final Map a = this.a;
        final String format = String.format("%n", new Object[0]);
        for (final int intValue : list) {
            final TextView textView = a.get(intValue);
            if (textView != null) {
                String string;
                if (textView.getError() == null) {
                    string = null;
                }
                else {
                    string = textView.getError().toString();
                }
                final String string2 = this.c.getResources().getString(intValue);
                String string3;
                if (!TextUtils.isEmpty((CharSequence)string) && !string.contains(string2)) {
                    string3 = string2 + format + string;
                }
                else {
                    string3 = string2;
                }
                textView.setError((CharSequence)string3);
            }
            else {
                list2.add(intValue);
            }
        }
        return list2;
    }
    
    public void a(final Context context, final Bundle bundle) {
        boolean b = false;
        if (bundle != null) {
            final ArrayList parcelableArrayList = bundle.getParcelableArrayList("commerce_bundle_errors");
            b = false;
            if (parcelableArrayList != null) {
                this.c(parcelableArrayList);
                b = true;
            }
        }
        if (!b) {
            Toast.makeText(context, (CharSequence)context.getResources().getString(2131296666), 1).show();
        }
    }
    
    public void a(final Integer n) {
        this.b.add(n);
    }
    
    public void a(final Integer n, final TextView textView) {
        this.a.put(n, textView);
    }
    
    public List b(final List list) {
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (final ServerError serverError : list) {
            final ServerErrorType b = serverError.b();
            if (b != null) {
                if (b.equals(ServerErrorType.g)) {
                    list2.add(a(serverError.a()));
                }
                else {
                    list2.add(b.b());
                }
                if (!b.c()) {
                    continue;
                }
                this.a(Integer.valueOf(b.b()));
            }
        }
        return list2;
    }
    
    public void c(final List list) {
        this.d(this.b(list));
    }
    
    public void d(final List list) {
        final List a = this.a(list);
        if (this.c instanceof Activity) {
            e.a(this.c, ((Activity)this.c).getCurrentFocus());
        }
        if (!this.e(a)) {
            Toast.makeText(this.c, (CharSequence)this.c.getResources().getString(2131296547), 1).show();
        }
    }
}
