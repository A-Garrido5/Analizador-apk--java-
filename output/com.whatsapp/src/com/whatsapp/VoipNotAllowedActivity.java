// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.content.res.Configuration;

public class VoipNotAllowedActivity extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "{\u0012d8'b\tl$%b\nh,(n\td> y\u0004\",,~\t\u007f'0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "e\ty8:7R\"?>zSz (y\u000el89#\u001eb%fk\u001c|g.h\u0013h:(aR?py>M=xq";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "e\ty8:7R\"?>zSz (y\u000el89#\u001eb%fk\u001c|g.h\u0013h:(aR?py>M=xq";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "g\u0014i";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "{\u0012d8'b\tl$%b\nh,(n\td> y\u0004\"+;h\u001cy-";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u007f\u0018l;&c";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131755262);
        if (configuration.orientation == 1) {
            linearLayout.setOrientation(1);
            if (!App.I) {
                return;
            }
        }
        linearLayout.setOrientation(0);
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        Log.i(VoipNotAllowedActivity.z[4]);
        this.setContentView(2130903235);
        vc.b((TextView)this.findViewById(2131755086));
        final String stringExtra = this.getIntent().getStringExtra(VoipNotAllowedActivity.z[3]);
        while (true) {
            int n = 0;
            Label_0332: {
                int n2 = 0;
                String s = null;
                Label_0321: {
                    Label_0306: {
                        switch (this.getIntent().getIntExtra(VoipNotAllowedActivity.z[5], 0)) {
                            case 1: {
                                n = 2131231945;
                                if (i) {
                                    break Label_0306;
                                }
                                break Label_0332;
                            }
                            case 2: {
                                n = 2131231946;
                                if (i) {
                                    break Label_0306;
                                }
                                break Label_0332;
                            }
                            case 3: {
                                n2 = 2131231944;
                                s = VoipNotAllowedActivity.z[2];
                                if (i) {
                                    break Label_0306;
                                }
                                break Label_0321;
                            }
                            case 4: {
                                n2 = 2131231943;
                                s = VoipNotAllowedActivity.z[1];
                                if (!i) {
                                    break Label_0321;
                                }
                                break;
                            }
                        }
                    }
                    final String s2 = null;
                    final int n3 = 2131231942;
                    ((TextView)this.findViewById(2131755538)).setText((CharSequence)this.getString(n3, new Object[] { App.S.e(stringExtra).l() }));
                    final TextView textView = (TextView)this.findViewById(2131755337);
                    final TextView textView2 = (TextView)this.findViewById(2131755829);
                    Label_0220: {
                        if (s2 == null) {
                            textView2.setVisibility(8);
                            textView.setText(2131231435);
                            if (!i) {
                                break Label_0220;
                            }
                        }
                        textView2.setVisibility(0);
                        textView2.setOnClickListener((View$OnClickListener)new co(this, s2));
                        textView.setText(2131231436);
                    }
                    textView.setOnClickListener((View$OnClickListener)new ash(this));
                    final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131755262);
                    if (this.getResources().getConfiguration().orientation == 1) {
                        linearLayout.setOrientation(1);
                        if (!i) {
                            return;
                        }
                    }
                    linearLayout.setOrientation(0);
                    return;
                }
                final int n3 = n2;
                final String s2 = s;
                continue;
            }
            final int n3 = n;
            final String s2 = null;
            continue;
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(VoipNotAllowedActivity.z[0]);
    }
}
