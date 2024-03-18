class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest() + "%");
    }
}
