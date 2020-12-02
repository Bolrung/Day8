package Factory;
public class GiftPaper {

    private Toy gift;

    public Toy getGift() {
        return gift;
    }

    public void wrap(Toy gift){
    this.gift = gift;
    }
    public Toy unwrap(){
        Toy to = this.gift;
        this.gift=null;

        return to;

    }
	
}
