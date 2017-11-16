package hu.uni.miskolc.iit.sweng.hotelReservation.model;

import java.math.BigDecimal;
import java.util.Currency;




/**
 *
 * @author Basil Kaikoni
 * @version 1.0
 *@since  9-Nov -2017
 * class store mony amount and currency type
 */

public class Price {

    /**
     * Currency used for the price
     */
    private Currency currency ;
    /**
     * amount of money
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

    /**
     * amount of money
     * @param amount
     */
    public Price(BigDecimal amount) {
        this.amount = amount;
        this.currencyType=CurrencyType.HUF;
        currency=Currency.getInstance("HUF");

    }

    /**
     * get currency object
     * @return
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * return Money value
     * @return
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * return currency type
     * @return
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }


    /**
     * set money amount
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * set currency type
     * @param currencyType
     */
    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
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


}
