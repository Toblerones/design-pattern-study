package creationalpatterns.builder;

import java.util.*;

public class WorkShop {
    //force the order of building process
    public void construct(HouseBuilder hb) {
        hb.buildFoundation();
        hb.buildFrame();
        hb.buildExterior();
        hb.buildInterior();
    }
}


