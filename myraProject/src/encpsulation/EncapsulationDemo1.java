package encpsulation;

public class EncapsulationDemo1 {

	public static void main(String[] args) {
		EncapsulationDemo ED = new EncapsulationDemo();
		ED.setName("lavanya");
		ED.setAge(26);
		
		System.out.println("ED.getName");
        System.out.println(ED.getAge());
	}

}
