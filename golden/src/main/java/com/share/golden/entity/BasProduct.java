package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BasProduct {
    private String productId;

    private BigDecimal productMoney;

    private String productIncome;

    private Date productTime;

    private String productType;

    private String productWay;

    private Date pcount;

    private String productProgress;

    private String productSaveway;

    private String productRateben;

    private Date productPublishTime;

    private String productName;

    private BigDecimal productTotalMoney;

    private String investmentScope;

    private String useOfProceeds;

    private String productState;

    private String productPicture;

    private String produceId;

    private String productDesc;

    private String productSafe;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }

    public String getProductIncome() {
        return productIncome;
    }

    public void setProductIncome(String productIncome) {
        this.productIncome = productIncome == null ? null : productIncome.trim();
    }

    public Date getProductTime() {
        return productTime;
    }

    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductWay() {
        return productWay;
    }

    public void setProductWay(String productWay) {
        this.productWay = productWay == null ? null : productWay.trim();
    }

    public Date getPcount() {
        return pcount;
    }

    public void setPcount(Date pcount) {
        this.pcount = pcount;
    }

    public String getProductProgress() {
        return productProgress;
    }

    public void setProductProgress(String productProgress) {
        this.productProgress = productProgress == null ? null : productProgress.trim();
    }

    public String getProductSaveway() {
        return productSaveway;
    }

    public void setProductSaveway(String productSaveway) {
        this.productSaveway = productSaveway == null ? null : productSaveway.trim();
    }

    public String getProductRateben() {
        return productRateben;
    }

    public void setProductRateben(String productRateben) {
        this.productRateben = productRateben == null ? null : productRateben.trim();
    }

    public Date getProductPublishTime() {
        return productPublishTime;
    }

    public void setProductPublishTime(Date productPublishTime) {
        this.productPublishTime = productPublishTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductTotalMoney() {
        return productTotalMoney;
    }

    public void setProductTotalMoney(BigDecimal productTotalMoney) {
        this.productTotalMoney = productTotalMoney;
    }

    public String getInvestmentScope() {
        return investmentScope;
    }

    public void setInvestmentScope(String investmentScope) {
        this.investmentScope = investmentScope == null ? null : investmentScope.trim();
    }

    public String getUseOfProceeds() {
        return useOfProceeds;
    }

    public void setUseOfProceeds(String useOfProceeds) {
        this.useOfProceeds = useOfProceeds == null ? null : useOfProceeds.trim();
    }

    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState == null ? null : productState.trim();
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture == null ? null : productPicture.trim();
    }

    public String getProduceId() {
        return produceId;
    }

    public void setProduceId(String produceId) {
        this.produceId = produceId == null ? null : produceId.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getProductSafe() {
        return productSafe;
    }

    public void setProductSafe(String productSafe) {
        this.productSafe = productSafe == null ? null : productSafe.trim();
    }
}