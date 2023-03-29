import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
    LinkedList<String> NamaHewan = new LinkedList<String>();

     NamaHewan.add("Sapi");
     NamaHewan.add("Kelinci");
     NamaHewan.add("Kambing");
     NamaHewan.add("Unta");
     NamaHewan.add("Domba");

     System.out.println("Nama Hewan : "+ NamaHewan);

     System.out.println("Nama Hewan yang dihapus : Kelinci, Kambing, Unta");

     NamaHewan.remove("Kelinci"); 
     NamaHewan.remove("Kambing"); 
     NamaHewan.remove("Unta");
    
     
     System.out.println("Setelah dihapus : "+ NamaHewan);






    }
}
