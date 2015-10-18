// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.ViewGroup;
import com.whatsapp.App;
import com.whatsapp.alm;
import android.widget.TextView;
import android.view.View;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.Preference;

public class WaPreference extends Preference
{
    private static final String[] z;
    private int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "{*1}";
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
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = '\u0012';
                        break;
                    }
                    case 1: {
                        c2 = 'I';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "z=*c9=f-pkw$?`-s':al{-ppl\u007ff?ch=;;`,s':al{-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z=*c9=f-pkw$?`-s':al{-ppl\u007ff?ch=;;`,s':al{-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "{*1}";
                    n2 = 3;
                    array = z2;
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
    
    public WaPreference(final Context context) {
        super(context);
    }
    
    public WaPreference(final Context context, final AttributeSet set) {
        super(context, set);
        if (Build$VERSION.SDK_INT < 11 && set != null) {
            this.a = set.getAttributeResourceValue(WaPreference.z[1], WaPreference.z[0], 0);
        }
    }
    
    public WaPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        if (Build$VERSION.SDK_INT < 11 && set != null) {
            this.a = set.getAttributeResourceValue(WaPreference.z[2], WaPreference.z[3], 0);
        }
    }
    
    public static View a(final View view) {
        final View viewById = view.findViewById(16908310);
        if (viewById instanceof TextView) {
            ((TextView)viewById).setTextColor(view.getContext().getResources().getColor(2131624061));
        }
        return view;
    }
    
    public static View b(final View view) {
        alm.a(view);
        if (!App.ak()) {
            final View viewById = view.findViewById(16908310);
            if (viewById != null) {
                viewById.getLayoutParams().width = -1;
            }
            final View viewById2 = view.findViewById(16908304);
            if (viewById2 != null) {
                viewById2.getLayoutParams().width = -1;
            }
        }
        return view;
    }
    
    protected void onBindView(final View view) {
        super.onBindView(view);
        if (this.a != 0) {
            final View viewById = view.findViewById(16908310);
            if (viewById != null && viewById instanceof TextView) {
                final TextView textView = (TextView)viewById;
                Label_0069: {
                    if (App.ak()) {
                        textView.setCompoundDrawablesWithIntrinsicBounds(this.a, 0, 0, 0);
                        if (!WaListPreference.a) {
                            break Label_0069;
                        }
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.a, 0);
                }
                textView.setCompoundDrawablePadding(this.getContext().getResources().getDimensionPixelSize(2131361944));
            }
        }
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return a(b(super.onCreateView(viewGroup)));
    }
}
