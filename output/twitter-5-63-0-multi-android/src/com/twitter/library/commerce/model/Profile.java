// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Profile implements Serializable
{
    private ArrayList mCreditCards;
    private ArrayList mEmails;
    private ArrayList mPartialCreditCards;
    private CreditCard mPrimaryCreditCard;
    private Email mPrimaryEmail;
    private Address mPrimaryShippingAddress;
    private ArrayList mShippingAddress;
    
    public Profile() {
        this.mCreditCards = new ArrayList();
        this.mPartialCreditCards = new ArrayList();
        this.mShippingAddress = new ArrayList();
        this.mEmails = new ArrayList();
    }
    
    public CreditCard a() {
        if (this.mPrimaryCreditCard != null) {
            return this.mPrimaryCreditCard;
        }
        if (this.mCreditCards.size() > 0) {
            return this.mCreditCards.get(0);
        }
        return null;
    }
    
    public List a(final CreditCard creditCard) {
        final List c = creditCard.c();
        if (c.size() == 0) {
            this.mCreditCards.add(creditCard);
        }
        return c;
    }
    
    public List a(final Email email) {
        final List c = email.c();
        if (c.size() == 0) {
            this.mEmails.add(email);
        }
        return c;
    }
    
    public void a(final Address mPrimaryShippingAddress) {
        this.mPrimaryShippingAddress = mPrimaryShippingAddress;
    }
    
    public CreditCard[] a(final List list) {
        int i = 0;
        final ArrayList<CreditCard> list2 = new ArrayList<CreditCard>();
        for (final CreditCard creditCard : this.d()) {
            if (creditCard.n() && CreditCard.a(creditCard, list)) {
                list2.add(creditCard);
            }
        }
        for (CreditCard[] e = this.e(); i < e.length; ++i) {
            final CreditCard creditCard2 = e[i];
            if (creditCard2.n() && CreditCard.a(creditCard2, list)) {
                list2.add(creditCard2);
            }
        }
        return list2.toArray(new CreditCard[list2.size()]);
    }
    
    public CreditCard b() {
        for (final CreditCard creditCard : this.mPartialCreditCards) {
            if (creditCard.m()) {
                return creditCard;
            }
        }
        return null;
    }
    
    public List b(final Address address) {
        final List a = address.a();
        if (a.size() == 0) {
            this.mShippingAddress.add(address);
        }
        return a;
    }
    
    public List b(final CreditCard creditCard) {
        this.mPartialCreditCards.add(creditCard);
        return null;
    }
    
    public void b(final Email mPrimaryEmail) {
        this.mPrimaryEmail = mPrimaryEmail;
    }
    
    public Email c() {
        if (this.mPrimaryEmail != null) {
            return this.mPrimaryEmail;
        }
        if (this.mEmails.size() > 0) {
            return this.mEmails.get(0);
        }
        return null;
    }
    
    public void c(final CreditCard mPrimaryCreditCard) {
        this.mPrimaryCreditCard = mPrimaryCreditCard;
    }
    
    public CreditCard[] d() {
        return this.mCreditCards.toArray(new CreditCard[0]);
    }
    
    public CreditCard[] e() {
        return this.mPartialCreditCards.toArray(new CreditCard[0]);
    }
    
    public CreditCard[] f() {
        return this.a((List)null);
    }
    
    public Address[] g() {
        return this.mShippingAddress.toArray(new Address[0]);
    }
}
