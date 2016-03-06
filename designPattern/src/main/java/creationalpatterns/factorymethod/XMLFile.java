package creationalpatterns.factorymethod;

public class XMLFile implements Display {

    public void load(String xmlfile) {
        System.out.println("load from an xml file");
    }
    public void formatConsistency() {
        System.out.println("xml file format changed");
    } 

}
