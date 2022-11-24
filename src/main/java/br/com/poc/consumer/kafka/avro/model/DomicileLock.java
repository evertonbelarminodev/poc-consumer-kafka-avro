package br.com.poc.consumer.kafka.avro.model;

public class DomicileLock {

    private String id;
    private Integer changeType;
    private Long changeDate;
    private String paymentAccount;
    private String accountType;
    private String creditCardBrand;
    private String transactionType;
    private Integer codAgency;
    private Integer codAccount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Long getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Long changeDate) {
        this.changeDate = changeDate;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCreditCardBrand() {
        return creditCardBrand;
    }

    public void setCreditCardBrand(String creditCardBrand) {
        this.creditCardBrand = creditCardBrand;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getCodAgency() {
        return codAgency;
    }

    public void setCodAgency(Integer codAgency) {
        this.codAgency = codAgency;
    }

    public Integer getCodAccount() {
        return codAccount;
    }

    public void setCodAccount(Integer codAccount) {
        this.codAccount = codAccount;
    }
}