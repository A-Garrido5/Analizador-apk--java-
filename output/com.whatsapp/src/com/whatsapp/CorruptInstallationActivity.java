// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.text.Spanned;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.text.method.LinkMovementMethod;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.text.style.URLSpan;
import android.text.SpannableStringBuilder;
import android.text.Html;
import android.widget.TextView;
import android.os.Bundle;

public class CorruptInstallationActivity extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "i}\u00012]ifB5Izb\u00004H*~\u0006(W*t\u00003Rn";
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
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'o';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "i}\u00012]ifB5Izb\u00004H";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "bf\u001b6O0=@1K}<\u0018.]~a\u000e6L$q\u0000+";
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
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        this.setContentView(2130903069);
        final TextView textView = (TextView)this.findViewById(2131755172);
        final Spanned fromHtml = Html.fromHtml(this.getString(2131230982));
        final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)fromHtml);
        final URLSpan[] array = (URLSpan[])fromHtml.getSpans(0, fromHtml.length(), (Class)URLSpan.class);
        if (array != null) {
            final int length = array.length;
            int j = 0;
            while (j < length) {
                final URLSpan urlSpan = array[j];
                if (CorruptInstallationActivity.z[1].equals(urlSpan.getURL())) {
                    Log.i(CorruptInstallationActivity.z[0]);
                    final int spanStart = text.getSpanStart((Object)urlSpan);
                    final int spanEnd = text.getSpanEnd((Object)urlSpan);
                    final int spanFlags = text.getSpanFlags((Object)urlSpan);
                    text.removeSpan((Object)urlSpan);
                    text.setSpan((Object)new ah9(new Intent((String)null, (Uri)null, (Context)this, (Class)DescribeProblemActivity.class)), spanStart, spanEnd, spanFlags);
                }
                ++j;
                if (i) {
                    break;
                }
            }
        }
        textView.setText((CharSequence)text);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button)this.findViewById(2131755168)).setOnClickListener((View$OnClickListener)new a_w(this));
        ((Button)this.findViewById(2131755171)).setOnClickListener((View$OnClickListener)new t0(this));
        final View viewById = this.findViewById(2131755167);
        final View viewById2 = this.findViewById(2131755169);
        switch (App.aS) {
            case 1: {
                final TextView textView2 = (TextView)this.findViewById(2131755170);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText((CharSequence)Html.fromHtml(String.format(this.getString(2131230984), CorruptInstallationActivity.z[2])));
                viewById.setVisibility(8);
                if (i) {
                    break;
                }
                return;
            }
        }
        viewById2.setVisibility(8);
    }
}
