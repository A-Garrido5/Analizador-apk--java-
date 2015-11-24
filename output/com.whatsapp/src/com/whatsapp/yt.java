// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnCancelListener;
import java.text.DateFormat;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface$OnDismissListener;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.app.Activity;

public class yt
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "`\u000bnwtd\u0007wqhZ\u0017\u007fjc";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '\u001e';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`\u000bnwtd\u0007wqhZ\u0017\u007fjc";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`\u000bnwtd\u0007wqhZ\u0017\u007fjc";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "`\u000bnwtd\u0007wqhZ\u0017\u007fjc";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "9\\msgi\u001f \")v\u001e\u007frj;";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "a\u001a\u007frib\\i\u007ftk^m{ts\u001a}{+`\u000bnwtd\u0007wqh";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "a\u001a\u007frib\\i\u007ftk^m{ts\u001a}{+`\u000bnwtd\u0007wqh%\u001e{mud\u0014{#hp\u001fr";
                    n2 = 6;
                    array = z2;
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "9\u0011l189\u0000s\u007fjiM\"mkd\u001fr ";
                    n = 6;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static Dialog a(final Activity activity) {
        return new AlertDialog$Builder((Context)activity).setMessage(2131231108).setPositiveButton(2131231435, null).create();
    }
    
    public static Dialog a(final Activity activity, final String text) {
        Log.i(yt.z[5]);
        if (text == null) {
            Log.e(yt.z[6]);
            return null;
        }
        final ml ml = new ml(activity);
        final ak onDismissListener = new ak();
        final TextView customTitle = (TextView)activity.getLayoutInflater().inflate(2130903190, (ViewGroup)null);
        customTitle.setText((CharSequence)text);
        final String string = activity.getString(2131231455);
        final String string2 = activity.getString(2131231453);
        final String string3 = activity.getString(2131231451);
        final String string4 = activity.getString(2131231456, new Object[] { App.X.a("1") });
        final String string5 = activity.getString(2131231454);
        final String string6 = activity.getString(2131231452);
        final String s = yt.z[7];
        final String s2 = yt.z[4];
        final AlertDialog create = new AlertDialog$Builder((Context)activity).setCustomTitle((View)customTitle).setCancelable(false).setItems(new CharSequence[] { Html.fromHtml(string + s + string4 + s2), Html.fromHtml(string2 + s + string5 + s2), Html.fromHtml(string3 + s + string6 + s2) }, (DialogInterface$OnClickListener)ml).create();
        create.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        return create;
    }
    
    public static Dialog a(final Activity activity, final String message, final String s) {
        return new AlertDialog$Builder((Context)activity).setMessage(message).setPositiveButton(2131231867, (DialogInterface$OnClickListener)new aa3(activity, s)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new q3()).create();
    }
    
    private static DialogInterface$OnClickListener a(final Activity activity, final boolean b) {
        if (b) {
            return (DialogInterface$OnClickListener)new v8(activity);
        }
        return null;
    }
    
    public static String a() {
        return App.aq.getString(2131231106, new Object[] { DateFormat.getDateInstance(2).format(ade.a(yt.z[0])) });
    }
    
    public static void a(final Activity activity, final AlertDialog alertDialog, final boolean b) {
        alertDialog.setButton(-1, alertDialog.getButton(-1).getText(), a(activity, b));
    }
    
    public static Dialog b(final Activity activity) {
        final ah_ ah_ = new ah_(activity, 2130903092, activity);
        ah_.setOnCancelListener((DialogInterface$OnCancelListener)new ui(activity));
        return ah_;
    }
    
    public static Dialog b(final Activity activity, final boolean b) {
        final AlertDialog$Builder setMessage = new AlertDialog$Builder((Context)activity).setMessage(c());
        setMessage.setPositiveButton(2131231435, a(activity, b));
        return setMessage.create();
    }
    
    public static String b() {
        return App.aq.getString(2131231110, new Object[] { DateFormat.getDateInstance(2).format(ade.a(yt.z[2])) });
    }
    
    public static Dialog c(final Activity activity) {
        return new AlertDialog$Builder((Context)activity).setMessage(d()).setPositiveButton(2131231435, null).create();
    }
    
    public static String c() {
        return App.aq.getString(2131231109, new Object[] { DateFormat.getDateInstance(2).format(ade.a(yt.z[1])) });
    }
    
    public static Dialog d(final Activity activity) {
        return new AlertDialog$Builder((Context)activity).setMessage(a()).setPositiveButton(2131231435, null).create();
    }
    
    public static String d() {
        return App.aq.getString(2131231107, new Object[] { DateFormat.getDateInstance(2).format(ade.a(yt.z[3])) });
    }
    
    public static Dialog e(final Activity activity) {
        return new AlertDialog$Builder((Context)activity).setMessage(b()).setPositiveButton(2131231435, null).create();
    }
    
    public static Dialog f(final Activity activity) {
        final ahs ahs = new ahs(activity, 2130903223, activity);
        ahs.setOnCancelListener((DialogInterface$OnCancelListener)new a_4(activity));
        return ahs;
    }
}
