class Bank {
    void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI : 7%");
    }
}

class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC: 7.5%");
    }
}

class BOI extends Bank {
    @Override
    void interestRate() {
        System.out.println("BOI: 6.8%");
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new BOI();
        b.interestRate();
    }
}
