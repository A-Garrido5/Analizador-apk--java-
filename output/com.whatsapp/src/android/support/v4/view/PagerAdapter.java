// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Parcelable;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObservable;

public abstract class PagerAdapter
{
    private static final String[] z;
    private DataSetObservable mObservable;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0010^3;\u007f0^&n{'O*!rb_'=b0T;\u0007b'Vb9w1\u001b,!bbT4+d0R&*s,";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0010^3;\u007f0^&n{'O*!rbR,=b#U6'w6^\u000b:s/\u001b5/ebU-:6-M'<d+_&+x";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public PagerAdapter() {
        this.mObservable = new DataSetObservable();
    }
    
    public void destroyItem(final View view, final int n, final Object o) {
        throw new UnsupportedOperationException(PagerAdapter.z[0]);
    }
    
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        this.destroyItem((View)viewGroup, n, o);
    }
    
    public void finishUpdate(final View view) {
    }
    
    public void finishUpdate(final ViewGroup viewGroup) {
        this.finishUpdate((View)viewGroup);
    }
    
    public abstract int getCount();
    
    public int getItemPosition(final Object o) {
        return -1;
    }
    
    public CharSequence getPageTitle(final int n) {
        return null;
    }
    
    public float getPageWidth(final int n) {
        return 1.0f;
    }
    
    public Object instantiateItem(final View view, final int n) {
        throw new UnsupportedOperationException(PagerAdapter.z[1]);
    }
    
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        return this.instantiateItem((View)viewGroup, n);
    }
    
    public abstract boolean isViewFromObject(final View p0, final Object p1);
    
    public void notifyDataSetChanged() {
        this.mObservable.notifyChanged();
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver((Object)dataSetObserver);
    }
    
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public Parcelable saveState() {
        return null;
    }
    
    public void setPrimaryItem(final View view, final int n, final Object o) {
    }
    
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        this.setPrimaryItem((View)viewGroup, n, o);
    }
    
    public void startUpdate(final View view) {
    }
    
    public void startUpdate(final ViewGroup viewGroup) {
        this.startUpdate((View)viewGroup);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver((Object)dataSetObserver);
    }
}
