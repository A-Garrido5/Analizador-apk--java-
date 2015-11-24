// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.widget.Button;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class IncorrectAppReleaseVersionActivity extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "k\u0004MQ\u0003c\u000e\u0007J\u0002~\u000fGWBk\t]J\u0003dDdb%D";
        int n = -1;
        String[] array = z2;
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
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = 'j';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "k\u0004MQ\u0003c\u000e\u0007J\u0002~\u000fGWBi\u000b]F\u000be\u0018P\r$E'l";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "_\u0004BM\u0003}\u0004\tU\rf\u001fL\u0003\ne\u0018\tF\u0014~\u0018H\u0003\u0018s\u001aL\u0003V*";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "~\u0013YF";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "b\u001e]S\u001f0E\u0006T\u001b}D^K\r~\u0019HS\u001c$\tFNCk\u0004MQ\u0003c\u000e";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "g\u000b[H\t~P\u0006\f\bo\u001eHJ\u0000yU@GQi\u0005D\r\u001bb\u000b]P\rz\u001a";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "k\u0007SMV%EHS\u001cyEHM\bx\u0005@GSzWJL\u0001$\u001dAB\u0018y\u000bYS";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void onBackPressed() {
        final Intent intent = new Intent(IncorrectAppReleaseVersionActivity.z[0]);
        intent.addCategory(IncorrectAppReleaseVersionActivity.z[1]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        this.setContentView(2130903072);
        final TextView textView = (TextView)this.findViewById(2131755193);
        final int int1 = this.getIntent().getExtras().getInt(IncorrectAppReleaseVersionActivity.z[3]);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    Label_0204:
        while (true) {
            Label_0158: {
                switch (int1) {
                    case 1: {
                        textView.setText((CharSequence)Html.fromHtml(String.format(this.getString(2131230807), IncorrectAppReleaseVersionActivity.z[5], IncorrectAppReleaseVersionActivity.z[4])));
                        if (i) {
                            break Label_0158;
                        }
                        break Label_0204;
                    }
                    case 2: {
                        textView.setText((CharSequence)Html.fromHtml(String.format(this.getString(2131231151), IncorrectAppReleaseVersionActivity.z[6])));
                        if (!i) {
                            break Label_0204;
                        }
                        break;
                    }
                }
            }
            try {
                throw new IllegalArgumentException(IncorrectAppReleaseVersionActivity.z[2] + int1);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            continue;
        }
        ((Button)this.findViewById(2131755171)).setOnClickListener((View$OnClickListener)new at9(this));
    }
}
