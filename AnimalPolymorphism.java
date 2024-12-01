class Animal {
    public void move() {
        System.out.println("The animal moves in some way.");
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("The bird flies in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}

class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("The panthera moves gracefully on the ground.");
    }

    @Override
    public void makeSound() {
        System.out.println("The panthera roars.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panthera = new Panthera();

        bird.move();
        bird.makeSound();

        panthera.move();
        panthera.makeSound();
    }
}
