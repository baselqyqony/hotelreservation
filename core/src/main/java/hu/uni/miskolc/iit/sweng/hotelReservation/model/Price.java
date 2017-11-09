package hu.uni.miskolc.iit.sweng.hotelReservation.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;



/**
 *
 * @author Basil Kaikoni
 * @version 1.0
 *
 */

public class Price {

    /**
     * Currency used for the price
     */
    private Currency currency ;
    /**
     * amoount of money
     */
    private BigDecimal amount;

    /**
     * type of currency
     *
     */
    private CurrencyType  currencyType;

    /**
     * price class constructor
     * @param amount amount of money
     * @param currencyType type of used currency
     */
    public Price(BigDecimal amount,CurrencyType currencyType) {
        this.amount = amount;
        this.currencyType=currencyType;

        switch (currencyType) {

            case HUF: currency=Currency.getInstance("HUF");
                break;
            case USD:currency=Currency.getInstance("USD");
                break;
            case SYP:currency=Currency.getInstance("SYP");
                break;
            case EUR:currency=Currency.getInstance("EUR");
                break;
                default:currency=Currency.getInstance("EUR");
        }

    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }


}
