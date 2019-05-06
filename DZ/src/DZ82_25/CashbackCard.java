package DZ82_25;

class CashbackCard extends Card implements CashBackable {


    @Override
    public void cashback() {

    }
    public CashbackCard(String name) {
        super(name);
    }

    public void plugIn() {
        int summ = 4000;
        int back = summ*3/100;
        System.out.println(this + "Cashback=" + back);
    }
}