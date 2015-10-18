// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.widget.ListView;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.v4.view.PagerAdapter;

class vb extends PagerAdapter implements y7
{
    final ContactPicker a;
    
    private vb(final ContactPicker a) {
        this.a = a;
    }
    
    vb(final ContactPicker contactPicker, final j j) {
        this(contactPicker);
    }
    
    @Override
    public int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 0: {
                return 2130839029;
            }
            case 1: {
                return 2130838705;
            }
            case 2: {
                return 2130838973;
            }
        }
    }
    
    @Override
    public void destroyItem(final View view, final int n, final Object o) {
        ((ViewPager)view).removeView((View)o);
    }
    
    @Override
    public void finishUpdate(final View view) {
    }
    
    @Override
    public int getCount() {
        if (ContactPicker.x(this.a) || ContactPicker.n(this.a) || ContactPicker.j(this.a)) {
            return 3;
        }
        return 1;
    }
    
    @Override
    public CharSequence getPageTitle(final int n) {
        return "";
    }
    
    @Override
    public Object instantiateItem(final View view, final int n) {
        final boolean i = App.I;
        final View inflate = this.a.getLayoutInflater().inflate(2130903102, (ViewGroup)null);
        final ListView listView = (ListView)inflate.findViewById(16908298);
        listView.setDivider((Drawable)new m(this.a.getResources().getDrawable(2130837753)));
        listView.setHeaderDividersEnabled(true);
        listView.setFastScrollEnabled(true);
        listView.setScrollbarFadingEnabled(true);
        listView.setEmptyView(inflate.findViewById(2131755407));
        listView.setTextFilterEnabled(true);
        Label_0207: {
            if (Build$VERSION.SDK_INT >= 11) {
                listView.setFastScrollAlwaysVisible(true);
                listView.setScrollBarStyle(33554432);
                if (App.W) {
                    listView.setVerticalScrollbarPosition(1);
                    listView.setPadding(this.a.getResources().getDimensionPixelSize(2131361808), 0, this.a.getResources().getDimensionPixelSize(2131361807), 0);
                    if (!i) {
                        break Label_0207;
                    }
                }
                listView.setVerticalScrollbarPosition(2);
                listView.setPadding(this.a.getResources().getDimensionPixelSize(2131361807), 0, this.a.getResources().getDimensionPixelSize(2131361808), 0);
                if (!i) {
                    break Label_0207;
                }
            }
            listView.setSelector(2130839068);
        }
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new sd(this, listView));
        if (!ContactPicker.y(this.a) && !ContactPicker.a(this.a) && !ContactPicker.v(this.a) && !ContactPicker.x(this.a) && !ContactPicker.n(this.a) && !ContactPicker.j(this.a) && !ContactPicker.m(this.a) && !ContactPicker.e(this.a)) {
            listView.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)new l2(this, listView));
        }
        inflate.findViewById(2131755568).setOnClickListener((View$OnClickListener)new iu(this));
        this.a.registerForContextMenu((View)listView);
        Label_0684: {
            switch (n) {
                case 0: {
                    if (ContactPicker.y(this.a) || ContactPicker.x(this.a) || ContactPicker.n(this.a) || ContactPicker.j(this.a)) {
                        listView.setAdapter((ListAdapter)ContactPicker.f(this.a));
                        if (!i) {
                            break;
                        }
                    }
                    if (ContactPicker.m(this.a)) {
                        listView.setAdapter((ListAdapter)ContactPicker.h(this.a));
                        if (!i) {
                            break;
                        }
                    }
                    if (!ContactPicker.y(this.a) && !ContactPicker.a(this.a) && !ContactPicker.v(this.a) && !ContactPicker.x(this.a) && !ContactPicker.n(this.a) && !ContactPicker.j(this.a) && !ContactPicker.e(this.a)) {
                        final View a = alm.a(this.a.getLayoutInflater(), 2130903104, null, false);
                        a.setBackgroundResource(2130837547);
                        ((ImageView)a.findViewById(2131755275)).setImageBitmap(a_9.b(2130838957));
                        final TextView textView = (TextView)a.findViewById(2131755413);
                        vc.b(textView);
                        textView.setText(2131231407);
                        ((TextView)a.findViewById(2131755415)).setVisibility(8);
                        a.setOnClickListener((View$OnClickListener)new br(this));
                        listView.addHeaderView(a, (Object)null, true);
                    }
                    listView.setAdapter((ListAdapter)ContactPicker.c(this.a));
                    if (i) {
                        break Label_0684;
                    }
                    break;
                }
                case 1: {
                    listView.setAdapter((ListAdapter)ContactPicker.h(this.a));
                    if (i) {
                        break Label_0684;
                    }
                    break;
                }
                case 2: {
                    listView.setAdapter((ListAdapter)ContactPicker.c(this.a));
                    break;
                }
            }
        }
        listView.setTag((Object)n);
        ((ViewPager)view).addView(inflate, 0);
        return inflate;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
    
    @Override
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    @Override
    public Parcelable saveState() {
        return null;
    }
    
    @Override
    public void startUpdate(final View view) {
    }
}
