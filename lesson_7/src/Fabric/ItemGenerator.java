package Fabric;

public abstract class ItemGenerator implements iGameItem {
    public void openRerward(){
        String gameItem = createItem();
        gameItem.open();
    }
    public String createItem(){

    }
}
