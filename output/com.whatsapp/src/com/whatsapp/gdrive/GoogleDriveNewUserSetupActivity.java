// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.whatsapp.alm;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public final class GoogleDriveNewUserSetupActivity extends SettingsGoogleDrive
{
    private static final String[] F;
    private Button C;
    private View D;
    private TextView[] E;
    
    static {
        final String[] f = new String[7];
        String s = "bwDy|j}\u000eb}w|N\u007f=bzTb|m7mJZM";
        int n = -1;
        String[] array = f;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "bwDy|j}\u000eb}w|N\u007f=`xTntlkY%[LTe";
                    n2 = 1;
                    array = f;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "d}Rbef4Nnd.lSna.jE\u007ffs6CyvbmE";
                    n2 = 2;
                    array = f;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "d}Rbef4Nnd.lSna.jE\u007ffs6CyvbmE+}l9Nnvg9Td3gpS{\u007fb`\u0000L|l~LnWqpVn]fnuxvqJE\u007ffsXC\u007fzupTr?#|XbgjwG%";
                    n2 = 3;
                    array = f;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "oxYdfwFIeuoxTna";
                    n2 = 4;
                    array = f;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = f;
                    s = "d}Rbef4Nnd.lSna.jE\u007ffs6Sc|vuD&`wxR\u007f<vwEscfzTnw.{Ahxvi\rmafh\u000f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "d}Rbef4Nnd.lSna.jE\u007ffs6Sc|vuD&`wxR\u007f<axC`fs4Fyvr6";
                    n = 5;
                    array = f;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        F = f;
    }
    
    private void a(final TextView textView) {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361875);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131361917);
        final int dimensionPixelSize3 = this.getResources().getDimensionPixelSize(2131361916);
        if (App.ak()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(2130838755, 0, 0, 0);
            textView.setPadding(dimensionPixelSize3, dimensionPixelSize, 0, dimensionPixelSize);
            textView.setCompoundDrawablePadding(dimensionPixelSize2);
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838755, 0);
        textView.setPadding(0, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize);
        textView.setCompoundDrawablePadding(dimensionPixelSize2);
    }
    
    static void a(final GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        googleDriveNewUserSetupActivity.i();
    }
    
    static void a(final GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity, final TextView textView) {
        googleDriveNewUserSetupActivity.a(textView);
    }
    
    static Button b(final GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        return googleDriveNewUserSetupActivity.C;
    }
    
    static View c(final GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        return googleDriveNewUserSetupActivity.D;
    }
    
    public static boolean e() {
        boolean b = true;
        if (!GoogleDriveService.am()) {
            b = false;
        }
        else {
            final int ae = GoogleDriveService.ae();
            Log.i(GoogleDriveNewUserSetupActivity.F[6] + ae);
            switch (ae) {
                case 0: {
                    break;
                }
                default: {
                    Log.e(GoogleDriveNewUserSetupActivity.F[5] + ae);
                    return b;
                }
                case 1:
                case 2:
                case 3:
                case 4: {
                    if (GoogleDriveService.o() != null) {
                        return false;
                    }
                    break;
                }
            }
        }
        return b;
    }
    
    private void i() {
        final int f = GoogleDriveService.F;
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361918);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131361875);
        final TextView[] e = this.E;
        final int length = e.length;
        int i = 0;
        while (i < length) {
            final TextView textView = e[i];
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            Label_0089: {
                if (App.ak()) {
                    textView.setPadding(dimensionPixelSize, dimensionPixelSize2, 0, dimensionPixelSize2);
                    if (f == 0) {
                        break Label_0089;
                    }
                }
                textView.setPadding(0, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            }
            ++i;
            if (f != 0) {
                break;
            }
        }
    }
    
    @Override
    protected void f() {
        GoogleDriveService.c(0);
        this.C.setEnabled(false);
        this.i();
    }
    
    @Override
    public void onBackPressed() {
        final Intent intent = new Intent(GoogleDriveNewUserSetupActivity.F[0]);
        intent.addCategory(GoogleDriveNewUserSetupActivity.F[1]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    public void onCreate(final Bundle bundle) {
        final int f = GoogleDriveService.F;
        super.onCreate(bundle);
        Log.i(GoogleDriveNewUserSetupActivity.F[2]);
        if (!e()) {
            Log.i(GoogleDriveNewUserSetupActivity.F[3]);
            this.setResult(-1);
            this.finish();
            return;
        }
        this.setTitle(2131232065);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.findViewById(2131755204).setVisibility(8);
        this.findViewById(2131755211).setVisibility(8);
        this.findViewById(2131755213).setVisibility(8);
        this.findViewById(2131755220).setVisibility(8);
        this.findViewById(2131755202).setVisibility(0);
        this.findViewById(2131755223).setVisibility(0);
        this.findViewById(2131755219).setVisibility(0);
        final TextView textView = (TextView)this.findViewById(2131755201);
        textView.setVisibility(0);
        textView.setText(2131232062);
        final TextView textView2 = (TextView)this.findViewById(2131755217);
        textView2.setText(2131232061);
        textView2.setTextColor(this.getResources().getColorStateList(2131624070));
        ((TextView)this.findViewById(2131755218)).setTextColor(this.getResources().getColorStateList(2131624069));
        this.D = this.findViewById(2131755216);
        final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131755203);
        linearLayout.setVisibility(0);
        final ArrayList<String> list = new ArrayList<String>();
        final String[] stringArray = this.getResources().getStringArray(2131689481);
        final int length = stringArray.length;
        int i = 0;
        while (i < length) {
            final String s = stringArray[i];
            if (!s.equals(this.getString(2131232104)) && !s.equals(this.getString(2131232106))) {
                list.add(s);
            }
            ++i;
            if (f != 0) {
                break;
            }
        }
        list.add(this.getString(2131232106));
        final LayoutInflater layoutInflater = (LayoutInflater)this.getSystemService(GoogleDriveNewUserSetupActivity.F[4]);
        this.E = new TextView[list.size()];
        linearLayout.addView(alm.a(layoutInflater, 2130903161, null));
        int n;
        for (int j = 0; j < list.size(); j = n) {
            final String text = list.get(j);
            final TextView textView3 = (TextView)alm.a(layoutInflater, 2130903162, null);
            textView3.setText((CharSequence)text);
            textView3.setClickable(true);
            linearLayout.addView((View)textView3);
            linearLayout.addView(alm.a(layoutInflater, 2130903161, null));
            (this.E[j] = textView3).setOnClickListener((View$OnClickListener)new aw(this, text, textView3));
            n = j + 1;
            if (f != 0) {
                break;
            }
        }
        (this.C = (Button)this.findViewById(2131755222)).setVisibility(0);
        this.C.setEnabled(false);
        this.C.setOnClickListener((View$OnClickListener)new cw(this));
    }
}
