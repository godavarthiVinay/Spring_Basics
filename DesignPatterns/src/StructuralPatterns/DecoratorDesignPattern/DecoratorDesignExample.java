package StructuralPatterns.DecoratorDesignPattern;


interface Dress{
    public abstract void assemble();

}

class BasicDress implements Dress{

    @Override
    public void assemble() {
        System.out.println("Basic Dress Features");

    }

    public void getTShirt(){
        System.out.println("Basic Dress  T-shirt");
    }
}

class DressDocorator implements Dress{
    Dress dress;

    public  DressDocorator(Dress c){
        this.dress=c;
    }


    @Override
    public void assemble() {
        this.dress.assemble();
    }
}


class CasualDress extends DressDocorator{

    public CasualDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Casual Dress Features");
    }
}

class SportsDress extends DressDocorator {
    public SportsDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sports Dress Features");
    }
}

class FancyDress extends DressDocorator {
    public FancyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Fancy Dress Features");
    }
}


public class DecoratorDesignExample {
    public static void main(String[] args) {

        Dress sportyDress = new SportsDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();

        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();

        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();


        Dress sportyFancyDress = new SportsDress(new FancyDress(new BasicDress()));
        sportyFancyDress.assemble();
        System.out.println();

        Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble();

    }

}


