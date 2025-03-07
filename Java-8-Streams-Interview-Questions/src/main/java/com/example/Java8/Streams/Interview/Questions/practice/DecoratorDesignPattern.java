package com.example.Java8.Streams.Interview.Questions.practice;




    interface Coffee {
        String getDescription();
        double getCost();
    }

    class SimpleCoffee implements Coffee {
        public String getDescription() { return "Plain Coffee"; }
        public double getCost() { return 5.0; }
    }

    // Decorator to add Milk
    class MilkDecorator implements Coffee {
        private Coffee coffee;
        public MilkDecorator(Coffee coffee) { this.coffee = coffee; }

        public String getDescription() { return coffee.getDescription() + ", Milk"; }
        public double getCost() { return coffee.getCost() + 2.0; }
    }

    // Decorator to add Sugar
    class SugarDecorator implements Coffee {
        private Coffee coffee;
        public SugarDecorator(Coffee coffee) { this.coffee = coffee; }

        public String getDescription() { return coffee.getDescription() + ", Sugar"; }
        public double getCost() { return coffee.getCost() + 1.0; }
    }
public class DecoratorDesignPattern {

        public static void main(String[] args) {
            Coffee coffee = new SimpleCoffee();  // Plain coffee
            coffee = new MilkDecorator(coffee);  // Adding milk
            coffee = new SugarDecorator(coffee); // Adding sugar

            System.out.println(coffee.getDescription() + " => Cost: " + coffee.getCost());
        }

    }


