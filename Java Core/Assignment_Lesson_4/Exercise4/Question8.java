package Exercise4;

public class Question8 {
    public static class Group{
        public int id;
        public String name;
    }
    public static void main(String[] args) {
        Group g1 = new Group();
        g1.id = 1;
        g1.name = "Java";
        Group g2 = new Group();
        g2.id = 2;
        g2.name = "Python";
        Group g3 = new Group();
        g3.id = 3;
        g3.name = "C";
        Group [] groups = {g1, g2, g3};
        for(int i = 0; i < groups.length; i++){
            if(groups[i].name == "Java"){
                System.out.println(groups[i].id);
                System.out.println(groups[i].name);
            }
        }
    }
}
