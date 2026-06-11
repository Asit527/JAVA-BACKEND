package com.kodewala.abstraction1;

interface Checking {
    void setPhoneNumber(long number);
    void setPhoneNumber(String number);
}

public class MobileNumCheck implements Checking {

    // Version 1: long input
    public void setPhoneNumber(long number) {
        long absNum = Math.abs(number);

        int length = (absNum == 0) ? 1 : (int) Math.log10(absNum) + 1;

        if (length == 10) {
            System.out.println("Valid phone number: " + number);
        } else {
            System.out.println("Out of Range");
        }
    }

    // Version 2: String input
    public void setPhoneNumber(String number) {
        if (number == null) {
            System.out.println("Out of Range");
            return;
        }

        // remove spaces and dashes
        String cleaned = number.replace(" ", "").replace("-", "");

        if (cleaned.length() == 10 && cleaned.matches("\\d+")) {
            System.out.println("Valid phone number: " + cleaned);
        } else {
            System.out.println("Out of Range");
        }
    }

    public static void main(String[] args) {
        Checking obj = new MobileNumCheck();

        obj.setPhoneNumber(7609035868L);      // valid
        obj.setPhoneNumber(12345L);           // out of range
        obj.setPhoneNumber("760-903-5868");   // valid
        obj.setPhoneNumber("76 0903 586");    // out of range
    }
}
				//imp
