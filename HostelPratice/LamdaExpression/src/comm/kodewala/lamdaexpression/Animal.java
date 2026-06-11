package comm.kodewala.lamdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Animal {
	public static void main(String[] args) {
		List<String> animalName = new ArrayList<>();
		animalName.add("Cat");
		animalName.add("doG");
		animalName.add("liON");
		animalName.add("huMaN");

//		Stream<String>s1= animalName.stream();
//		Stream<String>s2=s1.map(o->o.toLowerCase());
//		List<String>s3= s2.collect(Collectors.toList());

		List<String> s4 = animalName.stream().map(o -> o.toLowerCase()).collect(Collectors.toList());
		System.out.println(s4);

	}
}
