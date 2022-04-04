//Sampad Banik
//Homework08

package homework08_01;

public class Homework08_01 {
	public static void main(String[] args) {
	REPTILE reptile = new REPTILE();
    LIZARD lizard = new LIZARD();
    lizard.name = "Rock Monitor";
    lizard.status = "Meat-eater";
    reptile.color = "gray-brown";
    reptile.weight = "13-18 Pound";
    reptile.length = "2 meters";
    System.out.println("\n" + lizard.toString() + reptile.toString());

    SNAKE snake = new SNAKE();
    snake.name = "Ball Python";
    snake.danger_level = "Non-poisonous";
    reptile.color = "Dark Brown";
    reptile.weight = "4 Pound";
    reptile.length = "182 cm";
    System.out.println("\n" + snake.toString() + reptile.toString());
	

	}

}
