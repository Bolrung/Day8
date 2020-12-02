package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {

    private Toy toy;

    private List<GiftPaper> papers;

    private Factory factory;

  
    public Elf(Factory factory){
        this.factory=factory;
        this.papers= new ArrayList<>();
    }
    public Toy getToy() {
        return toy;
    }
    public boolean pickToy(String str){
        try {
            if(!(this.toy instanceof Toy)){
                this.toy = this.factory.create(str);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true ;
        }
        else{
            System.out.println("Minute please?! I'm not that fast.");
        }
        } catch (NoSuchToyException e) {

        System.out.println("I didn't find any "+str+".");
        }
        return false;
       }
    public boolean pickPapers(int u){

        this.papers.addAll(this.factory.getPapers(u));
        return true;
    }
    public GiftPaper pack() {
       if ((this.toy == null)&&(this.papers.size()>0)){
           System.out.println("I don't have any toy, but hey at least it's paper!");
           return this.papers.remove(0);
       }
       else if (this.papers.isEmpty()||this.papers== null){
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
       }
       else{
           System.out.println("And another kid will be happy!");
           this.papers.get(0).wrap(this.toy);
           this.toy = null;
           return this.papers.remove(0);
       }
        
    }
}
