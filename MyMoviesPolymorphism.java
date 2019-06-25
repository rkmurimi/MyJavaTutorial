// my first java code
// R.K.M -- May, 30, 2019
// movie.java
// ***************
// Polymorphism demo

class Movie{
    private String name; // Constructor to initialize the object of the class

    // Setter function
    public Movie(String name){
            this.name = name;
    }
    // setter to be used as default
    public String plot(){
        return ". . . No plot here . . .";
    }
    //getter
    public String getName(){
        return name;

    }
}

class Godfather extends Movie{

    public Godfather(){
        super("The Godfather");
    }
    @Override
    public String plot(){
        return "The reign of Mafia family from Sicily";
    }
}
class Titanic extends Movie{

    public Titanic(){
        super("Titanic");
    }
     @Override
    public String plot(){
        return "Love knows no boundary";
    }
}

class AfewGoodMen extends Movie{

    public AfewGoodMen(){
        super("A few good men");
    }
     @Override
    public String plot(){
        return "Though heavens fall, let justice be done";
    }
}
class Firm extends Movie{

    public Firm(){
        super("The Firm");
    }
     @Override
    public String plot(){
        return "Just from college, lawyer Mitch McDeere is too hot to be handled";
    }
}
class UsualSuspects extends Movie{

    public UsualSuspects(){
        super("The Usual Suspects");
    }
     @Override
    public String plot(){
        return "The reign of Mafia family from Sicily";
    }
}
class TenCommandments extends Movie{

    public TenCommandments(){
        super("The Ten Commandments");
    }
     @Override
    public String plot(){
        return "The Children of Israel are delivered from Egypt with signs and wonders";
    }
}
class Untouchables extends Movie{

    public Untouchables(){
        super("The Untouchables");
    }
     @Override
    public String plot(){
        return "A mob kinpin reigns terror in the city of Chicago";
    }
}

class Forgetables extends Movie{

    public Forgetables(){
        super("Forgetables");
    }
    // No plot method
}

public class MyMoviesPolymorphism {

  public static void main(String[] args){
    for(int i=1; i<11; i++){
        Movie movie = randomMovie();
        System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
    }
  }
  
  public static Movie randomMovie(){
    int randomNumber = (int)(Math.random() * 8) + 1;
    System.out.println("Random Number generated is : " + randomNumber);
    switch(randomNumber){
            case 1:
                return new Godfather();
            case 2:
                return new Titanic();
            case 3:
                return new AfewGoodMen();
            case 4:
                return new Firm();
            case 5:
                return new UsualSuspects();
            case 6:
                return new TenCommandments();
            case 7:
                return new Untouchables();
            case 8:
                return new Forgetables();
    }
    
    return null;
  }
 }

   
   
   
   
    