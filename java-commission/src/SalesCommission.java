public class SalesCommission {
    private double sales, rate, commission, advance, pay;

    public SalesCommission(double s, double a) {
        sales = s;
        advance = a;
        calculatePay();
    }

    private void calculatePay() {
        setRate();
        commission = sales * rate;
        pay = commission - advance;
    }

    private void setRate() {
        if (sales < 10000)
            rate = 0.05;
        else if (sales < 15000)
            rate = 0.10;
        else if (sales < 18000)
            rate = 0.12;
        else if (sales < 22000)
            rate = 0.14;
        else
            rate = 0.16;
    }

    public double getPay() {
        return pay;
    }

    public double getCommision() {
        return commission;
    }

    public double getRate() {
        return rate;
    }

    public double getAdvance() {
        return advance;
    }

    public double getSales() {
        return sales;
    }

}
