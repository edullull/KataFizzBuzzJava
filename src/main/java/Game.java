import lombok.ToString;

public class Game {

    int number;

    public boolean DivisibleByThree(int number){
        return number % 3 == 0;
    }

    public boolean DivisibleByFive(int number){
        return number % 5 == 0;
    }


    public String fizzBuzz(int number){

        if(DivisibleByFive(number) && DivisibleByThree(number)){
            return "FIZZBUZZ";
        }
        else if(DivisibleByThree(number)){
            return "FIZZ";
        }
        else if(DivisibleByFive(number)){
            return "BUZZ";
        }
        else{
            return Integer.toString(number);
        }
    }

    public void Secuencie(int number){
        Game game = new Game();
        while(number <= 99){
            number++;
            System.out.println(game.fizzBuzz(number));
        }
    }
}
