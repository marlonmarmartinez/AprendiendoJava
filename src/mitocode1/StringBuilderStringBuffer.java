
package mitocode1;


public class StringBuilderStringBuffer {
    public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("MitoCode");
		//sb.append("MitoCode").append(" Tutos");
		
		//System.out.println(sb.toString());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.setLength(0);
		System.out.println(sb.toString());
		
                //builder es mas rapido no sincronizado que buffer
	}
}
