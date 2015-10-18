// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class Phonemetadata$PhoneMetadata implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private Phonemetadata$PhoneNumberDesc carrierSpecific_;
    private int countryCode_;
    private Phonemetadata$PhoneNumberDesc emergency_;
    private Phonemetadata$PhoneNumberDesc fixedLine_;
    private Phonemetadata$PhoneNumberDesc generalDesc_;
    private boolean hasCarrierSpecific;
    private boolean hasCountryCode;
    private boolean hasEmergency;
    private boolean hasFixedLine;
    private boolean hasGeneralDesc;
    private boolean hasId;
    private boolean hasInternationalPrefix;
    private boolean hasLeadingDigits;
    private boolean hasLeadingZeroPossible;
    private boolean hasMainCountryForCode;
    private boolean hasMobile;
    private boolean hasMobileNumberPortableRegion;
    private boolean hasNationalPrefix;
    private boolean hasNationalPrefixForParsing;
    private boolean hasNationalPrefixTransformRule;
    private boolean hasNoInternationalDialling;
    private boolean hasPager;
    private boolean hasPersonalNumber;
    private boolean hasPreferredExtnPrefix;
    private boolean hasPreferredInternationalPrefix;
    private boolean hasPremiumRate;
    private boolean hasSameMobileAndFixedLinePattern;
    private boolean hasSharedCost;
    private boolean hasShortCode;
    private boolean hasStandardRate;
    private boolean hasTollFree;
    private boolean hasUan;
    private boolean hasVoicemail;
    private boolean hasVoip;
    private String id_;
    private String internationalPrefix_;
    private List intlNumberFormat_;
    private String leadingDigits_;
    private boolean leadingZeroPossible_;
    private boolean mainCountryForCode_;
    private boolean mobileNumberPortableRegion_;
    private Phonemetadata$PhoneNumberDesc mobile_;
    private String nationalPrefixForParsing_;
    private String nationalPrefixTransformRule_;
    private String nationalPrefix_;
    private Phonemetadata$PhoneNumberDesc noInternationalDialling_;
    private List numberFormat_;
    private Phonemetadata$PhoneNumberDesc pager_;
    private Phonemetadata$PhoneNumberDesc personalNumber_;
    private String preferredExtnPrefix_;
    private String preferredInternationalPrefix_;
    private Phonemetadata$PhoneNumberDesc premiumRate_;
    private boolean sameMobileAndFixedLinePattern_;
    private Phonemetadata$PhoneNumberDesc sharedCost_;
    private Phonemetadata$PhoneNumberDesc shortCode_;
    private Phonemetadata$PhoneNumberDesc standardRate_;
    private Phonemetadata$PhoneNumberDesc tollFree_;
    private Phonemetadata$PhoneNumberDesc uan_;
    private Phonemetadata$PhoneNumberDesc voicemail_;
    private Phonemetadata$PhoneNumberDesc voip_;
    
    public Phonemetadata$PhoneMetadata() {
        this.generalDesc_ = null;
        this.fixedLine_ = null;
        this.mobile_ = null;
        this.tollFree_ = null;
        this.premiumRate_ = null;
        this.sharedCost_ = null;
        this.personalNumber_ = null;
        this.voip_ = null;
        this.pager_ = null;
        this.uan_ = null;
        this.emergency_ = null;
        this.voicemail_ = null;
        this.shortCode_ = null;
        this.standardRate_ = null;
        this.carrierSpecific_ = null;
        this.noInternationalDialling_ = null;
        this.id_ = "";
        this.countryCode_ = 0;
        this.internationalPrefix_ = "";
        this.preferredInternationalPrefix_ = "";
        this.nationalPrefix_ = "";
        this.preferredExtnPrefix_ = "";
        this.nationalPrefixForParsing_ = "";
        this.nationalPrefixTransformRule_ = "";
        this.sameMobileAndFixedLinePattern_ = false;
        this.numberFormat_ = new ArrayList();
        this.intlNumberFormat_ = new ArrayList();
        this.mainCountryForCode_ = false;
        this.leadingDigits_ = "";
        this.leadingZeroPossible_ = false;
        this.mobileNumberPortableRegion_ = false;
    }
    
    public Phonemetadata$PhoneMetadata a(final int countryCode_) {
        this.hasCountryCode = true;
        this.countryCode_ = countryCode_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata a(final Phonemetadata$PhoneNumberDesc generalDesc_) {
        if (generalDesc_ == null) {
            throw new NullPointerException();
        }
        this.hasGeneralDesc = true;
        this.generalDesc_ = generalDesc_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata a(final String id_) {
        this.hasId = true;
        this.id_ = id_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata a(final boolean sameMobileAndFixedLinePattern_) {
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = sameMobileAndFixedLinePattern_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc a() {
        return this.generalDesc_;
    }
    
    public Phonemetadata$PhoneMetadata b(final Phonemetadata$PhoneNumberDesc fixedLine_) {
        if (fixedLine_ == null) {
            throw new NullPointerException();
        }
        this.hasFixedLine = true;
        this.fixedLine_ = fixedLine_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata b(final String internationalPrefix_) {
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = internationalPrefix_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata b(final boolean mainCountryForCode_) {
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = mainCountryForCode_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc b() {
        return this.fixedLine_;
    }
    
    public Phonemetadata$PhoneMetadata c(final Phonemetadata$PhoneNumberDesc mobile_) {
        if (mobile_ == null) {
            throw new NullPointerException();
        }
        this.hasMobile = true;
        this.mobile_ = mobile_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata c(final String preferredInternationalPrefix_) {
        this.hasPreferredInternationalPrefix = true;
        this.preferredInternationalPrefix_ = preferredInternationalPrefix_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata c(final boolean leadingZeroPossible_) {
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = leadingZeroPossible_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc c() {
        return this.mobile_;
    }
    
    public Phonemetadata$PhoneMetadata d(final Phonemetadata$PhoneNumberDesc tollFree_) {
        if (tollFree_ == null) {
            throw new NullPointerException();
        }
        this.hasTollFree = true;
        this.tollFree_ = tollFree_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata d(final String nationalPrefix_) {
        this.hasNationalPrefix = true;
        this.nationalPrefix_ = nationalPrefix_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata d(final boolean mobileNumberPortableRegion_) {
        this.hasMobileNumberPortableRegion = true;
        this.mobileNumberPortableRegion_ = mobileNumberPortableRegion_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc d() {
        return this.tollFree_;
    }
    
    public Phonemetadata$PhoneMetadata e(final Phonemetadata$PhoneNumberDesc premiumRate_) {
        if (premiumRate_ == null) {
            throw new NullPointerException();
        }
        this.hasPremiumRate = true;
        this.premiumRate_ = premiumRate_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata e(final String preferredExtnPrefix_) {
        this.hasPreferredExtnPrefix = true;
        this.preferredExtnPrefix_ = preferredExtnPrefix_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc e() {
        return this.premiumRate_;
    }
    
    public Phonemetadata$PhoneMetadata f(final Phonemetadata$PhoneNumberDesc sharedCost_) {
        if (sharedCost_ == null) {
            throw new NullPointerException();
        }
        this.hasSharedCost = true;
        this.sharedCost_ = sharedCost_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata f(final String nationalPrefixForParsing_) {
        this.hasNationalPrefixForParsing = true;
        this.nationalPrefixForParsing_ = nationalPrefixForParsing_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc f() {
        return this.sharedCost_;
    }
    
    public Phonemetadata$PhoneMetadata g(final Phonemetadata$PhoneNumberDesc personalNumber_) {
        if (personalNumber_ == null) {
            throw new NullPointerException();
        }
        this.hasPersonalNumber = true;
        this.personalNumber_ = personalNumber_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata g(final String nationalPrefixTransformRule_) {
        this.hasNationalPrefixTransformRule = true;
        this.nationalPrefixTransformRule_ = nationalPrefixTransformRule_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc g() {
        return this.personalNumber_;
    }
    
    public Phonemetadata$PhoneMetadata h(final Phonemetadata$PhoneNumberDesc voip_) {
        if (voip_ == null) {
            throw new NullPointerException();
        }
        this.hasVoip = true;
        this.voip_ = voip_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata h(final String leadingDigits_) {
        this.hasLeadingDigits = true;
        this.leadingDigits_ = leadingDigits_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc h() {
        return this.voip_;
    }
    
    public Phonemetadata$PhoneMetadata i(final Phonemetadata$PhoneNumberDesc pager_) {
        if (pager_ == null) {
            throw new NullPointerException();
        }
        this.hasPager = true;
        this.pager_ = pager_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc i() {
        return this.pager_;
    }
    
    public Phonemetadata$PhoneMetadata j(final Phonemetadata$PhoneNumberDesc uan_) {
        if (uan_ == null) {
            throw new NullPointerException();
        }
        this.hasUan = true;
        this.uan_ = uan_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc j() {
        return this.uan_;
    }
    
    public Phonemetadata$PhoneMetadata k(final Phonemetadata$PhoneNumberDesc emergency_) {
        if (emergency_ == null) {
            throw new NullPointerException();
        }
        this.hasEmergency = true;
        this.emergency_ = emergency_;
        return this;
    }
    
    public Phonemetadata$PhoneNumberDesc k() {
        return this.voicemail_;
    }
    
    public int l() {
        return this.countryCode_;
    }
    
    public Phonemetadata$PhoneMetadata l(final Phonemetadata$PhoneNumberDesc voicemail_) {
        if (voicemail_ == null) {
            throw new NullPointerException();
        }
        this.hasVoicemail = true;
        this.voicemail_ = voicemail_;
        return this;
    }
    
    public Phonemetadata$PhoneMetadata m(final Phonemetadata$PhoneNumberDesc shortCode_) {
        if (shortCode_ == null) {
            throw new NullPointerException();
        }
        this.hasShortCode = true;
        this.shortCode_ = shortCode_;
        return this;
    }
    
    public String m() {
        return this.internationalPrefix_;
    }
    
    public Phonemetadata$PhoneMetadata n(final Phonemetadata$PhoneNumberDesc standardRate_) {
        if (standardRate_ == null) {
            throw new NullPointerException();
        }
        this.hasStandardRate = true;
        this.standardRate_ = standardRate_;
        return this;
    }
    
    public boolean n() {
        return this.hasNationalPrefix;
    }
    
    public Phonemetadata$PhoneMetadata o(final Phonemetadata$PhoneNumberDesc carrierSpecific_) {
        if (carrierSpecific_ == null) {
            throw new NullPointerException();
        }
        this.hasCarrierSpecific = true;
        this.carrierSpecific_ = carrierSpecific_;
        return this;
    }
    
    public boolean o() {
        return this.hasPreferredExtnPrefix;
    }
    
    public Phonemetadata$PhoneMetadata p(final Phonemetadata$PhoneNumberDesc noInternationalDialling_) {
        if (noInternationalDialling_ == null) {
            throw new NullPointerException();
        }
        this.hasNoInternationalDialling = true;
        this.noInternationalDialling_ = noInternationalDialling_;
        return this;
    }
    
    public String p() {
        return this.preferredExtnPrefix_;
    }
    
    public boolean q() {
        return this.hasNationalPrefixForParsing;
    }
    
    public String r() {
        return this.nationalPrefixForParsing_;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        int i = 0;
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.a(phonemetadata$PhoneNumberDesc);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.b(phonemetadata$PhoneNumberDesc2);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.c(phonemetadata$PhoneNumberDesc3);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.d(phonemetadata$PhoneNumberDesc4);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.e(phonemetadata$PhoneNumberDesc5);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.f(phonemetadata$PhoneNumberDesc6);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.g(phonemetadata$PhoneNumberDesc7);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.h(phonemetadata$PhoneNumberDesc8);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.i(phonemetadata$PhoneNumberDesc9);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.j(phonemetadata$PhoneNumberDesc10);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.k(phonemetadata$PhoneNumberDesc11);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.l(phonemetadata$PhoneNumberDesc12);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.m(phonemetadata$PhoneNumberDesc13);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.n(phonemetadata$PhoneNumberDesc14);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.o(phonemetadata$PhoneNumberDesc15);
        }
        if (objectInput.readBoolean()) {
            final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.p(phonemetadata$PhoneNumberDesc16);
        }
        this.a(objectInput.readUTF());
        this.a(objectInput.readInt());
        this.b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            this.c(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.d(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.e(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.f(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.g(objectInput.readUTF());
        }
        this.a(objectInput.readBoolean());
        for (int int1 = objectInput.readInt(), j = 0; j < int1; ++j) {
            final Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.numberFormat_.add(phonemetadata$NumberFormat);
        }
        while (i < objectInput.readInt()) {
            final Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.intlNumberFormat_.add(phonemetadata$NumberFormat2);
            ++i;
        }
        this.b(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            this.h(objectInput.readUTF());
        }
        this.c(objectInput.readBoolean());
        this.d(objectInput.readBoolean());
    }
    
    public String s() {
        return this.nationalPrefixTransformRule_;
    }
    
    public boolean t() {
        return this.sameMobileAndFixedLinePattern_;
    }
    
    public List u() {
        return this.numberFormat_;
    }
    
    public int v() {
        return this.numberFormat_.size();
    }
    
    public List w() {
        return this.intlNumberFormat_;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        int i = 0;
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasShortCode);
        if (this.hasShortCode) {
            this.shortCode_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasStandardRate);
        if (this.hasStandardRate) {
            this.standardRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasCarrierSpecific);
        if (this.hasCarrierSpecific) {
            this.carrierSpecific_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        final int v = this.v();
        objectOutput.writeInt(v);
        for (int j = 0; j < v; ++j) {
            ((Phonemetadata$NumberFormat)this.numberFormat_.get(j)).writeExternal(objectOutput);
        }
        final int x = this.x();
        objectOutput.writeInt(x);
        while (i < x) {
            ((Phonemetadata$NumberFormat)this.intlNumberFormat_.get(i)).writeExternal(objectOutput);
            ++i;
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
        objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
    }
    
    public int x() {
        return this.intlNumberFormat_.size();
    }
    
    public boolean y() {
        return this.hasLeadingDigits;
    }
    
    public String z() {
        return this.leadingDigits_;
    }
}
