class Bank {
    int getROI() {
        return 0;
    }
}

class SBI extends Bank {
    int getROI() {
        return 8;
    }
}

class ICICI extends Bank {
    int getROI() {
        return 7;
    }
}

class Axis extends Bank {
    int getROI() {
        return 9;
    }
}

class NewMethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI rate of interest=" + s.getROI());
        System.out.println("ICICI rate of interest=" + i.getROI());
        System.out.println("Axis rate of interest=" + a.getROI());
        Bank b = new ICICI();
        System.out.println("Example of Base class can hold the object of any child class=" + b.getROI());
        /*
         * Reference of Base class can hold the object of any child class.But vice-versa
         * as shown below is
         * not possible.
         **/
        /*
         * ICICI i1=new Bank ();
         * System.out.println("ROI:"+i1.getROI());
         */
        // Here i1 is reference of ICICI bank but it is trying to hold object of base
        // classwhich
        // is not allowed.
    }
}
