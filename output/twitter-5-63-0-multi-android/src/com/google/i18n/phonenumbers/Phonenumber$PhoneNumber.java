// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.Serializable;

public class Phonenumber$PhoneNumber implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Phonenumber$PhoneNumber$CountryCodeSource countryCodeSource_;
    private int countryCode_;
    private String extension_;
    private boolean hasCountryCode;
    private boolean hasCountryCodeSource;
    private boolean hasExtension;
    private boolean hasItalianLeadingZero;
    private boolean hasNationalNumber;
    private boolean hasNumberOfLeadingZeros;
    private boolean hasPreferredDomesticCarrierCode;
    private boolean hasRawInput;
    private boolean italianLeadingZero_;
    private long nationalNumber_;
    private int numberOfLeadingZeros_;
    private String preferredDomesticCarrierCode_;
    private String rawInput_;
    
    public Phonenumber$PhoneNumber() {
        this.countryCode_ = 0;
        this.nationalNumber_ = 0L;
        this.extension_ = "";
        this.italianLeadingZero_ = false;
        this.numberOfLeadingZeros_ = 1;
        this.rawInput_ = "";
        this.preferredDomesticCarrierCode_ = "";
        this.countryCodeSource_ = Phonenumber$PhoneNumber$CountryCodeSource.a;
    }
    
    public int a() {
        return this.countryCode_;
    }
    
    public Phonenumber$PhoneNumber a(final int countryCode_) {
        this.hasCountryCode = true;
        this.countryCode_ = countryCode_;
        return this;
    }
    
    public Phonenumber$PhoneNumber a(final long nationalNumber_) {
        this.hasNationalNumber = true;
        this.nationalNumber_ = nationalNumber_;
        return this;
    }
    
    public Phonenumber$PhoneNumber a(final Phonenumber$PhoneNumber$CountryCodeSource countryCodeSource_) {
        if (countryCodeSource_ == null) {
            throw new NullPointerException();
        }
        this.hasCountryCodeSource = true;
        this.countryCodeSource_ = countryCodeSource_;
        return this;
    }
    
    public Phonenumber$PhoneNumber a(final String extension_) {
        if (extension_ == null) {
            throw new NullPointerException();
        }
        this.hasExtension = true;
        this.extension_ = extension_;
        return this;
    }
    
    public Phonenumber$PhoneNumber a(final boolean italianLeadingZero_) {
        this.hasItalianLeadingZero = true;
        this.italianLeadingZero_ = italianLeadingZero_;
        return this;
    }
    
    public boolean a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        boolean b = true;
        if (phonenumber$PhoneNumber == null) {
            b = false;
        }
        else if (this != phonenumber$PhoneNumber && (this.countryCode_ != phonenumber$PhoneNumber.countryCode_ || this.nationalNumber_ != phonenumber$PhoneNumber.nationalNumber_ || !this.extension_.equals(phonenumber$PhoneNumber.extension_) || this.italianLeadingZero_ != phonenumber$PhoneNumber.italianLeadingZero_ || this.numberOfLeadingZeros_ != phonenumber$PhoneNumber.numberOfLeadingZeros_ || !this.rawInput_.equals(phonenumber$PhoneNumber.rawInput_) || this.countryCodeSource_ != phonenumber$PhoneNumber.countryCodeSource_ || !this.preferredDomesticCarrierCode_.equals(phonenumber$PhoneNumber.preferredDomesticCarrierCode_) || this.n() != phonenumber$PhoneNumber.n())) {
            return false;
        }
        return b;
    }
    
    public long b() {
        return this.nationalNumber_;
    }
    
    public Phonenumber$PhoneNumber b(final int numberOfLeadingZeros_) {
        this.hasNumberOfLeadingZeros = true;
        this.numberOfLeadingZeros_ = numberOfLeadingZeros_;
        return this;
    }
    
    public Phonenumber$PhoneNumber b(final String rawInput_) {
        if (rawInput_ == null) {
            throw new NullPointerException();
        }
        this.hasRawInput = true;
        this.rawInput_ = rawInput_;
        return this;
    }
    
    public Phonenumber$PhoneNumber c(final String preferredDomesticCarrierCode_) {
        if (preferredDomesticCarrierCode_ == null) {
            throw new NullPointerException();
        }
        this.hasPreferredDomesticCarrierCode = true;
        this.preferredDomesticCarrierCode_ = preferredDomesticCarrierCode_;
        return this;
    }
    
    public boolean c() {
        return this.hasExtension;
    }
    
    public String d() {
        return this.extension_;
    }
    
    public boolean e() {
        return this.hasItalianLeadingZero;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Phonenumber$PhoneNumber && this.a((Phonenumber$PhoneNumber)o);
    }
    
    public boolean f() {
        return this.italianLeadingZero_;
    }
    
    public boolean g() {
        return this.hasNumberOfLeadingZeros;
    }
    
    public int h() {
        return this.numberOfLeadingZeros_;
    }
    
    @Override
    public int hashCode() {
        int n = 1231;
        final int n2 = 53 * (53 * (53 * (2173 + this.a()) + Long.valueOf(this.b()).hashCode()) + this.d().hashCode());
        int n3;
        if (this.f()) {
            n3 = n;
        }
        else {
            n3 = 1237;
        }
        final int n4 = 53 * (53 * (53 * (53 * (53 * (n3 + n2) + this.h()) + this.j().hashCode()) + this.l().hashCode()) + this.o().hashCode());
        if (!this.n()) {
            n = 1237;
        }
        return n4 + n;
    }
    
    public boolean i() {
        return this.hasRawInput;
    }
    
    public String j() {
        return this.rawInput_;
    }
    
    public boolean k() {
        return this.hasCountryCodeSource;
    }
    
    public Phonenumber$PhoneNumber$CountryCodeSource l() {
        return this.countryCodeSource_;
    }
    
    public Phonenumber$PhoneNumber m() {
        this.hasCountryCodeSource = false;
        this.countryCodeSource_ = Phonenumber$PhoneNumber$CountryCodeSource.a;
        return this;
    }
    
    public boolean n() {
        return this.hasPreferredDomesticCarrierCode;
    }
    
    public String o() {
        return this.preferredDomesticCarrierCode_;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ").append(this.countryCode_);
        sb.append(" National Number: ").append(this.nationalNumber_);
        if (this.e() && this.f()) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.g()) {
            sb.append(" Number of leading zeros: ").append(this.numberOfLeadingZeros_);
        }
        if (this.c()) {
            sb.append(" Extension: ").append(this.extension_);
        }
        if (this.k()) {
            sb.append(" Country Code Source: ").append(this.countryCodeSource_);
        }
        if (this.n()) {
            sb.append(" Preferred Domestic Carrier Code: ").append(this.preferredDomesticCarrierCode_);
        }
        return sb.toString();
    }
}
