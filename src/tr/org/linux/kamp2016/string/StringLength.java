package tr.org.linux.kamp2016.string;

public class StringLength {
	
	public static void main(String args[]){
		
		String[] strArray = new String[]{"Edip", "Turgut", "Cemal","Ece","Tomris","Nilgün"  };
		
		int length = strArray.length;
		System.out.println("String array: " + length);
		
		for(int i=0; i < length; i++){
			System.out.println(strArray[i]);
			
		}
		
	}

}
