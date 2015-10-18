// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.ArrayList;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import java.io.IOException;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.contact.j;
import com.whatsapp.contact.b;
import android.app.Activity;
import java.util.HashMap;
import android.os.AsyncTask;

public class y5 extends AsyncTask
{
    private static final String[] z;
    boolean a;
    HashMap b;
    Activity c;
    boolean d;
    String e;
    gu f;
    
    static {
        final String[] z2 = new String[19];
        String s = "\u0003$L\u000e[";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0003$L\u000e[@6R\u0002E\blJ\u0007\\\n&_\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\f#U\u001e]B6S\r@\u001e-_\u000eYB";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0018/Q\u0005F\u001a/";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001a(\\\u0002v\u001e-_\u000eY21U\u0007@\u000e8";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\f#U\u001e]B6S\r@\u001e-_\u000eYB/U\u001f\u0004\u000b.O\u0005M";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\t$\\\n\\\u00015";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\f#U\u001e]B6S\r@\u001e-_\u000eYB$H\u0019F\u001fa";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000e)_\bB\u001e8I\u001fL\u00002N\n]\u00182\u0015\u0002F\b3H\u0004[M";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\f#U\u001e]B\"U\u0005]\f\"N\u0018\u0006\u000e.O\u0005]M";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u000e)_\bB\u001e8I\u001fL\u00002N\n]\u00182\u0015\u000e[\u001f.HK";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Mi";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u001b$H\u0018@\u0002/";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\b,[\u0002E";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001f$]";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "@4T\u0000G\u00026T";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u000e)_\bB\u001e8I\u001fL\u00002N\n]\u00182\u0015\u0005F@\"U\u0005G\b\"N\u0002_\u00045C";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u000e)[\u001f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u000e)_\bB\u001e8I\u001fL\u00002N\n]\u00182\u0015\u0005F@2_\u0019_\b3\u0017\u0018]\f5O\u0018";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public y5(final Activity c, final gu f, final boolean d, final boolean a, final String e) {
        this.d = false;
        this.c = c;
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    protected Integer a(final String[] array) {
        try {
            this.b = nu.a();
            if (!this.d) {
                this.a();
                Log.i(y5.z[9] + j.b(com.whatsapp.contact.b.INVISIBLE_ONLY) + "/" + j.b(com.whatsapp.contact.b.BOTH) + y5.z[11] + App.w((Context)App.aq) + ")");
            }
            return 0;
        }
        catch (IOException ex) {
            Log.w(y5.z[8] + ex.toString());
            this.b = null;
            return -1;
        }
        catch (Exception ex2) {
            Log.w(y5.z[10] + ex2.toString());
            this.b = null;
            return -1;
        }
    }
    
    void a() {
        final boolean i = App.I;
        try {
            String s = null;
            Label_0051: {
                Label_0101: {
                    switch (Settings$System.getInt(this.c.getContentResolver(), y5.z[4])) {
                        case 0: {
                            s = y5.z[6];
                            if (i) {
                                break Label_0101;
                            }
                            break Label_0051;
                        }
                        case 2: {
                            s = y5.z[0];
                            if (i) {
                                break Label_0101;
                            }
                            break Label_0051;
                        }
                        case 1: {
                            s = y5.z[1];
                            if (i) {
                                break;
                            }
                            break Label_0051;
                        }
                    }
                }
                s = y5.z[3];
            }
            Log.i(y5.z[2] + s);
        }
        catch (Settings$SettingNotFoundException ex2) {
            Log.i(y5.z[5]);
        }
        catch (Exception ex) {
            Log.i(y5.z[7] + ex.toString());
        }
    }
    
    protected void a(final Integer n) {
        final boolean i = App.I;
        this.c.removeDialog(122);
        if (!App.O()) {
            Log.i(y5.z[16]);
            this.f.f(this.c.getString(2131231532, new Object[] { this.c.getString(2131230921) }));
            if (!i) {
                return;
            }
        }
        if (this.b == null || this.b.size() == 0) {
            Log.i(y5.z[18]);
            if (this.d) {
                if (this.c.isFinishing()) {
                    return;
                }
                this.c.showDialog(123);
                if (!i) {
                    return;
                }
            }
            final Activity c = this.c;
            final String e = this.e;
            final StringBuilder sb = new StringBuilder();
            String s;
            if (this.a) {
                s = y5.z[17];
            }
            else {
                s = y5.z[14];
            }
            final String string = sb.append(s).append(y5.z[15]).toString();
            Integer value;
            if (this.a) {
                value = 1;
            }
            else {
                value = null;
            }
            UserFeedbackActivity.a((Context)c, e, string, value);
            if (!i) {
                return;
            }
        }
        final Boolean true = Boolean.TRUE;
        final Boolean true2 = Boolean.TRUE;
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<String> iterator = this.b.keySet().iterator();
        Boolean b = true;
        Boolean b2 = true2;
        while (true) {
            while (iterator.hasNext()) {
                final String s2 = iterator.next();
                Boolean b3 = null;
                Boolean b4 = null;
                Label_0387: {
                    if (y5.z[12].equals(s2)) {
                        b2 = (Boolean)this.b.get(s2);
                        if (!i) {
                            b3 = b2;
                            b4 = b;
                            break Label_0387;
                        }
                    }
                    final Boolean b5 = b2;
                    if (y5.z[13].equals(s2)) {
                        b4 = this.b.get(s2);
                        if (!i) {
                            b3 = b5;
                            break Label_0387;
                        }
                        b = b4;
                    }
                    if (!(boolean)this.b.get(s2)) {
                        list.add(s2);
                    }
                    b3 = b5;
                    b4 = b;
                }
                if (i) {
                    final Boolean b6 = b3;
                    b = b4;
                    if (list.size() == 0 && b6 && !this.d) {
                        final Activity c2 = this.c;
                        final String e2 = this.e;
                        Integer value2;
                        if (this.a) {
                            value2 = 1;
                        }
                        else {
                            value2 = null;
                        }
                        UserFeedbackActivity.a((Context)c2, e2, null, value2);
                        if (!i) {
                            return;
                        }
                    }
                    final Activity c3 = this.c;
                    final String e3 = this.e;
                    final boolean a = this.a;
                    Integer value3 = null;
                    if (a) {
                        value3 = 1;
                    }
                    SystemStatusActivity.a((Context)c3, e3, value3, b, b6, list, this.d);
                    return;
                }
                b = b4;
                b2 = b3;
            }
            final Boolean b6 = b2;
            continue;
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((String[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Integer)o);
    }
    
    protected void onPreExecute() {
        this.c.showDialog(122);
    }
}
