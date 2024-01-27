public class Dsapra {
    static class link {
        int data;
        link node;

        link(int d) {
            data = d;
            node = null;

        }
    }

    static class stack {

    }

    static void travel(link sp) {
        System.out.println("link list is start ");
        while (sp.node != null) {
            System.out.println(sp.data);
            sp = sp.node;
        }
        System.out.println(sp.data);
        System.out.println("link list is end ");
    }

    public static link insertatstart(link sp, int data) {
        link temp = new link(data);
        temp.node = sp;
        return temp;

    }

    public static link insertatlast(link sp, int data, int idx) {
        link head = sp;
        link temp = new link(data);
        int count = 0;
        while (count != idx - 2) {
            System.out.println(sp.data);
            sp = sp.node;
            count++;
        }
        temp.node = sp.node;
        sp.node = temp;

        return head;
    }
    // implementing stack using link list

    public static link  st(link sp, int data, String operation) {
        if (operation == "push") {
            link temp = new link(data);
            if (sp == null) {
                sp =  temp;
                return sp;

            } else {
                sp.node = temp;
                return sp;
            }
        } else if (operation == "pop") {
            int db = sp.data;
          

        }
        return sp;

    }

    public static void main(String[] args) {

        link f = new link(+1);
        link s = new link(+2);
        link t = new link(+3);
        link fo = new link(+4);
        f.node = s;
        s.node = t;
        t.node = fo;
        fo.node = null;
        f = insertatstart(f, -3);
        f = insertatstart(f, -2);
        f = insertatstart(f, -1);
        f = insertatlast(f, 0, 4);
        travel(f);

    }
}
