// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import java.util.Iterator;
import com.whatsapp.util.cq;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import android.app.Dialog;
import java.util.Collection;
import android.app.Activity;

public class alh
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "8\u0013aSF3\u001dx\u000eP+\fS\rC>\u001ai\u000fT5\u001fi\u000e";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = '\f';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?\u0015m\u0011^<Sh\u0018]>\bi]_4\\a\u0018B(\u001dk\u0018B";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "+\u000ei\u001bn?\u0019`\u0018E>#a\u0018U2\u001d";
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
    
    public static Dialog a(final Activity activity, final Collection collection, final String s, final int n, final yk yk) {
        final boolean i = App.I;
        if (collection == null || collection.isEmpty()) {
            Log.e(alh.z[1]);
            return null;
        }
        final a_9 e = App.S.e(s);
        Label_0228: {
            if (collection.size() == 1) {
                final bi bi = collection.iterator().next();
                String string2 = null;
                Label_0179: {
                    if (bi.a.b) {
                        final String string = activity.getResources().getString(2131231017);
                        if (!i) {
                            string2 = string;
                            break Label_0179;
                        }
                    }
                    String s2 = null;
                    Label_0159: {
                        if (e.m()) {
                            if (bi.t == null) {
                                s2 = "";
                                break Label_0159;
                            }
                            final a_9 e2 = App.S.e(bi.t);
                            if (e2 != null) {
                                s2 = e2.a((Context)activity);
                            }
                            else {
                                s2 = "";
                            }
                            if (!i) {
                                break Label_0159;
                            }
                        }
                        else {
                            s2 = "";
                        }
                        if (e != null && e.a((Context)activity) != null) {
                            s2 = e.a((Context)activity);
                        }
                    }
                    string2 = activity.getResources().getString(2131231016, new Object[] { s2 });
                }
                if (!i) {
                    final String format = string2;
                    break Label_0228;
                }
            }
            final String format = String.format(App.C.a(2131296268, collection.size()), collection.size());
        }
        final Iterator<bi> iterator = collection.iterator();
        int n2 = 0;
    Label_0347:
        while (true) {
        Label_0342_Outer:
            while (iterator.hasNext()) {
                final bi bi2 = iterator.next();
                int n3;
                while (true) {
                    Label_0545: {
                        if ((bi2.I != 1 && bi2.I != 3 && (bi2.I != 2 || bi2.E == 1)) || bi2.N == null) {
                            break Label_0545;
                        }
                        final MediaData mediaData = (MediaData)bi2.N;
                        if (mediaData.file == null || !mediaData.file.exists()) {
                            break Label_0545;
                        }
                        if (!i) {
                            n3 = 1;
                            break Label_0347;
                        }
                        n3 = 1;
                        if (i) {
                            break Label_0347;
                        }
                        n2 = n3;
                        continue Label_0342_Outer;
                    }
                    n3 = n2;
                    continue;
                }
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
                final String format;
                if (n3 != 0) {
                    final View a = alm.a(LayoutInflater.from((Context)activity), 2130903147, null, false);
                    final CheckBox checkBox = (CheckBox)a.findViewById(2131755539);
                    final boolean boolean1 = App.aq.getSharedPreferences(alh.z[0], 0).getBoolean(alh.z[2], true);
                    checkBox.setChecked(boolean1);
                    ((TextView)a.findViewById(2131755538)).setText((CharSequence)format);
                    alertDialog$Builder.setView(a);
                    if (!i) {
                        final CheckBox checkBox2 = checkBox;
                        return alertDialog$Builder.setCancelable(true).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new gp(activity, n, checkBox2, boolean1, collection, yk)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new ady(activity, n)).setOnCancelListener((DialogInterface$OnCancelListener)new j9(activity, n)).create();
                    }
                }
                alertDialog$Builder.setMessage(cq.c(format, activity.getBaseContext()));
                final boolean boolean1 = false;
                final CheckBox checkBox2 = null;
                return alertDialog$Builder.setCancelable(true).setPositiveButton(2131230992, (DialogInterface$OnClickListener)new gp(activity, n, checkBox2, boolean1, collection, yk)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new ady(activity, n)).setOnCancelListener((DialogInterface$OnCancelListener)new j9(activity, n)).create();
            }
            int n3 = n2;
            continue Label_0347;
        }
    }
}
