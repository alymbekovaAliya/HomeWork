package OOP.Candidate;

public class Candidate {
   public String name;
   public int age;
   public int height;
   public boolean hasTattooOrScars;
   public Level levelOfEnglish;
   public boolean education;

   public Candidate(String name,int age,int height,boolean hasTattooOrScars,Level levelOfEnglish,boolean education ) {
       this.name = name;
       this.age = age;
       this.height = height;
       this.hasTattooOrScars = hasTattooOrScars;
       this.levelOfEnglish = levelOfEnglish;
       this.education = education;
   }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hasTattooOrScars=" + hasTattooOrScars +
                ", levelOfEnglish='" + levelOfEnglish + '\'' +
                ", education=" + education +
                '}';
    }
}
