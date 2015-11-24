// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.os.Bundle;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SystemStatusActivity extends DialogToastActivity
{
    private static final String[] z;
    private boolean k;
    private String l;
    private boolean m;
    private final List n;
    private boolean o;
    private ArrayList p;
    private String q;
    private int r;
    
    static {
        final String[] z2 = new String[38];
        String s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^:\u0003\u0011\u001a\u001c-";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0982:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^,\u0003\u0011\u001b\u0003'\u001f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "c\u0010\u0007\u001d\u0002!\t\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0017\u0000\u0007\u000e\u0005=\u0014\u0007";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^+\u0014\u0007\u000e\u0005-";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^+\u0014\u0007\u000e\u0005-I\u000fB\u0015'\u0011\f@\u0002<\u0014\u000b\u0001\u0016e\b\r\u001b\\.\t\u0017\u0001\u0015h";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^+\u0014\u0007\u000e\u0005-I\u0006\u0000\u0006&I\u0011\u001b\u0003!\b\u0005B\u001f'\u0012O\t\u001e=\b\u0006O";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0002<\u0007\u0016\u001a\u0002'\b\u000e\u0016";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ";\u0012\u0010\u0006\u001f/";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Bl";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0017\u0014\u0007\f\u0014&\u0012\u000e\u0016";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ":\u0003\u0005\u0006\u0002<\u0014\u0003\u001b\u0018'\b";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Bl";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = ";\u001f\u0011\u001b\u0014%9\u0011\u001b\u0010<\u0013\u00110";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = ";\u0012\u0010\u0006\u001f/";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u00051\u0016\u0007";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0014%\u0007\u000b\u0003";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "hF\u2040O";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0017\u0002\u0007\u001c\u0012:\u000f\u0012\u001b\u0018'\b";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = ";\u001f\u0011\u001b\u0014%9\u0011\u001b\u0010<\u0013\u00110";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = " \u0012\u0016\u001f\u0002rIM\u0018\u0019)\u0012\u0011\u000e\u00018H\u0001\u0000\u001cg\u0007\f\u000b\u0003'\u000f\u0006";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "+\u000e\u0003\u001b";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = ":\u0003\u0005\u0006\u0002<\u0014\u0003\u001b\u0018'\b";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0007-\u0014\u0011\u0006\u001e&";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = ":\u0003\u0005\u0006\u0002<\u0014\u0003\u001b\u0018'\b";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0017:\t\u000f";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0002-\u0014\u0014\n\u0003.\u0003\u0003\u001b\u0004:\u0003\u0011\u001a\u001f)\u0010\u0003\u0006\u001d)\u0004\u000e\n";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = ";\u001f\u0011\u001c\u0005)\u0012\u0017\u001c^8\u0007\u0017\u001c\u0014";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "*\u0014\r\u000e\u0015+\u0007\u0011\u001b";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = ";\u001f\f\f";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = ";\u0012\u0003\u001b\u0004;";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = ":\u0003\u0005\u0006\u0002<\u0014\u0003\u001b\u0018'\b";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0002<\u0007\u0016\u001a\u0002'\b\u000e\u0016";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u00051\u0016\u0007";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0017:\t\u000f";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0007-\u0014\u0011\u0006\u001e&";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0002-\u0014\u0014\n\u0003.\u0003\u0003\u001b\u0004:\u0003\u0011\u001a\u001f)\u0010\u0003\u0006\u001d)\u0004\u000e\n";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "+\t\u000fA\u0006 \u0007\u0016\u001c\u00108\u0016L<\b;\u0012\u0007\u0002\"<\u0007\u0016\u001a\u0002\t\u0005\u0016\u0006\u0007!\u0012\u001bA\u0014%\u0007\u000b\u0003";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    break Label_0982;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public SystemStatusActivity() {
        this.n = Arrays.asList(SystemStatusActivity.z[28], SystemStatusActivity.z[31], SystemStatusActivity.z[29], SystemStatusActivity.z[30]);
    }
    
    static String a(final SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.q;
    }
    
    public static void a(final Context context, final String s, final Integer n, final boolean b, final boolean b2, final ArrayList list, final boolean b3) {
        final Intent intent = new Intent(context, (Class)SystemStatusActivity.class);
        intent.putExtra(SystemStatusActivity.z[34], s);
        intent.putExtra(SystemStatusActivity.z[37], b);
        intent.putExtra(SystemStatusActivity.z[35], b2);
        intent.putStringArrayListExtra(SystemStatusActivity.z[36], list);
        intent.putExtra(SystemStatusActivity.z[32], b3);
        if (n != null) {
            intent.putExtra(SystemStatusActivity.z[33], (Serializable)n);
        }
        context.startActivity(intent);
    }
    
    static String b(final SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.l;
    }
    
    static int c(final SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.r;
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(SystemStatusActivity.z[4]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903225);
        final Intent intent = this.getIntent();
        this.l = intent.getStringExtra(SystemStatusActivity.z[25]);
        this.r = intent.getIntExtra(SystemStatusActivity.z[15], 0);
        this.getSupportActionBar().setTitle(2131231832);
        this.m = intent.getBooleanExtra(SystemStatusActivity.z[16], true);
        this.o = intent.getBooleanExtra(SystemStatusActivity.z[23], true);
        this.k = intent.getBooleanExtra(SystemStatusActivity.z[7], false);
        this.p = intent.getStringArrayListExtra(SystemStatusActivity.z[26]);
        final boolean remove = this.p.remove(SystemStatusActivity.z[22]);
        String text = null;
        Label_0206: {
            if (!this.o) {
                String s;
                if (App.aS == 2) {
                    s = this.getString(2131231555);
                }
                else if (App.aS == 0) {
                    s = this.getString(2131231556);
                }
                else {
                    s = this.getString(2131231557, new Object[] { SystemStatusActivity.z[20] });
                }
                int n;
                if (this.m) {
                    n = 2131231834;
                }
                else {
                    n = 2131231833;
                }
                text = this.getString(n, new Object[] { s });
            }
            else {
                Label_1188: {
                    if (this.r != 1) {
                        if (!remove) {
                            break Label_1188;
                        }
                        if (!this.m) {
                            final StringBuilder append = new StringBuilder().append(this.getString(2131231825)).append(" ");
                            int n2;
                            if (this.n.contains(SystemStatusActivity.z[11])) {
                                n2 = 2131231801;
                            }
                            else {
                                n2 = 2131231799;
                            }
                            text = append.append(this.getString(n2)).toString();
                            break Label_0206;
                        }
                        this.q = SystemStatusActivity.z[24];
                        if (!i) {
                            break Label_1188;
                        }
                    }
                    if (this.p.contains(SystemStatusActivity.z[21])) {
                        int n3;
                        if (this.m) {
                            n3 = 2131231798;
                        }
                        else {
                            n3 = 2131231797;
                        }
                        text = this.getString(n3);
                        break Label_0206;
                    }
                    if (this.p.size() > 0) {
                        String string = "";
                        int n4 = 0;
                        String s2 = null;
                        for (final String s3 : this.p) {
                            final int identifier = this.getResources().getIdentifier(SystemStatusActivity.z[19] + s3 + SystemStatusActivity.z[3], SystemStatusActivity.z[8], this.getPackageName());
                            Label_0827: {
                                if (identifier != 0) {
                                    string = string + SystemStatusActivity.z[17] + this.getString(identifier) + "\n";
                                    final int n5 = n4 + 1;
                                    if (!i) {
                                        n4 = n5;
                                        s2 = s3;
                                        break Label_0827;
                                    }
                                    n4 = n5;
                                    s2 = s3;
                                }
                                Log.e(SystemStatusActivity.z[5] + s3);
                            }
                            if (i) {
                                break;
                            }
                        }
                        if (n4 > 1) {
                            final String string2 = string + "\n";
                            if (this.m) {
                                text = this.getString(2131231813) + SystemStatusActivity.z[12] + string2 + this.getString(2131231815);
                                break Label_0206;
                            }
                            text = this.getString(2131231812) + SystemStatusActivity.z[9] + string2 + this.getString(2131231814);
                            break Label_0206;
                        }
                        else if (n4 > 0) {
                            final String packageName = this.getPackageName();
                            final StringBuilder append2 = new StringBuilder().append(SystemStatusActivity.z[13]).append(s2).append(SystemStatusActivity.z[18]);
                            String s4;
                            if (this.m) {
                                s4 = SystemStatusActivity.z[10];
                            }
                            else {
                                s4 = "";
                            }
                            final int identifier2 = this.getResources().getIdentifier(append2.append(s4).toString(), SystemStatusActivity.z[14], packageName);
                            if (identifier2 != 0) {
                                final StringBuilder append3 = new StringBuilder().append(this.getString(identifier2)).append(" ");
                                int n6;
                                if (this.m) {
                                    n6 = 2131231800;
                                }
                                else if (this.n.contains(s2)) {
                                    n6 = 2131231801;
                                }
                                else {
                                    n6 = 2131231799;
                                }
                                text = append3.append(this.getString(n6)).toString();
                                break Label_0206;
                            }
                            Log.e(SystemStatusActivity.z[6] + this.p.get(0));
                        }
                    }
                }
                text = null;
            }
        }
        Label_0253: {
            if (text == null) {
                if (this.k) {
                    text = this.getString(2131231704);
                    if (!i) {
                        break Label_0253;
                    }
                }
                UserFeedbackActivity.a((Context)this, this.l, this.q, this.r);
                this.finish();
            }
        }
        ((TextView)this.findViewById(2131755759)).setText((CharSequence)text);
        if (!this.k && this.m) {
            if (this.q == null) {
                this.q = "+" + TextUtils.join((CharSequence)"+", (Iterable)this.p);
                if (!this.o) {
                    this.q += SystemStatusActivity.z[2];
                }
            }
            ((Button)this.findViewById(2131755762)).setOnClickListener((View$OnClickListener)new m0(this));
            ((Button)this.findViewById(2131755763)).setOnClickListener((View$OnClickListener)new lc(this));
            if (!i) {
                return;
            }
        }
        this.findViewById(2131755760).setVisibility(8);
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(SystemStatusActivity.z[1]);
    }
    
    public void onPause() {
        super.onPause();
        Log.i(SystemStatusActivity.z[27]);
    }
    
    public void onResume() {
        super.onResume();
        Log.i(SystemStatusActivity.z[0]);
    }
}
