package Challenges;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String timeConversion(String s) {

        String hasil = "OKE";
//        String[] array = s.split("");
        String time = s.substring(8);
        int jam = Integer.parseInt(s.substring(0, 2));
        if (time.equals("PM")) {
            if (jam < 12)
                jam += 12;
            hasil = String.format("%02d", jam) + s.substring(2, 8);
        } else {
            if (jam == 12) {
                jam = 0;
                hasil = String.format("%02d", jam) + s.substring(2, 8);
            } else {
                hasil = s.substring(0, 8);
            }
        }

        return hasil;

    }

}
