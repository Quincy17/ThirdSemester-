public class EncapTest{
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Caesar");
        encap.setAge(15);

        System.out.println("Name : " +encap.getName());
        System.out.println("Age  : " +encap.getAge());
    }
}