// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v4.util.LruCache;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.util.TypedValue;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuff$Mode;

public class TintManager
{
    private static final ColorFilterLruCache COLOR_FILTER_CACHE;
    private static final int[] CONTAINERS_WITH_TINT_CHILDREN;
    private static final boolean DEBUG;
    static final PorterDuff$Mode DEFAULT_MODE;
    private static final String TAG;
    private static final int[] TINT_COLOR_BACKGROUND_MULTIPLY;
    private static final int[] TINT_COLOR_CONTROL_ACTIVATED;
    private static final int[] TINT_COLOR_CONTROL_NORMAL;
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
    private final Context mContext;
    private ColorStateList mDefaultColorStateList;
    private final Resources mResources;
    private ColorStateList mSwitchThumbStateList;
    private ColorStateList mSwitchTrackStateList;
    private final TypedValue mTypedValue;
    
    static {
        TAG = TintManager.class.getSimpleName();
        DEFAULT_MODE = PorterDuff$Mode.SRC_IN;
        COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
        TINT_COLOR_CONTROL_NORMAL = new int[] { R.drawable.abc_ic_ab_back_mtrl_am_alpha, R.drawable.abc_ic_go_search_api_mtrl_alpha, R.drawable.abc_ic_search_api_mtrl_alpha, R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_ic_clear_mtrl_alpha, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha, R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, R.drawable.abc_ic_voice_search_api_mtrl_alpha, R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha };
        TINT_COLOR_CONTROL_ACTIVATED = new int[] { R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha };
        TINT_COLOR_BACKGROUND_MULTIPLY = new int[] { R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult };
        TINT_COLOR_CONTROL_STATE_LIST = new int[] { R.drawable.abc_edit_text_material, R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material, R.drawable.abc_spinner_mtrl_am_alpha, R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material };
        CONTAINERS_WITH_TINT_CHILDREN = new int[] { R.drawable.abc_cab_background_top_material };
    }
    
    public TintManager(final Context mContext) {
        this.mContext = mContext;
        this.mResources = new TintResources(mContext.getResources(), this);
        this.mTypedValue = new TypedValue();
    }
    
    private static boolean arrayContains(final int[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    private ColorStateList getDefaultColorStateList() {
        if (this.mDefaultColorStateList == null) {
            final int themeAttrColor = this.getThemeAttrColor(R.attr.colorControlNormal);
            final int themeAttrColor2 = this.getThemeAttrColor(R.attr.colorControlActivated);
            final int[][] array = new int[7][];
            final int[] array2 = new int[7];
            array[0] = new int[] { -16842910 };
            array2[0] = this.getDisabledThemeAttrColor(R.attr.colorControlNormal);
            final int n = 0 + 1;
            array[n] = new int[] { 16842908 };
            array2[n] = themeAttrColor2;
            final int n2 = n + 1;
            array[n2] = new int[] { 16843518 };
            array2[n2] = themeAttrColor2;
            final int n3 = n2 + 1;
            array[n3] = new int[] { 16842919 };
            array2[n3] = themeAttrColor2;
            final int n4 = n3 + 1;
            array[n4] = new int[] { 16842912 };
            array2[n4] = themeAttrColor2;
            final int n5 = n4 + 1;
            array[n5] = new int[] { 16842913 };
            array2[n5] = themeAttrColor2;
            final int n6 = n5 + 1;
            array[n6] = new int[0];
            array2[n6] = themeAttrColor;
            this.mDefaultColorStateList = new ColorStateList(array, array2);
        }
        return this.mDefaultColorStateList;
    }
    
    public static Drawable getDrawable(final Context context, final int n) {
        if (isInTintList(n)) {
            return new TintManager(context).getDrawable(n);
        }
        return ContextCompat.getDrawable(context, n);
    }
    
    private ColorStateList getSwitchThumbColorStateList() {
        if (this.mSwitchThumbStateList == null) {
            final int[][] array = new int[3][];
            final int[] array2 = new int[3];
            array[0] = new int[] { -16842910 };
            array2[0] = this.getDisabledThemeAttrColor(R.attr.colorSwitchThumbNormal);
            final int n = 0 + 1;
            array[n] = new int[] { 16842912 };
            array2[n] = this.getThemeAttrColor(R.attr.colorControlActivated);
            final int n2 = n + 1;
            array[n2] = new int[0];
            array2[n2] = this.getThemeAttrColor(R.attr.colorSwitchThumbNormal);
            this.mSwitchThumbStateList = new ColorStateList(array, array2);
        }
        return this.mSwitchThumbStateList;
    }
    
    private ColorStateList getSwitchTrackColorStateList() {
        if (this.mSwitchTrackStateList == null) {
            final int[][] array = new int[3][];
            final int[] array2 = new int[3];
            array[0] = new int[] { -16842910 };
            array2[0] = this.getThemeAttrColor(16842800, 0.1f);
            final int n = 0 + 1;
            array[n] = new int[] { 16842912 };
            array2[n] = this.getThemeAttrColor(R.attr.colorControlActivated, 0.3f);
            final int n2 = n + 1;
            array[n2] = new int[0];
            array2[n2] = this.getThemeAttrColor(16842800, 0.3f);
            this.mSwitchTrackStateList = new ColorStateList(array, array2);
        }
        return this.mSwitchTrackStateList;
    }
    
    private static boolean isInTintList(final int n) {
        return arrayContains(TintManager.TINT_COLOR_BACKGROUND_MULTIPLY, n) || arrayContains(TintManager.TINT_COLOR_CONTROL_NORMAL, n) || arrayContains(TintManager.TINT_COLOR_CONTROL_ACTIVATED, n) || arrayContains(TintManager.TINT_COLOR_CONTROL_STATE_LIST, n) || arrayContains(TintManager.CONTAINERS_WITH_TINT_CHILDREN, n);
    }
    
    int getDisabledThemeAttrColor(final int n) {
        this.mContext.getTheme().resolveAttribute(16842803, this.mTypedValue, true);
        return this.getThemeAttrColor(n, this.mTypedValue.getFloat());
    }
    
    public Drawable getDrawable(final int n) {
        Drawable drawable = ContextCompat.getDrawable(this.mContext, n);
        if (drawable != null) {
            if (arrayContains(TintManager.TINT_COLOR_CONTROL_STATE_LIST, n)) {
                drawable = new TintDrawableWrapper(drawable, this.getDefaultColorStateList());
            }
            else {
                if (n == R.drawable.abc_switch_track_mtrl_alpha) {
                    return new TintDrawableWrapper(drawable, this.getSwitchTrackColorStateList());
                }
                if (n == R.drawable.abc_switch_thumb_material) {
                    return new TintDrawableWrapper(drawable, this.getSwitchThumbColorStateList(), PorterDuff$Mode.MULTIPLY);
                }
                if (arrayContains(TintManager.CONTAINERS_WITH_TINT_CHILDREN, n)) {
                    return this.mResources.getDrawable(n);
                }
                this.tintDrawable(n, drawable);
                return drawable;
            }
        }
        return drawable;
    }
    
    int getThemeAttrColor(final int n) {
        if (this.mContext.getTheme().resolveAttribute(n, this.mTypedValue, true)) {
            if (this.mTypedValue.type >= 16 && this.mTypedValue.type <= 31) {
                return this.mTypedValue.data;
            }
            if (this.mTypedValue.type == 3) {
                return this.mResources.getColor(this.mTypedValue.resourceId);
            }
        }
        return 0;
    }
    
    int getThemeAttrColor(final int n, final float n2) {
        final int themeAttrColor = this.getThemeAttrColor(n);
        return (0xFFFFFF & themeAttrColor) | Math.round(n2 * Color.alpha(themeAttrColor)) << 24;
    }
    
    void tintDrawable(final int n, final Drawable drawable) {
        PorterDuff$Mode porterDuff$Mode = null;
        int round = -1;
        int n2;
        int n3;
        if (arrayContains(TintManager.TINT_COLOR_CONTROL_NORMAL, n)) {
            n2 = R.attr.colorControlNormal;
            n3 = 1;
        }
        else if (arrayContains(TintManager.TINT_COLOR_CONTROL_ACTIVATED, n)) {
            n2 = R.attr.colorControlActivated;
            n3 = 1;
            porterDuff$Mode = null;
        }
        else if (arrayContains(TintManager.TINT_COLOR_BACKGROUND_MULTIPLY, n)) {
            n2 = 16842801;
            n3 = 1;
            porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
        }
        else {
            final int abc_list_divider_mtrl_alpha = R.drawable.abc_list_divider_mtrl_alpha;
            n2 = 0;
            n3 = 0;
            porterDuff$Mode = null;
            if (n == abc_list_divider_mtrl_alpha) {
                n2 = 16842800;
                n3 = 1;
                round = Math.round(40.8f);
                porterDuff$Mode = null;
            }
        }
        if (n3 != 0) {
            if (porterDuff$Mode == null) {
                porterDuff$Mode = TintManager.DEFAULT_MODE;
            }
            final int themeAttrColor = this.getThemeAttrColor(n2);
            PorterDuffColorFilter value = TintManager.COLOR_FILTER_CACHE.get(themeAttrColor, porterDuff$Mode);
            if (value == null) {
                value = new PorterDuffColorFilter(themeAttrColor, porterDuff$Mode);
                TintManager.COLOR_FILTER_CACHE.put(themeAttrColor, porterDuff$Mode, value);
            }
            drawable.setColorFilter((ColorFilter)value);
            if (round != -1) {
                drawable.setAlpha(round);
            }
        }
    }
    
    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter>
    {
        public ColorFilterLruCache(final int n) {
            super(n);
        }
        
        private static int generateCacheKey(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return 31 * (n + 31) + porterDuff$Mode.hashCode();
        }
        
        PorterDuffColorFilter get(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return this.get(generateCacheKey(n, porterDuff$Mode));
        }
        
        PorterDuffColorFilter put(final int n, final PorterDuff$Mode porterDuff$Mode, final PorterDuffColorFilter porterDuffColorFilter) {
            return this.put(generateCacheKey(n, porterDuff$Mode), porterDuffColorFilter);
        }
    }
}
