public class quest6_8 {
        public static void main(String[] args) {
            int marks[]={95,65,78,45,35,85,55,20,100,60}; // example list of marks
            int rangeCounts[] = new int[4]; 
    
            for (int mark : marks) {
                if (mark>=0 && mark<=100) { 
                    rangeCounts[3]++; 
                    if (mark>=41) { 
                        rangeCounts[2]++; 
                        if (mark>=61) { 
                            rangeCounts[1]++; 
                            if (mark>=81) { 
                                rangeCounts[0]++; 
                            }
                        }
                    }
                }
            }
    
            // printing the values
            System.out.println("Number of students who have obtained marks:");
            System.out.println(" - in the range 81 to 100: " + rangeCounts[0]);
            System.out.println(" - in the range 61 to 80: " + rangeCounts[1]);
            System.out.println(" - in the range 41 to 60: " + rangeCounts[2]);
            System.out.println(" - in the range 0 to 40: " + rangeCounts[3]);
        }
    
}