public class Main1 {
    public static void main(String[] args) {
        Kegiatan1 s = new Kegiatan1(5);


        s.push("satu");
        s.push("dua");
        s.push("tiga");

        System.out.println("Next : " + s.peek());
        s.push("empat");
        System.out.println(s.pop());
        s.push("lima");

        int count = s.search("satu");

        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println("ppppppppppppppppp");
    }
}