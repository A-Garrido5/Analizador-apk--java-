// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.app.Activity;
import com.whatsapp.util.b_;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.List;
import android.content.pm.PackageManager;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.view.Menu;
import java.util.ArrayList;
import android.support.v7.app.ActionBar;
import android.transition.Transition;
import android.view.Window;
import java.io.Serializable;
import android.net.Uri;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.util.cq;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import com.whatsapp.App;
import android.content.Context;
import android.transition.TransitionInflater;
import android.os.Build$VERSION;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import com.whatsapp.DialogToastActivity;

public class GalleryPicker extends DialogToastActivity
{
    private static final String[] z;
    private int k;
    
    static {
        final String[] z2 = new String[29];
        String s = ":i\u001c\\";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "-b\nL+%h@W*8i\u0000Jj-o\u001aW+\"\"8w\u0001\u001b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+m\u0002R!>u\u001eW''i\u001c\u0011'>i\u000fJ!";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "!m\u0016a2%h\u000bQ\u001b?e\u0014[";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "<~\u000bH-){";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "!m\u0016a2%h\u000bQ\u001b?e\u0014[";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ">i\rW4%i\u0000J";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "+m\u0002R!>u\u001eW''i\u001cW*/`\u001bZ!";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "!m\u0016a-8i\u0003M";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ":i\u001c\\";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "/c\u0003\u00103$m\u001aM%<|1N6)j\u000bL!\"o\u000bM";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "-b\nL+%h@W*8i\u0000Jj)t\u001aL%b_:l\u0001\rA";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = ">i\rW4%i\u0000J";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "!m\u0016a-8i\u0003M";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = ".y\rU!8S\u001bL-";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "%b\rR1(i1S!(e\u000f";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "<~\u000bH-){";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "%b\rR1(i1S!(e\u000f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "-b\nL+%h@W*8i\u0000Jj)t\u001aL%b_:l\u0001\rA";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = ">i\rW4%i\u0000J";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "/c\u0003\u00103$m\u001aM%<|1N6)j\u000bL!\"o\u000bM";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "+m\u0002R!>u\u001eW''i\u001c\u0011 )\u007f\u001aL+5";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "+m\u0002R!>u\u001eW''i\u001cW*/`\u001bZ!";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = ":e\n[+";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = ":e\n[+";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "-b\nL+%h@W*8i\u0000Jj-o\u001aW+\"\">w\u0007\u0007";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "%a\u000fY!c&";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = ":e\n[+c&";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "-b\nL+%h@W*8i\u0000Jj-o\u001aW+\"\">w\u0007\u0007";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    break Label_0757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GalleryPicker() {
        this.k = 1;
    }
    
    static int a(final GalleryPicker galleryPicker) {
        return galleryPicker.k;
    }
    
    static int a(final GalleryPicker galleryPicker, final int k) {
        return galleryPicker.k = k;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final int v = MediaGalleryBase.v;
        Label_0088: {
            switch (n) {
                case 0: {
                    if (n2 == -1) {
                        if (this.k == 4) {
                            intent.putExtra(GalleryPicker.z[23], true);
                        }
                        this.setResult(-1, intent);
                        this.finish();
                        if (v == 0) {
                            break;
                        }
                    }
                    if (n2 != 2) {
                        break;
                    }
                    this.setResult(2);
                    this.finish();
                    if (v != 0) {
                        break Label_0088;
                    }
                    break;
                }
                case 1: {
                    if (n2 == -1) {
                        if (this.k == 4) {
                            intent.putExtra(GalleryPicker.z[24], true);
                        }
                        this.setResult(-1, intent);
                    }
                    this.finish();
                }
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        final int v = MediaGalleryBase.v;
        Log.i(GalleryPicker.z[2]);
        this.supportRequestWindowFeature(5);
        if (Build$VERSION.SDK_INT >= 21) {
            final Window window = this.getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            final Transition inflateTransition = TransitionInflater.from((Context)this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setExitTransition(inflateTransition);
            final Transition inflateTransition2 = TransitionInflater.from((Context)this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!App.ak()) {
            this.getSupportActionBar().setHomeAsUpIndicator((Drawable)new m(this.getResources().getDrawable(2130838739)));
        }
        final ActionBar supportActionBar = this.getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        final String stringExtra = this.getIntent().getStringExtra(GalleryPicker.z[6]);
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            supportActionBar.setTitle(cq.c(stringExtra, this.getBaseContext()));
        }
        this.k = this.getIntent().getIntExtra(GalleryPicker.z[15], -1);
        if (this.k == -1) {
            this.k = this.getSharedPreferences(GalleryPicker.z[10], 0).getInt(GalleryPicker.z[7], 1);
        }
        this.setContentView(2130903157);
        final PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip)this.findViewById(2131755396);
        final ViewPager viewPager = (ViewPager)this.findViewById(2131755397);
        viewPager.setOffscreenPageLimit(0);
        final a3 adapter = new a3(this, this.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        pagerSlidingTabStrip.setViewPager(viewPager);
        pagerSlidingTabStrip.setOnPageChangeListener(new a9(this, adapter));
        pagerSlidingTabStrip.setTextColorResource(2131623942);
        Label_0409: {
            if (this.k == 1) {
                viewPager.setCurrentItem(0, false);
                adapter.a(0);
                if (v == 0) {
                    break Label_0409;
                }
                DialogToastActivity.h = !DialogToastActivity.h;
            }
            if (this.k == 4) {
                viewPager.setCurrentItem(1, false);
                adapter.a(1);
            }
        }
        ViewCompat.setElevation((View)pagerSlidingTabStrip, this.getResources().getDimension(2131361864));
        final ArrayList parcelableArrayListExtra = this.getIntent().getParcelableArrayListExtra(GalleryPicker.z[11]);
        final Uri uri = (Uri)this.getIntent().getParcelableExtra(GalleryPicker.z[14]);
        if (uri != null) {
            final Intent intent = new Intent(GalleryPicker.z[1], uri);
            intent.putExtra(GalleryPicker.z[17], this.k);
            intent.putExtra(GalleryPicker.z[16], this.getIntent().getBooleanExtra(GalleryPicker.z[4], true));
            intent.putExtra(GalleryPicker.z[0], this.getIntent().getStringExtra(GalleryPicker.z[9]));
            intent.putExtra(GalleryPicker.z[19], this.getIntent().getStringExtra(GalleryPicker.z[12]));
            intent.putExtra(GalleryPicker.z[5], this.getIntent().getLongExtra(GalleryPicker.z[3], Long.MAX_VALUE));
            intent.putExtra(GalleryPicker.z[13], this.getIntent().getIntExtra(GalleryPicker.z[8], Integer.MAX_VALUE));
            intent.putExtra(GalleryPicker.z[18], (Serializable)parcelableArrayListExtra);
            intent.setClass((Context)this, (Class)MediaPicker.class);
            this.startActivityForResult(intent, 0);
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        int i = 0;
        final int v = MediaGalleryBase.v;
        Intent intent2 = null;
        Label_0082: {
            if (this.k == 4) {
                final Intent intent = new Intent(GalleryPicker.z[28], MediaStore$Video$Media.INTERNAL_CONTENT_URI);
                intent.setType(GalleryPicker.z[27]);
                if (v == 0) {
                    intent2 = intent;
                    break Label_0082;
                }
            }
            final Intent intent3 = new Intent(GalleryPicker.z[25], MediaStore$Images$Media.INTERNAL_CONTENT_URI);
            intent3.setType(GalleryPicker.z[26]);
            intent2 = intent3;
        }
        final PackageManager packageManager = this.getPackageManager();
        final List queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        final int size = queryIntentActivities.size();
        if (size > 0) {
            this.getMenuInflater().inflate(2131820544, menu);
            final SubMenu subMenu = menu.findItem(2131755829).getSubMenu();
            subMenu.clear();
            menu.findItem(2131755847).setVisible(false);
            while (i < size) {
                final ResolveInfo resolveInfo = queryIntentActivities.get(i);
                final Drawable loadIcon = resolveInfo.loadIcon(packageManager);
                final MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
                add.setIcon(loadIcon);
                add.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new c(this, resolveInfo, intent2));
                final int n = i + 1;
                if (v != 0) {
                    break;
                }
                i = n;
            }
        }
        return true;
    }
    
    public void onDestroy() {
        Log.i(GalleryPicker.z[21]);
        super.onDestroy();
        a_.a();
        this.getSharedPreferences(GalleryPicker.z[20], 0).edit().putInt(GalleryPicker.z[22], this.k).commit();
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3 && n == 84) {
            b_.a(this, false);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }
    
    public void onStart() {
        super.onStart();
    }
    
    public void onStop() {
        super.onStop();
    }
}
