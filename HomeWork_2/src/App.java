import Classes.*;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

import java.io.IOException;
import java.util.logging.*;

public class App {
    public static void main(String[] args) throws Exception {
    //    Market market = new Market();
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();



       Logger logger = Logger.getLogger(Market.class.getName());
       FileHandler fh = new FileHandler("HomeWork_2/log.xml");
       logger.addHandler(fh);


       Market market = new Market(logger);

       iActorBehaviour item1 = new OrdinaryClient("Boris");
       iActorBehaviour item2 = new SpecialClient("Fedor", 11015);
       iActorBehaviour item3 = new OrdinaryClient("Dasha");
       iActorBehaviour item4 = new TaxService();
       iActorBehaviour item5 = new PromoClient("Egor","SALE");
       iActorBehaviour item6 = new PromoClient("Igor","SALE");
       iActorBehaviour item7 = new PromoClient("Anna","SALE");
       iActorBehaviour item8 = new PromoClient("Inna","SALE");
       iActorBehaviour item9 = new PromoClient("Inga","SALE");
       iActorBehaviour item10 = new PromoClient("Max","SALE");

       
       market.setPromoLimit(3);
       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item5);
       market.acceptToMarket(item4);
       market.acceptToMarket(item6);
       market.acceptToMarket(item7);
       market.acceptToMarket(item8);
       market.acceptToMarket(item9);
       market.acceptToMarket(item10);


       market.update();
       market.returnUp(item6);



    }
}
