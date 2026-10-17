
class Solution {
    public int dayOfYear(String date) {
        int daysArr[] = {31, 28, 31, 30, 31, 30,
                         31, 31, 30, 31, 30, 31};

        int months = 0;
        int days = 0;
        int years = 0;

        for (int i = 0; i < date.length(); i++) {
            char ch = date.charAt(i);

            if (i <= 3) {
                years = years * 10 + (ch - '0');
            } else if (i >= 5 && i <= 6) {
                months = months * 10 + (ch - '0');
            } else if (i >= 8 && i <= 9) {
                days = days * 10 + (ch - '0');
            }
        }

        int result = 0;
        int trackMonths = 0;

        if (years % 400 == 0 ||
            (years % 4 == 0 && years % 100 != 0)) {
            daysArr[1] = 29;
        }

        while (trackMonths < months - 1) {
            result += daysArr[trackMonths];
            trackMonths++;
        }

        return result + days;
    }
}
