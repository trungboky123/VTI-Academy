package Assignment_Lesson_5.Exercise4;

public class Question1 {
    public class Student{
        private int id;
        private String name;
        private String hometown;
        private double score;

        public Student(String name, String hometown){
            this.name = name;
            this.hometown = hometown;
            this.score = 0;
        }

        public void setScore(double score){
            this.score = score;
        }

        public void addMoreScore(double scoreAdded){
            this.score += scoreAdded;
        }

        public void printInfo(){
            String rating = "";
            if(score < 4.0){
                rating = "Weak";
            }
            else if(score < 6.0){
                rating = "Average";
            }
            else if(score < 8.0){
                rating = "Good";
            }
            else{
                rating = "Very good";
            }
            System.out.println("Name: " + name);
            System.out.println("Score: " + score);
            System.out.println("Rating: " + rating);
        }
    }
}
