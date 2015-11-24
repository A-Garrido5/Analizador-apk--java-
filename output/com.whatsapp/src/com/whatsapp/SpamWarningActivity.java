// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.os.ConditionVariable;

public class SpamWarningActivity extends DialogToastActivity
{
    private static ConditionVariable k;
    private static final String[] z;
    private int l;
    
    static {
        final String[] z2 = new String[6];
        String s = "]\u001ds83U\u00179#2H\u0016y>r]\u0010c#3R]Z\u000b\u0015r";
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
                        c2 = '\\';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]\u001ds83U\u00179#2H\u0016y>r_\u0012c/;S\u0001nd\u0014s>R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "o\u0003v'\u000b]\u0001y#2[2t>5J\u001ac3|O\u0007v8(Y\u00177=5H\u001b7)3X\u00167";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Y\u000bg#.E,~$\u0003O\u0016t%2X\u0000";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001c\u0012y.|Y\u000bg#.ES?#2\u001c\u0000r)3R\u0017dc|";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "O\u0003v'\u0003K\u0012e$5R\u0014H89]\u0000x$\u0003W\u0016n";
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
        SpamWarningActivity.k = new ConditionVariable(false);
    }
    
    private void a() {
        new c3(this).start();
    }
    
    static ConditionVariable b() {
        return SpamWarningActivity.k;
    }
    
    public static void b(final boolean b) {
        if (b) {
            SpamWarningActivity.k.open();
            if (!App.I) {
                return;
            }
        }
        SpamWarningActivity.k.close();
    }
    
    private void e() {
        final CircularProgressBar circularProgressBar = (CircularProgressBar)this.findViewById(2131755163);
        circularProgressBar.setVisibility(0);
        circularProgressBar.setProgressBarBackgroundColor(-65536);
        circularProgressBar.setProgressBarColor(-2039584);
        circularProgressBar.setPaintStrokeFactor(30.0f);
        circularProgressBar.setKnobEnabled(true);
        circularProgressBar.setMax(1000 * this.l);
        new tp(this, 1000 * this.l, 10L, circularProgressBar).start();
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final Intent intent = new Intent(SpamWarningActivity.z[0]);
        intent.addCategory(SpamWarningActivity.z[1]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        this.setContentView(2130903075);
        this.setTitle(2131231763);
        final int intExtra = this.getIntent().getIntExtra(SpamWarningActivity.z[5], 100);
        this.l = this.getIntent().getIntExtra(SpamWarningActivity.z[3], -1);
        Log.i(SpamWarningActivity.z[2] + intExtra + SpamWarningActivity.z[4] + this.l);
        while (true) {
            int n = 0;
            Label_0270: {
                Label_0262: {
                    switch (intExtra) {
                        case 101: {
                            n = 2131231766;
                            if (i) {
                                break Label_0262;
                            }
                            break Label_0270;
                        }
                        case 102: {
                            n = 2131231764;
                            if (i) {
                                break Label_0262;
                            }
                            break Label_0270;
                        }
                        case 103: {
                            n = 2131231765;
                            if (i) {
                                break Label_0262;
                            }
                            break Label_0270;
                        }
                        case 104: {
                            n = 2131231768;
                            if (i) {
                                break Label_0262;
                            }
                            break Label_0270;
                        }
                        case 106: {
                            n = 2131231767;
                            if (!i) {
                                break Label_0270;
                            }
                            break;
                        }
                    }
                }
                if (this.l == -1) {
                    n = 2131231761;
                    if (!i) {
                        break Label_0270;
                    }
                }
                final int text = 2131231759;
                ((Button)this.findViewById(2131755225)).setOnClickListener((View$OnClickListener)new jd(this, intExtra));
                ((TextView)this.findViewById(2131755224)).setText(text);
                if (this.l == -1) {
                    this.findViewById(2131755163).setVisibility(8);
                    this.a();
                    if (!i) {
                        return;
                    }
                }
                this.findViewById(2131755226).setVisibility(8);
                this.e();
                return;
            }
            final int text = n;
            continue;
        }
    }
}
