// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.Iterator;
import android.util.Log;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.support.v4.view.PagerAdapter;

public abstract class FragmentStatePagerAdapter extends PagerAdapter
{
    private static final String[] z;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private ArrayList mSavedState;
    
    static {
        final String[] z2 = new String[4];
        String s = "k\u0016\u0007y\u0010k";
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
                        c2 = 'u';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "k\u0016\u0007y\u0010k";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "^\u0010\u0007j\u0018}\f\u0012^\u0001y\u0016\u0003]\u0014\u007f\u0007\u0014L\u0011y\u0012\u0012h\u0007";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Z\u0003\u0002-\u0013j\u0003\u0001`\u0010v\u0016Fl\u00018\t\u0003tU";
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
    
    public FragmentStatePagerAdapter(final FragmentManager mFragmentManager) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList();
        this.mFragments = new ArrayList();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = mFragmentManager;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final int a = Fragment.a;
        final Fragment fragment = (Fragment)o;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= n) {
            this.mSavedState.add(null);
            if (a != 0) {
                break;
            }
        }
        this.mSavedState.set(n, this.mFragmentManager.saveFragmentInstanceState(fragment));
        this.mFragments.set(n, null);
        this.mCurTransaction.remove(fragment);
    }
    
    @Override
    public void finishUpdate(final ViewGroup viewGroup) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.commitAllowingStateLoss();
            this.mCurTransaction = null;
            this.mFragmentManager.executePendingTransactions();
        }
    }
    
    public abstract Fragment getItem(final int p0);
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final int a = Fragment.a;
        if (this.mFragments.size() > n) {
            final Fragment fragment = this.mFragments.get(n);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        final Fragment item = this.getItem(n);
        if (this.mSavedState.size() > n) {
            final Fragment$SavedState initialSavedState = this.mSavedState.get(n);
            if (initialSavedState != null) {
                item.setInitialSavedState(initialSavedState);
            }
        }
        while (this.mFragments.size() <= n) {
            this.mFragments.add(null);
            if (a != 0) {
                break;
            }
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(n, item);
        this.mCurTransaction.add(viewGroup.getId(), item);
        return item;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return ((Fragment)o).getView() == view;
    }
    
    @Override
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
        final int a = Fragment.a;
        if (parcelable != null) {
            final Bundle bundle = (Bundle)parcelable;
            bundle.setClassLoader(classLoader);
            final Parcelable[] parcelableArray = bundle.getParcelableArray(FragmentStatePagerAdapter.z[1]);
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                int n;
                for (int i = 0; i < parcelableArray.length; i = n) {
                    this.mSavedState.add(parcelableArray[i]);
                    n = i + 1;
                    if (a != 0) {
                        break;
                    }
                }
            }
            for (final String s : bundle.keySet()) {
                Label_0240: {
                    if (s.startsWith("f")) {
                        final int int1 = Integer.parseInt(s.substring(1));
                        final Fragment fragment = this.mFragmentManager.getFragment(bundle, s);
                        if (fragment != null) {
                            while (this.mFragments.size() <= int1) {
                                this.mFragments.add(null);
                                if (a != 0) {
                                    break;
                                }
                            }
                            fragment.setMenuVisibility(false);
                            this.mFragments.set(int1, fragment);
                            if (a == 0) {
                                break Label_0240;
                            }
                        }
                        Log.w(FragmentStatePagerAdapter.z[2], FragmentStatePagerAdapter.z[3] + s);
                    }
                }
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    @Override
    public Parcelable saveState() {
        int i = 0;
        final int a = Fragment.a;
        final int size = this.mSavedState.size();
        Object o = null;
        if (size > 0) {
            o = new Bundle();
            final Fragment$SavedState[] array = new Fragment$SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(array);
            ((Bundle)o).putParcelableArray(FragmentStatePagerAdapter.z[0], (Parcelable[])array);
        }
        Bundle bundle = (Bundle)o;
        while (i < this.mFragments.size()) {
            final Fragment fragment = this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.putFragment(bundle, "f" + i, fragment);
            }
            final int n = i + 1;
            if (a != 0) {
                break;
            }
            i = n;
        }
        return (Parcelable)bundle;
    }
    
    @Override
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        final Fragment mCurrentPrimaryItem = (Fragment)o;
        if (mCurrentPrimaryItem != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (mCurrentPrimaryItem != null) {
                mCurrentPrimaryItem.setMenuVisibility(true);
                mCurrentPrimaryItem.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = mCurrentPrimaryItem;
        }
    }
    
    @Override
    public void startUpdate(final ViewGroup viewGroup) {
    }
}
