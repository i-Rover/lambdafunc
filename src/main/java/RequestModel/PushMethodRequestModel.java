package RequestModel;

public class PushMethodRequestModel {
    public String serialNumber;
    public String bidOption;
    public String otcOption;
    public String stbOption;
    public String productCode;
    public String purchaseType;
    public String clientName;
    public String currency;
    public String bidValue;
    public String valueDate;
    public String tenor;
    public String otcCounterParty;
    public String otcMurabaha;
    public String otcMurabahaValue;
    public String ecertNo;
    public String bidErrNo;
    public String bidMsg;
    public String otcErrNo;
    public String otcMsg;
    public String stcErrNo;
    public String stcMsg;
    public String regTime;
    public String orderTime;
    public String resultTime;
    public String purchaseTime;
    public String reportTime;
    public String sellingTime;
    public String unit;
    public String price;

    public PushMethodRequestModel(String stbOption, String serialNumber, String bidOption, String otcOption, String productCode, String purchaseType, String clientName, String currency, String bidValue, String valueDate, String tenor, String otcCounterParty, String otcMurabaha, String otcMurabahaValue, String ecertNo, String bidErrNo, String bidMsg, String otcErrNo, String otcMsg, String stcErrNo, String stcMsg, String regTime, String orderTime, String resultTime, String purchaseTime, String reportTime, String sellingTime, String unit, String price) {
        this.stbOption = stbOption;
        this.serialNumber = serialNumber;
        this.bidOption = bidOption;
        this.otcOption = otcOption;
        this.productCode = productCode;
        this.purchaseType = purchaseType;
        this.clientName = clientName;
        this.currency = currency;
        this.bidValue = bidValue;
        this.valueDate = valueDate;
        this.tenor = tenor;
        this.otcCounterParty = otcCounterParty;
        this.otcMurabaha = otcMurabaha;
        this.otcMurabahaValue = otcMurabahaValue;
        this.ecertNo = ecertNo;
        this.bidErrNo = bidErrNo;
        this.bidMsg = bidMsg;
        this.otcErrNo = otcErrNo;
        this.otcMsg = otcMsg;
        this.stcErrNo = stcErrNo;
        this.stcMsg = stcMsg;
        this.regTime = regTime;
        this.orderTime = orderTime;
        this.resultTime = resultTime;
        this.purchaseTime = purchaseTime;
        this.reportTime = reportTime;
        this.sellingTime = sellingTime;
        this.unit = unit;
        this.price = price;
    }

    public String getStbOption() {
        return stbOption;
    }

    public void setStbOption(String stbOption) {
        this.stbOption = stbOption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBidOption() {
        return bidOption;
    }

    public void setBidOption(String bidOption) {
        this.bidOption = bidOption;
    }

    public String getOtcOption() {
        return otcOption;
    }

    public void setOtcOption(String otcOption) {
        this.otcOption = otcOption;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBidValue() {
        return bidValue;
    }

    public void setBidValue(String bidValue) {
        this.bidValue = bidValue;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getOtcCounterParty() {
        return otcCounterParty;
    }

    public void setOtcCounterParty(String otcCounterParty) {
        this.otcCounterParty = otcCounterParty;
    }

    public String getOtcMurabaha() {
        return otcMurabaha;
    }

    public void setOtcMurabaha(String otcMurabaha) {
        this.otcMurabaha = otcMurabaha;
    }

    public String getOtcMurabahaValue() {
        return otcMurabahaValue;
    }

    public void setOtcMurabahaValue(String otcMurabahaValue) {
        this.otcMurabahaValue = otcMurabahaValue;
    }

    public String getEcertNo() {
        return ecertNo;
    }

    public void setEcertNo(String ecertNo) {
        this.ecertNo = ecertNo;
    }

    public String getBidErrNo() {
        return bidErrNo;
    }

    public void setBidErrNo(String bidErrNo) {
        this.bidErrNo = bidErrNo;
    }

    public String getBidMsg() {
        return bidMsg;
    }

    public void setBidMsg(String bidMsg) {
        this.bidMsg = bidMsg;
    }

    public String getOtcErrNo() {
        return otcErrNo;
    }

    public void setOtcErrNo(String otcErrNo) {
        this.otcErrNo = otcErrNo;
    }

    public String getOtcMsg() {
        return otcMsg;
    }

    public void setOtcMsg(String otcMsg) {
        this.otcMsg = otcMsg;
    }

    public String getStcErrNo() {
        return stcErrNo;
    }

    public void setStcErrNo(String stcErrNo) {
        this.stcErrNo = stcErrNo;
    }

    public String getStcMsg() {
        return stcMsg;
    }

    public void setStcMsg(String stcMsg) {
        this.stcMsg = stcMsg;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getSellingTime() {
        return sellingTime;
    }

    public void setSellingTime(String sellingTime) {
        this.sellingTime = sellingTime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
