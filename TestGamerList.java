public class TestGamerList 
{
    public static void main(String[] args) 
    {
        //GamerList_Double list1 = new GamerList_Double();
        GamerList list1 = new GamerList();
        list1.insert("Zeus", 39);
        list1.insert("Ares", 26);
        list1.insert("Hades", 45);
        list1.insert("Apollo", 43);
        list1.insert("Cronus", 44);
        list1.insert("Hermes", 26);
        list1.insert("Hades",16);
        list1.insert("Adonis", 76);
        list1.insert("Prometheus", 32);
        list1.insert("Eros", 9);
        list1.insert("Kratos", 50);
        list1.insert("Hyperion", 49);
        System.out.println("Top 10 Scores: ");
        System.out.println("______________");
        list1.printList();
    }
}