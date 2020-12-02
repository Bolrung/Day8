package Composite;

public class Word implements Sentence {

    private String msg;

    public Word(String msg){
        this.msg = msg;
        
    }

    public String getMsg() {
        return msg;
    }


    public void print() {
        System.out.println(this.getMsg());
    }
    

    
}