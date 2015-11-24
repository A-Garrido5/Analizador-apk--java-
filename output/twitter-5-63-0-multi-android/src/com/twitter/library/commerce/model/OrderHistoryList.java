// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.io.Serializable;

public class OrderHistoryList implements Serializable
{
    private Map mAddresses;
    private Map mCards;
    private Long mLastItemId;
    private ArrayList mOrders;
    
    public OrderHistoryList() {
        this.mCards = new HashMap();
        this.mAddresses = new HashMap();
        this.mOrders = new ArrayList();
    }
    
    public List a() {
        return this.mOrders;
    }
    
    public void a(final OrderHistoryItem orderHistoryItem) {
        final CreditCard q = orderHistoryItem.q();
        if (q != null) {
            if (this.mCards.containsKey(q.i())) {
                orderHistoryItem.a((CreditCard)this.mCards.get(q.i()));
            }
            else {
                this.mCards.put(q.i(), q);
            }
        }
        final Address p = orderHistoryItem.p();
        if (p != null) {
            if (this.mAddresses.containsKey(p.h())) {
                orderHistoryItem.a((Address)this.mAddresses.get(p.h()));
            }
            else {
                this.mAddresses.put(p.h(), p);
            }
        }
        this.mOrders.add(orderHistoryItem);
    }
    
    public void a(final Long mLastItemId) {
        this.mLastItemId = mLastItemId;
    }
}
