// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import java.io.File;
import android.app.Activity;

public class OverlayAlert extends Activity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "!\u000f'aa5\u00121";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = 'R';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1\u00148&x:\u001a!{n\"\u000b{Zj5\u0012&|j +=ga7U6dj3\t\nxg=\u00150Wa'\u00167m}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "1\u00148&x:\u001a!{n\"\u000b{Zj5\u0012&|j +=ga7U'm|7\u000f&|n&\u001e";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a(final Activity activity) {
        DeleteAccountConfirmation.f();
        App.ba = false;
        App.k();
        App.as();
        final a_d e = App.S.e();
        if (e != null) {
            e.z();
            e.a(0, 0);
        }
        final File file = new File(App.aq.getFilesDir(), OverlayAlert.z[2]);
        if (file.exists()) {
            file.delete();
        }
        App.aX = null;
        App.f((Context)App.aq, null);
        App.ak.L();
        al5.h();
        ade.e();
        ade.d();
        final Intent intent = new Intent((Context)activity, (Class)RegisterPhone.class);
        intent.putExtra(OverlayAlert.z[3], true);
        intent.putExtra(OverlayAlert.z[1], true);
        intent.addFlags(32768);
        App.b((Context)activity, 1);
        App.j = false;
        App.at();
        al5.u();
        App.ae();
        activity.startActivity(intent);
        activity.finish();
        App.f(false);
        aqu.e();
        Conversation.m();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        if (Build$VERSION.SDK_INT >= 11) {
            this.setFinishOnTouchOutside(false);
        }
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903200, null, false));
        final Button button = (Button)this.findViewById(2131755547);
        button.setText(2131230903);
        button.setOnClickListener((View$OnClickListener)new aht(this));
        final Button button2 = (Button)this.findViewById(2131755546);
        button2.setText(2131231439);
        button2.setOnClickListener((View$OnClickListener)new a6q(this));
        final int intExtra = this.getIntent().getIntExtra(OverlayAlert.z[0], -1);
        if (intExtra == -1) {
            this.finish();
            if (!App.I) {
                return;
            }
        }
        ((TextView)this.findViewById(2131755695)).setText((CharSequence)this.getString(intExtra));
    }
}
