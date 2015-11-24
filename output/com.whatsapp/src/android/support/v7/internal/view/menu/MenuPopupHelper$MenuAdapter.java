// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;

class MenuPopupHelper$MenuAdapter extends BaseAdapter
{
    private MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    final MenuPopupHelper this$0;
    
    public MenuPopupHelper$MenuAdapter(final MenuPopupHelper this$0, final MenuBuilder mAdapterMenu) {
        this.this$0 = this$0;
        this.mExpandedIndex = -1;
        this.mAdapterMenu = mAdapterMenu;
        this.findExpandedIndex();
    }
    
    static MenuBuilder access$000(final MenuPopupHelper$MenuAdapter menuPopupHelper$MenuAdapter) {
        return menuPopupHelper$MenuAdapter.mAdapterMenu;
    }
    
    void findExpandedIndex() {
        final int a = MenuBuilder.a;
        final MenuItemImpl expandedItem = MenuPopupHelper.access$300(this.this$0).getExpandedItem();
        if (expandedItem != null) {
            final ArrayList nonActionItems = MenuPopupHelper.access$300(this.this$0).getNonActionItems();
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
        ArrayList list;
        if (MenuPopupHelper.access$100(this.this$0)) {
            list = this.mAdapterMenu.getNonActionItems();
        }
        else {
            list = this.mAdapterMenu.getVisibleItems();
        }
        if (this.mExpandedIndex < 0) {
            return list.size();
        }
        return -1 + list.size();
    }
    
    public MenuItemImpl getItem(int n) {
        ArrayList list;
        if (MenuPopupHelper.access$100(this.this$0)) {
            list = this.mAdapterMenu.getNonActionItems();
        }
        else {
            list = this.mAdapterMenu.getVisibleItems();
        }
        if (this.mExpandedIndex >= 0 && n >= this.mExpandedIndex) {
            ++n;
        }
        return list.get(n);
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
            inflate = MenuPopupHelper.access$200(this.this$0).inflate(MenuPopupHelper.ITEM_LAYOUT, viewGroup, false);
        }
        else {
            inflate = view;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        if (this.this$0.mForceShowIcon) {
            ((ListMenuItemView)inflate).setForceShowIcon(true);
        }
        listMenuItemView.initialize(this.getItem(n), 0);
        return inflate;
    }
    
    public void notifyDataSetChanged() {
        this.findExpandedIndex();
        super.notifyDataSetChanged();
    }
}
