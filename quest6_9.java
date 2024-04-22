public class quest6_9 {
        public static void main(String[] args) {
            int math[]={70,58,45,65,85}; 
            int phys[]={77,90,73,41,85}; 
            int chem[]={70,55,65,45,80}; 
    
            System.out.println("Eligible candidates:");
            for (int i=0;i<math.length;i++){
                int totalMarks=math[i]+phys[i];
                int totalInThree=math[i]+phys[i]+chem[i];
                if (math[i]>=60 && phys[i]>=50 && chem[i]>=40 &&
                        (totalInThree>=200 || totalMarks>=150)) {
                    System.out.println((i+1) + ". Candidate with math:" + math[i] +
                            " phys:" + phys[i] + " chem:" + chem[i]);
                }
            }
        }
    
}