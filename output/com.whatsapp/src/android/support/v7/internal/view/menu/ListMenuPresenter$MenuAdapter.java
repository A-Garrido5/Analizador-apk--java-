// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;

class ListMenuPresenter$MenuAdapter extends BaseAdapter
{
    private int mExpandedIndex;
    final ListMenuPresenter this$0;
    
    public ListMenuPresenter$MenuAdapter(final ListMenuPresenter this$0) {
        this.this$0 = this$0;
        this.mExpandedIndex = -1;
        this.findExpandedIndex();
    }
    
    void findExpandedIndex() {
        final int a = MenuBuilder.a;
        final MenuItemImpl expandedItem = this.this$0.mMenu.getExpandedItem();
        if (expandedItem != null) {
            final ArrayList nonActionItems = this.this$0.mMenu.getNonActionItems();
            int n;
            for (int size = nonActionItems.size(), i = 0; i < size; i = n) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.mExpandedIndex = i;
                    return;
                }
                n = i + 1;
                if (a != 0) {
                    break;
                }
            }
        }
        this.mExpandedIndex = -1;
    }
    
    public int getCount() {
        final int n = this.this$0.mMenu.getNonActionItems().size() - ListMenuPresenter.access$000(this.this$0);
        if (this.mExpandedIndex < 0) {
            return n;
        }
        return n - 1;
    }
    
    public MenuItemImpl getItem(final int n) {
        final ArrayList nonActionItems = this.this$0.mMenu.getNonActionItems();
        int n2 = n + ListMenuPresenter.access$000(this.this$0);
        if (this.mExpandedIndex >= 0 && n2 >= this.mExpandedIndex) {
            ++n2;
        }
        return nonActionItems.get(n2);
    }
    
    public Object getItem(final int n) {
        return this.getItem(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.this$0.mInflater.inflate(this.this$0.mItemLayoutRes, viewGroup, false);
        }
        else {
            inflate = view;
        }
        ((MenuView$ItemView)inflate).initialize(this.getItem(n), 0);
        return inflate;
    }
    
    public void notifyDataSetChanged() {
        this.findExpandedIndex();
        super.notifyDataSetChanged();
    }
}
