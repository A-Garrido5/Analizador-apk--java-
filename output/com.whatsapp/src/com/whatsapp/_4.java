// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import java.util.Locale;
import android.text.TextUtils;
import com.whatsapp.util.b6;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.widget.BaseAdapter;

class _4 extends BaseAdapter
{
    private static final String[] z;
    protected List a;
    final WebSessionsActivity b;
    
    static {
        final String[] z2 = new String[5];
        String s = "-6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0007';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
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
                    s = "+#~Qf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "72}Bu-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "';iLj!";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\":iFa++";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private _4(final WebSessionsActivity b) {
        this.b = b;
    }
    
    _4(final WebSessionsActivity webSessionsActivity, final atp atp) {
        this(webSessionsActivity);
    }
    
    public nl a(final int n) {
        return this.a.get(n);
    }
    
    public void a(final List a) {
        this.a = a;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.b.getLayoutInflater(), 2130903240, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        final nl a2 = this.a(n);
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755296);
        vc.a(textView2);
        textView.setText(b6.a(this.b.getBaseContext(), a2.e, l7.a(a2.f)));
        Label_0169: {
            if (!TextUtils.isEmpty((CharSequence)a2.l)) {
                textView2.setText((CharSequence)this.b.getResources().getString(2131231960, new Object[] { a2.l, a2.c }));
                if (!i) {
                    break Label_0169;
                }
            }
            textView2.setText((CharSequence)a2.c);
        }
        int imageResource = 2130837566;
        Label_0288: {
            if (a2.h != null) {
                final String lowerCase = a2.h.toLowerCase(Locale.US);
                int n2 = -1;
                Label_0457: {
                    switch (lowerCase.hashCode()) {
                        case -1361128838: {
                            if (!lowerCase.equals(_4.z[3])) {
                                break;
                            }
                            n2 = 0;
                            if (i) {
                                break Label_0457;
                            }
                            break;
                        }
                        case -849452327: {
                            if (!lowerCase.equals(_4.z[4])) {
                                break;
                            }
                            n2 = 1;
                            if (i) {
                                break Label_0457;
                            }
                            break;
                        }
                        case 105948115: {
                            if (!lowerCase.equals(_4.z[1])) {
                                break;
                            }
                            n2 = 2;
                            if (i) {
                                break Label_0457;
                            }
                            break;
                        }
                        case -909897856: {
                            if (!lowerCase.equals(_4.z[2])) {
                                break;
                            }
                            n2 = 3;
                            if (i) {
                                break Label_0457;
                            }
                            break;
                        }
                        case 3356: {
                            if (lowerCase.equals(_4.z[0])) {
                                n2 = 4;
                                break;
                            }
                            break;
                        }
                    }
                }
                int n3 = 0;
                Label_0512: {
                    switch (n2) {
                        case 0: {
                            n3 = 2130837566;
                            if (i) {
                                break Label_0512;
                            }
                            break;
                        }
                        case 1: {
                            n3 = 2130837567;
                            if (i) {
                                break Label_0512;
                            }
                            break;
                        }
                        case 2: {
                            n3 = 2130837570;
                            if (i) {
                                break Label_0512;
                            }
                            break;
                        }
                        case 3: {
                            n3 = 2130837571;
                            if (i) {
                                break Label_0512;
                            }
                            break;
                        }
                        case 4: {
                            imageResource = 2130837568;
                            break Label_0288;
                        }
                    }
                }
                imageResource = n3;
            }
        }
        ((ImageView)view.findViewById(2131755583)).setImageResource(imageResource);
        if (a2.g) {
            if (a2.d == 0L) {
                WebSessionsActivity.a(this.b, a2.f);
                if (!i) {
                    return view;
                }
            }
            WebSessionsActivity.a(this.b, a2.f, a2.d);
            if (!i) {
                return view;
            }
        }
        WebSessionsActivity.a(this.b, a2.f);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
