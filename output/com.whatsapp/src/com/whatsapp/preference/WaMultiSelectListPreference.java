// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import com.whatsapp.DialogToastActivity;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.app.AlertDialog$Builder;
import android.content.res.TypedArray;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import android.text.TextUtils;
import java.util.List;
import android.util.AttributeSet;
import android.content.Context;

public class WaMultiSelectListPreference extends WaListPreference
{
    private static final String[] z;
    private String b;
    private boolean[] c;
    private String d;
    private String e;
    
    static {
        final String[] z2 = new String[3];
        String s = "Dd'8#Zt'))}]\"?>Yc.*/{t%//)c.=?`c.?jh\u007fk)$}c\")9)p9>+p1*\".)p%l/ge95\u001ch}>)9)p9>+p1<$#jyk-8l1)#>a1?$/)b*!/)}.\"-}y";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '\t';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "FGv\u0005wQb.<+{p?#8Q,\u0002q\u001cF";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "%1";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public WaMultiSelectListPreference(final Context context) {
        this(context, null);
    }
    
    public WaMultiSelectListPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new boolean[this.getEntries().length];
        this.b = WaMultiSelectListPreference.z[1];
    }
    
    private CharSequence a(final List list) {
        final boolean a = WaListPreference.a;
        Label_0040: {
            try {
                if (!list.isEmpty()) {
                    break Label_0040;
                }
                final WaMultiSelectListPreference waMultiSelectListPreference = this;
                final String s = waMultiSelectListPreference.d;
                final boolean b = TextUtils.isEmpty((CharSequence)s);
                if (!b) {
                    final WaMultiSelectListPreference waMultiSelectListPreference2 = this;
                    return waMultiSelectListPreference2.d;
                }
                break Label_0040;
            }
            catch (IllegalStateException ex) {
                try {
                    throw ex;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            try {
                final WaMultiSelectListPreference waMultiSelectListPreference = this;
                final String s = waMultiSelectListPreference.d;
                final boolean b = TextUtils.isEmpty((CharSequence)s);
                if (!b) {
                    final WaMultiSelectListPreference waMultiSelectListPreference2 = this;
                    return waMultiSelectListPreference2.d;
                }
            }
            catch (IllegalStateException ex6) {}
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final CharSequence[] entries = this.getEntries();
        final CharSequence[] entryValues = this.getEntryValues();
        Label_0106: {
            try {
                if (list.size() != entryValues.length) {
                    break Label_0106;
                }
                final WaMultiSelectListPreference waMultiSelectListPreference3 = this;
                final String s3 = waMultiSelectListPreference3.e;
                final boolean b2 = TextUtils.isEmpty((CharSequence)s3);
                if (!b2) {
                    final WaMultiSelectListPreference waMultiSelectListPreference4 = this;
                    return waMultiSelectListPreference4.e;
                }
                break Label_0106;
            }
            catch (IllegalStateException ex3) {
                try {
                    throw ex3;
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            try {
                final WaMultiSelectListPreference waMultiSelectListPreference3 = this;
                final String s3 = waMultiSelectListPreference3.e;
                final boolean b2 = TextUtils.isEmpty((CharSequence)s3);
                if (!b2) {
                    final WaMultiSelectListPreference waMultiSelectListPreference4 = this;
                    return waMultiSelectListPreference4.e;
                }
            }
            catch (IllegalStateException ex7) {}
        }
        final int length = entryValues.length;
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3 = 0;
            Label_0171: {
                if (n >= length) {
                    break Label_0171;
                }
                final CharSequence charSequence = entryValues[n];
                try {
                    if (list.contains(charSequence)) {
                        list2.add((String)entries[n2]);
                    }
                    ++n2;
                    n3 = n + 1;
                    if (a) {
                        return a(list2, WaMultiSelectListPreference.z[2]);
                    }
                }
                catch (IllegalStateException ex5) {
                    throw ex5;
                }
            }
            n = n3;
        }
    }
    
    protected static String a(final Iterable iterable, final String s) {
        final boolean a = WaListPreference.a;
        if (iterable != null) {
            final Iterator<Object> iterator = iterable.iterator();
            try {
                if (!iterator.hasNext()) {
                    return "";
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            final StringBuilder sb = new StringBuilder(String.valueOf(iterator.next()));
            while (iterator.hasNext()) {
                sb.append(s).append(iterator.next());
                if (a) {
                    break;
                }
            }
            return sb.toString();
        }
        return "";
    }
    
    private void a() {
        final boolean a = WaListPreference.a;
        final CharSequence[] entryValues = this.getEntryValues();
        final CharSequence[] a2 = this.a((CharSequence)this.getValue());
        if (a2 != null) {
            final List<CharSequence> list = Arrays.asList(a2);
            int i = 0;
            while (i < entryValues.length) {
                this.c[i] = list.contains(entryValues[i]);
                ++i;
                if (a) {
                    break;
                }
            }
        }
    }
    
    private void a(final String value) {
        try {
            if (this.callChangeListener((Object)this.a((CharSequence)value))) {
                this.setValue(value);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private CharSequence[] a(final CharSequence charSequence) {
        while (true) {
            if (charSequence != null) {
                try {
                    if ("".equals(charSequence)) {
                        return new CharSequence[0];
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                return ((String)charSequence).split(this.b);
            }
            continue;
        }
    }
    
    static boolean[] a(final WaMultiSelectListPreference waMultiSelectListPreference) {
        return waMultiSelectListPreference.c;
    }
    
    public void a(final CharSequence[] array) {
        this.onSetInitialValue(false, array);
    }
    
    public void b(final String d) {
        this.d = d;
    }
    
    public void c(final String e) {
        this.e = e;
    }
    
    protected void onDialogClosed(final boolean b) {
        final boolean a = WaListPreference.a;
        final ArrayList<String> list = new ArrayList<String>();
        final CharSequence[] entryValues = this.getEntryValues();
        if (b && entryValues != null) {
            int n;
            for (int i = 0; i < entryValues.length; i = n) {
                if (this.c[i]) {
                    list.add((String)entryValues[i]);
                }
                n = i + 1;
                if (a) {
                    break;
                }
            }
            final String a2 = a(list, this.b);
            this.setSummary(this.a(list));
            this.a(a2);
        }
    }
    
    protected Object onGetDefaultValue(final TypedArray typedArray, final int n) {
        return typedArray.getTextArray(n);
    }
    
    protected void onPrepareDialogBuilder(final AlertDialog$Builder alertDialog$Builder) {
        final CharSequence[] entries = this.getEntries();
        final CharSequence[] entryValues = this.getEntryValues();
        while (true) {
            if (entries != null && entryValues != null) {
                try {
                    if (entries.length != entryValues.length) {
                        throw new IllegalStateException(WaMultiSelectListPreference.z[0]);
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                this.a();
                alertDialog$Builder.setMultiChoiceItems(entries, this.c, (DialogInterface$OnMultiChoiceClickListener)new a(this));
                return;
            }
            continue;
        }
    }
    
    protected void onSetInitialValue(final boolean b, final Object o) {
        final boolean a = WaListPreference.a;
        CharSequence[] array2 = null;
        Label_0027: {
            if (o == null) {
                final CharSequence[] array = new CharSequence[0];
                if (!a) {
                    array2 = array;
                    break Label_0027;
                }
            }
            array2 = (CharSequence[])o;
        }
        String s = a(Arrays.asList(array2), this.b);
        if (b) {
            s = this.getPersistedString(s);
        }
        while (true) {
            while (true) {
                Label_0109: {
                    try {
                        this.setSummary(this.a(Arrays.asList(this.a((CharSequence)s))));
                        this.a(s);
                        if (DialogToastActivity.h) {
                            if (!a) {
                                break Label_0109;
                            }
                            final boolean a2 = false;
                            WaListPreference.a = a2;
                        }
                        return;
                    }
                    catch (IllegalStateException ex) {
                        try {
                            throw ex;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
}
