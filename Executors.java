package internalClasses;

/**
 * Created by d1mys1klapo4ka on 06.04.2017.
 */
public class Executors {

    static class Nested implements Executable{

        @Override
        public void execute() {
            System.out.println("Nested class.");
        }

        class Inner extends Nested{

            @Override
            public void execute() {
                System.out.println("Inner class.");
            }
        }
    }

    static Executable getLocal(){
        class Local implements Executable{

            @Override
            public void execute() {
                System.out.println("Local class.");
            }
        }
        return new Local();
    }

    static Executable getAnonim(){

        return new Executable() {
            @Override
            public void execute() {
                System.out.println("Anonimous class.");
            }
        };
    }

    static Executable getInner(){

        return new Nested().new Inner();
    }

    static Executable getNested(){
        return new Nested();
    }
}
