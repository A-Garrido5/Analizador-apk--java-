// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.android.commerce.util.ImageHelper$Image;
import com.twitter.android.commerce.util.a;
import com.twitter.android.commerce.util.ImageHelper;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.commerce.model.CreditCard;
import java.util.List;
import com.twitter.library.commerce.model.Profile;
import android.content.Context;
import java.util.HashMap;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

public class b extends ArrayAdapter
{
    private LayoutInflater a;
    private HashMap b;
    
    private b(final Context context) {
        super(context, 17367043);
        this.a = (LayoutInflater)this.getContext().getSystemService("layout_inflater");
        this.b = new HashMap();
    }
    
    public static b a(final Context context, final Profile profile, final List list) {
        final b b = new b(context);
        final CreditCard[] a = profile.a(list);
        for (int length = a.length, i = 0; i < length; ++i) {
            b.a(a[i]);
        }
        return b;
    }
    
    public void a(final CreditCard creditCard) {
        if (this.b.containsKey(creditCard.b()) && creditCard.a().equals(this.b.get(creditCard.b()))) {
            return;
        }
        this.b.put(creditCard.b(), creditCard.a());
        super.add((Object)creditCard);
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        if (inflate == null) {
            inflate = this.a.inflate(17367043, (ViewGroup)null);
            final TextView tag = (TextView)inflate.findViewById(16908308);
            tag.setCompoundDrawablePadding(ImageHelper.a(4, this.getContext()));
            inflate.setTag((Object)tag);
        }
        final CreditCard creditCard = (CreditCard)this.getItem(n);
        final ImageHelper$Image a = ImageHelper.a(creditCard.a());
        final TextView textView = (TextView)inflate.getTag();
        textView.setText((CharSequence)com.twitter.android.commerce.util.a.a(creditCard, this.getContext()));
        textView.setCompoundDrawablesWithIntrinsicBounds(a.a(), 0, 0, 0);
        return inflate;
    }
}
