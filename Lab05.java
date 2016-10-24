
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args){
        System.out.println("Creating a hash-map of 10 items:");
        HashMap<Integer,String> map=new HashMap<Integer,String>(100, 20,.8);
        for(int i=0;i<10;i++){
            map.set(new Integer(i),String.valueOf(i));
        }
        System.out.println("Created hash-map is: "+map.toString());
        System.out.println("Test for the proper assignment of things after removal");
        System.out.println("Map item 6:"+map.get(6));
        System.out.println("Removeing item 6 and 7:");
        map.remove(6);
        map.remove(7);
        System.out.println("Hash-map without item 6 and 7 "+map.toString());
        System.out.println("Adding to the hash-map an item with key 5 and value 6");
        map.set(new Integer(5),String.valueOf(6));
        System.out.println("Hash Map: "+map.toString());
        System.out.println("Removing item 5");
        map.remove(5);
        System.out.println("Adjusted items with 5,5 removed: "+map.toString());
        
        System.out.println("\n\nCreating a new hashset:");
		
        HashSet<String> names=new HashSet(100,20,.8);
        System.out.println("Adding Thor to Hashset");
        names.add("Thor");
        System.out.println("Adding Oden to Hashset");
        names.add("Oden");
        System.out.println("Adding Mjollnir to Hashset");
        names.add("Mjollnir");
        System.out.println("Adding Fenrir to Hashset");
        names.add("Fenrir");
        System.out.println("Adding Izanami to Hashset");
        names.add("Izanami");
        System.out.println("Adding Scathach to Hashset");
        names.add("Scathach");
        System.out.println("Adding Sigfried to Hashset");
        names.add("Sigfried");
        System.out.println("Adding Cu to Hashset");
        names.add("Cu");
        System.out.println("Adding Diarmund to Hashset");
        names.add("Diarmund");
        System.out.println("Adding Loki to Hashset");
        names.add("Loki");
        System.out.println("Adding Fafnir to Hashset");
        names.add("Fafnir");
        System.out.println("Hashset 1 is now: "+names.toString());
		
        System.out.println("\n\nCreating a new hashset");
        HashSet<String> names2=new HashSet(100,20,.8);
        System.out.println("Adding Minerva to Hashset");
        names2.add("Minerva");
        System.out.println("Adding Jupiter to Hashset");
        names2.add("Jupiter");
        System.out.println("Adding Mars to Hashset");
        names2.add("Mars");
        System.out.println("Adding Uranus to Hashset");
        names2.add("Uranus");
        System.out.println("Adding Heracles to Hashset");
        names2.add("Heracles");
        System.out.println("Adding Vulcan to Hashset");
        names2.add("Vulcan");
        System.out.println("Adding Saturn to Hashset");
        names2.add("Saturn");
        System.out.println("Adding Vanus to Hashset");
        names2.add("Venus");
        System.out.println("Adding Cu to Hashset");
        names2.add("Cu");
        System.out.println("Adding Sigfried to Hashset");
        names2.add("Sigfried");
        System.out.println("Adding Bacchus to Hashset");
        names2.add("Bacchus"); 
        System.out.println("Hashset 2 is now: "+names2.toString());
        System.out.println("\n\nCreating a new hashset");
        HashSet<String> names3=new HashSet(100,20,.8);
		
        System.out.println("Adding Izanami to Hashset");
        names3.add("Izanami");
        System.out.println("Adding Izanagi to Hashset");
        names3.add("Izanagi");
        System.out.println("Adding Tsukuyomi to Hashset");
        names3.add("Tsukuyomi");
        System.out.println("Adding Susanoo to Hashset");
        names3.add("Susanoo");
        System.out.println("Adding Amaterasu to Hashset");
        names3.add("Amaterasu");
        System.out.println("Adding Nobunaga Oda to Hashset");
        names3.add("Nobunaga Oda");
        System.out.println("Adding Shingen Takeda to Hashset");
        names3.add("Shingen Takeda");
        System.out.println("Adding Uesigi Kenshin to Hashset");
        names3.add("Uesegi Kenshin");
        System.out.println("Adding Totoyomi Hideyoshi to Hashset");
        names3.add("Toyotomi Hideyoshi");
        System.out.println("Adding Akechi Mitsuhide to Hashset");
        names3.add("Akechi Mitsuhide");
        System.out.println("Adding Ieyasu Tokugawa to Hashset");
        names3.add("Ieyasu Tokugawa");         
        System.out.println("hashset 3 is now: "+names3.toString());
        System.out.println("\nUnion of hashsets 1 and 2:");
        System.out.println(names.union(names2));
        System.out.println("Intersection of hashsets 1 and 2:");
        System.out.println(names.intersection(names2));
        System.out.println("Difference of hashsets 1 and 2:");
        System.out.println(names.relativeDifference(names2));
        System.out.println("\nUnion of hashsets 1 and 3:");
        System.out.println(names.union(names3));
        System.out.println("Intersection of hashsets 1 and 3:");
        System.out.println(names.intersection(names3));
        System.out.println("Difference of hashsets 1 and 3:");
        System.out.println(names.relativeDifference(names3)); 
        System.out.println("\nUnion of hashsets 2 and 3:");
        System.out.println(names2.union(names3));
        System.out.println("Intersection of hashsets 2 and 3:");
        System.out.println(names2.intersection(names3));
        System.out.println("Difference of hashsets 2 and 3:");
        System.out.println(names2.relativeDifference(names3));       
        System.out.println("\nCreating an Iterator for hash-map 3:");
        System.out.println("Starting Iteration:");
        for(HashMapIterator looper=names3.iterator(true);looper.hasNext();System.out.println("Next item is:"+looper.next()));
        System.out.println("Iteration is over:");
        Scanner reader=new Scanner(System.in);
        System.out.print("\nPress Enter to Exit the progam: ");
        String s=reader.nextLine();
        
    }
}
