package Challenges;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rr = gradingStudents(new int[] {84,94,0,53,61,73,67,38,33});
		for (int i = 0; i < rr.length; i++) {
			System.out.println(rr[i]);
		}

	}
	
	static int[] gradingStudents(int[] grades) {
        int[] r = new int[grades.length];
        for(int i=0; i<grades.length; i++){            
            if(grades[i]>35){
                int a = (grades[i]/5)+1;
                int n = a*5;
                if(n > grades[i] && n-grades[i] < 3){
                	r[i]=n;
                }else if(n > grades[i] && n-grades[i] >= 3){
                	r[i]=grades[i];
                }
                
            }else{
                r[i]=grades[i];
            }
        }
        return r;

    }
}
