package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public Toy create(String str) throws NoSuchToyException {
        if(str.equals("teddy")){
            TeddyBear teddy = new TeddyBear();
            return teddy;
        }
        if(str.equals("gameboy")){
            Gameboy gameboy = new Gameboy();
            return gameboy;
        }
        else{
            throw new NoSuchToyException("No such toy: "+ str+".");
        }
          
        
    }
    public List<GiftPaper> getPapers(int compt){
        List<GiftPaper> papers = new ArrayList<GiftPaper>();
        
        for (int i=0; i<compt;i++){
            papers.add(new GiftPaper());
        }
        return papers;

    }
    

}
