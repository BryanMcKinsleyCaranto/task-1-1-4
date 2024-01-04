public class task_1_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
    int score = 100;
    String grade;
    if(score <= 100 && score >= 90){
      grade = "A";
      System.out.println(grade);
    }else if(score <= 89 && score >= 80){
      grade = "B";
      System.out.println(grade);
    }else if(score <= 79 && score >= 70){
      grade = "C";
      System.out.println(grade);
    }else if(score <= 69 && score >= 60){
      grade = "D";
      System.out.println(grade);
    }else if(score <60){
      grade = "F";
      System.out.println(grade);
    }else{
      System.out.println("Grade Invalid");
    }
    
        
  }
}
    
    

