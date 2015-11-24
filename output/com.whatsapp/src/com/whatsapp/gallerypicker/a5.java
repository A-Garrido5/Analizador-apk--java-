// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.DialogToastActivity;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import android.text.TextWatcher;
import com.whatsapp.aw8;
import android.text.InputFilter;
import android.widget.TextView$OnEditorActionListener;
import com.whatsapp.ConversationTextEntry;
import android.widget.TextView;
import com.whatsapp.PhotoView;
import com.whatsapp.alm;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.PagerAdapter;

class a5 extends PagerAdapter
{
    private static final String z;
    final ImagePreview a;
    
    static {
        final char[] charArray = "\u007fc\u000eg".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0016';
                    break;
                }
                case 0: {
                    c2 = '\u001a';
                    break;
                }
                case 1: {
                    c2 = '\u0007';
                    break;
                }
                case 2: {
                    c2 = 'g';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private a5(final ImagePreview a) {
        this.a = a;
    }
    
    a5(final ImagePreview imagePreview, final bg bg) {
        this(imagePreview);
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
    
    @Override
    public int getCount() {
        return ImagePreview.q(this.a).size();
    }
    
    @Override
    public int getItemPosition(final Object o) {
        int index = ImagePreview.q(this.a).indexOf(((View)o).getTag());
        if (index < 0) {
            index = -2;
        }
        return index;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final int v = MediaGalleryBase.v;
        final View a = alm.a(this.a.getLayoutInflater(), 2130903174, null, false);
        final PhotoView photoView = (PhotoView)a.findViewById(2131755327);
        if (ImagePreview.o(this.a)) {
            photoView.setHeightForInitialScaleCalculation(ImagePreview.c(this.a));
        }
        final Uri uri = ImagePreview.q(this.a).get(n);
        ImagePreview.a(this.a, photoView, uri);
        final TextView textView = (TextView)a.findViewById(2131755648);
        final ConversationTextEntry conversationTextEntry = (ConversationTextEntry)a.findViewById(2131755486);
        conversationTextEntry.setInputEnterDone(true);
        conversationTextEntry.setOnEditorActionListener((TextView$OnEditorActionListener)new s(this, conversationTextEntry));
        conversationTextEntry.setTag((Object)(uri.toString() + a5.z));
        conversationTextEntry.setFilters(new InputFilter[] { new aw8(160) });
        conversationTextEntry.setText((CharSequence)ImagePreview.e(this.a).get(uri));
        conversationTextEntry.addTextChangedListener((TextWatcher)new h(this, conversationTextEntry, textView, uri));
        alm.a((TextView)conversationTextEntry);
        final ImageButton imageButton = (ImageButton)a.findViewById(2131755446);
        imageButton.setOnClickListener((View$OnClickListener)new a0(this, imageButton, conversationTextEntry));
        viewGroup.addView(a, 0);
        if (DialogToastActivity.h) {
            MediaGalleryBase.v = v + 1;
        }
        return a;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
}
