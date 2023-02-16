import javax.sound.midi.Soundbank;

class StringConcept
{
    public static void main(String[] args) {


        //Example of String👌👌👌👌
        String brand = "PW SKILLS";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand); //concat didnot work here as it is immutable i.e not changeable


        //Example of StringBuilder👍👍👍👍👍👍👍👍
        StringBuilder brand1 = new StringBuilder("PW SKILLS");
        System.out.println(brand1); //PW SKILLS
        //we cannot use concat her as it is a StringBuilder uses append to add something
        brand1.append(" Bengaluru"); 
        System.out.println(brand1); //PW SKILLS Bengaluru
    }
}