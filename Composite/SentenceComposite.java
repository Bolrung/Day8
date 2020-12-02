package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence{

    private List<Sentence> childSentence;
   
    public void print() {
      for (Sentence child: childSentence){
            child.print();
      }

    }

    public SentenceComposite(){
        this.childSentence = new ArrayList<>();
    }

    public void add(Sentence s) {
        this.childSentence.add(s);
        
    }
    public void remove(Sentence s) {
        this.childSentence.remove(s);
    }

    

    
}